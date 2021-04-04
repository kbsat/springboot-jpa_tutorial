package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    // Model? 모델에 데이터를 실어서 뷰로 넘길 수 있다.
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data","hello!!!");
        // thymeleaf에서 viewName을 매핑해줌
        // resources : templates/{ViewName}.html 로 매핑시켜줌. 부트쪽에 들어가서 이 prefix suffix 변경 가능
        return "hello";
    }
}
