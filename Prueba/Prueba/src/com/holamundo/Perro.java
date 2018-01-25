package com.holamundo;

import java.util.ArrayList;
import java.util.List;

public class Perro
{
	private String nombre;
	private String raza;
	private String color;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", color="
				+ color + "]";
	}
	public static void main(String[] args)
	{
//		List<Perro> listaPerros = null; //nullpointer
		List<Perro> listaPerros = new ArrayList<>();
		listaPerros.add(null);
		listaPerros.add(new Perro());
		listaPerros = null;//nullpointer
		System.out.println("Listando perros...");
		for(Perro can : listaPerros)
		{
			System.out.println(can);
		}
		System.out.println("Termina ejecución");
	}
}
