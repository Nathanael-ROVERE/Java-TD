import java.utils.Objects;

public class Barbarian {
    // PARAMETRES
    private String name;
    private int health;
    private HandItem leftHand;
    private HandItem rightHand;
    private ArrayList<HandItem> inventory;
    
    //CONSTRUCTEUR
    public Barbarian(String name, int health, HandItem leftHand, HandItem rightHand) {
        this.name = name;
        this.health = health;
        this.leftHand = Objects.requireNonNull(leftHand, "Introduire une arme dans la main gauche");
        this.rightHand = Objects.requireNonNull(rightHand, "Introduire une arme dans la main droite");
        this.inventory = new ArrayList<>();
    }
    
    // GETTERS & SETTERS
    public String getName() {
        return this.name;
    }
    
    public int getHealth() {
        return this.health;
    }
    
    // METHODES
    @Override 
    public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Barbarian").append(name).append(" *");
		sb.append(health).append("*, L : ").append(left);
		sb.append(", R :").append(right);
		sb.append("------").append("\n");
        for (HandItem items: inventory){
            sb.append(items.toString()).append("\n");
        }
        sb.append("------").append("\n");
        return sb.toString();
    }
    
    public int attack() {
        int left = leftHand.getDamage();
        int right = rightHand.getDamage();
        int sum = left + right;
        
        if (leftHand.equals(rightHand) == true) sum += 2;
        return sum;        
    }
    
    public int defense() {
        return health + leftHand.getDefense() + rightHand.getDefense();
    }
    
    public void fight(Barbarian challenger) {
        int thisAtk = this.attack();
        int thisHealth = this.health;
        int challengerAtk = challenger.attack();
        int challengerHealth = challenger.getHealth();
        
        while (thisHealth > 0 || challengerHealth > 0) {
            thisHealth -= challengerAtk;
            challengerHealth -= thisAtk;
        }
        
        if (thisHealth <=0 && challengerHealth <=0) {
            sysout("nobody won the fight!");
        }
        if (thisHealth <=0) {
            sysout(this.name + " won the fight!");
        }
        else {
            sysout(challenger.getName() + " won the fight!");
        }      
    }
    
    public void addToInventory(HandItem item) {
        this.inventory.add(item);
    }
    
	public HandItem swapItem(int index, HandItem drop){
		if (inventory.isEmpty()){
			throw new IllegalStateException("Empty inventory");
		}
		if (index < 0 || index >= inventory.size()){
			throw new IllegalArgumentException("incorrect index");
		}
		return inventory.set(index, drop);
	}
	
	public void swapLeft(int index){
		this.left = swapItem(index, this.left);
	}
	
	public void swapRight(int index){
		this.right = swapItem(index, this.right);
	}
    
    
    
    
    
    
}