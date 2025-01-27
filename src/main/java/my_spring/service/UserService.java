package my_spring.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import my_spring.database.Entity.Company;
import my_spring.database.repository.CompanyRepository;
import my_spring.database.repository.CrudRepository;
import my_spring.database.repository.UserRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final CrudRepository<Integer, Company> companyRepository;

}

