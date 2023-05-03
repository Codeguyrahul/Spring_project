package springweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RahulController {
@RequestMapping("/Rahul")
public String display() {
return "index";
}
}
