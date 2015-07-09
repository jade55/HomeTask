package ru.lessons;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Roman on 02.07.2015.
 * ����� �����.
 * ��������� � ������ �������� � �� ���������
 * @author abutkin
 * @version 1.0
 */
public class Clinic{
    ArrayList<Client> clients = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Animals pet;
    String id;
    String name;


    public static void main(String[] args) {
        Clinic c = new Clinic();
        String yesno = "yes";
        Scanner scanner1 = new Scanner(System.in);
        while (yesno.equals("yes")){
            c.inData();
            c.inArray();
            System.out.println("����������? (yes/no)");
            yesno = scanner1.next();
        }
        c.outArray();
    }

    public void inData(){
        System.out.println("������� ��� �������");
        id = scanner.next();
        System.out.println("��� ����� ��������:");
        name = scanner.next();
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

    }

    public void inArray(){
        Client cl = new Client(id, pet);
        clients.add(cl);

    }

    public  void outArray(){
        for (Client client : clients) {
            System.out.println(client.id + " " + client.pat.getName() + " " + client.pat.getType());
        }
    }

}