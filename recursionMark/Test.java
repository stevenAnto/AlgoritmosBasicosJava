public class Test{
  public static void main(String a[]){
    System.out.println(suma(8));
    printDigit(1369);
    int [] numeros = new int [8];
    numeros[0]=4;
    numeros[1]=-3;
    numeros[2]=5;
    numeros[3]=-2;
    numeros[4]=-1;
    numeros[5]=2;
    numeros[6]=6;
    numeros[7]=-2;
    System.out.println("la suma maxima es: "+maxSumRec(numeros,0,numeros.length-1));
    //System.out.println("indice donde se encuentra: "+binarySearch(numeros,2));

  }
  public static int suma(int n){
    System.out.println("1");
    if (n==0)return n;
    if(n>0)return suma(n-1)+n;
    return suma(n+1)+n;
  }
  //el return vacio hace que corte el codigoi y no pase a la imprescion de los demas datos
  public static void printDigit(int n){
    if(n>=10){
      printDigit(n/10);
      return;
    } 
    System.out.print((char)('0'+(n%10)));
  }
  public static <E extends Comparable<E>> int binarySearch(E []a, E x){
    return binarySearch(a,x,0,a.length-1);
  }
  public static <E extends Comparable<E>> int binarySearch(E []a, E x,int  low,int high){
    System.out.println("bi1");
    if(low>high)return-1;
    int mid = (low +high)/2;
    if(a[mid].compareTo(x)<0)return binarySearch(a,x,mid+1,high);
    else if(a[mid].compareTo(x)>0)return binarySearch(a,x,low,mid-1);
    else return mid;
  }
  //Partimos el arreglo en dos, y podemos ver que se presentan tres casos.
  //caso 1 :  la susecion maxima se encuentra en la primera mitad
  //caso 2 : la sucesion maxima se encuentra en la segunda mitad
  //caso 3 :  la sucesion maxima se encuentra comenzando en la primera mitad y terminando la segunda mitad
  //Observamos que si se da el caso 3, entonces la sucesion si o si pasa el ultimo numero de la primera mitad y tambine por el primer numero de la segunda mitad. Es decir que aqui se puede usar dos ciclos consecutivos sin necesidad de usar dos ciclos anidados y asi bajar la complejidad
  //no nested
  //Aplicamos recursion para hallar el maximo de cada lado, dividiendo el problema en mitad y mitad, el caso base es cuando solo hay un solo elemento leftt==right. Cuando se llega al caso base, guardamos dicho resultado en una variable para luego compararlo con los otros lados y de esa manera determinamos el mayor de todos.
  public static int maxSumRec(int [] a, int left, int right){
    int maxLeftBorderSum = 0, maxRightBorderSum=0;
    int leftBorderSum = 0, rightBorderSum = 0;
    int center=(left +right)/2;


    //caso base, un solo elemento
    if(left == right){
      return a[left] > 0 ? a[left]:0;
    }
      int maxLeftSum = maxSumRec(a,left,center);
      int maxRightSum = maxSumRec(a,center+1,right);
      //Comenzamos a sumar de right to left
      for(int i=center; i>=left;i--){
	leftBorderSum += a[i];
	if(leftBorderSum > maxLeftBorderSum){
	  maxLeftBorderSum = leftBorderSum;
	}
      }
      //Comentazmo de left to right
      for(int i = center+1; i<=right; i++){
	rightBorderSum += a[i];
	if(rightBorderSum>maxRightBorderSum){
	  maxRightBorderSum = rightBorderSum;
	}
      }
      //La maxima suma de los bordes sera la suma de cada lado del borde
      int max = max3(maxLeftSum,maxRightSum,maxLeftBorderSum+maxRightBorderSum);
      System.out.println("el maximoL "+max);
      return max;
  }
  public static int max3(int a, int b, int c){
    int mayor = a;
    if(b>mayor) mayor = b;
    if(c>mayor) mayor = c;
    return mayor;
  }
}
