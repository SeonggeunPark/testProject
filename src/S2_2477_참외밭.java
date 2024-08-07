import java.util.Scanner;

public class S2_2477_참외밭 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] arr = new int[6][2];

		for (int i = 0; i < 6; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		int max=0, maxI=0;
		
		for (int i=0; i<6; i++) {
			if (max < arr[i][1]) {
				max = arr[i][1];
				maxI = i;
			}
		}
		int maxI_l = maxI - 1 < 0 ? 5 : maxI-1;
		int maxI_r = maxI + 1 > 5 ? 0 : maxI+1;
		int maxI_next = Math.max(arr[maxI_l][1], arr[maxI_r][1]);
		
		if (maxI-maxI_next == 1 || maxI-maxI_next == -5) {
			
		} else {
			
		}
		// 가로 세로 최대값 가진 방향 찾기
//		if (arr[0][0] <= 2) {
//			maxR = 0;
//			maxC = 1;
//		} else {
//			maxR = 1;
//			maxC = 0;
//		}
//		
//		for (int i = 2; i < 6; i++) {
//			int dir = arr[i][0];
////			System.out.println("dir : " + dir);
//			if (arr[i][0] <= 2) {
//				maxR = arr[maxR][1] < arr[i][1] ? i : maxR;
//			} else {
//				maxC = arr[maxC][1] < arr[i][1] ? i : maxC;
//			}
//		}
//		System.out.println(maxR + ", " + maxC);

		// 가로최대 다음 가로가 빈 가로 길이, 세로최대 전 세로가 빈 세로
		int emptyRI = maxRI + 2 < 6 ? maxRI + 2 : maxRI - 4;
		int emptyCI = maxCI - 2 >= 0 ? maxCI - 2 : maxCI + 4;

		System.out.println(((arr[maxRI][1] * arr[maxCI][1]) - (arr[emptyRI][1] * arr[emptyCI][1])) * n);

	}
}
