package Main.Ex5;

public class Podrecznik extends Ksiazka {
    String content = "Lorem ipsum, podrecznik";

    public void czytaniePodrecznika(){
        System.out.println("Czytanie podrecznika");
        super.czytanie();
    }

}