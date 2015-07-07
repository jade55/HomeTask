package ru.lessons;

import java.lang.String;

/**
 * Created by Roman on 02.07.2015.
 * Класс Cat наследуется от Animals.
 * Задается имя кошки и возможность получить имя.
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
     * @param name Имя кошки
     */
    public void setName(final String name){
        this.name = name;
        super.setName(this.name);
        super.setType("Cat");
    }


}