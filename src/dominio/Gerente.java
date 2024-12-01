public class Gerente extends Trabajador{
    private int numeroempleados;

    public Gerente(String nombre, String apellido, int numeroempleados){
        super(nombre,apellido);
        puesto = "Gerente";
        this.numeroempleados=numeroempleados;
    }

    public Gerente(String nombre, String apellido){
        super(nombre,apellido);
        puesto = "Gerente";
    }

    public int getNumeroEmpleados(){
        return numeroempleados;
    }

    public void setNumeroEmpleados(int numeroempleados){
        this.numeroempleados=numeroempleados;
    }

    @Override
    public long getSalario(){
        return Math.round(Math.random()*1000 + 1500);
    }

    @Override
    public String toString(){
        return "Gerente " + nombre + " " + apellido + " Nº de empleados: " + numeroempleados;
    }
}