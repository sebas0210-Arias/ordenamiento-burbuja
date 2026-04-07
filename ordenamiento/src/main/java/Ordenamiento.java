package com.mycompany.ordenamiento;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Ordenamiento {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Ingrese el tamaño de su arreglo?: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // datos por aleatoreo 
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(201) - 100; 
        }

        System.out.println("Arreglo inicial (Sin ordenar): " + Arrays.toString(arr));

        // Menu para el usuario
        System.out.println("\nSeleccione el método de ordenamiento:");
        System.out.println("1. burbuja");
        System.out.println("2. inserción");
        System.out.print("Ingrese su opcion: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                ordenar(arr);
                System.out.println("Se ordeno por Burbuja");
                break;

            case 2:
                ordenarInsercion(arr);
                System.out.println("Se ordeno por Insercion");
                break;

            default:
                System.out.println("Opción inválida");
                ordenar(arr);
        }

        // impresión del arreglo final
        System.out.println("Arreglo final: " + Arrays.toString(arr));

        sc.close();
    }

    // Método de burbuja (tipo selección)
    private static void ordenar(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] > v[j]) {
                    int w = v[j];
                    v[j] = v[i];
                    v[i] = w;
                }
            }
        }
    }

    // Método de ordenamiento por inserción
    // Es un algoritmo que ordena elementos uno por uno, comparando cada nuevo dato con los anteriores e insertándolo en su posición correcta


// para tener en cuenta 
// La diferencia clave es que la burbuja intercambia elementos adyacentes repetidamente hasta que los más grandes "flotan" al final,
// mientras que la inserción toma un elemento y lo "inyecta" directamente en su lugar correcto entre los que ya revisó