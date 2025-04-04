# 📊 Serveur SNS

![Java](https://img.shields.io/badge/Java-21-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)

Ce projet est une application backend qui a pour but la récupération des données des bases de données "auth", "services", "transac" et des 2 banques.

----
# 📁Structure du projet
```src
├── main
│   ├── java/com.example.sns
│   │   ├── modele         # Modèles de données (JPA Entities)
│   │   │   ├── bank1         
│   │   │   ├── bank2         
│   │   │   ├── services         
│   │   │   ├── transac         
│   │   ├── projection     # Class d'anonymation des données      
│   │   │   ├── bank1         
│   │   │   ├── bank2         
│   │   │   ├── services         
│   │   │   ├── transac   
│   │   ├── repository     # Accès aux données (JPA Repositories)      
│   │   │   ├── bank1         
│   │   │   ├── bank2         
│   │   │   ├── services         
│   │   │   ├── transac   
│   │   ├── service        # Logique métier   
│   │   ├── utils          # Utilitaires divers      
│   │   │   ├── compositekey         
│   │   │   ├── config   
│   │   ├── SnsApplication.java # Point d'entrée de l'application
│   ├── resources
│   │   ├── application.properties # Configuration de l'application
│   │   ├── application.yaml       # Alternative en YAML
│   │   ├── XX.yaml                # Fichier caché contenant les mots de passe des BD
├── test          # Contient les tests unitaires et d’intégration
├── target        # Dossier de build
├── pom.xml       # Fichier des dépendances
```
----
# ☕Pourquoi Java et Spring boot?🌱

### Java 
✅ Portabilité grâce à la JVM

✅ Programmation orientée objet

✅ Outils de testing robustes

✅ Écosystème et bibliothèques riches

### Spring Boot
✅ Serveur Web intégré (Tomcat par défaut)

✅ Gestion simplifiée des dépendances (Maven / Gradle)

✅ Anonymisation des donneés automatique

✅ Framework populaire en entreprise avec grande communauté et documentation abondante

---

# 🗃️​ Dépendance utilisées
| 🗃️​ Dépendance                | 🔍Rôle                                              |
|--------------------------------|-----------------------------------------------------|
| 🌐spring-boot-starter-web      | Création d'API                                      |
| 🧠spring-boot-starter-data-jpa | Gestion de la base de donnée avec JPA/Hibernate     |
| 🐬mysql-connector-j            | Driver JDBC pour MySQL                              |
| 🧰lombok                       | Réduction du boilerplate Java (Getter, Setter, etc. | 
| 🔬spring-boot-starter-test     | Framework de tests (JUnit, Mockito, etc.)           |
| 🧪spring-boot-devtools         | Outils de développement (reload à chaud)            | 

---
# 🌊 Explication du flow de l'application

1. 
2. err
3. er
4. erer
5. 
---

# 🚀 Installation et exécution
### Pré-requis
* Java 21 installé
* Maven installé
* Base de données configurée dans application.properties ou application.yaml

---

# 🔑 Sécurisation des mots de passe
Pour éviter d'exposer des informations sensibles comme les mots de passe dans le code, nous utilisons un fichier 'application-password.yaml' spring: datasource: password: <DB_PASSWORD>

### Démarrer l'application
```
# Cloner le dépôt
git clone https://github.com/votre-utilisateur/votre-repository.git
cd votre-repository

# Mettre le mot de passe pour le base de donnée (application-password.yaml)

# Construire le projet
mvn clean install

# Lancer l'application
mvn spring-boot:run
```