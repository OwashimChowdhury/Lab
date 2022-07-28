package Lab;
/*
 * author owashim chowdhury
 * lab Q.3 28/07/2022
 */
public class RegexCheck {
	
	   public static String check(String s) {
		   if (s.matches("[a-z]+_+[a-z]+$"))//regex logic
	                return "Found a match";//if true return this
	       else
	                return "Not matched";//else return this
	   		}

	public static void main(String[] args) {
				   
				    System.out.println(check("java_exercises"));//calling check method and give output
					System.out.println(check("Java_Exercises"));//calling check method and give output
						
			        }

}
