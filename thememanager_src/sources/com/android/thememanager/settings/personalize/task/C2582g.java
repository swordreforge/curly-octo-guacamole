package com.android.thememanager.settings.personalize.task;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import cnbm.C1404k;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.vyq;
import com.android.thememanager.controller.x2;
import cyoe.InterfaceC5979h;
import ek5k.f7l8;
import java.io.File;
import java.util.Map;
import kotlin.C6227f;
import kotlin.C6318m;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.coroutines.jvm.internal.kja0;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.lv5;
import kotlin.nmn5;
import kotlin.was;
import kotlinx.coroutines.C6708p;
import kotlinx.coroutines.InterfaceC6556f;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import uj2j.C7689q;

/* JADX INFO: renamed from: com.android.thememanager.settings.personalize.task.g */
/* JADX INFO: compiled from: ThemePreviewTool.kt */
/* JADX INFO: loaded from: classes2.dex */
@lv5({"SMAP\nThemePreviewTool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThemePreviewTool.kt\ncom/android/thememanager/settings/personalize/task/ThemePreviewTool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n1#2:171\n*E\n"})
public final class C2582g {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C2582g f15303k = new C2582g();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f60829toq = "secondary70";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f60830zy = "secondary30";

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.task.g$k */
    /* JADX INFO: compiled from: ThemePreviewTool.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.settings.personalize.task.ThemePreviewTool$loadThemePreview$2", m22756f = "ThemePreviewTool.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class k extends kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super C7689q>, Object> {
        int label;

        k(InterfaceC6216q<? super k> interfaceC6216q) {
            super(2, interfaceC6216q);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new k(interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super C7689q> interfaceC6216q) {
            return ((k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v6, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v2, types: [T, android.graphics.Bitmap] */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            C6199q.x2();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6318m.n7h(obj);
            i1.C6299y c6299y = new i1.C6299y();
            i1.C6294g c6294g = new i1.C6294g();
            int iIntValue = -1;
            c6294g.element = -1;
            int dimensionPixelOffset = bf2.toq.toq().getResources().getDimensionPixelOffset(R.dimen.personalize_theme_card_preview_width);
            int dimensionPixelOffset2 = bf2.toq.toq().getResources().getDimensionPixelOffset(R.dimen.personalize_theme_card_preview_height);
            C2582g c2582g = C2582g.f15303k;
            Resource resourceM9097y = c2582g.m9097y();
            if (resourceM9097y == null) {
                resourceM9097y = new x2(C2082k.zy().m8001n().m10535g("theme")).m7690k().ld6();
            }
            String strF7l8 = c2582g.f7l8(true, resourceM9097y);
            String strF7l82 = c2582g.f7l8(false, resourceM9097y);
            if (resourceM9097y == null || p029m.zy.toq(strF7l8) || p029m.zy.toq(strF7l82) || !new File(strF7l8).exists() || !new File(strF7l82).exists()) {
                c6299y.element = Bitmap.createBitmap(dimensionPixelOffset, dimensionPixelOffset2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas((Bitmap) c6299y.element);
                Paint paint = new Paint();
                paint.setColor(bf2.toq.toq().getColor(R.color.personalize_theme_card_default_color));
                canvas.drawPaint(paint);
                int color = bf2.toq.toq().getColor(R.color.personalize_theme_card_bg_color);
                c6294g.element = color;
                T t2 = c6299y.element;
                return new C7689q((Bitmap) t2, (Bitmap) t2, color, null);
            }
            String title = resourceM9097y.getTitle();
            C6227f c6227fM9094g = c2582g.m9094g(strF7l8, dimensionPixelOffset, dimensionPixelOffset2);
            c6299y.element = c6227fM9094g.getFirst();
            int iIntValue2 = ((Number) c6227fM9094g.getSecond()).intValue();
            Bitmap bitmap = (Bitmap) c2582g.m9094g(strF7l82, dimensionPixelOffset, dimensionPixelOffset2).getFirst();
            if (((Bitmap) c6299y.element) != null) {
                boolean z2 = com.android.thememanager.settings.superwallpaper.utils.toq.m9300k(bf2.toq.toq(), (Bitmap) c6299y.element) != 0;
                T t3 = c6299y.element;
                d2ok.qrj(t3);
                Map<String, Integer> mapZy = C1404k.zy(com.miui.miwallpaper.material.utils.zy.f7l8((Bitmap) t3));
                d2ok.kja0(mapZy, "generatePalette(...)");
                if (z2) {
                    Integer num = mapZy.get(C2582g.f60829toq);
                    if (num != null) {
                        iIntValue = num.intValue();
                    }
                } else {
                    Integer num2 = mapZy.get(C2582g.f60830zy);
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    }
                }
                c6294g.element = iIntValue;
            }
            return new C7689q(c2582g.m9098n((Bitmap) c6299y.element, iIntValue2), c2582g.m9098n(bitmap, iIntValue2), c6294g.element, title);
        }
    }

    private C2582g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String f7l8(boolean z2, Resource resource) {
        return C1807g.m7081r() ? C1792n.fn3e(resource, z2, C1807g.wvg()) : z2 ? C1792n.t8r(resource) : C1792n.ki(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final C6227f<Bitmap, Integer> m9094g(String str, int i2, int i3) {
        if (str == null) {
            return new C6227f<>(null, 1);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = f15303k.m9096q(options, i2, i3);
        options.inJustDecodeBounds = false;
        return new C6227f<>(BitmapFactory.decodeFile(str, options), Integer.valueOf(options.inSampleSize));
    }

    /* JADX INFO: renamed from: q */
    private final int m9096q(BitmapFactory.Options options, int i2, int i3) {
        C6227f c6227fM23230k = nmn5.m23230k(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int iIntValue = ((Number) c6227fM23230k.component1()).intValue();
        int iIntValue2 = ((Number) c6227fM23230k.component2()).intValue();
        int i4 = 1;
        if (iIntValue > i3 || iIntValue2 > i2) {
            int i5 = iIntValue / 2;
            int i6 = iIntValue2 / 2;
            while (i5 / i4 >= i3 && i6 / i4 >= i2) {
                i4 *= 2;
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final Resource m9097y() {
        x2 x2Var = new x2(C2082k.zy().m8001n().m10535g("theme"));
        Resource resourceQrj = x2Var.m7690k().qrj(vyq.zurt("theme"));
        return resourceQrj == null ? x2Var.m7690k().ld6() : resourceQrj;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: n */
    public final Bitmap m9098n(@InterfaceC7395n Bitmap bitmap, int i2) {
        if (bitmap == null) {
            return null;
        }
        int iGvn7 = C1819o.gvn7(bf2.toq.toq().getResources()) / i2;
        return Bitmap.createBitmap(bitmap, 0, iGvn7, bitmap.getWidth(), bitmap.getHeight() - iGvn7);
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: s */
    public final Object m9099s(@InterfaceC7396q InterfaceC6216q<? super C7689q> interfaceC6216q) {
        return C6708p.m24523y(f7l8.m22238k(), new k(null), interfaceC6216q);
    }
}
