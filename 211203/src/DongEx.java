import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DongEx {
	public static void main(String[] args) {
		try {
			List<String> dongList = Files.readAllLines(Paths.get("dong.txt")); // 줄단위로 읽어 리스트로 만듬
			System.out.println(dongList.size() + "개"); // 몇줄인지 출력
			dongList.remove(0); // 첫번째줄 삭제
			System.out.println(dongList.size() + "개");
			// 10개만 출력
			for(int i=0;i<10;i++) {
				System.out.println(dongList.get(i));
			}
			// 현재 존재하는 법정동의 개수를 출력하시오
			int count1 = 0;
			int count2 = 0;
			for(String line : dongList) {
				if(line.endsWith("존재"))
					count1++;
				else
					count2++;
					
			}
			System.out.println("존재 : " + count1);
			System.out.println("폐지 : " + count2);
			// 광역 자치단체의 개수는?
			System.out.println(dongList.get(0).split("\\t")[1]);
			System.out.println("---------------------------------------------");
			List<String> list1 = new ArrayList<String>();
			String oldString = dongList.get(0).split("\\t")[1];
			list1.add(oldString);
			for(int i=1;i<dongList.size();i++) {
				if(dongList.get(i).endsWith("존재")) {
					String line[] = dongList.get(i).split("\\t");
					if(!line[1].startsWith(oldString)) {
						list1.add(line[1].split(" ")[0]);
						oldString = line[1];
					}
				}
			}
			System.out.println(list1.size() + "개");
			for(String t : list1) {
				System.out.println(t);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
