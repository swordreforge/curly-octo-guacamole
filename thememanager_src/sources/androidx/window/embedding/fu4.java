package androidx.window.embedding;

import android.graphics.Rect;
import android.os.Build;
import android.view.WindowMetrics;
import androidx.window.core.InterfaceC1310q;
import com.android.thememanager.settingssearch.C2690k;
import com.market.sdk.reflect.C4991s;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kiv.EnumC6118k;
import kiv.InterfaceC6119n;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import zy.InterfaceC7830i;
import zy.hyr;

/* JADX INFO: compiled from: SplitRule.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001:\u0002\u0005\u000fB1\b\u0000\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Landroidx/window/embedding/fu4;", "Landroidx/window/embedding/qrj;", "Landroid/view/WindowMetrics;", "parentMetrics", "", "k", "", C2690k.k.f61039ld6, "equals", "", "hashCode", com.market.sdk.reflect.toq.f28131g, "q", "()I", "minWidth", "toq", "zy", "minSmallestWidth", "", com.market.sdk.reflect.toq.f28136y, "n", "()F", "splitRatio", "layoutDirection", C4991s.f28129n, "(IIFI)V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
@InterfaceC1310q
public class fu4 extends qrj {

    /* JADX INFO: renamed from: k */
    private final int f7102k;

    /* JADX INFO: renamed from: q */
    private final int f7103q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final int f53708toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final float f53709zy;

    /* JADX INFO: renamed from: androidx.window.embedding.fu4$k */
    /* JADX INFO: compiled from: SplitRule.kt */
    @d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Landroidx/window/embedding/fu4$k;", "", "Landroid/view/WindowMetrics;", "windowMetrics", "Landroid/graphics/Rect;", "k", C4991s.f28129n, "()V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
    @hyr(30)
    public static final class C1313k {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        public static final C1313k f7104k = new C1313k();

        private C1313k() {
        }

        @InterfaceC7396q
        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        public final Rect m5616k(@InterfaceC7396q WindowMetrics windowMetrics) {
            d2ok.m23075h(windowMetrics, "windowMetrics");
            Rect bounds = windowMetrics.getBounds();
            d2ok.kja0(bounds, "windowMetrics.bounds");
            return bounds;
        }
    }

    /* JADX INFO: compiled from: SplitRule.kt */
    @d3(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/window/embedding/fu4$toq;", "", "window_release"}, m22787k = 1, mv = {1, 6, 0})
    @Retention(RetentionPolicy.SOURCE)
    @InterfaceC6119n(EnumC6118k.SOURCE)
    public @interface toq {
    }

    public fu4() {
        this(0, 0, 0.0f, 0, 15, null);
    }

    public /* synthetic */ fu4(int i2, int i3, float f2, int i4, int i5, kotlin.jvm.internal.ni7 ni7Var) {
        this((i5 & 1) != 0 ? 0 : i2, (i5 & 2) != 0 ? 0 : i3, (i5 & 4) != 0 ? 0.5f : f2, (i5 & 8) != 0 ? 3 : i4);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu4)) {
            return false;
        }
        fu4 fu4Var = (fu4) obj;
        if (this.f7102k == fu4Var.f7102k && this.f53708toq == fu4Var.f53708toq) {
            return ((this.f53709zy > fu4Var.f53709zy ? 1 : (this.f53709zy == fu4Var.f53709zy ? 0 : -1)) == 0) && this.f7103q == fu4Var.f7103q;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f7102k * 31) + this.f53708toq) * 31) + Float.hashCode(this.f53709zy)) * 31) + this.f7103q;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m5613k(@InterfaceC7396q WindowMetrics parentMetrics) {
        d2ok.m23075h(parentMetrics, "parentMetrics");
        if (Build.VERSION.SDK_INT <= 30) {
            return false;
        }
        Rect rectM5616k = C1313k.f7104k.m5616k(parentMetrics);
        return (this.f7102k == 0 || rectM5616k.width() >= this.f7102k) && (this.f53708toq == 0 || Math.min(rectM5616k.width(), rectM5616k.height()) >= this.f53708toq);
    }

    /* JADX INFO: renamed from: n */
    public final float m5614n() {
        return this.f53709zy;
    }

    /* JADX INFO: renamed from: q */
    public final int m5615q() {
        return this.f7102k;
    }

    public final int toq() {
        return this.f7103q;
    }

    public final int zy() {
        return this.f53708toq;
    }

    public fu4(int i2, int i3, float f2, int i4) {
        this.f7102k = i2;
        this.f53708toq = i3;
        this.f53709zy = f2;
        this.f7103q = i4;
    }
}
