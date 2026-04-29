package androidx.core.content;

import android.content.LocusId;
import android.os.Build;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: androidx.core.content.s */
/* JADX INFO: compiled from: LocusIdCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0508s {

    /* JADX INFO: renamed from: k */
    private final String f3520k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final LocusId f50421toq;

    /* JADX INFO: renamed from: androidx.core.content.s$k */
    /* JADX INFO: compiled from: LocusIdCompat.java */
    @hyr(29)
    private static class k {
        private k() {
        }

        @lvui
        /* JADX INFO: renamed from: k */
        static LocusId m2364k(@lvui String str) {
            return new LocusId(str);
        }

        @lvui
        static String toq(@lvui LocusId locusId) {
            return locusId.getId();
        }
    }

    public C0508s(@lvui String str) {
        this.f3520k = (String) androidx.core.util.n7h.cdj(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.f50421toq = k.m2364k(str);
        } else {
            this.f50421toq = null;
        }
    }

    @hyr(29)
    @lvui
    /* JADX INFO: renamed from: q */
    public static C0508s m2362q(@lvui LocusId locusId) {
        androidx.core.util.n7h.qrj(locusId, "locusId cannot be null");
        return new C0508s((String) androidx.core.util.n7h.cdj(k.toq(locusId), "id cannot be empty"));
    }

    @lvui
    private String toq() {
        return this.f3520k.length() + "_chars";
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0508s.class != obj.getClass()) {
            return false;
        }
        C0508s c0508s = (C0508s) obj;
        String str = this.f3520k;
        return str == null ? c0508s.f3520k == null : str.equals(c0508s.f3520k);
    }

    public int hashCode() {
        String str = this.f3520k;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public String m2363k() {
        return this.f3520k;
    }

    @lvui
    public String toString() {
        return "LocusIdCompat[" + toq() + "]";
    }

    @hyr(29)
    @lvui
    public LocusId zy() {
        return this.f50421toq;
    }
}
