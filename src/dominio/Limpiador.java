public class Limpiador extends Trabajador{

    public Limpiador(String nombre, String apellido){
        super(nombre, apellido);
        puesto = "Limpiador";
    }

    @Override
    public long getSalario(){
        return Math.round(Math.random()*1000 + 600);
    }

    @Override
    public String toString(){
        return "Limpiador " + nombre + " " + apellido;
    }
}