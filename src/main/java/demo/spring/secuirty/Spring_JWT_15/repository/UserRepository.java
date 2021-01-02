package demo.spring.secuirty.Spring_JWT_15.repository;

import demo.spring.secuirty.Spring_JWT_15.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface UserRepository extends JpaRepository<User,Integer> {



    User findByUserName(String username);
}
