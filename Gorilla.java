
public class Gorilla extends Mammal {
		
	public void throwSomething() {
		System.out.println("The Gorilla has thrown Something! KA-BOOM!!");
		this.decreaseEnergy();
		
	}
	
	public void eatBananas() {
		System.out.println("Gorilla Happy! Yum-Yum.....BUUUURP!");
		this.increaseEnergy();
	}
	
	public void climb() {
		System.out.println("Gorilla has made it to the top of the Sky Scraper!!");
		this.decreaseEnergy();
	}
	
	public void increaseEnergy() {
		this.energyLevel += 5;
	}
	
	public void decreaseEnergy() {
		this.energyLevel -= 10;
	}

}
