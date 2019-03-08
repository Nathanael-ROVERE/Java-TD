package td4;

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
