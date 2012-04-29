/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.udt;

/**
 * This class is generated by jOOQ.
 */
public class UStreetType extends org.jooq.impl.UDTImpl<org.jooq.test.oracle.generatedclasses.test.udt.records.UStreetTypeRecord> {

	private static final long serialVersionUID = 1522757917;

	/**
	 * The singleton instance of TEST.U_STREET_TYPE
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.udt.UStreetType U_STREET_TYPE = new org.jooq.test.oracle.generatedclasses.test.udt.UStreetType();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.udt.records.UStreetTypeRecord> getRecordType() {
		return org.jooq.test.oracle.generatedclasses.test.udt.records.UStreetTypeRecord.class;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle.generatedclasses.test.udt.records.UStreetTypeRecord, java.lang.String> STREET = createField("STREET", org.jooq.impl.SQLDataType.VARCHAR, U_STREET_TYPE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle.generatedclasses.test.udt.records.UStreetTypeRecord, java.lang.String> NO = createField("NO", org.jooq.impl.SQLDataType.VARCHAR, U_STREET_TYPE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle.generatedclasses.test.udt.records.UStreetTypeRecord, org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord> FLOORS = createField("FLOORS", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord.class), U_STREET_TYPE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle.generatedclasses.test.udt.records.UStreetTypeRecord, byte[]> F_1323 = createField("F_1323", org.jooq.impl.SQLDataType.BLOB, U_STREET_TYPE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle.generatedclasses.test.udt.records.UStreetTypeRecord, java.lang.String> F_1326 = createField("F_1326", org.jooq.impl.SQLDataType.CLOB, U_STREET_TYPE);

	/**
	 * No further instances allowed
	 */
	private UStreetType() {
		super("U_STREET_TYPE", org.jooq.test.oracle.generatedclasses.test.Test.TEST);

		// Initialise data type
		getDataType();
	}
}
