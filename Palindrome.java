package week1.assignment;
public class Palindrome {
public static void main(String[] args) {
	  String str="madam";
	  String revstr="";
	  for (int i =str.length()-1; i >=0; i--) {
		  System.out.println(str.charAt(i));
		  revstr=revstr+str.charAt(i);}
	  System.out.println("Reverse order string is"+" "+revstr);
	  if(str.equals(revstr))
	  {
		  System.out.println("given string is palindrome");
	  }
	  else
	  {
		  System.out.println("given string is not palindrome");
	  }
		  
	  }
}

