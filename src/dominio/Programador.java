public class Programador extends Trabajador{

    public Programador(String nombre, String apellido){
        super(nombre, apellido);
        puesto = "Programador";
    }

    @Override
    public long getSalario(){
        return Math.round(Math.random()*1000 + 1500);
    }

    @Override
    public String toString(){
        return "Programador " + nombre + " " + apellido;
    }

}