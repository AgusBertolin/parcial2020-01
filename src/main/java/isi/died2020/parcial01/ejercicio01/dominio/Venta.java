package isi.died2020.parcial01.ejercicio01.dominio;

import java.time.LocalDateTime;

public class Venta {
	private LocalDateTime fecha;
	private Double total;
	
	public Venta(Double tot) {
		this.total = tot;
	}
	
	public Double getTotal() {
		return this.total;
	}
}
