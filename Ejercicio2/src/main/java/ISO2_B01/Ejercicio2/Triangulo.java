package ISO2_B01.Ejercicio2;

public class Triangulo {
	private int lado1;
	private int lado2;
	private int lado3;
	private int angulo1;
	private int angulo2;
	private int angulo3;
	
	public Triangulo(int lado_1, int lado_2, int lado_3, int angulo_1, int angulo_2, int angulo_3) {
		lado1=lado_1;
		lado2=lado_2;
		lado3=lado_3;
		angulo1=angulo_1;
		angulo2=angulo_2;
		angulo3=angulo_3;
	}
	
	
	public String CalcularTipoTriangulo() throws ExcepcionDatos{
		String lados = null, angulos = null;
		boolean isTriangulo=true;
		boolean es=true;
		
		if(!( Character.isDigit(lado1) && Character.isDigit(lado2) && 
				Character.isDigit(lado3)  &&  Character.isDigit(angulo1)
					&& Character.isDigit(angulo2) && Character.isDigit(angulo3))) { 
			throw new ExcepcionDatos("Los lados y �ngulos del triangulo deben de ser enteros.");
		}
		
		if(!( lado1>0 && lado2>0 && lado3>0  && (angulo1>0 && angulo1<180) 
					&& (angulo2>0 && angulo2<180) && (angulo3>0 && angulo3<180))) { 
			throw new ExcepcionDatos("Los lados y �ngulos del triangulo deben de ser positivos.");
		}
		
		
		
		if(lado1>lado2 && lado1>lado3) {
			if(lado2+lado3<=lado1) isTriangulo=false;
		}else if(lado2>lado1 && lado2>lado3) {
				if(lado1+lado3<=lado2) isTriangulo=false;
			  }else if(lado3>lado1 && lado3>lado2) 
				  		if(lado1+lado2<=lado3)isTriangulo=false;
		
		if(!isTriangulo) {
			es=false;
		}else {
			if(lado1==lado2 && lado1==lado3 && lado2==lado3) {
				lados= "Equilatero";
			}else {
				if((lado1==lado2 && lado1!=lado3) || (lado1==lado3 && lado1!=lado2) || (lado2==lado3 && lado2!=lado1)) {
					lados= "Is�sceles";
				}else {
					lados= "Escaleno";
				}
			}
		}
		
		if((angulo1+angulo2+angulo3) != 180) {
			es=false;
		}else {
			if(angulo1==90 || angulo2==90 || angulo3==90) {
				angulos= "Rectangulo";
			}else {
				if(angulo1>90 || angulo2> 90 || angulo3>90) {
					angulos= "Obstusangulo";
				}else {
					angulos= "Acutangulo";
				}
			}
		}
		
		if(!es || (lados=="Equilatero" && (angulos=="Rectangulo" || angulos=="Obstusangulo") ) ) {
			return "No es un triangulo";
		}else return "El triangulo es "+lados+" por sus lados y "+angulos+" por sus angulos.";
		
	}
	
}
