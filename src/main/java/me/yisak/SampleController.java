package me.yisak;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

    @GetMapping("/hello")
    //여기서 리턴 하는 이름은 View의 이름
    public String hello(Model model) { //그리고 뷰의 정보는 Model에 담아서 쓴다.

        model.addAttribute("name", "keesun");
        return "hello";
        // 여기서 리턴하는 hello는 더이상 응답의 본문이 아니다
        // 왜냐하면 @RestController가 아닌 @Controller 애너테이션을 쓰고 있기 때문.
    }
}
