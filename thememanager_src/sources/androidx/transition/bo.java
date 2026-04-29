package androidx.transition;

import android.os.IBinder;

/* JADX INFO: compiled from: WindowIdApi14.java */
/* JADX INFO: loaded from: classes.dex */
class bo implements c8jq {

    /* JADX INFO: renamed from: k */
    private final IBinder f6373k;

    bo(IBinder iBinder) {
        this.f6373k = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof bo) && ((bo) obj).f6373k.equals(this.f6373k);
    }

    public int hashCode() {
        return this.f6373k.hashCode();
    }
}
