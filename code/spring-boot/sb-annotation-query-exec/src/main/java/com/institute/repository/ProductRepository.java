package com.institute.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.institute.entity.ProductEntity;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
	
	@Query(value = "select p from ProductEntity p where status=true") // HQL
	public List<ProductEntity> getProductByAvability_HQL(); 
	
	@Query(value = "select * from prodinfo where isavailable=true", nativeQuery = true) // SQL
	public List<ProductEntity> getProductByAvability_SQL(); 
	
	// Parameterized Query
	//@Query("select * from prodinfo where price between :minPrice AND :maxPrice", nativeQuery = true)
	//@Query("SELECT p FROM ProductEntity p WHERE price>:minPrice AND price<=:maxPrice")
	@Query("SELECT p FROM ProductEntity p WHERE price BETWEEN :minPrice AND :maxPrice")
	public List<ProductEntity> getProductByPrice(@Param("minPrice") double min, 
			@Param("maxPrice") double max);
	
	//UPDATE prodinfo SET price=price+(price*0.1)
	@Transactional
	@Modifying
	@Query(value = "UPDATE ProductEntity SET price=price+(price*:percent)")
	public void updateProductPrice(@Param("percent") double percent);
	
}














