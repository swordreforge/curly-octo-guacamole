package androidx.core.view.accessibility;

import android.os.Bundle;
import android.view.View;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: AccessibilityViewCommand.java */
/* JADX INFO: loaded from: classes.dex */
public interface fn3e {

    /* JADX INFO: compiled from: AccessibilityViewCommand.java */
    public static final class f7l8 extends AbstractC0648k {
        public int toq() {
            return this.f3912k.getInt(ki.f50677n5r1);
        }

        public int zy() {
            return this.f3912k.getInt(ki.f3925l);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.accessibility.fn3e$g */
    /* JADX INFO: compiled from: AccessibilityViewCommand.java */
    public static final class C0647g extends AbstractC0648k {
        public float toq() {
            return this.f3912k.getFloat(ki.f50674lrht);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.accessibility.fn3e$k */
    /* JADX INFO: compiled from: AccessibilityViewCommand.java */
    public static abstract class AbstractC0648k {

        /* JADX INFO: renamed from: k */
        Bundle f3912k;

        @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: k */
        public void m3016k(@dd Bundle bundle) {
            this.f3912k = bundle;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.accessibility.fn3e$n */
    /* JADX INFO: compiled from: AccessibilityViewCommand.java */
    public static final class C0649n extends AbstractC0648k {
        public int toq() {
            return this.f3912k.getInt(ki.f3918c);
        }

        public int zy() {
            return this.f3912k.getInt(ki.f3920f);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.accessibility.fn3e$q */
    /* JADX INFO: compiled from: AccessibilityViewCommand.java */
    public static final class C0650q extends AbstractC0648k {
        public int toq() {
            return this.f3912k.getInt(ki.f50686uv6);
        }

        public int zy() {
            return this.f3912k.getInt(ki.f50687vyq);
        }
    }

    /* JADX INFO: compiled from: AccessibilityViewCommand.java */
    public static final class toq extends AbstractC0648k {
        public boolean toq() {
            return this.f3912k.getBoolean(ki.f50679ncyb);
        }

        public int zy() {
            return this.f3912k.getInt(ki.f50659dd);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.accessibility.fn3e$y */
    /* JADX INFO: compiled from: AccessibilityViewCommand.java */
    public static final class C0651y extends AbstractC0648k {
        @dd
        public CharSequence toq() {
            return this.f3912k.getCharSequence(ki.f50668hyr);
        }
    }

    /* JADX INFO: compiled from: AccessibilityViewCommand.java */
    public static final class zy extends AbstractC0648k {
        @dd
        public String toq() {
            return this.f3912k.getString(ki.f50690x9kr);
        }
    }

    boolean perform(@lvui View view, @dd AbstractC0648k abstractC0648k);
}
