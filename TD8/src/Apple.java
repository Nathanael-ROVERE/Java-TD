
public class Apple extends Fruit {
	
	//PARAMETRES
	private int poids;
	private AppleKind type;
	
	// CONSTRUCTOR
	public Apple(int poids, AppleKind type) {
		this.poids = poids;
		this.type = type;
	}
	
    enum AppleKind {
        Golden, PinkLady, GrannySmith;
     }
	
	// METHODES
	@Override
	public String toString() {
		return (this.type + " " + this.poids + " g");
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + poids;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Apple other = (Apple) obj;
		if (poids != other.poids)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	public int getPrice() {
		return this.poids/2;
	}
	
	

}
