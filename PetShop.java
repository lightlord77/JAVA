import java.util.ArrayList;
import java.io.*;
public class PetShop{
   private static String petFile="pet.dat";
   private static ArrayList<Pet> pets = new ArrayList<Pet>();
   public static void main(String[] args){
      recoverPets();//método para pegar os Pets que estão no arquivo e salvar eles no ArrayList
      System.out.println("Cadastro prévio: ");
      printPets();//método para mostrar a lista de pets da maneira como foi feita na classe Pets (  em .toString()  )
      System.out.println("gravação de 4 novos pets...");

      //o método codPet() vai criar automaticamente o código do pet de acordo com o tamanho do ArrayList.
      pets.add(new Pet(codPet(),"Bernardo","Rex ","Cao")); // +1 pet. 
      pets.add(new Pet(codPet(),"Mariete ","Felix","Gato"));// +2 pet.
      pets.add(new Pet(codPet(),"Ricardo ","Zeh ","Cao"));// +3 pet.
      pets.add(new Pet(codPet(),"Silmara ","Fred ","Gato"));// +4 pet.
      
      writePets();//escreve no arquivo salvo de pets, os novos pets adicionados.
      pets.clear();//limpa completamente os itens do arraylist
      recoverPets();//;//método para pegar os Pets que estão no arquivo e salvar eles no ArrayList [usado antes para mostrar os que já estavam salvos no início do código]
      System.out.println("Cadastro recuperado após gravação\n");
      printPets();//método para mostrar a lista de pets da maneira como foi feita na classe Pets (  em .toString()  )
      System.out.println("Adição de 1 novo pet e sua gravação");// Irá adicioná-lo no arquivo e então colocá-lo no ArrayList
      pets.add(new Pet(codPet(), "Zeca", "Loro", "Papagaio"));
      writePets();//Vai colocar todos os objetos Pet que possuir, neste caso vai adicionar o "Loro" e escrever todos novamente
      System.out.println("Cadastro atualizado: ");
      printPets();
      
      public static void writePets(){
      // Escreve no arquivo de pets iterando sobre o arraylist.
      // Usar try..catch..finally. Abrir e fechar arquivos.
      }

      public static void recoverPets(){
      // Se o arquivo de pets não existir, criar um arquivo vazio.
      // (o objeto FileOutputStream() cuida disso).
      // Lê pets do arquivo de pets: adiciona ao ArrayList pets,
      // o qual deve ser limpo antes (método clear()) para não
      // haver duplicação de dados. Usar try..catch..finally.
      // Abrir e fechar arquivos.
      }
      
      public static void printPets(){ // Imprime pets: .toString().
         if(pets.size()==0){
            System.out.println("Lista de pets vazia.");
         }
         else{
            for(Pet p:pets){
               System.out.println(p.toString());
            }
         }
      }
      
      public static int codPet(){ // gera código para o Pet.
         return pets.size()+1;
      }
      
      
      public static void encerraProg(){ // Encerra programa.
         System.out.println("Programa encerrado.");
         System.exit(1);
      }
   }
}