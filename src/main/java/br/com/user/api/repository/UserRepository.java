package br.com.user.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.user.api.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByCpf(String cpf);
	
	List<User> queryByNomeLike(String name);
}
