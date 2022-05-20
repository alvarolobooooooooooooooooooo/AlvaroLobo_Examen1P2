
package alvarolobo_examen1p2;
public class Laptop extends PCs{
    private String marca;
    private String res;
    private boolean rgb;

    public Laptop() {
        super();
    }


    public Laptop(String marca, String res, boolean rgb, String ip, String mask, String hostname) {
        super(ip, mask, hostname);
        this.marca = marca;
        this.res = res;
        this.rgb = rgb;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public boolean isRgb() {
        return rgb;
    }

    public void setRgb(boolean rgb) {
        this.rgb = rgb;
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
        return "Laptop{" + "marca=" + marca + ", res=" + res + ", rgb=" + rgb + "ip"+ip+'}';
    }
    
    
    
    
    
}
