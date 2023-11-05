package generics.classes;

public class RunnerNonGeneric {
    public static void main(String[] args) {
        //iki farli object: book, laptop

        NonGenericProduct book = new NonGenericProduct();
        book.setCode("advjava");//kod degerini String ile set ettik


        NonGenericProduct laptop = new NonGenericProduct();
        laptop.setCode(123); //kod degerini int ile set ettik

        String str = (String) book.getCode(); // CTE aldik ve cast ettik
        System.out.println(str);

        String str2 = (String) laptop.getCode();//CTE aldik Cast yaptik
        System.out.println(str2); //Exception in thread "main" java.lang.ClassCastException:


    }
}
