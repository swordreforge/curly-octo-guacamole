package com.android.thememanager.lockscreen.lock.rhombusclock;

import android.content.Context;
import com.android.thememanager.lockscreen.lock.color.picker.AbstractC2097k;
import com.android.thememanager.lockscreen.lock.color.picker.C2100q;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ClassicPlusTemplateView.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ClassicPlusTemplateView extends ClassicTemplateView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassicPlusTemplateView(@InterfaceC7396q Context context) {
        super(context);
        d2ok.m23075h(context, "context");
    }

    @Override // com.android.thememanager.lockscreen.lock.rhombusclock.ClassicTemplateView, com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    @InterfaceC7396q
    public String getClockStyleType() {
        return "classic_plus";
    }

    @Override // com.android.thememanager.lockscreen.lock.rhombusclock.ClassicTemplateView, com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    @InterfaceC7395n
    /* JADX INFO: renamed from: s */
    protected AbstractC2097k mo8048s() {
        Context context = getContext();
        d2ok.kja0(context, "getContext(...)");
        return new C2100q(context);
    }
}
