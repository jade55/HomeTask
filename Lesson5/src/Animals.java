import java.lang.String;

/**
 * Класс родитель для животных
 * @author abutkin
 * @version 1.0
 */
public class Animals{
  

    public String name;
    public String type;


    public void getName(String name){
        this.name = name;
    }

    public void getType(String type){
        this.type = type;
    }


}