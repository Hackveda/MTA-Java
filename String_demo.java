package Array_practise;
import java.lang.String;
public class String_demo 
{

	public static void main(String[] args) 
	{
	    char a =  'a';
		String b = "AnushkaT"; // 4 character
		String c = "SNIGdha";// 4 character
		            	//System.out.println(a);
	//System.out.println(b.length());//  length function is used to find number of character in string
	//System.out.println(c.length());
	//System.out.println(b.charAt(3));// charAt : character present at index(1) , 1,2 3, is what index
	//System.out.println(c.compareTo(b));//comparing based on unicode value
	System.out.println(b.strip()); // strip function is used to remove leading and trailing space in the string
	// Length() of string will give you number of character present in string variable
	// unicode is unique value given to different key present on keyboard that directly understand by 
	//system just like ascii value
	
	System.out.println(c.toCharArray()); //  toCharArray Function is used to convert string variable to character
	//array
	System.out.println(c.toLowerCase());// it is converting string variable c into lower cased small letter
	System.out.println(b.toUpperCase()); // it is converting string variable b , c into upper case capital letter
	System.out.println(b.substring(1, 5));// it will give you substring of the string that you are reading
	// it will give you element present at index 1 till n-1 :5
	System.out.println(b.isBlank());
	System.out.println(b.substring(3));
	}

}
