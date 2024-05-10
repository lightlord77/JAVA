public class clienteAluno{
   public static void main(String[] args){
      Aluno a1 = new Aluno("Joao", "eng da computacao", "Analise de Circuitos", "Concepcao de Sistemas Digitais","Adm para eng", 8.4 ,9.2, 5);
      
      System.out.println("O "+a1.getnome()+" que faz "+a1.getcurso()+" com as materias "+a1.getdisc1()+", "+a1.getdisc2()+" e "+a1.getdisc3());
      System.out.println("Ele tirou notas respectivas de: "+a1.getnota1()+", "+a1.getnota2()+", "+a1.getnota3()+"! Ele "+a1.getAprovacao1()+", "+a1.getAprovacao2()+", "+a1.getAprovacao3()+"");
   
   
   
   
   
   
   
   
   
   
   
   
   }

}
