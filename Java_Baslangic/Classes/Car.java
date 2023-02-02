package Classes;

public class Car {
	// Nitelikler
	
	String type;
	String model;
	String color;
	int speed;
	
	
	Car (String model, int speed, String color, String type){
		System.out.println("Yeni car oluşuturuldu. ");
		this.model = model;
		this.speed = speed;
		this.color = color;
		this.type = type;
	}
	
	Car(){
		System.out.print("Boş kurucu metot oluştu.");
	}
	
	
	void increaseSpeed(int increment ) {
		
		if ((speed + increment) < 180) {
			this.speed += increment;
		}
		
		
	}
	
	
	void decreaseSpeed(int decrease) {
		
		if(this.speed > 0) {
			this.speed -= decrease;
		}
	}
	
	void printInfo() {
		System.out.println(" Model: " + this.model);
		System.out.println(" Speed: " + this.speed);
		System.out.println(" Color: " + this.color);
		System.out.println(" Type: " + this.type);
	}
	
	
	
}

