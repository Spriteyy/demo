import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author TesterYang
 * @create 2023-07-29 15:10
 */
@SpringBootApplication
@ComponentScan("com.course.server")    //将要扫描的包
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
