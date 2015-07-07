package ru.lessons;

/**
 * Created by Roman on 02.07.2015.
 * ����� Dog ����������� �� Animals.
 * �������� ��� ������ � ����������� �������� ���.
 * @author abutkin
 * @version 1.0
 */

public class Dog extends Animals{

    String name;

    Dog(final String name){
        this.name = name;
        super.setName(this.name);
        super.setType("Dog");
    }

    Dog(){

    }

    /**
     * @param name ��� ������
     */
    public void setName(final String name){
        this.name = name;
        super.setName(this.name);
        super.setType("Dog");
    }

}