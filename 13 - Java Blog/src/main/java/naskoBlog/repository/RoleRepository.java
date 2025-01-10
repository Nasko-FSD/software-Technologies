package naskoBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import naskoBlog.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByName(String name);
}