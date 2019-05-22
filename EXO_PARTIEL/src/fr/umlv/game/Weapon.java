package fr.umlv.game;

import java.util.Objects;

public class Weapon implements HandItem {
	
	    private String name;
	    private int damage;
	    
	    public int getDamage() {
	        return this.damage;
	    }
	    
	    public String getName() {
	        return this.name;
	    }
	    
	    public Weapon(String name, int damage) {
	        this.name = Objects.requireNonNull(name, "L'arme doit avoir un nom");
	        this.damage = damage;
	    }
	    
	    public int getDefense() {
	    	return 0;
	    }
	    
	    @Override
	    public String toString() {
	        return name + " (" + damage + ")";
	    }

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + damage;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Weapon other = (Weapon) obj;
			if (damage != other.damage)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
	    
	    

	    
}
