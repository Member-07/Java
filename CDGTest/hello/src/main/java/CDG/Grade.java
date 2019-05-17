package CDG;

public class Grade {

	public static void main(String[] args) {

	}

	public String grade(int i) {
		// TODO Auto-generated method stub
		String result1 = ""; // Create a Scanner object

		if (i >= 80 && i <= 100) {
			result1 = "A";
			System.out.println(result1);
		} else if (i >= 70 && i <= 79) {
			result1 = "B";
			System.out.println(result1);
		} else if (i >= 60 && i <= 69) {
			result1 = "C";
			System.out.println(result1);
		} else if (i >= 50 && i <= 59) {
			result1 = "D";
			System.out.println(result1);
		} else if (i <= 49) {
			result1 = "F";
			System.out.println(result1);
		}

		return result1;
	}

}
