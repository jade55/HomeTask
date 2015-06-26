public class Calculator{

    private int result;

    public void add(int ... params){
        for(int param : params){
            this.result += param;
        }
    }

    public int setResult(){
        return this.result;
    }
	
	public void resetResult(){
		this.result = 0;
	}


}
