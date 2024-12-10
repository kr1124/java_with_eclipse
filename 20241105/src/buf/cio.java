package buf;

import java.io.*;

public class cio {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static String brrl() throws IOException {
		return br.readLine();
	}
	public static String rl() throws IOException {
		return br.readLine();
	}
	
	
	public static void bww(String str) throws IOException {
		bw.write(str);
	}
	public static void bwf() throws IOException {
		bw.flush();
	}
	public static void bwnl() throws IOException {
		bw.newLine();
	}
	
	public static void w(String str) throws IOException {
		bw.write(str);
	}
	public static void f() throws IOException {
		bw.flush();
	}
	public static void nl() throws IOException {
		bw.newLine();
	}

	public static void brc() throws IOException {
		br.close();
	}
	public static void bwc() throws IOException {
		bw.close();
	}
	

	public static double cr(double input) {
		double tp = Math.pow(10, 2);
		return (int)(input * tp + 0.5) / tp;
	}
	public static double cr(double input, int place) {
		double tp = Math.pow(10, place);
		return (int)(input * tp + 0.5) / tp;
	}
}
