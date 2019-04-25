package evaluacion;

public class Faros {
    
   private String marca;
   private String tipo;

    public Faros(String marca, String tipo) {
        this.marca = marca;
        this.tipo = tipo;
    }

    public Faros() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
  
   
}
