package generics.classes;
//generic olarak sadece non-primitive data tipleri kullanilir
// generik olarak PRIMITIVE DATA TIPLERI KULLANILMAZ
public class GenericProduct <T>{

    /*
    * E --> ELEMENT
    * K --> KEY
    * V -->vALEU
    * N --<NUMBER
    * T --> TYPE
    * S;U;V  BENZERLERI ---> 2,3,4 tipler icin*/

    private T code;

    // getter -- setter


    public T getCode() {
        return code;
    }

    public void setCode(T code) {
        this.code = code;
    }
}
