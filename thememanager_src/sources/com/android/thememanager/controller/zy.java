package com.android.thememanager.controller;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.DisplayMetrics;
import android.util.Pair;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.config.C1724k;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.fu4;
import com.android.thememanager.model.WallpaperApplyInfos;
import com.android.thememanager.util.d2ok;
import com.android.thememanager.util.uc;
import com.android.thememanager.wallpaper.C2949g;
import com.google.gson.C4871g;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: BaseWallpaperApplyTask.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy extends AsyncTask<Void, Integer, Void> implements com.android.thememanager.basemodule.analysis.toq, InterfaceC1925p {

    /* JADX INFO: renamed from: a */
    private static final String f11098a = "BaseWallpaperApplyTask";

    /* JADX INFO: renamed from: b */
    final int f11099b;

    /* JADX INFO: renamed from: c */
    private String f11100c;

    /* JADX INFO: renamed from: e */
    private boolean f11101e;

    /* JADX INFO: renamed from: f */
    private String f11102f;

    /* JADX INFO: renamed from: g */
    private fu4 f11103g;

    /* JADX INFO: renamed from: h */
    private Matrix f11104h;

    /* JADX INFO: renamed from: i */
    private Bitmap f11105i;

    /* JADX INFO: renamed from: j */
    private Bitmap f11106j;

    /* JADX INFO: renamed from: k */
    private WeakReference<InterfaceC1958k> f11107k;

    /* JADX INFO: renamed from: l */
    private String f11108l;

    /* JADX INFO: renamed from: m */
    protected WallpaperApplyInfos f11109m;

    /* JADX INFO: renamed from: n */
    private int f11110n;

    /* JADX INFO: renamed from: o */
    private Matrix f11111o;

    /* JADX INFO: renamed from: p */
    private boolean f11112p;

    /* JADX INFO: renamed from: q */
    private Resource f11113q;

    /* JADX INFO: renamed from: r */
    private String f11114r;

    /* JADX INFO: renamed from: s */
    private int[] f11115s;

    /* JADX INFO: renamed from: t */
    private Resource f11116t;

    /* JADX INFO: renamed from: y */
    private int[] f11117y;

    /* JADX INFO: renamed from: z */
    private boolean f11118z;

    /* JADX INFO: renamed from: com.android.thememanager.controller.zy$k */
    /* JADX INFO: compiled from: BaseWallpaperApplyTask.java */
    public interface InterfaceC1958k {
        /* JADX INFO: renamed from: k */
        default void mo7697k(int max) {
        }

        void n7h();

        /* JADX INFO: renamed from: q */
        void mo6453q(Pair<Boolean, Boolean> success, int applyType, Bundle data);

        default void toq(int progress) {
        }

        default void zy() {
        }
    }

    /* JADX INFO: compiled from: BaseWallpaperApplyTask.java */
    public static class toq {

        /* JADX INFO: renamed from: k */
        public Pair<Boolean, Boolean> f11119k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public Bundle f57998toq;
    }

    public zy(Resource resource, String onlineUrl, fu4 context, InterfaceC1958k callBack, int applyType, String analyticsEntryType, String v9PageId, Matrix matrix, int[] lockScreenSize, int[] wallpaperSize, WallpaperApplyInfos infos, int dpi) {
        this(resource, onlineUrl, context, callBack, applyType, v9PageId, analyticsEntryType, matrix, lockScreenSize, wallpaperSize, false, false, null, null, com.android.thememanager.basemodule.analysis.toq.x0c, false, null, null, infos, dpi);
    }

    private boolean f7l8() {
        return com.android.thememanager.basemodule.analysis.toq.x0c.equals(this.f11100c);
    }

    /* JADX INFO: renamed from: p */
    private void m7692p() {
        int i2 = this.f11110n;
        boolean z2 = (i2 & 2) == 2;
        boolean z3 = (i2 & 1) == 1;
        boolean z5 = (i2 & 32) == 32;
        ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
        arrayMapM6679k.put("entryType", this.f11114r);
        if (z3 && !z2) {
            arrayMapM6679k.put("type", com.android.thememanager.basemodule.analysis.toq.nm);
        } else if (!z3 && z2) {
            arrayMapM6679k.put("type", com.android.thememanager.basemodule.analysis.toq.hzl);
        } else if (z5) {
            arrayMapM6679k.put("type", com.android.thememanager.basemodule.analysis.toq.g6i);
        } else {
            arrayMapM6679k.put("type", com.android.thememanager.basemodule.analysis.toq.mru);
        }
        arrayMapM6679k.put(com.android.thememanager.basemodule.analysis.toq.xknm, Boolean.valueOf(this.f11112p));
        arrayMapM6679k.put("name", this.f11113q.getTitle());
        arrayMapM6679k.put("source", this.f11100c);
        arrayMapM6679k.put("resourceType", "wallpaper");
        arrayMapM6679k.put("productId", this.f11113q.getOnlineId());
        arrayMapM6679k.put(com.android.thememanager.basemodule.analysis.toq.kho, Integer.toString(C1724k.m6723p().ld6().wallpaper_detail_page_style));
        arrayMapM6679k.put(com.android.thememanager.basemodule.analysis.toq.ym, Boolean.valueOf(d2ok.m9689p().qrj(bf2.toq.toq())));
        com.android.thememanager.basemodule.analysis.kja0.m6641s("APPLY", this.f11108l, this.f11113q.getOnlineInfo().getTrackId(), new C4871g().o1t(arrayMapM6679k));
        C1708s.f7l8().ld6().zurt(C1706p.n7h(this.f11108l, this.f11113q.getOnlineInfo().getTrackId(), arrayMapM6679k));
    }

    /* JADX INFO: renamed from: q */
    protected static Bitmap m7693q(int width, int height, Bitmap bitmap) {
        try {
            Bitmap bitmapCreateBitmap = C2949g.f7l8(bitmap.getColorSpace()) ? Bitmap.createBitmap((DisplayMetrics) null, width, height, bitmap.getConfig(), true, bitmap.getColorSpace()) : null;
            return bitmapCreateBitmap == null ? Bitmap.createBitmap(width, height, bitmap.getConfig()) : bitmapCreateBitmap;
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static int toq(int flag) {
        int i2 = 0;
        for (int i3 = 32; flag != 0 && i3 > 0; i3--) {
            if ((flag & 1) == 1) {
                i2++;
            }
            flag >>= 1;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m7694y(toq toqVar) {
        InterfaceC1958k interfaceC1958k = this.f11107k.get();
        if (interfaceC1958k != null) {
            interfaceC1958k.mo6453q(toqVar == null ? null : toqVar.f11119k, this.f11110n, toqVar != null ? toqVar.f57998toq : null);
        }
        if (this.f11110n != 32) {
            uc.a98o(this.f11110n, ((Boolean) toqVar.f11119k.first).booleanValue(), ((Boolean) toqVar.f11119k.second).booleanValue(), this.f11109m);
        }
    }

    /* JADX INFO: renamed from: g */
    protected Bitmap mo7538g(Matrix imageMatrix, int width, int height, boolean equalsScreenSize, fu4 resContext, Bitmap wallpaperViewBitmap, boolean enableWallpaperScroll, Resource adjResource, boolean userCustomized, Matrix wallpaperMatrix) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x042c A[PHI: r2
      0x042c: PHI (r2v19 int) = (r2v17 int), (r2v20 int) binds: [B:145:0x03f3, B:142:0x03ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v49, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r0v55, types: [com.android.thememanager.wallpaper.n] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r34v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r34v3 */
    /* JADX WARN: Type inference failed for: r34v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Void doInBackground(java.lang.Void... r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1151
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.controller.zy.doInBackground(java.lang.Void[]):java.lang.Void");
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        InterfaceC1958k interfaceC1958k = this.f11107k.get();
        if (interfaceC1958k != null) {
            interfaceC1958k.n7h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(Integer... values) {
        InterfaceC1958k interfaceC1958k = this.f11107k.get();
        if (interfaceC1958k == null || values == null) {
            return;
        }
        if (values.length == 2) {
            if (values[0].intValue() <= values[1].intValue()) {
                interfaceC1958k.toq(values[0].intValue());
            }
        } else if (values.length == 1) {
            interfaceC1958k.mo7697k(values[0].intValue());
        }
    }

    protected float[] zy(Canvas canvas, int rotation, Rect dstRect, Rect cropRect) {
        return null;
    }

    public zy(Resource resource, String onlineUrl, fu4 context, InterfaceC1958k callBack, int applyType, String v9PageId, String analyticsEntryType, Matrix matrix, int[] lockScreenSize, int[] wallpaperSize, boolean enableWallpaperScroll, boolean equalsScreenSize, Bitmap wallpaperBitmap, Resource adjResource, String sourcePage, boolean userCustomized, Bitmap darkBitmap, Matrix wallpaperMatrix, WallpaperApplyInfos infos, int dpi) {
        this.f11099b = dpi;
        this.f11113q = resource;
        this.f11102f = onlineUrl;
        this.f11110n = applyType;
        this.f11114r = analyticsEntryType;
        this.f11108l = v9PageId;
        this.f11103g = context;
        this.f11107k = new WeakReference<>(callBack);
        this.f11117y = lockScreenSize;
        this.f11115s = wallpaperSize;
        this.f11112p = enableWallpaperScroll;
        this.f11104h = matrix;
        this.f11118z = equalsScreenSize;
        this.f11105i = wallpaperBitmap;
        this.f11116t = adjResource;
        this.f11100c = sourcePage;
        this.f11101e = userCustomized;
        this.f11106j = darkBitmap;
        this.f11111o = wallpaperMatrix;
        this.f11109m = infos;
    }
}
