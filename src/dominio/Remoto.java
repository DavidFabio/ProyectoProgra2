public class Remoto implements Horario{

    public void reservarActividad(){
        System.out.println("No puedes reservar");
    }

    public void setTipoActividad(String string){
        System.out.println("");
    }

    public boolean getPaseActividad(){
        return false;
    }

    public void setPaseActividad(boolean booleano){}

    
    public String toString(){
        return("\nTienes un horario remoto.\n");
    }
}