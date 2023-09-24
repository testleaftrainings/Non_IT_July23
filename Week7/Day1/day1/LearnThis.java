package week7.day1;

public class LearnThis {
    int wheelNum;
    
    String brandName;
    
    public LearnThis() {//1
    	System.out.println(" i am default");
    }
    
    public LearnThis(int wheelNum, String brandname) {//2
    	this();//Constructor level
    	this.brandName=brandname;
    	System.out.println(brandname);
    }
    public LearnThis soundHorn() {
    	this.applyBrake();
    	System.out.println("SoundHorn");
    	return this;
    }
	public void applyBrake() {
		this.soundHorn();
		System.out.println("ApplyBreak");
	}
	
	
	public static void main(String[] args) {
		
		LearnThis obj= new LearnThis(4,"swift");
		System.out.println(obj.brandName);
		

	}

}
