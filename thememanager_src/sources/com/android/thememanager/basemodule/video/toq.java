package com.android.thememanager.basemodule.video;

import com.google.android.exoplayer2.database.C3285n;
import com.google.android.exoplayer2.upstream.C3827z;
import com.google.android.exoplayer2.upstream.cache.C3774i;
import com.google.android.exoplayer2.upstream.cache.InterfaceC3775k;
import com.google.android.exoplayer2.upstream.cache.cdj;
import com.google.android.exoplayer2.upstream.cache.zy;
import com.google.android.exoplayer2.upstream.kja0;
import ek5k.C6002g;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: compiled from: ExoVideoCacheHub.java */
/* JADX INFO: loaded from: classes.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    private static HashMap<String, C3774i> f10456k;

    /* JADX INFO: renamed from: g */
    public static void m7266g(String path) {
        m7267k();
        final C3774i c3774iRemove = f10456k.remove(path);
        if (c3774iRemove != null) {
            C6002g.m22240g(new Runnable() { // from class: com.android.thememanager.basemodule.video.k
                @Override // java.lang.Runnable
                public final void run() {
                    c3774iRemove.release();
                }
            });
        }
    }

    /* JADX INFO: renamed from: k */
    private static void m7267k() {
        if (f10456k == null) {
            f10456k = new HashMap<>();
        }
    }

    /* JADX INFO: renamed from: n */
    private static kja0.InterfaceC3804k m7268n() {
        return new C1837q(new C3827z.toq().ld6("ua"));
    }

    /* JADX INFO: renamed from: q */
    public static kja0.InterfaceC3804k m7269q(String name) {
        C3774i qVar = toq(name);
        return qVar == null ? m7268n() : zy(qVar, m7268n());
    }

    public static C3774i toq(String name) {
        m7267k();
        C3774i c3774i = f10456k.get(name);
        if (c3774i != null) {
            return c3774i;
        }
        File file = new File(bf2.toq.toq().getExternalCacheDir(), name);
        if (C3774i.m13379t(file)) {
            return null;
        }
        C3774i c3774i2 = new C3774i(file, new cdj(41943040L), new C3285n(bf2.toq.toq()));
        f10456k.put(name, c3774i2);
        return c3774i2;
    }

    private static kja0.InterfaceC3804k zy(InterfaceC3775k cache, kja0.InterfaceC3804k upstream) {
        return new zy.C3786q().m13443p(cache).m13441h(upstream).kja0(2);
    }
}
