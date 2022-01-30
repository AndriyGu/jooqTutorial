/*
 * This file is generated by jOOQ.
 */
package com.baeldung.jooq.introduction.db.information_schema.tables;


import com.baeldung.jooq.introduction.db.information_schema.InformationSchema;
import com.baeldung.jooq.introduction.db.information_schema.tables.records.ProcesslistRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Processlist extends TableImpl<ProcesslistRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.PROCESSLIST</code>
     */
    public static final Processlist PROCESSLIST = new Processlist();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProcesslistRecord> getRecordType() {
        return ProcesslistRecord.class;
    }

    /**
     * The column <code>information_schema.PROCESSLIST.ID</code>.
     */
    public final TableField<ProcesslistRecord, ULong> ID = createField(DSL.name("ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.PROCESSLIST.USER</code>.
     */
    public final TableField<ProcesslistRecord, String> USER = createField(DSL.name("USER"), SQLDataType.VARCHAR(10).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PROCESSLIST.HOST</code>.
     */
    public final TableField<ProcesslistRecord, String> HOST = createField(DSL.name("HOST"), SQLDataType.VARCHAR(87).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PROCESSLIST.DB</code>.
     */
    public final TableField<ProcesslistRecord, String> DB = createField(DSL.name("DB"), SQLDataType.VARCHAR(21).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PROCESSLIST.COMMAND</code>.
     */
    public final TableField<ProcesslistRecord, String> COMMAND = createField(DSL.name("COMMAND"), SQLDataType.VARCHAR(5).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PROCESSLIST.TIME</code>.
     */
    public final TableField<ProcesslistRecord, Integer> TIME = createField(DSL.name("TIME"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.PROCESSLIST.STATE</code>.
     */
    public final TableField<ProcesslistRecord, String> STATE = createField(DSL.name("STATE"), SQLDataType.VARCHAR(21).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.PROCESSLIST.INFO</code>.
     */
    public final TableField<ProcesslistRecord, String> INFO = createField(DSL.name("INFO"), SQLDataType.VARCHAR(21845).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    private Processlist(Name alias, Table<ProcesslistRecord> aliased) {
        this(alias, aliased, null);
    }

    private Processlist(Name alias, Table<ProcesslistRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.PROCESSLIST</code> table
     * reference
     */
    public Processlist(String alias) {
        this(DSL.name(alias), PROCESSLIST);
    }

    /**
     * Create an aliased <code>information_schema.PROCESSLIST</code> table
     * reference
     */
    public Processlist(Name alias) {
        this(alias, PROCESSLIST);
    }

    /**
     * Create a <code>information_schema.PROCESSLIST</code> table reference
     */
    public Processlist() {
        this(DSL.name("PROCESSLIST"), null);
    }

    public <O extends Record> Processlist(Table<O> child, ForeignKey<O, ProcesslistRecord> key) {
        super(child, key, PROCESSLIST);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Processlist as(String alias) {
        return new Processlist(DSL.name(alias), this);
    }

    @Override
    public Processlist as(Name alias) {
        return new Processlist(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Processlist rename(String name) {
        return new Processlist(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Processlist rename(Name name) {
        return new Processlist(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<ULong, String, String, String, String, Integer, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
