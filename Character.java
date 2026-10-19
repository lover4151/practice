package code11_06;

public class Character {
	private String name ;
	private int hp;
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getHp() { return hp; }
	public void setHp(int hp) { this.hp = hp; }
	
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	
	public void attack(Matango m) {
	}
}
