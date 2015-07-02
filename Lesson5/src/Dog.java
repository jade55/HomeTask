

public class Dog extends Animals{

    String name;

    Dog(final String name){
        this.name = name;
        super.setName(this.name);
        super.setType("Dog");
    }

    Dog(){

    }

    public void getName(final String name){
        this.name = name;
        super.setName(this.name);
        super.setType("Dog");
    }

}