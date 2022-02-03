package Main.Ex4;

public class Ciezarowy extends  Samochod {
    @Override
    public int przyspiesz(int v) throws MyException {
        if( v % 2 == 0){
            try{

                predkosc = maxPredkosc/v;

            }catch ( ArithmeticException e){

                System.out.println("ArithmeticException tutaj");

            }
        }else{
            super.przyspiesz(v);
        };
        return predkosc;

    }
}