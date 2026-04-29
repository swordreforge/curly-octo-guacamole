package miuix.internal.util;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import gb.toq;
import miuix.internal.graphics.drawable.C7157g;

/* JADX INFO: compiled from: TaggingDrawableUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public class ld6 {

    /* JADX INFO: renamed from: k */
    private static final int f40371k = -1;

    /* JADX INFO: renamed from: q */
    private static int f40373q = -1;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static int f87762toq = -1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static int f87763zy = -1;

    /* JADX INFO: renamed from: n */
    private static final int[] f40372n = {R.attr.state_single, R.attr.state_first, R.attr.state_middle, R.attr.state_last};

    /* JADX INFO: renamed from: g */
    private static final int[] f40370g = {R.attr.state_single};

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int[] f87761f7l8 = {R.attr.state_first};

    /* JADX INFO: renamed from: y */
    private static final int[] f40375y = {R.attr.state_middle};

    /* JADX INFO: renamed from: s */
    private static final int[] f40374s = {R.attr.state_last};

    /* JADX INFO: renamed from: k */
    private static int m25945k(Context context, int i2) {
        return context.getResources().getDimensionPixelSize(i2);
    }

    /* JADX INFO: renamed from: q */
    public static void m25946q(View view, int i2, int i3) {
        int i4;
        int i5;
        int measuredHeight;
        int iM25945k;
        if (view == null || i3 == 0) {
            return;
        }
        Context context = view.getContext();
        int paddingStart = view.getPaddingStart();
        view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        view.getPaddingBottom();
        if (i3 != 1) {
            if (f87762toq == -1) {
                f87762toq = m25945k(context, toq.f7l8.mkmm);
            }
            if (f87763zy == -1) {
                f87763zy = m25945k(context, toq.f7l8.xo);
            }
            if (i2 == 0) {
                i4 = f87763zy;
                i5 = f87762toq;
            } else if (i2 == i3 - 1) {
                i4 = f87762toq;
                i5 = f87763zy;
            } else {
                i4 = f87762toq;
            }
            measuredHeight = view.getMeasuredHeight();
            iM25945k = m25945k(context, toq.f7l8.zi4o);
            if (measuredHeight > 0 && measuredHeight < iM25945k) {
                int i6 = (iM25945k - measuredHeight) / 2;
                i4 += i6;
                i5 += i6;
            }
            view.setPaddingRelative(paddingStart, i4, paddingEnd, i5);
        }
        if (f40373q == -1) {
            f40373q = m25945k(context, toq.f7l8.zaso);
        }
        i4 = f40373q;
        i5 = i4;
        measuredHeight = view.getMeasuredHeight();
        iM25945k = m25945k(context, toq.f7l8.zi4o);
        if (measuredHeight > 0) {
            int i62 = (iM25945k - measuredHeight) / 2;
            i4 += i62;
            i5 += i62;
        }
        view.setPaddingRelative(paddingStart, i4, paddingEnd, i5);
    }

    public static void toq(View view, int i2, int i3) {
        if (view == null || i3 == 0) {
            return;
        }
        Drawable background = view.getBackground();
        if ((background instanceof StateListDrawable) && C7157g.zy((StateListDrawable) background, f40372n)) {
            C7157g c7157g = new C7157g(background);
            view.setBackground(c7157g);
            background = c7157g;
        }
        if (background instanceof C7157g) {
            ((C7157g) background).m25930g(i3 == 1 ? f40370g : i2 == 0 ? f87761f7l8 : i2 == i3 - 1 ? f40374s : f40375y);
        }
    }

    public static void zy(View view, int i2, int i3) {
        toq(view, i2, i3);
        m25946q(view, i2, i3);
    }
}
