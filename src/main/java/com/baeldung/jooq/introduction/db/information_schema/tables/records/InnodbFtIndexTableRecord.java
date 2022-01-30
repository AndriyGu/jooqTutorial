/*
 * This file is generated by jOOQ.
 */
package com.baeldung.jooq.introduction.db.information_schema.tables.records;


import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbFtIndexTable;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbFtIndexTableRecord extends TableRecordImpl<InnodbFtIndexTableRecord> implements Record6<String, ULong, ULong, ULong, ULong, ULong> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.INNODB_FT_INDEX_TABLE.WORD</code>.
     */
    public void setWord(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_FT_INDEX_TABLE.WORD</code>.
     */
    public String getWord() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_FT_INDEX_TABLE.FIRST_DOC_ID</code>.
     */
    public void setFirstDocId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_FT_INDEX_TABLE.FIRST_DOC_ID</code>.
     */
    public ULong getFirstDocId() {
        return (ULong) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_FT_INDEX_TABLE.LAST_DOC_ID</code>.
     */
    public void setLastDocId(ULong value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_FT_INDEX_TABLE.LAST_DOC_ID</code>.
     */
    public ULong getLastDocId() {
        return (ULong) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_FT_INDEX_TABLE.DOC_COUNT</code>.
     */
    public void setDocCount(ULong value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_FT_INDEX_TABLE.DOC_COUNT</code>.
     */
    public ULong getDocCount() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>information_schema.INNODB_FT_INDEX_TABLE.DOC_ID</code>.
     */
    public void setDocId(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_FT_INDEX_TABLE.DOC_ID</code>.
     */
    public ULong getDocId() {
        return (ULong) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_FT_INDEX_TABLE.POSITION</code>.
     */
    public void setPosition(ULong value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_FT_INDEX_TABLE.POSITION</code>.
     */
    public ULong getPosition() {
        return (ULong) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, ULong, ULong, ULong, ULong, ULong> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<String, ULong, ULong, ULong, ULong, ULong> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return InnodbFtIndexTable.INNODB_FT_INDEX_TABLE.WORD;
    }

    @Override
    public Field<ULong> field2() {
        return InnodbFtIndexTable.INNODB_FT_INDEX_TABLE.FIRST_DOC_ID;
    }

    @Override
    public Field<ULong> field3() {
        return InnodbFtIndexTable.INNODB_FT_INDEX_TABLE.LAST_DOC_ID;
    }

    @Override
    public Field<ULong> field4() {
        return InnodbFtIndexTable.INNODB_FT_INDEX_TABLE.DOC_COUNT;
    }

    @Override
    public Field<ULong> field5() {
        return InnodbFtIndexTable.INNODB_FT_INDEX_TABLE.DOC_ID;
    }

    @Override
    public Field<ULong> field6() {
        return InnodbFtIndexTable.INNODB_FT_INDEX_TABLE.POSITION;
    }

    @Override
    public String component1() {
        return getWord();
    }

    @Override
    public ULong component2() {
        return getFirstDocId();
    }

    @Override
    public ULong component3() {
        return getLastDocId();
    }

    @Override
    public ULong component4() {
        return getDocCount();
    }

    @Override
    public ULong component5() {
        return getDocId();
    }

    @Override
    public ULong component6() {
        return getPosition();
    }

    @Override
    public String value1() {
        return getWord();
    }

    @Override
    public ULong value2() {
        return getFirstDocId();
    }

    @Override
    public ULong value3() {
        return getLastDocId();
    }

    @Override
    public ULong value4() {
        return getDocCount();
    }

    @Override
    public ULong value5() {
        return getDocId();
    }

    @Override
    public ULong value6() {
        return getPosition();
    }

    @Override
    public InnodbFtIndexTableRecord value1(String value) {
        setWord(value);
        return this;
    }

    @Override
    public InnodbFtIndexTableRecord value2(ULong value) {
        setFirstDocId(value);
        return this;
    }

    @Override
    public InnodbFtIndexTableRecord value3(ULong value) {
        setLastDocId(value);
        return this;
    }

    @Override
    public InnodbFtIndexTableRecord value4(ULong value) {
        setDocCount(value);
        return this;
    }

    @Override
    public InnodbFtIndexTableRecord value5(ULong value) {
        setDocId(value);
        return this;
    }

    @Override
    public InnodbFtIndexTableRecord value6(ULong value) {
        setPosition(value);
        return this;
    }

    @Override
    public InnodbFtIndexTableRecord values(String value1, ULong value2, ULong value3, ULong value4, ULong value5, ULong value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbFtIndexTableRecord
     */
    public InnodbFtIndexTableRecord() {
        super(InnodbFtIndexTable.INNODB_FT_INDEX_TABLE);
    }

    /**
     * Create a detached, initialised InnodbFtIndexTableRecord
     */
    public InnodbFtIndexTableRecord(String word, ULong firstDocId, ULong lastDocId, ULong docCount, ULong docId, ULong position) {
        super(InnodbFtIndexTable.INNODB_FT_INDEX_TABLE);

        setWord(word);
        setFirstDocId(firstDocId);
        setLastDocId(lastDocId);
        setDocCount(docCount);
        setDocId(docId);
        setPosition(position);
    }
}
