/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_ IDBManager
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 * 
 * @author : Dav
 * @version : 1.0
 */
public interface IDBManager {

	String ORACLE_DATBASE = "ORACLE";
	String SYBASE_DATBASE = "SYBASE";

	void insert();

	void search();

	void update();

	void delete();

	static IDBManager getDBObject(String database) {
		if (database.equals(ORACLE_DATBASE))
			return new OracleDB();
		else if (database.equals(SYBASE_DATBASE))
			return new SybaseDB();
		else
			return null;
	}
}
