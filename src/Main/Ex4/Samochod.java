package Main.Ex4;

public class Samochod {
    int predkosc = 0;
    int maxPredkosc = 200;

    public  int przyspiesz(int v) throws MyException {

        predkosc += v;

        if( predkosc < 0 || predkosc > maxPredkosc){
            throw new MyException();
        }


        return predkosc;
    }
}