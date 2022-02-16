package week2.day3;

import java.util.Iterator;

public class ReverseWords {

	public static void main(String[] args) {
		String text="I am software tester";
		String[] text2=text.split(" ");
		for (int i = 0; i<text2.length; i++)
		{
		if( i % 2 == 1)
			{
				for (int j=text2[i].length()-1; j>=0; j--)
				{
					System.out.print(text2[i].charAt(j));
				}
				System.out.print(" ");
			}
				else
				{
					System.out.print(text2[i]+" ");
				}
			}
		
		}
		}
	


