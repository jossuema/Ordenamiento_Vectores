/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrdenarVectores;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author negri
 */
public class QuickSort {
     public static void main(String[] args) throws IOException {
        System.out.println("Ordenamiento de vector por metodo QuickSort");
        System.out.println("Ingrese los valores del vector");
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String buffer=br.readLine();
        String[] datos = buffer.split(" ");
        int[] list=new int[datos.length];
        for(int i=0; i<datos.length; i++){
            try{
		list[i] = Integer.parseInt(datos[i]);
            }catch(Exception ex){
		list[i] =0;
            }
	}
	list=quicksort(list,0,datos.length-1);
        System.out.print("Vector ordenado:\n[ ");
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }
        System.out.print("]");
    }
    public static int[] quicksort(int list[], int izq, int der) {
        int pivote=list[izq]; // tomamos primer elemento como pivote
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        int aux;
        while(i < j){                          // mientras no se crucen las búsquedas                                   
            while(list[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
                while(list[j] > pivote) j--;           // busca elemento menor que pivote
                    if (i < j) {                        // si no se han cruzado                      
                        aux= list[i];                      // los intercambia
                        list[i]=list[j];
                        list[j]=aux;
                    }
                }
   
            list[izq]=list[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
            list[j]=pivote;      // los menores a su izquierda y los mayores a su derecha
   
            if(izq < j-1)
                quicksort(list,izq,j-1);          // ordenamos subarray izquierdo
            if(j+1 < der)
                quicksort(list,j+1,der);          // ordenamos subarray derecho
        return list;
    }
}
