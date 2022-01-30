/*
 * This file is generated by jOOQ.
 */
package com.baeldung.jooq.introduction.db.information_schema.tables.records;


import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbCachedIndexes;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbCachedIndexesRecord extends TableRecordImpl<InnodbCachedIndexesRecord> implements Record3<UInteger, ULong, ULong> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.INNODB_CACHED_INDEXES.SPACE_ID</code>.
     */
    public void setSpaceId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_CACHED_INDEXES.SPACE_ID</code>.
     */
    public UInteger getSpaceId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_CACHED_INDEXES.INDEX_ID</code>.
     */
    public void setIndexId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_CACHED_INDEXES.INDEX_ID</code>.
     */
    public ULong getIndexId() {
        return (ULong) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_CACHED_INDEXES.N_CACHED_PAGES</code>.
     */
    public void setNCachedPages(ULong value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_CACHED_INDEXES.N_CACHED_PAGES</code>.
     */
    public ULong getNCachedPages() {
        return (ULong) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<UInteger, ULong, ULong> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<UInteger, ULong, ULong> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return InnodbCachedIndexes.INNODB_CACHED_INDEXES.SPACE_ID;
    }

    @Override
    public Field<ULong> field2() {
        return InnodbCachedIndexes.INNODB_CACHED_INDEXES.INDEX_ID;
    }

    @Override
    public Field<ULong> field3() {
        return InnodbCachedIndexes.INNODB_CACHED_INDEXES.N_CACHED_PAGES;
    }

    @Override
    public UInteger component1() {
        return getSpaceId();
    }

    @Override
    public ULong component2() {
        return getIndexId();
    }

    @Override
    public ULong component3() {
        return getNCachedPages();
    }

    @Override
    public UInteger value1() {
        return getSpaceId();
    }

    @Override
    public ULong value2() {
        return getIndexId();
    }

    @Override
    public ULong value3() {
        return getNCachedPages();
    }

    @Override
    public InnodbCachedIndexesRecord value1(UInteger value) {
        setSpaceId(value);
        return this;
    }

    @Override
    public InnodbCachedIndexesRecord value2(ULong value) {
        setIndexId(value);
        return this;
    }

    @Override
    public InnodbCachedIndexesRecord value3(ULong value) {
        setNCachedPages(value);
        return this;
    }

    @Override
    public InnodbCachedIndexesRecord values(UInteger value1, ULong value2, ULong value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbCachedIndexesRecord
     */
    public InnodbCachedIndexesRecord() {
        super(InnodbCachedIndexes.INNODB_CACHED_INDEXES);
    }

    /**
     * Create a detached, initialised InnodbCachedIndexesRecord
     */
    public InnodbCachedIndexesRecord(UInteger spaceId, ULong indexId, ULong nCachedPages) {
        super(InnodbCachedIndexes.INNODB_CACHED_INDEXES);

        setSpaceId(spaceId);
        setIndexId(indexId);
        setNCachedPages(nCachedPages);
    }
}
