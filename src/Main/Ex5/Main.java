package Main.Ex5;

public class Main {
    public static void main(String[] args) {

        Klient klient=new Klient("Witold","Andreasik",21);
         System.out.println(klient.getImie());

        System.out.println(klient.getNazwisko());

        System.out.println(klient.getWiek());

        Powiesc powiesc = new Powiesc();

        Ksiazka ksiazka;

        ksiazka = (Ksiazka)powiesc;

        powiesc.czytaniePowiesci();

        ksiazka.bookContent = "Ksiazka content";

        ksiazka.czytanie();
    }
}
