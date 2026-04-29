package com.android.thememanager.settings.personalize.task;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.settings.superwallpaper.utils.C2663k;
import cyoe.InterfaceC5979h;
import ek5k.f7l8;
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

/* JADX INFO: renamed from: com.android.thememanager.settings.personalize.task.k */
/* JADX INFO: compiled from: AodPreviewTool.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2583k {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C2583k f15304k = new C2583k();

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.task.k$k */
    /* JADX INFO: compiled from: AodPreviewTool.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.task.AodPreviewTool$loadAodPreview$2", m22756f = "AodPreviewTool.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class k extends kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super Pair<Bitmap, Bitmap>>, Object> {
        final /* synthetic */ int $dpi;
        final /* synthetic */ int $style;
        final /* synthetic */ float $superWallpaperAodClockPositionX;
        final /* synthetic */ float $superWallpaperAodClockPositionY;
        final /* synthetic */ float $superWallpaperAodDualClockPositionXAnchorRight;
        final /* synthetic */ float $superWallpaperAodDualClockPositionY;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(int i2, float f2, float f3, float f4, float f5, int i3, InterfaceC6216q<? super k> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$style = i2;
            this.$superWallpaperAodClockPositionX = f2;
            this.$superWallpaperAodClockPositionY = f3;
            this.$superWallpaperAodDualClockPositionXAnchorRight = f4;
            this.$superWallpaperAodDualClockPositionY = f5;
            this.$dpi = i3;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new k(this.$style, this.$superWallpaperAodClockPositionX, this.$superWallpaperAodClockPositionY, this.$superWallpaperAodDualClockPositionXAnchorRight, this.$superWallpaperAodDualClockPositionY, this.$dpi, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super Pair<Bitmap, Bitmap>> interfaceC6216q) {
            return ((k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) throws Throwable {
            C6199q.x2();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6318m.n7h(obj);
            if (this.$style != 1) {
                Bitmap bitmapZy = C2663k.zy(bf2.toq.toq());
                if (this.$style != 2) {
                    return new Pair(C2663k.m9270s(bf2.toq.toq()), bitmapZy);
                }
                String qVar = com.android.thememanager.superwallpaper.util.zy.toq("spaod");
                return TextUtils.isEmpty(qVar) ? new Pair(null, bitmapZy) : new Pair(BitmapFactory.decodeFile(qVar), bitmapZy);
            }
            Bitmap bitmapM9267n = C2663k.m9267n(bf2.toq.toq(), this.$superWallpaperAodClockPositionX, this.$superWallpaperAodClockPositionY, this.$superWallpaperAodDualClockPositionXAnchorRight, this.$superWallpaperAodDualClockPositionY);
            if (bitmapM9267n == null) {
                return null;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapM9267n);
            C1819o.f7l8(bitmapCreateBitmap, this.$dpi);
            return new Pair(bitmapM9267n, bitmapCreateBitmap);
        }
    }

    private C2583k() {
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public final Object m9100k(int i2, float f2, float f3, float f4, float f5, int i3, @InterfaceC7396q InterfaceC6216q<? super Pair<Bitmap, Bitmap>> interfaceC6216q) {
        return C6708p.m24523y(f7l8.m22238k(), new k(i2, f2, f3, f4, f5, i3, null), interfaceC6216q);
    }
}
