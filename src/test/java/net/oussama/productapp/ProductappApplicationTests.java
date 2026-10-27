package net.oussama.productapp;

import net.oussama.productapp.entities.Product;
import net.oussama.productapp.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductappApplicationTests {

    public static void main(String[] args) {
        SpringApplication.run(ProductappApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProductRepository productRepository) {
        return args -> {
            // 1. Ajouter des produits
            productRepository.save(Product.builder().name("Ordinateur").price(8000).quantity(10).build());
            productRepository.save(Product.builder().name("Imprimante").price(1500).quantity(5).build());
            productRepository.save(Product.builder().name("Souris").price(120).quantity(50).build());
            System.out.println("=== Produits ajoutés ===");
            // 2. Consulter tous les produits
            System.out.println("=== Tous les produits ===");
            productRepository.findAll().forEach(System.out::println);
            // 3. Consulter un produit
            System.out.println("=== Produit id=1 ===");
            Product p = productRepository.findById(1L).orElse(null);
            if (p != null) {
                System.out.println(p);
            }
        };
    }
}