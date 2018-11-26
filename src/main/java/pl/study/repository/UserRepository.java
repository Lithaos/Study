package pl.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.study.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
