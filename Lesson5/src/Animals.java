import java.lang.String;

/**
 * Класс родитель для животных
 * @author abutkin
 * @version 1.0
 */
public class Animals{
  

    private String name;
    private String type;


    public void setName(final String name){
        this.name = name;
    }

    public void setType(final String type){
        this.type = type;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }


}