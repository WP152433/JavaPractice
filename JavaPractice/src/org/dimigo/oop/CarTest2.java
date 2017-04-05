/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ CarTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 * 
 * @author 	: Dav
 * @version : 1.0
 */
public class CarTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car2 car1 = new Car2("현대자동차","제네시스","검정색",225,50000000);
		
		System.out.println("<<자동차 목록>>");
		System.out.println("제조사명 : " + car1.getCompany());
		System.out.println("모델명 : " + car1.getModel());
		System.out.println("색상 : " + car1.getColor());
		System.out.printf("최대속도 : %dkm\n",car1.getMaxSpeed());
		System.out.println("가격 : " + String.format("%,d",car1.getPrice())+"원\n");

		Car2 car2 = new Car2("기아자동차","K7","흰색",246,40000000);
		System.out.println("제조사명 : " + car2.getCompany());
		System.out.println("모델명 : " + car2.getModel());
		System.out.println("색상 : " + car2.getColor());
		System.out.printf("최대속도 : %dkm\n",car2.getMaxSpeed());
		System.out.println("가격 : " + String.format("%,d",car2.getPrice())+"원\n");

		Car2 car3 = new Car2("삼성자동차","SM7","회색",200,38000000);
		System.out.println("제조사명 : " + car3.getCompany());
		System.out.println("모델명 : " + car3.getModel());
		System.out.println("색상 : " + car3.getColor());
		System.out.printf("최대속도 : %dkm\n",car3.getMaxSpeed());
		System.out.println("가격 : " + String.format("%,d",car3.getPrice()) + "원\n");

	}

}