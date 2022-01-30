/*
 * This file is generated by jOOQ.
 */
package com.baeldung.jooq.introduction.db.information_schema.tables;


import com.baeldung.jooq.introduction.db.information_schema.InformationSchema;
import com.baeldung.jooq.introduction.db.information_schema.tables.records.RoleColumnGrantsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoleColumnGrants extends TableImpl<RoleColumnGrantsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.ROLE_COLUMN_GRANTS</code>
     */
    public static final RoleColumnGrants ROLE_COLUMN_GRANTS = new RoleColumnGrants();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoleColumnGrantsRecord> getRecordType() {
        return RoleColumnGrantsRecord.class;
    }

    /**
     * The column <code>information_schema.ROLE_COLUMN_GRANTS.GRANTOR</code>.
     */
    public final TableField<RoleColumnGrantsRecord, String> GRANTOR = createField(DSL.name("GRANTOR"), SQLDataType.VARCHAR(97), this, "");

    /**
     * The column
     * <code>information_schema.ROLE_COLUMN_GRANTS.GRANTOR_HOST</code>.
     */
    public final TableField<RoleColumnGrantsRecord, String> GRANTOR_HOST = createField(DSL.name("GRANTOR_HOST"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>information_schema.ROLE_COLUMN_GRANTS.GRANTEE</code>.
     */
    public final TableField<RoleColumnGrantsRecord, String> GRANTEE = createField(DSL.name("GRANTEE"), SQLDataType.CHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column
     * <code>information_schema.ROLE_COLUMN_GRANTS.GRANTEE_HOST</code>.
     */
    public final TableField<RoleColumnGrantsRecord, String> GRANTEE_HOST = createField(DSL.name("GRANTEE_HOST"), SQLDataType.CHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column
     * <code>information_schema.ROLE_COLUMN_GRANTS.TABLE_CATALOG</code>.
     */
    public final TableField<RoleColumnGrantsRecord, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>information_schema.ROLE_COLUMN_GRANTS.TABLE_SCHEMA</code>.
     */
    public final TableField<RoleColumnGrantsRecord, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>information_schema.ROLE_COLUMN_GRANTS.TABLE_NAME</code>.
     */
    public final TableField<RoleColumnGrantsRecord, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column
     * <code>information_schema.ROLE_COLUMN_GRANTS.COLUMN_NAME</code>.
     */
    public final TableField<RoleColumnGrantsRecord, String> COLUMN_NAME = createField(DSL.name("COLUMN_NAME"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column
     * <code>information_schema.ROLE_COLUMN_GRANTS.PRIVILEGE_TYPE</code>.
     */
    public final TableField<RoleColumnGrantsRecord, String> PRIVILEGE_TYPE = createField(DSL.name("PRIVILEGE_TYPE"), SQLDataType.VARCHAR(31).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>information_schema.ROLE_COLUMN_GRANTS.IS_GRANTABLE</code>.
     */
    public final TableField<RoleColumnGrantsRecord, String> IS_GRANTABLE = createField(DSL.name("IS_GRANTABLE"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    private RoleColumnGrants(Name alias, Table<RoleColumnGrantsRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoleColumnGrants(Name alias, Table<RoleColumnGrantsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.ROLE_COLUMN_GRANTS</code>
     * table reference
     */
    public RoleColumnGrants(String alias) {
        this(DSL.name(alias), ROLE_COLUMN_GRANTS);
    }

    /**
     * Create an aliased <code>information_schema.ROLE_COLUMN_GRANTS</code>
     * table reference
     */
    public RoleColumnGrants(Name alias) {
        this(alias, ROLE_COLUMN_GRANTS);
    }

    /**
     * Create a <code>information_schema.ROLE_COLUMN_GRANTS</code> table
     * reference
     */
    public RoleColumnGrants() {
        this(DSL.name("ROLE_COLUMN_GRANTS"), null);
    }

    public <O extends Record> RoleColumnGrants(Table<O> child, ForeignKey<O, RoleColumnGrantsRecord> key) {
        super(child, key, ROLE_COLUMN_GRANTS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public RoleColumnGrants as(String alias) {
        return new RoleColumnGrants(DSL.name(alias), this);
    }

    @Override
    public RoleColumnGrants as(Name alias) {
        return new RoleColumnGrants(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleColumnGrants rename(String name) {
        return new RoleColumnGrants(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleColumnGrants rename(Name name) {
        return new RoleColumnGrants(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}