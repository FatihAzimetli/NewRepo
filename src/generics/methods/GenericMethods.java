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
        System.out.println("-------------VOID GENERIC------------");
        genericPrintArray(intArr);
        genericPrintArray(stringArr);
        genericPrintArray(doubleArr);
        System.out.println("===============T GENERIC==================");
        System.out.println("getFirst(intArr) = " + getFirst(intArr));
        System.out.println("getFirst(stringArr) = " + getFirst(stringArr));
        System.out.println("===============Two Param==================");
        printArrayAndValue(intArr,"generic");
        printArrayAndValue(stringArr,"Harika");




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
    // birden fazla parametreli generic metod
    public static <S,U> void printArrayAndValue (S[] arr, U value){
        //value=arr[0]; ---> iki farkli data tipi verdigimize tek dataya atamadi tür güvenligini korudu
        Arrays.stream(arr).forEach(t -> System.out.print(t + " "));
        System.out.println("================" +value);
        System.out.println();
    }

/*Java'da interface, bir sınıfın uygulamasını beklenen metotları tanımlayan bir sözleşme sağlayan bir yapıdır.
Temel amacı, kodun daha modüler ve esnek olmasını sağlamaktır. İşte bazı temel amaçları ve kullanım senaryoları:

Soyutlama (Abstraction): Interface'ler, bir nesnenin davranışlarını soyutlayarak, yalnızca belirli bir davranış
kümesini ifade eden metotları tanımlar. Bu sayede, bir sınıfın iç mantığı gizlenir ve
sadece gerekli olan işlevselliği ortaya çıkar.

Birden Çok Miras (Multiple Inheritance): Java, sınıflar arasında çoklu mirası desteklemez.
Ancak, bir sınıf birden fazla interface'i uygulayabilir.
 Bu, aynı anda birden fazla davranış kümesini sağlar.

Kodun Değişen Bir Parçasını Tanımlama: Interface'ler, bir sınıfın belirli bir davranış kümesini uygulamasını sağlar.
Eğer bu davranışlar ilerleyen zamanlarda değişirse, sadece ilgili interface'i güncellemek yeterli olacaktır.

Polimorfizmi Destekleme: Interface'ler, polimorfizmi destekler. Bir interface'i uygulayan bir sınıfın,
o interface tipine atanabilir olması, kodun daha genel ve esnek olmasına olanak tanır.

Kodun Test Edilebilirliği: Interface'ler, mock nesnelerin ve birim testlerin yazılmasını kolaylaştırır.
 Bir sınıfın belirli bir interface'i uygulaması, sınıfın bir davranış kümesini belirtir ve bu da
 sınıfın test edilebilmesini sağlar.*/

}
