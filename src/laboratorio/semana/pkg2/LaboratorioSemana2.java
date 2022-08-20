/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio.semana.pkg2;

import java.util.Scanner;

/**
 *
 * @author ariel.montoya
 */
public class LaboratorioSemana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dineroSolicitado;
        int dineroCajero=10000;
        int opcion;
        int dineroIngresado;
        int contadorRetirar=0;
        int contadorRecargar=0;
        
        do{
        System.out.println("    MENU");
        System.out.println("0. Salir");
        System.out.println("1. Retirar");
        System.out.println("2. Recargar");
        System.out.println("3. Historial");
        opcion=sc.nextInt();
        
        switch(opcion){
            
            case 1:
        int quinientos=0,doscientos=0,cien=0,cincuenta=0,veinte=0,diez=0,cinco=0,dos=0,uno=0;
        System.out.println("Ingrese la cantidad de dinero");
        dineroSolicitado=sc.nextInt();
        
        if (dineroSolicitado<=dineroCajero){
        contadorRetirar++;
        dineroCajero=dineroCajero-dineroSolicitado;    
            
        while(dineroSolicitado>=500){
           quinientos++;
           dineroSolicitado-=500;
            }
        if(quinientos>=1){
        System.out.println("Son "+quinientos+" billetes de 500");
        System.out.println("Dinero restante "+ dineroSolicitado);}
        
        while(dineroSolicitado>=200){
            doscientos++;
            dineroSolicitado-=200;
        }
            if(doscientos>=1){
        System.out.println("Son "+doscientos+" billetes de 200");
        System.out.println("Dinero restante "+ dineroSolicitado);}
            
        while(dineroSolicitado>=100){
            cien++;
            dineroSolicitado-=100;
        }
        if(cien>=1){
        System.out.println("Son "+cien+" billetes de 100");
        System.out.println("Dinero restante "+ dineroSolicitado);}
        
        while(dineroSolicitado>=50){
            cincuenta++;
            dineroSolicitado-=50;
        }
        if(cincuenta>=1){
        System.out.println("son "+cincuenta+" billetes de 50");
        System.out.println("Dinero restante "+ dineroSolicitado);}
        
        while(dineroSolicitado>=20){
            veinte++;
            dineroSolicitado-=20;
        }
        if(veinte>=1){
        System.out.println("son "+veinte+" billetes de 20");
        System.out.println("Dinero restante "+ dineroSolicitado);}
        
        while(dineroSolicitado>=10){
            diez++;
            dineroSolicitado-=10;
        }
        if(diez>=1){
        System.out.println("son "+diez+" billetes de 10");
        System.out.println("Dinero restante "+ dineroSolicitado);}
        
        while(dineroSolicitado>=5){
            cinco++;
            dineroSolicitado-=5;
        }
        if(cinco>=1){
        System.out.println("son "+cinco+" billetes de 5");
        System.out.println("Dinero restante "+ dineroSolicitado);}
        
        while(dineroSolicitado>=2){
            dos++;
            dineroSolicitado-=2;
        }
        if(dos>=1){
        System.out.println("son "+dos+" billetes de 2");
        System.out.println("Dinero restante "+ dineroSolicitado);}
        
        while(dineroSolicitado>=1){
            uno++;
            dineroSolicitado-=1;
        }
        if(uno>=1){
        System.out.println("son "+uno+" billetes de 1");
        System.out.println("Dinero restante "+ dineroSolicitado);}
        }
        else{
            System.out.println("ERROR NO HAY SUFICIENTES FONDOS EN EL CAJERO");
        }
            break;
            case 2:
            contadorRecargar++;
            System.out.println("Ingrese la cantidad a recargar");
            dineroIngresado=sc.nextInt();
            dineroCajero+=dineroIngresado;
            System.out.println("Hay disponible en el cajero "+ dineroCajero+"\n");        
            break;
            
            case 3:
                System.out.println("\n    Historial");
                System.out.println("Se ha retirado "+contadorRetirar+" veces");
                System.out.println("Se ha recargado "+contadorRecargar+" veces");
         }
        } while (opcion!=0);
    }
}