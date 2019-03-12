package kr.hs.dgsw.calc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// annotation 기반으로 자동 처리

@RestController
public class CalculatorController {

    @GetMapping
    public String sayHello() {
        return "Hello World";
    }
}
