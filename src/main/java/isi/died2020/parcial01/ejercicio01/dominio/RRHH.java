package isi.died2020.parcial01.ejercicio01.dominio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RRHH {
	public List<ReciboSueldo> obtenerSueldo(ArrayList<Empleado> emp){
		List<ReciboSueldo> aux = new ArrayList<ReciboSueldo>();
		for(int i = 0; i < emp.size(); i++) {
			aux.add(new ReciboSueldo(i, LocalDateTime.now().getMonth(), emp.get(i), emp.get(i).sueldo()));
		}
		
		return aux;
	}
}
