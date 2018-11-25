package liu.hope.mydubzoo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan("liu.hope.mydubzoo.mapper")
public class MydubzooApplication {

    public static void main(String[] args) {
        SpringApplication.run(MydubzooApplication.class, args);
    }
}
