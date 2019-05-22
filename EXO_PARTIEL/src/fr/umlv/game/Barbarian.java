package fr.umlv.game;

import java.util.Objects;
import java.util.ArrayList;
import fr.umlv.game.Fighter;

public class Barbarian extends Fighter {
    // PARAMETRES
    private HandItem leftHand;
    private HandItem rightHand;
    private ArrayList<HandItem> inventory;
    
    //CONSTRUCTEUR
    public Barbarian(String name, int health, HandItem leftHand, HandItem rightHand) {
    	super(name, health);
        this.leftHand = Objects.requireNonNull(leftHand, "Introduire une arme dans la main gauche");
        this.rightHand = Objects.requireNonNull(rightHand, "Introduire une arme dans la main droite");
        this.inventory = new ArrayList<>();
    }
    
    // METHODES
    @Override 
    public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Barbarian").append(this.getName()).append(" *");
		sb.append(this.getHealth()).append("*, L : ").append(leftHand);
		sb.append(", R : ").append(rightHand).append("\n");
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
        return this.getHealth() + leftHand.getDefense() + rightHand.getDefense();
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
		this.leftHand = swapItem(index, this.leftHand);
	}
	
	public void swapRight(int index){
		this.rightHand = swapItem(index, this.rightHand);
	}
    
    
    
    
    
    
}