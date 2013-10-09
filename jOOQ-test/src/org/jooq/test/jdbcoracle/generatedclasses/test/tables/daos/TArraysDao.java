/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TArraysDao extends org.jooq.impl.DAOImpl<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TArraysRecord, org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TArrays, java.lang.Integer> {

	/**
	 * Create a new TArraysDao without any configuration
	 */
	public TArraysDao() {
		super(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TArrays.T_ARRAYS, org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TArrays.class);
	}

	/**
	 * Create a new TArraysDao with an attached configuration
	 */
	public TArraysDao(org.jooq.Configuration configuration) {
		super(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TArrays.T_ARRAYS, org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TArrays.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TArrays object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TArrays> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TArrays.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TArrays fetchOneById(java.lang.Integer value) {
		return fetchOne(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TArrays.ID, value);
	}

	/**
	 * Fetch records that have <code>STRING_ARRAY IN (values)</code>
	 */
	public java.util.List<org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TArrays> fetchByStringArray(java.lang.Object... values) {
		return fetch(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TArrays.STRING_ARRAY, values);
	}

	/**
	 * Fetch records that have <code>NUMBER_ARRAY IN (values)</code>
	 */
	public java.util.List<org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TArrays> fetchByNumberArray(java.lang.Object... values) {
		return fetch(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TArrays.NUMBER_ARRAY, values);
	}

	/**
	 * Fetch records that have <code>NUMBER_LONG_ARRAY IN (values)</code>
	 */
	public java.util.List<org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TArrays> fetchByNumberLongArray(java.lang.Object... values) {
		return fetch(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TArrays.NUMBER_LONG_ARRAY, values);
	}

	/**
	 * Fetch records that have <code>DATE_ARRAY IN (values)</code>
	 */
	public java.util.List<org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos.TArrays> fetchByDateArray(java.lang.Object... values) {
		return fetch(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TArrays.DATE_ARRAY, values);
	}
}