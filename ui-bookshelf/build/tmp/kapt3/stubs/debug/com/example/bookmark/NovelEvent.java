package com.example.bookmark;

import com.example.domain.util.NovelOption;
import com.example.domain.util.NovelOrder;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/bookmark/NovelEvent;", "", "()V", "Order", "Lcom/example/bookmark/NovelEvent$Order;", "ui-bookshelf_debug"})
public abstract class NovelEvent {
    
    private NovelEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/bookmark/NovelEvent$Order;", "Lcom/example/bookmark/NovelEvent;", "novelOrder", "Lcom/example/domain/util/NovelOrder;", "(Lcom/example/domain/util/NovelOrder;)V", "getNovelOrder", "()Lcom/example/domain/util/NovelOrder;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-bookshelf_debug"})
    public static final class Order extends com.example.bookmark.NovelEvent {
        @org.jetbrains.annotations.NotNull()
        private final com.example.domain.util.NovelOrder novelOrder = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.bookmark.NovelEvent.Order copy(@org.jetbrains.annotations.NotNull()
        com.example.domain.util.NovelOrder novelOrder) {
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
        
        public Order(@org.jetbrains.annotations.NotNull()
        com.example.domain.util.NovelOrder novelOrder) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.domain.util.NovelOrder component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.domain.util.NovelOrder getNovelOrder() {
            return null;
        }
    }
}