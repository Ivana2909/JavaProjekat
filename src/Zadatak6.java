import java.util.Scanner;

public class Zadatak6 {
    //Napraviti funkciju koja prima dva niza celih brojeva(ne moraju da budu iste velicine),
    //porediti svaki broj na istoj poziciji i u zavisnosti od toga koji je veci dodati ga u rezultujuci
    //niz, ako jednom nizu ponestane elemenata za poredjenje sa drugim nizom, samo ispisati
    //preostale elemente.

    public static int[] najveci(int[] niz1, int[] niz2) {
        int[] noviNiz;
        int[] manji;
        int[] veci;
            if(niz1.length<niz2.length){
                noviNiz=new int[niz2.length];
                manji=niz1;
                veci=niz2;
            }else{
                noviNiz=new int[niz1.length];
                manji=niz2;
                veci=niz1;
            }
            int brojac=0;
            for(int i=0;i< noviNiz.length;i++){
                if(i< manji.length){
                    if(manji[i]>veci[i]){
                        noviNiz[i]=manji[i];
                    }else{
                        noviNiz[i]=veci[i];
                    }
                }else{
                    noviNiz[manji.length + brojac] = veci[i];
                    brojac++;
                }
            }
        return noviNiz;
    }
            public static void main (String[]args){
                Scanner sc = new Scanner(System.in);
                int[] niz1 = {1, 10, 3, 4, 8,-10,8,3,23};
                int[] niz2 = {2, 3, 4, 5, 6,-3,-9,35};

                int[] noviNiz = najveci(niz1, niz2);

                for (int i : noviNiz) {
                    System.out.print(i + " ,");
                }
                System.out.println();
            }
        }
