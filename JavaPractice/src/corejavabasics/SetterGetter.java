package corejavabasics;

public class SetterGetter {
	
	private String uName;
	private String uPassword;
	
	public void setUName(String user_Name){
		uName= user_Name;	
	}
	
	public void setUpassword(String user_Password){
		uPassword = user_Password;
	}
	
	public String getUname(){
		return uName;
	}
	
	public String getUpassword(){
		return uPassword;
	}

}
