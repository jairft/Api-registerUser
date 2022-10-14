package br.com.ibm.registeruser.repository;

import br.com.ibm.registeruser.model.RegisterUserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterUserRepository extends JpaRepository<RegisterUserModel, Long> {
}
