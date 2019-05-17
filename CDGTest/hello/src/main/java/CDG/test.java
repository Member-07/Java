package CDG;

class  person {
	private static String name;

	person (String newname) {
		name = newname;
	}

	public static String getname() {
		return name;
	}

	public static void setname(String val) {
		name = val;
	}

}

public class test {
	public static void swap(person p1, person p2) {
		person temp = p1;
		p1 = p2;
		p2 = temp;
		// identityHashCode
		System.out.println("Position : " + System.identityHashCode(p1));
		System.out.println("Position : " + System.identityHashCode(p2));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person person1 = new person("John");
		person person2 = new person("Pual");
//		person person3 = new person("");
		System.out.println(person1.getname() + ":" + person2.getname());
		;
		swap(person1, person2);
		System.out.println(person1.getname() + ":" + person2.getname());
		person1 = null ;
		person1.getname();
		System.out.println(person1.getname());
	
	
	}
	
}
/*******testlocalvariable*********/
//public class test {
//	private double mark1, mark2, mark3;
//	private double maxmark = 100;
//	double avg = 0;
//	public double getAverage() {
//		mark1 = 100 ;
//		avg = ((mark1+mark2+mark3)/(maxmark*3))*100;
//		return avg ;
//	}
//	public void setAverage(double val) {
//		 avg = val ;
//	}
//	public static void main(String[] args) {
//		test st = new test();
//		st.setAverage(100d);
//		System.out.println(st.getAverage());
//	}
//}
