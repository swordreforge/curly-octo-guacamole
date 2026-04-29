package androidx.core.app;

import android.content.res.Configuration;

/* JADX INFO: compiled from: MultiWindowModeChangedInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class zurt {

    /* JADX INFO: renamed from: k */
    private final boolean f3415k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Configuration f50348toq;

    public zurt(boolean z2) {
        this.f3415k = z2;
        this.f50348toq = null;
    }

    @zy.hyr(26)
    @zy.lvui
    /* JADX INFO: renamed from: k */
    public Configuration m2160k() {
        Configuration configuration = this.f50348toq;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("MultiWindowModeChangedInfo must be constructed with the constructor that takes a Configuration to call getNewConfig(). Are you running on an API 26 or higher device that makes this information available?");
    }

    public boolean toq() {
        return this.f3415k;
    }

    @zy.hyr(26)
    public zurt(boolean z2, @zy.lvui Configuration configuration) {
        this.f3415k = z2;
        this.f50348toq = configuration;
    }
}
