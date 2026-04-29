package com.android.thememanager;

import android.app.Activity;
import android.content.Intent;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.settings.superwallpaper.activity.data.SuperWallpaperSummaryData;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import zy.y9n;

/* JADX INFO: compiled from: EditFunctionController.kt */
/* JADX INFO: loaded from: classes.dex */
public final class x2 extends AbstractC2044g implements n7h {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C2963k f17856k = new C2963k(null);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7395n
    private static volatile x2 f61591toq;

    /* JADX INFO: renamed from: com.android.thememanager.x2$k */
    /* JADX INFO: compiled from: EditFunctionController.kt */
    @lv5({"SMAP\nEditFunctionController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditFunctionController.kt\ncom/android/thememanager/EditFunctionController$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
    public static final class C2963k {
        private C2963k() {
        }

        public /* synthetic */ C2963k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        @y9n
        /* JADX INFO: renamed from: k */
        public final x2 m10531k() {
            x2 x2Var = x2.f61591toq;
            if (x2Var == null) {
                synchronized (this) {
                    x2Var = new x2();
                    C2963k c2963k = x2.f17856k;
                    x2.f61591toq = x2Var;
                }
            }
            return x2Var;
        }
    }

    @Override // com.android.thememanager.n7h
    /* JADX INFO: renamed from: k */
    public void mo8412k(@InterfaceC7396q Resource resource, boolean z2, @InterfaceC7396q Activity activity) {
        kotlin.jvm.internal.d2ok.m23075h(resource, "resource");
        kotlin.jvm.internal.d2ok.m23075h(activity, "activity");
        m7906t(resource, z2, activity);
    }

    @Override // com.android.thememanager.n7h
    /* JADX INFO: renamed from: q */
    public void mo8413q(@InterfaceC7396q Intent data, @InterfaceC7396q Activity activity) {
        kotlin.jvm.internal.d2ok.m23075h(data, "data");
        kotlin.jvm.internal.d2ok.m23075h(activity, "activity");
        mcp(data, activity);
    }

    @Override // com.android.thememanager.n7h
    public void toq(@InterfaceC7396q Resource resource, boolean z2, @InterfaceC7396q Activity activity) {
        kotlin.jvm.internal.d2ok.m23075h(resource, "resource");
        kotlin.jvm.internal.d2ok.m23075h(activity, "activity");
        o1t(resource, z2, activity);
    }

    @Override // com.android.thememanager.n7h
    public void zy(@InterfaceC7396q SuperWallpaperSummaryData mData, @InterfaceC7396q Activity activity) {
        kotlin.jvm.internal.d2ok.m23075h(mData, "mData");
        kotlin.jvm.internal.d2ok.m23075h(activity, "activity");
        wvg(mData, activity);
    }
}
