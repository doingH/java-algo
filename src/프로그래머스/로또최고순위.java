package ���α׷��ӽ�;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class �ζ��ְ���� {
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
		//��������
		if(min >= 2) {
			min = 6-min;
			min++;
		} else {
			min = 6;
		}
		//��������
		if(max >= 2) {
			max = 6-max;
			max++;
		} else {
			max = 6;
		}

		
		
		//�ְ�, ����
		int[] answer = {max, min};
	}
}
