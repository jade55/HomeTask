package ru.lessons;

/**
 * Created by Roman on 02.07.2015.
 * Класс Dog наследуется от Animals.
 * Задается имя собаки и возможность получить имя.
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
     * @param name Имя собаки
     */
    public void setName(final String name){
        this.name = name;
        super.setName(this.name);
        super.setType("Dog");
    }

}