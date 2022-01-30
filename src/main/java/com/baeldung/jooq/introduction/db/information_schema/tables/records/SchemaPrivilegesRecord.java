/*
 * This file is generated by jOOQ.
 */
package com.baeldung.jooq.introduction.db.information_schema.tables.records;


import com.baeldung.jooq.introduction.db.information_schema.tables.SchemaPrivileges;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SchemaPrivilegesRecord extends TableRecordImpl<SchemaPrivilegesRecord> implements Record5<String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.SCHEMA_PRIVILEGES.GRANTEE</code>.
     */
    public void setGrantee(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.SCHEMA_PRIVILEGES.GRANTEE</code>.
     */
    public String getGrantee() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.SCHEMA_PRIVILEGES.TABLE_CATALOG</code>.
     */
    public void setTableCatalog(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.SCHEMA_PRIVILEGES.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.SCHEMA_PRIVILEGES.TABLE_SCHEMA</code>.
     */
    public void setTableSchema(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.SCHEMA_PRIVILEGES.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.SCHEMA_PRIVILEGES.PRIVILEGE_TYPE</code>.
     */
    public void setPrivilegeType(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.SCHEMA_PRIVILEGES.PRIVILEGE_TYPE</code>.
     */
    public String getPrivilegeType() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.SCHEMA_PRIVILEGES.IS_GRANTABLE</code>.
     */
    public void setIsGrantable(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.SCHEMA_PRIVILEGES.IS_GRANTABLE</code>.
     */
    public String getIsGrantable() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return SchemaPrivileges.SCHEMA_PRIVILEGES.GRANTEE;
    }

    @Override
    public Field<String> field2() {
        return SchemaPrivileges.SCHEMA_PRIVILEGES.TABLE_CATALOG;
    }

    @Override
    public Field<String> field3() {
        return SchemaPrivileges.SCHEMA_PRIVILEGES.TABLE_SCHEMA;
    }

    @Override
    public Field<String> field4() {
        return SchemaPrivileges.SCHEMA_PRIVILEGES.PRIVILEGE_TYPE;
    }

    @Override
    public Field<String> field5() {
        return SchemaPrivileges.SCHEMA_PRIVILEGES.IS_GRANTABLE;
    }

    @Override
    public String component1() {
        return getGrantee();
    }

    @Override
    public String component2() {
        return getTableCatalog();
    }

    @Override
    public String component3() {
        return getTableSchema();
    }

    @Override
    public String component4() {
        return getPrivilegeType();
    }

    @Override
    public String component5() {
        return getIsGrantable();
    }

    @Override
    public String value1() {
        return getGrantee();
    }

    @Override
    public String value2() {
        return getTableCatalog();
    }

    @Override
    public String value3() {
        return getTableSchema();
    }

    @Override
    public String value4() {
        return getPrivilegeType();
    }

    @Override
    public String value5() {
        return getIsGrantable();
    }

    @Override
    public SchemaPrivilegesRecord value1(String value) {
        setGrantee(value);
        return this;
    }

    @Override
    public SchemaPrivilegesRecord value2(String value) {
        setTableCatalog(value);
        return this;
    }

    @Override
    public SchemaPrivilegesRecord value3(String value) {
        setTableSchema(value);
        return this;
    }

    @Override
    public SchemaPrivilegesRecord value4(String value) {
        setPrivilegeType(value);
        return this;
    }

    @Override
    public SchemaPrivilegesRecord value5(String value) {
        setIsGrantable(value);
        return this;
    }

    @Override
    public SchemaPrivilegesRecord values(String value1, String value2, String value3, String value4, String value5) {
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
     * Create a detached SchemaPrivilegesRecord
     */
    public SchemaPrivilegesRecord() {
        super(SchemaPrivileges.SCHEMA_PRIVILEGES);
    }

    /**
     * Create a detached, initialised SchemaPrivilegesRecord
     */
    public SchemaPrivilegesRecord(String grantee, String tableCatalog, String tableSchema, String privilegeType, String isGrantable) {
        super(SchemaPrivileges.SCHEMA_PRIVILEGES);

        setGrantee(grantee);
        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setPrivilegeType(privilegeType);
        setIsGrantable(isGrantable);
    }
}
