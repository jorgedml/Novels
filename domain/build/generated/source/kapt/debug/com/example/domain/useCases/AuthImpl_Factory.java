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
public final class AuthImpl_Factory implements Factory<AuthImpl> {
  private final Provider<NovelRepository> repositoryProvider;

  public AuthImpl_Factory(Provider<NovelRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public AuthImpl get() {
    return newInstance(repositoryProvider.get());
  }

  public static AuthImpl_Factory create(Provider<NovelRepository> repositoryProvider) {
    return new AuthImpl_Factory(repositoryProvider);
  }

  public static AuthImpl newInstance(NovelRepository repository) {
    return new AuthImpl(repository);
  }
}
