public class Presencial implements Horario {
    
    public boolean paseactividad;
    public String tipoactividad;
    public String oficina;
    
    public Presencial(boolean actividad, String tipoactividad, String oficina){
        this.paseactividad = actividad;
        this.tipoactividad = tipoactividad;
        this.oficina = oficina;
    }

    public Presencial(boolean paseactividad){
        this.paseactividad = paseactividad;
    }

    public Presencial(){
    }

    public boolean getPaseActividad(){
        return paseactividad;
    }

    public String getTipoActividad(){
        return tipoactividad;
    }

    public String getOficina(){
        return oficina;
    }

    public void setPaseActividad(boolean paseactividad){
        this.paseactividad = paseactividad;
    }

    public void setTipoActividad(String tipoactividad){
        this.tipoactividad = tipoactividad;
    }

    public void setOficina(String oficina){
        this.oficina = oficina;
    }

    public void reservarActividad(){
        long numeroRandom = Math.round(Math.random()*10);
        try{
        if(this.paseactividad == true){
            if(this.tipoactividad.toLowerCase().contains("paddle")){
                System.out.println("Reservando pista paddle...");
                if(numeroRandom<=5){
                System.out.println("Reservado!");
                }
                else{
                    System.out.println("Lo siento, no hay pistas de paddle posibles para reservar.");
                }
            }
            else if(this.tipoactividad.toLowerCase().contains("yoga")){
                System.out.println("Reservando sala de yoga...");
                if(numeroRandom<=5){
                    System.out.println("Reservado!");
                    }
                    else{
                        System.out.println("Lo siento, no hay salas de yoga posibles para reservar.");
                    }
            }
            else{
                throw new Exception();
            }
        }
        else{
            System.out.println("No tienes el pase de actividad");
        }
        } catch(Exception e){
            System.out.println("El tipo de actividad que has solicitado no está incluida en nuestras actividades");
        }
    }

    public String toString(){
        return("\nTienes un horario presencial.\n");
    }
}
