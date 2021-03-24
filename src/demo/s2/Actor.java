package demo.s2;

public class Actor<E> {
    E id;
    String name;

    void run(E x){
        id = x;
        System.out.println("x");
    }


    public void  abc(){
        name="nas";
    }
}