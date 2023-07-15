import java.util.Scanner;

public class Zadatak4 {

    //Napraviti funkciju koja ce primati niz Stringova, String koji zelimo da zamenimo, i String
    //sa kojim zelimo da ga zamenimo u tom nizu.

    public static void replaceWith(String[] niz, String oldString, String newString){
        String[] promenjenniz=new String[niz.length];
        for(int i=0;i<niz.length;i++) {
            if(!niz[i].equalsIgnoreCase(oldString)){
                promenjenniz[i] = niz[i];
            }else{
                promenjenniz[i]=newString;
            }
        }

            System.out.print("Promenjeni niz je: ");
        for (String i : promenjenniz) {
            System.out.print(i + " ,");
        }
        System.out.println();

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] niz={"Jelena","Ivana","Marija"};
        System.out.println("Unesite string koji zelite da zamenite: ");
        String stariString=sc.nextLine();
        System.out.println("Unesite string sa kojim zelite da zamenite stari string: ");
        String noviString=sc.nextLine();
        replaceWith(niz,stariString,noviString);

    }
}
