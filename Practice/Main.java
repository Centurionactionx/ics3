
public class Main{
	
	public static void main (String[] args){
	
		Monster dragon = new Monster();
		Monster orc = new Monster();
		
		dragon.getStats("dragon.txt");
		orc.getStats("orc.txt");
		
		orc.takeDamage(dragon.attack());
		
		if (orc.isAlive()){
			dragon.takeDamage(orc.attack());
		}
		
		dragon.saveMonster("dragon.txt");
		orc.saveMonster("orc.txt");
		
		
	}
	
	
	
	
	
}
