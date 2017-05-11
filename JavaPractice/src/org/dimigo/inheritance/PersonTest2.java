/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ PersonTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 * 
 * @author : Dav
 * @version : 1.0
 */
public class PersonTest2 {

	public static void main(String[] args) {

		Person[] person = { new Person(), new Korean("홍길동"), new Japanese("다나카"), new Chinese("왕밍") };
		for (Person ps : person) {
			greeting(ps);
			System.out.println();
		}
	}

	private static void greeting(Person p) {
		System.out.println(p.toString());
		p.sayHello();
		p.sayBye();
	}

}
