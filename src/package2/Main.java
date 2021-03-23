package package2;

import java.util.Scanner;

public class Main {
	public static int suma(int numero1, int numero2){
		return numero1+numero2;
	}
	public static int resta(int numero1, int numero2){
		return numero1-numero2;
	}
	public static int multiplicacion(int numero1, int numero2){
		return numero1*numero2;
	}
	public static int division(int numero1, int numero2){
		return numero1/numero2;
	}
		
	public static void main(String [] args){
		
		int respuesta =0;
		Scanner inscan = new Scanner(System.in);
		int condition = 1;
		System.out.println("Bienvenido a mini calculadora");
		while(condition ==1) {
			
			System.out.println("Por favor introduce que operacion harás,");
			System.out.println("Suma(1), Resta(2), Multiplicación(3), Division(4)");
			int operacionint = Integer.parseInt(inscan.nextLine());
			if (operacionint < 5) {
				
				System.out.println("Introduce tu primer numero:");
				int numero1int = Integer.parseInt(inscan.nextLine());
				System.out.println("Introduce tu segundo numero:");
				int numero2int = Integer.parseInt(inscan.nextLine());
				System.out.println(operacionint);
				switch(operacionint){
				
					case 1 :
						respuesta = suma(numero1int,numero2int);
						System.out.println(numero1int+" + "+numero2int+" = "+respuesta);
						break;
					
					case 2 :
						respuesta = resta(numero1int,numero2int);
						System.out.println(numero1int+" - "+numero2int+" = "+respuesta);
						break;
					
					case 3 :
						respuesta = multiplicacion(numero1int,numero2int);	
						System.out.println(numero1int+" x "+numero2int+" = "+respuesta);
						break;
					
					case 4 :
						respuesta = division(numero1int,numero2int);
						System.out.println(numero1int+" ÷ "+numero2int+" = "+respuesta);
						break;
												
				}
				System.out.println("Quieres continuar? Si(1) No(2)");
				int continuarint = Integer.parseInt(inscan.nextLine());
				if (continuarint==1){
					
					System.out.println("continuemos...");
					condition =1;
				}
				else{
					
					System.out.println("Adiós!");
					condition=0;
				}
			}
			else {
				System.out.println("Operación no válida,");
			}
		}
	}
}
