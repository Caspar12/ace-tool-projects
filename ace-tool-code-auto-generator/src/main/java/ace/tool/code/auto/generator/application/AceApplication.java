package ace.tool.code.auto.generator.application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author Caspar
 * @contract 279397942@qq.com
 * @create 2019/12/10 17:59
 * @description
 */
@Slf4j
@SpringBootApplication
@ComponentScan("ace.tool.code.auto.generator.application.config")

public class AceApplication {
    public static void main(String[] args) {
        SpringApplication.run(AceApplication.class, args);
    }
}
