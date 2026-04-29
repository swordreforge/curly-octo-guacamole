package com.android.thememanager.settings.personalize;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import com.android.thememanager.basemodule.imageloader.n7h;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.settings.superwallpaper.utils.C2666p;
import com.miui.maml.widget.edit.MamlutilKt;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.android.thememanager.settings.personalize.p */
/* JADX INFO: compiled from: PersonalizeCacheManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2567p {

    /* JADX INFO: renamed from: h */
    private static C2567p f15266h = null;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f60817kja0 = 400;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final String f60818ld6 = "cache_personalize_lockscreen";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final long f60819n7h = 86400000;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f60820qrj = "key_cache_lockscreen_show_clock";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final String f60821x2 = "cache_personalize_desk";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private boolean f60822f7l8;

    /* JADX INFO: renamed from: g */
    private String f15267g;

    /* JADX INFO: renamed from: k */
    private String f15268k;

    /* JADX INFO: renamed from: n */
    private String f15269n;

    /* JADX INFO: renamed from: q */
    private String f15271q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f60823toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private String f60824zy;

    /* JADX INFO: renamed from: y */
    private Map<String, Bitmap> f15273y = new HashMap();

    /* JADX INFO: renamed from: s */
    private n7h.InterfaceC1731k f15272s = new k();

    /* JADX INFO: renamed from: p */
    private n7h.toq f15270p = new toq();

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.p$k */
    /* JADX INFO: compiled from: PersonalizeCacheManager.java */
    class k implements n7h.InterfaceC1731k {
        k() {
        }

        @Override // com.android.thememanager.basemodule.imageloader.n7h.InterfaceC1731k
        /* JADX INFO: renamed from: k */
        public boolean mo6762k(String path) {
            return C2567p.ki(path);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.p$toq */
    /* JADX INFO: compiled from: PersonalizeCacheManager.java */
    class toq implements n7h.toq {
        toq() {
        }

        @Override // com.android.thememanager.basemodule.imageloader.n7h.toq
        /* JADX INFO: renamed from: k */
        public void mo6454k(Map<String, Bitmap> result) {
            if (result == null || result.size() <= 0) {
                return;
            }
            C2567p.this.f15273y.put(C2567p.this.f15268k, result.get(C2567p.this.f15268k));
            C2567p.this.f15273y.put(C2567p.this.f60823toq, result.get(C2567p.this.f60823toq));
            C2567p.this.f15273y.put(C2567p.this.f60824zy, result.get(C2567p.this.f60824zy));
            if (C1807g.zurt()) {
                C2567p.this.f15273y.put(C2567p.this.f15271q, result.get(C2567p.this.f15271q));
                C2567p.this.f15273y.put(C2567p.this.f15269n, result.get(C2567p.this.f15269n));
                C2567p.this.f15273y.put(C2567p.this.f15267g, result.get(C2567p.this.f15267g));
            }
        }

        @Override // com.android.thememanager.basemodule.imageloader.n7h.toq
        public void toq(Pair<String, Bitmap> process) {
            if (process == null || process.first == null || process.second == null) {
                return;
            }
            C2567p.this.f15273y.put((String) process.first, (Bitmap) process.second);
        }
    }

    private C2567p() {
        cdj();
    }

    private void cdj() {
        this.f15268k = ld6(f60818ld6, this.f60822f7l8, false, false);
        this.f60823toq = ld6(f60818ld6, this.f60822f7l8, true, false);
        this.f60824zy = ld6(f60821x2, this.f60822f7l8, true, false);
        this.f15271q = ld6(f60818ld6, this.f60822f7l8, false, true);
        this.f15269n = ld6(f60818ld6, this.f60822f7l8, true, true);
        this.f15267g = ld6(f60821x2, this.f60822f7l8, true, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean fn3e(android.graphics.Bitmap r6, android.graphics.Bitmap r7, boolean r8, boolean r9) throws java.lang.Throwable {
        /*
            if (r9 == 0) goto L5
            java.lang.String r9 = "cache_personalize_lockscreen"
            goto L7
        L5:
            java.lang.String r9 = "cache_personalize_desk"
        L7:
            r0 = 100
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L4c
            boolean r3 = r6.isRecycled()
            if (r3 != 0) goto L4c
            android.content.Context r3 = bf2.toq.toq()
            boolean r3 = com.android.thememanager.basemodule.utils.C1807g.m7083t(r3)
            java.lang.String r3 = ld6(r9, r8, r2, r3)
            boolean r4 = ki(r3)
            if (r4 != 0) goto L4c
            int r4 = r6.getWidth()
            int r5 = r6.getHeight()
            int r4 = java.lang.Math.max(r4, r5)
            r5 = 400(0x190, float:5.6E-43)
            if (r4 <= r5) goto L44
            com.android.thememanager.basemodule.utils.ncyb r4 = new com.android.thememanager.basemodule.utils.ncyb
            android.content.Context r5 = bf2.toq.toq()
            r4.<init>(r5)
            r5 = 1086324736(0x40c00000, float:6.0)
            android.graphics.Bitmap r6 = r4.zy(r6, r5)
        L44:
            boolean r6 = com.android.thememanager.util.C2763c.mcp(r6, r3, r2, r0)
            if (r6 == 0) goto L4c
            r6 = r1
            goto L4d
        L4c:
            r6 = r2
        L4d:
            if (r7 == 0) goto L72
            boolean r3 = r7.isRecycled()
            if (r3 != 0) goto L72
            android.content.Context r3 = bf2.toq.toq()
            boolean r3 = com.android.thememanager.basemodule.utils.C1807g.m7083t(r3)
            java.lang.String r8 = ld6(r9, r8, r1, r3)
            boolean r9 = ki(r8)
            if (r9 != 0) goto L72
            boolean r7 = com.android.thememanager.util.C2763c.mcp(r7, r8, r2, r0)
            if (r6 != 0) goto L71
            if (r7 == 0) goto L70
            goto L71
        L70:
            r1 = r2
        L71:
            r6 = r1
        L72:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.settings.personalize.C2567p.fn3e(android.graphics.Bitmap, android.graphics.Bitmap, boolean, boolean):boolean");
    }

    /* JADX INFO: renamed from: i */
    public static void m9070i(boolean value) {
        if (C1807g.m7081r()) {
            C2666p.f7l8(bf2.toq.toq(), f60820qrj, value);
        }
    }

    public static boolean ki(String path) {
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        File file = new File(path);
        return file.exists() && System.currentTimeMillis() - file.lastModified() < 86400000;
    }

    private static String ld6(String code, boolean isDark, boolean isBlur, boolean largeScreen) {
        File file = new File(bf2.toq.toq().getCacheDir(), code);
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsolutePath());
        sb.append(File.separator);
        sb.append(largeScreen ? "large_" : "normal_");
        sb.append("cache");
        sb.append(isDark ? MamlutilKt.PREVIEW_DARK_SUF : "");
        sb.append(isBlur ? "_blur" : "");
        return sb.toString();
    }

    public static C2567p n7h() {
        if (f15266h == null) {
            f15266h = new C2567p();
        }
        boolean zD2ok = C1819o.d2ok(bf2.toq.toq());
        C2567p c2567p = f15266h;
        if (c2567p.f60822f7l8 ^ zD2ok) {
            c2567p.f60822f7l8 = zD2ok;
            c2567p.cdj();
        }
        return f15266h;
    }

    /* JADX INFO: renamed from: s */
    public static void m9074s(boolean isLockScreen) {
        C1821p.cdj(new File(bf2.toq.toq().getCacheDir(), isLockScreen ? f60818ld6 : f60821x2).getAbsolutePath());
    }

    public static boolean x2() {
        if (C1807g.m7081r()) {
            return C2666p.m9290k(bf2.toq.toq(), f60820qrj, true);
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public String m9075h() {
        return (C1807g.zurt() && C1807g.m7083t(bf2.toq.toq())) ? this.f15271q : this.f15268k;
    }

    public String kja0() {
        return (C1807g.zurt() && C1807g.m7083t(bf2.toq.toq())) ? this.f15269n : this.f60823toq;
    }

    /* JADX INFO: renamed from: p */
    public Bitmap m9076p(String path) {
        Bitmap bitmap;
        if (this.f15273y.isEmpty() || TextUtils.isEmpty(path) || (bitmap = this.f15273y.get(path)) == null || bitmap.isRecycled()) {
            return null;
        }
        return bitmap;
    }

    public String qrj() {
        return (C1807g.zurt() && C1807g.m7083t(bf2.toq.toq())) ? this.f15267g : this.f60824zy;
    }

    public void t8r() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 1;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inJustDecodeBounds = false;
        new com.android.thememanager.basemodule.imageloader.n7h(this.f15270p, options, this.f15272s, C1807g.zurt() ? new String[]{this.f15268k, this.f60823toq, this.f60824zy, this.f15271q, this.f15269n, this.f15267g} : new String[]{this.f15268k, this.f60823toq, this.f60824zy}).toq();
    }

    /* JADX INFO: renamed from: y */
    public void m9077y() {
        if (this.f15273y.isEmpty()) {
            return;
        }
        this.f15273y.clear();
    }
}
