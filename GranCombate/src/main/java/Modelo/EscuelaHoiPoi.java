package Modelo;

public class EscuelaHoiPoi extends Luchador{
	EscuelaHoiPoi(String nombre, double fue, double con, double tam, double des, double per){
		super(nombre,fue,con,tam,des,per);
	}
	@Override
	public void calcularPE() {
		setPE(getDES()*3+getPER());
	}
}
