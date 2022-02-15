package week1.assignment;

public class CharOccurance 
{
public static void main(String[] args)
{
		String str="welcome to chennai";
		char find='e';
		int count=0;
		for (int i = 0; i<str.length(); i++) 
		{
			if(find==str.charAt(i))
			count++;
  }
System.out.println("Number of occurences of a char"+" "+find+" "+"is"+" "+count);
		}
}



