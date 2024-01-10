package CJava;

//////////// ALL CONSTANT POOL & NON CONSTANT POLL STRINGS ARE HERE ////////////

public class NinteenIMMUTABLeStringsAll {

	public static void main(String[] args) {
		
	//	Here there are 5 rules for string
	//	1)if you are creating a string without using a "new" operator it will go to the constant pool
	//  2)if you are creating a string with using a "new" like "String s1 = new string" operator it will go to the non constant pool
	//  3)if you are creating a string with 2 "Raw strings" like "rama"+"sita" it will also got to the constant pool
	//	4)if you are creating a string with 2 refrences like "s1+s2" it will also got to the non constant pool 
	//  5)if you are assigning a string to another string by using reference like s1="hai" --- "s2=s1" constant pool	
	
		
//Type 1:
		
		String s1 = "Bhagyesh";
		String s2 = "Bhagyesh";
		
		if(s1 == s2) 
		{
			System.out.println("Print Equal");
		}
		else 
		{
			System.out.println("Not equal");
		}

		if (s1.equals(s2)) 
		{
			System.out.println("Strings Equal");
		}
		else
		{
			System.out.println("Strings equal");
		}
		
		
//Type 2:
		
		String s5 = new String("Raju");
		String s6 = new String("Raju");
		if (s5 == s6) 
		{
			System.out.println("Refrence are equal");
		} else 
		{
			System.out.println("References are not equal");
		}
		if (s5.equals(s6)) 
		{
			System.out.println("Equal");
		} 
		else 
		{
			System.out.println("Not Equal");
		}
		
		
		
//Type 3: 
		
		String s7 = "Atos";
		String s8 = new String("Atos");
		
		if (s7 == s8) 
		{
			System.out.println("Refrence are equal");
		}
		else 
		{
			System.out.println("Refrences are unequal");
		}
		if (s7.equals(s8)) 
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("not Equal");
		}
		
		
		
//Type 4:
		
		String s9 = "Atos";
		String s10 = new String("ATOS");
		
		if (s9 == s10) 
		{
			System.out.println("Refrence are equal");
		}
		else 
		{
			System.out.println("Refrences are unequal");
		}
		if (s9.equals(s10)) // Here we are not considering the IgonreCase (because it ignores string case like "bhagyesh" - "BHAGYESH"
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("not Equal ");
		}
		if (s9.equalsIgnoreCase(s10))
		{
			System.out.println("Equal");
		} 
		else
		{
			System.out.println("Not equal");
		}
		
		
//Type 5 compareTo : 
		
		
// note : CompareTo methods is used to compare 2 strings character by character and decide which
//		  which among the 2 strings is grater. 
//        compareTo method will return when the 2 strings are equal.
//        It will return a positive value if string 1 is grater else it returns a negative value
//		  if string 2 is grater
		
		
		String s11 = "Bhagyesh";
		String s12 = "Santoah";
		
		if (s11.compareTo(s12)>0)
		{
			System.out.println("String 1 is grater than string 2");
		}
		else if(s11.compareTo(s12)<0)
		{
			System.out.println("String 2 is grater than String 1");
			
		}
		else 
		{
			System.out.println("Bot are equal");
		}
		
		
		
//Type 6 The Intern Method:
		

//note : Intern() method is used to bring the copy of the string from non constant pool to
//       to constant pool.
//       
		
		String s13 = new String("Ravi");
		System.out.println(s13);
		String s14 = s13.intern();
		System.out.println(s14);
		String s15 = "Ravi";
		if (s14 == s15) {
			System.out.println("Refrences are equal");
		} 
		else 
		{
			System.out.println("Refrences are un equal");
		}
		
		
		
//Type 7: Other inbuilt methods present in String class
		
		String s16 = "KakkiralaVenkataBhagyesh";
		System.out.println(s16);
		
// toUppercase : it will convert the atring any case to upper case
		System.out.println(s16.toUpperCase());
// toLowercase : it will convert the atring any case to Lower case
		System.out.println(s16.toLowerCase());
// Contains    : it will check weather the word that given in the contains method that is present
//		         in the string or not
		System.out.println(s16.contains("Venkata"));
//IndexOf      : it is the method which is used to check the character is present in which position
//		         of string or not. 
		System.out.println(s16.indexOf("a"));1
//charAt       : it is the method which is used check the number is present is in which character
//               of the string
		System.out.println(s16.charAt(9));
//subString    : it is the method which is used to continue the String from number which has given in string
		System.out.println(s16.substring(7));
//subString    : it is the method which is used to continue the string from one number to another	
//               number apart from last number which has given in the string
		System.out.println(s16.substring(7, 10));
		
// for all extra example programs got to String 1 program.
		
	}

}
