import java.util.ArrayList;

public class ListaTrabajadores{
    public ArrayList<Trabajador> Trabajadores;

    public ListaTrabajadores(){
        this.Trabajadores = new ArrayList<>();
    }

    public void annadirElemento(Trabajador trabajador){
        Trabajadores.add(trabajador);
    }

    public void eliminarElemento(Trabajador trabajador){
        Trabajadores.remove(trabajador);
    }

    public ArrayList<Trabajador> getListaTrabajadores(){
        return Trabajadores;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nLista de trabajadores a cargo\n\n");
        for(int i= 0; i != Trabajadores.size(); i++){
            sb.append((i+1) + "º Trabajador --> " + Trabajadores.get(i).getNombre() + " " + Trabajadores.get(i).getApellido()+"\n");
        }
        return sb.toString();
    }
}