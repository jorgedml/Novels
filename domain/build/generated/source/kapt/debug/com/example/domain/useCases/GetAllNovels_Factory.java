package com.example.domain.useCases;

import com.example.data.repository.NovelRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetAllNovels_Factory implements Factory<GetAllNovels> {
  private final Provider<NovelRepository> novelRepositoryProvider;

  public GetAllNovels_Factory(Provider<NovelRepository> novelRepositoryProvider) {
    this.novelRepositoryProvider = novelRepositoryProvider;
  }

  @Override
  public GetAllNovels get() {
    return newInstance(novelRepositoryProvider.get());
  }

  public static GetAllNovels_Factory create(Provider<NovelRepository> novelRepositoryProvider) {
    return new GetAllNovels_Factory(novelRepositoryProvider);
  }

  public static GetAllNovels newInstance(NovelRepository novelRepository) {
    return new GetAllNovels(novelRepository);
  }
}
