
import java.util.*;

public class Dibujitos{
  static Scanner sc= new Scanner(System.in);
  public static void main(String []argumentos){
    //    first();
    second();

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
      System.out.println("**");
    }
    for(int l=6 ; l>0;l--){
      for(int m=l; m>0;m--){
	System.out.print(" ");
      }
	System.out.println("**");
    }
  }
}
