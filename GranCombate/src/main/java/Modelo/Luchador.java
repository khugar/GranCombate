package Modelo;

public class Luchador {
	
	private String nombre;
	private String escuela;
	
	//Caracter�sticas primarias
	private double FUE; //Fuerza
	private double CON; //Constituci�n
	private double TAM; //Tama�o
	private double DES; //Destreza
	private double PER; //Personalidad
	
	//Caracter�sticas secundarias;
	private double PR; //Puntos de resistencia
	private double PD; //Puntos de da�o
	private double PA; //Probabilidad de atacar
	private double PE;  //Probabilidad de esquivar
	
	public Luchador(String nombre, double FUE, double CON, double TAM, double DES, double PER){
		
		this.setNombre(nombre);
		
		//Caracter�sticas primarias
		this.setFUE(FUE); //Fuerza
		this.setCON(CON); //Constituci�n
		this.setTAM(TAM); //Tama�o
		this.setDES(DES); //Destreza
		this.setPER(PER); //Personalidad
		this.escuela = "Ninguna.";
	}
	
	//Calcular caracter�sticas secundarias.
	
	public void calcularPR() {
		this.PR = CON + TAM; //Puntos de resistencia
	}
	
	public void calcularPD() {
		this.PD = (FUE + TAM) / 4; //Puntos de da�o
	}
	
	public void calcularPA() {
		this.PA = DES + FUE + CON; //Probabilidad de atacar
	}
	
	public void calcularPE() {
		this.PE = DES * 3;  //Probabilidad de esquivar
	}
	
	//Getters and Setters
	
	public void setPR(double pr) {
		this.PR=pr;
	}
	public void setPD(double pd) {
		this.PD=pd;
	}
	public void setPA(double pa) {
		this.PA=pa;
	}
	public void setPE(double pe) {
		this.PE=pe;
	}

	public double getFUE() {
		return FUE;
	}

	public void setFUE(double fUE) {
		FUE = fUE;
	}

	public double getCON() {
		return CON;
	}

	public void setCON(double cON) {
		CON = cON;
	}

	public double getTAM() {
		return TAM;
	}

	public void setTAM(double tAM) {
		TAM = tAM;
	}

	public double getDES() {
		return DES;
	}

	public void setDES(double dES) {
		DES = dES;
	}

	public double getPER() {
		return PER;
	}

	public void setPER(double pER) {
		PER = pER;
	}

	public double getPR() {
		return PR;
	}

	public double getPD() {
		return PD;
	}

	public double getPA() {
		return PA;
	}

	public double getPE() {
		return PE;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEscuela(String escuela) {
		this.escuela=escuela;
	}
	public String getEscuela() {
		return escuela;
	}
	
	public void calcSecundarias() {
		calcularPR();
		calcularPD();
		calcularPA();
		calcularPE();
	}
	public String toString() {
		return("Luchador: "+getNombre()+"\n Escuela: "+getEscuela()+"\n --Caracteristicas Generales--"+"\n FUE ="+getFUE()+
				", CON ="+getCON()+", TAM = "+getTAM()+", DES = "+getDES()+", PER = "+getPER()+"\n --Carateristicas Secundarias--"+
				"\n PR = "+getPR()+", PD = "+getPD()+", PA (%) = "+getPA()+", PE (%) = "+getPE());
	}
	public void increPER() {
		this.PER+=1;
	}
}
