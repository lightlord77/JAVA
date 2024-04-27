public class ProfessorHorista extends Professor{
   private int numeroHoras;
   private float valorHora;
   
   public ProfessorHorista(int numMatricula, String nome, int numeroHoras, float valorHora){
      super(numMatricula, nome);
      this.numeroHoras=numeroHoras;
      this.valorHora=valorHora;
   }
   public void setHoras(int horas){
      if (horas>=0){
         numeroHoras=horas;
      }
      else{
         System.out.println("Hora negativa, programa encerrando...");
      }
   }
   public void setValorHora(int valor){
      if (valor>=0){
         valorHora=valor;
      }
      else{
         System.out.println("valor hora negativo, programa encerrando...");
         System.exit(1);
      }
   }
   
   public float getSalario(){
      return valorHora*numeroHoras;   
   }
   
   public void imprime(){
      super.imprime();
      System.out.println("Numero de horas: "+numeroHoras+".");
      System.out.println("Valor por hora: "+valorHora+"");
      System.out.println("Valor do salario: "+getSalario()+".");
   }
}