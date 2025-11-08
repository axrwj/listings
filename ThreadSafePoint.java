// пример атомарных операций
public class ThreadSafePoint {
    private int x; // координата x
    private int y; // координата y
    
    public int getX() {
        return this.x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public void setY(int y) {
        this.y = y;
    }
} // ThreadSafePoint class
