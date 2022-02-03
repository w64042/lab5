package Main;

public class Ex3 {
    void show(String str){
        System.out.println(str.length());
    }

    public static void main(String[] args) throws Exception{
    Ex3 ob=new Ex3();

//        ob.show("Ala ma kota");
//        ob.show(null);

    //3.2
        try{
            //3.1
        ob.show(null);

        }catch(NullPointerException ex){
            ex.printStackTrace(System.out);

            ex.fillInStackTrace(); //3.5
//            throw ex;//3.3
//            throw new Exception(); //3.6
            throw new Exception(ex);//3.7
        }
    }

}
//public class Zadanie3 {
//    void wypisz(String napis){
//        System.out.println(napis.length());
//    }
//    public static void main(String[] args) throws Exception {//pkt 6
//        try {//pkt 2
//            Zadanie3 ob1 = new Zadanie3();
//            //ob1.wypisz("ala ma kota");
//            ob1.wypisz(null);//pkt 1
//        }catch (NullPointerException ex){
//            ex.printStackTrace(System.out);
//            ex.fillInStackTrace();//pkt 5
//            //throw ex;//pkt 3
//            throw new Exception(ex); // pkt 6
//        }
//    }
//}