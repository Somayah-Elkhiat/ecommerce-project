package com.lenses.lenses_ecommerce_security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lenses.lenses_ecommerce_security.entity.CartItem;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long>{

	

}
