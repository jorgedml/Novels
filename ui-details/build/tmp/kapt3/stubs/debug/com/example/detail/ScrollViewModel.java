package com.example.detail;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bR\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0010"}, d2 = {"Lcom/example/detail/ScrollViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_scrollUp", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "lastScrollIndex", "", "scrollUp", "Landroidx/lifecycle/LiveData;", "getScrollUp", "()Landroidx/lifecycle/LiveData;", "updateScrollPosition", "", "newScrollIndex", "ui-details_debug"})
public final class ScrollViewModel extends androidx.lifecycle.ViewModel {
    private int lastScrollIndex = 0;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _scrollUp = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> scrollUp = null;
    
    public ScrollViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getScrollUp() {
        return null;
    }
    
    public final void updateScrollPosition(int newScrollIndex) {
    }
}