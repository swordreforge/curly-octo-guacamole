package gcp;

import android.graphics.Color;
import android.graphics.Point;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: gcp.s */
/* JADX INFO: compiled from: MiuiBlurUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class C6065s {

    /* JADX INFO: renamed from: k */
    private static final String f35054k = "MiuiBlurUtils";

    public static boolean f7l8(View view, int i2) {
        if (view == null) {
            Log.d(f35054k, "setPassBlur view is null");
            return false;
        }
        if (!C6062n.m22317h(view.getContext())) {
            return false;
        }
        try {
            boolean zM22338h = m22338h(view, C6064q.m22333g(view.getContext()));
            qrj(view, 1);
            n7h(view, i2);
            if (C6064q.m22333g(view.getContext())) {
                m22337g(view, true);
            }
            Log.i(f35054k, "setContainerPassBlur result :" + zM22338h + ",view : " + view);
            return zM22338h;
        } catch (Exception e2) {
            Log.e(f35054k, "setContainerPassBlur error , view :" + view);
            e2.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m22337g(View view, boolean z2) {
        C6063p.m22325h(View.class, view, "disableMiBackgroundContainBelow", Void.TYPE, new Class[]{Boolean.TYPE}, Boolean.valueOf(z2));
    }

    /* JADX INFO: renamed from: h */
    public static boolean m22338h(View view, boolean z2) {
        Class cls = Boolean.TYPE;
        return ((Boolean) C6063p.kja0(View.class, view, "setPassWindowBlurEnabled", cls, Boolean.FALSE, new Class[]{cls}, Boolean.valueOf(z2))).booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public static void m22339k(View view, int i2, int i3) {
        Class cls = Void.TYPE;
        Class cls2 = Integer.TYPE;
        C6063p.m22325h(View.class, view, "addMiBackgroundBlendColor", cls, new Class[]{cls2, cls2}, Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static void kja0(View view, int i2) {
        C6063p.m22325h(View.class, view, "setMiViewBlurMode", Void.TYPE, new Class[]{Integer.TYPE}, Integer.valueOf(i2));
    }

    public static void ld6(View view, boolean z2, int i2, int i3, int i4, boolean z3) {
        if (view == null || !C6062n.m22317h(view.getContext())) {
            Log.d(f35054k, "setMemberBlendColor view is null");
            return;
        }
        try {
            kja0(view, 3);
            int iArgb = Color.argb(i3, Color.red(i2), Color.green(i2), Color.blue(i2));
            int iArgb2 = Color.argb(i3, 0, 0, 0);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Point(iArgb, 101));
            if (z2) {
                arrayList.add(new Point(iArgb2, 105));
            } else {
                arrayList.add(new Point(iArgb2, 103));
            }
            if (z3 && C6062n.cdj()) {
                arrayList.add(new Point(i4, 1000));
            }
            x2(view, arrayList);
            Log.i(f35054k, "setMemberBlendColor: view:" + view + ",colorDark:" + z2 + ",color:" + Integer.toHexString(iArgb) + ",labColor:" + Integer.toHexString(iArgb2));
        } catch (Exception e2) {
            Log.e(f35054k, "setMemberBlendColor error , view :" + view);
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m22340n(View view) {
        C6063p.m22325h(View.class, view, "setMiBackgroundBlendColors", Void.TYPE, new Class[]{ArrayList.class}, null);
    }

    public static void n7h(View view, int i2) {
        C6063p.m22325h(View.class, view, "setMiBackgroundBlurRadius", Void.TYPE, new Class[]{Integer.TYPE}, Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: p */
    public static void m22341p(View view, boolean z2, int i2, int i3) {
        ld6(view, z2, i2, 255, i3, true);
    }

    /* JADX INFO: renamed from: q */
    public static void m22342q(View view) {
        C6063p.m22325h(View.class, view, "clearMiBackgroundBlendColor", Void.TYPE, new Class[0], new Object[0]);
    }

    public static void qrj(View view, int i2) {
        C6063p.m22325h(View.class, view, "setMiBackgroundBlurMode", Void.TYPE, new Class[]{Integer.TYPE}, Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: s */
    public static void m22343s(View view, boolean z2, int i2, int i3) {
        if (view == null || !C6062n.m22317h(view.getContext())) {
            Log.d(f35054k, "setMemberBlendColor view is null");
            return;
        }
        try {
            m22342q(view);
            kja0(view, 3);
            int iArgb = Color.argb(i3, Color.red(i2), Color.green(i2), Color.blue(i2));
            int iArgb2 = Color.argb(i3, 0, 0, 0);
            m22339k(view, iArgb, 101);
            if (z2) {
                m22339k(view, iArgb2, 105);
            } else {
                m22339k(view, iArgb2, 103);
            }
            Log.i(f35054k, "setMemberBlendColor: view:" + view + ",colorDark:" + z2 + ",color:" + Integer.toHexString(iArgb) + ",labColor:" + Integer.toHexString(iArgb2));
        } catch (Exception e2) {
            Log.e(f35054k, "setMemberBlendColor error , view :" + view);
            e2.printStackTrace();
        }
    }

    public static void toq(View view) {
        if (view == null) {
            Log.d(f35054k, "clearContainerMiBackgroundBlur view is null");
            return;
        }
        if (C6062n.m22317h(view.getContext())) {
            try {
                qrj(view, 0);
                Log.d(f35054k, "clearContainerPassBlur result :" + m22338h(view, false) + ", view: " + view);
            } catch (Exception e2) {
                Log.e(f35054k, "clearContainerMiBackgroundBlur error , view :" + view);
                e2.printStackTrace();
            }
        }
    }

    public static void x2(View view, List<Point> list) {
        C6063p.m22325h(View.class, view, "setMiBackgroundBlendColors", Void.TYPE, new Class[]{ArrayList.class}, list);
    }

    /* JADX INFO: renamed from: y */
    public static void m22344y(View view, boolean z2, int i2) {
        m22343s(view, z2, i2, 255);
    }

    public static void zy(View view) {
        if (view == null) {
            Log.d(f35054k, "clearMemberBlendColor view is null");
            return;
        }
        if (C6062n.m22317h(view.getContext())) {
            try {
                kja0(view, 0);
                m22340n(view);
                Log.d(f35054k, "clearMemberBlendColor view :" + view);
            } catch (Exception e2) {
                Log.e(f35054k, "clearMemberBlendColor error , view :" + view);
                e2.printStackTrace();
            }
        }
    }
}
