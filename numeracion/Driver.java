import java.util.*;

public class Driver{
  public static Scanner sc= new Scanner(System.in) ;

  public static void main(String[]arg){
    System.out.println("ingrese numeri");
   /* int num= sc.nextInt();
    int base = sc.nextInt();
    System.out.println(ToBase.toBase(num,base));*/
    System.out.println("Ingrese dos numeros binarios");
    String a= sc.next();
    String b= sc.next();
    System.out.println(SumaBinario.sumaBinario(a,b));
  }
}
