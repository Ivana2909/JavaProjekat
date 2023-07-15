public class Zadatak2 {

    //2) Napraviti funkciju koja prima niz celih brojeva i kao rezultat vraca nov niz gde je svaki
    //element pomnozen sa Pi

    public static double[] pomnozenoSaPI(int[] brojevi){
        final double PI=3.1415;
        double[] noviNiz=new double[brojevi.length];

        for(int i=0;i<noviNiz.length;i++){
            noviNiz[i]=brojevi[i]*PI;
        }
        return noviNiz;
    }
    public static void main(String[] args){

        int[] niz={1,2,1,5,10,1};
        double[] noviNiz=pomnozenoSaPI(niz);

        for(int i=0;i<noviNiz.length;i++){
            System.out.print(noviNiz[i] + " ,");
        }

    }
}
