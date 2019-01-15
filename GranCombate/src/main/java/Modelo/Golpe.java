package Modelo;

public class Golpe {
	
private boolean golpea;
private int tirada;
private float extra;

public boolean isGolpea() {
	return golpea;
}

public int getTirada() {
	return tirada;
}

public float getExtra() {
	return extra;
}



public Golpe(boolean golpea, int tirada, float extra) {
	this.golpea= golpea;
	this.tirada=tirada;
	this.extra=extra;
}


}
