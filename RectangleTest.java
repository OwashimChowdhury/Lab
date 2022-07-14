/*
 * author:owashim chowdhury
 * java program of encapsulation
 */
package Lab;
class Rectangle{
	private int  length;   //private variable
	private int breadth;   //private variable
	
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;	
	}
//setter method
	public void setLength1(int length) {
		this.length=length;	
	}
public void setBreadth(int breadth) {
	this.breadth=breadth;
	
}
//run method
void run() {
	System.out.println("area is:"+length*breadth);
}
	
}
public class RectangleTest {

	public static void main(String[] args) {
		Rectangle re=new Rectangle(60,10);//creating object  
		re.run();
		re.setLength1(10);  //setting the value
		re.setBreadth(5);  //setting the value
		re.run();
		
	}
}
