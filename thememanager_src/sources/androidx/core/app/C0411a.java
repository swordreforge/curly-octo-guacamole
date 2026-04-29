package androidx.core.app;

import android.content.res.Configuration;

/* JADX INFO: renamed from: androidx.core.app.a */
/* JADX INFO: compiled from: PictureInPictureModeChangedInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0411a {

    /* JADX INFO: renamed from: k */
    private final boolean f3112k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Configuration f50034toq;

    public C0411a(boolean z2) {
        this.f3112k = z2;
        this.f50034toq = null;
    }

    @zy.hyr(26)
    @zy.lvui
    /* JADX INFO: renamed from: k */
    public Configuration m1789k() {
        Configuration configuration = this.f50034toq;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("PictureInPictureModeChangedInfo must be constructed with the constructor that takes a Configuration to call getNewConfig(). Are you running on an API 26 or higher device that makes this information available?");
    }

    public boolean toq() {
        return this.f3112k;
    }

    @zy.hyr(26)
    public C0411a(boolean z2, @zy.lvui Configuration configuration) {
        this.f3112k = z2;
        this.f50034toq = configuration;
    }
}
