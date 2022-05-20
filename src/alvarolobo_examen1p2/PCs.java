
package alvarolobo_examen1p2;

import java.util.ArrayList;
import java.util.Scanner;

public class PCs {
    protected String ip;
    protected String mask;
    protected String hostname;
    Scanner lea = new Scanner(System.in);
    protected ArrayList <Laptop> laptops = new ArrayList();
    protected ArrayList <Escritorio> escritorio = new ArrayList();

    public PCs() {
    }

    public PCs(String ip, String mask, String hostname) {
        this.ip = ip;
        this.mask = mask;
        this.hostname = hostname;
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

    @Override
    public String toString() {
        return "PCs{" + "ip=" + ip + ", mask=" + mask + ", hostname=" + hostname + '}';
    }
    
    
}
