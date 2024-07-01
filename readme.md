# User Management Microservice

## Prérequis

- Java 11+
- Maven
- MySQL

## Installation

1. Clonez le dépôt.
2. Naviguez dans le répertoire du projet.
3. Exécutez `mvn clean install`.

## Configuration

Assurez-vous de mettre à jour les informations de connexion à la base de données MySQL dans `src/main/resources/application.properties`.

## Exécution

1. Lancez l'application avec `mvn spring-boot:run`.

## Endpoints

### Créer un utilisateur

- **URL**: `/api/user`
- **Méthode**: `POST`
- **Body**:
  ```json
  {
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com",
    "password": "securepassword"
  }
  ```

### Récupérer un utilisateur par ID

- **URL**: `/api/users/{id}`
- **Méthode**: `GET`

### Mettre à jour un utilisateur

- **URL**: `/api/user/{id}`
- **Méthode**: `PUT`
- **Body**:
  ```json
  {
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com",
    "password": "newpassword"
  }
  ```

### Supprimer un utilisateur

- **URL**: `/api/users/{id}`
- **Méthode**: `DELETE`

