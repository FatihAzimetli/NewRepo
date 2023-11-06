package generics.interfaces;
//1.kural : generic bur Interface implement ediyorsak Implement eden klasta  generic olmak zorunda
//2 .kural imlemet etmek sözlesme yapmak anlamina gelir ve klas bu sözlesmeye uymak zorundadir. ve bunlar Overied olular zorunlu olatak
public class GenericInterfaceImpl<T> implements GenericInterface<T> {
    @Override
    public void print(T value) {

    }

    @Override
    public T find() {
        return null;
    }

    @Override
    public String get(Integer x) {
        return null;
    }
}
