package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C0683f;
import androidx.core.view.C0701k;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.recyclerview.widget.t */
/* JADX INFO: compiled from: RecyclerViewAccessibilityDelegate.java */
/* JADX INFO: loaded from: classes.dex */
public class C1113t extends C0701k {

    /* JADX INFO: renamed from: k */
    final RecyclerView f6100k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final k f52301toq;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.t$k */
    /* JADX INFO: compiled from: RecyclerViewAccessibilityDelegate.java */
    public static class k extends C0701k {

        /* JADX INFO: renamed from: k */
        final C1113t f6101k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private Map<View, C0701k> f52302toq = new WeakHashMap();

        public k(@zy.lvui C1113t c1113t) {
            this.f6101k = c1113t;
        }

        @Override // androidx.core.view.C0701k
        public boolean dispatchPopulateAccessibilityEvent(@zy.lvui View view, @zy.lvui AccessibilityEvent accessibilityEvent) {
            C0701k c0701k = this.f52302toq.get(view);
            return c0701k != null ? c0701k.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // androidx.core.view.C0701k
        @zy.dd
        public androidx.core.view.accessibility.t8r getAccessibilityNodeProvider(@zy.lvui View view) {
            C0701k c0701k = this.f52302toq.get(view);
            return c0701k != null ? c0701k.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
        }

        /* JADX INFO: renamed from: k */
        C0701k m5119k(View view) {
            return this.f52302toq.remove(view);
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityEvent(@zy.lvui View view, @zy.lvui AccessibilityEvent accessibilityEvent) {
            C0701k c0701k = this.f52302toq.get(view);
            if (c0701k != null) {
                c0701k.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityNodeInfo(View view, androidx.core.view.accessibility.ki kiVar) {
            if (this.f6101k.toq() || this.f6101k.f6100k.getLayoutManager() == null) {
                super.onInitializeAccessibilityNodeInfo(view, kiVar);
                return;
            }
            this.f6101k.f6100k.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, kiVar);
            C0701k c0701k = this.f52302toq.get(view);
            if (c0701k != null) {
                c0701k.onInitializeAccessibilityNodeInfo(view, kiVar);
            } else {
                super.onInitializeAccessibilityNodeInfo(view, kiVar);
            }
        }

        @Override // androidx.core.view.C0701k
        public void onPopulateAccessibilityEvent(@zy.lvui View view, @zy.lvui AccessibilityEvent accessibilityEvent) {
            C0701k c0701k = this.f52302toq.get(view);
            if (c0701k != null) {
                c0701k.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C0701k
        public boolean onRequestSendAccessibilityEvent(@zy.lvui ViewGroup viewGroup, @zy.lvui View view, @zy.lvui AccessibilityEvent accessibilityEvent) {
            C0701k c0701k = this.f52302toq.get(viewGroup);
            return c0701k != null ? c0701k.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.C0701k
        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            if (this.f6101k.toq() || this.f6101k.f6100k.getLayoutManager() == null) {
                return super.performAccessibilityAction(view, i2, bundle);
            }
            C0701k c0701k = this.f52302toq.get(view);
            if (c0701k != null) {
                if (c0701k.performAccessibilityAction(view, i2, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i2, bundle)) {
                return true;
            }
            return this.f6101k.f6100k.getLayoutManager().performAccessibilityActionForItem(view, i2, bundle);
        }

        @Override // androidx.core.view.C0701k
        public void sendAccessibilityEvent(@zy.lvui View view, int i2) {
            C0701k c0701k = this.f52302toq.get(view);
            if (c0701k != null) {
                c0701k.sendAccessibilityEvent(view, i2);
            } else {
                super.sendAccessibilityEvent(view, i2);
            }
        }

        @Override // androidx.core.view.C0701k
        public void sendAccessibilityEventUnchecked(@zy.lvui View view, @zy.lvui AccessibilityEvent accessibilityEvent) {
            C0701k c0701k = this.f52302toq.get(view);
            if (c0701k != null) {
                c0701k.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }

        void toq(View view) {
            C0701k c0701kA9 = C0683f.a9(view);
            if (c0701kA9 == null || c0701kA9 == this) {
                return;
            }
            this.f52302toq.put(view, c0701kA9);
        }
    }

    public C1113t(@zy.lvui RecyclerView recyclerView) {
        this.f6100k = recyclerView;
        C0701k c0701kMo4722k = mo4722k();
        if (c0701kMo4722k == null || !(c0701kMo4722k instanceof k)) {
            this.f52301toq = new k(this);
        } else {
            this.f52301toq = (k) c0701kMo4722k;
        }
    }

    @zy.lvui
    /* JADX INFO: renamed from: k */
    public C0701k mo4722k() {
        return this.f52301toq;
    }

    @Override // androidx.core.view.C0701k
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || toq()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.C0701k
    public void onInitializeAccessibilityNodeInfo(View view, androidx.core.view.accessibility.ki kiVar) {
        super.onInitializeAccessibilityNodeInfo(view, kiVar);
        if (toq() || this.f6100k.getLayoutManager() == null) {
            return;
        }
        this.f6100k.getLayoutManager().onInitializeAccessibilityNodeInfo(kiVar);
    }

    @Override // androidx.core.view.C0701k
    public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
        if (super.performAccessibilityAction(view, i2, bundle)) {
            return true;
        }
        if (toq() || this.f6100k.getLayoutManager() == null) {
            return false;
        }
        return this.f6100k.getLayoutManager().performAccessibilityAction(i2, bundle);
    }

    boolean toq() {
        return this.f6100k.hasPendingAdapterUpdates();
    }
}
