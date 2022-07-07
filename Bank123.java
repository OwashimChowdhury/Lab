/*
Author:Owashim chowdhury
4…Consider a scenario where Bank is a class that provides functionality to get the rate of interest.
However, the rate of interest varies according to banks.
For example, SBI, ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest
*/
package Lab;

class Bank{  //parent class
	int getRateOfInterest(){
		return 0;
		} 	  
}  
//Creating child classes.  
class SBI extends Bank{	//child class of Bank
int getRateOfInterest(){
	return 8;
	}  
}  
class ICICI extends Bank{  //child class of Bank
int getRateOfInterest(){
	return 7;
	}  
}  
class AXIS extends Bank{  //child class of Bank
int getRateOfInterest(){
	return 9;
	}  
}  
class Bank123{  
public static void main(String args[]){  
SBI sbi=new SBI();  //object of SBI class
ICICI ic=new ICICI();  //object of ICICI class
AXIS ax=new AXIS();  //object of AXIS class
System.out.println("in SBI Rate of Interest is: "+sbi.getRateOfInterest());  
System.out.println("in ICICI Rate of Interest is: "+ic.getRateOfInterest());  
System.out.println("in AXIS Rate of Interest is: "+ax.getRateOfInterest()); 
}  
}
