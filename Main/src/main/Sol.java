package main;

import java.util.Scanner;

public class Sol {
private Scanner sc=new Scanner(System.in);
	
	private int t;
	private boolean jugando=true;
	boolean error=false;
	private int combustible=400;
	private int oxigeno=80;
	private int comida=80;
	private int vidanave=850;
	private int agua=50;
	
	public void sol_estado(int turno) {
		System.out.println("\n////////////////☀ SOL ☀////////////////");
		System.out.println("| TURNO: "+turno+"/20");
		System.out.println("|");
		System.out.println("| COMBUSTIBLE "+combustible+"/400");
		System.out.println("| O₂:    "+oxigeno+"/80");
		System.out.println("| COMIDA:"+comida+"/80");
		System.out.println("| VIDA  :"+vidanave+"/850");
		System.out.println("| Agua  :"+agua+" /50");
		System.out.println("|");
		System.out.println("////////////////☀ SOL ☀////////////////\n");
	}
	public int[] Evento1() {
		do {
			
			error=false;
			System.out.println("\n////////////////☀ SOL ☀////////////////");
			System.out.println("|     EVENTO! INCENDIO EN LA CABINA"); 
			System.out.println("|");     
			System.out.println("| Combustible -80"); 
			System.out.println("| O₂ -15 ");
			System.out.println("| Vida -300hp");
			System.out.println("|");
			System.out.println("| 1. Ignorar (vida-200hp/oxigeno-15)");
			System.out.println("| 2. Apagar  (vida+150hp/agua-20)");
			System.out.println("| 3. Enviar otro tripulante  (vida+100hp/comida-30/agua-10)");
			System.out.println("| 4. Rendirse (vida-1000hp)");
			System.out.println("|");
			System.out.println("////////////////☀ SOL ☀////////////////\n");
			t=sc.nextInt();
			switch (t) {
			
			case 1:
				oxigeno-=30;
				combustible-=80;
				vidanave-=500;
				System.out.println("-- Ignoraste el incendio (daños graves) --");
				break;
			case 2:
				oxigeno-=15;
				combustible-=80;
				agua-=20;
				vidanave-=150;
				System.out.println("-- Apagaste el incendio con exito! --");
				break;
			case 3:
				oxigeno-=15;
				combustible-=80;
				comida-=30;
				agua-=10;
				vidanave-=200;
				System.out.println("-- Enviaste un tripulante --");
				break;
			case 4:
				System.out.println("-- Te has rendido :( --");
				vidanave=0;
				break;
			default:
				System.out.println("Opcion no valida.");
				error=true;
			}
		}while(error);
		return new int[]{combustible,oxigeno,comida,vidanave,agua};
	}
	public int[] Evento2() {
		do {
			System.out.println("\n////////////////☀ SOL ☀////////////////");
			System.out.println("|   EVENTO! ALGO HA IMPACTADO LA NAVE");
			System.out.println("|");  
			System.out.println("| Combustible -80"); 
			System.out.println("| O₂ -20"); 
			System.out.println("| Vida -300hp");  
			System.out.println("|");
			System.out.println("| 1. Ignorar (O₂-30)");
			System.out.println("| 2. Reparar  (agua-10/comida-40/vida+200hp)");
			System.out.println("| 3. Enviar otro tripulante (comida-20/vida+100hp)");
			System.out.println("| 4. Rendirse (vida-1000hp)");
			System.out.println("|");
			System.out.println("////////////////☀ SOL ☀////////////////\n");
			t=sc.nextInt();
			switch (t) {
			case 1:
				combustible-=80;
				oxigeno-=50;
				vidanave-=300;
				System.out.println("-- Ignoraste el golpe (daños graves) --");
				break;
			case 2:
				oxigeno-=20;
				combustible-=80;
				vidanave-=100;
				comida-=40;
				agua-=10;
				System.out.println("-- Lo reparaste con exito! --");
				break;
			case 3:
				vidanave-=200;
				oxigeno-=20;
				combustible-=80;
				comida-=20;
				System.out.println("-- Enviaste un tripulante --");
				break;
			case 4:
				System.out.println("-- Te has rendido :( --");
				vidanave=0;
				break;
			default:
				System.out.println("Opcion no valida.");
				error=true;
			}
		}while(error);
		return new int[]{combustible,oxigeno,comida,vidanave,agua};
	}
	public int[] Evento3() {
		do {
			System.out.println("\n////////////////☀ SOL ☀///////////////");
			System.out.println("|     EVENTO! PERDIDA DE COMBUSTIBLE");
			System.out.println("|");  
			System.out.println("| Combustible -100"); 
			System.out.println("| O₂ -15");  
			System.out.println("|");
			System.out.println("| 1. Ignorar (combustible-150)");
			System.out.println("| 2. Reparar  (agua-20/comida-10)");
			System.out.println("| 3. Enviar otro tripulante (comida-30)");
			System.out.println("| 4. Rendirse (vida-1000hp)");
			System.out.println("|");
			System.out.println("////////////////☀ SOL ☀///////////////\n");
			t=sc.nextInt();

			switch (t) {
			case 1:
				oxigeno-=15;
				combustible-=250;
				System.out.println("-- Ignoraste la perdida (estado critico) --");
				break;
			case 2:
				oxigeno-=15;
				combustible-=100;
				comida-=10;
				agua-=20;
				System.out.println("-- Lo reparaste con exito! --");
				break;
			case 3:
				oxigeno-=15;
				combustible-=100;
				comida-=30;
				System.out.println("-- Enviaste un tripulante --");
				break;
			case 4:
				System.out.println("--Te has rendido :(--");
				vidanave=0;
				break;
			default:
				System.out.println("Opcion no valida.");
				error=true;
			}
		}while(error);
		return new int[]{combustible,oxigeno,comida,vidanave,agua};
	}
	public int[] Evento4() {
		do {
			System.out.println("\n////////////////☀ SOL ☀////////////////");
			System.out.println("|     EVENTO! PAQUETE DE RECURSOS");
			System.out.println("|");  
			System.out.println("| Combustible -50"); 
			System.out.println("| O₂ -10");  
			System.out.println("|");
			System.out.println("| 1.Aceptar (agua+20/combustible+100)");
			System.out.println("| 2.Rechazar (vida+200)");
			System.out.println("| 3.Aceptar una parte(comida+10 & vida+100)");
			System.out.println("| 4.Rendirse (vida-1000hp)");
			System.out.println("|");
			System.out.println("////////////////☀ SOL ☀////////////////\n");

			t=sc.nextInt();
			switch (t) {
			case 1:
				combustible+=50;
				oxigeno-=10;
				agua+=20;
				System.out.println("-- Aceptaste el paquete de recursos --");
				break;
			case 2:
				combustible-=50;
				oxigeno-=10;
				vidanave+=200;
				System.out.println("-- Rechazaste el paquete! --");
				break;
			case 3:
				oxigeno-=10;
				vidanave+=100;
				comida+=10;
				System.out.println("-- Aceptaste una parte! --");
				break;
			case 4:
				System.out.println("Te has rendido :(");
				vidanave=0;
				break;
			default:
				System.out.println("Opcion no valida.");
				error=true;
			}
		}while(error);
		return new int[]{combustible,oxigeno,comida,vidanave,agua};
	}
	public int[] Evento5() {
		do {
			System.out.println("\n////////////////☀ SOL ☀///////////////");
			System.out.println("|     EVENTO! ESTACION ESPACIAL");
			System.out.println("|"); 
			System.out.println("| O₂ +50");  
			System.out.println("|");
			System.out.println("| 1. Combustible (combustible+200)");
			System.out.println("| 2. Provisiones (comida+30/agua+20)");
			System.out.println("| 3. Reparar (vida+350)");
			System.out.println("| 4. Rendirse (vida-1000hp)");
			System.out.println("|");
			System.out.println("////////////////☀ SOL ☀///////////////\n");
			t=sc.nextInt();

			switch (t){
			case 1:
				combustible+=200;
				oxigeno+=50;
				System.out.println("-- Aumentaste el combustibnle! --");
				break;
			case 2:
				oxigeno+=50;
				comida+=30;
				agua+=20;
				System.out.println("-- Aumentaste las provisiones! --");
				break;
			case 3:
				oxigeno+=50;
				vidanave+=350;
				System.out.println("-- Reparaste la nave! --");
				break;
			case 4:
				System.out.println("-- Te has rendido :( --");
				vidanave=0;
				jugando=false;
				break;
			default:
				System.out.println("Opcion no valida.");
				error=true;
			}

		}while(error);
	
		return new int[]{combustible,oxigeno,comida,vidanave,agua};
	}

}
