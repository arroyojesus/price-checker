package com.jarroyo.price.checker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jarroyo.price.checker.entity.PriceEntity;

import java.io.Serializable;
import java.time.LocalDateTime;

@Repository("priceRepository")
public interface PriceRepository extends JpaRepository<PriceEntity, Serializable> {
	
	@Query(value = "SELECT Top 1 * FROM PRICE pp WHERE pp.PRODUCT_ID = :productId AND pp.BRAND_ID =:brandId AND :applicationDate BETWEEN pp.START_DATE AND pp.END_DATE ORDER BY PRIORITY DESC, PRICE DESC", nativeQuery = true) 
	PriceEntity findPrice (@Param("productId") String productId, @Param("brandId") Integer brandId, @Param("applicationDate") LocalDateTime applicationDate);
   	
}
