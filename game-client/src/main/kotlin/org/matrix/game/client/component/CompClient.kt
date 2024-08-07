package org.matrix.game.client.component

import io.netty.channel.ChannelInitializer
import io.netty.channel.socket.SocketChannel
import io.netty.handler.codec.protobuf.ProtobufEncoder
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender
import org.matrix.game.client.network.MyClientHandler
import org.matrix.game.common.component.AbstractComponent
import org.matrix.game.core.network.IClient
import org.matrix.game.core.network.netty.NettyClient

class CompClient : AbstractComponent() {

    private var client: IClient

    init {
        val client = NettyClient("127.0.0.1", 6666, object : ChannelInitializer<SocketChannel>() {
            override fun initChannel(ch: SocketChannel) {
                ch.pipeline().addLast(ProtobufVarint32LengthFieldPrepender())
                ch.pipeline().addLast(ProtobufEncoder())
                ch.pipeline().addLast(MyClientHandler())
            }
        })
        client.start()

        this.client = client
    }

    override fun close() {
        client.shutdown()
    }
}