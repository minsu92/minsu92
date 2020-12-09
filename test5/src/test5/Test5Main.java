package test5;


public class Test5Main {

	public static void main(String[] args) {
		int[][] fond = {
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
				{0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
				{0, 1, 1, 1, 1, 1, 1, 0, 0, 0},
				{0, 1, 1, 1, 1, 1, 1, 1, 0, 0},
				{0, 1, 1, 1, 1, 1, 1, 1, 0, 0},
				{0, 0, 1, 1, 1, 1, 1, 1, 0, 0},
				{0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
				{0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		};
		int depth = 0;
		boolean change = true;
		int[][] changedFond = null;
		while(change) {
			change = false; //초기Boolean=false
			changedFond = new int[fond.length][fond.length]; //재배치할 배열 생성
			for(int i=0; i<fond.length; i++) {
				
				for(int j=0; j<fond[i].length; j++) {
					changedFond[i][j] = fond[i][j];	//배열복사
					if(fond[i][j]!=0) { //연못일때
						
						int point = fond[i][j];
						int left = fond[i][j-1];
						int right = fond[i][j+1];
						int top = fond[i-1][j];
						int bottom = fond[i+1][j];
						
						if(left>=point && right>=point && top>=point && bottom>=point) { //상하좌우조건 만족할때 +1
							changedFond[i][j] +=1;
							change = true;
						}
					}
				}
			}
			for(int i=0; i<fond.length; i++) {
				for(int j=0; j<fond.length; j++) {
					fond[i][j] = changedFond[i][j]; //비교배열 재초기화
				}
			}
		}
		
		for(int i=0; i<changedFond.length; i++) { //최종 연못 출력
			for(int j=0; j<changedFond.length; j++) {
				System.out.print(fond[i][j] + " ");
				depth+=fond[i][j];
			}
			System.out.println();
		}
		System.out.println("연못 물깊이의 총합 : " + depth);
	}




}
