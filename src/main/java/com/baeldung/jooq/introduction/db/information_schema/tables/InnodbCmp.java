/*
 * This file is generated by jOOQ.
 */
package com.baeldung.jooq.introduction.db.information_schema.tables;


import com.baeldung.jooq.introduction.db.information_schema.InformationSchema;
import com.baeldung.jooq.introduction.db.information_schema.tables.records.InnodbCmpRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
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
public class InnodbCmp extends TableImpl<InnodbCmpRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.INNODB_CMP</code>
     */
    public static final InnodbCmp INNODB_CMP = new InnodbCmp();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbCmpRecord> getRecordType() {
        return InnodbCmpRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_CMP.page_size</code>.
     */
    public final TableField<InnodbCmpRecord, Integer> PAGE_SIZE = createField(DSL.name("page_size"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMP.compress_ops</code>.
     */
    public final TableField<InnodbCmpRecord, Integer> COMPRESS_OPS = createField(DSL.name("compress_ops"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMP.compress_ops_ok</code>.
     */
    public final TableField<InnodbCmpRecord, Integer> COMPRESS_OPS_OK = createField(DSL.name("compress_ops_ok"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMP.compress_time</code>.
     */
    public final TableField<InnodbCmpRecord, Integer> COMPRESS_TIME = createField(DSL.name("compress_time"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMP.uncompress_ops</code>.
     */
    public final TableField<InnodbCmpRecord, Integer> UNCOMPRESS_OPS = createField(DSL.name("uncompress_ops"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMP.uncompress_time</code>.
     */
    public final TableField<InnodbCmpRecord, Integer> UNCOMPRESS_TIME = createField(DSL.name("uncompress_time"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGER)), this, "");

    private InnodbCmp(Name alias, Table<InnodbCmpRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbCmp(Name alias, Table<InnodbCmpRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_CMP</code> table
     * reference
     */
    public InnodbCmp(String alias) {
        this(DSL.name(alias), INNODB_CMP);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_CMP</code> table
     * reference
     */
    public InnodbCmp(Name alias) {
        this(alias, INNODB_CMP);
    }

    /**
     * Create a <code>information_schema.INNODB_CMP</code> table reference
     */
    public InnodbCmp() {
        this(DSL.name("INNODB_CMP"), null);
    }

    public <O extends Record> InnodbCmp(Table<O> child, ForeignKey<O, InnodbCmpRecord> key) {
        super(child, key, INNODB_CMP);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbCmp as(String alias) {
        return new InnodbCmp(DSL.name(alias), this);
    }

    @Override
    public InnodbCmp as(Name alias) {
        return new InnodbCmp(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbCmp rename(String name) {
        return new InnodbCmp(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbCmp rename(Name name) {
        return new InnodbCmp(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
