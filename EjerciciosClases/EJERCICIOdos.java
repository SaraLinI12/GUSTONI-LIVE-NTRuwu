package EjerciciosClases;
import java.math.BigInteger;
import java.util.Scanner;

public class EJERCICIOdos {
    
    static Scanner leerT=new Scanner(System.in);

    public static void factorialXnum() {
        int n;
        long result=1;
        System.out.println("Ingrese un numero:");
        n=leerT.nextInt();
        if(n>1){
        for (int i = 1; i < n; i++) {
            result=result*i; 
            }
        }
        System.out.println("El factorial de "+n+" es:"+result);
    }
    public static BigInteger factorialNumBig(int n) {
      BigInteger result=new BigInteger(val:"1");
      if(n>1){
          result=result.multiply(new BigInteger(String.valueOf(i)));
      }
      return result;

    }
    

    public static void main(String[] args) {
        /*factorialXnum();
        long resultado=factorialNum(5);
        System.out.println("Resultado:"+resultado);*/
        System.out.println("Ingrese un numero:");
        int numero=leerT.nextlnt();
        for (int i = 1; i <= 10; i++) {
            System.out.println("Factorial de "+i+"! =" + factorialNumBig(i));
        }




    }
}
