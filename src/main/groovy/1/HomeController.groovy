package 1

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.stereotype.Controller

@Controller
class HomeController {
    @RequestMapping("/")
    String index() {
        return "index"
    }
}
