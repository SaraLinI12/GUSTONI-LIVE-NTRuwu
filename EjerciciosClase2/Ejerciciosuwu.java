
package EjerciciosClase2;
 
import java.util.Random;
 
public class Ejerciciosuwu {
 
    //1. Propiedades
    private int mat[][];
    private int cantFilas;
    private int cantCols;
 
    //2. Método Constructor
    public Ejerciciosuwu(int cantFilas, int cantCols) {
        this.cantFilas = cantFilas;
        this.cantCols = cantCols;
 
        llenarMatriz();
    }
 
    //3.  Métodos Set y Get
    public void setCantCols(int cantCols) {
        this.cantCols = cantCols;
    }
 
    public void setCantFilas(int cantFilas) {
        this.cantFilas = cantFilas;
    }
 
    public void setMat(int[][] mat) {
        this.mat = mat;
    }
 
    public void getMat() {
        for (int i = 0; i < cantFilas; i++) {
            for (int j = 0; j < cantCols; j++) {
                System.out.println(mat[i][j] + "\t");
            }
            System.out.println("");
        }
    }
 
    //4. Demás métodos
    public boolean buscarValor(int dato, int opc){
        boolean b = true;
        //......
        return b;
    }
 
    public void odenarMatriz(){
        //...
 
        getMat();
    }
 
    private void llenarMatriz(){
        mat = new int[cantFilas][cantCols];
        Random r = new Random();
        for (int i = 0; i < cantFilas; i++) {
            for (int j = 0; j < cantCols; j++) {
                mat[i][j] = r.nextInt(cantFilas*cantCols);
            }
        }
    }
 
}