package evaluacion;

import java.util.Date;

public class Renta {
   private Persona person; 
   private Automovil auto_renta;
   private Date fecha_registro;
   private int dias_rentas;
   private int status_renta;

    public Renta() {
    }

    public Renta(Persona person, Automovil auto_renta, Date fecha_registro, int dias_rentas, int status_renta) {
        this.person = person;
        this.auto_renta = auto_renta;
        this.fecha_registro = fecha_registro;
        this.dias_rentas = dias_rentas;
        this.status_renta = status_renta;
    }

    public Persona getPerson() {
        return person;
    }

    public void setPerson(Persona person) {
        this.person = person;
    }

    public Automovil getAuto_renta() {
        return auto_renta;
    }

    public void setAuto_renta(Automovil auto_renta) {
        this.auto_renta = auto_renta;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public int getDias_rentas() {
        return dias_rentas;
    }

    public void setDias_rentas(int dias_rentas) {
        this.dias_rentas = dias_rentas;
    }

    public int getStatus_renta() {
        return status_renta;
    }

    public void setStatus_renta(int status_renta) {
        this.status_renta = status_renta;
    }
   
   
}
