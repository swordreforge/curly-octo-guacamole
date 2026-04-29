package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.InterfaceC1310q;
import com.android.thememanager.clockmessage.model.C1873k;
import com.android.thememanager.settingssearch.C2690k;
import com.market.sdk.reflect.C4991s;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: androidx.window.embedding.i */
/* JADX INFO: compiled from: SplitInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0013\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/window/embedding/i;", "", "Landroid/app/Activity;", C1873k.f10652g, "", "k", C2690k.k.f61039ld6, "equals", "", "hashCode", "", "toString", "Landroidx/window/embedding/zy;", "Landroidx/window/embedding/zy;", "toq", "()Landroidx/window/embedding/zy;", "primaryActivityStack", "zy", "secondaryActivityStack", "", com.market.sdk.reflect.toq.f28136y, "q", "()F", "splitRatio", C4991s.f28129n, "(Landroidx/window/embedding/zy;Landroidx/window/embedding/zy;F)V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
@InterfaceC1310q
public final class C1316i {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final zy f7114k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final zy f53716toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final float f53717zy;

    public C1316i(@InterfaceC7396q zy primaryActivityStack, @InterfaceC7396q zy secondaryActivityStack, float f2) {
        d2ok.m23075h(primaryActivityStack, "primaryActivityStack");
        d2ok.m23075h(secondaryActivityStack, "secondaryActivityStack");
        this.f7114k = primaryActivityStack;
        this.f53716toq = secondaryActivityStack;
        this.f53717zy = f2;
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1316i)) {
            return false;
        }
        C1316i c1316i = (C1316i) obj;
        if (d2ok.f7l8(this.f7114k, c1316i.f7114k) && d2ok.f7l8(this.f53716toq, c1316i.f53716toq)) {
            return (this.f53717zy > c1316i.f53717zy ? 1 : (this.f53717zy == c1316i.f53717zy ? 0 : -1)) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f7114k.hashCode() * 31) + this.f53716toq.hashCode()) * 31) + Float.hashCode(this.f53717zy);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m5628k(@InterfaceC7396q Activity activity) {
        d2ok.m23075h(activity, "activity");
        return this.f7114k.m5666k(activity) || this.f53716toq.m5666k(activity);
    }

    /* JADX INFO: renamed from: q */
    public final float m5629q() {
        return this.f53717zy;
    }

    @InterfaceC7396q
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SplitInfo:{");
        sb.append("primaryActivityStack=" + toq() + ',');
        sb.append("secondaryActivityStack=" + zy() + ',');
        sb.append("splitRatio=" + m5629q() + '}');
        String string = sb.toString();
        d2ok.kja0(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @InterfaceC7396q
    public final zy toq() {
        return this.f7114k;
    }

    @InterfaceC7396q
    public final zy zy() {
        return this.f53716toq;
    }
}
