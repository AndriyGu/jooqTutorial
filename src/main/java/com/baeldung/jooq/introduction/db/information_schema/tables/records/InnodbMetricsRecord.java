/*
 * This file is generated by jOOQ.
 */
package com.baeldung.jooq.introduction.db.information_schema.tables.records;


import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbMetrics;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbMetricsRecord extends TableRecordImpl<InnodbMetricsRecord> implements Record17<String, String, Long, Long, Long, Double, Long, Long, Long, Double, LocalDateTime, LocalDateTime, Long, LocalDateTime, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.INNODB_METRICS.NAME</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_METRICS.NAME</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.INNODB_METRICS.SUBSYSTEM</code>.
     */
    public void setSubsystem(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_METRICS.SUBSYSTEM</code>.
     */
    public String getSubsystem() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.INNODB_METRICS.COUNT</code>.
     */
    public void setCount(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_METRICS.COUNT</code>.
     */
    public Long getCount() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>information_schema.INNODB_METRICS.MAX_COUNT</code>.
     */
    public void setMaxCount(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_METRICS.MAX_COUNT</code>.
     */
    public Long getMaxCount() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>information_schema.INNODB_METRICS.MIN_COUNT</code>.
     */
    public void setMinCount(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_METRICS.MIN_COUNT</code>.
     */
    public Long getMinCount() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>information_schema.INNODB_METRICS.AVG_COUNT</code>.
     */
    public void setAvgCount(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_METRICS.AVG_COUNT</code>.
     */
    public Double getAvgCount() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>information_schema.INNODB_METRICS.COUNT_RESET</code>.
     */
    public void setCountReset(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_METRICS.COUNT_RESET</code>.
     */
    public Long getCountReset() {
        return (Long) get(6);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_METRICS.MAX_COUNT_RESET</code>.
     */
    public void setMaxCountReset(Long value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_METRICS.MAX_COUNT_RESET</code>.
     */
    public Long getMaxCountReset() {
        return (Long) get(7);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_METRICS.MIN_COUNT_RESET</code>.
     */
    public void setMinCountReset(Long value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_METRICS.MIN_COUNT_RESET</code>.
     */
    public Long getMinCountReset() {
        return (Long) get(8);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_METRICS.AVG_COUNT_RESET</code>.
     */
    public void setAvgCountReset(Double value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_METRICS.AVG_COUNT_RESET</code>.
     */
    public Double getAvgCountReset() {
        return (Double) get(9);
    }

    /**
     * Setter for <code>information_schema.INNODB_METRICS.TIME_ENABLED</code>.
     */
    public void setTimeEnabled(LocalDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_METRICS.TIME_ENABLED</code>.
     */
    public LocalDateTime getTimeEnabled() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>information_schema.INNODB_METRICS.TIME_DISABLED</code>.
     */
    public void setTimeDisabled(LocalDateTime value) {
        set(11, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_METRICS.TIME_DISABLED</code>.
     */
    public LocalDateTime getTimeDisabled() {
        return (LocalDateTime) get(11);
    }

    /**
     * Setter for <code>information_schema.INNODB_METRICS.TIME_ELAPSED</code>.
     */
    public void setTimeElapsed(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_METRICS.TIME_ELAPSED</code>.
     */
    public Long getTimeElapsed() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>information_schema.INNODB_METRICS.TIME_RESET</code>.
     */
    public void setTimeReset(LocalDateTime value) {
        set(13, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_METRICS.TIME_RESET</code>.
     */
    public LocalDateTime getTimeReset() {
        return (LocalDateTime) get(13);
    }

    /**
     * Setter for <code>information_schema.INNODB_METRICS.STATUS</code>.
     */
    public void setStatus(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_METRICS.STATUS</code>.
     */
    public String getStatus() {
        return (String) get(14);
    }

    /**
     * Setter for <code>information_schema.INNODB_METRICS.TYPE</code>.
     */
    public void setType(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_METRICS.TYPE</code>.
     */
    public String getType() {
        return (String) get(15);
    }

    /**
     * Setter for <code>information_schema.INNODB_METRICS.COMMENT</code>.
     */
    public void setComment(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_METRICS.COMMENT</code>.
     */
    public String getComment() {
        return (String) get(16);
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row17<String, String, Long, Long, Long, Double, Long, Long, Long, Double, LocalDateTime, LocalDateTime, Long, LocalDateTime, String, String, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    @Override
    public Row17<String, String, Long, Long, Long, Double, Long, Long, Long, Double, LocalDateTime, LocalDateTime, Long, LocalDateTime, String, String, String> valuesRow() {
        return (Row17) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return InnodbMetrics.INNODB_METRICS.NAME;
    }

    @Override
    public Field<String> field2() {
        return InnodbMetrics.INNODB_METRICS.SUBSYSTEM;
    }

    @Override
    public Field<Long> field3() {
        return InnodbMetrics.INNODB_METRICS.COUNT;
    }

    @Override
    public Field<Long> field4() {
        return InnodbMetrics.INNODB_METRICS.MAX_COUNT;
    }

    @Override
    public Field<Long> field5() {
        return InnodbMetrics.INNODB_METRICS.MIN_COUNT;
    }

    @Override
    public Field<Double> field6() {
        return InnodbMetrics.INNODB_METRICS.AVG_COUNT;
    }

    @Override
    public Field<Long> field7() {
        return InnodbMetrics.INNODB_METRICS.COUNT_RESET;
    }

    @Override
    public Field<Long> field8() {
        return InnodbMetrics.INNODB_METRICS.MAX_COUNT_RESET;
    }

    @Override
    public Field<Long> field9() {
        return InnodbMetrics.INNODB_METRICS.MIN_COUNT_RESET;
    }

    @Override
    public Field<Double> field10() {
        return InnodbMetrics.INNODB_METRICS.AVG_COUNT_RESET;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return InnodbMetrics.INNODB_METRICS.TIME_ENABLED;
    }

    @Override
    public Field<LocalDateTime> field12() {
        return InnodbMetrics.INNODB_METRICS.TIME_DISABLED;
    }

    @Override
    public Field<Long> field13() {
        return InnodbMetrics.INNODB_METRICS.TIME_ELAPSED;
    }

    @Override
    public Field<LocalDateTime> field14() {
        return InnodbMetrics.INNODB_METRICS.TIME_RESET;
    }

    @Override
    public Field<String> field15() {
        return InnodbMetrics.INNODB_METRICS.STATUS;
    }

    @Override
    public Field<String> field16() {
        return InnodbMetrics.INNODB_METRICS.TYPE;
    }

    @Override
    public Field<String> field17() {
        return InnodbMetrics.INNODB_METRICS.COMMENT;
    }

    @Override
    public String component1() {
        return getName();
    }

    @Override
    public String component2() {
        return getSubsystem();
    }

    @Override
    public Long component3() {
        return getCount();
    }

    @Override
    public Long component4() {
        return getMaxCount();
    }

    @Override
    public Long component5() {
        return getMinCount();
    }

    @Override
    public Double component6() {
        return getAvgCount();
    }

    @Override
    public Long component7() {
        return getCountReset();
    }

    @Override
    public Long component8() {
        return getMaxCountReset();
    }

    @Override
    public Long component9() {
        return getMinCountReset();
    }

    @Override
    public Double component10() {
        return getAvgCountReset();
    }

    @Override
    public LocalDateTime component11() {
        return getTimeEnabled();
    }

    @Override
    public LocalDateTime component12() {
        return getTimeDisabled();
    }

    @Override
    public Long component13() {
        return getTimeElapsed();
    }

    @Override
    public LocalDateTime component14() {
        return getTimeReset();
    }

    @Override
    public String component15() {
        return getStatus();
    }

    @Override
    public String component16() {
        return getType();
    }

    @Override
    public String component17() {
        return getComment();
    }

    @Override
    public String value1() {
        return getName();
    }

    @Override
    public String value2() {
        return getSubsystem();
    }

    @Override
    public Long value3() {
        return getCount();
    }

    @Override
    public Long value4() {
        return getMaxCount();
    }

    @Override
    public Long value5() {
        return getMinCount();
    }

    @Override
    public Double value6() {
        return getAvgCount();
    }

    @Override
    public Long value7() {
        return getCountReset();
    }

    @Override
    public Long value8() {
        return getMaxCountReset();
    }

    @Override
    public Long value9() {
        return getMinCountReset();
    }

    @Override
    public Double value10() {
        return getAvgCountReset();
    }

    @Override
    public LocalDateTime value11() {
        return getTimeEnabled();
    }

    @Override
    public LocalDateTime value12() {
        return getTimeDisabled();
    }

    @Override
    public Long value13() {
        return getTimeElapsed();
    }

    @Override
    public LocalDateTime value14() {
        return getTimeReset();
    }

    @Override
    public String value15() {
        return getStatus();
    }

    @Override
    public String value16() {
        return getType();
    }

    @Override
    public String value17() {
        return getComment();
    }

    @Override
    public InnodbMetricsRecord value1(String value) {
        setName(value);
        return this;
    }

    @Override
    public InnodbMetricsRecord value2(String value) {
        setSubsystem(value);
        return this;
    }

    @Override
    public InnodbMetricsRecord value3(Long value) {
        setCount(value);
        return this;
    }

    @Override
    public InnodbMetricsRecord value4(Long value) {
        setMaxCount(value);
        return this;
    }

    @Override
    public InnodbMetricsRecord value5(Long value) {
        setMinCount(value);
        return this;
    }

    @Override
    public InnodbMetricsRecord value6(Double value) {
        setAvgCount(value);
        return this;
    }

    @Override
    public InnodbMetricsRecord value7(Long value) {
        setCountReset(value);
        return this;
    }

    @Override
    public InnodbMetricsRecord value8(Long value) {
        setMaxCountReset(value);
        return this;
    }

    @Override
    public InnodbMetricsRecord value9(Long value) {
        setMinCountReset(value);
        return this;
    }

    @Override
    public InnodbMetricsRecord value10(Double value) {
        setAvgCountReset(value);
        return this;
    }

    @Override
    public InnodbMetricsRecord value11(LocalDateTime value) {
        setTimeEnabled(value);
        return this;
    }

    @Override
    public InnodbMetricsRecord value12(LocalDateTime value) {
        setTimeDisabled(value);
        return this;
    }

    @Override
    public InnodbMetricsRecord value13(Long value) {
        setTimeElapsed(value);
        return this;
    }

    @Override
    public InnodbMetricsRecord value14(LocalDateTime value) {
        setTimeReset(value);
        return this;
    }

    @Override
    public InnodbMetricsRecord value15(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public InnodbMetricsRecord value16(String value) {
        setType(value);
        return this;
    }

    @Override
    public InnodbMetricsRecord value17(String value) {
        setComment(value);
        return this;
    }

    @Override
    public InnodbMetricsRecord values(String value1, String value2, Long value3, Long value4, Long value5, Double value6, Long value7, Long value8, Long value9, Double value10, LocalDateTime value11, LocalDateTime value12, Long value13, LocalDateTime value14, String value15, String value16, String value17) {
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
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbMetricsRecord
     */
    public InnodbMetricsRecord() {
        super(InnodbMetrics.INNODB_METRICS);
    }

    /**
     * Create a detached, initialised InnodbMetricsRecord
     */
    public InnodbMetricsRecord(String name, String subsystem, Long count, Long maxCount, Long minCount, Double avgCount, Long countReset, Long maxCountReset, Long minCountReset, Double avgCountReset, LocalDateTime timeEnabled, LocalDateTime timeDisabled, Long timeElapsed, LocalDateTime timeReset, String status, String type, String comment) {
        super(InnodbMetrics.INNODB_METRICS);

        setName(name);
        setSubsystem(subsystem);
        setCount(count);
        setMaxCount(maxCount);
        setMinCount(minCount);
        setAvgCount(avgCount);
        setCountReset(countReset);
        setMaxCountReset(maxCountReset);
        setMinCountReset(minCountReset);
        setAvgCountReset(avgCountReset);
        setTimeEnabled(timeEnabled);
        setTimeDisabled(timeDisabled);
        setTimeElapsed(timeElapsed);
        setTimeReset(timeReset);
        setStatus(status);
        setType(type);
        setComment(comment);
    }
}
