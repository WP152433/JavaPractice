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
public class PersonTest {

	public static void main(String[] args) {

		Person p = new Person("Tom");
		Korean k = new Korean("홍길동");
		Japanese j = new Japanese("다나카");
		Chinese c = new Chinese("왕밍");

		System.out.println(p.toString() + "\n" + k.toString() + "\n" + j.toString() + "\n" + c.toString() + "\n");

		p.sayHello();
		k.sayHello();
		j.sayHello();
		c.sayHello();

		System.out.println();

		p.sayBye();
		k.sayBye();
		j.sayBye();
		c.sayBye();
	}

}
