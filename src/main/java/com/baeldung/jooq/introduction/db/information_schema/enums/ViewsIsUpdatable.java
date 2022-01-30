/*
 * This file is generated by jOOQ.
 */
package com.baeldung.jooq.introduction.db.information_schema.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum ViewsIsUpdatable implements EnumType {

    NO("NO"),

    YES("YES");

    private final String literal;

    private ViewsIsUpdatable(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return null;
    }

    @Override
    public Schema getSchema() {
        return null;
    }

    @Override
    public String getName() {
        return "VIEWS_IS_UPDATABLE";
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal
     */
    public static ViewsIsUpdatable lookupLiteral(String literal) {
        return EnumType.lookupLiteral(ViewsIsUpdatable.class, literal);
    }
}
