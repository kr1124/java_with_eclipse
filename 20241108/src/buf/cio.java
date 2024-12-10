package buf;

//import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class cio {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	//readLine
	public static String rl() {
		try {
			return br.readLine();
		} catch(IOException e) {
			e.printStackTrace();
			return "0";
		}
	}
	public static int rli() {return Integer.parseInt(rl());}
	public static double rld() {return Double.parseDouble(rl());}
	public static float rlf() {return Float.parseFloat((rl()));}
	
	//read
		public static int r() {
			try {
				return br.read();
			} catch(IOException e) {
				return 0;
			}
		}
	

	//flush
	public static void f() {try {bw.flush();} catch(IOException e) {return;}}
	//newLine
	public static void nl() {try {bw.newLine();} catch(IOException e) {return;}}
	//newLine + flush
	public static void nlf() {nl();f();}
	//write
	public static void w(String str) {try {bw.write(str);} catch(IOException e) {return;}}
	public static void w(int i) {try {bw.write(i + "");} catch(IOException e) {return;}}
	public static void w(short s) {try {bw.write(s + "");} catch(IOException e) {return;}}
	public static void w(long l) {try {bw.write(l + "");} catch(IOException e) {return;}}
	public static void w(float f) {try {bw.write(f + "");} catch(IOException e) {return;}}
	public static void w(double d) {try {bw.write(d + "");} catch(IOException e) {return;}}
	public static void w(char c) {try {bw.write(c + "");} catch(IOException e) {return;}}

	//write + flush
	public static void wf(String str) {w(str);f();}
	public static void wf(int i) {w(i);f();}
	public static void wf(short s) {w(s);f();}
	public static void wf(long l) {w(l);f();}
	public static void wf(float f) {w(f);f();}
	public static void wf(double d) {w(d);f();}
	public static void wf(char c) {w(c);f();}
	
	//write + newLine
	public static void wnl(String str) {w(str);nl();}
	public static void wnl(int i) {w(i);nl();}
	public static void wnl(short s) {w(s);nl();}
	public static void wnl(long l) {w(l);nl();}
	public static void wnl(float f) {w(f);nl();}
	public static void wnl(double d) {w(d);nl();}
	public static void wnl(char c) {w(c);nl();}

	//write + newLine + flush
	public static void wnlf(String str) {w(str);nl();f();}
	public static void wnlf(int i) {w(i);nl();f();}
	public static void wnlf(short s) {w(s);nl();f();}
	public static void wnlf(long l) {w(l);nl();f();}
	public static void wnlf(float f) {w(f);nl();f();}
	public static void wnlf(double d) {w(d);nl();f();}
	public static void wnlf(char c) {w(c);nl();f();}

	public static void brc() {
		try {
			br.close();
		} catch(IOException e) {
			return;
		}
	}
	public static void bwc() {
		try {
			bw.close();
		} catch(IOException e) {
			return;
		}
	}
	public static void cc() {brc();bwc();}

	public static double cr(double input) {
		return cr(input, 2);
	}
	public static double cr(double input, int place) {
		double tp = Math.pow(10, place);
		return (int)(input * tp + 0.5) / tp;
	}
}