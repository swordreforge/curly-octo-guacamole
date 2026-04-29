package miuix.internal.graphics.drawable;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import java.util.Arrays;

/* JADX INFO: renamed from: miuix.internal.graphics.drawable.g */
/* JADX INFO: compiled from: TaggingDrawable.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7157g extends C7158k {

    /* JADX INFO: renamed from: n */
    private int[] f40362n;

    /* JADX INFO: renamed from: q */
    private int[] f40363q;

    public C7157g(Drawable drawable) {
        this(drawable, drawable.getState());
    }

    /* JADX INFO: renamed from: n */
    private static int[] m25928n(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[iArr2.length + iArr.length];
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
        return iArr3;
    }

    /* JADX INFO: renamed from: q */
    public static int[] m25929q(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[iArr2.length + iArr.length];
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
        Arrays.sort(iArr3);
        return iArr3;
    }

    public static boolean zy(StateListDrawable stateListDrawable, int[] iArr) {
        int iM25932k = C7159n.m25932k(stateListDrawable);
        for (int i2 = 0; i2 < iM25932k; i2++) {
            for (int i3 : C7159n.zy(stateListDrawable, i2)) {
                if (Arrays.binarySearch(iArr, i3) >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public boolean m25930g(int[] iArr) {
        if (Arrays.equals(iArr, this.f40363q)) {
            return false;
        }
        this.f40363q = iArr;
        return super.setState(m25928n(iArr, this.f40362n));
    }

    @Override // miuix.internal.graphics.drawable.C7158k, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (Arrays.equals(iArr, this.f40362n)) {
            return false;
        }
        this.f40362n = iArr;
        return super.setState(m25928n(this.f40363q, iArr));
    }

    public C7157g(Drawable drawable, int[] iArr) {
        super(drawable);
        this.f40363q = new int[0];
        this.f40362n = new int[0];
        m25930g(iArr);
    }
}
