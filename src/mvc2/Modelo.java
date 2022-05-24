
package mvc2;
public class Modelo {
    
    private String palabra;
    private String mayusPalabra;

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getMayusPalabra() {
        return mayusPalabra;
    }

    public void setMayusPalabra(String mayusPalabra) {
        this.mayusPalabra = mayusPalabra;
    }

    public String ponerPalabraMayus(){
        this.mayusPalabra=this.palabra.toUpperCase();
        return this.mayusPalabra;
    }
    
    
}
