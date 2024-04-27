public class Professor{
   private int numMatricula;
   private String nome;
   public Professor(int numMatricula, String nome){
      this.numMatricula=numMatricula;
      this.nome=nome;
   }
   public float getSalario(){
      return 0;
   }
   public void imprime(){
      System.out.println("nome: "+nome+".");
      System.out.println("numero da matricula: "+numMatricula+".");
   }
}
