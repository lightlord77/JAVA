public class ProfessorBolsista extends Professor{
   private float valorBolsa;
   
   public ProfessorBolsista(int numMatricula, String nome, float valorBolsa){
      super(numMatricula, nome);
      this.valorBolsa=valorBolsa;
   }
   
   public void setSalario(int b){
      if (b>=0){
         valorBolsa=b;
      }
      else{
         System.out.println("Salario de bolsista negativo, programa encerrando...");
         System.exit(1);
      }
   }
   public float getSalario(){
      return valorBolsa;
   }
   public void imprime(){
      super.imprime();
      System.out.println("Valor da bolsa: "+valorBolsa+".");
   }
}
