// Generated by Dagger (https://dagger.dev).
package com.example.history;

import com.example.domain.observers.ObservableHistoryNovels;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HistoryViewModel_Factory implements Factory<HistoryViewModel> {
  private final Provider<ObservableHistoryNovels> pagingInteractorProvider;

  public HistoryViewModel_Factory(Provider<ObservableHistoryNovels> pagingInteractorProvider) {
    this.pagingInteractorProvider = pagingInteractorProvider;
  }

  @Override
  public HistoryViewModel get() {
    return newInstance(pagingInteractorProvider.get());
  }

  public static HistoryViewModel_Factory create(
      Provider<ObservableHistoryNovels> pagingInteractorProvider) {
    return new HistoryViewModel_Factory(pagingInteractorProvider);
  }

  public static HistoryViewModel newInstance(ObservableHistoryNovels pagingInteractor) {
    return new HistoryViewModel(pagingInteractor);
  }
}
