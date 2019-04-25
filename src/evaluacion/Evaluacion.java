package evaluacion;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;


public class Evaluacion {

    
    public static void main(String[] args) {
       int opcion = 0;
       Scanner ent = new Scanner(System.in);
       Llanta llantas_auto[] = new Llanta[4];
       Renta rentas[] = new Renta[20];
       
       ArrayList<Renta> listaRenta = new ArrayList<Renta>();
       ArrayList<Automovil> listaAutomoviles = new ArrayList<Automovil>();
       
       Faros faros_auto[] = new Faros[2];
       //Automovil autos_disponibles[] = new Automovil[5];
       llantas_auto[0] = new Llanta("15","Michellin","Deportivo");
       llantas_auto[1] = new Llanta("15","Michellin","Deportivo");
       llantas_auto[2] = new Llanta("15","Michellin","Deportivo");
       llantas_auto[3] = new Llanta("15","Michellin","Deportivo");
       
       faros_auto[0] = new Faros("BMW","Zenon");
       faros_auto[1] = new Faros("BMW","Zenon");
       
      /*autos_disponibles[0] = new Automovil(1,"RTS3-8FUT","Deportivo",550.50,1,new Motor("34RETR-RTR",500,8),llantas_auto, faros_auto);
      autos_disponibles[1] = new Automovil(2,"RTS3-8FUT","Sedan",550.50,1,new Motor("34RETR-RTR",500,8),llantas_auto, faros_auto);
      autos_disponibles[2] = new Automovil(3,"RTS3-8FUT","Convertible",550.50,1,new Motor("34RETR-RTR",500,8),llantas_auto, faros_auto);
      autos_disponibles[3] = new Automovil(4,"RTS3-8FUT","",550.50,1,new Motor("34RETR-RTR",500,8),llantas_auto, faros_auto);
      autos_disponibles[4] = new Automovil(5,"RTS3-8FUT","Deportivo",550.50,1,new Motor("34RETR-RTR",500,8),llantas_auto, faros_auto);*/
    
      listaAutomoviles.add(new Automovil(1,"RTS3-8FUT","Deportivo",550.50,1,new Motor("34RETR-RTR",500,8),llantas_auto, faros_auto));
      listaAutomoviles.add(new Automovil(2,"RTS3-8FUT","Sedan",550.50,1,new Motor("25YETE-RYR",500,8),llantas_auto, faros_auto));
      listaAutomoviles.add(new Automovil(3,"RTS3-8FUT","Deportivo",550.50,1,new Motor("50RETR-KTR",500,8),llantas_auto, faros_auto));
      listaAutomoviles.add(new Automovil(4,"RTS3-8FUT","Deportivo",550.50,1,new Motor("80RETR-LTR",500,8),llantas_auto, faros_auto));
      listaAutomoviles.add(new Automovil(5,"RTS3-8FUT","Deportivo",550.50,1,new Motor("67RETR-PTR",500,8),llantas_auto, faros_auto));
      
        System.out.println("Renta de Automoviles S.A de C.V");
        do{
            System.out.println("Opciones disponibles:  \n 1.- Mostrar vehiculos \n 2.- Mostrar usuarios que tienen renta \n 3.- Registrar renta \n 4.- Terminar renta \n 5.- mostra precios de automoviles ");
            opcion = ent.nextInt(); 
            switch(opcion){
                case 1:
                    for(int r = 0; r < listaAutomoviles.size(); r++){
                        System.out.println(listaAutomoviles.get(r).getIdautomovil() + " " + listaAutomoviles.get(r).getPrecio_rena_diario() + " " + listaAutomoviles.get(r).getIdentificador() + " " + listaAutomoviles.get(r).getTipo_auto());
                    }
                    break;
                case 2:
                    /*int conteo = 0; 
                    for(int r = 0; r < rentas.length; r++){
                      if(rentas[r] != null){
                        if(rentas[r].getStatus_renta() == 1){
                            Persona usuario = rentas[r].getPerson();
                            System.out.println(usuario.getNombre() + " " + usuario.getNumero_licencia());
                           conteo++;
                        }
                        
                        }
                    }
                    if(conteo == 0)
                        System.out.println("No hay rentas disponibles");*/
                    if(listaRenta.isEmpty()){
                        System.out.println("No hay rentas registradas");
                    }else{
                        Iterator<Renta> lrentas = listaRenta.iterator();
                        while(lrentas.hasNext()){ 
                            Renta r = (Renta) lrentas.next();
                            if(r.getStatus_renta() == 1){
                            Persona usuario = r.getPerson();
                            System.out.println(usuario.getNombre() + " " + usuario.getNumero_licencia());
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Datos de renta");
                    ent.nextLine();
                    Persona usuario_renta = new Persona();
                    System.out.println("Nombre de la persona ");
                    usuario_renta.setNombre(ent.nextLine());
                    System.out.println("Indique direcciòn ");
                    usuario_renta.setDireccion(ent.nextLine());
                    System.out.println("Indique el telèfono ");
                    usuario_renta.setCelular(ent.nextLine());
                    System.out.println("Indique tipo de sangre ");
                    usuario_renta.setTipo_sangre(ent.nextLine());
                    System.out.println("Indique nùmero de licencia ");
                    usuario_renta.setNumero_licencia(ent.nextLine());
                    
                    Automovil automovil_renta = null;
                    
                    do{
                        int c = 0;
                         System.out.println("Indique id del automovil");
                    int idautomovil = ent.nextInt();
                    //automovil_renta = getAutomovilDisponible(idautomovil, autos_disponibles);
                    Iterator<Automovil> lautos = listaAutomoviles.iterator();
                        while(lautos.hasNext()){ 
                            Automovil auto_actual = (Automovil) lautos.next();
                             if(auto_actual.getStatus() != 1 && auto_actual.getIdautomovil() == idautomovil){
                                 System.out.println("El automovil no esta disponible ");
                             }else if(auto_actual.getStatus() == 1 && auto_actual.getIdautomovil() == idautomovil){
                             automovil_renta = auto_actual;
                            listaAutomoviles.get(c).setStatus(2);
                            break;
                            }
                            c++;
                        }
                            
                    }while(automovil_renta == null);
                    System.out.println("Indique dias de renta ");
                    int dias_renta = ent.nextInt();
                    Renta renta_actual = new Renta(usuario_renta, automovil_renta, new Date(),dias_renta,1);
                    
                   listaRenta.add(renta_actual);
                   
                    break;
                case 4:
                    if(listaRenta.isEmpty()) {
                        System.out.println("no hay rentas registradas");
                    }else{
                        System.out.println("indique id del automovil");
                        int idAutomovil = ent.nextInt();
                        boolean verificar = false;
                    
                        for (int r = 0; r < listaRenta.size(); r++){
                        if(listaRenta.get(r).getAuto_renta().getIdautomovil() == idAutomovil && listaRenta.get(r).getStatus_renta() == 1){
                            listaRenta.get(r).setStatus_renta(2);
                            System.out.println("La renta se ha finalizado correctamente");
                            verificar = true;
                            break;
                        
                            } 
                        }
                        if (!verificar){
                            System.out.println("No hay concidencias");
                        }
                    }
                    
                    break;
                case 5:
                    
                    if(listaAutomoviles.isEmpty()){
                        System.out.println("No hya automoviles registrados");
                        
                    }else{
                        for (int r = 0; r < listaAutomoviles.size(); r++){
                            System.out.println(listaAutomoviles.get(r).getIdentificador()+ " " + listaAutomoviles.get(r).getPrecio_rena_diario());
                        }
                    }
                    break;
                case 6:
                    
                    if(listaRenta.isEmpty()){
                        System.out.println("No hay automoviles registrados");
                        
                    }else{
                        Date now = new Date();
                        for (int r = 0; r < listaRenta.size(); r++){
                            if (listaRenta.get(r).getFecha_registro().compareTo(now) == 1){
                                
                            } 
                        }  
                    }
                    
                    break;
                default:
                    System.out.println("Opciòn no disponible, intente con otra opciòn. ");
                    break;
            }
        }while(opcion != 0); 
      
      
      
    }
    
    public static Automovil getAutomovilDisponible(int id, Automovil[] automoviles){
        Automovil auto = null; 
        for(int r = 0; r < automoviles.length; r++){
            if(automoviles[r].getStatus() == 1 && automoviles[r].getIdautomovil() == id){
            }
            }
        
    return auto;     
    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
}
