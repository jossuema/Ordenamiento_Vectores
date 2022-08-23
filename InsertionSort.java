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
public class InsertionSort {
    public static void main(String[] args) throws IOException {
        System.out.println("Ordenamiento de vector por metodo InsertionSort");
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
	list=insertionsort(list);
        System.out.print("Vector ordenado:\n[ ");
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }
        System.out.print("]");
    }
    public static int[] insertionsort(int list[]) {
        for(int i=1; i<list.length; i++) {
            int temp = list[i];
            int Izq = 0;
            int Der = i-1;
            while(Izq<=Der){
                int Medio = (Izq+Der)/2;
                if (temp < list[Medio])
                    Der = Medio - 1;
                else
                    Izq = Medio + 1;
                }
                for (int j=i-1; j>=Izq; j--){
                list[j+1]=list[j];
            }
            list[Izq] = temp;
        }  
        return list;
    }
}

