package squares;

public class Squares_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x[] = { 0.0, 0.3, 0.5, 0.9, 1.0, 1.6, 2.2 };
		double y[] = { 1.0, 1.9, 3.2, 4.3, 4.8, 6.1, 7.2 };
		double theta[] = new double[2];

		Squares_lib slib = new Squares_lib(x, y);
		
		for(int i = 0; i < 100; i++){
			theta = slib.getDx();
			System.out.println(i+" : theta[0] = "+theta[0]);
			System.out.println(i+" : theta[1] = "+theta[1]);
			System.out.println(i+" : Objective function = "+slib.getObject());
		}

	}

}
/*
99 : theta[0] = 1.435569113499906
99 : theta[1] = 2.8386178797529382
99 : Objective function = 0.5385223577235781
y=2.839x+1.436

y=2.8386x+1.4356
*/
