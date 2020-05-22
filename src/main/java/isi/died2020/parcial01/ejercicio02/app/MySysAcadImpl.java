package isi.died2020.parcial01.ejercicio02.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import isi.died2020.parcial01.ejercicio02.db.BaseDeDatos;
import isi.died2020.parcial01.ejercicio02.db.BaseDeDatosExcepcion;
import isi.died2020.parcial01.ejercicio02.dominio.*;
import isi.died2020.parcial01.ejercicio02.dominio.Inscripcion.Estado;


public class MySysAcadImpl implements MySysAcad {
	private static final BaseDeDatos DB = new BaseDeDatos();


	private List<Materia> materia = new ArrayList<Materia>();
	
	private class MyException extends Exception {

	    public MyException(String msg) {
	        super(msg);
	    }
	    
	}
	
	@Override
	public void registrarMateria(Materia d) {
		this.materia.add(d);
	}
	
	private List<Docente> docentes = new ArrayList<Docente>();
	
	@Override
	public void registrarDocente(Docente d) {
		this.docentes.add(d);
	}
	
	private List<Alumno> alumnos = new ArrayList<Alumno>();
	
	@Override
	public void registrarAlumnos(Alumno d) {
		this.alumnos.add(d);
	}
	

	@Override
	public void inscribirAlumnoCursada(Docente d, Alumno a, Materia m, Integer cicloLectivo) {
		Inscripcion insc = new Inscripcion(cicloLectivo,Inscripcion.Estado.CURSANDO);
		// DESCOMENTAR Y gestionar excepcion
		
		try {
			List<Inscripcion> aux = a.getMaterias().stream().filter(x -> x.getMateria().equals(m)).collect(Collectors.toList());
			if(!aux.isEmpty() && aux.get(0).getEstado() != Estado.LIBRE) throw new MyException("Materia en estado distinto de libre");
			else {
				d.agregarInscripcion(insc);
				a.addCursada(insc);
				m.addInscripcion(insc);
				DB.guardar(insc);
			}
		} catch (BaseDeDatosExcepcion e) {
			e.printStackTrace();
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void inscribirAlumnoExamen(Docente d, Alumno a, Materia m) {
		Examen e = new Examen();
		a.addExamen(e);
		d.agregarExamen(e);
		m.addExamen(e);
		// DESCOMENTAR Y gestionar excepcion
		// DB.guardar(e);
	}
	

}
