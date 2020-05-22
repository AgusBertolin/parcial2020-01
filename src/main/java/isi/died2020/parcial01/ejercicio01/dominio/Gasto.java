package isi.died2020.parcial01.ejercicio01.dominio;

public class Gasto {
	private Integer nroComprobante;
	private String descripcion;
	private Double totalGasto;
	
	public Gasto(Double tot) {
		this.totalGasto = tot;
	}
	public Double getTotal() {
		return this.totalGasto;
	}
}
