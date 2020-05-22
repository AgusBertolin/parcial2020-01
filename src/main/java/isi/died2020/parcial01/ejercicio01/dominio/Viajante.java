package isi.died2020.parcial01.ejercicio01.dominio;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Viajante extends Empleado{
	private ArrayList<Gasto> gastos;
	private ArrayList<Venta> ventas;
 
	public Viajante(Double s, LocalDateTime f) {
		this.gastos = new ArrayList<Gasto>();
		this.ventas = new ArrayList<Venta>();
		this.sueldoBasico = s;
		this.fechaIngreso = f;
		
	}
	
	public void agregarVenta(Venta v) {
		this.ventas.add(v);
	}
	
	public void agregarGasto(Gasto v) {
		this.gastos.add(v);
	}
	
	public Double sueldo() {
		Double aux = 0d;
		for(int i = 0; i < this.ventas.size(); i++) {
			aux += this.ventas.get(i).getTotal();
		}
		
		aux *= 0.15;
		
		for(int i = 0; i < this.gastos.size(); i++) {
			aux += this.gastos.get(i).getTotal();
		}
		
		return aux;
	}
	
	public Double getTotalVentas() {
		Double aux = 0d;
		for(int i = 0; i < this.ventas.size(); i++) {
			aux += this.ventas.get(i).getTotal();
		}
		return aux + this.aniversario();
	}
}

