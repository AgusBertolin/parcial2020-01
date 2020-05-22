package isi.died2020.parcial01.ejercicio01.dominio;

import java.time.LocalDateTime;

public abstract class Empleado {
	public Integer cuil;
	public String nombre;
	public String apellido;
	public LocalDateTime fechaIngreso;
	public Double sueldoBasico;
	
	public abstract Double sueldo();
	
	public final Double aniversario() {
		if(this.fechaIngreso.getMonth() == LocalDateTime.now().getMonth() && this.fechaIngreso.getYear() != LocalDateTime.now().getYear()) {
			return this.sueldoBasico * 0.5;
		}
		
		return 0.0;
	}
}
