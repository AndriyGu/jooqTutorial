/*
 * This file is generated by jOOQ.
 */
package com.baeldung.jooq.introduction.db.information_schema.tables.records;


import com.baeldung.jooq.introduction.db.information_schema.tables.TablesExtensions;

import org.jooq.Field;
import org.jooq.JSON;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TablesExtensionsRecord extends TableRecordImpl<TablesExtensionsRecord> implements Record5<String, String, String, JSON, JSON> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.TABLES_EXTENSIONS.TABLE_CATALOG</code>.
     */
    public void setTableCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.TABLES_EXTENSIONS.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.TABLES_EXTENSIONS.TABLE_SCHEMA</code>.
     */
    public void setTableSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.TABLES_EXTENSIONS.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.TABLES_EXTENSIONS.TABLE_NAME</code>.
     */
    public void setTableName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.TABLES_EXTENSIONS.TABLE_NAME</code>.
     */
    public String getTableName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.TABLES_EXTENSIONS.ENGINE_ATTRIBUTE</code>.
     */
    public void setEngineAttribute(JSON value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.TABLES_EXTENSIONS.ENGINE_ATTRIBUTE</code>.
     */
    public JSON getEngineAttribute() {
        return (JSON) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.TABLES_EXTENSIONS.SECONDARY_ENGINE_ATTRIBUTE</code>.
     */
    public void setSecondaryEngineAttribute(JSON value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.TABLES_EXTENSIONS.SECONDARY_ENGINE_ATTRIBUTE</code>.
     */
    public JSON getSecondaryEngineAttribute() {
        return (JSON) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, JSON, JSON> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, String, String, JSON, JSON> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return TablesExtensions.TABLES_EXTENSIONS.TABLE_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return TablesExtensions.TABLES_EXTENSIONS.TABLE_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return TablesExtensions.TABLES_EXTENSIONS.TABLE_NAME;
    }

    @Override
    public Field<JSON> field4() {
        return TablesExtensions.TABLES_EXTENSIONS.ENGINE_ATTRIBUTE;
    }

    @Override
    public Field<JSON> field5() {
        return TablesExtensions.TABLES_EXTENSIONS.SECONDARY_ENGINE_ATTRIBUTE;
    }

    @Override
    public String component1() {
        return getTableCatalog();
    }

    @Override
    public String component2() {
        return getTableSchema();
    }

    @Override
    public String component3() {
        return getTableName();
    }

    @Override
    public JSON component4() {
        return getEngineAttribute();
    }

    @Override
    public JSON component5() {
        return getSecondaryEngineAttribute();
    }

    @Override
    public String value1() {
        return getTableCatalog();
    }

    @Override
    public String value2() {
        return getTableSchema();
    }

    @Override
    public String value3() {
        return getTableName();
    }

    @Override
    public JSON value4() {
        return getEngineAttribute();
    }

    @Override
    public JSON value5() {
        return getSecondaryEngineAttribute();
    }

    @Override
    public TablesExtensionsRecord value1(String value) {
        setTableCatalog(value);
        return this;
    }

    @Override
    public TablesExtensionsRecord value2(String value) {
        setTableSchema(value);
        return this;
    }

    @Override
    public TablesExtensionsRecord value3(String value) {
        setTableName(value);
        return this;
    }

    @Override
    public TablesExtensionsRecord value4(JSON value) {
        setEngineAttribute(value);
        return this;
    }

    @Override
    public TablesExtensionsRecord value5(JSON value) {
        setSecondaryEngineAttribute(value);
        return this;
    }

    @Override
    public TablesExtensionsRecord values(String value1, String value2, String value3, JSON value4, JSON value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TablesExtensionsRecord
     */
    public TablesExtensionsRecord() {
        super(TablesExtensions.TABLES_EXTENSIONS);
    }

    /**
     * Create a detached, initialised TablesExtensionsRecord
     */
    public TablesExtensionsRecord(String tableCatalog, String tableSchema, String tableName, JSON engineAttribute, JSON secondaryEngineAttribute) {
        super(TablesExtensions.TABLES_EXTENSIONS);

        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setEngineAttribute(engineAttribute);
        setSecondaryEngineAttribute(secondaryEngineAttribute);
    }
}
