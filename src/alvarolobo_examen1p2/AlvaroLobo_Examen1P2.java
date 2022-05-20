
package alvarolobo_examen1p2;

import java.util.ArrayList;
import java.util.Scanner;

public class AlvaroLobo_Examen1P2 {
static Scanner lea = new Scanner(System.in);
static ArrayList pc = new ArrayList();
static PCs p = new PCs();

    public static void main(String[] args) {
        
        int opcion = 1;
        while(opcion != 0){
            System.out.println("Menu");
            System.out.println("1. Crud");
            System.out.println("2. Ingresar a PC");
            System.out.println("");
            System.out.print("Opcion: ");
            opcion = lea.nextInt();
            switch(opcion){
                case 1:
                    menu();
                    break;
                case 2:
                    break;
                    
            }
            
        }
    }
    
    static public void menu(){
        System.out.println("");
        System.out.println("CRUD");
        System.out.println("");
        System.out.println("1. Agregar PC ");
        System.out.println("2. Eliminar");
        System.out.println("3. Listar");
        System.out.println("");
        System.out.print("Opcion: ");
        int opcion = lea.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("");
                System.out.print("Direccion ip: ");
                lea.nextLine();
                String ip = lea.nextLine();
                System.out.print("Mascara: ");
                String mascara = lea.nextLine();
                System.out.print("Hostname: ");
                String hostname = lea.nextLine();
                menu2(ip, mascara, hostname);
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }
    
    static public void menu2(String ip, String mascara, String hostname){
        System.out.println("");
        System.out.println("Tipo de Computadora");
        System.out.println("1. Laptop");
        System.out.println("2. Escritorio");
        System.out.println("");
        System.out.print("opcion: ");
        int opcion = lea.nextInt();
        
        if (opcion == 1) {
            System.out.print("Marca: ");
            lea.nextLine();
            String marca = lea.nextLine();
            System.out.print("Definicion: ");
            String res = lea.nextLine();
            System.out.print("Tiene RGB: ");
            boolean rgb = lea.nextBoolean();
            System.out.println(marca+" "+res);
            Laptop p = new Laptop(marca, res, rgb, ip, mascara, hostname);
            pc.add(p);
            System.out.println(pc);

        }
    }
    
    
}
