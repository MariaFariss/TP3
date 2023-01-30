# DM Note TP3-4 (FARISS)
**DM 1/2**
# Dependencies
    
- Web : cette dépendance inclut généralement un ensemble de bibliothèques pour la création d'applications Web, telles que la prise en charge de la gestion des requêtes et des réponses HTTP, la diffusion de pages Web et la gestion des sockets Web.

 - JPA : Java Persistence API (JPA) est une spécification Java pour la gestion, la persistance et l'accès aux données entre les objets/classes Java et une base de données relationnelle. Il fait partie de Java Enterprise Edition (JavaEE).

 - Hibernate est un framework open-source Object-Relational Mapping (ORM) pour Java. Il est utilisé pour mapper des objets Java sur des tables de base de données, et il est souvent utilisé conjointement avec JPA pour fournir une couche de persistance plus puissante et flexible pour les applications Java.

- Spring H2 est un système de gestion de base de données relationnelle open source basé sur Java. Il est souvent utilisé comme base de données en mémoire à des fins de test et de développement en raison de son faible encombrement et de son temps de démarrage rapide.

-  DevTools, il s'agit d'un ensemble d'outils généralement utilisés au cours du processus de développement, tels que des outils de création, de test et de débogage de l'application.

- Thymeleaf est un moteur de modèle basé sur Java pour la création d'applications Web. Il est utilisé pour générer du HTML, du XML et d'autres langages de balisage, et il prend en charge les modèles naturels, ce qui signifie qu'il peut traiter les modèles comme s'il s'agissait de fichiers statiques, sans avoir besoin d'un conteneur de servlet.

# Questions 13
1-  L'annotation @GetMapping("/greeting") permet la configurationde l'url d'appel "/greeting", qui mappe la méthode greeting() pour gérer les requêtes HTTP GET pour l'URL "/greeting".

2-  On choisit le fichier HTML à afficher avec le "return "greeting";" déclaration dans la méthode greeting(). Cela indique à l'application d'utiliser le modèle "greeting" pour rendre la réponse.

 3- Nous envoyons le nom à qui nous disons bonjour avec le deuxième lien en utilisant un paramètre de requête dans l'URL. Le nom est passé en tant que paramètre de requête à la méthode greeting() via l'annotation @RequestParam. Le nom du paramètre est "nameGET", il n'est pas obligatoire et la valeur par défaut est "World".

# Questions 17
oui, grâce à la création de la table address.
# Question 18
Grâce à la classe address, la BDD a pu convertir les attributs de la classe. En utilisant l’annotation @Entity pour indique que address est une table. @Id pour indiquer l’identifiant de la table address. Et pour @generated value pour indiquer qu'id va être incrémenter et générer.  
# Question 20
select * from address
oui, c'est bien intégré	

# Question 22
@Autowired est une annotation de framework Spring utilisée pour indiquer qu'un champ doit être câblé automatiquement avec un bean correspondant dans le contexte de l'application Spring. Lorsqu'un champ est annoté avec @Autowired, le framework Spring définit automatiquement la valeur du champ sur une instance du type approprié à partir du contexte de l'application.

# Question 30
J’ai intégré la référence du lien de Bootstrap dans le head du fichier navbar.html.

**DM 2/2**
## Etape 6
1- Oui, on a besoin d'un token d'authentification. (En rajoutant une ligne header qui contient notre token qu'on a cree)
2- URL utilise : https://api.meteo-concept.com/api/forecast/daily?latlng=48.086%2C-2.635&insee=35238
3- Methode HTTP que j'ai utilise est la methode GET
4- Pour mettre les parametres dans l'url, on ecrit notre premier attribut apres '?' et pour ajouter d'autres attribute apres on ajoute '&', comme ci indique : "https://api.meteo-concept.com/api/forecast/daily?latlng=[recupereLatitude]%2C[recuperationLongitude]&insee=[recuperationDuCityCode]"
5- Afficher le temperature : forecast > tmin et tmax
Afficher la prevention : forecast > weather

# lien Github
https://github.com/MariaFariss/TPNote.git

