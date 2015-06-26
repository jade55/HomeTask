public class ArgRunner{

    public static void main(String[] arg) {
        System.out.println("Calculator");
        if (arg.length == 2){
            int first = Integer.valueOf(arg[0]);
            int second = Integer.valueOf(arg[1]);
            Calculator calc = new Calculator();
            calc.add(first, second);
			System.out.println(calc.setResult());
            }else {
            System.out.println("Need too numbers");
        }
    }

}

