//Developed by Aemun Ahmar 1047508
//CSCI 185-M03: Spring 2016
//Professor Hakkan Peckan
//Exercise 2: Counting each letter occurrence in a string
//February 17, 2017

import java.util.Scanner;
public class CountEachLetter 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a sentence:");		
		String sentence = input.nextLine();
		
		//invoke a method called CountLetters to count each letter
		int[] counts = CountLetters(sentence.toLowerCase());
		
		//Display results
		for(int i = 0; i < counts.length; i++)
		{
			if(counts[i] != 0)
			{
				System.out.println((char)('a' + i) + " appears " + counts[i] + ((counts[i] == 1)?
						" time" : " times"));
			}
		}
		input.close();
	}
	
	public static int[] CountLetters(String s)
	{
		int[] counts = new int[26];
		for(int i = 0; i < s.length(); i++)
		{
			if(Character.isLetter(s.charAt(i)))
			{
				counts[s.charAt(i) - 'a']++;
			}
		}
		return counts;
	}
}
