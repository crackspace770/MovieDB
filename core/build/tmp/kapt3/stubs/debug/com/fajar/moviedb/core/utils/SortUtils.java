package com.fajar.moviedb.core.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/fajar/moviedb/core/utils/SortUtils;", "", "()V", "BEST", "", "LATEST", "OLDEST", "POPULAR", "RANDOM", "WORST", "getSortedQuery", "Landroidx/sqlite/db/SimpleSQLiteQuery;", "filter", "isTvShow", "", "core_debug"})
public final class SortUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.fajar.moviedb.core.utils.SortUtils INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String POPULAR = "Popular";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LATEST = "Latest";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String OLDEST = "Oldest";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BEST = "Best";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WORST = "Worst";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RANDOM = "Random";
    
    private SortUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.sqlite.db.SimpleSQLiteQuery getSortedQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String filter, int isTvShow) {
        return null;
    }
}