package evaluacion;

public class Llanta {
    
    private String rodada;
    private String marca;
    private String tipo; 

    public Llanta(String rodada, String marca, String tipo) {
        this.rodada = rodada;
        this.marca = marca;
        this.tipo = tipo;
    }

    public Llanta() {
    }

    public String getRodada() {
        return rodada;
    }

    public void setRodada(String rodada) {
        this.rodada = rodada;
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
