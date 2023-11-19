package supo.week3;

public class Car implements Comparable<Car> {
	private String manufacturer;
	private int age;
	

	public int compareTo(Car other) {
		int manufacturerComparison = manufacturer.compareTo(other.manufacturer);
		if (manufacturerComparison == 0) {
			return age - other.age;
		}
		return manufacturerComparison;
	}
	

	public Car(String string, int i) {
		manufacturer = string;
		age = i;
	}
	
	public static void test() {
        Car c1 = new Car("A", 10);
        Car c2 = new Car("B", 10);
        Car c3 = new Car("B", 11);
        System.out.println(c1.compareTo(c1) == 0);
        System.out.println(c1.compareTo(c2) < 0 );
        System.out.println(c2.compareTo(c1) > 0 );
        System.out.println(c2.compareTo(c3) < 0 );
        System.out.println(c3.compareTo(c2) > 0 );
	}
}
