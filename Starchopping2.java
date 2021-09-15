package backjoon_basic03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Starchopping2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int j;
		StringBuilder sb = new StringBuilder();
		for (int i = N; i > 0; i--) {
			for(j = 1; j < i; j++) sb.append(" ");
			for(j = 0; j <= N-i; j++) sb.append("*");
			sb.append('\n');
			
		}
		System.out.print(sb);
	}
}


/* 다른방법 1)
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
		in.close();
 
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

다른방법 2)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
 
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

다른 방법 3)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
 
		StringBuilder sb = new StringBuilder();
 
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N - i; j++) {
				sb.append(' ');
			}
			for (int k = 0; k < i; k++) {
				sb.append('*');
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}
}


다른 방법 4)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		br.close();
 
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N - i; j++) {
				bw.write(' ');
			}
			for (int k = 0; k < i; k++) {
				bw.write('*');
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}

*/


