/**
 * Класс складывает/вычетает/умножает/делит
 * @author abutkin
 * @version 0.1
 */
public class Calculator{

    private int result;

    /**
     * @param params Переменные для сложения
     */
    public void plus(int ... params){
        for(int param : params){
            this.result += param;
        }
    }

    /**
     * @param params Переменные для вычетания
     */
    public void minus(int ... params){
        int j = params[0];
		for(int i = 1; i < params.length ; i++){
            j -= params[i];
        }
		this.result = j;
    }

    /**
     * @param params Переменные для умножения
     */
    public void umn(int ... params){
        int j = params[0];
		for(int i = 1; i < params.length ; i++){
            j *= params[i];
        }
		this.result = j;
    }

    /**
     * @param params Переменные для деления
     */
    public void del(int ... params){
        int j = params[0];
		for(int i = 1; i < params.length ; i++){
            j /= params[i];
        }
		this.result = j;
    }

    public int setResult(){
        return this.result;
    }
	
	public void resetResult(){
		this.result = 0;
	}


}
