package objects.staticFactories;

import java.util.HashMap;
import java.util.HashSet;

public class Point {
    private final int x;
    private final int y;

    private static HashMap<String, Point> points = new HashMap<>();

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point newPoint(int x, int y){
        String key=x+"-"+y;
        if(!points.containsKey(key)){
            points.put(key, new Point(x,y));
        }
        return points.get(key);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
