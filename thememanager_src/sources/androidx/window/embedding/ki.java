package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.InterfaceC1310q;
import com.android.thememanager.clockmessage.model.C1873k;
import com.market.sdk.reflect.C4991s;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.text.a9;
import kotlin.text.fti;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: MatcherUtils.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J!\u0010\n\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/window/embedding/ki;", "", "", "name", "pattern", "", "zy", "Landroid/content/ComponentName;", "activityComponent", "ruleComponent", "toq", "(Landroid/content/ComponentName;Landroid/content/ComponentName;)Z", "Landroid/app/Activity;", C1873k.f10652g, "k", "(Landroid/app/Activity;Landroid/content/ComponentName;)Z", com.market.sdk.reflect.toq.f68929toq, "sDebugMatchers", "Ljava/lang/String;", "sMatchersTag", C4991s.f28129n, "()V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
@InterfaceC1310q
public final class ki {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final ki f7116k = new ki();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final boolean f53719toq = false;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    public static final String f53720zy = "SplitRuleResolution";

    private ki() {
    }

    private final boolean zy(String str, String str2) {
        if (!fti.lk(str2, "*", false, 2, null)) {
            return false;
        }
        if (d2ok.f7l8(str2, "*")) {
            return true;
        }
        if (!(fti.b7(str2, "*", 0, false, 6, null) == fti.z8(str2, "*", 0, false, 6, null) && a9.ga(str2, "*", false, 2, null))) {
            throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end".toString());
        }
        String strSubstring = str2.substring(0, str2.length() - 1);
        d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return a9.r6ty(str, strSubstring, false, 2, null);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m5632k(@InterfaceC7396q Activity activity, @InterfaceC7396q ComponentName ruleComponent) {
        ComponentName component;
        d2ok.m23075h(activity, "activity");
        d2ok.m23075h(ruleComponent, "ruleComponent");
        if (toq(activity.getComponentName(), ruleComponent)) {
            return true;
        }
        Intent intent = activity.getIntent();
        if (intent == null || (component = intent.getComponent()) == null) {
            return false;
        }
        return f7116k.toq(component, ruleComponent);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean toq(@mub.InterfaceC7395n android.content.ComponentName r7, @mub.InterfaceC7396q android.content.ComponentName r8) {
        /*
            r6 = this;
            java.lang.String r0 = "ruleComponent"
            kotlin.jvm.internal.d2ok.m23075h(r8, r0)
            java.lang.String r0 = "*"
            r1 = 1
            r2 = 0
            if (r7 != 0) goto L22
            java.lang.String r7 = r8.getPackageName()
            boolean r7 = kotlin.jvm.internal.d2ok.f7l8(r7, r0)
            if (r7 == 0) goto L20
            java.lang.String r7 = r8.getClassName()
            boolean r7 = kotlin.jvm.internal.d2ok.f7l8(r7, r0)
            if (r7 == 0) goto L20
            goto L21
        L20:
            r1 = r2
        L21:
            return r1
        L22:
            java.lang.String r3 = r7.toString()
            java.lang.String r4 = "activityComponent.toString()"
            kotlin.jvm.internal.d2ok.kja0(r3, r4)
            r4 = 2
            r5 = 0
            boolean r0 = kotlin.text.zurt.lk(r3, r0, r2, r4, r5)
            r0 = r0 ^ r1
            if (r0 == 0) goto L8f
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r3 = r8.getPackageName()
            boolean r0 = kotlin.jvm.internal.d2ok.f7l8(r0, r3)
            if (r0 != 0) goto L5d
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r3 = "activityComponent.packageName"
            kotlin.jvm.internal.d2ok.kja0(r0, r3)
            java.lang.String r3 = r8.getPackageName()
            java.lang.String r4 = "ruleComponent.packageName"
            kotlin.jvm.internal.d2ok.kja0(r3, r4)
            boolean r0 = r6.zy(r0, r3)
            if (r0 == 0) goto L5b
            goto L5d
        L5b:
            r0 = r2
            goto L5e
        L5d:
            r0 = r1
        L5e:
            java.lang.String r3 = r7.getClassName()
            java.lang.String r4 = r8.getClassName()
            boolean r3 = kotlin.jvm.internal.d2ok.f7l8(r3, r4)
            if (r3 != 0) goto L87
            java.lang.String r7 = r7.getClassName()
            java.lang.String r3 = "activityComponent.className"
            kotlin.jvm.internal.d2ok.kja0(r7, r3)
            java.lang.String r8 = r8.getClassName()
            java.lang.String r3 = "ruleComponent.className"
            kotlin.jvm.internal.d2ok.kja0(r8, r3)
            boolean r7 = r6.zy(r7, r8)
            if (r7 == 0) goto L85
            goto L87
        L85:
            r7 = r2
            goto L88
        L87:
            r7 = r1
        L88:
            if (r0 == 0) goto L8d
            if (r7 == 0) goto L8d
            goto L8e
        L8d:
            r1 = r2
        L8e:
            return r1
        L8f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Wildcard can only be part of the rule."
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.ki.toq(android.content.ComponentName, android.content.ComponentName):boolean");
    }
}
