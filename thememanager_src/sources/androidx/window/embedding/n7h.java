package androidx.window.embedding;

import android.annotation.SuppressLint;
import androidx.window.core.InterfaceC1310q;
import androidx.window.embedding.x2;
import androidx.window.extensions.embedding.SplitInfo;
import com.market.sdk.reflect.C4991s;
import java.util.List;
import java.util.function.Consumer;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: EmbeddingTranslatingCallback.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/window/embedding/n7h;", "Ljava/util/function/Consumer;", "", "Landroidx/window/extensions/embedding/SplitInfo;", "splitInfoList", "Lkotlin/was;", "k", "Landroidx/window/embedding/x2$k;", "Landroidx/window/embedding/x2$k;", "callback", "Landroidx/window/embedding/s;", "toq", "Landroidx/window/embedding/s;", "adapter", C4991s.f28129n, "(Landroidx/window/embedding/x2$k;Landroidx/window/embedding/s;)V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
@SuppressLint({"NewApi"})
@InterfaceC1310q
public final class n7h implements Consumer<List<? extends SplitInfo>> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final x2.InterfaceC1324k f7121k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final C1322s f53723toq;

    public n7h(@InterfaceC7396q x2.InterfaceC1324k callback, @InterfaceC7396q C1322s adapter) {
        d2ok.m23075h(callback, "callback");
        d2ok.m23075h(adapter, "adapter");
        this.f7121k = callback;
        this.f53723toq = adapter;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void accept(@InterfaceC7396q List<? extends SplitInfo> splitInfoList) {
        d2ok.m23075h(splitInfoList, "splitInfoList");
        this.f7121k.mo5625k(this.f53723toq.m5647s(splitInfoList));
    }
}
