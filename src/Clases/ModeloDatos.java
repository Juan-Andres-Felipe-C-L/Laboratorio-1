package Clases;

import java.util.HashMap;

import Entidades.Estudiante;

public class ModeloDatos {
	
	private HashMap<Integer, Estudiante> estudiantesMap;
	
	public ModeloDatos() {
		this.estudiantesMap = new HashMap<Integer, Estudiante>();		
	}
	
	public String registrarEstudiante(Estudiante est) {
		if(!estudiantesMap.containsKey(est.getId())) {
			estudiantesMap.put(est.getId(), est);
			return "OK.";
		} else {
			return "Estudiante existente.";
		}
	}
	
	public Estudiante consultaEstudiante(int id) {
		Estudiante estTemporal = null;
		if(estudiantesMap.containsKey(id)) { 
			estTemporal = estudiantesMap.get(id);
		}
		return estTemporal;
	}
	
	public String imprimirListaEstudiantes() {
		String msj = "DATOS DE ESTUDIANTES: \n";
		for(Estudiante estudiante : estudiantesMap.values()) {
			msj = msj + "Nombre: " + estudiante.getNombre() + ", ID: " + estudiante.getId() + ", Materia: " + estudiante.getMateria() + "\n";
			msj = msj + "Nota #1: " + estudiante.getNota1() + ", Nota #2: " + estudiante.getNota2() + ", ";
			msj = msj + "Nota #3: " + estudiante.getNota3() + ", Promedio: " + estudiante.getPromedio() + "\n\n";
		}
		
		System.out.println(msj);
		return msj;
	}
	
	public String eliminarEstudiante(int id) {
		String mensaje = "No se encontró el estudiante con ID escrito.";
		if(estudiantesMap.containsKey(id)) {
			estudiantesMap.remove(id);
			mensaje = imprimirListaEstudiantes();
		}
		return mensaje;
	}
	
	public String actualizarEstudiante(Estudiante est) {
		String mensaje = null;
		if(estudiantesMap.containsKey(est.getId())) {
			estudiantesMap.put(est.getId(), est);
			return mensaje = imprimirListaEstudiantes();
		} else {
			mensaje = "NO se pudo hacer la actualización.";
		}
		return mensaje;
	}

}
