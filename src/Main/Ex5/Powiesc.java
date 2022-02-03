package Main.Ex5;

public class Powiesc extends Ksiazka{
    String bookContent = "lorem ipsum dolor sit amet";

    public void czytaniePowiesci(){
        System.out.println("Czytanie powiesci...");
        super.czytanie();
    }
}
