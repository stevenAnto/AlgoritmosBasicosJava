
import java.util.*;

public class Algoritmos2{
  static Scanner sc= new Scanner(System.in);
  public static void main(String []argumentos){
    //int []listaNumeros= {1,2,3,5,6,7,8,10,12,13,15,16,18,19,20,22};
    int buscar;
    int num;
    /* String cadenaTexto;
       System.out.println("Ingrese la palbra");
       cadenaTexto=sc.nextLine();*/
    //System.out.println(longesWord(cadenaTexto));
    System.out.println("Ingrese el numero de datos\n");
    num=sc.nextInt();


    int listaNum[]=pedirDatos(num);

    System.out.println("Este es su listaa inicial\n");
    mostrar(listaNum);
    System.out.println("\nel primer decreciente"+ejercicio33(listaNum));

    System.out.println("Este es el primer termino repetido"+repeatFirst(listaNum));
    System.out.println("Esta es la moda"+valorModa(listaNum));
    // mostrar(insertionRight(7,listaNum));
    //isPalindromo(listaNum);
    //System.out.println("IsPalindromo"+isPalindromo(listaNum));
    //    System.out.println("potencia de "+ potencia(2,3));

    //		bubleSort(listaNum);
    /*  bestBubleSort(listaNum);

	System.out.println("Lista ordenado MEJORADO");
	mostrar(listaNum);
	insertionSort(listaNum);*/
    seleccion(listaNum);
    System.out.println("Lista ordenado por seleccion");
    mostrar(listaNum);
    //System.out.println("esta es la mayor diferencia"+mayorDiferencia(listaNum)+"\n");
    //mostrar(contadorDuplicados(listaNum));
    //
    //System.out.println("este es el ultimo numero par"+ultimoEntero(listaNum));

    System.out.println("\nordenado\n");
    mostrar(listaNum);
    System.out.println();
    System.out.println("ingrese el numero para a buscar\n");
    buscar=sc.nextInt();
    System.out.println(busquedaTernaria(buscar,listaNum));
    // System.out.println(busquedaBinaria(buscar,listaNum));


  }
  public static int []seleccion(int []lista){
    for (int i = lista.length;i>0;i--){
      for (int j = lista.length-1;j>lista.length-i;j--){
	  System.out.println("j"+lista[j]);
	  System.out.println("j-1"+lista[j-1]);
	if(lista[j]<lista[j-1]){

	  int m= lista[j];
	  lista[j]=lista[j-1];
	  lista[j-1]=m;
	}
	mostrar(lista);
      }
    }
    return lista;
  }
  public static int []bestBubleSort(int []lista){
    boolean completado=false;
    int i=0;
    while(i<lista.length && completado==false){
      for(int j=0; j<lista.length-1-i;j++){
	completado=true;
	if(lista[j]>lista[j+1]){
	  completado=false;
	  int provi=lista[j];
	  lista[j]=lista[j+1];
	  lista[j+1]=provi;
	}
      }

    }
    return lista;
  }
  public static int ejercicio33(int []a){
    int local=0;
    int i =1;
    while(i<a.length&local==0){
      if(a[i]<a[i-1])local=i;
      else{i++;}
    }
    return local;
  }
  public static int potencia(int x, int n){
    int power=1;
    for(int i=0; i<n;i++){
      power=power*x;
    }
    return power;
  }
  public static int repeatFirst(int []a){
    int local=0;
    int i=1;
    while(i<a.length &&local==0){
      int j=0;
      while(j<i && local==0){
	//System.out.println("entro");
	if(a[i]==a[j])local=i;
	j++;
      }i++;
    }
    return local;
  }
  public static int  busquedaTernaria(int x,int []listaNumeros){//
    int i,j;
    int local=-1;
    i=0;
    j=listaNumeros.length;
    int  u,l=0;
    while(i<j-1){
      l=(int) Math.floor((i+j)/3);
      u=(int) Math.floor((2*(i+j))/3);
      if(x>listaNumeros[u]){
	i=u+1;
      }else if(x>listaNumeros[l]){
	i=l+1;
	j=u;
      }	
      else{
	j=l;
      }
    }
    if(x==listaNumeros[i]){
      local=i;
    }
    else if(x==listaNumeros[l]){
      local =j;
    }
    else{
      local =-1;
    }
    return local;
  }
  public static int valorModa(int []a){
    int contadorModos=0;
    int i=0;
    int moda=0;
    while(i<a.length){
      int num=a[i];
      int contador=0;
      while(i<a.length&& a[i]==num){
	contador++;
	i++;
      }
      if (contador>contadorModos){
	contadorModos=contador;
	moda=num;
      }
    }return moda;
  }
  public static boolean isPalindromo(int []a){
    int k=0; //contador de iteraciones
    for(int i=0;i<Math.floor(a.length/2);i++){
      if (a[i]!=a[a.length-1-i]) return false;
      k++;
      System.out.println("entro"+k);
    }
    System.out.println("contador"+k);
    return true;
  }
  public static int ultimoEntero(int []a){
    int k=0; //contador
    int ultimoPar=0;
    for (int i=0;i<a.length;i++){
      if(a[i]%2==0)ultimoPar=a[i];
      k++;
    }
    if(k==0)return ultimoPar;
    else return k;

  }
  public static int [] contadorDuplicados(int []sortA){ //Se puede mejorar haciendo un ArrayLista
    int []listaDuplicados=new int [sortA.length];
    int k=0; //contador de duplicados
    int j=1;
    while (j<=sortA.length-1){

      if(sortA[j]==sortA[j-1]){
	listaDuplicados[k]=sortA[j];
	k++;
	while (j<=sortA.length-1&&sortA[j]==listaDuplicados[k]){
	  j++;
	}

      }
      j++;
    }return listaDuplicados;
  }
  public static int mayorDiferencia(int [] a){
    int diferencia,mayor=0;
    System.out.println("A"+(3-4));
    for(int i=1; i <a.length; i++){
      diferencia=a[i]-a[i-1];
      System.out.println("dif"+a[i]+a[i-1]+diferencia);
      if (diferencia>mayor)mayor=diferencia;

    }return mayor;


  }
  public static double  busquedaBinaria(int x,int []listaNumeros){//Dicho codigo se hizo un poco diferente, pero al parece si devuelve el resultado espero.
    int i,j;
    int local=-1;
    i=0;
    j=listaNumeros.length;
    int  m;
    while(i<j){
      m=(int) Math.floor((i+j)/2);
      if(x>listaNumeros[m])i=m+1; 
      else j=m;
    }
    if(x==listaNumeros[i]){
      local=i;
      return local;
    }else{
      return -1;
    }
  }
  public static int [] pedirDatos(int num){
    int []listaNum=new int[num];
    int i=0;
    int q;
    do{
      System.out.print("Ingrese un dato");
      q=sc.nextInt();
      listaNum[i]=q;
      i++;
    }while(i<num);
    return listaNum;


  }
  public static int []bubleSort(int []lista){
    for(int i=0; i<lista.length-1;i++){
      for(int j=0; j<lista.length-1-i;j++){
	if(lista[j]>lista[j+1]){
	  int provi=lista[j];
	  lista[j]=lista[j+1];
	  lista[j+1]=provi;
	}	
      }
    }
    return lista;
  }
  public static void intercambiar(int a, int b){
    int c;
    c=a;
    a=b;
    b=c;

  }
  public static void mostrar(int []lista){
    for(int i=0; i<lista.length;i++){
      System.out.print(lista[i]+",");
    }

  }
  public static void mostrarChar(char []lista){
    for(int i=0; i<lista.length;i++){
      System.out.print(lista[i]+",");
    }
  }
  public static int []insertionSort(int []disArray){
    for(int i=1; i<disArray.length;i++){
      int j=0;
      while(disArray[i]>disArray[j]){
	j++;
      }
      int m=disArray[i];

      for(int k=0;k<i-j;k++){
	disArray[i-k]=disArray[i-k-1];

      }
      disArray[j]=m;
    }
    return disArray;
  }
  public static int []insertionRight(int x,int []listaOrdenada){
    int []nuevaLista = new int[listaOrdenada.length+1];
    for(int i=0; i<listaOrdenada.length;i++){
      if(x<=listaOrdenada[i]){
	nuevaLista[i]=x;
	for (int k=i;k<listaOrdenada.length;k++){
	  nuevaLista[k+1]=listaOrdenada[k];
	}i=listaOrdenada.length;
      }else nuevaLista[i]=listaOrdenada[i];
    }
    return nuevaLista;
  }
  public static int []insertionRight2(int x,int []listaOrdenada){
    int []nuevaLista = new int[listaOrdenada.length+1];
    for(int i=0; i<listaOrdenada.length;i++){
      if(x<=listaOrdenada[i]){
	nuevaLista[i]=x;
	for (int k=i;k<listaOrdenada.length;k++){
	  nuevaLista[k+1]=listaOrdenada[k];
	}i=listaOrdenada.length;
      }else nuevaLista[i]=listaOrdenada[i];
    }
    return nuevaLista;
  }
  public static String largestWord(String p){
    String maxword="";
    int maxlength=0;
    char []arrayChar;
    arrayChar=p.toCharArray();
    String word="";
    mostrarChar(arrayChar);
    System.out.println();
    for (int i =0;i< arrayChar.length;i++){

      word+=arrayChar[i];
      if (arrayChar[i]==' '||i==arrayChar.length-1){
	//	System.out.println("entro"+i+word);
	int length = word.length();
	if(length>=maxlength){
	  maxlength= length;
	  maxword=word;
	}
	word="";	
      }

    }
    return maxword;
  }
  public static String longesWord(String p){
    String maxword="";
    int maxlength=0;
    char []arrayChar;
    int i=0;
    arrayChar=p.toCharArray();
    mostrarChar(arrayChar);
    System.out.println();
    while(i<arrayChar.length){
      String word="";
      int length=0;
      while(arrayChar[i]!=' ' && i<arrayChar.length){
	length++;
	word+=arrayChar[i];
	i++;
      }
      if(length>maxlength){
	maxlength=length;
	maxword=word;
      }
      i++;
    }

    return maxword;
  }
}
