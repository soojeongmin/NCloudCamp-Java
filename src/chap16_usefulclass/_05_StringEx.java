package chap16_usefulclass;

import java.util.Scanner;

public class _05_StringEx {

	public static void main(String[] args) {
		// 사용자가 문자열 두개 입력하여 str1, str2에 저장
		// str1이 str2를 포함하면 str1에 있는 str2를 빈칸으로 변경해서 출력
		// str1이 str2를 포함하지 않으면 str1에서 str2를 찾을 수 없습니다. 출력

		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		if (str1.contains(str2)) System.out.println(str1.replaceAll(str2, ""));
		else System.out.println("str1에서 str2를 찾을 수 없습니다.");
		sc.close();
	}

}
