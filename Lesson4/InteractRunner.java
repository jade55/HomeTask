import java.util.Scanner;

public class InteractRunner{
	public static void main(String[] arg){
		Scanner reader = new Scanner(System.in);
		String exit = "no";
		Calculator calc = new Calculator();
		while (!exit.equals("yes")){
			System.out.println("Enter first arg");
			int first = Integer.valueOf(reader.next());
			System.out.println("Enter second arg");
			int second = Integer.valueOf(reader.next());			
			calc.add(first, second);
			System.out.println("Result: " + calc.setResult());
			calc.resetResult();
			System.out.println("Exit? yes/no");
			exit = reader.next();
		}
		reader.close();
	}
}