/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Question
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 * 
 * @author : Dav
 * @version : 1.0
 */
public class Question {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] questions = { "1.가장 좋아하는 가수는?", "2.가장 좋아하는 배우는?", "3.가장 좋아하는 과목은?" };
		String[] answers = { "빅뱅", "원빈", "응용 프로그래밍" };
		String userAnswers;
		for (int i = 0; i < 3; i++) {
			System.out.println(questions[i]);
			userAnswers = scanner.nextLine();
			System.out.println(answers[i].equals(userAnswers) ? "정답입니다!" : "틀렸습니다!");
		}
		System.out.println("<< 결과 출력 >>");
		for (int i = 0; i < 3; i++) {
			StringBuilder sb = new StringBuilder("");
			sb.append(questions[i]).append(" " + answers[i]);
			System.out.println(sb);
		} 
	}
}
