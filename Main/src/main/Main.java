package main;
import java.util.Scanner;
import java.util.Random;

public class Main {
	
	
	public static void carga() {
		esperar(2000);
		System.out.println("Cargando..........3");
		esperar(1000);
		System.out.println("..................2");
		esperar(1000);
		System.out.println("..................1");
		esperar(1000);
	}
		public static void esperar(int tiempo) {
			try {
				Thread.sleep(tiempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		public static void main(String[]args) {
			
			Scanner sc=new Scanner(System.in);
			Random rm=new Random();
			Lun luna=new Lun();
			Venus ven=new Venus();
				Marte mar=new Marte();
				Jupiter jup=new Jupiter();
			Sol sol=new Sol();
			int sel1=0;
			int turno=0;
			boolean activo=true;
			int estado[]= {0,0,0,0,0};
			
			do {
			System.out.println("Bienvenido a solar game, ingrese la mision que desee jugar.");
			System.out.println("1. Luna");
			System.out.println("2. Marte ");
			System.out.println("3. Venus ");
			System.out.println("4. Jupiter");
			System.out.println("5. Sol");
			System.out.println("6. Cerrar");
			
			System.out.println("\nReglas:");
			System.out.println("--Ganas al pasar todos los turnos.");
			System.out.println("--Si algun elemento o recurso de la nave llega a 0 pierdes.\n");
			
			sel1=sc.nextInt();
			activo=true;
			switch (sel1) {
			case 1:
				
				for (turno=1;turno<=5 && activo;turno++) {
							
					int ev=rm.nextInt(5)+1;
					luna.Luna_estado(turno);
					carga();
					
					switch (ev) {
					case 1:
						estado=luna.Evento1();
						carga();
						break;
					case 2:
						estado=luna.Evento2();
						carga();
						break;
					case 3:
						estado=luna.Evento3();
						carga();
						break;
					case 4:
						estado=luna.Evento4();
						carga();
						break;
					case 5:
						estado=luna.Evento5();
						carga();
						break;
					}
					if(estado[0]<=0 || estado[1]<=0 || estado[2]<=0 || estado[3]<=0 || estado[4]<=0) {
						System.out.println("\n--- ESTADISTICAS FINALES ---\n");	
						carga();
						luna.Luna_estado(turno);	
						System.out.println("\n--- HAS PERDIDO LA MISION :( ---\n");
						activo=false;
						carga();
					}
				}
				if (activo) {
					System.out.println("\n===== MISION CUMPLIDA :) =====\n");
			carga();
				}
				break;
			case 2:
				for (turno=1;turno<=8 && activo;turno++) {
					
					int ev=rm.nextInt(5)+1;
					mar.marte_estado(turno);
					carga();
					
					switch (ev) {
					case 1:
						estado=mar.Evento1();
						carga();
						break;
					case 2:
						estado=mar.Evento2();
						carga();
						break;
					case 3:
						estado=mar.Evento3();
						carga();
						break;
					case 4:
						estado=mar.Evento4();
						carga();
						break;
					case 5:
						estado=mar.Evento5();
						carga();
						break;
					}
					if(estado[0]<=0 || estado[1]<=0 || estado[2]<=0 || estado[3]<=0 || estado[4]<=0) {
						mar.marte_estado(turno);
						System.out.println("\n--- ESTADISTICAS FINALES ---\n");	
						carga();
						ven.venus_estado(turno);	
						System.out.println("\n--- HAS PERDIDO LA MISION :( ---\n");
						activo=false;
						carga();
					}
				}
				if (activo) {
					System.out.println("\n===== MISION CUMPLIDA :) =====\n");
			carga();
				}
				break;
			case 3:

				for (turno=1;turno<=14 && activo;turno++) {
							
					int ev=rm.nextInt(5)+1;
					ven.venus_estado(turno);
					carga();
					
					switch (ev) {
					case 1:
						estado=ven.Evento1();
						carga();
						break;
					case 2:
						estado=ven.Evento2();
						carga();
						break;
					case 3:
						estado=ven.Evento3();
						carga();
						break;
					case 4:
						estado=ven.Evento4();
						carga();
						break;
					case 5:
						estado=ven.Evento5();
						carga();
						break;
					}
					if(estado[0]<=0 || estado[1]<=0 || estado[2]<=0 || estado[3]<=0 || estado[4]<=0) {
						System.out.println("\n--- ESTADISTICAS FINALES ---\n");	
						carga();
						ven.venus_estado(turno);				
						System.out.println("\n--- HAS PERDIDO LA MISION :( ---\n");
						activo=false;
						carga();
					}
				}
				if (activo) {
					System.out.println("\n===== MISION CUMPLIDA :) =====\n");
			carga();
				}
				break;
			case 4:

				for (turno=1;turno<=14 && activo;turno++) {
							
					int ev=rm.nextInt(5)+1;
					jup.jup_estado(turno);
					carga();
					
					switch (ev) {
					case 1:
						estado=jup.Evento1();
						carga();
						break;
					case 2:
						estado=jup.Evento2();
						carga();
						break;
					case 3:
						estado=jup.Evento3();
						carga();
						break;
					case 4:
						estado=jup.Evento4();
						carga();
						break;
					case 5:
						estado=jup.Evento5();
						carga();
						break;
					}
					if(estado[0]<=0 || estado[1]<=0 || estado[2]<=0 || estado[3]<=0 || estado[4]<=0) {
						System.out.println("\n--- ESTADISTICAS FINALES ---\n");	
						carga();
						jup.jup_estado(turno);				
						System.out.println("\n--- HAS PERDIDO LA MISION :( ---\n");
						activo=false;
						carga();
					}
				}
				if (activo) {
					System.out.println("\n===== MISION CUMPLIDA :) =====\n");
			carga();
				}
				break;

			case 5:
				for (turno=1;turno<=20 && activo;turno++) {
					
					int ev=rm.nextInt(5)+1;
					sol.sol_estado(turno);
					carga();
					
					switch (ev) {
					case 1:
						estado=sol.Evento1();
						carga();
						break;
					case 2:
						estado=sol.Evento2();
						carga();
						break;
					case 3:
						estado=sol.Evento3();
						carga();
						break;
					case 4:
						estado=sol.Evento4();
						carga();
						break;
					case 5:
						estado=sol.Evento5();
						carga();
						break;
					}
					if(estado[0]<=0 || estado[1]<=0 || estado[2]<=0 || estado[3]<=0 || estado[4]<=0) {
						System.out.println("\n--- ESTADISTICAS FINALES ---\n");	
						carga();
						sol.sol_estado(turno);				
						System.out.println("\n--- HAS PERDIDO LA MISION :( ---\n");
						activo=false;
						carga();
					}
				}
				if (activo) {
					System.out.println("\n===== MISION CUMPLIDA :) =====\n");
			carga();
				}
				break;
			case 6:
				System.out.println("-- Gracias por jugar :) --");
				break;
			default:
				System.out.println("Opcion no valida.");
				break;
			}
			}while(sel1 !=6);
			sc.close();
		}
}
