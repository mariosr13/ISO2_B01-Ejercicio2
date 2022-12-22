package ISO2_B01.Ejercicio2;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws ExcepcionDatos {
		Scanner lectura = new Scanner (System.in);
		int lado1, lado2, lado3;
		int angulo1, angulo2, angulo3;
		
		System.out.println("Introduce el primer lado del triangulo:");
		lado1 = lectura.nextInt();
		System.out.println("Introduce el segundo lado del triangulo:");
		lado2 = lectura.nextInt();
		System.out.println("Introduce el tercer lado del triangulo:");
		lado3 = lectura.nextInt();
		
		System.out.println("Introduce el primer angulo del triangulo:");
		angulo1 = lectura.nextInt();
		System.out.println("Introduce el segundo angulo del triangulo:");
		angulo2 = lectura.nextInt();
		System.out.println("Introduce el terce angulo del triangulo:");
		angulo3 = lectura.nextInt();
		
		Triangulo triangulo=new Triangulo(lado1, lado2, lado3, angulo1, angulo2, angulo3);
		System.out.println(triangulo.CalcularTipoTriangulo());
	}

}
