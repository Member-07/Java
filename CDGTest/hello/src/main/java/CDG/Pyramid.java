package CDG;

public class Pyramid {

	public static void main(String[] args) {
		
	}

	public String print(int row) {
		// TODO Auto-generated method stub
		String x = "";
		  for (int i = 1; i <= row; i++) {
		   int top = 2*row-1;
		   int sharp = (top-(2*i-1))/2;
		   for(int i2 =0; i2 < sharp; i2++){
		         x  += "#";
		       }
		   for (int i3 = 1; i3 <= 2*i-1; i3++) {
		         x += "*";
		       }
		   
		   for(int i4=0; i4 < sharp; i4++){
		         x += "#";
		       }
		   x += "\n";
		   System.out.println(x);
		  }
		  return x;
		 }
	}


