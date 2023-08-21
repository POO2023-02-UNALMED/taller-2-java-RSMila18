package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int nuevoregistro) {
		registro = nuevoregistro;
	}
	
	void asignarTipo (String nuevotipo) {
		switch(nuevotipo) {
		case "electrico":
			tipo = "electrico";
		case "gasolina":
			tipo = "gasolina";
		default:
			break;
		}
	}
}
