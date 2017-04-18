/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ PiggyBankTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 18.
 * </pre>
 * 
 * @author : Dav
 * @version : 1.0
 */
public class PiggyBankTest {

	public static void main(String[] args) {
		
		FamilyMember[] fm = new FamilyMember[4];
		
		fm[0] = new FamilyMember("아빠");
		fm[1] = new FamilyMember("엄마");
		fm[2] = new FamilyMember("나");
		fm[3] = new FamilyMember("남동생");

		FamilyMember.printMemberCnt();

		PiggyBank.putMoney(fm[0], 10000);
		PiggyBank.putMoney(fm[1], 5000);
		PiggyBank.putMoney(fm[2], 2000);
		PiggyBank.putMoney(fm[3], 1000);
		PiggyBank.printBalance();
		
		PiggyBank.putMoney(fm[2], 1000);
		PiggyBank.printBalance();
	}

}
