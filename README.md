# Gestionnaire de taches
# JSP

## Exercice 1 :
On veut réaliser un jeu de devinette sous forme d’une page JSP. La première fois que le jeu est
lancé, l’application crée un nombre aléatoire entre 1 et 99. Ensuite elle demande à l’utilisateur
d’essayer de trouver le nombre deviné. A chaque essai incorrecte, le jeu informe l’utilisateur s’il
doit essayer un nombre inférieur ou supérieur à celui donné, ceci jusqu’à trouver la valeur correcte.
Une fois le nombre est trouvé, l’application affiche un message de félicitation en mentionnant le
nombre d’essais et le jeu sera réinitialisé pour permettre de lancer une nouvelle session de jeu.
Indications : - la saisie d’un essai se fait à l’aide d’un formulaire envoyé par la page
- utiliser une session pour maintenir les données du jeu.
- utiliser la méthode « Math.random( ) » pour la génération du nombre aléatoire.

  
## Exercice 2 : Gestionnaire de tâches « TODO »
On souhaite développer une application JSP pour l’introduction des tâches de type « TODO » pour
un utilisateur. Une tâche TODO est composée de : titre de la tâche, Description de la tâche,
Catégorie de la tâche (« secondaire », « normale », « urgente »,). Un Exemple de tâche : (« réparer
voiture », « passer demain au mécanicien pour changer les bougies », « urgente »). Au départ,
l’utilisateur commence par demander la page et il obtient un formulaire permettant de saisir les
données d’une tâche TODO. Le formulaire contient deux boutons : « + » et « End ». Le bouton
« + » situé à droit permet d’ajouter les données de la tâche en cour à la liste déjà saisie et il fait
réapparaître le même formulaire pour saisir une nouvelle tâche (les anciennes tâches apparaissent
avant le formulaire et à coté de chacune un bouton « - » pour supprimer la tâche). Le bouton
« End » termine la saisie et passe l’utilisateur sur un écran ou il y a 4 liens de type GET (qui
correspondent aux trois catégories possibles, et à l’option « ALL »). Si l’utilisateur clique sur l’un
des trois premiers liens, il obtient en résultat toutes les tâches TODO de la catégorie cliquées. Et si
l’utilisateur clique sur le lien « ALL » il obtient toutes les tâches TODO saisies peu importe la
catégorie. Finalement, pour mémoriser la liste des tâches, on utilise un objet « session ».


## Exercice 3 : Carnet d’adresses
On veut créer un carnet d’adresses en version WEB. Chaque contact du carnet contient les
informations suivantes : Nom, Prénom, Adresse et Tel. Le formulaire de saisie contient deux
boutons : « Ajouter » et « Terminer ». Le bouton « Ajouter » permet d’ajouter un nouvel contact au
carnet et fait réapparaître le formulaire à nouveau. Le bouton « Terminer » affiche le carnet en
entier sur une nouvelle page. Le carnet est stocké en utilisant une session. Le code du formulaire se
trouve dans un fichier HTML séparé (utiliser des classes métiers dans la mesure du possible).- Ecrire la page « saisie.jsp » capable de réaliser l’introduction des fiches.
- Ecrire une nouvelle page « recherche.jsp » permettant de rechercher les fiches selon la valeur du
« nom ». Le nom est saisi en premier dans un formulaire puis on affichera tous les résultats obtenus
sous forme de tableau (ajouter un lien pour relancer une nouvelle recherche).
- Génération d’un annuaire à raison d’une lettre par page et une barre de navigation (comme celle
de Google).
- Créer une page principale qui permet de lancer les trois options déjà développées, ajouter des liens
de retour sur la page principale.

## Exercise 1: Number Guessing Game

We want to create a number guessing game as a JSP page. The first time the game is launched, the application generates a random number between 1 and 99. It then asks the user to try to guess the number. With each incorrect attempt, the game informs the user whether to try a lower or higher number until they find the correct value. Once the number is guessed, the application displays a congratulatory message, including the number of attempts, and resets the game for a new session.

Instructions:
- Use a form to collect user guesses.
- Utilize a session to maintain game data.
- Utilize the `Math.random()` method for generating a random number.

## Exercise 2: TODO Task Manager

We want to develop a JSP application for managing "TODO" tasks for a user. A "TODO" task consists of a title, description, and category ("secondary," "normal," "urgent").

Instructions:
- The user starts by requesting the page and gets a form for entering TODO task data.
- The form contains two buttons: "+" and "End."
- The "+" button adds the current task data to the existing list of tasks and displays the same form for entering a new task. The old tasks are listed with a "Remove" button next to each task for deletion.
- The "End" button finishes the input and takes the user to a page with 4 GET links corresponding to the three possible categories and the option "ALL."
- Clicking on any of the first three links shows all TODO tasks of the selected category. Clicking on the "ALL" link displays all entered TODO tasks, regardless of the category.
- Use a session to store the list of tasks.

## Exercise 3: Address Book

We want to create a web-based address book. Each contact in the address book includes the following information: Name, First Name, Address, and Telephone. The input form contains two buttons: "Add" and "Finish." The "Add" button allows users to add a new contact to the address book and displays the form again for entering a new contact. The "Finish" button displays the entire address book on a new page.

Instructions:
- Implement the "saisie.jsp" page for entering contact information.
- Create a new page, "recherche.jsp," for searching contacts by the value of "name." The name is entered in a form, and all matching results are displayed in a table (add a link to restart a new search).
- Generate a directory with one page for each letter and a navigation bar (similar to Google).
- Create a main page to launch the three previously developed options, and add links to return to the main page.

Please note that in real-world applications, storing data in sessions may not be ideal for scalability, and it is recommended to use a database to store persistent information.
