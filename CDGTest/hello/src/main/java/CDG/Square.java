package CDG;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public String print(int row) {
		// TODO Auto-generated method stub
		String result = "" ;
		String result1 = "" ;
		for(int i = 0;i<row; i++) {
		for(int u = 0;u<row; u++) {
			result += result1 + "*" ;
		}
		result += result1 + "\n" ;
		}
		System.out.println(result);
		return result;
	}
	

}
