package androidx.core.text;

import java.nio.CharBuffer;
import java.util.Locale;

/* JADX INFO: compiled from: TextDirectionHeuristicsCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class qrj {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f50599f7l8 = 0;

    /* JADX INFO: renamed from: g */
    public static final x2 f3829g;

    /* JADX INFO: renamed from: n */
    public static final x2 f3831n;

    /* JADX INFO: renamed from: q */
    public static final x2 f3832q;

    /* JADX INFO: renamed from: s */
    private static final int f3833s = 2;

    /* JADX INFO: renamed from: y */
    private static final int f3834y = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final x2 f50601zy;

    /* JADX INFO: renamed from: k */
    public static final x2 f3830k = new C0623n(null, false);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final x2 f50600toq = new C0623n(null, true);

    /* JADX INFO: renamed from: androidx.core.text.qrj$g */
    /* JADX INFO: compiled from: TextDirectionHeuristicsCompat.java */
    private static class C0621g extends AbstractC0624q {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        static final C0621g f50602toq = new C0621g();

        C0621g() {
            super(null);
        }

        @Override // androidx.core.text.qrj.AbstractC0624q
        /* JADX INFO: renamed from: k */
        protected boolean mo2887k() {
            return n7h.toq(Locale.getDefault()) == 1;
        }
    }

    /* JADX INFO: renamed from: androidx.core.text.qrj$k */
    /* JADX INFO: compiled from: TextDirectionHeuristicsCompat.java */
    private static class C0622k implements zy {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        static final C0622k f50603toq = new C0622k(true);

        /* JADX INFO: renamed from: k */
        private final boolean f3835k;

        private C0622k(boolean z2) {
            this.f3835k = z2;
        }

        @Override // androidx.core.text.qrj.zy
        /* JADX INFO: renamed from: k */
        public int mo2888k(CharSequence charSequence, int i2, int i3) {
            int i4 = i3 + i2;
            boolean z2 = false;
            while (i2 < i4) {
                int iM2886k = qrj.m2886k(Character.getDirectionality(charSequence.charAt(i2)));
                if (iM2886k != 0) {
                    if (iM2886k != 1) {
                        continue;
                        i2++;
                        z2 = z2;
                    } else if (!this.f3835k) {
                        return 1;
                    }
                } else if (this.f3835k) {
                    return 0;
                }
                z2 = true;
                i2++;
                z2 = z2;
            }
            if (z2) {
                return this.f3835k ? 1 : 0;
            }
            return 2;
        }
    }

    /* JADX INFO: renamed from: androidx.core.text.qrj$n */
    /* JADX INFO: compiled from: TextDirectionHeuristicsCompat.java */
    private static class C0623n extends AbstractC0624q {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final boolean f50604toq;

        C0623n(zy zyVar, boolean z2) {
            super(zyVar);
            this.f50604toq = z2;
        }

        @Override // androidx.core.text.qrj.AbstractC0624q
        /* JADX INFO: renamed from: k */
        protected boolean mo2887k() {
            return this.f50604toq;
        }
    }

    /* JADX INFO: renamed from: androidx.core.text.qrj$q */
    /* JADX INFO: compiled from: TextDirectionHeuristicsCompat.java */
    private static abstract class AbstractC0624q implements x2 {

        /* JADX INFO: renamed from: k */
        private final zy f3836k;

        AbstractC0624q(zy zyVar) {
            this.f3836k = zyVar;
        }

        private boolean toq(CharSequence charSequence, int i2, int i3) {
            int iMo2888k = this.f3836k.mo2888k(charSequence, i2, i3);
            if (iMo2888k == 0) {
                return true;
            }
            if (iMo2888k != 1) {
                return mo2887k();
            }
            return false;
        }

        @Override // androidx.core.text.x2
        public boolean isRtl(char[] cArr, int i2, int i3) {
            return isRtl(CharBuffer.wrap(cArr), i2, i3);
        }

        /* JADX INFO: renamed from: k */
        protected abstract boolean mo2887k();

        @Override // androidx.core.text.x2
        public boolean isRtl(CharSequence charSequence, int i2, int i3) {
            if (charSequence == null || i2 < 0 || i3 < 0 || charSequence.length() - i3 < i2) {
                throw new IllegalArgumentException();
            }
            return this.f3836k == null ? mo2887k() : toq(charSequence, i2, i3);
        }
    }

    /* JADX INFO: compiled from: TextDirectionHeuristicsCompat.java */
    private static class toq implements zy {

        /* JADX INFO: renamed from: k */
        static final toq f3837k = new toq();

        private toq() {
        }

        @Override // androidx.core.text.qrj.zy
        /* JADX INFO: renamed from: k */
        public int mo2888k(CharSequence charSequence, int i2, int i3) {
            int i4 = i3 + i2;
            int qVar = 2;
            while (i2 < i4 && qVar == 2) {
                qVar = qrj.toq(Character.getDirectionality(charSequence.charAt(i2)));
                i2++;
            }
            return qVar;
        }
    }

    /* JADX INFO: compiled from: TextDirectionHeuristicsCompat.java */
    private interface zy {
        /* JADX INFO: renamed from: k */
        int mo2888k(CharSequence charSequence, int i2, int i3);
    }

    static {
        toq toqVar = toq.f3837k;
        f50601zy = new C0623n(toqVar, false);
        f3832q = new C0623n(toqVar, true);
        f3831n = new C0623n(C0622k.f50603toq, false);
        f3829g = C0621g.f50602toq;
    }

    private qrj() {
    }

    /* JADX INFO: renamed from: k */
    static int m2886k(int i2) {
        if (i2 != 0) {
            return (i2 == 1 || i2 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int toq(int i2) {
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2) {
                return 0;
            }
            switch (i2) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
