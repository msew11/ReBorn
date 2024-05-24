import com.google.protobuf.gradle.id

// https://github.com/google/protobuf-gradle-plugin/blob/master/examples/exampleProject/build.gradle
plugins {
    java
    `java-library`
    id("com.google.protobuf") version "0.9.4"
}

dependencies {
    api("com.google.protobuf:protobuf-java:3.6.1")

    // implementation("io.grpc:grpc-netty:1.15.1")
    implementation("io.grpc:grpc-stub:1.15.1")
    implementation("io.grpc:grpc-protobuf:1.15.1")
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:3.6.1"
    }
    plugins {
        id("grpc") {
            artifact = "io.grpc:protoc-gen-grpc-java:1.15.1"
        }
    }

    // https://github.com/google/protobuf-gradle-plugin/issues/303
    generateProtoTasks.setProperty("generatedFilesBaseDir", "$projectDir/src")
    generateProtoTasks {
        ofSourceSet("main").forEach  { task ->
            task.plugins {
                id("grpc") {
                    outputSubDir = "java"
                }
            }
        }
    }
}

val delGenerated by tasks.registering(Delete::class) {
    val srcDir = "${projectDir}/build/generated/source/proto/main/java"
    delete(srcDir)
}

tasks {
    named("generateProto") {
        finalizedBy(delGenerated)
    }
    named("compileJava") {
        dependsOn(delGenerated)
    }
}

/*
val sourcesJar by tasks.registering(Jar::class) {
    archiveClassifier.set("sources")
    from(sourceSets.main.get().allSource)
}

artifacts {
    add("archives", sourcesJar)
}*/

sourceSets {
    main {
        java {
            srcDirs("src/main/java")
        }
    }
}