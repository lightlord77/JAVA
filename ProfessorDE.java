public class ProfessorDE extends Professor{
   private float salario;
   
   public ProfessorDE(int numMatricula, String nome, float salario){
      super(numMatricula, nome);
      this.salario=salario;
   }
   public void setSalario(float d){
      if (d>0){
         salario=d;
      }   
      else{
         System.out.println("Salario com valor negativo...");
         System.exit(1);
      }
   }
   public float getSalario(){
      return salario;
   }
   
   public void imprime(){
      super.imprime();
      System.out.println("Salario: "+salario+".");
   
   }
}