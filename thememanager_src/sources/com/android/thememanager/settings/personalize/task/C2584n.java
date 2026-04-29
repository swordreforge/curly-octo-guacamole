package com.android.thememanager.settings.personalize.task;

import android.graphics.Bitmap;
import android.provider.MiuiSettings;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.a9;
import com.android.thememanager.basemodule.utils.ki;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.settings.superwallpaper.activity.data.SuperWallpaperSummaryData;
import com.android.thememanager.settings.superwallpaper.utils.C2670y;
import com.android.thememanager.util.x9kr;
import cyoe.InterfaceC5979h;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.coroutines.jvm.internal.kja0;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import kotlinx.coroutines.C6481a;
import kotlinx.coroutines.C6708p;
import kotlinx.coroutines.InterfaceC6556f;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: com.android.thememanager.settings.personalize.task.n */
/* JADX INFO: compiled from: LockScreenWpTool.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2584n {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C2584n f15305k = new C2584n();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f60831toq = "LockScreenWpAsyncTask";

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.task.n$k */
    /* JADX INFO: compiled from: LockScreenWpTool.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.task.LockScreenWpTool$loadLockScreenData$2", m22756f = "LockScreenWpTool.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class k extends kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super uj2j.toq>, Object> {
        final /* synthetic */ SuperWallpaperSummaryData $data;
        final /* synthetic */ int $style;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(int i2, SuperWallpaperSummaryData superWallpaperSummaryData, InterfaceC6216q<? super k> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$style = i2;
            this.$data = superWallpaperSummaryData;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new k(this.$style, this.$data, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super uj2j.toq> interfaceC6216q) {
            return ((k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:105:0x0273  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x017e  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0185  */
        /* JADX WARN: Type inference failed for: r0v16, types: [T, android.graphics.Bitmap] */
        /* JADX WARN: Type inference failed for: r0v24, types: [T, android.graphics.Bitmap] */
        /* JADX WARN: Type inference failed for: r0v42, types: [T, android.graphics.Bitmap] */
        /* JADX WARN: Type inference failed for: r0v7, types: [T, android.graphics.Bitmap] */
        /* JADX WARN: Type inference failed for: r1v3, types: [T, android.graphics.Bitmap] */
        /* JADX WARN: Type inference failed for: r2v8, types: [T, android.graphics.Bitmap] */
        /* JADX WARN: Type inference failed for: r5v13, types: [T, android.graphics.Bitmap] */
        /* JADX WARN: Type inference failed for: r5v14, types: [T, android.graphics.Bitmap] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @mub.InterfaceC7395n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@mub.InterfaceC7396q java.lang.Object r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 665
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.settings.personalize.task.C2584n.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private C2584n() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap toq() {
        Bitmap bitmapM10069g;
        Bitmap bitmapM7107k = ki.m7107k(C2670y.m9307n(bf2.toq.toq()));
        boolean zM6993h = a9.m6993h(bf2.toq.toq());
        if (o1t.m7171i() || !zM6993h || bitmapM7107k == null) {
            bitmapM10069g = null;
        } else {
            bitmapM10069g = x9kr.m10069g(bitmapM7107k, com.bumptech.glide.zy.m11283n(bf2.toq.toq()).m11289y(), C1819o.d2ok(bf2.toq.toq()) && MiuiSettings.System.getBoolean(bf2.toq.toq().getContentResolver(), x9kr.toq.f16901q, true), true);
        }
        if (bitmapM10069g == null) {
            return bitmapM7107k;
        }
        if (!d2ok.f7l8(bitmapM10069g, bitmapM7107k)) {
            d2ok.qrj(bitmapM7107k);
            bitmapM7107k.recycle();
        }
        return bitmapM10069g;
    }

    @InterfaceC7395n
    public final Object zy(@InterfaceC7395n SuperWallpaperSummaryData superWallpaperSummaryData, int i2, @InterfaceC7396q InterfaceC6216q<? super uj2j.toq> interfaceC6216q) {
        return C6708p.m24523y(C6481a.zy(), new k(i2, superWallpaperSummaryData, null), interfaceC6216q);
    }
}
