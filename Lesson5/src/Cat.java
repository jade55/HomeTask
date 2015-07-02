import java.lang.String;

public class Cat extends Animals{

    String name;

    Cat(final String name){
        this.name = name;
        super.setName(this.name);
        super.setType("Cat");
    }

    Cat(){

    }

    public void setName(final String name){
        this.name = name;
        super.setName(this.name);
        super.setType("Cat");
    }


}