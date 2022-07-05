package com.example.domain.observers;

import androidx.paging.ExperimentalPagingApi;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import com.example.data.local.daos.HistoryNovelDao;
import com.example.data.resultentities.HistoryEntryWithNovels;
import com.example.domain.PaginatedEntryRemoteMediator;
import com.example.domain.PagingInteractor;
import com.example.domain.interactors.UpdatedHistoryNovels;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.OptIn(markerClass = {androidx.paging.ExperimentalPagingApi.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\n2\u0006\u0010\f\u001a\u00020\u0002H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/domain/observers/ObservableHistoryNovels;", "Lcom/example/domain/PagingInteractor;", "Lcom/example/domain/observers/ObservableHistoryNovels$Params;", "Lcom/example/data/resultentities/HistoryEntryWithNovels;", "updatedHistoryNovels", "Lcom/example/domain/interactors/UpdatedHistoryNovels;", "historyNovelDao", "Lcom/example/data/local/daos/HistoryNovelDao;", "(Lcom/example/domain/interactors/UpdatedHistoryNovels;Lcom/example/data/local/daos/HistoryNovelDao;)V", "createObservable", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "params", "Params", "domain_debug"})
public final class ObservableHistoryNovels extends com.example.domain.PagingInteractor<com.example.domain.observers.ObservableHistoryNovels.Params, com.example.data.resultentities.HistoryEntryWithNovels> {
    private final com.example.domain.interactors.UpdatedHistoryNovels updatedHistoryNovels = null;
    private final com.example.data.local.daos.HistoryNovelDao historyNovelDao = null;
    
    @javax.inject.Inject()
    public ObservableHistoryNovels(@org.jetbrains.annotations.NotNull()
    com.example.domain.interactors.UpdatedHistoryNovels updatedHistoryNovels, @org.jetbrains.annotations.NotNull()
    com.example.data.local.daos.HistoryNovelDao historyNovelDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.data.resultentities.HistoryEntryWithNovels>> createObservable(@org.jetbrains.annotations.NotNull()
    com.example.domain.observers.ObservableHistoryNovels.Params params) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/example/domain/observers/ObservableHistoryNovels$Params;", "Lcom/example/domain/PagingInteractor$Parameters;", "Lcom/example/data/resultentities/HistoryEntryWithNovels;", "pagingConfig", "Landroidx/paging/PagingConfig;", "(Landroidx/paging/PagingConfig;)V", "getPagingConfig", "()Landroidx/paging/PagingConfig;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_debug"})
    public static final class Params implements com.example.domain.PagingInteractor.Parameters<com.example.data.resultentities.HistoryEntryWithNovels> {
        @org.jetbrains.annotations.NotNull()
        private final androidx.paging.PagingConfig pagingConfig = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.domain.observers.ObservableHistoryNovels.Params copy(@org.jetbrains.annotations.NotNull()
        androidx.paging.PagingConfig pagingConfig) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Params(@org.jetbrains.annotations.NotNull()
        androidx.paging.PagingConfig pagingConfig) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.paging.PagingConfig component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public androidx.paging.PagingConfig getPagingConfig() {
            return null;
        }
    }
}