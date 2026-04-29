package com.android.thememanager.detail.video.util;

import android.view.View;
import androidx.lifecycle.InterfaceC0928g;
import com.android.thememanager.detail.video.model.VideoResource;

/* JADX INFO: renamed from: com.android.thememanager.detail.video.util.n */
/* JADX INFO: compiled from: IVideoPlayer.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2010n extends InterfaceC0928g {
    /* JADX INFO: renamed from: b */
    void mo7842b(View view);

    default void b3e(long endTime) {
    }

    default void bwp(boolean enable) {
    }

    void cfr(VideoResource resource);

    default void eqxt() {
    }

    default int etdu(float percentage, long targetTime, int datasourceId) {
        return 0;
    }

    long getDuration();

    default void hyr() {
    }

    /* JADX INFO: renamed from: i */
    InterfaceC2010n mo7843i();

    default void ikck(boolean enable) {
    }

    void lrht(String type);

    default boolean oki() {
        return false;
    }

    void pjz9(boolean force);

    default void ukdy(long startTime) {
    }

    void vy(InterfaceC2011q playStateListener);

    default void wlev(boolean isPublicPlayer) {
    }

    default void y2() {
    }
}
