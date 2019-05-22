public class Shield implements HandItem {
    private int defense;
    
    public Shield(int defense) {
        this.defense = defense;
    }
    
    public int getDefense() {
        return this.defense;
    }
}