
package practicauno_rodriguezolguinsauldavid;

public class PracticaUno_RodriguezOlguinSaulDavid {

    /**

      *Esta es la clase principal
     
      *@author Saul Rodriguez
        * @version 23/08/2018
         
     */
    public static void main(String[] args) {
        Juguete Jug1=new Juguete("Peluche","Hasbro", 1234, 5, 200.00);
        System.out.println(Jug1);
        Juguete Jug2=new Juguete("Muñeca", "Mattel");
        System.out.println(Jug2);
        Juguete Jug3=new Juguete(1,1);
        System.out.println(Jug3);
        Juguete Jug4=new Juguete(1);
        System.out.println(Jug4);
        Juguete Jug5=new Juguete(1.1);
        System.out.println(Jug5);
     
            
     
    }
    
}
