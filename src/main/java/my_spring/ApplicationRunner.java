package my_spring;
import my_spring.config.ApplicationConfiguration;
import my_spring.database.pool.ConnectionPool;
import my_spring.database.repository.CrudRepository;
import my_spring.service.CompanyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRunner.class, args);

//        var context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
//        ConnectionPool pool1 = context.getBean("pool1", ConnectionPool.class);
//        System.out.println(pool1);
//        var companyService = context.getBean(CompanyService.class);
//        System.out.println(companyService.findById(1));
//        System.out.println("fff");
    }
}
