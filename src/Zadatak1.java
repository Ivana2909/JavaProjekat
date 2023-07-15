public class Zadatak1 {

    //1) Napraviti funkciju koja kao argument prima niz Stringova, i String koji zelimo da lociramo
    //u tom nizu. Kao rezultat vratiti true/false ukoliko se nalazi/ne nalazi u nizu.

    public static boolean find(String rec, String[] niz) {
        for (int i = 0; i < niz.length; i++) {
            if (rec.equalsIgnoreCase(niz[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] niz={"Jelena", "Ivana", "Jovana"};
        String rec="ivana";
        System.out.println(find(rec,niz));


    }
}


