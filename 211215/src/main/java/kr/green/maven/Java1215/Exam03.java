package kr.green.maven.Java1215;
/*
ASCII Art N
1입력시
N
3입력시
N N
NNN
N N
5입력시
N   N
NN  N
N N N
N  NN
N   N

7입력시
N     N
NN    N
N N   N
N  N  N
N   N N
N    NN
N     N
*/
public class Exam03 {
	public static void main(String[] args) {
		showN(1); System.out.println();
		showN(3); System.out.println();
		showN(5); System.out.println();
		showN(7); System.out.println();
	}
	
	public static void showN(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1 || i==j) { // 첫번째칸 0, 마지막칸 n-1, i==j때(대각선)
					System.out.print("N");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
