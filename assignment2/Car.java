package assignment2;

public class Car {
	public void applyBreak() {
		int speed=100;
		for (int i = 0; i<=speed; i++) {
			if(i>=60)
			{
				System.out.println(i+" Your Car is going high speed apply break");
				break;
			}
		}
	}
	
				protected void soundHorn() {
					System.out.println("Sound Horn");
				}
				public static void main(String[] args) {
					Car speed=new Car();
					speed.applyBreak();
					speed.soundHorn();
					
}

					}

	
