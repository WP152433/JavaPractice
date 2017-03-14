/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Operator
 * 
 * 1. 개요 : 디미네베
 * 2. 작성일 : 2017. 3. 14.
 * </pre>
 * 
 * @author 	: Dav
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int month = 1700000;
		int person = 3;
		int store = 1500;
		long money;
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : " + String.format("%,d",month)+'원');
		System.out.println("점포 내 직원 수 : " + person + '명');
		System.out.println("점포 수 : " + String.format("%,d", store) + '개' );
		money = (long)month * 12 * person * store;
		System.out.println("\n연간 인건비 : " + String.format("%,d", money) + '원');
	}

}
