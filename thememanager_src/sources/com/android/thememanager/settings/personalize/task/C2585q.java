package com.android.thememanager.settings.personalize.task;

import android.app.WallpaperColors;
import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.provider.MiuiSettings;
import android.util.Log;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.ki;
import com.android.thememanager.ncyb;
import com.android.thememanager.settings.superwallpaper.C2656k;
import com.android.thememanager.settings.superwallpaper.activity.data.C2640k;
import com.android.thememanager.settings.superwallpaper.activity.data.SuperWallpaperSummaryData;
import com.android.thememanager.settings.superwallpaper.utils.C2670y;
import com.android.thememanager.util.x9kr;
import com.android.thememanager.wallpaper.C2951n;
import cyoe.InterfaceC5979h;
import ek5k.f7l8;
import kotlin.C6318m;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.coroutines.jvm.internal.kja0;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import kotlinx.coroutines.C6708p;
import kotlinx.coroutines.InterfaceC6556f;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: com.android.thememanager.settings.personalize.task.q */
/* JADX INFO: compiled from: GetColorModeTask.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2585q {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C2585q f15306k = new C2585q();

    /* JADX INFO: renamed from: q */
    public static final int f15307q = 1;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f60832toq = "GetColorModeTask";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f60833zy = 0;

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.task.q$k */
    /* JADX INFO: compiled from: GetColorModeTask.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.task.GetColorModeTask$getColorModeTask$2", m22756f = "GetColorModeTask.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class k extends kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super Boolean>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $superWallpaperId;
        final /* synthetic */ int $type;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, Context context, int i2, InterfaceC6216q<? super k> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$superWallpaperId = str;
            this.$context = context;
            this.$type = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new k(this.$superWallpaperId, this.$context, this.$type, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super Boolean> interfaceC6216q) {
            return ((k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            Icon icon;
            C6199q.x2();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6318m.n7h(obj);
            SuperWallpaperSummaryData superWallpaperSummaryDataM9221s = C2640k.m9216n().m9221s(this.$superWallpaperId);
            Context context = this.$context;
            if (context == null) {
                return kotlin.coroutines.jvm.internal.toq.m22766k(false);
            }
            boolean z2 = C1819o.d2ok(context) && MiuiSettings.System.getBoolean(this.$context.getContentResolver(), x9kr.toq.f16901q, true);
            boolean zN7h = ncyb.n7h(true);
            Log.w(C2585q.f60832toq, "darkenUnderDarkMode: " + z2 + " isCurrentLockImage: " + zN7h);
            Drawable drawableLoadDrawable = null;
            if (this.$type == 0) {
                if (C2951n.fn3e().kja0() && Build.VERSION.SDK_INT > 32) {
                    if (z2 && zN7h) {
                        return kotlin.coroutines.jvm.internal.toq.m22766k(false);
                    }
                    WallpaperColors wallpaperColorsNi7 = C2951n.fn3e().ni7(2);
                    if (wallpaperColorsNi7 != null) {
                        return kotlin.coroutines.jvm.internal.toq.m22766k((wallpaperColorsNi7.getColorHints() & 1) == 1);
                    }
                }
                drawableLoadDrawable = C2670y.m9307n(this.$context);
            } else {
                if ((superWallpaperSummaryDataM9221s != null ? superWallpaperSummaryDataM9221s.f15594f : null) != null) {
                    Object systemService = bf2.toq.toq().getSystemService("wallpaper");
                    d2ok.n7h(systemService, "null cannot be cast to non-null type android.app.WallpaperManager");
                    WallpaperManager wallpaperManager = (WallpaperManager) systemService;
                    if (wallpaperManager.getWallpaperInfo() != null) {
                        if (!C2656k.m9246y(wallpaperManager.getWallpaperInfo().getServiceInfo()) || (icon = superWallpaperSummaryDataM9221s.f15594f.f15616p) == null) {
                            Icon icon2 = superWallpaperSummaryDataM9221s.f15594f.f15618s;
                            if (icon2 != null) {
                                drawableLoadDrawable = icon2.loadDrawable(this.$context);
                            }
                        } else {
                            drawableLoadDrawable = icon.loadDrawable(this.$context);
                        }
                    }
                }
            }
            if (!z2 || !zN7h) {
                Bitmap bitmapM7107k = ki.m7107k(drawableLoadDrawable);
                if (bitmapM7107k == null || bitmapM7107k.isRecycled()) {
                    z = true;
                } else {
                    z = com.android.thememanager.settings.superwallpaper.utils.toq.m9300k(this.$context, bitmapM7107k) != 0;
                    Log.d(C2585q.f60832toq, "GetColorModeTask isLight" + z);
                }
            }
            return kotlin.coroutines.jvm.internal.toq.m22766k(z);
        }
    }

    private C2585q() {
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public final Object m9102k(@InterfaceC7395n Context context, int i2, @InterfaceC7395n String str, @InterfaceC7396q InterfaceC6216q<? super Boolean> interfaceC6216q) {
        return C6708p.m24523y(f7l8.m22238k(), new k(str, context, i2, null), interfaceC6216q);
    }
}
