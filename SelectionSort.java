/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrdenarVectores;

/**
 *
 * @author negri
 */
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
public class SelectionSort {
    public static void main(String[] args) throws IOException {
        System.out.println("Ordenamiento de vector por metodo SelectionSort");
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
	list=selectionsort(list);
        System.out.print("Vector ordenado:\n[ ");
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }
        System.out.print("]");
    }
    public static int[] selectionsort(int list[]) {
        for (int i = 0; i < list.length; i++) {
            for (int j = i; j < list.length; j++) {
                if (list[i] > list[j]) {
                    Integer aux = list[j];
                    list[j] = list[i];
                    list[i] = aux;
                }
            }
        }
        return list;
	        
    }
}
