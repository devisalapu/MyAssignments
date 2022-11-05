package week1.day1;

public class Mobile {

    String mobileBrandName = "Apple";
    char mobileLogo = 'A';
    short noOfMobilePiece = 1;
    int modelNumber = 13;
    long mobileImeiNumber = 123456789l;
    float mobilePrice = 999.99f;
    boolean isDamaged = false;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile apple = new Mobile();
		
		System.out.println("Mobile Brand Name: " + apple.mobileBrandName);
		System.out.println("Mobile Logo: " + apple.mobileLogo);
		System.out.println("Number of Pieces: " + apple.noOfMobilePiece);
		System.out.println("Model Number: " + apple.modelNumber);
		System.out.println("IMEI Number: " + apple.mobileImeiNumber);
		System.out.println("Price: " + apple.mobilePrice);
		System.out.println("Is mobile damaged? " + apple.isDamaged);
	}
	
}
