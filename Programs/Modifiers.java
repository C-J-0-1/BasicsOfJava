package access;

public class Modifiers{
	public int Public;
	private int Private;
	protected int Protected;
	
	public void setPublic(int Public){
		this.Public = Public;
	}
	
	public void setPrivate(int Private){
		this.Private = Private;
	}
	
	public void setProtected(int Protected){
		this.Protected = Protected;
	}
	
	public int getPublic(){
		return Public;
	}
	
	public int getPrivate(){
		return Private;
	}
	
	public int getProtected(){
		return Protected;
	}
}