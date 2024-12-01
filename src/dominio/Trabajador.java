public abstract class Trabajador{
    public String puesto;
    public int salario;
    public String nombre;
    public String apellido;

    public Trabajador(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }

    public abstract long getSalario();

    public abstract String toString();
}