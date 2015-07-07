package ru.lessons;

import java.lang.String;

/**
 * Created by Roman on 02.07.2015.
 * ����� Cat ����������� �� Animals.
 * �������� ��� ����� � ����������� �������� ���.
 * @author abutkin
 * @version 1.0
 */
public class Cat extends Animals{

    String name;

    Cat(final String name){
        this.name = name;
        super.setName(this.name);
        super.setType("Cat");
    }

    Cat(){

    }

    /**
     * @param name ��� �����
     */
    public void setName(final String name){
        this.name = name;
        super.setName(this.name);
        super.setType("Cat");
    }


}