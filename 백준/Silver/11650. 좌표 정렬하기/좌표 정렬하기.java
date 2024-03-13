import java.util.*;

class Point {
    int x, y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class PointComparator implements Comparator<Point> {
    @Override
    public int compare(Point p1, Point p2) {
        if (p1.x == p2.x) {
            return Integer.compare(p1.y, p2.y);
        }
        return Integer.compare(p1.x, p2.x);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            points.add(new Point(x, y));
        }
        
        // 점들을 정렬
        Collections.sort(points, new PointComparator());
        
        // 결과 출력
        for (Point point : points) {
            System.out.println(point.x + " " + point.y);
        }
    }
}
