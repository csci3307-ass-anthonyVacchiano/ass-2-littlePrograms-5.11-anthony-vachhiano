
public class autopolicy {

	private int accountnumber;
	private String model;
	private String state;
	
	public autopolicy(int accountnumber, String model, String state){
		this.accountnumber = accountnumber;
		this.model = model;
		this.state = state;
	}
	public void setaccountnumber(int accountnumber){
		this.accountnumber = accountnumber;
	}
	public int getaccountnumber(){
		return accountnumber;
	}
	public void setmodel(String model){
		this.model = model;
	}
	public String getmodel(){
		return model;
	}
	public void setstate(String state){
		this.state= state;
	}
	public String getstate(){
		return state;
	}
	public boolean nostate()
	{
		boolean nostate;
		switch (getstate()){
		case "MA": case "NJ": case "NY" : case "PA" :
			nostate =true; break;
		default: 
			nostate = false;
			break;
		}
		return nostate;
	}
}
