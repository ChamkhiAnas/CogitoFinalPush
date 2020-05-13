# Cogito

> Angular et Spring Boot ont tous les deux beaucoup trop de magie si vous êtes quelqu'un qui aime contrôler son code


![Sans titre - 1](https://user-images.githubusercontent.com/44496063/81466387-ddd9ac80-91c0-11ea-8df2-f5e53abbd057.jpg)


## Pour commencer
– Cogito c'est une application  de la Diététique , Portail proposant des regimes et Dietes voire des Programmes d'entrainement sportif .

- WebApp


### Technology Stack

Component         | Technologie
---               | ---
Frontend          | Angular 
Backend (REST)    | SpringBoot (Java)
Security          | Token Based (Spring Security and JWT
Persistence       | JPA (Using Spring Data)
Client Build Tools| angular-cli, npm
Server Build Tools| Maven(Java) 



### Prerequisites
Assurez-vous de l'avoir installé avant de continuer
- Java 8
- Maven 3.3.9+ 
- Node 6.0  
- npm 5  
- Angular-cli 1.6.3

## à propos
Le but du projet est de :

- Mettre en évidence les techniques de création et de sécurisation d'une API RESTful à l'aide SpringBoot
- Comment consommer un service RESTful et créer une application à page unique basée sur HTML5 en utilisant Angular 

### Caractéristiques du projet
* Backend
  * Token Based Security (using Spring security)
  * Using JPA and JDBC 
  * How to request and respond for paginated data 

* Frontend
  * Organizing Components, Services, Directives, Pages etc in an Angular App
  
  * Techniques to Lazy load Data (Infinite Scroll)
  * Techniques to load large data set in a data-table but still keeping DOM footprint less
  * Routing and guarding pages that needs authentication
  * Basic visulaization
   * Use API


## Structure des dossiers
```bash
DOSSIER DE PROJET
│  README.md
│  Cahier De Charge.pdf          
│  BackEndSpringBoot 
└──  │ pom.xml
│    │ mvnw.cmd
│    │ mvnw
│    └──[src]      
│    └──[main]      
│    │ └──[java]      
│    │  └──[com]
│    │    │  CogitoApplication.java 
│    │    │  test.java          
│    │    └──[service] 
│    │    └──[entities]
│    │    └──[dao]
│    │     └──[controller]
│    │     └──[config]
│    │       │ ApiSecurityConfig.java
│    │       │ AuthentificationRequest   
│    │       │ CorsFilter.java
│    │       │ JWTutil.java
│    │       └── 
│    │        
│    └──[resources]  
│      │ Application.pro
│      └──    
│            
│        
│ 
│ FrontEndAngular
└──
   │  angular.json     
   │  package.json 
   │  db.json
   │  package-lock.json
   │  tsconfig.app.json
   │  tslint.json
   │  README.md
   └──[src]
       │ index.html
       │ main.ts
       │ styles.css
       │ test.ts
       └──[app]
       │     │ app.component.ts
       │     │ app.component.css
       │     │ token-inter.service.ts
       │     │ app.component.html
       │     └──[Componenets] 
       │       │ [cheers]
       │       │ [landing-page]
       │       │ [sign-in]
       │       │ [sign-up]
       │       │ [survey]
       │     │     
       │     └──[Services]
       │      │auth.service.ts
       │      └──
       │
       │ 
       └── [assets]
           │ [Q1...]
           │ [fonts]
           │ [js]
           │ [Cheers]
           └──
```
           
## Fabriqué avec         
nous avons utilisé des logiciels , entre eux :
_
* [Eclipse JEE](https://www.eclipse.org/) - environnement intégré de développement (IDE)
* [Visuale code](https://code.visualstudio.com/) - Editeur de textes
* [Atom](https://atom.io/) - Editeur de textes
* [lucidchart](https://www.lucidchart.com/) - plateforme pour la  création de diagrammes et la visualisation de données
* [PostMan](https://www.postman.com/) -  Navigateur pour tester les web services




## Auteurs
 auteur(s) du projet !
 
* [LAFKIH Yassine](https://github.com/YassineOsip)
* [LEBBANE Hind](https://github.com/hindlebane)
* [CHAMkhi Anas](https://github.com/)
* [MIMOUDI Houssam](https://github.com/)


### NB : 
 Il existe un cahier des charges fournissant toutes les informations .

