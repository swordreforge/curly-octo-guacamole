package com.android.thememanager.basemodule.imageloader;

import android.content.Context;
import com.android.thememanager.basemodule.utils.C1807g;
import com.bumptech.glide.C3164q;
import com.bumptech.glide.load.engine.cache.x2;
import com.bumptech.glide.load.engine.executor.ExecutorServiceC3027k;
import com.bumptech.glide.module.AbstractC3154k;
import com.bumptech.glide.request.C3173s;
import t8iq.C7672k;
import v5yj.C7704k;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
@uc.zy
public class ThemeCustomizeGlideModule extends AbstractC3154k {
    @Override // com.bumptech.glide.module.AbstractC3154k, com.bumptech.glide.module.toq
    /* JADX INFO: renamed from: k */
    public void mo6740k(@lvui Context context, @lvui C3164q builder) {
        super.mo6740k(context, builder);
        com.bumptech.glide.load.engine.cache.x2 x2VarM10730k = new x2.C3023k(context).m10730k();
        com.bumptech.glide.load.engine.cache.x2 x2VarM10730k2 = new x2.C3023k(context).zy(x2VarM10730k.m10727k() / 2).m10732q(0.3f).f7l8(0.3f).m10730k();
        boolean zA9 = C1807g.a9();
        builder.m11144y(new C3173s().oc(zA9 ? com.bumptech.glide.load.toq.PREFER_RGB_565 : com.bumptech.glide.load.toq.PREFER_ARGB_8888));
        if (zA9) {
            x2VarM10730k = x2VarM10730k2;
        }
        builder.t8r(x2VarM10730k);
        builder.ld6(ExecutorServiceC3027k.m10741g().toq(C7672k.f94880zy).m10749k());
        builder.zurt(ExecutorServiceC3027k.m10744p().toq(C7704k.y.toq.f44691k).zy(Math.min(zA9 ? 2 : 4, Runtime.getRuntime().availableProcessors())).m10749k());
        builder.zy(ExecutorServiceC3027k.zy().zy(zA9 ? 1 : 2).toq("a").m10749k());
    }
}
