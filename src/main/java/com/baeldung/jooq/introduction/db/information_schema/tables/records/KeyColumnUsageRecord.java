/*
 * This file is generated by jOOQ.
 */
package com.baeldung.jooq.introduction.db.information_schema.tables.records;


import com.baeldung.jooq.introduction.db.information_schema.tables.KeyColumnUsage;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class KeyColumnUsageRecord extends TableRecordImpl<KeyColumnUsageRecord> implements Record12<String, String, String, String, String, String, String, UInteger, UInteger, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_CATALOG</code>.
     */
    public void setConstraintCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_CATALOG</code>.
     */
    public String getConstraintCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_SCHEMA</code>.
     */
    public void setConstraintSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_SCHEMA</code>.
     */
    public String getConstraintSchema() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_NAME</code>.
     */
    public void setConstraintName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_NAME</code>.
     */
    public String getConstraintName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.KEY_COLUMN_USAGE.TABLE_CATALOG</code>.
     */
    public void setTableCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.KEY_COLUMN_USAGE.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.KEY_COLUMN_USAGE.TABLE_SCHEMA</code>.
     */
    public void setTableSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.KEY_COLUMN_USAGE.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.KEY_COLUMN_USAGE.TABLE_NAME</code>.
     */
    public void setTableName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.KEY_COLUMN_USAGE.TABLE_NAME</code>.
     */
    public String getTableName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.KEY_COLUMN_USAGE.COLUMN_NAME</code>.
     */
    public void setColumnName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.KEY_COLUMN_USAGE.COLUMN_NAME</code>.
     */
    public String getColumnName() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>information_schema.KEY_COLUMN_USAGE.ORDINAL_POSITION</code>.
     */
    public void setOrdinalPosition(UInteger value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>information_schema.KEY_COLUMN_USAGE.ORDINAL_POSITION</code>.
     */
    public UInteger getOrdinalPosition() {
        return (UInteger) get(7);
    }

    /**
     * Setter for
     * <code>information_schema.KEY_COLUMN_USAGE.POSITION_IN_UNIQUE_CONSTRAINT</code>.
     */
    public void setPositionInUniqueConstraint(UInteger value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>information_schema.KEY_COLUMN_USAGE.POSITION_IN_UNIQUE_CONSTRAINT</code>.
     */
    public UInteger getPositionInUniqueConstraint() {
        return (UInteger) get(8);
    }

    /**
     * Setter for
     * <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_TABLE_SCHEMA</code>.
     */
    public void setReferencedTableSchema(String value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_TABLE_SCHEMA</code>.
     */
    public String getReferencedTableSchema() {
        return (String) get(9);
    }

    /**
     * Setter for
     * <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_TABLE_NAME</code>.
     */
    public void setReferencedTableName(String value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_TABLE_NAME</code>.
     */
    public String getReferencedTableName() {
        return (String) get(10);
    }

    /**
     * Setter for
     * <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_COLUMN_NAME</code>.
     */
    public void setReferencedColumnName(String value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_COLUMN_NAME</code>.
     */
    public String getReferencedColumnName() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<String, String, String, String, String, String, String, UInteger, UInteger, String, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<String, String, String, String, String, String, String, UInteger, UInteger, String, String, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.CONSTRAINT_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.CONSTRAINT_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.CONSTRAINT_NAME;
    }

    @Override
    public Field<String> field4() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.TABLE_CATALOG;
    }

    @Override
    public Field<String> field5() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.TABLE_SCHEMA;
    }

    @Override
    public Field<String> field6() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.TABLE_NAME;
    }

    @Override
    public Field<String> field7() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.COLUMN_NAME;
    }

    @Override
    public Field<UInteger> field8() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.ORDINAL_POSITION;
    }

    @Override
    public Field<UInteger> field9() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.POSITION_IN_UNIQUE_CONSTRAINT;
    }

    @Override
    public Field<String> field10() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.REFERENCED_TABLE_SCHEMA;
    }

    @Override
    public Field<String> field11() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.REFERENCED_TABLE_NAME;
    }

    @Override
    public Field<String> field12() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.REFERENCED_COLUMN_NAME;
    }

    @Override
    public String component1() {
        return getConstraintCatalog();
    }

    @Override
    public String component2() {
        return getConstraintSchema();
    }

    @Override
    public String component3() {
        return getConstraintName();
    }

    @Override
    public String component4() {
        return getTableCatalog();
    }

    @Override
    public String component5() {
        return getTableSchema();
    }

    @Override
    public String component6() {
        return getTableName();
    }

    @Override
    public String component7() {
        return getColumnName();
    }

    @Override
    public UInteger component8() {
        return getOrdinalPosition();
    }

    @Override
    public UInteger component9() {
        return getPositionInUniqueConstraint();
    }

    @Override
    public String component10() {
        return getReferencedTableSchema();
    }

    @Override
    public String component11() {
        return getReferencedTableName();
    }

    @Override
    public String component12() {
        return getReferencedColumnName();
    }

    @Override
    public String value1() {
        return getConstraintCatalog();
    }

    @Override
    public String value2() {
        return getConstraintSchema();
    }

    @Override
    public String value3() {
        return getConstraintName();
    }

    @Override
    public String value4() {
        return getTableCatalog();
    }

    @Override
    public String value5() {
        return getTableSchema();
    }

    @Override
    public String value6() {
        return getTableName();
    }

    @Override
    public String value7() {
        return getColumnName();
    }

    @Override
    public UInteger value8() {
        return getOrdinalPosition();
    }

    @Override
    public UInteger value9() {
        return getPositionInUniqueConstraint();
    }

    @Override
    public String value10() {
        return getReferencedTableSchema();
    }

    @Override
    public String value11() {
        return getReferencedTableName();
    }

    @Override
    public String value12() {
        return getReferencedColumnName();
    }

    @Override
    public KeyColumnUsageRecord value1(String value) {
        setConstraintCatalog(value);
        return this;
    }

    @Override
    public KeyColumnUsageRecord value2(String value) {
        setConstraintSchema(value);
        return this;
    }

    @Override
    public KeyColumnUsageRecord value3(String value) {
        setConstraintName(value);
        return this;
    }

    @Override
    public KeyColumnUsageRecord value4(String value) {
        setTableCatalog(value);
        return this;
    }

    @Override
    public KeyColumnUsageRecord value5(String value) {
        setTableSchema(value);
        return this;
    }

    @Override
    public KeyColumnUsageRecord value6(String value) {
        setTableName(value);
        return this;
    }

    @Override
    public KeyColumnUsageRecord value7(String value) {
        setColumnName(value);
        return this;
    }

    @Override
    public KeyColumnUsageRecord value8(UInteger value) {
        setOrdinalPosition(value);
        return this;
    }

    @Override
    public KeyColumnUsageRecord value9(UInteger value) {
        setPositionInUniqueConstraint(value);
        return this;
    }

    @Override
    public KeyColumnUsageRecord value10(String value) {
        setReferencedTableSchema(value);
        return this;
    }

    @Override
    public KeyColumnUsageRecord value11(String value) {
        setReferencedTableName(value);
        return this;
    }

    @Override
    public KeyColumnUsageRecord value12(String value) {
        setReferencedColumnName(value);
        return this;
    }

    @Override
    public KeyColumnUsageRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, UInteger value8, UInteger value9, String value10, String value11, String value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached KeyColumnUsageRecord
     */
    public KeyColumnUsageRecord() {
        super(KeyColumnUsage.KEY_COLUMN_USAGE);
    }

    /**
     * Create a detached, initialised KeyColumnUsageRecord
     */
    public KeyColumnUsageRecord(String constraintCatalog, String constraintSchema, String constraintName, String tableCatalog, String tableSchema, String tableName, String columnName, UInteger ordinalPosition, UInteger positionInUniqueConstraint, String referencedTableSchema, String referencedTableName, String referencedColumnName) {
        super(KeyColumnUsage.KEY_COLUMN_USAGE);

        setConstraintCatalog(constraintCatalog);
        setConstraintSchema(constraintSchema);
        setConstraintName(constraintName);
        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setColumnName(columnName);
        setOrdinalPosition(ordinalPosition);
        setPositionInUniqueConstraint(positionInUniqueConstraint);
        setReferencedTableSchema(referencedTableSchema);
        setReferencedTableName(referencedTableName);
        setReferencedColumnName(referencedColumnName);
    }
}
