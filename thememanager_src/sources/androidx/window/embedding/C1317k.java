package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.InterfaceC1310q;
import com.android.thememanager.clockmessage.model.C1873k;
import com.android.thememanager.settingssearch.C2690k;
import com.market.sdk.reflect.C4991s;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.text.fti;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import vy.C7718q;

/* JADX INFO: renamed from: androidx.window.embedding.k */
/* JADX INFO: compiled from: ActivityFilter.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0013\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/window/embedding/k;", "", "Landroid/content/Intent;", C7718q.f97043a9, "", "q", "Landroid/app/Activity;", C1873k.f10652g, "zy", C2690k.k.f61039ld6, "equals", "", "hashCode", "", "toString", "Landroid/content/ComponentName;", "k", "Landroid/content/ComponentName;", "()Landroid/content/ComponentName;", "componentName", "toq", "Ljava/lang/String;", "()Ljava/lang/String;", C2690k.k.f15969g, C4991s.f28129n, "(Landroid/content/ComponentName;Ljava/lang/String;)V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
@InterfaceC1310q
public final class C1317k {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final ComponentName f7115k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7395n
    private final String f53718toq;

    public C1317k(@InterfaceC7396q ComponentName componentName, @InterfaceC7395n String str) {
        d2ok.m23075h(componentName, "componentName");
        this.f7115k = componentName;
        this.f53718toq = str;
        String packageName = componentName.getPackageName();
        d2ok.kja0(packageName, "componentName.packageName");
        String className = componentName.getClassName();
        d2ok.kja0(className, "componentName.className");
        boolean z2 = true;
        if (!(packageName.length() > 0)) {
            throw new IllegalArgumentException("Package name must not be empty".toString());
        }
        if (!(className.length() > 0)) {
            throw new IllegalArgumentException("Activity class name must not be empty.".toString());
        }
        if (!(!fti.lk(packageName, "*", false, 2, null) || fti.b7(packageName, "*", 0, false, 6, null) == packageName.length() - 1)) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
        }
        if (fti.lk(className, "*", false, 2, null) && fti.b7(className, "*", 0, false, 6, null) != className.length() - 1) {
            z2 = false;
        }
        if (!z2) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
        }
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1317k)) {
            return false;
        }
        C1317k c1317k = (C1317k) obj;
        return d2ok.f7l8(this.f7115k, c1317k.f7115k) && d2ok.f7l8(this.f53718toq, c1317k.f53718toq);
    }

    public int hashCode() {
        int iHashCode = this.f7115k.hashCode() * 31;
        String str = this.f53718toq;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final ComponentName m5630k() {
        return this.f7115k;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m5631q(@InterfaceC7396q Intent intent) {
        d2ok.m23075h(intent, "intent");
        if (!ki.f7116k.toq(intent.getComponent(), this.f7115k)) {
            return false;
        }
        String str = this.f53718toq;
        return str == null || d2ok.f7l8(str, intent.getAction());
    }

    @InterfaceC7396q
    public String toString() {
        return "ActivityFilter(componentName=" + this.f7115k + ", intentAction=" + ((Object) this.f53718toq) + ')';
    }

    @InterfaceC7395n
    public final String toq() {
        return this.f53718toq;
    }

    public final boolean zy(@InterfaceC7396q Activity activity) {
        d2ok.m23075h(activity, "activity");
        if (ki.f7116k.m5632k(activity, this.f7115k)) {
            String str = this.f53718toq;
            if (str != null) {
                Intent intent = activity.getIntent();
                if (d2ok.f7l8(str, intent == null ? null : intent.getAction())) {
                }
            }
            return true;
        }
        return false;
    }
}
