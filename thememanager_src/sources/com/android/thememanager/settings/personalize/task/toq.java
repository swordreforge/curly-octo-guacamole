package com.android.thememanager.settings.personalize.task;

import android.app.WallpaperColors;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import com.android.thememanager.basemodule.utils.qrj;
import com.android.thememanager.settings.superwallpaper.utils.f7l8;
import com.android.thememanager.wallpaper.C2951n;
import cyoe.InterfaceC5979h;
import kotlin.C6318m;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.coroutines.jvm.internal.kja0;
import kotlin.was;
import kotlinx.coroutines.C6708p;
import kotlinx.coroutines.InterfaceC6556f;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: DeskPreviewTool.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class toq {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final toq f15308k = new toq();

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.task.toq$k */
    /* JADX INFO: compiled from: DeskPreviewTool.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.task.DeskPreviewTool$loadDeskPreview$2", m22756f = "DeskPreviewTool.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class C2586k extends kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super Bitmap>, Object> {
        int label;

        C2586k(InterfaceC6216q<? super C2586k> interfaceC6216q) {
            super(2, interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new C2586k(interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super Bitmap> interfaceC6216q) {
            return ((C2586k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) throws Throwable {
            C6199q.x2();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6318m.n7h(obj);
            Context qVar = bf2.toq.toq();
            if (C2951n.fn3e().kja0() && Build.VERSION.SDK_INT > 32) {
                WallpaperColors wallpaperColorsNi7 = C2951n.fn3e().ni7(2);
                if (wallpaperColorsNi7 != null) {
                    return f7l8.m9256n(qVar, (wallpaperColorsNi7.getColorHints() & 1) != 1 ? 0 : 2, false);
                }
            }
            Bitmap bitmapM9254g = f7l8.m9254g(qVar, com.android.thememanager.kja0.m8007k());
            Bitmap bitmapM9256n = f7l8.m9256n(qVar, bitmapM9254g != null ? com.android.thememanager.settings.superwallpaper.utils.toq.m9300k(qVar, bitmapM9254g) : 1, false);
            return qrj.zy(qrj.toq.PERSONALIZE) ? com.android.thememanager.v9.toq.m10206n(bitmapM9256n, 2.0f) : bitmapM9256n;
        }
    }

    private toq() {
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public final Object m9103k(@InterfaceC7396q InterfaceC6216q<? super Bitmap> interfaceC6216q) {
        Log.i("DeskPreviewTask", "begin DeskPreviewAsyncTask");
        return C6708p.m24523y(ek5k.f7l8.m22238k(), new C2586k(null), interfaceC6216q);
    }
}
