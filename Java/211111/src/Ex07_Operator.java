
public class Ex07_Operator {

		/*
		 * 10 진수를 2진수로 바꿔보자
				 */
	public static void main(String[] args) {
		int n[] = {0x0660, 0x2640, 0x4640, 0x4460, 0x6220, 0x4620, 0x4444};
		for(int t=0;t<n.length;t++) {
		int mask = 0x8000;
		// mask값이 0x8000 이고 16회 반복하면 2바이트를 2진수로 변환
		for(int i=0;i<16;i++) { // 16회 반복
			//System.out.print((n[t] & mask)==mask ? "1" : "0");
			//System.out.print((n[t] & mask)==mask ? "■" : "□");
			System.out.print((n[t] & mask)==mask ? "■" : "  ");
			if((i+1)%4==0) System.out.println(); //4자리마다 줄바꿈
			mask = mask >> 1;
			}
			System.out.println();
		}
	}
}
