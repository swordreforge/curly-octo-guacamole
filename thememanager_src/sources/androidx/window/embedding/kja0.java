package androidx.window.embedding;

import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import androidx.window.extensions.embedding.EmbeddingRule;
import androidx.window.extensions.embedding.SplitInfo;
import com.market.sdk.reflect.C4991s;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: EmbeddingCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001c\u0010\u000b\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0016¨\u0006\u000e"}, d2 = {"Landroidx/window/embedding/kja0;", "Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "", "Landroidx/window/extensions/embedding/EmbeddingRule;", "splitRules", "Lkotlin/was;", "k", "Ljava/util/function/Consumer;", "", "Landroidx/window/extensions/embedding/SplitInfo;", "consumer", "toq", C4991s.f28129n, "()V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
final class kja0 implements ActivityEmbeddingComponent {
    /* JADX INFO: renamed from: k */
    public void m5633k(@InterfaceC7396q Set<EmbeddingRule> splitRules) {
        d2ok.m23075h(splitRules, "splitRules");
    }

    public void toq(@InterfaceC7396q Consumer<List<SplitInfo>> consumer) {
        d2ok.m23075h(consumer, "consumer");
    }
}
