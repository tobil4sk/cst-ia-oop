package supo.week1;

class Vector2D {
	public int a;
	public int b;
	
	Vector2D(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	void print() {
		System.out.println(a + " " + b);
	}
	
	void add(Vector2D other) {
		this.a += other.a;
		this.b += other.b;
	}
}

public class Vectors {
    public static void test() {
    	Vector2D vector = new Vector2D(0, 2);
    	vector.add(new Vector2D(1, 1));
    	vector.print();
    }
}
