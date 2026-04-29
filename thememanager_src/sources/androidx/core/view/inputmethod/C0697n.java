package androidx.core.view.inputmethod;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.core.util.n7h;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.yz;

/* JADX INFO: renamed from: androidx.core.view.inputmethod.n */
/* JADX INFO: compiled from: EditorInfoCompat.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class C0697n {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f50832f7l8 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD";

    /* JADX INFO: renamed from: g */
    private static final String f4047g = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT";

    /* JADX INFO: renamed from: k */
    public static final int f4048k = 16777216;

    /* JADX INFO: renamed from: n */
    private static final String f4049n = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    /* JADX INFO: renamed from: p */
    @yz
    static final int f4050p = 1024;

    /* JADX INFO: renamed from: q */
    private static final String f4051q = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    /* JADX INFO: renamed from: s */
    @yz
    static final int f4052s = 2048;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f50833toq = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: y */
    private static final String f4053y = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String[] f50834zy = new String[0];

    /* JADX INFO: renamed from: androidx.core.view.inputmethod.n$k */
    /* JADX INFO: compiled from: EditorInfoCompat.java */
    @hyr(30)
    private static class k {
        private k() {
        }

        /* JADX INFO: renamed from: k */
        static CharSequence m3333k(@lvui EditorInfo editorInfo, int i2) {
            return editorInfo.getInitialSelectedText(i2);
        }

        /* JADX INFO: renamed from: q */
        static void m3334q(@lvui EditorInfo editorInfo, CharSequence charSequence, int i2) {
            editorInfo.setInitialSurroundingSubText(charSequence, i2);
        }

        static CharSequence toq(@lvui EditorInfo editorInfo, int i2, int i3) {
            return editorInfo.getInitialTextAfterCursor(i2, i3);
        }

        static CharSequence zy(@lvui EditorInfo editorInfo, int i2, int i3) {
            return editorInfo.getInitialTextBeforeCursor(i2, i3);
        }
    }

    @Deprecated
    public C0697n() {
    }

    private static boolean f7l8(int i2) {
        int i3 = i2 & 4095;
        return i3 == 129 || i3 == 225 || i3 == 18;
    }

    /* JADX INFO: renamed from: g */
    private static boolean m3326g(CharSequence charSequence, int i2, int i3) {
        if (i3 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i2));
        }
        if (i3 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i2));
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public static String[] m3327k(@lvui EditorInfo editorInfo) {
        String[] strArr = editorInfo.contentMimeTypes;
        return strArr != null ? strArr : f50834zy;
    }

    private static void ld6(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence(f4047g, charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt(f50832f7l8, i2);
        editorInfo.extras.putInt(f4053y, i3);
    }

    /* JADX INFO: renamed from: n */
    static int m3328n(EditorInfo editorInfo) {
        return 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m3329p(@lvui EditorInfo editorInfo, @lvui CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            k.m3334q(editorInfo, charSequence, 0);
        } else {
            m3331s(editorInfo, charSequence, 0);
        }
    }

    @dd
    /* JADX INFO: renamed from: q */
    public static CharSequence m3330q(@lvui EditorInfo editorInfo, int i2, int i3) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return k.zy(editorInfo, i2, i3);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(f4047g)) == null) {
            return null;
        }
        int i4 = editorInfo.extras.getInt(f50832f7l8);
        int iMin = Math.min(i2, i4);
        return (i3 & 1) != 0 ? charSequence.subSequence(i4 - iMin, i4) : TextUtils.substring(charSequence, i4 - iMin, i4);
    }

    /* JADX INFO: renamed from: s */
    public static void m3331s(@lvui EditorInfo editorInfo, @lvui CharSequence charSequence, int i2) {
        n7h.x2(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            k.m3334q(editorInfo, charSequence, i2);
            return;
        }
        int i3 = editorInfo.initialSelStart;
        int i4 = editorInfo.initialSelEnd;
        int i5 = i3 > i4 ? i4 - i2 : i3 - i2;
        int i6 = i3 > i4 ? i3 - i2 : i4 - i2;
        int length = charSequence.length();
        if (i2 < 0 || i5 < 0 || i6 > length) {
            ld6(editorInfo, null, 0, 0);
            return;
        }
        if (f7l8(editorInfo.inputType)) {
            ld6(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            ld6(editorInfo, charSequence, i5, i6);
        } else {
            x2(editorInfo, charSequence, i5, i6);
        }
    }

    @dd
    public static CharSequence toq(@lvui EditorInfo editorInfo, int i2) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return k.m3333k(editorInfo, i2);
        }
        if (editorInfo.extras == null) {
            return null;
        }
        int iMin = Math.min(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int iMax = Math.max(editorInfo.initialSelStart, editorInfo.initialSelEnd);
        int i3 = editorInfo.extras.getInt(f50832f7l8);
        int i4 = editorInfo.extras.getInt(f4053y);
        int i5 = iMax - iMin;
        if (editorInfo.initialSelStart < 0 || editorInfo.initialSelEnd < 0 || i4 - i3 != i5 || (charSequence = editorInfo.extras.getCharSequence(f4047g)) == null) {
            return null;
        }
        return (i2 & 1) != 0 ? charSequence.subSequence(i3, i4) : TextUtils.substring(charSequence, i3, i4);
    }

    private static void x2(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        int i4 = i3 - i2;
        int i5 = i4 > 1024 ? 0 : i4;
        int i6 = 2048 - i5;
        int iMin = Math.min(charSequence.length() - i3, i6 - Math.min(i2, (int) (((double) i6) * 0.8d)));
        int iMin2 = Math.min(i2, i6 - iMin);
        int i7 = i2 - iMin2;
        if (m3326g(charSequence, i7, 0)) {
            i7++;
            iMin2--;
        }
        if (m3326g(charSequence, (i3 + iMin) - 1, 1)) {
            iMin--;
        }
        CharSequence charSequenceConcat = i5 != i4 ? TextUtils.concat(charSequence.subSequence(i7, i7 + iMin2), charSequence.subSequence(i3, iMin + i3)) : charSequence.subSequence(i7, iMin2 + i5 + iMin + i7);
        int i8 = iMin2 + 0;
        ld6(editorInfo, charSequenceConcat, i8, i5 + i8);
    }

    /* JADX INFO: renamed from: y */
    public static void m3332y(@lvui EditorInfo editorInfo, @dd String[] strArr) {
        editorInfo.contentMimeTypes = strArr;
    }

    @dd
    public static CharSequence zy(@lvui EditorInfo editorInfo, int i2, int i3) {
        CharSequence charSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            return k.toq(editorInfo, i2, i3);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null || (charSequence = bundle.getCharSequence(f4047g)) == null) {
            return null;
        }
        int i4 = editorInfo.extras.getInt(f4053y);
        int iMin = Math.min(i2, charSequence.length() - i4);
        return (i3 & 1) != 0 ? charSequence.subSequence(i4, iMin + i4) : TextUtils.substring(charSequence, i4, iMin + i4);
    }
}
