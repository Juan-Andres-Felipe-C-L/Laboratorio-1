package Clases;

import Entidades.Estudiante;

public class Procesos {

	public boolean validar(double n1, double n2, double n3) {
		if(n1>=0 && n1<=5 && n2>=0 && n2<=5 && n3>=0 && n3<=5) {
			return true;
		}
		return false;
	}
	
	public double calcularPromedio(Estudiante e) {
		System.out.println("Estamos en Procesos.");
		double n1 = e.getNota1();
		double n2 = e.getNota2();
		double n3 = e.getNota3();
		double promedio = -1;
		if(validar(n1, n2, n3) == true) {
			promedio = (n1 + n2+ n3)/3;
		}
		return promedio;
	}
	
	public boolean aprobar(double promedio) {
		boolean respuesta = true;
		if(promedio < 3.5) {
			respuesta = false;
		}
		return respuesta;
	}
}
