package cloudsample.controller

import cloudsample.kafka.IncomingChannels
import cloudsample.kafka.OutgoingChannels
import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.messaging.support.MessageBuilder
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@EnableBinding(value = arrayOf(IncomingChannels::class, OutgoingChannels::class))
open class BaseController(val outChannels: OutgoingChannels) {
    @RequestMapping("/", method = arrayOf(RequestMethod.GET))
    fun rootMapping(): String {
        return "Hello world"
    }

    @RequestMapping("/send", method = arrayOf(RequestMethod.GET))
    fun sendMsgMapping(@RequestParam messagesToSend: Int): String {
        var count = 1
        while(count <= messagesToSend){
            outChannels.outgoingStream().send(MessageBuilder.withPayload("This is a message: $count").build())
            count++
            Thread.sleep(10)
        }
        return "Done!"
    }
}