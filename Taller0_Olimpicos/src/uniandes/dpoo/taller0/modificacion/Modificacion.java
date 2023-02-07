package uniandes.dpoo.taller0.modificacion;


import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

import java.io.IOException;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;

public class Modificacion {
	
	public static void main(String[] args)
	{
		System.out.println("Hola, mundo!");
		CalculadoraEstadisticas calc = null;
		try {
			calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println(calc.paisConMasMedallistas());
	}

}