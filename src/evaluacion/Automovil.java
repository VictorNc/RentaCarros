package evaluacion;

public class Automovil {
    private int  idautomovil; 
    private String identificador; 
    private String tipo_auto;
    private double precio_rena_diario; 
    private int status;
    private Motor tipo_motor;
    private Llanta llantas_auto[];
    private Faros faros_auto[];

    public Automovil() {
    }

    public Automovil(int idautomovil, String identificador, String tipo_auto, double precio_rena_diario, int status, Motor tipo_motor)  {
        this.idautomovil = idautomovil;
        this.identificador = identificador;
        this.tipo_auto = tipo_auto;
        this.precio_rena_diario = precio_rena_diario;
        this.status = status;
        this.tipo_motor = tipo_motor;
        llantas_auto = new Llanta[4];
        faros_auto = new Faros[2];
    }

    public Automovil(int idautomovil, String identificador, String tipo_auto, double precio_rena_diario, int status, Motor tipo_motor, Llanta[] llantas_auto, Faros[] faros_auto) {
        this.idautomovil = idautomovil;
        this.identificador = identificador;
        this.tipo_auto = tipo_auto;
        this.precio_rena_diario = precio_rena_diario;
        this.status = status;
        this.tipo_motor = tipo_motor;
        this.llantas_auto = llantas_auto;
        this.faros_auto = faros_auto;
    }

    public int getIdautomovil() {
        return idautomovil;
    }

    public void setIdautomovil(int idautomovil) {
        this.idautomovil = idautomovil;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getTipo_auto() {
        return tipo_auto;
    }

    public void setTipo_auto(String tipo_auto) {
        this.tipo_auto = tipo_auto;
    }

    public double getPrecio_rena_diario() {
        return precio_rena_diario;
    }

    public void setPrecio_rena_diario(double precio_rena_diario) {
        this.precio_rena_diario = precio_rena_diario;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Motor getTipo_motor() {
        return tipo_motor;
    }

    public void setTipo_motor(Motor tipo_motor) {
        this.tipo_motor = tipo_motor;
    }

    public Llanta[] getLlantas_auto() {
        return llantas_auto;
    }

    public void setLlantas_auto(Llanta[] llantas_auto) {
        this.llantas_auto = llantas_auto;
    }

    public Faros[] getFaros_auto() {
        return faros_auto;
    }

    public void setFaros_auto(Faros[] faros_auto) {
        this.faros_auto = faros_auto;
    }
    
    
}
