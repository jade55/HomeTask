import java.util.Scanner;

public class Pats{



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animals pet;
        System.out.println("��� ����� ��������:");
        String name = scanner.next();
        System.out.println("����� ��������:");
        System.out.println("1: �����");
        System.out.println("2: ������");
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