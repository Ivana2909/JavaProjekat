import java.util.Scanner;

public class Zadatak3 {

    //3) Napraviti funkciju koja ce za prosledjeni String obrnuti redosled karaktera.

    public static String reverse(String rec){
        char[] podeljenaRec=rec.toCharArray();
        char[] obrnutiRedosled=new char[podeljenaRec.length];
        int br=0;
        for(int i=podeljenaRec.length-1;i>=0;i--){
            obrnutiRedosled[br]=podeljenaRec[i];
            br++;
        }
        String NovaRec=new String(obrnutiRedosled);
        return NovaRec;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Unesite neku rec");
        String rec=sc.nextLine();
        System.out.println(reverse(rec));


    }
}
