package my_spring.database.repository;

import my_spring.database.pool.ConnectionPool;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    private final ConnectionPool pool2;

    public UserRepository(@Qualifier("pool2") ConnectionPool pool2) {
        this.pool2 = pool2;
    }
}
