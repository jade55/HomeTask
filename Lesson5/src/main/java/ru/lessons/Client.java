package ru.lessons;

/**
 * Created by Roman on 02.07.2015.
 *  ласс описывает клиента клиники дл€ животных.
 * ” клиента есть им€, тип животного, им€ животного
 * @author abutkin
 * @version 1.0
 */
public class Client {

    public String id;
    public Animals pat;

    Client (String name, Animals pat){
        id = name;
        this.pat = pat;
    }

    public void setClient(String name, Animals pat){
        id = name;
        this.pat = pat;
    }



}

