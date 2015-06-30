public class Calculator{

    private int result;

    public void plus(int ... params){
        for(int param : params){
            this.result += param;
        }
    }
	
	public void minus(int ... params){
        int j = params[0];
		for(int i = 1; i < params.length ; i++){
            j -= params[i];
        }
		this.result = j;
    }
	
	public void umn(int ... params){
        int j = params[0];
		for(int i = 1; i < params.length ; i++){
            j *= params[i];
        }
		this.result = j;
    }
	
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
