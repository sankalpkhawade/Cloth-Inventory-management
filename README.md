# HospitalTemplate
Template for Hospital

Cloth-Inventory-Management/
│── backend/ (Spring Boot 3, Java 21)
│   ├── src/main/java/com/clothinventory/
│   │   ├── ClothInventoryApplication.java
│   │   ├── config/
│   │   │   ├── SecurityConfig.java
│   │   │   ├── JwtUtil.java
│   │   ├── controller/
│   │   │   ├── AuthController.java
│   │   │   ├── InventoryController.java
│   │   ├── entity/
│   │   │   ├── User.java
│   │   │   ├── Role.java
│   │   │   ├── InventoryItem.java
│   │   ├── repository/
│   │   │   ├── UserRepository.java
│   │   │   ├── InventoryRepository.java
│   │   ├── service/
│   │   │   ├── AuthService.java
│   │   │   ├── InventoryService.java
│   ├── src/main/resources/
│   │   ├── application.properties
│   │   ├── data.sql (Preloaded inventory data)
│   ├── Dockerfile
│   ├── pom.xml
│
│── frontend/ (Angular 19 + Bootstrap)
│   ├── src/app/
│   │   ├── auth/
│   │   │   ├── login.component.ts
│   │   │   ├── register.component.ts
│   │   ├── inventory/
│   │   │   ├── inventory-list.component.ts
│   │   │   ├── inventory-add.component.ts
│   │   ├── services/
│   │   │   ├── auth.service.ts
│   │   │   ├── inventory.service.ts
│   ├── src/assets/
│   │   ├── sample-images/
│   ├── Dockerfile
│   ├── package.json
│
│── docker-compose.yml (Backend, Frontend, PostgreSQL)
│── README.md (Project Documentation)

