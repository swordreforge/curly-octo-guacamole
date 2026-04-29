package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.C0830n;
import androidx.emoji2.text.kja0;
import java.util.Arrays;
import zy.InterfaceC7840q;
import zy.a9;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.emoji2.text.s */
/* JADX INFO: compiled from: EmojiProcessor.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(19)
@InterfaceC7840q
@uv6({uv6.EnumC7844k.LIBRARY})
final class C0835s {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f51183f7l8 = 2;

    /* JADX INFO: renamed from: g */
    private static final int f4561g = 1;

    /* JADX INFO: renamed from: y */
    private static final int f4562y = 3;

    /* JADX INFO: renamed from: k */
    @lvui
    private final C0830n.ld6 f4563k;

    /* JADX INFO: renamed from: n */
    @dd
    private final int[] f4564n;

    /* JADX INFO: renamed from: q */
    private final boolean f4565q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @lvui
    private final kja0 f51184toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @lvui
    private C0830n.q f51185zy;

    /* JADX INFO: renamed from: androidx.emoji2.text.s$k */
    /* JADX INFO: compiled from: EmojiProcessor.java */
    @hyr(19)
    private static final class k {

        /* JADX INFO: renamed from: k */
        private static final int f4566k = -1;

        private k() {
        }

        /* JADX INFO: renamed from: k */
        static int m4077k(CharSequence charSequence, int i2, int i3) {
            int length = charSequence.length();
            if (i2 < 0 || length < i2 || i3 < 0) {
                return -1;
            }
            while (true) {
                boolean z2 = false;
                while (i3 != 0) {
                    i2--;
                    if (i2 < 0) {
                        return z2 ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i2);
                    if (z2) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i3--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i3--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z2 = true;
                    }
                }
                return i2;
            }
        }

        static int toq(CharSequence charSequence, int i2, int i3) {
            int length = charSequence.length();
            if (i2 < 0 || length < i2 || i3 < 0) {
                return -1;
            }
            while (true) {
                boolean z2 = false;
                while (i3 != 0) {
                    if (i2 >= length) {
                        if (z2) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i2);
                    if (z2) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i3--;
                        i2++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i3--;
                        i2++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i2++;
                        z2 = true;
                    }
                }
                return i2;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.s$toq */
    /* JADX INFO: compiled from: EmojiProcessor.java */
    @InterfaceC7840q
    @uv6({uv6.EnumC7844k.LIBRARY})
    public static class toq implements C0830n.q {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static final int f51186toq = 10;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final ThreadLocal<StringBuilder> f51187zy = new ThreadLocal<>();

        /* JADX INFO: renamed from: k */
        private final TextPaint f4567k;

        toq() {
            TextPaint textPaint = new TextPaint();
            this.f4567k = textPaint;
            textPaint.setTextSize(10.0f);
        }

        private static StringBuilder toq() {
            ThreadLocal<StringBuilder> threadLocal = f51187zy;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            return threadLocal.get();
        }

        @Override // androidx.emoji2.text.C0830n.q
        /* JADX INFO: renamed from: k */
        public boolean mo4045k(@lvui CharSequence charSequence, int i2, int i3, int i4) {
            StringBuilder qVar = toq();
            qVar.setLength(0);
            while (i2 < i3) {
                qVar.append(charSequence.charAt(i2));
                i2++;
            }
            return androidx.core.graphics.n7h.m2512k(this.f4567k, qVar.toString());
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.s$zy */
    /* JADX INFO: compiled from: EmojiProcessor.java */
    static final class zy {

        /* JADX INFO: renamed from: p */
        private static final int f4568p = 2;

        /* JADX INFO: renamed from: s */
        private static final int f4569s = 1;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private final boolean f51188f7l8;

        /* JADX INFO: renamed from: g */
        private int f4570g;

        /* JADX INFO: renamed from: k */
        private int f4571k = 1;

        /* JADX INFO: renamed from: n */
        private int f4572n;

        /* JADX INFO: renamed from: q */
        private kja0.C0826k f4573q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final kja0.C0826k f51189toq;

        /* JADX INFO: renamed from: y */
        private final int[] f4574y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private kja0.C0826k f51190zy;

        zy(kja0.C0826k c0826k, boolean z2, int[] iArr) {
            this.f51189toq = c0826k;
            this.f51190zy = c0826k;
            this.f51188f7l8 = z2;
            this.f4574y = iArr;
        }

        private int f7l8() {
            this.f4571k = 1;
            this.f51190zy = this.f51189toq;
            this.f4570g = 0;
            return 1;
        }

        /* JADX INFO: renamed from: g */
        private static boolean m4078g(int i2) {
            return i2 == 65038;
        }

        /* JADX INFO: renamed from: q */
        private static boolean m4079q(int i2) {
            return i2 == 65039;
        }

        /* JADX INFO: renamed from: y */
        private boolean m4080y() {
            if (this.f51190zy.toq().x2() || m4079q(this.f4572n)) {
                return true;
            }
            if (this.f51188f7l8) {
                if (this.f4574y == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f4574y, this.f51190zy.toq().toq(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: k */
        int m4081k(int i2) {
            kja0.C0826k c0826kM4021k = this.f51190zy.m4021k(i2);
            int iF7l8 = 3;
            if (this.f4571k == 2) {
                if (c0826kM4021k != null) {
                    this.f51190zy = c0826kM4021k;
                    this.f4570g++;
                } else if (m4078g(i2)) {
                    iF7l8 = f7l8();
                } else if (!m4079q(i2)) {
                    if (this.f51190zy.toq() == null) {
                        iF7l8 = f7l8();
                    } else if (this.f4570g != 1 || m4080y()) {
                        this.f4573q = this.f51190zy;
                        f7l8();
                    } else {
                        iF7l8 = f7l8();
                    }
                }
                iF7l8 = 2;
            } else if (c0826kM4021k == null) {
                iF7l8 = f7l8();
            } else {
                this.f4571k = 2;
                this.f51190zy = c0826kM4021k;
                this.f4570g = 1;
                iF7l8 = 2;
            }
            this.f4572n = i2;
            return iF7l8;
        }

        /* JADX INFO: renamed from: n */
        boolean m4082n() {
            return this.f4571k == 2 && this.f51190zy.toq() != null && (this.f4570g > 1 || m4080y());
        }

        C0836y toq() {
            return this.f51190zy.toq();
        }

        C0836y zy() {
            return this.f4573q.toq();
        }
    }

    C0835s(@lvui kja0 kja0Var, @lvui C0830n.ld6 ld6Var, @lvui C0830n.q qVar, boolean z2, @dd int[] iArr) {
        this.f4563k = ld6Var;
        this.f51184toq = kja0Var;
        this.f51185zy = qVar;
        this.f4565q = z2;
        this.f4564n = iArr;
    }

    private static boolean f7l8(int i2, int i3) {
        return i2 == -1 || i3 == -1 || i2 != i3;
    }

    /* JADX INFO: renamed from: g */
    private boolean m4071g(CharSequence charSequence, int i2, int i3, C0836y c0836y) {
        if (c0836y.m4086n() == 0) {
            c0836y.n7h(this.f51185zy.mo4045k(charSequence, i2, i3, c0836y.m4089s()));
        }
        return c0836y.m4086n() == 2;
    }

    /* JADX INFO: renamed from: k */
    private void m4072k(@lvui Spannable spannable, C0836y c0836y, int i2, int i3) {
        spannable.setSpan(this.f4563k.m4044k(c0836y), i2, i3, 33);
    }

    /* JADX INFO: renamed from: n */
    static boolean m4073n(@lvui Editable editable, int i2, @lvui KeyEvent keyEvent) {
        if (!(i2 != 67 ? i2 != 112 ? false : toq(editable, keyEvent, true) : toq(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    /* JADX INFO: renamed from: q */
    static boolean m4074q(@lvui InputConnection inputConnection, @lvui Editable editable, @a9(from = 0) int i2, @a9(from = 0) int i3, boolean z2) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i2 >= 0 && i3 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (f7l8(selectionStart, selectionEnd)) {
                return false;
            }
            if (z2) {
                iMax = k.m4077k(editable, selectionStart, Math.max(i2, 0));
                iMin = k.toq(editable, selectionEnd, Math.max(i3, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i2, 0);
                iMin = Math.min(selectionEnd + i3, editable.length());
            }
            AbstractC0833p[] abstractC0833pArr = (AbstractC0833p[]) editable.getSpans(iMax, iMin, AbstractC0833p.class);
            if (abstractC0833pArr != null && abstractC0833pArr.length > 0) {
                for (AbstractC0833p abstractC0833p : abstractC0833pArr) {
                    int spanStart = editable.getSpanStart(abstractC0833p);
                    int spanEnd = editable.getSpanEnd(abstractC0833p);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    private static boolean toq(@lvui Editable editable, @lvui KeyEvent keyEvent, boolean z2) {
        AbstractC0833p[] abstractC0833pArr;
        if (m4075y(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!f7l8(selectionStart, selectionEnd) && (abstractC0833pArr = (AbstractC0833p[]) editable.getSpans(selectionStart, selectionEnd, AbstractC0833p.class)) != null && abstractC0833pArr.length > 0) {
            for (AbstractC0833p abstractC0833p : abstractC0833pArr) {
                int spanStart = editable.getSpanStart(abstractC0833p);
                int spanEnd = editable.getSpanEnd(abstractC0833p);
                if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    private static boolean m4075y(@lvui KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00f3  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.CharSequence m4076s(@zy.lvui java.lang.CharSequence r10, @zy.a9(from = 0) int r11, @zy.a9(from = 0) int r12, @zy.a9(from = 0) int r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C0835s.m4076s(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }

    C0836y zy(@lvui CharSequence charSequence) {
        zy zyVar = new zy(this.f51184toq.m4019s(), this.f4565q, this.f4564n);
        int length = charSequence.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = Character.codePointAt(charSequence, iCharCount);
            if (zyVar.m4081k(iCodePointAt) != 2) {
                return null;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        if (zyVar.m4082n()) {
            return zyVar.toq();
        }
        return null;
    }
}
