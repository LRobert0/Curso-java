package package2;

import java.util.Scanner;

public class Main {
	
	public static void main(String [] args){
		/*
		int notas [] = {5,5,8,6,3,4};
		int respuesta =0;
		
		for (int i=0; i< notas.length; i++) {
			respuesta = respuesta+notas[i];
			
			
		}
		float respuestaf = (float)respuesta/6;
		System.out.println(respuestaf);
		*/
		int condition = 1;
		System.out.println("Bienvenido a mini calculadora");
		while(condition ==1) {
			System.out.println("Por favor introduce que operacion harás,");
			System.out.println("Suma(1), Resta(2), Multiplicación(3), Division(4)");
			Scanner inscan = new Scanner(System.in);
			var operacion = inscan.nextLine();
			int operacionint = Integer.parseInt(operacion);
			if (operacionint==1) {
				System.out.println("Introduce tu primer numero:");
				var numero1 = inscan.nextLine();
				int numero1int = Integer.parseInt(numero1);
				System.out.println("Introduce tu segundo numero:");
				var numero2 = inscan.nextLine();
				int numero2int = Integer.parseInt(numero2);
				int respuesta = numero1int+numero2int;
				System.out.println(numero1+" + "+numero2+" = "+respuesta);
				System.out.println("Quieres continuar? Si(1) No(2)");
				var continuar = inscan.nextLine();
				int continuarint = Integer.parseInt(continuar);
				if (continuarint==1)
				{
					System.out.println("continuemos...");
					condition =1;
				}
				else
				{
					System.out.println("adiós!");
					condition=0;
				}
			}
			else
			{
				if (operacionint==2) {
					System.out.println("Introduce tu primer numero:");
					var numero1 = inscan.nextLine();
					int numero1int = Integer.parseInt(numero1);
					System.out.println("Introduce tu segundo numero:");
					var numero2 = inscan.nextLine();
					int numero2int = Integer.parseInt(numero2);
					int respuesta = numero1int-numero2int;
					System.out.println(numero1+" - "+numero2+" = "+respuesta);
					System.out.println("Quieres continuar? Si(1) No(2)");
					var continuar = inscan.nextLine();
					int continuarint = Integer.parseInt(continuar);
					if (continuarint==1)
					{
						System.out.println("continuemos...");
						condition =1;
					}
					else
					{
						System.out.println("adiós!");
						condition=0;
					}
				}
				else
				{
					if (operacionint==3) {
						System.out.println("Introduce tu primer numero:");
						var numero1 = inscan.nextLine();
						int numero1int = Integer.parseInt(numero1);
						System.out.println("Introduce tu segundo numero:");
						var numero2 = inscan.nextLine();
						int numero2int = Integer.parseInt(numero2);
						int respuesta = numero1int*numero2int;
						System.out.println(numero1+" x "+numero2+" = "+respuesta);
						System.out.println("Quieres continuar? Si(1) No(2)");
						var continuar = inscan.nextLine();
						int continuarint = Integer.parseInt(continuar);
						if (continuarint==1)
						{
							System.out.println("continuemos...");
							condition =1;
						}
						else
						{
							System.out.println("adiós!");
							condition=0;
						}
					}
					else
					{
						if (operacionint==4) {
							System.out.println("Introduce tu primer numero:");
							var numero1 = inscan.nextLine();
							int numero1int = Integer.parseInt(numero1);
							System.out.println("Introduce tu segundo numero:");
							var numero2 = inscan.nextLine();
							float numero1f=Float.parseFloat(numero1);  
							float numero2f=Float.parseFloat(numero2);  
							float respuesta = numero1f/numero2f;
							System.out.println(numero1+" ÷ "+numero2+" = "+respuesta);
							System.out.println("Quieres continuar? Si(1) No(2)");
							var continuar = inscan.nextLine();
							int continuarint = Integer.parseInt(continuar);
							if (continuarint==1)
							{
								System.out.println("continuemos...");
								condition =1;
							}
							else
							{
								System.out.println("adiós!");
								condition=0;
							}
						}
						else
						{
							System.out.println("Operacion no valida,");
						}
					}
				}
			}
		}
		
	}
}
