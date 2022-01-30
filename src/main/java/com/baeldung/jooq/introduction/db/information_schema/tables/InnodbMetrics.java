/*
 * This file is generated by jOOQ.
 */
package com.baeldung.jooq.introduction.db.information_schema.tables;


import com.baeldung.jooq.introduction.db.information_schema.InformationSchema;
import com.baeldung.jooq.introduction.db.information_schema.tables.records.InnodbMetricsRecord;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row17;
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
public class InnodbMetrics extends TableImpl<InnodbMetricsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.INNODB_METRICS</code>
     */
    public static final InnodbMetrics INNODB_METRICS = new InnodbMetrics();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbMetricsRecord> getRecordType() {
        return InnodbMetricsRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_METRICS.NAME</code>.
     */
    public final TableField<InnodbMetricsRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_METRICS.SUBSYSTEM</code>.
     */
    public final TableField<InnodbMetricsRecord, String> SUBSYSTEM = createField(DSL.name("SUBSYSTEM"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_METRICS.COUNT</code>.
     */
    public final TableField<InnodbMetricsRecord, Long> COUNT = createField(DSL.name("COUNT"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.INNODB_METRICS.MAX_COUNT</code>.
     */
    public final TableField<InnodbMetricsRecord, Long> MAX_COUNT = createField(DSL.name("MAX_COUNT"), SQLDataType.BIGINT.defaultValue(DSL.inline("", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.INNODB_METRICS.MIN_COUNT</code>.
     */
    public final TableField<InnodbMetricsRecord, Long> MIN_COUNT = createField(DSL.name("MIN_COUNT"), SQLDataType.BIGINT.defaultValue(DSL.inline("", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.INNODB_METRICS.AVG_COUNT</code>.
     */
    public final TableField<InnodbMetricsRecord, Double> AVG_COUNT = createField(DSL.name("AVG_COUNT"), SQLDataType.FLOAT.defaultValue(DSL.inline("", SQLDataType.FLOAT)), this, "");

    /**
     * The column <code>information_schema.INNODB_METRICS.COUNT_RESET</code>.
     */
    public final TableField<InnodbMetricsRecord, Long> COUNT_RESET = createField(DSL.name("COUNT_RESET"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINT)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_METRICS.MAX_COUNT_RESET</code>.
     */
    public final TableField<InnodbMetricsRecord, Long> MAX_COUNT_RESET = createField(DSL.name("MAX_COUNT_RESET"), SQLDataType.BIGINT.defaultValue(DSL.inline("", SQLDataType.BIGINT)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_METRICS.MIN_COUNT_RESET</code>.
     */
    public final TableField<InnodbMetricsRecord, Long> MIN_COUNT_RESET = createField(DSL.name("MIN_COUNT_RESET"), SQLDataType.BIGINT.defaultValue(DSL.inline("", SQLDataType.BIGINT)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_METRICS.AVG_COUNT_RESET</code>.
     */
    public final TableField<InnodbMetricsRecord, Double> AVG_COUNT_RESET = createField(DSL.name("AVG_COUNT_RESET"), SQLDataType.FLOAT.defaultValue(DSL.inline("", SQLDataType.FLOAT)), this, "");

    /**
     * The column <code>information_schema.INNODB_METRICS.TIME_ENABLED</code>.
     */
    public final TableField<InnodbMetricsRecord, LocalDateTime> TIME_ENABLED = createField(DSL.name("TIME_ENABLED"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.inline("", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>information_schema.INNODB_METRICS.TIME_DISABLED</code>.
     */
    public final TableField<InnodbMetricsRecord, LocalDateTime> TIME_DISABLED = createField(DSL.name("TIME_DISABLED"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.inline("", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>information_schema.INNODB_METRICS.TIME_ELAPSED</code>.
     */
    public final TableField<InnodbMetricsRecord, Long> TIME_ELAPSED = createField(DSL.name("TIME_ELAPSED"), SQLDataType.BIGINT.defaultValue(DSL.inline("", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.INNODB_METRICS.TIME_RESET</code>.
     */
    public final TableField<InnodbMetricsRecord, LocalDateTime> TIME_RESET = createField(DSL.name("TIME_RESET"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.inline("", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>information_schema.INNODB_METRICS.STATUS</code>.
     */
    public final TableField<InnodbMetricsRecord, String> STATUS = createField(DSL.name("STATUS"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_METRICS.TYPE</code>.
     */
    public final TableField<InnodbMetricsRecord, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_METRICS.COMMENT</code>.
     */
    public final TableField<InnodbMetricsRecord, String> COMMENT = createField(DSL.name("COMMENT"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    private InnodbMetrics(Name alias, Table<InnodbMetricsRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbMetrics(Name alias, Table<InnodbMetricsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_METRICS</code> table
     * reference
     */
    public InnodbMetrics(String alias) {
        this(DSL.name(alias), INNODB_METRICS);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_METRICS</code> table
     * reference
     */
    public InnodbMetrics(Name alias) {
        this(alias, INNODB_METRICS);
    }

    /**
     * Create a <code>information_schema.INNODB_METRICS</code> table reference
     */
    public InnodbMetrics() {
        this(DSL.name("INNODB_METRICS"), null);
    }

    public <O extends Record> InnodbMetrics(Table<O> child, ForeignKey<O, InnodbMetricsRecord> key) {
        super(child, key, INNODB_METRICS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbMetrics as(String alias) {
        return new InnodbMetrics(DSL.name(alias), this);
    }

    @Override
    public InnodbMetrics as(Name alias) {
        return new InnodbMetrics(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbMetrics rename(String name) {
        return new InnodbMetrics(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbMetrics rename(Name name) {
        return new InnodbMetrics(name, null);
    }

    // -------------------------------------------------------------------------
    // Row17 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row17<String, String, Long, Long, Long, Double, Long, Long, Long, Double, LocalDateTime, LocalDateTime, Long, LocalDateTime, String, String, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }
}
