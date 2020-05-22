package isi.died2020.parcial01.ejercicio01.dominio;

import java.time.Month;

public class ReciboSueldo {
	private Month mes;
	private Integer numero;
	private Empleado empleado;
	private Double total;
	
	public ReciboSueldo(int n, Month m, Empleado emp, Double tot) {
		this.numero = n;
		this.mes = m;
		this.empleado = emp;
		this.total = tot;
	}
	
}

