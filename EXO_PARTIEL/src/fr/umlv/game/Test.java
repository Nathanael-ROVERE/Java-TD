package fr.umlv.game;


public class Test {
    
    public static void main(String[] args) {
        
        // QUESTION 1
        Weapon sword = new Weapon("Excalibur", 50);
        
        System.out.println(sword); // Excalibur (50)
        
        // QUESTION 3
        Barbarian hulk = new Barbarian("Hulk", 100, new Weapon("Dagger", 8), new Weapon("Axe", 12));
        
        System.out.println(hulk); // Barbarian Hulk *100*, L : Dagger (8), R : Axe (12)
        
        // QUESTION 4
        Barbarian olaf = new Barbarian("Olaf", 80, new Weapon("Mace", 5), new Weapon("Pique", 15));
        Barbarian zorg = new Barbarian("Zorg", 75, new Weapon("Sword", 9), new Weapon("Sword", 9));
        
        System.out.println(olaf.attack()); // 20
        System.out.println(zorg.attack()); // 20
        
        // QUESTION 5
        hulk.fight(olaf); // Hulk won the fight!
        olaf.fight(zorg); // nobody won the fight!
        
        // QUESTION 6
        System.out.println(new Shield(50)); // Shield (50)
        
        // EXERCICE 3
        
        // QUESTION 1
        Ranger ranger = new Ranger("Léon", new Weapon("Sword", 11), 130); 
        System.out.println(ranger); // Ranger Léon *130*, Sword (11), spell = 0
        
        // QUESTION 2
        ranger.learnNewSpell(4);
        System.out.println(ranger);   // Ranger Léon *130*, Sword (11), spell = 4 
        ranger.learnNewSpell(2);
        System.out.println(ranger);   // Ranger Léon *130*, Sword (11), spell = 4 
        
        // QUESTION 3
        ranger.fight(ranger);  // nobody won the fight!
        ranger.fight(olaf);    // Léon won the fight!
        hulk.fight(ranger);    // nobody won the fight!
        

        
    }
}