package methodex;

import java.io.*;

public class SuExam {
    public int getInt(String str) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write(str + " : ");
		bw.flush();
		
		String temp = br.readLine();
		
		br.close();
		bw.close();
		
		return Integer.parseInt(temp);
    }
	
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		SuExam se = new SuExam();
		int kor = se.getInt("±¹¾î");
		bw.write("" + kor);
		bw.flush();
		

		bw.close();
		
	}
}
