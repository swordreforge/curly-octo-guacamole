package androidx.window.core;

import androidx.exifinterface.media.C0846k;
import androidx.window.core.f7l8;
import com.market.sdk.reflect.C4991s;
import cyoe.x2;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: androidx.window.core.y */
/* JADX INFO: compiled from: SpecificationComputer.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B'\u0012\u0006\u0010\u0010\u001a\u00028\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 J/\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0016J\u000f\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001e\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u0016\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/window/core/y;", "", C0846k.zaso, "Landroidx/window/core/f7l8;", "", "message", "Lkotlin/Function1;", "", "Lkotlin/fn3e;", "condition", "zy", "k", "()Ljava/lang/Object;", "toq", "Ljava/lang/Object;", C7704k.y.toq.f95579toq, "value", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "tag", "Landroidx/window/core/f7l8$toq;", "q", "Landroidx/window/core/f7l8$toq;", "f7l8", "()Landroidx/window/core/f7l8$toq;", "verificationMode", "Landroidx/window/core/g;", "Landroidx/window/core/g;", "()Landroidx/window/core/g;", "logger", C4991s.f28129n, "(Ljava/lang/Object;Ljava/lang/String;Landroidx/window/core/f7l8$toq;Landroidx/window/core/g;)V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
final class C1312y<T> extends f7l8<T> {

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final InterfaceC1306g f7095n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final f7l8.toq f7096q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final T f53703toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final String f53704zy;

    public C1312y(@InterfaceC7396q T value, @InterfaceC7396q String tag, @InterfaceC7396q f7l8.toq verificationMode, @InterfaceC7396q InterfaceC1306g logger) {
        d2ok.m23075h(value, "value");
        d2ok.m23075h(tag, "tag");
        d2ok.m23075h(verificationMode, "verificationMode");
        d2ok.m23075h(logger, "logger");
        this.f53703toq = value;
        this.f53704zy = tag;
        this.f7096q = verificationMode;
        this.f7095n = logger;
    }

    @InterfaceC7396q
    public final f7l8.toq f7l8() {
        return this.f7096q;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public final T m5606g() {
        return this.f53703toq;
    }

    @Override // androidx.window.core.f7l8
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public T mo5585k() {
        return this.f53703toq;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public final String m5607n() {
        return this.f53704zy;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public final InterfaceC1306g m5608q() {
        return this.f7095n;
    }

    @Override // androidx.window.core.f7l8
    @InterfaceC7396q
    public f7l8<T> zy(@InterfaceC7396q String message, @InterfaceC7396q x2<? super T, Boolean> condition) {
        d2ok.m23075h(message, "message");
        d2ok.m23075h(condition, "condition");
        return condition.invoke(this.f53703toq).booleanValue() ? this : new C1308n(this.f53703toq, this.f53704zy, message, this.f7095n, this.f7096q);
    }
}
