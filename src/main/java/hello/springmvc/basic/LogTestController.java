package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// RestController는 http 메시지 바디에 바로 입력함. controller는 view를 찾아서 매칭
@RestController
// private final Logger log = LoggerFactory.getLogger(getClass()); 이 기능을 어노테션으로 한것
@Slf4j
public class LogTestController {
    //private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";
        System.out.println("name =" +name);
        // 위와 같이 +를 사용하면 쓸모없는 연산을 1번 더 해서 메모리 차지함
        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info("info log={}", name);
        log.warn("warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }
}
