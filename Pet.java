import java.io.Serializable;

public class Pet implements Serializable{
   private int codPet;
   private String nomePet;
   private String nomeDono;
   private String tipoPet;
   
   public Pet(int codPet, String nomeDono, String nomePet, String tipoPet){
      this.codPet=codPet;
      this.nomePet=nomeDono;
      this.nomeDono=nomePet;
      this.tipoPet=tipoPet;
   }
   public String getNomePet(){
      return nomePet;
   }
   public String getNomeDono(){
      return nomeDono;
   }
   public String getTipoPet(){
      return tipoPet;
   }
   
   StringBuffer buff = new StringBuffer();
   
   public String toString(){ //pode ser qualquer nome, o buff.toString é um atributo do buffer, o toString é o nome de um método.
      buff.append("Cod.:  ");
      buff.append(codPet);
      buff.append(" |");
      buff.append("Nome pet:");
      buff.append(nomePet);
      buff.append(" | Nome dono :  ");
      buff.append(nomeDono);
      buff.append("  | Tipo: ");
      buff.append(tipoPet);
      return buff.toString();
   }
}