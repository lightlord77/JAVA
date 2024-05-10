import java.util.ArrayList;
public class cliObjVoador{
   public static void main(String[] args){
   
   
      ArrayList<Voador> Voadores = new ArrayList <Voador>();
      Voadores.add(new NaveEspacial());
      Voadores.add(new Aviao());
      Voadores.add(new Helicoptero());
      for (Voador obj: Voadores){
         System.out.println(obj.obj_voando());
      }
   }
}
