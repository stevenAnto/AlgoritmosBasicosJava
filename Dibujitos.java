
import java.util.*;

public class Dibujitos{
  static Scanner sc= new Scanner(System.in);
  public static void main(String []argumentos){
    //    first();
    second();
    mostrarMatriz(figureMatriz(19,19));

  }
  public static void first(){
    for(int i =0; i<6;i++){
      for(int k=0;k<i;k++){
	System.out.print(">");
      }
      System.out.print("\n");

    }
  }
  public static void second(){
    for(int i =0; i<6;i++){
      for(int k=0;k<i;k++){
	System.out.print(" ");
      }
      System.out.println(" ** ");
    }
    for(int l=6 ; l>0;l--){
      for(int m=l; m>0;m--){
	System.out.print(" ");
      }
      System.out.println("**");
    }
  }
  public static String [][] figureMatriz(int a, int b){
    String  [][] matriz= new String [a][b];
    int contador=0;
    int numeroMedio= matriz.length/2;
    for(int i =0;i<matriz.length;i++){
      for(int j =0;j<matriz[i].length;j++){
	if(i==numeroMedio||j==numeroMedio){
	  matriz[i][j]="*";
	}

      }
    }
  return matriz;
  }
public static void mostrarMatriz(String [][]a){
  for(int i =0;i<a.length;i++){

    for(int j =0;j<a[i].length;j++){
      if(a[i][j]!= null){
	System.out.print(a[i][j] );

      }
      else {System.out.print(" ");}
    }
    System.out.print("\n");
  }
}
}
