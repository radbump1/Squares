package squares;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Squares_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double x[] = { 0.0, 0.3, 0.5, 0.9, 1.0, 1.6, 2.2 };
		//double y[] = { 1.0, 1.9, 3.2, 4.3, 4.8, 6.1, 7.2 };
		double theta[] = new double[2];
		Squares_main smain = new Squares_main();
		double x[] = smain.getCSV1("csv/x.csv", 7);
		double y[] = smain.getCSV1("csv/x.csv", 7);
		double value[] = new double[100];
		
		Squares_lib slib = new Squares_lib(x, y);
		for(int i = 0; i < 100; i++){
			theta = slib.getDx();
			System.out.println(i+" : theta[0] = "+theta[0]);
			System.out.println(i+" : theta[1] = "+theta[1]);
			System.out.println(i+" : Objective function = "+slib.getObject());
			value[i] = slib.getObject();
		}
		Graph graph = new Graph(value);
	    graph.setBounds(5,5,655,455);
	    graph.setVisible(true);

	}

	public double[] getCSV1(String path, int n) { //CSV����1�����f�[�^��荞��(n:�f�[�^��)
	    //CSV�����荞��
	    double csvdata[] = new double[n];
	    try {
	        File f = new File(path);
	        BufferedReader br = new BufferedReader(new FileReader(f));
	             
	        String[] data = new String[n];
	        String line = br.readLine();
	        data = line.split(",", 0);
	        line = br.readLine();
	        br.close();
	        
	        // CSV����ǂݍ��񂾔z��̒��g����荞��
	        for(int i = 0; i < data.length; i++) {
	            csvdata[i] = Double.parseDouble(data[i]);
	        }

	    } catch (IOException e) {
	        System.out.println(e);
	    }
	    System.out.println("CSV��荞�� = "+Arrays.toString(csvdata));
	    return csvdata;
	    //CSV�����荞�݂����܂�
	}
	
}


/*
99 : theta[0] = 1.435569113499906
99 : theta[1] = 2.8386178797529382
99 : Objective function = 0.5385223577235781
y=2.839x+1.436

���_�ly=2.8386x+1.4356
*/
