package Generics2;

public class Tuple <X, Y>{
    private final X x;
    private final Y y;

    public Tuple(X x, Y y){
        this.x = x;
        this.y = y;
    }

    public X getX(){
        return x;
    }

    public Y getY() {
        return y;
    }
    public void showTypes(){
        System.out.println("Types of X is " + x.getClass().getName() + " and Value: "+ x);
        System.out.println("Types of Y is "+y.getClass().getName() + " and Value: "+y);
    }
}
