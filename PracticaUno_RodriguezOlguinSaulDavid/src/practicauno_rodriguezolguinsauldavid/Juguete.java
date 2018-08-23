package practicauno_rodriguezolguinsauldavid;
/**
 *Esta clase son los juguetes que llegan al inventario
 * 
 * @author Saul Rodriguez
 * @version 23/08/2018
 */
public class Juguete {
    public String Nombre;
    public int Codigo;
    public int Cantidad;
    public String Marca;
    public double Precio;
    
    public Juguete(String Nombre, String Marca, int Codigo, int Cantidad, double Precio){
        this.Nombre=Nombre;
        this.Marca=Marca;
        this.Codigo=Codigo;
        this.Cantidad=Cantidad;
        this.Precio=Precio;
        
    }
    public Juguete(String Nombre, String Marca){
        this.Nombre=Nombre;
        this.Marca=Marca; 
    }
    public Juguete(int Codigo){
        this.Codigo=Codigo;
    }
    public Juguete(double Precio){

        this.Precio=Precio;     
    }
    public Juguete(int Cantidad, int Codigo){
        this.Cantidad=Cantidad;
        this.Codigo=Codigo;
    }

    @Override
    public String toString() {
        return "Juguete{" + "Nombre=" + Nombre + ", Codigo=" + Codigo + ", Cantidad=" + Cantidad + ", Marca=" + Marca + ", Precio=" + Precio + '}';
    }
    

}
