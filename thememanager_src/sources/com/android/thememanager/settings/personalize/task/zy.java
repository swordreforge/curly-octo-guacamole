package com.android.thememanager.settings.personalize.task;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.lifecycle.o1t;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.settings.superwallpaper.activity.data.C2640k;
import com.android.thememanager.settings.superwallpaper.activity.data.SuperWallpaperSummaryData;
import com.android.thememanager.wallpaper.C2951n;
import cyoe.InterfaceC5979h;
import ek5k.f7l8;
import java.lang.ref.WeakReference;
import kotlin.C6318m;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.coroutines.jvm.internal.kja0;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import kotlinx.coroutines.C6481a;
import kotlinx.coroutines.C6708p;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.ld6;
import kotlinx.coroutines.x2;
import kotlinx.coroutines.z4;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import uj2j.C7688k;

/* JADX INFO: compiled from: DeskWpTool.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class zy {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final zy f15309k = new zy();

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.task.zy$k */
    /* JADX INFO: compiled from: DeskWpTool.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.task.DeskWpTool$getWallpaperPreview$1", m22756f = "DeskWpTool.kt", m22757i = {0, 0}, m22758l = {236, 251}, m22759m = "invokeSuspend", m22760n = {"superWallpaperName", "dpi"}, m22761s = {"L$0", "I$0"})
    static final class C2587k extends kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super Bitmap>, Object> {
        final /* synthetic */ WeakReference<AbstractActivityC1717k> $activityRef;
        int I$0;
        Object L$0;
        int label;

        /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.task.zy$k$k */
        /* JADX INFO: compiled from: DeskWpTool.kt */
        @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.task.DeskWpTool$getWallpaperPreview$1$1", m22756f = "DeskWpTool.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        static final class k extends kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super SuperWallpaperSummaryData>, Object> {
            final /* synthetic */ SuperWallpaperSummaryData[] $datas;
            final /* synthetic */ String $superWallpaperId;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(SuperWallpaperSummaryData[] superWallpaperSummaryDataArr, String str, InterfaceC6216q<? super k> interfaceC6216q) {
                super(2, interfaceC6216q);
                this.$datas = superWallpaperSummaryDataArr;
                this.$superWallpaperId = str;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7396q
            public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                return new k(this.$datas, this.$superWallpaperId, interfaceC6216q);
            }

            @Override // cyoe.InterfaceC5979h
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super SuperWallpaperSummaryData> interfaceC6216q) {
                return ((k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                C6199q.x2();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
                C2640k.m9216n().qrj(this.$datas);
                return C2640k.m9216n().m9221s(this.$superWallpaperId);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2587k(WeakReference<AbstractActivityC1717k> weakReference, InterfaceC6216q<? super C2587k> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$activityRef = weakReference;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new C2587k(this.$activityRef, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super Bitmap> interfaceC6216q) {
            return ((C2587k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x0117 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x013f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0140  */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r16) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 325
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.settings.personalize.task.zy.C2587k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: DeskWpTool.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.task.DeskWpTool$loadDeskWpAsyncTask$2", m22756f = "DeskWpTool.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class toq extends kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super C7688k>, Object> {
        final /* synthetic */ SuperWallpaperSummaryData $data;
        final /* synthetic */ int $dpi;
        final /* synthetic */ int $style;
        final /* synthetic */ String $superWallpaperServiceName;
        final /* synthetic */ WallpaperManager $wallpaperManager;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toq(int i2, SuperWallpaperSummaryData superWallpaperSummaryData, WallpaperManager wallpaperManager, String str, int i3, InterfaceC6216q<? super toq> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$style = i2;
            this.$data = superWallpaperSummaryData;
            this.$wallpaperManager = wallpaperManager;
            this.$superWallpaperServiceName = str;
            this.$dpi = i3;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new toq(this.$style, this.$data, this.$wallpaperManager, this.$superWallpaperServiceName, this.$dpi, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super C7688k> interfaceC6216q) {
            return ((toq) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00ec  */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r8) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 395
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.settings.personalize.task.zy.toq.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.task.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DeskWpTool.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.task.DeskWpTool$updateStatusBarByWallpaper$1", m22756f = "DeskWpTool.kt", m22757i = {0}, m22758l = {180}, m22759m = "invokeSuspend", m22760n = {"colorMode"}, m22761s = {"I$0"})
    static final class C7933zy extends kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ AbstractActivityC1717k $activity;
        int I$0;
        int label;

        /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.task.zy$zy$k */
        /* JADX INFO: compiled from: DeskWpTool.kt */
        @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.task.DeskWpTool$updateStatusBarByWallpaper$1$1", m22756f = "DeskWpTool.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        static final class C2588k extends kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super Boolean>, Object> {
            final /* synthetic */ WeakReference<AbstractActivityC1717k> $activityRef;
            final /* synthetic */ int $colorMode;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2588k(WeakReference<AbstractActivityC1717k> weakReference, int i2, InterfaceC6216q<? super C2588k> interfaceC6216q) {
                super(2, interfaceC6216q);
                this.$activityRef = weakReference;
                this.$colorMode = i2;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7396q
            public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                return new C2588k(this.$activityRef, this.$colorMode, interfaceC6216q);
            }

            @Override // cyoe.InterfaceC5979h
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super Boolean> interfaceC6216q) {
                return ((C2588k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                C6199q.x2();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
                return kotlin.coroutines.jvm.internal.toq.m22766k(C1819o.m7154g(this.$activityRef.get(), 2 == this.$colorMode));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7933zy(AbstractActivityC1717k abstractActivityC1717k, InterfaceC6216q<? super C7933zy> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$activity = abstractActivityC1717k;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new C7933zy(this.$activity, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((C7933zy) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            int i2;
            Object objX2 = C6199q.x2();
            int i3 = this.label;
            try {
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (i3 == 0) {
                C6318m.n7h(obj);
                WeakReference<AbstractActivityC1717k> weakReference = new WeakReference<>(this.$activity);
                Bitmap bitmapM9104k = zy.f15309k.m9104k(weakReference);
                if (bitmapM9104k != null || weakReference.get() == null) {
                    int iZy = com.android.thememanager.settings.superwallpaper.wallpaper.toq.m9322k(weakReference.get()).zy(bitmapM9104k);
                    z4 z4VarM23813n = C6481a.m23813n();
                    C2588k c2588k = new C2588k(weakReference, iZy, null);
                    this.I$0 = iZy;
                    this.label = 1;
                    if (C6708p.m24523y(z4VarM23813n, c2588k, this) == objX2) {
                        return objX2;
                    }
                    i2 = iZy;
                }
                return was.f36763k;
            }
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = this.I$0;
            C6318m.n7h(obj);
            Log.i("DeskWpTool", "updateStatusBarByWallpaper colorMode " + i2);
            return was.f36763k;
        }
    }

    private zy() {
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public final Bitmap m9104k(@InterfaceC7396q WeakReference<AbstractActivityC1717k> activityRef) {
        d2ok.m23075h(activityRef, "activityRef");
        if (C2951n.fn3e().kja0()) {
            return (Bitmap) ld6.toq(null, new C2587k(activityRef, null), 1, null);
        }
        return null;
    }

    @InterfaceC7395n
    public final Object toq(@InterfaceC7395n SuperWallpaperSummaryData superWallpaperSummaryData, int i2, int i3, @InterfaceC7395n String str, @InterfaceC7396q WallpaperManager wallpaperManager, @InterfaceC7396q InterfaceC6216q<? super C7688k> interfaceC6216q) {
        return C6708p.m24523y(f7l8.m22238k(), new toq(i2, superWallpaperSummaryData, wallpaperManager, str, i3, null), interfaceC6216q);
    }

    public final void zy(@InterfaceC7396q AbstractActivityC1717k activity) {
        d2ok.m23075h(activity, "activity");
        C1819o.m7154g(activity, false);
        x2.m24649g(o1t.m4467k(activity), f7l8.m22238k(), null, new C7933zy(activity, null), 2, null);
    }
}
