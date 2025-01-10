package naskoBlog.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import naskoBlog.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}