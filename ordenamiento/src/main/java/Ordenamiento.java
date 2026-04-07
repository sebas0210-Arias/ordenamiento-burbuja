import java.util.*;

public class Ordenamiento {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        
         System.out.println("De que tamaño sera el arreglo?");
         int n = sc.nextInt();
         
         int arr[] = new int[n];
         
         //Solicitar datos
          for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el Numero"+ i + ": ");
            arr[i] = sc.nextInt();
        }
        
        
        
        ordenar(arr);
        
        System.out.println(java.util.Arrays.toString(arr));
    }
    private static void ordenar(int v[]) {
        for (int i = 0; i < v.length-1; i++) {
            for (int j = i+1; j < v.length ; j++) {
                if (v[i] > v[j]) {
                    int w = v[j];
                    v[j] = v[i];
                    v[i] = w;
                }
            }
        }
    }
}