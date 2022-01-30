/*
 * This file is generated by jOOQ.
 */
package com.baeldung.jooq.introduction.db.information_schema.tables;


import com.baeldung.jooq.introduction.db.information_schema.InformationSchema;
import com.baeldung.jooq.introduction.db.information_schema.tables.records.InnodbTablespacesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row15;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbTablespaces extends TableImpl<InnodbTablespacesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.INNODB_TABLESPACES</code>
     */
    public static final InnodbTablespaces INNODB_TABLESPACES = new InnodbTablespaces();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbTablespacesRecord> getRecordType() {
        return InnodbTablespacesRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_TABLESPACES.SPACE</code>.
     */
    public final TableField<InnodbTablespacesRecord, UInteger> SPACE = createField(DSL.name("SPACE"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLESPACES.NAME</code>.
     */
    public final TableField<InnodbTablespacesRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(218).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLESPACES.FLAG</code>.
     */
    public final TableField<InnodbTablespacesRecord, UInteger> FLAG = createField(DSL.name("FLAG"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLESPACES.ROW_FORMAT</code>.
     */
    public final TableField<InnodbTablespacesRecord, String> ROW_FORMAT = createField(DSL.name("ROW_FORMAT"), SQLDataType.VARCHAR(7).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLESPACES.PAGE_SIZE</code>.
     */
    public final TableField<InnodbTablespacesRecord, UInteger> PAGE_SIZE = createField(DSL.name("PAGE_SIZE"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_TABLESPACES.ZIP_PAGE_SIZE</code>.
     */
    public final TableField<InnodbTablespacesRecord, UInteger> ZIP_PAGE_SIZE = createField(DSL.name("ZIP_PAGE_SIZE"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLESPACES.SPACE_TYPE</code>.
     */
    public final TableField<InnodbTablespacesRecord, String> SPACE_TYPE = createField(DSL.name("SPACE_TYPE"), SQLDataType.VARCHAR(3).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_TABLESPACES.FS_BLOCK_SIZE</code>.
     */
    public final TableField<InnodbTablespacesRecord, UInteger> FS_BLOCK_SIZE = createField(DSL.name("FS_BLOCK_SIZE"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLESPACES.FILE_SIZE</code>.
     */
    public final TableField<InnodbTablespacesRecord, ULong> FILE_SIZE = createField(DSL.name("FILE_SIZE"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_TABLESPACES.ALLOCATED_SIZE</code>.
     */
    public final TableField<InnodbTablespacesRecord, ULong> ALLOCATED_SIZE = createField(DSL.name("ALLOCATED_SIZE"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_TABLESPACES.AUTOEXTEND_SIZE</code>.
     */
    public final TableField<InnodbTablespacesRecord, ULong> AUTOEXTEND_SIZE = createField(DSL.name("AUTOEXTEND_SIZE"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_TABLESPACES.SERVER_VERSION</code>.
     */
    public final TableField<InnodbTablespacesRecord, String> SERVER_VERSION = createField(DSL.name("SERVER_VERSION"), SQLDataType.VARCHAR(3).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_TABLESPACES.SPACE_VERSION</code>.
     */
    public final TableField<InnodbTablespacesRecord, UInteger> SPACE_VERSION = createField(DSL.name("SPACE_VERSION"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLESPACES.ENCRYPTION</code>.
     */
    public final TableField<InnodbTablespacesRecord, String> ENCRYPTION = createField(DSL.name("ENCRYPTION"), SQLDataType.VARCHAR.defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_TABLESPACES.STATE</code>.
     */
    public final TableField<InnodbTablespacesRecord, String> STATE = createField(DSL.name("STATE"), SQLDataType.VARCHAR(3).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    private InnodbTablespaces(Name alias, Table<InnodbTablespacesRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbTablespaces(Name alias, Table<InnodbTablespacesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_TABLESPACES</code>
     * table reference
     */
    public InnodbTablespaces(String alias) {
        this(DSL.name(alias), INNODB_TABLESPACES);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_TABLESPACES</code>
     * table reference
     */
    public InnodbTablespaces(Name alias) {
        this(alias, INNODB_TABLESPACES);
    }

    /**
     * Create a <code>information_schema.INNODB_TABLESPACES</code> table
     * reference
     */
    public InnodbTablespaces() {
        this(DSL.name("INNODB_TABLESPACES"), null);
    }

    public <O extends Record> InnodbTablespaces(Table<O> child, ForeignKey<O, InnodbTablespacesRecord> key) {
        super(child, key, INNODB_TABLESPACES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbTablespaces as(String alias) {
        return new InnodbTablespaces(DSL.name(alias), this);
    }

    @Override
    public InnodbTablespaces as(Name alias) {
        return new InnodbTablespaces(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbTablespaces rename(String name) {
        return new InnodbTablespaces(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbTablespaces rename(Name name) {
        return new InnodbTablespaces(name, null);
    }

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row15<UInteger, String, UInteger, String, UInteger, UInteger, String, UInteger, ULong, ULong, ULong, String, UInteger, String, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }
}
