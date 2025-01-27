package my_spring.database.repository;

import jakarta.annotation.PostConstruct;
import my_spring.database.Entity.Company;
import my_spring.database.pool.ConnectionPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class CompanyRepository implements CrudRepository<Integer, Company> {

    @PostConstruct
    public void init () {
        System.out.println("init");
    }

    public CompanyRepository(@Qualifier("pool1") ConnectionPool pool1,
                             List<ConnectionPool> pools,
                             @Value("${db.pool.size}") Integer poolSize) {
        this.pool1 = pool1;
        this.pools = pools;
        this.poolSize = poolSize;
    }


    private final ConnectionPool pool1;


    private final List<ConnectionPool> pools;


    private final Integer poolSize;

    @Override
    public Optional<Company> findById(Integer id) {
        System.out.println("findBtId .....");
        Company company = new Company(id);
        return Optional.of(company);
    }
    @Override
    public void delete(Company entity) {
        System.out.println("delete .....");
    }
}
