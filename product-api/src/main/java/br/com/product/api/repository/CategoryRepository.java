package br.com.product.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.product.api.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
