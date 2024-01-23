package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main3_06 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	      
	    String s = br.readLine();
	    int n = Integer.parseInt(s);
	    for(int i = 0; i < n; i++) {
	    	String line = br.readLine();
	        String[] list = line.split(" ");
	        int one = Integer.parseInt(list[0]);
	        int two = Integer.parseInt(list[1]);
	        int sum = one + two;
	        bw.write(""+sum);
	        bw.newLine();
	    }
	    bw.newLine();
	     
	    br.close();
	    bw.close();
	}
}
