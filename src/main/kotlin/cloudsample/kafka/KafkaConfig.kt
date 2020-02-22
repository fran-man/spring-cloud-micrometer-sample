package cloudsample.kafka

import org.springframework.cloud.stream.annotation.Input
import org.springframework.cloud.stream.annotation.Output
import org.springframework.messaging.MessageChannel
import org.springframework.messaging.SubscribableChannel

interface IncomingChannels{
    @Input("incomingStream")
    fun incomingStream(): SubscribableChannel
}

interface OutgoingChannels{
    @Output("outgoingStream")
    fun outgoingStream(): MessageChannel
}