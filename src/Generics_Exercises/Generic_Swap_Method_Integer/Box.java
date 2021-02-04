package Generics_Exercises.Generic_Swap_Method_Integer;

public class Box <T> {

    private T element;

    public Box(T element) {
        this.element = element;
    }

    @Override

    public String toString(){
        return this.element.getClass().getName() + ": " + this.element;
    }
}
