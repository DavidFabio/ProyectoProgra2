import java.util.Scanner;

public class Principal{
    public static void main(String [] args){
    System.out.println("");
    System.out.println("Bienvenido al portal del trabajador\n");
    System.out.println("Introduce tu nombre, tus apellidos y tu cargo\n");
    System.out.print("Nombre --> ");
    Scanner sc = new Scanner(System.in);
    String nombre1 = sc.nextLine();
    System.out.print("Apellidos --> ");
    String apellido1 = sc.nextLine();
    System.out.print("Cargo (Limpiador / Programador / Gerente) --> ");
    String cargo = sc.nextLine();
    String opcion;
    boolean bucle = true;
    long numeroaleatorio = Math.round(Math.random()*10);
    Horario horario1 = new Presencial();
    
    Trabajador trabajador1 = null;
        try{
        if(cargo.equalsIgnoreCase("Limpiador")){
            trabajador1 = new Limpiador(nombre1, apellido1);
        }
        //Trabajador trabajador1 = new Limpiador(x,x);
        else if(cargo.equalsIgnoreCase("Programador")){
            trabajador1 = new Programador(nombre1, apellido1);
        }
        else if(cargo.equalsIgnoreCase("Gerente")){
            trabajador1 = new Gerente(nombre1, apellido1);
        }
        else{
            sc.close();
            throw new IllegalArgumentException("Cargo no válido");
        }
        if(trabajador1 != null){
        System.out.println("Tu salario es de " + trabajador1.getSalario() + " euros.");
        }
        }catch(IllegalArgumentException e){
            System.out.println("\nERROR: El valor introducido no es acorde al esperado.\nRecuerda que solo puedes introducir Limpiador, Programador o Gerente.\n");
        }
        if(cargo.equalsIgnoreCase("Gerente")){
            ListaTrabajadores listaTrabajadores1 = new ListaTrabajadores();
            System.out.println("\n-- Portal del Gerente --\nBienvenido " + trabajador1.getNombre() + " " + trabajador1.getApellido());
            System.out.println("Lista de trabajadores a cargo: VACÍA");
            System.out.println("¿Añadir trabajador?");
            System.out.println("Sí / No");
            opcion = sc.nextLine();
            if (opcion.equalsIgnoreCase("Si")|opcion.equalsIgnoreCase("Sí")){
                do{
                System.out.print("Nombre --> ");
                String nombretrabajadorgerente1 = sc.nextLine();
                System.out.print("Apellidos --> ");
                String apellidotrabajadorgerente1 = sc.nextLine();
                Trabajador trabajadorgerente1 = null;
                System.out.println("¿Tu trabajador es un limpiador o programador?");
                String cargotrabajadorgerente1 = sc.nextLine();
                try{
                if (cargotrabajadorgerente1.toLowerCase().contains("limpiador")){
                    trabajadorgerente1 = new Limpiador(nombretrabajadorgerente1, apellidotrabajadorgerente1);
                }
                else if(cargotrabajadorgerente1.toLowerCase().contains("programador")){
                    trabajadorgerente1 = new Programador(nombretrabajadorgerente1, apellidotrabajadorgerente1);
                }
                else{
                    throw new IllegalArgumentException("Cargo no válido");
                }
                }catch(IllegalArgumentException e){
                    System.out.println("\n ERROR: El valor introducido no es acorde al esperado.\nRecuerda que solo puedes introducir Limpiador o Programador.\n");
                }
                System.out.println("\n" + trabajadorgerente1 + " añadido\n");
                listaTrabajadores1.annadirElemento(trabajadorgerente1);
                System.out.println("¿Seguir añadiendo trabajadores?");
                opcion = sc.nextLine();
                if (opcion.equalsIgnoreCase("No")){
                    bucle=false;
                }
                }while(bucle==true);
                System.out.println("¿Quieres una lista de los trabajadores a cargo?");
                opcion = sc.nextLine();
                if (opcion.equalsIgnoreCase("Si")|opcion.equalsIgnoreCase("Sí")){
                    System.out.println(listaTrabajadores1);
                }
                System.out.println("Saliendo del portal del gerente... ");
            }
            else if (opcion.equalsIgnoreCase("No")){
                System.out.println("Saliendo del portal del gerente... ");
            }
        }
        else if(cargo.equalsIgnoreCase("Programador")){
                   if (numeroaleatorio<=7){
                       horario1 = new Presencial();
                        System.out.println(horario1);          
                        if(numeroaleatorio<=3){
                            horario1 = new Presencial(true);}
                        else{
                            horario1 = new Presencial(false);}
                        System.out.println("Bienvenido a la zona de reserva de actividades\n");
                        do{
                        System.out.println("¿Qué actividades tienes pensado reservar? (Paddle/Yoga)");
                        opcion = sc.nextLine();
                        horario1.setTipoActividad(opcion);
                        horario1.reservarActividad();
                        if(horario1.getPaseActividad()==false){
                            System.out.println("¿Quieres comprar el pase?");
                            opcion=sc.nextLine();
                            if (opcion.equalsIgnoreCase("Si")|opcion.equalsIgnoreCase("Sí")){
                                System.out.println("Comprando el pase...");
                                horario1.setPaseActividad(true);
                                System.out.println("Comprado!");
                                System.out.println("¿Quieres reservar alguna actividad?");
                                opcion=sc.nextLine();
                                if (opcion.equalsIgnoreCase("No")){
                                    bucle=true;
                                }
                            }
                        }
                        else{
                            bucle=false;
                        }
                    }while((bucle == true));
                    }
                    else{
                        horario1 = new Remoto();
                        System.out.println(horario1);          
                    }
                }
        else if(cargo.equalsIgnoreCase("Limpiador")){
                
                horario1 = new Presencial();
                System.out.println(horario1);          
                if(numeroaleatorio<=3){
                    horario1 = new Presencial(true);}
                else{
                    horario1 = new Presencial(false);}
                    System.out.println("Bienvenido a la zona de reserva de actividades\n");
                    do{
                        System.out.println("¿Qué actividades tienes pensado reservar? (Paddle/Yoga)");
                        opcion = sc.nextLine();
                        horario1.setTipoActividad(opcion);
                        horario1.reservarActividad();
                        if(horario1.getPaseActividad()==false){
                            System.out.println("¿Quieres comprar el pase?");
                            opcion=sc.nextLine();
                            if (opcion.equalsIgnoreCase("Si")|opcion.equalsIgnoreCase("Sí")){
                                System.out.println("Comprando el pase...");
                                horario1.setPaseActividad(true);
                                System.out.println("Comprado!");
                                System.out.println("¿Quieres reservar alguna actividad?");
                                opcion=sc.nextLine();
                                if (opcion.equalsIgnoreCase("No")){
                                    bucle=true;
                                }
                            }
                        }
                        else{
                            bucle=false;
                        }
                    }while((bucle == true));
            }
            
        }
}