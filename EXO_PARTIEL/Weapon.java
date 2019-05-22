import java.util.Objects;

public class Weapon implements HandItem {
    private String name;
    private int damage;
    
    public int getDamage() {
        return this.damage;
    }
    
    public Weapon(String name, int damage) {
        this.name = Objects.requireNonNull(name, "L'arme doit avoir un nom");
        this.damage = damage;
    }
    
    @Override
    public String toString() {
        return name + " (" + damage + ")";
    }

                                           
/*    @Override
    public boolean equals(Weapon arme) {
        
    }*/
}