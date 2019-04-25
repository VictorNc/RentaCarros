package evaluacion;


public class Motor {
    
    private String numero_serie;
    private int potencia; 
    private int num_cilindros;

    public Motor(String numero_serie, int potencia, int num_cilindros) {
        this.numero_serie = numero_serie;
        this.potencia = potencia;
        this.num_cilindros = num_cilindros;
    }

    public Motor() {
    }

    public String getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(String numero_serie) {
        this.numero_serie = numero_serie;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNum_cilindros() {
        return num_cilindros;
    }

    public void setNum_cilindros(int num_cilindros) {
        this.num_cilindros = num_cilindros;
    }

    
}
