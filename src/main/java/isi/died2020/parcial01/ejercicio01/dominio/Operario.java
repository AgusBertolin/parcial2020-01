package isi.died2020.parcial01.ejercicio01.dominio;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Operario extends Empleado{
	private ArrayList<Viajante> viajantesAsignados;
	
	
	public Operario(Double s, LocalDateTime f) {
		this.viajantesAsignados = new ArrayList<Viajante>();
		this.sueldoBasico = s;
		this.fechaIngreso = f;
		
	}
	
	public Double sueldo() {
		Double aux = 0d;
		
		for(int i = 0; i < this.viajantesAsignados.size(); i++) {
			aux += this.viajantesAsignados.get(i).getTotalVentas();
		}
		
		aux *= 0.05;
		
		return aux + this.sueldoBasico + this.aniversario();
	}
	
	public void agregar(Viajante v) {
		this.viajantesAsignados.add(v);
	}
	
}
