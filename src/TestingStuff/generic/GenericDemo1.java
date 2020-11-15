package TestingStuff.generic;

public class GenericDemo1<T> {
    private T t;
    protected void add(T t){
        this.t=t;
    }
    protected T get() {
        return t;
    }

    public static void main (String args[]){
        GenericDemo1<Integer> integerBox = new GenericDemo1<Integer>();
        GenericDemo1<String> stringBox = new GenericDemo1<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello World"));

        System.out.println("Gia tri integer la : "+ integerBox.get());
        System.out.println("Gia tri string la : "+ stringBox.get());
    }
}
