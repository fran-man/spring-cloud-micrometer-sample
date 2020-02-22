package cloudsample.controller

import cloudsample.kafka.IncomingChannels
import cloudsample.kafka.OutgoingChannels
import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@EnableBinding(value = arrayOf(IncomingChannels::class, OutgoingChannels::class))
open class BaseController {
    @RequestMapping("/", method = arrayOf(RequestMethod.GET))
    fun rootMapping(): String {
        return "Hello world"
    }
}