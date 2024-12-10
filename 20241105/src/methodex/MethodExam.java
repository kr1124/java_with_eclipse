package methodex;

import java.io.*;

public class MethodExam {

	static int max_n(int a, int b) {
		return a > b ? a : b;
	}
	
	static int sum_n(int a, int b) {
		return a + b;
	}

	static void write_des(int a, int b) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		if(a > b) {
			bw.write(a + "\t" + b);
		}
		else {
			bw.write(b + "\t" + a);
		}
		
		
		
		bw.close();
	}
	
	static void write_ads(int ... n) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		bw.close();
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int x = 0;
		
		A:
		while(true) {
			bw.write("1. �ִ밪 2. �� �� ������ �հ� 3. ū������� ��� 4. ���� : " );
			bw.flush();
			x = Integer.parseInt(br.readLine());

			bw.write("ù��° �� �Է� : ");
			bw.flush();
			int a = Integer.parseInt(br.readLine());
			bw.write("�ι�° �� �Է� : ");
			bw.flush();
			int b = Integer.parseInt(br.readLine());
			
			int result;
			
			switch(x) {
			case 1:
				bw.write("�ִ밪�� " + max_n(a, b) + "�Դϴ�.");
				bw.flush();
				break;
			case 2:
				bw.write("�� ���� �հ�� " + MethodExam.sum_n(a, b) + "�Դϴ�.");
				bw.flush();
				break;
			case 3:
				MethodExam.write_des(a, b);
				break;
			case 4:
				bw.write("�����մϴ�.");
				bw.flush();
				break A;
			default:
				bw.write("�߸��� �Է��Դϴ�.");
				bw.flush();
				break;
			}

			bw.newLine();
			bw.newLine();
			bw.flush();
		}
		
	}

}
