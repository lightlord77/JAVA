import java.util.ArrayList;
public class clienteProfessor{
   public static void main(String[] args){
      ArrayList<Professor> profs=new ArrayList<Professor>();
      profs.add(new ProfessorDE(1,"Joao Silva",8000));
      profs.add(new ProfessorHorista(2,"Maria Rita",100,70));
      profs.add(new ProfessorBolsista(3,"Jose Pereira",5400));
      for(Professor p:profs){
         p.imprime();
         System.out.println(" ");
      }
   }
}
