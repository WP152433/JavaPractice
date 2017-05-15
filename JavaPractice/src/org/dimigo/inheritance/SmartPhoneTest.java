/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SmartPhoneTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 15.
 * </pre>
 * 
 * @author 	: Dav
 * @version : 1.0
 */
public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone[] sp = {
				new IPhone("iPhone","애플",900000),
				new Galaxy("갤럭시S8","삼성",800000)
		};
		for(SmartPhone smart : sp){
			System.out.println(smart.toString());
			smart.turnOn();
			smart.pay();
			smart.useSpecialFunction(smart);
			smart.turnOff();
			System.out.println();
		}

	}

}
