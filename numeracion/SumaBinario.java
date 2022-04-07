import java.util.*;

public class SumaBinario{
  public static Scanner sc= new Scanner(System.in) ;

  public static String sumaBinario(String a, String  b){
    char [] aCadena = a.toCharArray();
    char [] bCadena = b.toCharArray();
    int [] resulado = new int [a.length()+1];
    String resultado="";
     int arrastre=0;
   for(int i=a.length()-1; i>=0; i--) {
     int c= Character.getNumericValue(aCadena[i]);
     int d= Character.getNumericValue(bCadena[i]);
     int cociente = (int)Math.floor((c+d+arrastre)/2);
     System.out.println("cociente"+i+cociente);
     resulado[i]= c+d+arrastre-2*cociente;
     System.out.println("resulado"+i+resulado[i]);
     arrastre = cociente;
     resultado +=""+resulado[i];
   }
   resultado += arrastre; 
   return resultado;
  }
}
