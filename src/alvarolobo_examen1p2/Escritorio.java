
package alvarolobo_examen1p2;

import java.util.ArrayList;
import java.util.Scanner;

public class Escritorio extends PCs{
    private int ram;
    private int espacio;
    private String tipoD;

    public Escritorio() {
    }

    public Escritorio(int ram, int espacio, String tipoD, String ip, String mask, String hostname) {
        super(ip, mask, hostname);
        this.ram = ram;
        this.espacio = espacio;
        this.tipoD = tipoD;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }

    public String getTipoD() {
        return tipoD;
    }

    public void setTipoD(String tipoD) {
        this.tipoD = tipoD;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public Scanner getLea() {
        return lea;
    }

    public void setLea(Scanner lea) {
        this.lea = lea;
    }

    public ArrayList<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(ArrayList<Laptop> laptops) {
        this.laptops = laptops;
    }

    public ArrayList<Escritorio> getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(ArrayList<Escritorio> escritorio) {
        this.escritorio = escritorio;
    }
    
    
    
    
}
