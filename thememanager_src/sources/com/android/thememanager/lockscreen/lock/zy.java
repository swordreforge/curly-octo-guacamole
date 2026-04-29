package com.android.thememanager.lockscreen.lock;

import android.content.Context;
import android.util.Log;
import android.widget.FrameLayout;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.lockscreen.lock.base.BaseTemplateView;
import com.android.thememanager.lockscreen.lock.color.picker.AbstractC2097k;
import com.android.thememanager.lockscreen.lock.color.picker.C2095g;
import com.android.thememanager.lockscreen.lock.color.picker.C2099p;
import com.android.thememanager.lockscreen.lock.color.picker.C2100q;
import com.android.thememanager.lockscreen.lock.color.picker.C2101s;
import com.android.thememanager.lockscreen.lock.color.picker.C2102y;
import com.android.thememanager.lockscreen.lock.color.picker.kja0;
import com.android.thememanager.lockscreen.lock.color.picker.qrj;
import com.android.thememanager.lockscreen.lock.doodleclock.DoodleTemplateView;
import com.android.thememanager.lockscreen.lock.frameclock.FrameTemplateView;
import com.android.thememanager.lockscreen.lock.magazineclock.MagazineATemplateView;
import com.android.thememanager.lockscreen.lock.magazineclock.MagazineBTemplateView;
import com.android.thememanager.lockscreen.lock.magazineclock.MagazineCTemplateView;
import com.android.thememanager.lockscreen.lock.rhombusclock.ClassicPlusTemplateView;
import com.android.thememanager.lockscreen.lock.rhombusclock.ClassicTemplateView;
import com.android.thememanager.lockscreen.lock.rhombusclock.RhombusTemplateView;
import java.util.Map;
import kotlin.collections.nn86;
import kotlin.jvm.internal.d2ok;
import kotlin.nmn5;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: TemplateViewFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class zy {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f60411toq = "TemplateViewFactory";

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final zy f12538k = new zy();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private static final Map<String, Class<? extends BaseTemplateView>> f60412zy = nn86.lrht(nmn5.m23230k("rhombus", RhombusTemplateView.class), nmn5.m23230k("classic", ClassicTemplateView.class), nmn5.m23230k("classic_plus", ClassicPlusTemplateView.class), nmn5.m23230k("magazine_a", MagazineATemplateView.class), nmn5.m23230k("magazine_b", MagazineBTemplateView.class), nmn5.m23230k("magazine_c", MagazineCTemplateView.class), nmn5.m23230k("doodle", DoodleTemplateView.class), nmn5.m23230k("smart_frame", FrameTemplateView.class));

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private static final Map<String, Class<? extends AbstractC2097k>> f12539q = nn86.lrht(nmn5.m23230k("rhombus", qrj.class), nmn5.m23230k("classic", com.android.thememanager.lockscreen.lock.color.picker.zy.class), nmn5.m23230k("classic_plus", C2100q.class), nmn5.m23230k("magazine_a", C2102y.class), nmn5.m23230k("magazine_b", C2101s.class), nmn5.m23230k("magazine_c", C2099p.class), nmn5.m23230k("doodle", C2095g.class), nmn5.m23230k("smart_frame", kja0.class));

    private zy() {
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public final BaseTemplateView m8161k(@InterfaceC7396q Context context, @InterfaceC7396q String templateId) {
        d2ok.m23075h(context, "context");
        d2ok.m23075h(templateId, "templateId");
        Class<? extends BaseTemplateView> cls = f60412zy.get(templateId);
        if (cls == null) {
            Log.w(f60411toq, "no templateViewClass found, templateId " + templateId);
            return null;
        }
        try {
            BaseTemplateView baseTemplateViewNewInstance = cls.getConstructor(Context.class).newInstance(context);
            d2ok.n7h(baseTemplateViewNewInstance, "null cannot be cast to non-null type com.android.thememanager.lockscreen.lock.base.BaseTemplateView");
            return baseTemplateViewNewInstance;
        } catch (Exception e2) {
            Log.e(f60411toq, "instance templateView error", e2);
            return null;
        }
    }

    @InterfaceC7395n
    public final BaseTemplateView toq(@InterfaceC7396q Context context, @InterfaceC7396q String templateId, @InterfaceC7396q FrameLayout.LayoutParams layoutParams, float f2, float f3) {
        d2ok.m23075h(context, "context");
        d2ok.m23075h(templateId, "templateId");
        d2ok.m23075h(layoutParams, "layoutParams");
        BaseTemplateView baseTemplateViewM8161k = m8161k(context, templateId);
        if (baseTemplateViewM8161k == null) {
            return null;
        }
        if (layoutParams.gravity == -1) {
            layoutParams.gravity = C1819o.x9kr() ? androidx.core.view.qrj.f50866zy : androidx.core.view.qrj.f50865toq;
        }
        baseTemplateViewM8161k.setLayoutParams(layoutParams);
        baseTemplateViewM8161k.setPivotX(0.0f);
        baseTemplateViewM8161k.setPivotY(0.0f);
        baseTemplateViewM8161k.setScaleX(f2);
        baseTemplateViewM8161k.setScaleY(f3);
        baseTemplateViewM8161k.kja0();
        return baseTemplateViewM8161k;
    }

    @InterfaceC7395n
    public final AbstractC2097k zy(@InterfaceC7396q Context context, @InterfaceC7396q String templateId) {
        d2ok.m23075h(context, "context");
        d2ok.m23075h(templateId, "templateId");
        Class<? extends AbstractC2097k> cls = f12539q.get(templateId);
        if (cls == null) {
            Log.w(f60411toq, "no templateViewClass found, templateId " + templateId);
            return null;
        }
        try {
            AbstractC2097k abstractC2097kNewInstance = cls.getConstructor(Context.class).newInstance(context);
            d2ok.n7h(abstractC2097kNewInstance, "null cannot be cast to non-null type com.android.thememanager.lockscreen.lock.color.picker.AutoColorPicker");
            return abstractC2097kNewInstance;
        } catch (Exception e2) {
            Log.e(f60411toq, "instance AutoColorPicker error", e2);
            return null;
        }
    }
}
