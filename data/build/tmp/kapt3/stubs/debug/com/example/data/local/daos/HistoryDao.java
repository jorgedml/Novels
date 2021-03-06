package com.example.data.local.daos;

import androidx.paging.PagingSource;
import androidx.room.*;
import com.example.data.local.entities.HistorySearchEntity;
import kotlinx.coroutines.flow.Flow;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\'J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f0\u000eH\'J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f0\u000eH\'J\u0019\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\u0006\u0010\u0015\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/example/data/local/daos/HistoryDao;", "", "deleteAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePage", "label", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllHistories", "Landroidx/paging/PagingSource;", "", "Lcom/example/data/local/entities/HistorySearchEntity;", "getAllNovelsSearchs", "Lkotlinx/coroutines/flow/Flow;", "", "getHistorySearch", "insertHistorySearch", "historySearch", "(Lcom/example/data/local/entities/HistorySearchEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "query", "data_debug"})
public abstract interface HistoryDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM history_search ORDER BY timestamp DESC")
    public abstract androidx.paging.PagingSource<java.lang.Integer, com.example.data.local.entities.HistorySearchEntity> getAllHistories();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM history_search ")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.data.local.entities.HistorySearchEntity>> getAllNovelsSearchs();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM history_search WHERE isInHistory= 1 ORDER BY timestamp DESC LIMIT 20 ")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.data.local.entities.HistorySearchEntity>> getHistorySearch();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertHistorySearch(@org.jetbrains.annotations.NotNull()
    com.example.data.local.entities.HistorySearchEntity historySearch, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM history_search")
    public abstract java.lang.Object deleteAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM history_search WHERE label = :label")
    public abstract java.lang.Object deletePage(@org.jetbrains.annotations.NotNull()
    java.lang.String label, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "\n            SELECT * \n            FROM history_search\n            WHERE LOWER(title) LIKE \'%\' || LOWER(:query) || \'%\' OR\n                UPPER(:query) == title  LIMIT 10\n        ")
    public abstract java.lang.Object search(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.data.local.entities.HistorySearchEntity>> continuation);
}