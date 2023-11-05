package generics.methods;

import java.util.Arrays;

public class GenericMethods {
    public static void main(String[] args) {

        Integer [] intArr = {2,3,4,45,23};
        Double []  doubleArr = {3.2,4.4,2.8,99.5,0.5};
        String [] stringArr = {"Java","generics","hayatimizi","kolaylastirir"};
        printArr(intArr);//2 3 4 45 23
        printArr(doubleArr);
        printArr(stringArr);
        System.out.println("-------------------------");
        genericPrintArray(intArr);
        genericPrintArray(stringArr);
        genericPrintArray(doubleArr);
        System.out.println("=================================");
        System.out.println("getFirst(intArr) = " + getFirst(intArr));
        System.out.println("getFirst(stringArr) = " + getFirst(stringArr));


    }

    // Eraylari yazdirmak icin medot tanimlayin
    public static void printArr (Integer[] arr){
        Arrays.stream(arr).forEach(t-> System.out.print(t+" "));
        System.out.println();
    }
    //overloading
    public static void printArr (Double[] arr) {
        Arrays.stream(arr).forEach(t -> System.out.print(t + " "));
        System.out.println();
    }
    //overloading
    public static void printArr (String[] arr) {
        Arrays.stream(arr).forEach(t -> System.out.print(t + " "));
        System.out.println();
    }

    //generik metog
    public static<T> void genericPrintArray(T[] arr){
        Arrays.stream(arr).forEach(t -> System.out.print(t + " "));
        System.out.println();
    }

    //geriye sonuc döndüren generik method
    public static  <T> T getFirst (T[] arr) {
       T first =  arr[0];
       return first;
    }



}
