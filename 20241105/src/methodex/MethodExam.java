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
			bw.write("1. 최대값 2. 두 수 사이의 합계 3. 큰순서대로 출력 4. 종료 : " );
			bw.flush();
			x = Integer.parseInt(br.readLine());

			bw.write("첫번째 수 입력 : ");
			bw.flush();
			int a = Integer.parseInt(br.readLine());
			bw.write("두번째 수 입력 : ");
			bw.flush();
			int b = Integer.parseInt(br.readLine());
			
			int result;
			
			switch(x) {
			case 1:
				bw.write("최대값은 " + max_n(a, b) + "입니다.");
				bw.flush();
				break;
			case 2:
				bw.write("두 수의 합계는 " + MethodExam.sum_n(a, b) + "입니다.");
				bw.flush();
				break;
			case 3:
				MethodExam.write_des(a, b);
				break;
			case 4:
				bw.write("종료합니다.");
				bw.flush();
				break A;
			default:
				bw.write("잘못된 입력입니다.");
				bw.flush();
				break;
			}

			bw.newLine();
			bw.newLine();
			bw.flush();
		}
		
	}

}
