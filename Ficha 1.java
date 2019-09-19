//Ex 7
class Main {

  public static int CalcularPerimetro(int L, int C) {
    int perimetro = 2*(L + C);
    return perimetro;
  }
  public static void main(String[] args) {
      int L = 3;
      int C = 5;
      int P = CalcularPerimetro(L, C);
      System.out.println(P);  
    }
}

//Ex 8
class Main {

  public static int CalcularVolume(int L, int C, int A) {
    int volume = C*L*A;
    return volume;
  }
  public static void main(String[] args) {
      int L = 3;
      int C = 5;
      int A = 2;
      int V = CalcularVolume(L, C, A);
      System.out.println(V);  
    }
}

//Ex 9

class Main {

  public static float CalcularCelsius(int F) {
    float celsius = (F-32)*5/9;
    return celsius;
  }
  public static void main(String[] args) {
      int F = 190;
      float C = CalcularCelsius(F);
      System.out.println(F + " em fahrenheit, e igual a "+ C +" celsius");  
    }
}

//Ex 10

class Main {

  public static String CalcularIntervalo( String t1,  String t2) {
    String[] temp1 = t1.split(":");
    return temp1;
  }
  public static void main(String[] args) {
       String t1 = "17:00";
       String t2 = "23:30";
      String I = CalcularIntervalo(t1,t2);
      System.out.println(I);  
    }
}