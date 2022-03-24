import java.util.*;

public class  NumerosPrimos{
  static Scanner sc= new Scanner(System.in);
  public static void main(String []arg){
    System.out.println("ingrese su numero");
    int num=sc.nextInt();
    System.out.println(factoresPrimos(num));
    //System.out.println("es primo?"+isPrimo(num));
    //functionDispersion(num);
    //cifradoCesar();



  }
  public static void  functionDispersion( int numModulo){
    for (int i=0;i<=10
	;i++){
      System.out.println(i+" "+(i%numModulo));
    }
  }
  public static ArrayList<Integer>  factoresPrimos(int num){
    ArrayList<Integer> listaDivisores = new  ArrayList<Integer>();
    int contador=0;
    int divisor=-1;
    for (int i=2;i<num;i++){
      if(num%i==0){contador++;
	if(isPrimo(i))listaDivisores.add(i);
	}

      
    }
    return listaDivisores;
  }
  public static  boolean  isPrimo(int num){
    boolean noIsPrimo=true;
    int i=2;
    while(i<num && noIsPrimo){
      int evaluar= num%i;
      if(evaluar==0)noIsPrimo=false;
      System.out.println("contador"+i);
      i++;
    }
    if(i==num) return true;
    else {return false;}
  }

  public static void  cifradoCesar(){
    int imagen;
    for (int i=1;i<=30;i++){
      imagen = (8*i+3);
      imagen = imagen%27;
      System.out.println(i+"=====>"+ imagen);
    }
  }
}
