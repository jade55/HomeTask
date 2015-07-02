import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class Pats{

    public static void main(String[] args) {
        Cat cat = new Cat();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        cat.getName(name);
        System.out.println(cat.name);

    }

}