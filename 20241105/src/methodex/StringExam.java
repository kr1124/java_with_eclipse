package methodex;

import java.io.*;

public class StringExam {
    public String getString(String str) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write(str + " : ");
		bw.flush();
		
		String temp = br.readLine();
		
		br.close();
		bw.close();
		
		return temp;
    }
	
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringExam se = new StringExam();
		String name = se.getString("¿Ã ∏ß");
		bw.write(name + "¥‘ æ»≥Á«œººø‰.");
		bw.flush();
		

		bw.close();
		
	}
}
