package androidx.core.content;

import android.content.SharedPreferences;
import zy.lvui;

/* JADX INFO: compiled from: SharedPreferencesCompat.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class cdj {

    /* JADX INFO: renamed from: androidx.core.content.cdj$k */
    /* JADX INFO: compiled from: SharedPreferencesCompat.java */
    @Deprecated
    public static final class C0479k {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static C0479k f50350toq;

        /* JADX INFO: renamed from: k */
        private final k f3439k = new k();

        /* JADX INFO: renamed from: androidx.core.content.cdj$k$k */
        /* JADX INFO: compiled from: SharedPreferencesCompat.java */
        private static class k {
            k() {
            }

            /* JADX INFO: renamed from: k */
            public void m2173k(@lvui SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        private C0479k() {
        }

        @Deprecated
        public static C0479k toq() {
            if (f50350toq == null) {
                f50350toq = new C0479k();
            }
            return f50350toq;
        }

        @Deprecated
        /* JADX INFO: renamed from: k */
        public void m2172k(@lvui SharedPreferences.Editor editor) {
            this.f3439k.m2173k(editor);
        }
    }

    private cdj() {
    }
}
