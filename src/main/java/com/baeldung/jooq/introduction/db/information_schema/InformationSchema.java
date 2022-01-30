/*
 * This file is generated by jOOQ.
 */
package com.baeldung.jooq.introduction.db.information_schema;


import com.baeldung.jooq.introduction.db.DefaultCatalog;
import com.baeldung.jooq.introduction.db.information_schema.tables.AdministrableRoleAuthorizations;
import com.baeldung.jooq.introduction.db.information_schema.tables.ApplicableRoles;
import com.baeldung.jooq.introduction.db.information_schema.tables.CharacterSets;
import com.baeldung.jooq.introduction.db.information_schema.tables.CheckConstraints;
import com.baeldung.jooq.introduction.db.information_schema.tables.CollationCharacterSetApplicability;
import com.baeldung.jooq.introduction.db.information_schema.tables.Collations;
import com.baeldung.jooq.introduction.db.information_schema.tables.ColumnPrivileges;
import com.baeldung.jooq.introduction.db.information_schema.tables.ColumnStatistics;
import com.baeldung.jooq.introduction.db.information_schema.tables.Columns;
import com.baeldung.jooq.introduction.db.information_schema.tables.ColumnsExtensions;
import com.baeldung.jooq.introduction.db.information_schema.tables.EnabledRoles;
import com.baeldung.jooq.introduction.db.information_schema.tables.Engines;
import com.baeldung.jooq.introduction.db.information_schema.tables.Events;
import com.baeldung.jooq.introduction.db.information_schema.tables.Files;
import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbBufferPage;
import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbBufferPageLru;
import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbBufferPoolStats;
import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbCachedIndexes;
import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbCmp;
import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbCmpPerIndex;
import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbCmpPerIndexReset;
import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbCmpReset;
import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbCmpmem;
import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbCmpmemReset;
import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbColumns;
import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbDatafiles;
import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbFields;
import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbForeign;
import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbForeignCols;
import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbFtBeingDeleted;
import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbFtConfig;
import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbFtDefaultStopword;
import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbFtDeleted;
import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbFtIndexCache;
import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbFtIndexTable;
import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbIndexes;
import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbMetrics;
import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbSessionTempTablespaces;
import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbTables;
import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbTablespaces;
import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbTablespacesBrief;
import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbTablestats;
import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbTempTableInfo;
import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbTrx;
import com.baeldung.jooq.introduction.db.information_schema.tables.InnodbVirtual;
import com.baeldung.jooq.introduction.db.information_schema.tables.KeyColumnUsage;
import com.baeldung.jooq.introduction.db.information_schema.tables.Keywords;
import com.baeldung.jooq.introduction.db.information_schema.tables.OptimizerTrace;
import com.baeldung.jooq.introduction.db.information_schema.tables.Parameters;
import com.baeldung.jooq.introduction.db.information_schema.tables.Partitions;
import com.baeldung.jooq.introduction.db.information_schema.tables.Plugins;
import com.baeldung.jooq.introduction.db.information_schema.tables.Processlist;
import com.baeldung.jooq.introduction.db.information_schema.tables.Profiling;
import com.baeldung.jooq.introduction.db.information_schema.tables.ReferentialConstraints;
import com.baeldung.jooq.introduction.db.information_schema.tables.ResourceGroups;
import com.baeldung.jooq.introduction.db.information_schema.tables.RoleColumnGrants;
import com.baeldung.jooq.introduction.db.information_schema.tables.RoleRoutineGrants;
import com.baeldung.jooq.introduction.db.information_schema.tables.RoleTableGrants;
import com.baeldung.jooq.introduction.db.information_schema.tables.Routines;
import com.baeldung.jooq.introduction.db.information_schema.tables.SchemaPrivileges;
import com.baeldung.jooq.introduction.db.information_schema.tables.Schemata;
import com.baeldung.jooq.introduction.db.information_schema.tables.SchemataExtensions;
import com.baeldung.jooq.introduction.db.information_schema.tables.StGeometryColumns;
import com.baeldung.jooq.introduction.db.information_schema.tables.StSpatialReferenceSystems;
import com.baeldung.jooq.introduction.db.information_schema.tables.StUnitsOfMeasure;
import com.baeldung.jooq.introduction.db.information_schema.tables.Statistics;
import com.baeldung.jooq.introduction.db.information_schema.tables.TableConstraints;
import com.baeldung.jooq.introduction.db.information_schema.tables.TableConstraintsExtensions;
import com.baeldung.jooq.introduction.db.information_schema.tables.TablePrivileges;
import com.baeldung.jooq.introduction.db.information_schema.tables.Tables;
import com.baeldung.jooq.introduction.db.information_schema.tables.TablesExtensions;
import com.baeldung.jooq.introduction.db.information_schema.tables.Tablespaces;
import com.baeldung.jooq.introduction.db.information_schema.tables.TablespacesExtensions;
import com.baeldung.jooq.introduction.db.information_schema.tables.Triggers;
import com.baeldung.jooq.introduction.db.information_schema.tables.UserAttributes;
import com.baeldung.jooq.introduction.db.information_schema.tables.UserPrivileges;
import com.baeldung.jooq.introduction.db.information_schema.tables.ViewRoutineUsage;
import com.baeldung.jooq.introduction.db.information_schema.tables.ViewTableUsage;
import com.baeldung.jooq.introduction.db.information_schema.tables.Views;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InformationSchema extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema</code>
     */
    public static final InformationSchema INFORMATION_SCHEMA = new InformationSchema();

    /**
     * The table
     * <code>information_schema.ADMINISTRABLE_ROLE_AUTHORIZATIONS</code>.
     */
    public final AdministrableRoleAuthorizations ADMINISTRABLE_ROLE_AUTHORIZATIONS = AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS;

    /**
     * The table <code>information_schema.APPLICABLE_ROLES</code>.
     */
    public final ApplicableRoles APPLICABLE_ROLES = ApplicableRoles.APPLICABLE_ROLES;

    /**
     * The table <code>information_schema.CHARACTER_SETS</code>.
     */
    public final CharacterSets CHARACTER_SETS = CharacterSets.CHARACTER_SETS;

    /**
     * The table <code>information_schema.CHECK_CONSTRAINTS</code>.
     */
    public final CheckConstraints CHECK_CONSTRAINTS = CheckConstraints.CHECK_CONSTRAINTS;

    /**
     * The table
     * <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY</code>.
     */
    public final CollationCharacterSetApplicability COLLATION_CHARACTER_SET_APPLICABILITY = CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY;

    /**
     * The table <code>information_schema.COLLATIONS</code>.
     */
    public final Collations COLLATIONS = Collations.COLLATIONS;

    /**
     * The table <code>information_schema.COLUMN_PRIVILEGES</code>.
     */
    public final ColumnPrivileges COLUMN_PRIVILEGES = ColumnPrivileges.COLUMN_PRIVILEGES;

    /**
     * The table <code>information_schema.COLUMN_STATISTICS</code>.
     */
    public final ColumnStatistics COLUMN_STATISTICS = ColumnStatistics.COLUMN_STATISTICS;

    /**
     * The table <code>information_schema.COLUMNS</code>.
     */
    public final Columns COLUMNS = Columns.COLUMNS;

    /**
     * The table <code>information_schema.COLUMNS_EXTENSIONS</code>.
     */
    public final ColumnsExtensions COLUMNS_EXTENSIONS = ColumnsExtensions.COLUMNS_EXTENSIONS;

    /**
     * The table <code>information_schema.ENABLED_ROLES</code>.
     */
    public final EnabledRoles ENABLED_ROLES = EnabledRoles.ENABLED_ROLES;

    /**
     * The table <code>information_schema.ENGINES</code>.
     */
    public final Engines ENGINES = Engines.ENGINES;

    /**
     * The table <code>information_schema.EVENTS</code>.
     */
    public final Events EVENTS = Events.EVENTS;

    /**
     * The table <code>information_schema.FILES</code>.
     */
    public final Files FILES = Files.FILES;

    /**
     * The table <code>information_schema.INNODB_BUFFER_PAGE</code>.
     */
    public final InnodbBufferPage INNODB_BUFFER_PAGE = InnodbBufferPage.INNODB_BUFFER_PAGE;

    /**
     * The table <code>information_schema.INNODB_BUFFER_PAGE_LRU</code>.
     */
    public final InnodbBufferPageLru INNODB_BUFFER_PAGE_LRU = InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU;

    /**
     * The table <code>information_schema.INNODB_BUFFER_POOL_STATS</code>.
     */
    public final InnodbBufferPoolStats INNODB_BUFFER_POOL_STATS = InnodbBufferPoolStats.INNODB_BUFFER_POOL_STATS;

    /**
     * The table <code>information_schema.INNODB_CACHED_INDEXES</code>.
     */
    public final InnodbCachedIndexes INNODB_CACHED_INDEXES = InnodbCachedIndexes.INNODB_CACHED_INDEXES;

    /**
     * The table <code>information_schema.INNODB_CMP</code>.
     */
    public final InnodbCmp INNODB_CMP = InnodbCmp.INNODB_CMP;

    /**
     * The table <code>information_schema.INNODB_CMP_PER_INDEX</code>.
     */
    public final InnodbCmpPerIndex INNODB_CMP_PER_INDEX = InnodbCmpPerIndex.INNODB_CMP_PER_INDEX;

    /**
     * The table <code>information_schema.INNODB_CMP_PER_INDEX_RESET</code>.
     */
    public final InnodbCmpPerIndexReset INNODB_CMP_PER_INDEX_RESET = InnodbCmpPerIndexReset.INNODB_CMP_PER_INDEX_RESET;

    /**
     * The table <code>information_schema.INNODB_CMP_RESET</code>.
     */
    public final InnodbCmpReset INNODB_CMP_RESET = InnodbCmpReset.INNODB_CMP_RESET;

    /**
     * The table <code>information_schema.INNODB_CMPMEM</code>.
     */
    public final InnodbCmpmem INNODB_CMPMEM = InnodbCmpmem.INNODB_CMPMEM;

    /**
     * The table <code>information_schema.INNODB_CMPMEM_RESET</code>.
     */
    public final InnodbCmpmemReset INNODB_CMPMEM_RESET = InnodbCmpmemReset.INNODB_CMPMEM_RESET;

    /**
     * The table <code>information_schema.INNODB_COLUMNS</code>.
     */
    public final InnodbColumns INNODB_COLUMNS = InnodbColumns.INNODB_COLUMNS;

    /**
     * The table <code>information_schema.INNODB_DATAFILES</code>.
     */
    public final InnodbDatafiles INNODB_DATAFILES = InnodbDatafiles.INNODB_DATAFILES;

    /**
     * The table <code>information_schema.INNODB_FIELDS</code>.
     */
    public final InnodbFields INNODB_FIELDS = InnodbFields.INNODB_FIELDS;

    /**
     * The table <code>information_schema.INNODB_FOREIGN</code>.
     */
    public final InnodbForeign INNODB_FOREIGN = InnodbForeign.INNODB_FOREIGN;

    /**
     * The table <code>information_schema.INNODB_FOREIGN_COLS</code>.
     */
    public final InnodbForeignCols INNODB_FOREIGN_COLS = InnodbForeignCols.INNODB_FOREIGN_COLS;

    /**
     * The table <code>information_schema.INNODB_FT_BEING_DELETED</code>.
     */
    public final InnodbFtBeingDeleted INNODB_FT_BEING_DELETED = InnodbFtBeingDeleted.INNODB_FT_BEING_DELETED;

    /**
     * The table <code>information_schema.INNODB_FT_CONFIG</code>.
     */
    public final InnodbFtConfig INNODB_FT_CONFIG = InnodbFtConfig.INNODB_FT_CONFIG;

    /**
     * The table <code>information_schema.INNODB_FT_DEFAULT_STOPWORD</code>.
     */
    public final InnodbFtDefaultStopword INNODB_FT_DEFAULT_STOPWORD = InnodbFtDefaultStopword.INNODB_FT_DEFAULT_STOPWORD;

    /**
     * The table <code>information_schema.INNODB_FT_DELETED</code>.
     */
    public final InnodbFtDeleted INNODB_FT_DELETED = InnodbFtDeleted.INNODB_FT_DELETED;

    /**
     * The table <code>information_schema.INNODB_FT_INDEX_CACHE</code>.
     */
    public final InnodbFtIndexCache INNODB_FT_INDEX_CACHE = InnodbFtIndexCache.INNODB_FT_INDEX_CACHE;

    /**
     * The table <code>information_schema.INNODB_FT_INDEX_TABLE</code>.
     */
    public final InnodbFtIndexTable INNODB_FT_INDEX_TABLE = InnodbFtIndexTable.INNODB_FT_INDEX_TABLE;

    /**
     * The table <code>information_schema.INNODB_INDEXES</code>.
     */
    public final InnodbIndexes INNODB_INDEXES = InnodbIndexes.INNODB_INDEXES;

    /**
     * The table <code>information_schema.INNODB_METRICS</code>.
     */
    public final InnodbMetrics INNODB_METRICS = InnodbMetrics.INNODB_METRICS;

    /**
     * The table
     * <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES</code>.
     */
    public final InnodbSessionTempTablespaces INNODB_SESSION_TEMP_TABLESPACES = InnodbSessionTempTablespaces.INNODB_SESSION_TEMP_TABLESPACES;

    /**
     * The table <code>information_schema.INNODB_TABLES</code>.
     */
    public final InnodbTables INNODB_TABLES = InnodbTables.INNODB_TABLES;

    /**
     * The table <code>information_schema.INNODB_TABLESPACES</code>.
     */
    public final InnodbTablespaces INNODB_TABLESPACES = InnodbTablespaces.INNODB_TABLESPACES;

    /**
     * The table <code>information_schema.INNODB_TABLESPACES_BRIEF</code>.
     */
    public final InnodbTablespacesBrief INNODB_TABLESPACES_BRIEF = InnodbTablespacesBrief.INNODB_TABLESPACES_BRIEF;

    /**
     * The table <code>information_schema.INNODB_TABLESTATS</code>.
     */
    public final InnodbTablestats INNODB_TABLESTATS = InnodbTablestats.INNODB_TABLESTATS;

    /**
     * The table <code>information_schema.INNODB_TEMP_TABLE_INFO</code>.
     */
    public final InnodbTempTableInfo INNODB_TEMP_TABLE_INFO = InnodbTempTableInfo.INNODB_TEMP_TABLE_INFO;

    /**
     * The table <code>information_schema.INNODB_TRX</code>.
     */
    public final InnodbTrx INNODB_TRX = InnodbTrx.INNODB_TRX;

    /**
     * The table <code>information_schema.INNODB_VIRTUAL</code>.
     */
    public final InnodbVirtual INNODB_VIRTUAL = InnodbVirtual.INNODB_VIRTUAL;

    /**
     * The table <code>information_schema.KEY_COLUMN_USAGE</code>.
     */
    public final KeyColumnUsage KEY_COLUMN_USAGE = KeyColumnUsage.KEY_COLUMN_USAGE;

    /**
     * The table <code>information_schema.KEYWORDS</code>.
     */
    public final Keywords KEYWORDS = Keywords.KEYWORDS;

    /**
     * The table <code>information_schema.OPTIMIZER_TRACE</code>.
     */
    public final OptimizerTrace OPTIMIZER_TRACE = OptimizerTrace.OPTIMIZER_TRACE;

    /**
     * The table <code>information_schema.PARAMETERS</code>.
     */
    public final Parameters PARAMETERS = Parameters.PARAMETERS;

    /**
     * The table <code>information_schema.PARTITIONS</code>.
     */
    public final Partitions PARTITIONS = Partitions.PARTITIONS;

    /**
     * The table <code>information_schema.PLUGINS</code>.
     */
    public final Plugins PLUGINS = Plugins.PLUGINS;

    /**
     * The table <code>information_schema.PROCESSLIST</code>.
     */
    public final Processlist PROCESSLIST = Processlist.PROCESSLIST;

    /**
     * The table <code>information_schema.PROFILING</code>.
     */
    public final Profiling PROFILING = Profiling.PROFILING;

    /**
     * The table <code>information_schema.REFERENTIAL_CONSTRAINTS</code>.
     */
    public final ReferentialConstraints REFERENTIAL_CONSTRAINTS = ReferentialConstraints.REFERENTIAL_CONSTRAINTS;

    /**
     * The table <code>information_schema.RESOURCE_GROUPS</code>.
     */
    public final ResourceGroups RESOURCE_GROUPS = ResourceGroups.RESOURCE_GROUPS;

    /**
     * The table <code>information_schema.ROLE_COLUMN_GRANTS</code>.
     */
    public final RoleColumnGrants ROLE_COLUMN_GRANTS = RoleColumnGrants.ROLE_COLUMN_GRANTS;

    /**
     * The table <code>information_schema.ROLE_ROUTINE_GRANTS</code>.
     */
    public final RoleRoutineGrants ROLE_ROUTINE_GRANTS = RoleRoutineGrants.ROLE_ROUTINE_GRANTS;

    /**
     * The table <code>information_schema.ROLE_TABLE_GRANTS</code>.
     */
    public final RoleTableGrants ROLE_TABLE_GRANTS = RoleTableGrants.ROLE_TABLE_GRANTS;

    /**
     * The table <code>information_schema.ROUTINES</code>.
     */
    public final Routines ROUTINES = Routines.ROUTINES;

    /**
     * The table <code>information_schema.SCHEMA_PRIVILEGES</code>.
     */
    public final SchemaPrivileges SCHEMA_PRIVILEGES = SchemaPrivileges.SCHEMA_PRIVILEGES;

    /**
     * The table <code>information_schema.SCHEMATA</code>.
     */
    public final Schemata SCHEMATA = Schemata.SCHEMATA;

    /**
     * The table <code>information_schema.SCHEMATA_EXTENSIONS</code>.
     */
    public final SchemataExtensions SCHEMATA_EXTENSIONS = SchemataExtensions.SCHEMATA_EXTENSIONS;

    /**
     * The table <code>information_schema.ST_GEOMETRY_COLUMNS</code>.
     */
    public final StGeometryColumns ST_GEOMETRY_COLUMNS = StGeometryColumns.ST_GEOMETRY_COLUMNS;

    /**
     * The table <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS</code>.
     */
    public final StSpatialReferenceSystems ST_SPATIAL_REFERENCE_SYSTEMS = StSpatialReferenceSystems.ST_SPATIAL_REFERENCE_SYSTEMS;

    /**
     * The table <code>information_schema.ST_UNITS_OF_MEASURE</code>.
     */
    public final StUnitsOfMeasure ST_UNITS_OF_MEASURE = StUnitsOfMeasure.ST_UNITS_OF_MEASURE;

    /**
     * The table <code>information_schema.STATISTICS</code>.
     */
    public final Statistics STATISTICS = Statistics.STATISTICS;

    /**
     * The table <code>information_schema.TABLE_CONSTRAINTS</code>.
     */
    public final TableConstraints TABLE_CONSTRAINTS = TableConstraints.TABLE_CONSTRAINTS;

    /**
     * The table <code>information_schema.TABLE_CONSTRAINTS_EXTENSIONS</code>.
     */
    public final TableConstraintsExtensions TABLE_CONSTRAINTS_EXTENSIONS = TableConstraintsExtensions.TABLE_CONSTRAINTS_EXTENSIONS;

    /**
     * The table <code>information_schema.TABLE_PRIVILEGES</code>.
     */
    public final TablePrivileges TABLE_PRIVILEGES = TablePrivileges.TABLE_PRIVILEGES;

    /**
     * The table <code>information_schema.TABLES</code>.
     */
    public final Tables TABLES = Tables.TABLES;

    /**
     * The table <code>information_schema.TABLES_EXTENSIONS</code>.
     */
    public final TablesExtensions TABLES_EXTENSIONS = TablesExtensions.TABLES_EXTENSIONS;

    /**
     * The table <code>information_schema.TABLESPACES</code>.
     */
    public final Tablespaces TABLESPACES = Tablespaces.TABLESPACES;

    /**
     * The table <code>information_schema.TABLESPACES_EXTENSIONS</code>.
     */
    public final TablespacesExtensions TABLESPACES_EXTENSIONS = TablespacesExtensions.TABLESPACES_EXTENSIONS;

    /**
     * The table <code>information_schema.TRIGGERS</code>.
     */
    public final Triggers TRIGGERS = Triggers.TRIGGERS;

    /**
     * The table <code>information_schema.USER_ATTRIBUTES</code>.
     */
    public final UserAttributes USER_ATTRIBUTES = UserAttributes.USER_ATTRIBUTES;

    /**
     * The table <code>information_schema.USER_PRIVILEGES</code>.
     */
    public final UserPrivileges USER_PRIVILEGES = UserPrivileges.USER_PRIVILEGES;

    /**
     * The table <code>information_schema.VIEW_ROUTINE_USAGE</code>.
     */
    public final ViewRoutineUsage VIEW_ROUTINE_USAGE = ViewRoutineUsage.VIEW_ROUTINE_USAGE;

    /**
     * The table <code>information_schema.VIEW_TABLE_USAGE</code>.
     */
    public final ViewTableUsage VIEW_TABLE_USAGE = ViewTableUsage.VIEW_TABLE_USAGE;

    /**
     * The table <code>information_schema.VIEWS</code>.
     */
    public final Views VIEWS = Views.VIEWS;

    /**
     * No further instances allowed
     */
    private InformationSchema() {
        super("information_schema", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            AdministrableRoleAuthorizations.ADMINISTRABLE_ROLE_AUTHORIZATIONS,
            ApplicableRoles.APPLICABLE_ROLES,
            CharacterSets.CHARACTER_SETS,
            CheckConstraints.CHECK_CONSTRAINTS,
            CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY,
            Collations.COLLATIONS,
            ColumnPrivileges.COLUMN_PRIVILEGES,
            ColumnStatistics.COLUMN_STATISTICS,
            Columns.COLUMNS,
            ColumnsExtensions.COLUMNS_EXTENSIONS,
            EnabledRoles.ENABLED_ROLES,
            Engines.ENGINES,
            Events.EVENTS,
            Files.FILES,
            InnodbBufferPage.INNODB_BUFFER_PAGE,
            InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU,
            InnodbBufferPoolStats.INNODB_BUFFER_POOL_STATS,
            InnodbCachedIndexes.INNODB_CACHED_INDEXES,
            InnodbCmp.INNODB_CMP,
            InnodbCmpPerIndex.INNODB_CMP_PER_INDEX,
            InnodbCmpPerIndexReset.INNODB_CMP_PER_INDEX_RESET,
            InnodbCmpReset.INNODB_CMP_RESET,
            InnodbCmpmem.INNODB_CMPMEM,
            InnodbCmpmemReset.INNODB_CMPMEM_RESET,
            InnodbColumns.INNODB_COLUMNS,
            InnodbDatafiles.INNODB_DATAFILES,
            InnodbFields.INNODB_FIELDS,
            InnodbForeign.INNODB_FOREIGN,
            InnodbForeignCols.INNODB_FOREIGN_COLS,
            InnodbFtBeingDeleted.INNODB_FT_BEING_DELETED,
            InnodbFtConfig.INNODB_FT_CONFIG,
            InnodbFtDefaultStopword.INNODB_FT_DEFAULT_STOPWORD,
            InnodbFtDeleted.INNODB_FT_DELETED,
            InnodbFtIndexCache.INNODB_FT_INDEX_CACHE,
            InnodbFtIndexTable.INNODB_FT_INDEX_TABLE,
            InnodbIndexes.INNODB_INDEXES,
            InnodbMetrics.INNODB_METRICS,
            InnodbSessionTempTablespaces.INNODB_SESSION_TEMP_TABLESPACES,
            InnodbTables.INNODB_TABLES,
            InnodbTablespaces.INNODB_TABLESPACES,
            InnodbTablespacesBrief.INNODB_TABLESPACES_BRIEF,
            InnodbTablestats.INNODB_TABLESTATS,
            InnodbTempTableInfo.INNODB_TEMP_TABLE_INFO,
            InnodbTrx.INNODB_TRX,
            InnodbVirtual.INNODB_VIRTUAL,
            KeyColumnUsage.KEY_COLUMN_USAGE,
            Keywords.KEYWORDS,
            OptimizerTrace.OPTIMIZER_TRACE,
            Parameters.PARAMETERS,
            Partitions.PARTITIONS,
            Plugins.PLUGINS,
            Processlist.PROCESSLIST,
            Profiling.PROFILING,
            ReferentialConstraints.REFERENTIAL_CONSTRAINTS,
            ResourceGroups.RESOURCE_GROUPS,
            RoleColumnGrants.ROLE_COLUMN_GRANTS,
            RoleRoutineGrants.ROLE_ROUTINE_GRANTS,
            RoleTableGrants.ROLE_TABLE_GRANTS,
            Routines.ROUTINES,
            SchemaPrivileges.SCHEMA_PRIVILEGES,
            Schemata.SCHEMATA,
            SchemataExtensions.SCHEMATA_EXTENSIONS,
            StGeometryColumns.ST_GEOMETRY_COLUMNS,
            StSpatialReferenceSystems.ST_SPATIAL_REFERENCE_SYSTEMS,
            StUnitsOfMeasure.ST_UNITS_OF_MEASURE,
            Statistics.STATISTICS,
            TableConstraints.TABLE_CONSTRAINTS,
            TableConstraintsExtensions.TABLE_CONSTRAINTS_EXTENSIONS,
            TablePrivileges.TABLE_PRIVILEGES,
            Tables.TABLES,
            TablesExtensions.TABLES_EXTENSIONS,
            Tablespaces.TABLESPACES,
            TablespacesExtensions.TABLESPACES_EXTENSIONS,
            Triggers.TRIGGERS,
            UserAttributes.USER_ATTRIBUTES,
            UserPrivileges.USER_PRIVILEGES,
            ViewRoutineUsage.VIEW_ROUTINE_USAGE,
            ViewTableUsage.VIEW_TABLE_USAGE,
            Views.VIEWS
        );
    }
}