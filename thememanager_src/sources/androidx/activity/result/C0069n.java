package androidx.activity.result;

import android.content.Intent;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: androidx.activity.result.n */
/* JADX INFO: compiled from: ActivityResult.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\u0002\u001a\u000f\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0000H\u0086\u0002¨\u0006\u0005"}, d2 = {"Landroidx/activity/result/ActivityResult;", "", "k", "Landroid/content/Intent;", "toq", "activity-ktx_release"}, m22787k = 2, mv = {1, 4, 1})
public final class C0069n {
    /* JADX INFO: renamed from: k */
    public static final int m80k(@InterfaceC7396q ActivityResult component1) {
        d2ok.m23075h(component1, "$this$component1");
        return component1.m22k();
    }

    @InterfaceC7395n
    public static final Intent toq(@InterfaceC7396q ActivityResult component2) {
        d2ok.m23075h(component2, "$this$component2");
        return component2.getData();
    }
}
