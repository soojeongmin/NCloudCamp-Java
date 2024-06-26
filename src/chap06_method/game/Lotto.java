package chap06_method.game;

import java.util.Random;

public class Lotto {
	// 1. 1~45까지 숫자 중 랜덤 값 7개를 저장해서 배열로 리턴하는 메소드 generateLottoArray를 구현하세요.
	// 매개변수 없음
	
	// 2. 정수형 배열과 int 타입의 인덱스를 매개변수로 받아서 중복체크하는 메소드 isDuplicated를 구현하세요.
	// 리턴타입 boolean 
	
	public int[] generateLottoArray() {
		int[] lotto = new int[7];
		Random rnd = new Random();
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = rnd.nextInt(45)+1;
			if(isDuplicated(lotto, i)) i--;
		}
		return lotto;
	}
	
	public boolean isDuplicated(int[] lotto, int index) {
		for(int i=0;i<index;i++) {
			if(lotto[index]==lotto[i]) return true;
		}
		return false;
	}
	
	
}
