package alvarolobo_examen1p2;

import java.util.ArrayList;
import java.util.Scanner;

public class AlvaroLobo_Examen1P2 {

    static Scanner lea = new Scanner(System.in);
    static ArrayList<PCs> pc = new ArrayList();
    static PCs p = new PCs();

    public static void main(String[] args) {

        int opcion = 1;
        while (opcion != 0) {
            System.out.println("Menu");
            System.out.println("1. Crud");
            System.out.println("2. Ingresar a PC");
            System.out.println("");
            System.out.print("Opcion: ");
            opcion = lea.nextInt();
            switch (opcion) {
                case 1:
                    menu();
                    break;
                case 2:
                    consola();
                    break;

            }

        }
    }

    //case 2
    static public void consola() {
        String opcion = "";
        System.out.println("PCs: ");
        if (pc.size() >= 0) {
            for (int i = 0; i < pc.size(); i++) {
                System.out.println("");
                System.out.println(i + " - Hostname: " + pc.get(i).getHostname());
                System.out.println("  - Ip: " + pc.get(i).getIp());
                System.out.println("");
            }
        }
        System.out.print("Posicion de la PC a ingresar: ");
        int pos = lea.nextInt();
        while (!opcion.equals("exit")) {
            lea.nextLine();
            System.out.print(pc.get(pos).getHostname() + "#");
            opcion = lea.nextLine();

            if (opcion.startsWith("ping")) {
                String[] ip = new String[3];
                String[] host = new String[3];

                String[] tokens = opcion.split("_");
                ip[0] = tokens[1];
                String[] tokens2 = ip[0].split("\\.");
                String binarioInputIp = "";
                for (int i = 0; i < 4; i++) {
                    binarioInputIp += dtob(tokens2[i]);
                    //System.out.println(mascara);
                }

                System.out.println("binario Input IP: " + binarioInputIp);
                
                String[] tokensIP = pc.get(pos).getIp().split("\\.");
                String binarioIP = new String();
                //System.out.println(tokensIP[1]);
                for (int i = 0; i < tokensIP.length; i++) {
                    binarioIP += dtob(tokensIP[i]);
                }
                System.out.println("binario IP de pc actual: " + binarioIP); //binario ip de comp en la que esta
                // comparar con binarioIpInput
                
                String[] tokensMask = pc.get(pos).getMask().split("\\.");
                String binarioMask = new String();
                for (int i = 0; i < tokensMask.length; i++) {
                    binarioMask += dtob(tokensMask[i]);
                }
                System.out.println("mask: " + binarioMask);
                int cont1 = 0;
                for (int i = 0; i < binarioMask.length(); i++) {
                    if (binarioMask.charAt(i) == '1') {
                        cont1++;
                    }
                }
                System.out.println(cont1);
                
                if (binarioInputIp.equals(binarioIP)) {
                    System.out.println("Pinging to" + binarioInputIp + "with 32 bytes of data: \n" +
"                    Reply from "+binarioInputIp+ " : bytes=32 time=37ms\n" +
"                    Reply from "+binarioInputIp+ ": bytes=32 time=37ms\n" +
"                    Reply from "+ binarioInputIp+": bytes=32 time=37ms\n" +
"                    Reply from "+binarioInputIp+": bytes=32 time=37ms\n" +
"\n" +
"                    Ping statistics for "+binarioInputIp+":\n" +
"                        Packets: Sent = 4, Recieved = 4, Lost = 0 (0% loss)");
                }
                else{
                    if (!binarioInputIp.equals(binarioIP)) {
                    System.out.println("Pinging to" + binarioInputIp + "with 32 bytes of data: \n" +
"                    Reply from "+binarioInputIp+ " : Destination host unreachable\n" +
"                    Reply from "+binarioInputIp+ ": Destination host unreachable\n" +
"                    Reply from "+ binarioInputIp+": Destination host unreachable\n" +
"                    Reply from "+binarioInputIp+": Destination host unreachable\n" +
"\n" +
"                    Ping statistics for "+binarioInputIp+":\n" +
"                        Packets: Sent = 4, Recieved = 4, Lost = 0 (0% loss)");
                    }
                    else{
                        int a = 0;
                        if (a == 0) {
                            for (int i = 0; i < pc.size(); i++) {
                                if (pc.get(i).getIp().equals(binarioInputIp)) {
                                    System.out.println("No se encontro esa PC");
                                }
                            }
                        }
                    }
                }
                
                
                

            } else {
                if (opcion.equals("show")) {
                    System.out.println("ip: " + pc.get(pos).getIp());
                    System.out.println("mask: " + pc.get(pos).getMask());
                }
            }

        }

    }

    //case 1
    static public void menu() {
        System.out.println("");
        System.out.println("CRUD");
        System.out.println("");
        System.out.println("1. Agregar PC ");
        System.out.println("2. Eliminar");
        System.out.println("");
        System.out.print("Opcion: ");
        int opcion = lea.nextInt();

        switch (opcion) {
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
                for (int i = 0; i < pc.size(); i++) {
                    System.out.println(i + " - " + pc.get(i).getHostname());
                    System.out.println("");
                }
                System.out.print("Eliminar: ");
                int eliminarpos = lea.nextInt();
                pc.remove(eliminarpos);
                break;
            case 3:
                break;
        }
    }

    static public void menu2(String ip, String mascara, String hostname) {
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
            System.out.println(marca + " " + res);
            Laptop p = new Laptop(marca, res, rgb, ip, mascara, hostname);
            pc.add(p);
            System.out.println(pc);

        }
        if (opcion == 2) {
            System.out.print("Ram: ");
            int ram = lea.nextInt();
            System.out.print("Capacidad de almacentamiento: ");
            int espacio = lea.nextInt();
            System.out.print("Tipo de almacenamiento: ");
            lea.nextLine();
            String tipo = lea.nextLine();
            Escritorio e = new Escritorio(ram, espacio, tipo, ip, mascara, hostname);
            pc.add(e);
            System.out.println(pc);
        }
    }

    static public String dtob(String d) {
        int decimal = Integer.parseInt(d);
        int decimalInicial = decimal;
        String binario = Integer.toBinaryString(decimalInicial);
        //System.out.println(binario); // 1000
        String binario2 = new String();
        int restaAux = 8 - binario.length();
        for (int i = 0; i < restaAux; i++) {
            binario2 += '0';
        }
        binario2 += binario;

        return binario2;
    }

}
