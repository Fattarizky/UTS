/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Nomer_1BdanC {
    public static void printData(int[] data){
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
    }
    public static void Insertionsort(int[] data){
        for (int i=0; i<data.length-1; i++){
            int indexSmall = i;
            for (int j=i+1; j<data.length; j++){
                if (data[j] < data[indexSmall]){
                    indexSmall = j;
                }
            }
            int temp = data[i];
            data[i] = data[indexSmall];
            data[indexSmall] = temp;
        }
    }
     public static void binarySearch(int[] data, int key){
        int indexAwal = 0;
        int indexAkhir = data.length-1;
        int middle = 0;
        int found = 0;
        while((indexAwal<=indexAkhir) && (found == 0)){
            middle = (indexAwal+indexAkhir)/2;
            System.out.println("indeks pointer = "+middle);
            if (key == data[middle]){
                
                found = 1;
            }
            else{
                if (key < data[middle]){
                    System.out.println();
                    indexAkhir = middle-1;
                }
                else{
                    indexAwal = middle+1;
                }
            }
        }
        if (found == 1){
            System.out.println("data telah ditemukan");
        }
        else{
            System.out.println("data tidak ditemukan");
        }
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] nilai = {3,10,4,2,8,13};
        System.out.println("before");
        printData(nilai);
        Insertionsort(nilai);
        System.out.println("\nafter");
        printData(nilai);
        
        System.out.println("\nmasukan data yang ingin di cari:");
        int key = input.nextInt();
        
        binarySearch(nilai, key);
        
        System.out.println();
        System.out.println("Fattarizky Akbar Faturohman");
    }
    
}

