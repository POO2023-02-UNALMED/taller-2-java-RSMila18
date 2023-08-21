package test;

public class Asiento {
	String color;
	int precio;
	int registro;
	
	void cambiarColor (String nuevocolor) {
		switch (nuevocolor) {
		case "rojo":
			color = "rojo";
			
		case "verde":
			color = "verde";
		
		case "amarillo":
			color = "amarillo";
		
		case "negro":
			color = "negro";
		
		case "blanco":
			color = "blanco";
			
		default:
			break;
		}
	}
}
