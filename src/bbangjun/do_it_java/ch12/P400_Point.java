package bbangjun.do_it_java.ch12;

public class P400_Point<T, V> {
    T x;
    V y;

    P400_Point(T x, V y){
        this.x=x;
        this.y=y;
    }

    public T getX(){
        return x;
    }

    public V getY(){
        return y;
    }
}
