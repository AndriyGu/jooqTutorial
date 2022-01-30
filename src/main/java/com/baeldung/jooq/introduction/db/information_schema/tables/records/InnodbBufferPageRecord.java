/*
 * This file is generated by jOOQ.
 */
package com.baeldung.jooq.introduction.db.information_schema.tables.records;


import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbBufferPage;

import org.jooq.Field;
import org.jooq.Record21;
import org.jooq.Row21;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbBufferPageRecord extends TableRecordImpl<InnodbBufferPageRecord> implements Record21<ULong, ULong, ULong, ULong, String, ULong, ULong, String, ULong, ULong, ULong, String, String, ULong, ULong, ULong, String, String, String, ULong, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.INNODB_BUFFER_PAGE.POOL_ID</code>.
     */
    public void setPoolId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_BUFFER_PAGE.POOL_ID</code>.
     */
    public ULong getPoolId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>information_schema.INNODB_BUFFER_PAGE.BLOCK_ID</code>.
     */
    public void setBlockId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_BUFFER_PAGE.BLOCK_ID</code>.
     */
    public ULong getBlockId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>information_schema.INNODB_BUFFER_PAGE.SPACE</code>.
     */
    public void setSpace(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_BUFFER_PAGE.SPACE</code>.
     */
    public ULong getSpace() {
        return (ULong) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_BUFFER_PAGE.PAGE_NUMBER</code>.
     */
    public void setPageNumber(ULong value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE.PAGE_NUMBER</code>.
     */
    public ULong getPageNumber() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>information_schema.INNODB_BUFFER_PAGE.PAGE_TYPE</code>.
     */
    public void setPageType(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_BUFFER_PAGE.PAGE_TYPE</code>.
     */
    public String getPageType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.INNODB_BUFFER_PAGE.FLUSH_TYPE</code>.
     */
    public void setFlushType(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_BUFFER_PAGE.FLUSH_TYPE</code>.
     */
    public ULong getFlushType() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>information_schema.INNODB_BUFFER_PAGE.FIX_COUNT</code>.
     */
    public void setFixCount(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_BUFFER_PAGE.FIX_COUNT</code>.
     */
    public ULong getFixCount() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>information_schema.INNODB_BUFFER_PAGE.IS_HASHED</code>.
     */
    public void setIsHashed(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_BUFFER_PAGE.IS_HASHED</code>.
     */
    public String getIsHashed() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_BUFFER_PAGE.NEWEST_MODIFICATION</code>.
     */
    public void setNewestModification(ULong value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE.NEWEST_MODIFICATION</code>.
     */
    public ULong getNewestModification() {
        return (ULong) get(8);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_BUFFER_PAGE.OLDEST_MODIFICATION</code>.
     */
    public void setOldestModification(ULong value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE.OLDEST_MODIFICATION</code>.
     */
    public ULong getOldestModification() {
        return (ULong) get(9);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_BUFFER_PAGE.ACCESS_TIME</code>.
     */
    public void setAccessTime(ULong value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE.ACCESS_TIME</code>.
     */
    public ULong getAccessTime() {
        return (ULong) get(10);
    }

    /**
     * Setter for <code>information_schema.INNODB_BUFFER_PAGE.TABLE_NAME</code>.
     */
    public void setTableName(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_BUFFER_PAGE.TABLE_NAME</code>.
     */
    public String getTableName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>information_schema.INNODB_BUFFER_PAGE.INDEX_NAME</code>.
     */
    public void setIndexName(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_BUFFER_PAGE.INDEX_NAME</code>.
     */
    public String getIndexName() {
        return (String) get(12);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_BUFFER_PAGE.NUMBER_RECORDS</code>.
     */
    public void setNumberRecords(ULong value) {
        set(13, value);
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE.NUMBER_RECORDS</code>.
     */
    public ULong getNumberRecords() {
        return (ULong) get(13);
    }

    /**
     * Setter for <code>information_schema.INNODB_BUFFER_PAGE.DATA_SIZE</code>.
     */
    public void setDataSize(ULong value) {
        set(14, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_BUFFER_PAGE.DATA_SIZE</code>.
     */
    public ULong getDataSize() {
        return (ULong) get(14);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_BUFFER_PAGE.COMPRESSED_SIZE</code>.
     */
    public void setCompressedSize(ULong value) {
        set(15, value);
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE.COMPRESSED_SIZE</code>.
     */
    public ULong getCompressedSize() {
        return (ULong) get(15);
    }

    /**
     * Setter for <code>information_schema.INNODB_BUFFER_PAGE.PAGE_STATE</code>.
     */
    public void setPageState(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_BUFFER_PAGE.PAGE_STATE</code>.
     */
    public String getPageState() {
        return (String) get(16);
    }

    /**
     * Setter for <code>information_schema.INNODB_BUFFER_PAGE.IO_FIX</code>.
     */
    public void setIoFix(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_BUFFER_PAGE.IO_FIX</code>.
     */
    public String getIoFix() {
        return (String) get(17);
    }

    /**
     * Setter for <code>information_schema.INNODB_BUFFER_PAGE.IS_OLD</code>.
     */
    public void setIsOld(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_BUFFER_PAGE.IS_OLD</code>.
     */
    public String getIsOld() {
        return (String) get(18);
    }

    /**
     * Setter for
     * <code>information_schema.INNODB_BUFFER_PAGE.FREE_PAGE_CLOCK</code>.
     */
    public void setFreePageClock(ULong value) {
        set(19, value);
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_BUFFER_PAGE.FREE_PAGE_CLOCK</code>.
     */
    public ULong getFreePageClock() {
        return (ULong) get(19);
    }

    /**
     * Setter for <code>information_schema.INNODB_BUFFER_PAGE.IS_STALE</code>.
     */
    public void setIsStale(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_BUFFER_PAGE.IS_STALE</code>.
     */
    public String getIsStale() {
        return (String) get(20);
    }

    // -------------------------------------------------------------------------
    // Record21 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row21<ULong, ULong, ULong, ULong, String, ULong, ULong, String, ULong, ULong, ULong, String, String, ULong, ULong, ULong, String, String, String, ULong, String> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    @Override
    public Row21<ULong, ULong, ULong, ULong, String, ULong, ULong, String, ULong, ULong, ULong, String, String, ULong, ULong, ULong, String, String, String, ULong, String> valuesRow() {
        return (Row21) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return InnodbBufferPage.INNODB_BUFFER_PAGE.POOL_ID;
    }

    @Override
    public Field<ULong> field2() {
        return InnodbBufferPage.INNODB_BUFFER_PAGE.BLOCK_ID;
    }

    @Override
    public Field<ULong> field3() {
        return InnodbBufferPage.INNODB_BUFFER_PAGE.SPACE;
    }

    @Override
    public Field<ULong> field4() {
        return InnodbBufferPage.INNODB_BUFFER_PAGE.PAGE_NUMBER;
    }

    @Override
    public Field<String> field5() {
        return InnodbBufferPage.INNODB_BUFFER_PAGE.PAGE_TYPE;
    }

    @Override
    public Field<ULong> field6() {
        return InnodbBufferPage.INNODB_BUFFER_PAGE.FLUSH_TYPE;
    }

    @Override
    public Field<ULong> field7() {
        return InnodbBufferPage.INNODB_BUFFER_PAGE.FIX_COUNT;
    }

    @Override
    public Field<String> field8() {
        return InnodbBufferPage.INNODB_BUFFER_PAGE.IS_HASHED;
    }

    @Override
    public Field<ULong> field9() {
        return InnodbBufferPage.INNODB_BUFFER_PAGE.NEWEST_MODIFICATION;
    }

    @Override
    public Field<ULong> field10() {
        return InnodbBufferPage.INNODB_BUFFER_PAGE.OLDEST_MODIFICATION;
    }

    @Override
    public Field<ULong> field11() {
        return InnodbBufferPage.INNODB_BUFFER_PAGE.ACCESS_TIME;
    }

    @Override
    public Field<String> field12() {
        return InnodbBufferPage.INNODB_BUFFER_PAGE.TABLE_NAME;
    }

    @Override
    public Field<String> field13() {
        return InnodbBufferPage.INNODB_BUFFER_PAGE.INDEX_NAME;
    }

    @Override
    public Field<ULong> field14() {
        return InnodbBufferPage.INNODB_BUFFER_PAGE.NUMBER_RECORDS;
    }

    @Override
    public Field<ULong> field15() {
        return InnodbBufferPage.INNODB_BUFFER_PAGE.DATA_SIZE;
    }

    @Override
    public Field<ULong> field16() {
        return InnodbBufferPage.INNODB_BUFFER_PAGE.COMPRESSED_SIZE;
    }

    @Override
    public Field<String> field17() {
        return InnodbBufferPage.INNODB_BUFFER_PAGE.PAGE_STATE;
    }

    @Override
    public Field<String> field18() {
        return InnodbBufferPage.INNODB_BUFFER_PAGE.IO_FIX;
    }

    @Override
    public Field<String> field19() {
        return InnodbBufferPage.INNODB_BUFFER_PAGE.IS_OLD;
    }

    @Override
    public Field<ULong> field20() {
        return InnodbBufferPage.INNODB_BUFFER_PAGE.FREE_PAGE_CLOCK;
    }

    @Override
    public Field<String> field21() {
        return InnodbBufferPage.INNODB_BUFFER_PAGE.IS_STALE;
    }

    @Override
    public ULong component1() {
        return getPoolId();
    }

    @Override
    public ULong component2() {
        return getBlockId();
    }

    @Override
    public ULong component3() {
        return getSpace();
    }

    @Override
    public ULong component4() {
        return getPageNumber();
    }

    @Override
    public String component5() {
        return getPageType();
    }

    @Override
    public ULong component6() {
        return getFlushType();
    }

    @Override
    public ULong component7() {
        return getFixCount();
    }

    @Override
    public String component8() {
        return getIsHashed();
    }

    @Override
    public ULong component9() {
        return getNewestModification();
    }

    @Override
    public ULong component10() {
        return getOldestModification();
    }

    @Override
    public ULong component11() {
        return getAccessTime();
    }

    @Override
    public String component12() {
        return getTableName();
    }

    @Override
    public String component13() {
        return getIndexName();
    }

    @Override
    public ULong component14() {
        return getNumberRecords();
    }

    @Override
    public ULong component15() {
        return getDataSize();
    }

    @Override
    public ULong component16() {
        return getCompressedSize();
    }

    @Override
    public String component17() {
        return getPageState();
    }

    @Override
    public String component18() {
        return getIoFix();
    }

    @Override
    public String component19() {
        return getIsOld();
    }

    @Override
    public ULong component20() {
        return getFreePageClock();
    }

    @Override
    public String component21() {
        return getIsStale();
    }

    @Override
    public ULong value1() {
        return getPoolId();
    }

    @Override
    public ULong value2() {
        return getBlockId();
    }

    @Override
    public ULong value3() {
        return getSpace();
    }

    @Override
    public ULong value4() {
        return getPageNumber();
    }

    @Override
    public String value5() {
        return getPageType();
    }

    @Override
    public ULong value6() {
        return getFlushType();
    }

    @Override
    public ULong value7() {
        return getFixCount();
    }

    @Override
    public String value8() {
        return getIsHashed();
    }

    @Override
    public ULong value9() {
        return getNewestModification();
    }

    @Override
    public ULong value10() {
        return getOldestModification();
    }

    @Override
    public ULong value11() {
        return getAccessTime();
    }

    @Override
    public String value12() {
        return getTableName();
    }

    @Override
    public String value13() {
        return getIndexName();
    }

    @Override
    public ULong value14() {
        return getNumberRecords();
    }

    @Override
    public ULong value15() {
        return getDataSize();
    }

    @Override
    public ULong value16() {
        return getCompressedSize();
    }

    @Override
    public String value17() {
        return getPageState();
    }

    @Override
    public String value18() {
        return getIoFix();
    }

    @Override
    public String value19() {
        return getIsOld();
    }

    @Override
    public ULong value20() {
        return getFreePageClock();
    }

    @Override
    public String value21() {
        return getIsStale();
    }

    @Override
    public InnodbBufferPageRecord value1(ULong value) {
        setPoolId(value);
        return this;
    }

    @Override
    public InnodbBufferPageRecord value2(ULong value) {
        setBlockId(value);
        return this;
    }

    @Override
    public InnodbBufferPageRecord value3(ULong value) {
        setSpace(value);
        return this;
    }

    @Override
    public InnodbBufferPageRecord value4(ULong value) {
        setPageNumber(value);
        return this;
    }

    @Override
    public InnodbBufferPageRecord value5(String value) {
        setPageType(value);
        return this;
    }

    @Override
    public InnodbBufferPageRecord value6(ULong value) {
        setFlushType(value);
        return this;
    }

    @Override
    public InnodbBufferPageRecord value7(ULong value) {
        setFixCount(value);
        return this;
    }

    @Override
    public InnodbBufferPageRecord value8(String value) {
        setIsHashed(value);
        return this;
    }

    @Override
    public InnodbBufferPageRecord value9(ULong value) {
        setNewestModification(value);
        return this;
    }

    @Override
    public InnodbBufferPageRecord value10(ULong value) {
        setOldestModification(value);
        return this;
    }

    @Override
    public InnodbBufferPageRecord value11(ULong value) {
        setAccessTime(value);
        return this;
    }

    @Override
    public InnodbBufferPageRecord value12(String value) {
        setTableName(value);
        return this;
    }

    @Override
    public InnodbBufferPageRecord value13(String value) {
        setIndexName(value);
        return this;
    }

    @Override
    public InnodbBufferPageRecord value14(ULong value) {
        setNumberRecords(value);
        return this;
    }

    @Override
    public InnodbBufferPageRecord value15(ULong value) {
        setDataSize(value);
        return this;
    }

    @Override
    public InnodbBufferPageRecord value16(ULong value) {
        setCompressedSize(value);
        return this;
    }

    @Override
    public InnodbBufferPageRecord value17(String value) {
        setPageState(value);
        return this;
    }

    @Override
    public InnodbBufferPageRecord value18(String value) {
        setIoFix(value);
        return this;
    }

    @Override
    public InnodbBufferPageRecord value19(String value) {
        setIsOld(value);
        return this;
    }

    @Override
    public InnodbBufferPageRecord value20(ULong value) {
        setFreePageClock(value);
        return this;
    }

    @Override
    public InnodbBufferPageRecord value21(String value) {
        setIsStale(value);
        return this;
    }

    @Override
    public InnodbBufferPageRecord values(ULong value1, ULong value2, ULong value3, ULong value4, String value5, ULong value6, ULong value7, String value8, ULong value9, ULong value10, ULong value11, String value12, String value13, ULong value14, ULong value15, ULong value16, String value17, String value18, String value19, ULong value20, String value21) {
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
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbBufferPageRecord
     */
    public InnodbBufferPageRecord() {
        super(InnodbBufferPage.INNODB_BUFFER_PAGE);
    }

    /**
     * Create a detached, initialised InnodbBufferPageRecord
     */
    public InnodbBufferPageRecord(ULong poolId, ULong blockId, ULong space, ULong pageNumber, String pageType, ULong flushType, ULong fixCount, String isHashed, ULong newestModification, ULong oldestModification, ULong accessTime, String tableName, String indexName, ULong numberRecords, ULong dataSize, ULong compressedSize, String pageState, String ioFix, String isOld, ULong freePageClock, String isStale) {
        super(InnodbBufferPage.INNODB_BUFFER_PAGE);

        setPoolId(poolId);
        setBlockId(blockId);
        setSpace(space);
        setPageNumber(pageNumber);
        setPageType(pageType);
        setFlushType(flushType);
        setFixCount(fixCount);
        setIsHashed(isHashed);
        setNewestModification(newestModification);
        setOldestModification(oldestModification);
        setAccessTime(accessTime);
        setTableName(tableName);
        setIndexName(indexName);
        setNumberRecords(numberRecords);
        setDataSize(dataSize);
        setCompressedSize(compressedSize);
        setPageState(pageState);
        setIoFix(ioFix);
        setIsOld(isOld);
        setFreePageClock(freePageClock);
        setIsStale(isStale);
    }
}
