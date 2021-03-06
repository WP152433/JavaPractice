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
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setCompany("현대자동차");
		car1.setModel("제네시스");
		car1.setColor("검정색");
		car1.setMaxSpeed(225);
		car1.setPrice(50000000);
		System.out.println("<<자동차 목록>>");
		System.out.println("제조사명 : " + car1.getCompany());
		System.out.println("모델명 : " + car1.getModel());
		System.out.println("색상 : " + car1.getColor());
		System.out.printf("최대속도 : %dkm\n",car1.getMaxSpeed());
		System.out.println("가격 : " + String.format("%,d",car1.getPrice())+"원\n");

		Car car2 = new Car();
		car2.setCompany("기아자동차");
		car2.setModel("K7");
		car2.setColor("흰색");
		car2.setMaxSpeed(246);
		car2.setPrice(40000000);
		System.out.println("제조사명 : " + car2.getCompany());
		System.out.println("모델명 : " + car2.getModel());
		System.out.println("색상 : " + car2.getColor());
		System.out.printf("최대속도 : %dkm\n",car2.getMaxSpeed());
		System.out.println("가격 : " + String.format("%,d",car2.getPrice())+"원\n");

		Car car3 = new Car();
		car3.setCompany("삼성자동차");
		car3.setModel("SM7");
		car3.setColor("회색");
		car3.setMaxSpeed(200);
		car3.setPrice(38000000);
		System.out.println("제조사명 : " + car3.getCompany());
		System.out.println("모델명 : " + car3.getModel());
		System.out.println("색상 : " + car3.getColor());
		System.out.printf("최대속도 : %dkm\n",car3.getMaxSpeed());
		System.out.println("가격 : " + String.format("%,d",car3.getPrice()) + "원\n");

	}

}
