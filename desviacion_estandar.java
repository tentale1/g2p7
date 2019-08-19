import java.util.Scanner;

/**
 * Programa para hallar la desviacion_estandar
 * 
 * @author Sandra Martin, Israel Severiche, Jose Alvarez 
 * @version 20190817
 */
public class desviacion_estandar {
    static double numero;
    static double media;
    static double varianza;
    static double desviacion;
    static int n;
    public static void main(String[] args) {
       
        Scanner Teclado = new Scanner(System.in);
          
        System.out.println("Que cantidad de numeros va a calcular");
        n = Teclado.nextInt();
        
        double numeros [] = new double[n];
        for (int i = 0; i < n;i++){
            System.out.println("ingrese el número");
            numeros[i] = Teclado.nextDouble();
        }
        
        double suma = 0;
        for (double i: numeros){
            suma = suma +i;
        }
       
        media = suma / n;
        double sumatoria;
        for (int i=0; i < n; i++){
            sumatoria = Math.pow(numeros[i] - media,2);
            varianza = varianza + sumatoria;
        }
        
        varianza = varianza / (n-1);
        
        desviacion = Math.sqrt(varianza);
        double redondear = Math.rint(desviacion*100)/100;
        
        System.out.println("La desviacion estandar es = " + redondear );
        
    }
}