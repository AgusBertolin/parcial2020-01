package isi.died2020.parcial01.ejercicio01.dominio;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.junit.Test;

import com.sun.tools.javac.util.List;

public class TestRRHH {

	@Test
	public void testObtenerSueldo() {
		Venta v1 = new Venta(123.6);
		Venta v2 = new Venta(623.7);
		Gasto g1 = new Gasto(523.3);
		Gasto g2 = new Gasto(23.4);
		
		RRHH r1 = new RRHH();
		
		Operario o1 = new Operario(2034.4, LocalDateTime.now());
		Operario o2 = new Operario(2000.0, LocalDateTime.now());
		
		Viajante via1 = new Viajante(124.3, LocalDateTime.now());
		Viajante via2 = new Viajante(2356.46, LocalDateTime.now());
		
		via1.agregarGasto(g2);
		via1.agregarVenta(v1);
		
		via2.agregarVenta(v2);
		via2.agregarVenta(v1);
		via2.agregarGasto(g1);
		
		o1.agregar(via1);
		o1.agregar(via2);
		
		ArrayList<Empleado> aux = new ArrayList<Empleado>();
		aux.add(o1);
		aux.add(o2);
		
		List<ReciboSueldo> a = r1.obtenerSueldo(aux);
		
		
	}

}
