package com.unicode;

public class UnicodeTest
{
	char [] caracter = {'A','B','C','Z', 'Ñ', 'a', 'b', 'c','z', 'ñ'};
	
	public static void main(String[] args) 
	{
		for(int unicodeNum : new UnicodeTest().caracter)
		{
			System.out.println("Representacion unicode: " + unicodeNum);
			
			if(unicodeNum == 65)
			{
				System.out.println("A");
			}
		}
	}
}
