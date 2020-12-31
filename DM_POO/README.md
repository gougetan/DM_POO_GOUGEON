# Partie 1


## Web
Se base sur Spring MVC. Permet de faire communiquer des pages web et de controler la navigation sur ces pages
## JPA
Permet de gerer des données SQL. Facilite l'utilisation des applications Spring
## Hibernate
Permet d'utiliser un framework. Permet de faire un mapping d'objet et d'utiliser des objets en java depuis une base de données
## H2
Systeme de gestion de base de données qui peut être intégré à JAVA
## DevTools
Permet d'ajouter des modules à un projet pour rendre le développement plus agréable
## Thymeleaf
Permet des applications web et non web. Permet également de travailler avec Spring 

## Q13
1. Avec le @GetMapping("/greeting")
2. Avec le return"greeting";
3. ("nomTemplate", nameGET)

## Q17
<br>Il y a un onglet pour accéder à la table de donnée "ADDRESS" qui est apparu dans le menu à gauche. Dans cet onglet se trouvent tous les attributs que l'on a définis dans notre classe Address

## Q18
Hibernate à détecté que la table "ADDRESS' faisait parti de la base de données

## Q20
On voit bien toutes les infos : id, content, creation

## Q23

@Autowired permet de faire la connexion entre les dépendences "bean" de l'application

## Q30

Je n'ai pas ajouté Bootstrap à mon projet

# Partie 2

1. Oui, il faut une clé API pour utiliser OpenWeatherMap
2. L'api est utlisée avec l'url : http://api.openweathermap.org/data/2.5/weather.
3. On utilise la methode HTTP GET
4. Les parametres d'appels sont passés dans l'url (à la suite)
5. 
    5.1 Il faut utiliser l'url le la 2. et utiliser l'attribut : `reponseMeteo.getMain().getTemp()`
    5.2 Il faut utiliser une autre url : pro.openweathermap.org/data/2.5/forecast/hourly?q={city name}&appid={API key}