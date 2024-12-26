import ConnectionDB.ConnectionPool;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        ConnectionPool connection1 = context.getBean("Connection1", ConnectionPool.class);
        System.out.println(connection1);
    }
}
