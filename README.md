# ProductApp

Application Spring Boot de gestion de produits, réalisée avec Spring Data JPA et une base de données H2 en mémoire.

## Technologies

- Java 21
- Spring Boot 4.1.2
- Spring Web
- Spring Data JPA
- H2 Database
- Lombok
- Maven
- IntelliJ IDEA Ultimate

## Structure du projet

```
src/main/java/net/oussama/productapp
├── ProductappApplication.java      # Classe principale + tests des opérations
├── entities
│   └── Product.java                # Entité JPA
└── repository
    └── ProductRepository.java      # Interface Spring Data JPA
```

## Entité Product

| Attribut | Type   |
|----------|--------|
| id       | Long   |
| name     | String |
| price    | double |
| quantity | int    |

## Configuration

La base H2 est configurée dans `src/main/resources/application.properties` :

```properties
spring.datasource.url=jdbc:h2:mem:products-db
spring.datasource.username=sa
spring.datasource.password=
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=true
```

## Opérations testées

La classe `ProductappApplication` exécute au démarrage (via `CommandLineRunner`) :

1. Ajouter des produits
2. Consulter tous les produits
3. Consulter un produit par id
4. Chercher des produits (par nom, par prix)
5. Mettre à jour un produit
6. Supprimer un produit

## Lancer le projet

```bash
git clone https://github.com/oboussamaboustane-eng/productapp.git
cd productapp
./mvnw spring-boot:run
```

Les résultats s'affichent dans la console.

## Auteur

Oussama Boustane