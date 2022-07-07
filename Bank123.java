package Lab;

class Bank{  
	int getRateOfInterest(){
		return 0;
		} 	  
}  
//Creating child classes.  
class SBI extends Bank{  
int getRateOfInterest(){
	return 8;
	}  
}  
class ICICI extends Bank{  
int getRateOfInterest(){
	return 7;
	}  
}  
class AXIS extends Bank{  
int getRateOfInterest(){
	return 9;
	}  
}  
class Bank123{  
public static void main(String args[]){  
SBI sbi=new SBI();  
ICICI ic=new ICICI();  
AXIS ax=new AXIS();  
System.out.println("in SBI Rate of Interest is: "+sbi.getRateOfInterest());  
System.out.println("in ICICI Rate of Interest is: "+ic.getRateOfInterest());  
System.out.println("in AXIS Rate of Interest is: "+ax.getRateOfInterest()); 
}  
}
