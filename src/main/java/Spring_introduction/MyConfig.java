package Spring_introduction;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("Spring_introduction")
@PropertySource("myApp.properties")
public class MyConfig {

}
