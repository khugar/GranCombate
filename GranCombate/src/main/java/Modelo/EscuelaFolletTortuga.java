package Modelo;

public class EscuelaFolletTortuga extends Luchador{
EscuelaFolletTortuga(String nombre, double fue, double con, double tam, double des, double per){
	super(nombre,fue,con,tam,des,per);
	setEscuela("Del follet Tortuga");
}
@Override
public void calcularPD() {
	setPD((getFUE()+getTAM()+getPER())/4);
}
}
