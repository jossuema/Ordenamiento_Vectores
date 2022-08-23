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
 * @author Josue Malla
 */
public class MergeSort {
    public static void main(String[] args) throws IOException {
        System.out.println("Ordenamiento de vector por metodo MergeSort");
        System.out.println("Ingrese los valores del vector"); //Puede ingresar numeros seguidos separados por un espacio
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in)); //declaracion de objeto para lectura
        String buffer=br.readLine(); //lectura
        String[] datos = buffer.split(" "); //eliminacion de espacios y asignacion 
        int[] list=new int[datos.length]; 
        for(int i=0; i<datos.length; i++){
            try{
		list[i] = Integer.parseInt(datos[i]);
            }catch(Exception ex){
		list[i] =0;
            }
	}
	list = mergesort(list,0,datos.length-1);
        System.out.print("Vector ordenado:\n[ ");
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }
        System.out.print("]");
    }
    public static int[] mergesort(int list[],int izq, int der){
    if (izq < der){
            int m=(izq+der)/2;
            mergesort(list,izq, m);
            mergesort(list,m+1, der);                                                                                
            merge(list,izq, m, der);                                                                                 
        }
        return list;
    }
    public static void merge(int list[],int izq, int m, int der){
        int i, j, k;
        int [] B = new int[list.length]; 
        for (i=izq; i<=der; i++)                                            
            B[i]=list[i];
        i=izq; j=m+1; k=izq;
        while (i<=m && j<=der)                                      
            if (B[i]<=B[j])
                list[k++]=B[i++];
            else
                list[k++]=B[j++]; 
        while (i<=m)         
            list[k++]=B[i++]; 
    }
}
