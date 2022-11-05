package week1.day1;

public class TwoWheeler {
    int noOfWheels = 2;  
    short noOfMirrors = 1;  
    long chassisNumber = 123456789l;
    boolean isPunctured = false;
    String bikeName = "BMW";
    double runningKM = 100.2;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler bmw = new TwoWheeler();
		
		System.out.println("Number of Wheels: " + bmw.noOfWheels);
		System.out.println("Number of Mirrors: " + bmw.noOfMirrors);
		System.out.println("Chassis Number: " + bmw.chassisNumber);
		System.out.println("Is the bike punctured: " + bmw.isPunctured);
		System.out.println("Bike Name: " + bmw.bikeName);
		System.out.println("Running Kilometers: " + bmw.runningKM);
	}

}

