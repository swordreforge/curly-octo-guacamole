package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.C0655k;
import androidx.core.view.accessibility.ki;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import n7h.C7400k;
import zy.InterfaceC7830i;
import zy.uv6;

/* JADX INFO: renamed from: androidx.core.view.k */
/* JADX INFO: compiled from: AccessibilityDelegateCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class C0701k {
    private static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate mBridge;
    private final View.AccessibilityDelegate mOriginalDelegate;

    /* JADX INFO: renamed from: androidx.core.view.k$k */
    /* JADX INFO: compiled from: AccessibilityDelegateCompat.java */
    static final class k extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: k */
        final C0701k f4057k;

        k(C0701k c0701k) {
            this.f4057k = c0701k;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f4057k.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        @zy.hyr(16)
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            androidx.core.view.accessibility.t8r accessibilityNodeProvider = this.f4057k.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return (AccessibilityNodeProvider) accessibilityNodeProvider.m3088n();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f4057k.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            androidx.core.view.accessibility.ki kiVarR25n = androidx.core.view.accessibility.ki.r25n(accessibilityNodeInfo);
            kiVarR25n.ngy(C0683f.z4(view));
            kiVarR25n.b3e(C0683f.gbni(view));
            kiVarR25n.pc(C0683f.oc(view));
            kiVarR25n.e5(C0683f.y2(view));
            this.f4057k.onInitializeAccessibilityNodeInfo(view, kiVarR25n);
            kiVarR25n.m3048g(accessibilityNodeInfo.getText(), view);
            List<ki.C0656k> actionList = C0701k.getActionList(view);
            for (int i2 = 0; i2 < actionList.size(); i2++) {
                kiVarR25n.toq(actionList.get(i2));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f4057k.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f4057k.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            return this.f4057k.performAccessibilityAction(view, i2, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i2) {
            this.f4057k.sendAccessibilityEvent(view, i2);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f4057k.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.k$toq */
    /* JADX INFO: compiled from: AccessibilityDelegateCompat.java */
    @zy.hyr(16)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static AccessibilityNodeProvider m3347k(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        @InterfaceC7830i
        static boolean toq(View.AccessibilityDelegate accessibilityDelegate, View view, int i2, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i2, bundle);
        }
    }

    public C0701k() {
        this(DEFAULT_DELEGATE);
    }

    static List<ki.C0656k> getActionList(View view) {
        List<ki.C0656k> list = (List) view.getTag(C7400k.n.f42559o);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean isSpanStillValid(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrFu4 = androidx.core.view.accessibility.ki.fu4(view.createAccessibilityNodeInfo().getText());
            for (int i2 = 0; clickableSpanArrFu4 != null && i2 < clickableSpanArrFu4.length; i2++) {
                if (clickableSpan.equals(clickableSpanArrFu4[i2])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean performClickableSpanAction(int i2, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C7400k.n.f42557m);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i2)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!isSpanStillValid(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean dispatchPopulateAccessibilityEvent(@zy.lvui View view, @zy.lvui AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @zy.dd
    public androidx.core.view.accessibility.t8r getAccessibilityNodeProvider(@zy.lvui View view) {
        AccessibilityNodeProvider accessibilityNodeProviderM3347k = toq.m3347k(this.mOriginalDelegate, view);
        if (accessibilityNodeProviderM3347k != null) {
            return new androidx.core.view.accessibility.t8r(accessibilityNodeProviderM3347k);
        }
        return null;
    }

    View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void onInitializeAccessibilityEvent(@zy.lvui View view, @zy.lvui AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(@zy.lvui View view, @zy.lvui androidx.core.view.accessibility.ki kiVar) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, kiVar.nme());
    }

    public void onPopulateAccessibilityEvent(@zy.lvui View view, @zy.lvui AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(@zy.lvui ViewGroup viewGroup, @zy.lvui View view, @zy.lvui AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(@zy.lvui View view, int i2, @zy.dd Bundle bundle) {
        List<ki.C0656k> actionList = getActionList(view);
        boolean qVar = false;
        int i3 = 0;
        while (true) {
            if (i3 >= actionList.size()) {
                break;
            }
            ki.C0656k c0656k = actionList.get(i3);
            if (c0656k.toq() == i2) {
                qVar = c0656k.m3064q(view, bundle);
                break;
            }
            i3++;
        }
        if (!qVar) {
            qVar = toq.toq(this.mOriginalDelegate, view, i2, bundle);
        }
        return (qVar || i2 != C7400k.n.f42555k || bundle == null) ? qVar : performClickableSpanAction(bundle.getInt(C0655k.f3914g, -1), view);
    }

    public void sendAccessibilityEvent(@zy.lvui View view, int i2) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i2);
    }

    public void sendAccessibilityEventUnchecked(@zy.lvui View view, @zy.lvui AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public C0701k(@zy.lvui View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new k(this);
    }
}
