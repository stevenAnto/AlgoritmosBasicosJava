public class Test{
  public static void main(String a[]){
    System.out.println(suma(-5));

  }
  public static int suma(int n){
    System.out.println("1");
    if (n==0)return n;
    if(n>0)return suma(n-1)+n;
    return suma(n+1)+n;
  }
}
