package practicauno_rodriguezolguinsauldavid;
/**
 *
 * @author Saul David Rodriguez Olguin
 */
public abstract class ClaseA{
    
    public abstract int Jugar(int Aburrimiento);
    
    public String Hablar(boolean Presionar){
        /**
         * @param Presionar: si el boton es presionado
         */
        String Frase="";
        if(Presionar==true){
         Frase="mamá";
        }   
        return Frase;
    }
    public int Bailar(boolean Mover){
        /**
         * @param Mover: si mueves el juguete
         */
        int Baile=0;
        if(Mover==true){
         Baile=1;
        }   
        return Baile;
    }
    public boolean Encender(String Aburrimiento){
        /**
         * @param Aburrimiento: si estas aburrido o no
         */
        boolean Prender=false;
        if(Aburrimiento=="si"){
         Prender=true;
        }   
        return Prender;
    }
    public abstract String Cantar(String Cancion);
}
