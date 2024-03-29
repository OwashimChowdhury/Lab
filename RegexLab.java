package Lab;
/*
 * author owashim chowdhury
 * lab Q.2 28/07/2022
 */

import java.util.regex.Pattern;

class MyRegex {
    String regex = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";//logic
    String pattern = regex + "." +  regex + "." +  regex + "." + regex;//pattern to match
    
       void check (String s ) {//method to check the pattern match or not
    	boolean b=Pattern.matches( pattern, s);//check the pattern match or not
    	System.out.println(b);
    }
}

public class RegexLab {

	public static void main(String[] args) {//main method
		MyRegex m=new MyRegex();
		m.check("000.12.12.034");//calling check method
		m.check("121.234.12.12");//calling check method
		m.check("23.45.12.56");//calling check method
		m.check("00.12.123.123123.123");//calling check method
		m.check("122.23");//calling check method
		m.check("Hello.IP");//calling check method

	}

}
