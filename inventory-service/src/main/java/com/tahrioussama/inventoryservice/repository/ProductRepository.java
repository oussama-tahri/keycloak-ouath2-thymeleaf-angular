package com.tahrioussama.inventoryservice.repository;

import com.tahrioussama.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author mohamedyoussfi
 **/
public interface ProductRepository extends JpaRepository<Product,String> {
}
