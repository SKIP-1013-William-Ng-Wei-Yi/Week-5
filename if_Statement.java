package exercise;

public class ifStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 18;
		double weight = 71.23;
		int height = 191;
		boolean married = false;
		boolean attached = false;
		char gender = 'm';
		
		System.out.println(!married && !attached && (gender == 'm')); 
		System.out.println(married && (gender == 'f'));  //false
		System.out.println((height >= 180) && (weight >= 65) && (weight <= 80));  //true
		System.out.println((height >= 180) || (weight >= 90));  //true
		
		if (!married && !attached && (gender == 'm'))
		
					System.out.println("This is true");
				
		if (married && (gender == 'f'))
		
			System.out.println("It is false");
		
		
		if ((height >= 180) && (weight >= 65) && (weight <= 80))
		
			System.out.println("this is true");
		
		if ((height >= 180) || (weight >= 90))
		
			System.out.println("this is true");
		
		
	}

}
