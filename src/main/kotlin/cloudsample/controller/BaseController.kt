package cloudsample.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class BaseController {
    @RequestMapping("/", method = arrayOf(RequestMethod.GET))
    fun rootMapping(): String {
        return "Hello world"
    }
}