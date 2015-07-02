import java.util.Scanner;

public class Pats{



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animals pet;
        System.out.println("Как зовут животное:");
        String name = scanner.next();
        System.out.println("Какое животное:");
        System.out.println("1: Кошка");
        System.out.println("2: Собака");
        switch (scanner.next()) {
            case "1":
                pet = new Cat(name);
                break;
            case "2":
                pet = new Dog(name);
                break;
            default:
                pet = new Animals();

        }

        System.out.println(pet.getType() + " " + pet.getName());
    }





}