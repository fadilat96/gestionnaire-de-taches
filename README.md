# Gestionnaire de taches
# JSP

## TD3 – INFO319
## Attributs de page JSP, directive « include »

### Exercice 1 :
Ecrire une page JSP qui affiche un compteur du nombre de visites en utilisant un attribut de page.
Est-ce qu’on peut réaliser le même compteur avec une variable locale de page ? Justifier
### Exercice 2 :
Déduire le traitement réalisé par cette page en analysant plusieurs exécutions consécutives.
```jsp
<%int x=0,y=0;
if (request.getParameter("envoyer")!=null){
int val = Integer.parseInt(request.getParameter("val"));
x = Integer.parseInt(request.getParameter("x"));
y = Integer.parseInt(request.getParameter("y"));
if (val==x) y++;
else y=1;
x=val;}%>
<h1><%=y%></h1>
<form id="form1" name="form1" method="post" action=" /page.jsp">
<input name="val" type="text"/><input type="hidden" name="x"
value="<%=x%>"/> <input type="hidden" name="y" value="<%=y%>"/>
<input type="submit" name="envoyer" value="envoyer" /> </form></body></html>
  ```
### Exercice 3 :
On veut implémenter un mécanisme d’identification dans une page JSP. Lors du premier affichage
de la page, cette dernière affiche un formulaire (avec la directive « include ») permettant de saisir
un nom d’utilisateur et un mot de passe. L’utilisateur saisie ces deux valeurs et les soumet à la page
qui les vérifie, s’ils sont correctes alors un message de bien venu sera affiché, sinon la page renvoie
le formulaire d’identification pour essayer à nouveau.
- Quelles sont les conséquences d’utilisation d’un attribut de page comme mécanisme
d’identification sur un site web multi-utilisateurs et multipages?
- Ajouter à la page un mécanisme qui limite le nombre d’essais incorrects à 3, puis affiche un
message d’erreur et n’autorise plus les essais.
  
*N.B : normalement, les identifiants des utilisateurs sont stockés dans une BDD, mais pour
simplifier on les considère comme des constantes de la page JSP.*

## TD4 – INFO319
## Session, Classes « Métier »
### Exercice 1 :
On veut réaliser un jeu de devinette sous forme d’une page JSP. La première fois que le jeu est
lancé, l’application crée un nombre aléatoire entre 1 et 99. Ensuite elle demande à l’utilisateur
d’essayer de trouver le nombre deviné. A chaque essai incorrecte, le jeu informe l’utilisateur s’il
doit essayer un nombre inférieur ou supérieur à celui donné, ceci jusqu’à trouver la valeur correcte.
Une fois le nombre est trouvé, l’application affiche un message de félicitation en mentionnant le
nombre d’essais et le jeu sera réinitialisé pour permettre de lancer une nouvelle session de jeu.
Indications : - la saisie d’un essai se fait à l’aide d’un formulaire envoyé par la page
- utiliser une session pour maintenir les données du jeu.
- utiliser la méthode « Math.random( ) » pour la génération du nombre aléatoire.
  
### Exercice 2 : Gestionnaire de tâches « TODO »
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

### Exercice 3 : Carnet d’adresses
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
Exercice 4: Gestion des élections
On veut réaliser une application web JSP pour gérer des élections. Les acteurs de cette
application sont : les candidats, les partis et les électeurs. Un parti est un groupe politique
défini par un nom et renferme 5 candidats. Un candidat possède un nom et une adresse. Un
électeur possède un nom, un âge et un sexe, il vote en insérant dans une urne un bulletin de
vote sur lequel il marque le nom du parti à qui il veut voter. L’application doit réaliser les
actions suivantes :
- Saisir la liste des électeurs
- Saisir la liste des candidats
- Saisir la liste des partis et définir les candidats de chaque parti
- Introduire les bulletins des votes
- Afficher le résultat des élections, en donnant pour chaque parti son nom, ses candidats, et
le nombre de votes total.
L’application Web doit être réalisée en se basant sur la technologie des pages JSP et HTML, et
des classes métiers Java. Il est conseillé d’utiliser les TAG « include » dans la mesure de
possible. On peut utiliser la « session » java pour maintenir les différentes listes. Pour les
formulaires, ce n’est pas nécessaire d’écrire leur code HTML, seulement mentionner le nom
de leurs champs, et l’action appelée par le « submit ».
**Question 1 :** faire la conception de l’application
**Question 2 :** faire la programmation des pages JSP et des classes « Métier »
