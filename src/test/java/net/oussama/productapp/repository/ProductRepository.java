package net.oussama.productapp.repository;

import net.oussama.productapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByNameContainsIgnoreCase(String keyword);
    List<Product> findByPriceGreaterThan(double price);
}