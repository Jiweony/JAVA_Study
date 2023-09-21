package tut07;

import java.util.Scanner;

public class ScoresEx {

	public static void main(String[] args) {

		//전역(공유), 전역객체 선언
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int[] scores = null;

		//무한루프
		while (run) {
			System.out.println("===============================================================");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수출력 | 4. 평균 | 5. 최고점수 | 6. 종료");
			System.out.println("===============================================================");
			System.out.print("메뉴 선택 > ");
			int menu = sc.nextInt();

			switch (menu) {

			case 1:

				System.out.print("등록할 학생수를 입력하십시오 > ");
				int count = sc.nextInt();
				scores = new int[count];
				System.out.println(scores.length + "명의 학생이 등록되었습니다.");
				System.out.println("");

				System.out.println(">>>>> 2. 점수입력 메뉴로 이동하세요");
				System.out.println("");
				break;

			case 2:

				for (int i = 0; i < scores.length; i++) {
					System.out.print((i + 1) + "번 학생 점수 입력 > ");
					scores[i] = sc.nextInt();
				}
				System.out.print("학생 점수 입력이 완료 되었습니다. ");
				System.out.println(">>> 점수 출력 메뉴에서 확인하세요.");
				System.out.println("");
				break;

			case 3:

				if (scores != null) {
					System.out.println("==============학생 점수 출력==============");
					System.out.println("학생 수 " + scores.length + "명");
					System.out.println("=======================================");

					for (int i = 0; i < scores.length; i++) {
						System.out.println((i + 1) + "번 학생의 점수는 " + scores[i] + "점입니다.");
						System.out.println("=======================================");
					}
				}
				System.out.println("");
				break;

			case 4:
				int sum = 0;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}
				double result = (double) sum / scores.length;
				System.out.printf("학생 평균은 %.1f입니다.", result);
				System.out.println("");
				break;

			case 5:
				//최대값, 최소값 = 비교값
				//최대값 = 비교값(가장 값이 가장 작은 정수 -> 보통 0)
				//최솟값 = 비교값(가장 값이 가장 큰 정수)
				//System.out.println(Arrays.toString(scores)); //배열 형태로 출력
				int max = 0; // 비교값
				for (int i = 0; i < scores.length; i++) {
					if (max < scores[i]) {
						max = scores[i]; //기준값과 비교하여 최대값 갱신
					}
				}
				System.out.println("최고점수" + max + "입니다.");

				break;

			case 6:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;

			default:
				System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
				break;

			}

		}
	}

}
