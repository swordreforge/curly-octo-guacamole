package kz28;

import android.content.res.Configuration;
import kt06.C6753n;

/* JADX INFO: renamed from: kz28.k */
/* JADX INFO: compiled from: IResponsive.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6758k<T> {
    default void dispatchResponsiveLayout(Configuration configuration, C6753n c6753n, boolean z2) {
        onResponsiveLayout(configuration, c6753n, z2);
    }

    kt06.toq getResponsiveState();

    T getResponsiveSubject();

    void onResponsiveLayout(Configuration configuration, C6753n c6753n, boolean z2);
}
