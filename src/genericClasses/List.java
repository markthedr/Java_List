package genericClasses;//have the T there that is a place holder where the data type will be used later on.

public class List<T> {
    private T[] datastore; //we know its going to be an array but it's not a data type.
    private int size;
    private int pos;

    //constructor

    public List(int numElements){
        size = numElements;
        pos = 0;
        datastore = (T[]) new Object[size]; //so we need to create an object array and then type cast it.
    }

    //we don't know what element we are going to use so use T
    public void add(T element){
        datastore[pos] = element;
        ++pos;
    }

    public String toString(){
        String elements = "";
        for(int i=0; i<pos; i++){
            elements += datastore[i] + " ";
        }
        return elements;
    }
}
