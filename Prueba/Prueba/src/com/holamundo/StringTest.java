package com.holamundo;

public class StringTest
{
	public static void main(String[] args)
	{
		String cadena = "01234567891213";
		String resultado;
		resultado = cadena.length()>10?cadena.substring(0, 10):cadena;
		System.out.println(resultado);
	}
}
