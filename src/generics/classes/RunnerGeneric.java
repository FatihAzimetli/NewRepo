package generics.classes;

import java.util.ArrayList;
import java.util.HashMap;

public class RunnerGeneric {
    public static void main(String[] args) {

        //Generic yapilarda hangi data tipini kullanacagimizda sonradan karar verebiliyoruz
        // sag tarafa data tipini yazmaya gerek yok

        GenericProduct <String> book = new GenericProduct<>();
        book.setCode("advjava");

        String str = book.getCode(); //CTE vermedi ve cast istemedi--CastExepsin vermedi
        System.out.println(str);

        GenericProduct<Integer> laptop = new GenericProduct<>();
        laptop.setCode(123);


        Integer integer = laptop.getCode();
        System.out.println(integer);

        GenericProduct <String> phone = new GenericProduct<>();
       // phone.setCode(123);// generikler tür güvenligi saglar . Bu istenilen seydir

        //GenericProduct<double> obj=new GenericProduct<double>();// sadece NON_PRIMITIV kullanilabilir
        ArrayList<String> list = new ArrayList<>();
       // list.add(123); //String disinda deger girilemez tür güvenligi

        HashMap<String,Integer> map = new HashMap<>();
        map.put("advJava",234);

        //======================================== COK PARAMETRELI KLAS OLUSTURMAK ================

        GenericClassTwoParam<Integer,String> mymap = new GenericClassTwoParam<>(11,"generic");

        GenericClassTwoParam<Integer,Integer> mymaps2 =  new GenericClassTwoParam<>(12,112);



    }
}
