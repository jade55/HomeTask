public class ArgRunner{

    public static void main(String[] args) {
        System.out.println("Calculator");
        if (args.length = 2){
            int first = Integer.volueOf(args[0]);
            int second = Integer.volueOf(args[1]);
            Calculator calc = new Calculator();
            calc.getData(first, second);
            }else {
            System.out.println("Need too numbers");
        }
    }

}

