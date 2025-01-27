package my_spring.config;

import my_spring.database.pool.ConnectionPool;
import my_spring.database.repository.UserRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan("my_spring")
public class ApplicationConfiguration {

    @Bean("pool2")
    public ConnectionPool pool2() {
        return new ConnectionPool("test", 20);
    }

    @Bean
    public UserRepository userRepository2 (@Qualifier("pool2") ConnectionPool pool2) {
        return new UserRepository(pool2);
    }

    @Bean
    @Profile("prod")
    public UserRepository userRepository3 () {
        return new UserRepository(pool2());
    }
}
