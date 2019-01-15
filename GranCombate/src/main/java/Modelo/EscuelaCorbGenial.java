package Modelo;

public class EscuelaCorbGenial extends Luchador{
	EscuelaCorbGenial(String nombre,double fue, double con, double tam, double des, double per){
		super(nombre,fue,con,tam,des,per);
		setEscuela("Del Corb Genial");
	}
	@Override
	public void calcularPA() {
		setPA(getDES()+getFUE()+getCON()+getPER());
	}
}
