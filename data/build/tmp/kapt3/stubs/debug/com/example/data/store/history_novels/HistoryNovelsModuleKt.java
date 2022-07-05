package com.example.data.store.history_novels;

import android.content.Context;
import android.util.Log;
import com.dropbox.android.external.store4.Fetcher;
import com.dropbox.android.external.store4.SourceOfTruth;
import com.dropbox.android.external.store4.Store;
import com.dropbox.android.external.store4.StoreBuilder;
import com.example.data.local.daos.HistoryNovelDao;
import com.example.data.local.daos.NovelHistoryDao;
import com.example.data.local.daos.NovelImageDao;
import com.example.data.local.entities.HistoryNovelEntry;
import com.example.data.local.entities.NovelImageEntity;
import com.example.data.repository.NovelUtil;
import com.example.data.repository.history_novels.HistoryNovelShowsLastRequestStore;
import com.example.data.repository.history_novels.HistoryNovelsDataSource;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import org.threeten.bp.Duration;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*.\u0010\u0000\"\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001\u00a8\u0006\u0005"}, d2 = {"HistoryNovelsStore", "Lcom/dropbox/android/external/store4/Store;", "", "", "Lcom/example/data/local/entities/HistoryNovelEntry;", "data_debug"})
public final class HistoryNovelsModuleKt {
}