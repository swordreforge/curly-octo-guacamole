package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.InterfaceC1310q;
import com.android.thememanager.settingssearch.C2690k;
import com.market.sdk.reflect.C4991s;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: SplitPairFilter.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0013\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0013R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019¨\u0006\u001d"}, d2 = {"Landroidx/window/embedding/fn3e;", "", "Landroid/app/Activity;", "primaryActivity", "secondaryActivity", "", "n", "Landroid/content/Intent;", "secondaryActivityIntent", "q", C2690k.k.f61039ld6, "equals", "", "hashCode", "", "toString", "Landroid/content/ComponentName;", "k", "Landroid/content/ComponentName;", "()Landroid/content/ComponentName;", "primaryActivityName", "toq", "zy", "secondaryActivityName", "Ljava/lang/String;", "()Ljava/lang/String;", "secondaryActivityIntentAction", C4991s.f28129n, "(Landroid/content/ComponentName;Landroid/content/ComponentName;Ljava/lang/String;)V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
@InterfaceC1310q
public final class fn3e {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final ComponentName f7101k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final ComponentName f53706toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7395n
    private final String f53707zy;

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public fn3e(@mub.InterfaceC7396q android.content.ComponentName r18, @mub.InterfaceC7396q android.content.ComponentName r19, @mub.InterfaceC7395n java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.fn3e.<init>(android.content.ComponentName, android.content.ComponentName, java.lang.String):void");
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn3e)) {
            return false;
        }
        fn3e fn3eVar = (fn3e) obj;
        return d2ok.f7l8(this.f7101k, fn3eVar.f7101k) && d2ok.f7l8(this.f53706toq, fn3eVar.f53706toq) && d2ok.f7l8(this.f53707zy, fn3eVar.f53707zy);
    }

    public int hashCode() {
        int iHashCode = ((this.f7101k.hashCode() * 31) + this.f53706toq.hashCode()) * 31;
        String str = this.f53707zy;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final ComponentName m5610k() {
        return this.f7101k;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m5611n(@mub.InterfaceC7396q android.app.Activity r6, @mub.InterfaceC7396q android.app.Activity r7) {
        /*
            r5 = this;
            java.lang.String r0 = "primaryActivity"
            kotlin.jvm.internal.d2ok.m23075h(r6, r0)
            java.lang.String r0 = "secondaryActivity"
            kotlin.jvm.internal.d2ok.m23075h(r7, r0)
            androidx.window.embedding.ki r0 = androidx.window.embedding.ki.f7116k
            android.content.ComponentName r1 = r6.getComponentName()
            android.content.ComponentName r2 = r5.f7101k
            boolean r1 = r0.toq(r1, r2)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L28
            android.content.ComponentName r1 = r7.getComponentName()
            android.content.ComponentName r4 = r5.f53706toq
            boolean r0 = r0.toq(r1, r4)
            if (r0 == 0) goto L28
            r0 = r2
            goto L29
        L28:
            r0 = r3
        L29:
            android.content.Intent r1 = r7.getIntent()
            if (r1 == 0) goto L43
            if (r0 == 0) goto L41
            android.content.Intent r7 = r7.getIntent()
            java.lang.String r0 = "secondaryActivity.intent"
            kotlin.jvm.internal.d2ok.kja0(r7, r0)
            boolean r6 = r5.m5612q(r6, r7)
            if (r6 == 0) goto L41
            goto L42
        L41:
            r2 = r3
        L42:
            r0 = r2
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.fn3e.m5611n(android.app.Activity, android.app.Activity):boolean");
    }

    /* JADX INFO: renamed from: q */
    public final boolean m5612q(@InterfaceC7396q Activity primaryActivity, @InterfaceC7396q Intent secondaryActivityIntent) {
        d2ok.m23075h(primaryActivity, "primaryActivity");
        d2ok.m23075h(secondaryActivityIntent, "secondaryActivityIntent");
        ComponentName componentName = primaryActivity.getComponentName();
        ki kiVar = ki.f7116k;
        if (!kiVar.toq(componentName, this.f7101k) || !kiVar.toq(secondaryActivityIntent.getComponent(), this.f53706toq)) {
            return false;
        }
        String str = this.f53707zy;
        return str == null || d2ok.f7l8(str, secondaryActivityIntent.getAction());
    }

    @InterfaceC7396q
    public String toString() {
        return "SplitPairFilter{primaryActivityName=" + this.f7101k + ", secondaryActivityName=" + this.f53706toq + ", secondaryActivityAction=" + ((Object) this.f53707zy) + '}';
    }

    @InterfaceC7395n
    public final String toq() {
        return this.f53707zy;
    }

    @InterfaceC7396q
    public final ComponentName zy() {
        return this.f53706toq;
    }
}
