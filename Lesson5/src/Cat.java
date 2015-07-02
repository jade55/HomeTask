import java.lang.String;

public class Cat extends Animals{

    String name;

    Cat(String name){
        this.name = name;
        super.getName(this.name);
        super.getType("Cate");
    }

    Cat(){

    }

    public void getName(String name){
        this.name = name;
        super.getName(this.name);
        super.getType("Cate");
    }


}