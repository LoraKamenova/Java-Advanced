package Generics_Exercises.Generic_Count_Method_String;

public class Box<E extends Comparable<E>>  {
    private E element;

    public Box(E element) {
        this.element = element;
    }

    @Override
    public String toString(){
        return this.element.getClass().getName() + ": " + this.element;
    }

    public int compareTo(Box<E> o){
        return this.element.compareTo(o.element);
    }
}
