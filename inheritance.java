class Vehicle{
	String brand;
	String model;
	Vehicle(String brand,String model){
		this.brand=brand;
		this.model=model;
	}
	void displayDetails() {
		System.out.println("Brand :"+brand);
		System.out.println("Model :"+model);
	}
}
class Car extends Vehicle{
	String fuelType;
	Car(String brand,String model,String fuelType){
		super(brand,model);
		this.fuelType=fuelType;
	}
	void displayDetails() {
		super.displayDetails();
		System.out.println("Fuel Type: "+fuelType);
	}
}
class ElectricCar extends Car{
	double batteryCapacity;
	ElectricCar(String brand,String model,String fuelType,double batteryCapacity){
		super(brand,model,fuelType);
		this.batteryCapacity= batteryCapacity;
	}
	void displayDetails(){
		super.displayDetails();
		System.out.println("Battery Capacity: "+batteryCapacity);
	}
}
public class inheritance2 {
	public static void main(String[] args) {
		ElectricCar ec=new ElectricCar("BMW","M3","Electric",100);
		ec.displayDetails();
		
	}
}
