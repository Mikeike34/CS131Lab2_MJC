
public class Application {

	public static void main(String[] args) {
		Wizard harry = new Wizard("Harry");
		harry.setHealth(100);
		System.out.println(harry.toString()+"\n=====================================================\n");
		System.out.println("Your health is: "+ harry.getHealth());
		harry.takeDamage(20);
		System.out.println("The key is: "+ harry.getKey());
		harry.setKey(34);
		System.out.println("The key is: "+ harry.getKey());
		System.out.println("Locked Status: "+ harry.isLocked());
		harry.lock(34);
		System.out.println("Locked Status: "+ harry.isLocked());
		harry.takeDamage(20);
		harry.unlock(34);
		System.out.println("Locked Status: "+ harry.isLocked());
		harry.takeDamage(20);
		
		
		System.out.println("\n"+harry.toString());

	}//end main

}//end class
