package Modelo;

public class EscuelaNamec extends Luchador{
EscuelaNamec(String nombre,double fue, double tam,double con, double des, double per){
	super(nombre,fue, con,tam, des, per);
	setEscuela("de Namec");
}
@Override
public void calcularPR() {
	setPR(getCON()+getTAM()+getPER());
}
}
