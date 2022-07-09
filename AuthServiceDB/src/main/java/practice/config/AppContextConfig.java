package practice.config;

import com.googlecode.jsonrpc4j.spring.JsonServiceExporter;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import practice.AuthServiceAPI;
import practice.IAuthService;

@Configuration
@ComponentScan("practice")
public class AppContextConfig {
    @Bean(name = "/UserService.json")
    public JsonServiceExporter jsonServiceExporter(){
        JsonServiceExporter exporter = new JsonServiceExporter();
        exporter.setService(new AuthServiceAPI());
        exporter.setServiceInterface(IAuthService.class);
        return exporter;
    }
    @Bean
    public AuthServiceAPI authServiceAPI(){
        return new AuthServiceAPI();
    }
    @Bean
    public BeanNameUrlHandlerMapping beanNameUrlHandlerMapping(){
        return new BeanNameUrlHandlerMapping();
    }
}
