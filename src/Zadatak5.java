public class Zadatak5 {
    //Napraviti funkciju koja prima String, String zapis ce biti u vidu nekog broja(npr "123",
    //"741",..), funkcija treba ovaj String da pretvori u ceo broj i da ispise svaki broj koji je deljiv
    //sa tim brojem.

    public static void deljivSa(String broj){
        int n=Integer.parseInt(broj);
        for(int i=1;i<=n;i++){
            if(n%i==0) {
                System.out.println(i);
            }
            }
        }
        public static void main(String[] args){
        String broj="21";
        deljivSa(broj);
    }

}
