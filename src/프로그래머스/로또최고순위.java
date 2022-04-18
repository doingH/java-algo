package 프로그래머스;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class 로또최고순위 {
	public static void main(String[] args) {
		int[] lottos = {0, 0, 0, 0, 0, 0};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		
		Set<Integer> winLottos = new HashSet<>(Arrays.stream(win_nums).boxed().collect(Collectors.toList()));
		
		
		int delNumCnt = 0;
		int matchCnt = 0;
		for(int list : lottos) {
			if(list == 0) {
				delNumCnt++;
				continue;
			}
			
			if(winLottos.contains(list)) {
				matchCnt++;
			}
			
		}
		int min = matchCnt;
		int max = matchCnt + delNumCnt;
		//순위지정
		if(min >= 2) {
			min = 6-min;
			min++;
		} else {
			min = 6;
		}
		//순위지정
		if(max >= 2) {
			max = 6-max;
			max++;
		} else {
			max = 6;
		}

		
		
		//최고, 최저
		int[] answer = {max, min};
	}
}
