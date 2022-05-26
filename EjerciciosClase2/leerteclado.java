package EjerciciosClase2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class leerteclado {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos
    public int  print(String mensaje, int valor) {
        System.out.println(mensaje+":");
        try {
            valor=Integer.parseInt(br.readLine());
        }
        return 0;
    }
    public String print(String mensaje, String valor) {
        return "0";
    }
    public float print(String mensaje, float valor) {
        return 0;
    }
    public double print(String mensaje, double valor) {
        return 0;
    }
    public boolean print(String mensaje, boolean valor) {
        return true;
    }
}
