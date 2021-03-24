package demo.s2;

public class Generic<K,V> {
    K key;
    V value;
    public <E> void demoGeneric(E e){
        System.out.println(e);
    }

    public <Y,N> void sayHello(Y y,N n){

    }
}