package Exerc1;

    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.io.IOException;

public class JavaApplication1 {
   
   public static void main(String[] args) {    
      BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
      String nota1="",nota2="",nota3="";
      Double soma=0.;      
      for (int i=1;i<=3;i++){
        System.out.print("Entre com a nota: ");       
        try{
            nota1=dataIn.readLine();          
           } catch (IOException e) {
        System.out.println("Error!");
        }
       soma=soma+Double.valueOf(nota1);
      }
      soma=soma/3;
      String carinha;
      if (soma>6)
          carinha=":-)";
      else
          carinha=":-(";
      System.out.println("MEDIA: "+soma+"  "+carinha+"!");
      
   }
    
}
