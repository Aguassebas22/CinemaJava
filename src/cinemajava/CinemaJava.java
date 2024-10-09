
package cinemajava;

import Datos.Cine;
import Datos.Espectador;
import Datos.Pelicula;
import java.awt.BorderLayout;
import java.util.Scanner;


public class CinemaJava {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);  
      Espectador espectador = new Espectador();
      Cine cine = new Cine();
      Pelicula pelicula = new Pelicula("Dragon Ball Z", "Jhon Wick", 120, 18,15000);
      
       
        
        boolean iniciador = true;
        mainloop:
        while(iniciador){
            for (int i = 0; i < cine.getPuestos().length; i++) {
                for (int j = 0; j < cine.getPuestos().length; j++) {
                    System.out.println(" ");
                    System.out.println("/// USUARIO ///" );
                     System.out.println("Ingrese su nombre: ");
                        espectador.setNombre(scanner.next());
                         System.out.println("Ingrese su edad: ");
                         espectador.setEdad(scanner.nextInt());
                         System.out.println("Ingrese el valor: ");
                         espectador.setPlata(scanner.nextInt());
                    if(!cine.getPuestos()[i][j].equals("0")){
                        boolean puestosDi = true;
                        while(puestosDi){
                            if(espectador.getPlata() >= pelicula.getValorB()){
                                if(espectador.getEdad()>= pelicula.getEdadMinima()){
                                    System.out.println("Desea asignar este puesto, " + cine.getPuestos()[i][j] + "?");
                                    System.out.println("""
                                                       1.SI
                                                       2.NO""");
                                    int opcion = scanner.nextInt();
                                    switch(opcion){
                                        case 1:
                                            System.out.println("Usuario = " + espectador.getNombre());
                                            espectador.setPlata(espectador.getPlata()- pelicula.getValorB());
                                            System.out.println("Dinero restante = " + espectador.getPlata());
                                            cine.getPuestos()[i][j] = "0";
                                            System.out.println("//// Puesto asignado ////");
                                            System.out.println(" ");
                                            System.out.println("¿Desea asignar otro puesto?");
                                            System.out.println("""
                                                               1.SI
                                                               2.NO""");
                                            int SeguirA = scanner.nextInt();
                                            if(SeguirA != 1){
                                                puestosDi = false;
                                            }
                                            break;
                                         case 2:
                                                
                                         case 3:
                                             System.out.println("Pelicula = " + pelicula.getNombre());
                                             System.out.println("Autor = " + pelicula.getDirector());
                                             System.out.println("Duracion = " + pelicula.getDuracion() + " minutos");
                                             System.out.println(" ");
                                             puestosDi = false;
                                             return;
                                             
                                             default:
                                              System.out.println("Opcion no valida");
                                             break;
                                    }
                                    j++;
                                    if(j >= cine.getPuestos().length){
                                        i++;
                                        j=0;
                                    }
                                    if(i >= cine.getPuestos().length){
                                        i=0;
                                        j=0;
                                        
                                    }              
                                }else{
                                    System.out.println("No tienes edad suficiente para ver esta pelicula");
                                    espectador.setEdad((espectador.getEdad() - 18)*(-1));
                                    System.out.println("vuelve en " + espectador.getEdad() + " años.");
                                    puestosDi = false;
                                    break;
                                }
                            }else{
                                System.out.println("No tienes suficiente dinero");
                                espectador.setPlata((espectador.getPlata()- pelicula.getValorB())*(-1));
                                System.out.println("Te faltan, " + espectador.getPlata() + " pesos");
                                System.out.println("3. Mostrar puestos asignados");
                                int opc = scanner.nextInt();
                                if(opc == 3){
                                  for (i = 0; i < cine.getPuestos().length; i++) {
                                    for (j = 0; j < cine.getPuestos().length; j++) {
                                        System.out.print(cine.getPuestos()[i][j] + " ");
                                  }
                                      System.out.println();
                                 }
                                    System.out.println();
                                    break mainloop;
                                }   
                            }
                            
                        }
                    }
                    
                    
                }
                
            }
        }
    }
    
    
}
