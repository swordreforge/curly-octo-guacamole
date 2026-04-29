package androidx.window.embedding;

import android.util.Log;
import androidx.window.core.InterfaceC1310q;
import androidx.window.embedding.x2;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import com.market.sdk.reflect.C4991s;
import java.util.Set;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: EmbeddingCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0006B\u0017\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011B\t\b\u0016¢\u0006\u0004\b\u0010\u0010\u0012J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u0014"}, d2 = {"Landroidx/window/embedding/ld6;", "Landroidx/window/embedding/x2;", "", "Landroidx/window/embedding/qrj;", "rules", "Lkotlin/was;", "k", "Landroidx/window/embedding/x2$k;", "embeddingCallback", "toq", "Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "embeddingExtension", "Landroidx/window/embedding/s;", "Landroidx/window/embedding/s;", "adapter", C4991s.f28129n, "(Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;Landroidx/window/embedding/s;)V", "()V", "zy", "window_release"}, m22787k = 1, mv = {1, 6, 0})
@InterfaceC1310q
public final class ld6 implements x2 {

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private static final String f7117n = "EmbeddingCompat";

    /* JADX INFO: renamed from: q */
    public static final boolean f7118q = true;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    public static final C1318k f53721zy = new C1318k(null);

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final ActivityEmbeddingComponent f7119k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final C1322s f53722toq;

    /* JADX INFO: renamed from: androidx.window.embedding.ld6$k */
    /* JADX INFO: compiled from: EmbeddingCompat.kt */
    @d3(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/window/embedding/ld6$k;", "", "", "toq", "()Ljava/lang/Integer;", "", "zy", "Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "k", "DEBUG", com.market.sdk.reflect.toq.f68929toq, "", "TAG", "Ljava/lang/String;", C4991s.f28129n, "()V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C1318k {
        private C1318k() {
        }

        public /* synthetic */ C1318k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final ActivityEmbeddingComponent m5635k() {
            if (!zy()) {
                return new kja0();
            }
            ActivityEmbeddingComponent activityEmbeddingComponent = WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent();
            return activityEmbeddingComponent == null ? new kja0() : activityEmbeddingComponent;
        }

        @InterfaceC7395n
        public final Integer toq() {
            try {
                return Integer.valueOf(WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel());
            } catch (NoClassDefFoundError unused) {
                Log.d(ld6.f7117n, "Embedding extension version not found");
                return null;
            } catch (UnsupportedOperationException unused2) {
                Log.d(ld6.f7117n, "Stub Extension");
                return null;
            }
        }

        public final boolean zy() {
            try {
                return WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent() != null;
            } catch (NoClassDefFoundError unused) {
                Log.d(ld6.f7117n, "Embedding extension version not found");
                return false;
            } catch (UnsupportedOperationException unused2) {
                Log.d(ld6.f7117n, "Stub Extension");
                return false;
            }
        }
    }

    public ld6(@InterfaceC7396q ActivityEmbeddingComponent embeddingExtension, @InterfaceC7396q C1322s adapter) {
        d2ok.m23075h(embeddingExtension, "embeddingExtension");
        d2ok.m23075h(adapter, "adapter");
        this.f7119k = embeddingExtension;
        this.f53722toq = adapter;
    }

    @Override // androidx.window.embedding.x2
    /* JADX INFO: renamed from: k */
    public void mo5634k(@InterfaceC7396q Set<? extends qrj> rules) {
        d2ok.m23075h(rules, "rules");
        this.f7119k.setEmbeddingRules(this.f53722toq.m5646p(rules));
    }

    @Override // androidx.window.embedding.x2
    public void toq(@InterfaceC7396q x2.InterfaceC1324k embeddingCallback) {
        d2ok.m23075h(embeddingCallback, "embeddingCallback");
        this.f7119k.setSplitInfoCallback(new n7h(embeddingCallback, this.f53722toq));
    }

    public ld6() {
        this(f53721zy.m5635k(), new C1322s());
    }
}
