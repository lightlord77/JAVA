public class Aluno{
   private String nome, curso, disc1,disc2,disc3;
   private double nota1,nota2,nota3;
   
   public Aluno(String NOME, String CURSO, String DISC1, String DISC2, String DISC3, double NOTA1, double NOTA2, double NOTA3){
      if (NOTA1>=0 && NOTA2>=0 && NOTA3>=0){
         nota1=NOTA1; nota2=NOTA2; nota3=NOTA3; nome=NOME;curso=CURSO;disc1=DISC1; disc2=DISC2; disc3=DISC3;
      }
      else{
         System.out.println("Notas abaixo de 0, encerrando o prgrama...");
         System.exit(1);
      }
   }
   
   public String getAprovacao1(){
      if (nota1>=7){
         return "foi aprovado na disciplina 1";
      }
      else{
         return "foi reprovado na disciplina 1";
      }      
         
   }
   public String getAprovacao2(){
      if (nota2>=7){
         return "foi aprovado na disciplina 2";
      }
      else{
         return "foi reprovado na disciplina 2";
      }      
         
   }
   public String getAprovacao3(){
      if (nota3>=7){
         return "foi aprovado na disciplina 3";
      }
      else{
         return "foi reprovado na disciplina 3";
      }      
         
   }
   public String getcurso(){
      return curso; 
   }
   
   public String getnome(){
      return nome;
   }
   public String getdisc1(){
      return disc1;
   }
   public String getdisc2(){
      return disc2;
   }
   public String getdisc3(){
      return disc3;
   }
   public double getnota1(){
      return nota1;
   }
   public double getnota2(){
      return nota2;
   }
   public double getnota3(){
      return nota3;
   }

}
