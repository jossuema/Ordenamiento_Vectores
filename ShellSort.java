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
public class ShellSort {
    public static void main(String[] args) throws IOException {
        System.out.println("Ordenamiento de vector por metodo ShellSort");
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
	list=shellsort(list);
        System.out.print("Vector ordenado:\n[ ");
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }
        System.out.print("]");
    }
    public static int[] shellsort(int list[]) {
        int salto, aux, i;
        boolean cambios;
  
        for (salto = list.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {                                          
                cambios = false;
                for (i = salto; i < list.length; i++) 
                {
                    if (list[i - salto] > list[i]) {      
                        aux = list[i];                 
                        list[i] = list[i - salto];
                        list[i - salto] = aux;
                        cambios = true;                                                
                    }
                }
            }
        }
        return list;
    }
}
