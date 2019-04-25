package evaluacion;

public class Persona {
    private String nombre; 
    private String  numero_licencia;
    private String celular; 
    private String direccion; 
    private String tipo_sangre; 

    public Persona() {
    }

    public Persona(String nombre, String numero_licencia, String celular, String direccion, String tipo_sangre) {
        this.nombre = nombre;
        this.numero_licencia = numero_licencia;
        this.celular = celular;
        this.direccion = direccion;
        this.tipo_sangre = tipo_sangre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero_licencia() {
        return numero_licencia;
    }

    public void setNumero_licencia(String numero_licencia) {
        this.numero_licencia = numero_licencia;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }
    
    
}
