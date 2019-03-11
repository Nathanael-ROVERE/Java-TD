package td3;

import java.util.Objects;

public class Book {
	
	// 1
	private String title;
	private String author;
	
	
	// GETTERS
    public String getTitle() {  
        return this.title ;  
   }  
    
    public String getAuthor() {  
        return this.author ;  
   } 
    
    // SETTERS
    public void setTitle(String newTitle) {
    	this.title = newTitle;
    }
     
    public void setAuthor(String newAuthor) {  
        this.author = newAuthor;  
   }
    
    //CONSTRUCTEURS
    // 8
    public Book(String title, String author) {
    	this.title = title;
    	this.author = author;
    }
    
	// 9
    public Book(String title) {
    	this.title = title;
    	this.author = "no author";
    }
    	
    // EXERCICE 2
    // 2
    @Override
    public boolean equals(Object book2) {
    	if (this.title.equals(((Book) book2).getTitle()) && this.author.equals(((Book)book2).getAuthor())) {return true;}
    	else return false;
    }
    
    @Override
    public String toString() {
    	return this.title + " by " + this.author;
    }
    
}

// Exercice 1

// 2
// affiche null null
// normal étant donné que l'on a entré aucun titre/auteur

// 3 
// En déplaçant le main, on a une erreur car title et author sont privés
// On peut faire des getters pour y accéder

// 4
// Les 4 visiblités sont : private < (rien) < protected < public
// public : accessible de partout (jamais)
// protected : accessible depuis les classes qui héritent
// (rien) : accessible dans le package
// private : accessible dans la classe uniquement

// 5
// Un accesseur permet de connaître un champ, même privé, depuis une autre classe. 
// Il affiche la valeur d'un champ sans la modifier.

// 6 
// Pour indiquer qu'un champ ne doit pas etre modifié, on le déclare en final

// 7
// Avec le nouveau constructeur, le constructeur par défaut appelé précédemment n'existe plus 
// et donc il y a une erreur dans le main

// 8
// Avec title et author, on est obligé de spécifier this. pour éviter la confusion

// 10
// Le compilateur sait quel constructeur appeler grâce au nombre d'arguments différent entre les constructeurs

// 11
// 


// Exercice 2

// 1 
// Affiche true false
// Cela est du au fait que == compare les références, et pas le contenu

// 3
// Renvoie l'index de la première occurence de l'élément recherché dans la liste. Renvoie -1 si la liste ne contient pas l'élément








