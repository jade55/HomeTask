import java.util.Scanner;

public class InteractRunner{
	public static void main(String[] arg){
		Scanner reader = new Scanner(System.in);
		String exit = "no";
		Calculator calc = new Calculator();
		while (!exit.equals("yes")){
			System.out.println("Enter first arg");
			int first = Integer.valueOf(reader.next());
			System.out.println("Enter znak arg");
			String znak = reader.next();
			System.out.println("Enter second arg");
			int second = Integer.valueOf(reader.next());
			switch(znak){
				case "+": 
					calc.plus(first, second);
					break;
				case "-": 
					calc.minus(first, second);
					break;
				case "*": 
					calc.umn(first, second);
					break;
				case "/": 
					calc.del(first, second);
					break;
			
			}			
			System.out.println("Result: " + calc.setResult());
			calc.resetResult();
			System.out.println("Exit? yes/no");
			exit = reader.next();
		}
		reader.close();
	}
}