package project1;

public class AreaOfOverlappingRectangle {
	static class Point {
		int x;
		int y;
	}

	public static boolean isOverlapping(Point l1, Point l2, Point r1, Point r2) {
		if (r1.y < l2.y || l2.y > r1.y)
			return false;
		if (r1.x < l2.x || l2.x > r1.x)
			return false;
		return true;

	}

	public static void areaOfRectangle(Point l1, Point l2, Point r1, Point r2) {
		int area1 = Math.abs(l1.x - r1.x) * Math.abs(l1.y - r1.y);
		int area2 = Math.abs(l2.x - r2.x) * Math.abs(l2.y - r2.y);
		int areaI = (Math.min(r1.x, r2.x) - Math.max(l1.x, l2.x)) * (Math.min(r1.y, r2.y) * Math.max(l1.y, l2.y));
		int areaR = area1 + area2 - areaI;
		System.out.println();
	}

	public static void main(String[] args) {
		Point l1 = new Point();
		Point r1 = new Point();
		Point l2 = new Point();
		Point r2 = new Point();

		l1.x = 2;
		l1.y = 2;
		r1.x = 5;
		r1.y = 7;
		l2.x = 3;
		l2.y = 4;
		r1.x = 6;
		r1.x = 9;
		if (isOverlapping(l1, l2, r1, r2)) {
			System.out.println("overlapping");
		} else {
			System.out.println("not overlapping");
		}

	}

}
