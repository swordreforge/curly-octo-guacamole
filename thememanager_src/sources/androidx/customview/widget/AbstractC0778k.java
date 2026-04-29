package androidx.customview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.n7h;
import androidx.core.view.C0683f;
import androidx.core.view.C0701k;
import androidx.core.view.accessibility.C0654i;
import androidx.core.view.accessibility.ki;
import androidx.core.view.accessibility.t8r;
import androidx.customview.widget.toq;
import java.util.ArrayList;
import java.util.List;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: androidx.customview.widget.k */
/* JADX INFO: compiled from: ExploreByTouchHelper.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0778k extends C0701k {
    private static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private static final Rect INVALID_PARENT_BOUNDS = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final toq.InterfaceC0780k<ki> NODE_ADAPTER = new k();
    private static final toq.InterfaceC7876toq<n7h<ki>, ki> SPARSE_VALUES_ADAPTER = new toq();
    private final View mHost;
    private final AccessibilityManager mManager;
    private zy mNodeProvider;
    private final Rect mTempScreenRect = new Rect();
    private final Rect mTempParentRect = new Rect();
    private final Rect mTempVisibleRect = new Rect();
    private final int[] mTempGlobalRect = new int[2];
    int mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
    int mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
    private int mHoveredVirtualViewId = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: androidx.customview.widget.k$k */
    /* JADX INFO: compiled from: ExploreByTouchHelper.java */
    class k implements toq.InterfaceC0780k<ki> {
        k() {
        }

        @Override // androidx.customview.widget.toq.InterfaceC0780k
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void mo3732k(ki kiVar, Rect rect) {
            kiVar.t8r(rect);
        }
    }

    /* JADX INFO: renamed from: androidx.customview.widget.k$toq */
    /* JADX INFO: compiled from: ExploreByTouchHelper.java */
    class toq implements toq.InterfaceC7876toq<n7h<ki>, ki> {
        toq() {
        }

        @Override // androidx.customview.widget.toq.InterfaceC7876toq
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public int toq(n7h<ki> n7hVar) {
            return n7hVar.a9();
        }

        @Override // androidx.customview.widget.toq.InterfaceC7876toq
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public ki mo3733k(n7h<ki> n7hVar, int i2) {
            return n7hVar.fti(i2);
        }
    }

    /* JADX INFO: renamed from: androidx.customview.widget.k$zy */
    /* JADX INFO: compiled from: ExploreByTouchHelper.java */
    private class zy extends t8r {
        zy() {
        }

        @Override // androidx.core.view.accessibility.t8r
        /* JADX INFO: renamed from: g */
        public boolean mo3086g(int i2, int i3, Bundle bundle) {
            return AbstractC0778k.this.performAction(i2, i3, bundle);
        }

        @Override // androidx.core.view.accessibility.t8r
        /* JADX INFO: renamed from: q */
        public ki mo3089q(int i2) {
            int i3 = i2 == 2 ? AbstractC0778k.this.mAccessibilityFocusedVirtualViewId : AbstractC0778k.this.mKeyboardFocusedVirtualViewId;
            if (i3 == Integer.MIN_VALUE) {
                return null;
            }
            return toq(i3);
        }

        @Override // androidx.core.view.accessibility.t8r
        public ki toq(int i2) {
            return ki.qkj8(AbstractC0778k.this.obtainAccessibilityNodeInfo(i2));
        }
    }

    public AbstractC0778k(@lvui View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.mHost = view;
        this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (C0683f.m3157c(view) == 0) {
            C0683f.o05(view, 1);
        }
    }

    private boolean clearAccessibilityFocus(int i2) {
        if (this.mAccessibilityFocusedVirtualViewId != i2) {
            return false;
        }
        this.mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.mHost.invalidate();
        sendEventForVirtualView(i2, 65536);
        return true;
    }

    private boolean clickKeyboardFocusedVirtualView() {
        int i2 = this.mKeyboardFocusedVirtualViewId;
        return i2 != Integer.MIN_VALUE && onPerformActionForVirtualView(i2, 16, null);
    }

    private AccessibilityEvent createEvent(int i2, int i3) {
        return i2 != -1 ? createEventForChild(i2, i3) : createEventForHost(i3);
    }

    private AccessibilityEvent createEventForChild(int i2, int i3) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i3);
        ki kiVarObtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i2);
        accessibilityEventObtain.getText().add(kiVarObtainAccessibilityNodeInfo.m3047f());
        accessibilityEventObtain.setContentDescription(kiVarObtainAccessibilityNodeInfo.wvg());
        accessibilityEventObtain.setScrollable(kiVarObtainAccessibilityNodeInfo.gyi());
        accessibilityEventObtain.setPassword(kiVarObtainAccessibilityNodeInfo.y2());
        accessibilityEventObtain.setEnabled(kiVarObtainAccessibilityNodeInfo.m3061x());
        accessibilityEventObtain.setChecked(kiVarObtainAccessibilityNodeInfo.m3044b());
        onPopulateEventForVirtualView(i2, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(kiVarObtainAccessibilityNodeInfo.ni7());
        C0654i.vyq(accessibilityEventObtain, this.mHost, i2);
        accessibilityEventObtain.setPackageName(this.mHost.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    private AccessibilityEvent createEventForHost(int i2) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        this.mHost.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    @lvui
    private ki createNodeForChild(int i2) {
        ki kiVarM3038d = ki.m3038d();
        kiVarM3038d.bz2(true);
        kiVarM3038d.jz5(true);
        kiVarM3038d.sok(DEFAULT_CLASS_NAME);
        Rect rect = INVALID_PARENT_BOUNDS;
        kiVarM3038d.ltg8(rect);
        kiVarM3038d.r8s8(rect);
        kiVarM3038d.ij(this.mHost);
        onPopulateNodeForVirtualView(i2, kiVarM3038d);
        if (kiVarM3038d.m3047f() == null && kiVarM3038d.wvg() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        kiVarM3038d.t8r(this.mTempParentRect);
        if (this.mTempParentRect.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iM3049h = kiVarM3038d.m3049h();
        if ((iM3049h & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iM3049h & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        kiVarM3038d.ebn(this.mHost.getContext().getPackageName());
        kiVarM3038d.ga(this.mHost, i2);
        if (this.mAccessibilityFocusedVirtualViewId == i2) {
            kiVarM3038d.zsr0(true);
            kiVarM3038d.m3052k(128);
        } else {
            kiVarM3038d.zsr0(false);
            kiVarM3038d.m3052k(64);
        }
        boolean z2 = this.mKeyboardFocusedVirtualViewId == i2;
        if (z2) {
            kiVarM3038d.m3052k(2);
        } else if (kiVarM3038d.ch()) {
            kiVarM3038d.m3052k(1);
        }
        kiVarM3038d.ktq(z2);
        this.mHost.getLocationOnScreen(this.mTempGlobalRect);
        kiVarM3038d.m3050i(this.mTempScreenRect);
        if (this.mTempScreenRect.equals(rect)) {
            kiVarM3038d.t8r(this.mTempScreenRect);
            if (kiVarM3038d.f50694toq != -1) {
                ki kiVarM3038d2 = ki.m3038d();
                for (int i3 = kiVarM3038d.f50694toq; i3 != -1; i3 = kiVarM3038d2.f50694toq) {
                    kiVarM3038d2.nsb(this.mHost, -1);
                    kiVarM3038d2.ltg8(INVALID_PARENT_BOUNDS);
                    onPopulateNodeForVirtualView(i3, kiVarM3038d2);
                    kiVarM3038d2.t8r(this.mTempParentRect);
                    Rect rect2 = this.mTempScreenRect;
                    Rect rect3 = this.mTempParentRect;
                    rect2.offset(rect3.left, rect3.top);
                }
                kiVarM3038d2.tfm();
            }
            this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
        }
        if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
            this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
            if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                kiVarM3038d.r8s8(this.mTempScreenRect);
                if (isVisibleToUser(this.mTempScreenRect)) {
                    kiVarM3038d.b8(true);
                }
            }
        }
        return kiVarM3038d;
    }

    @lvui
    private ki createNodeForHost() {
        ki kiVarMu = ki.mu(this.mHost);
        C0683f.jz5(this.mHost, kiVarMu);
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (kiVarMu.zurt() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            kiVarMu.m3056q(this.mHost, ((Integer) arrayList.get(i2)).intValue());
        }
        return kiVarMu;
    }

    private n7h<ki> getAllNodes() {
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        n7h<ki> n7hVar = new n7h<>();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            n7hVar.fn3e(arrayList.get(i2).intValue(), createNodeForChild(arrayList.get(i2).intValue()));
        }
        return n7hVar;
    }

    private void getBoundsInParent(int i2, Rect rect) {
        obtainAccessibilityNodeInfo(i2).t8r(rect);
    }

    private static Rect guessPreviouslyFocusedRect(@lvui View view, int i2, @lvui Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i2 == 17) {
            rect.set(width, 0, width, height);
        } else if (i2 == 33) {
            rect.set(0, height, width, height);
        } else if (i2 == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (i2 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    private boolean isVisibleToUser(Rect rect) {
        if (rect == null || rect.isEmpty() || this.mHost.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.mHost.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int keyToDirection(int i2) {
        if (i2 == 19) {
            return 33;
        }
        if (i2 != 21) {
            return i2 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean moveFocus(int i2, @dd Rect rect) {
        ki kiVar;
        n7h<ki> allNodes = getAllNodes();
        int i3 = this.mKeyboardFocusedVirtualViewId;
        ki kiVarN7h = i3 == Integer.MIN_VALUE ? null : allNodes.n7h(i3);
        if (i2 == 1 || i2 == 2) {
            kiVar = (ki) androidx.customview.widget.toq.m3761q(allNodes, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, kiVarN7h, i2, C0683f.m3159e(this.mHost) == 1, false);
        } else {
            if (i2 != 17 && i2 != 33 && i2 != 66 && i2 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i4 = this.mKeyboardFocusedVirtualViewId;
            if (i4 != Integer.MIN_VALUE) {
                getBoundsInParent(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                guessPreviouslyFocusedRect(this.mHost, i2, rect2);
            }
            kiVar = (ki) androidx.customview.widget.toq.zy(allNodes, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, kiVarN7h, rect2, i2);
        }
        return requestKeyboardFocusForVirtualView(kiVar != null ? allNodes.m852i(allNodes.ki(kiVar)) : Integer.MIN_VALUE);
    }

    private boolean performActionForChild(int i2, int i3, Bundle bundle) {
        return i3 != 1 ? i3 != 2 ? i3 != 64 ? i3 != 128 ? onPerformActionForVirtualView(i2, i3, bundle) : clearAccessibilityFocus(i2) : requestAccessibilityFocus(i2) : clearKeyboardFocusForVirtualView(i2) : requestKeyboardFocusForVirtualView(i2);
    }

    private boolean performActionForHost(int i2, Bundle bundle) {
        return C0683f.bek6(this.mHost, i2, bundle);
    }

    private boolean requestAccessibilityFocus(int i2) {
        int i3;
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled() || (i3 = this.mAccessibilityFocusedVirtualViewId) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            clearAccessibilityFocus(i3);
        }
        this.mAccessibilityFocusedVirtualViewId = i2;
        this.mHost.invalidate();
        sendEventForVirtualView(i2, 32768);
        return true;
    }

    private void updateHoveredVirtualView(int i2) {
        int i3 = this.mHoveredVirtualViewId;
        if (i3 == i2) {
            return;
        }
        this.mHoveredVirtualViewId = i2;
        sendEventForVirtualView(i2, 128);
        sendEventForVirtualView(i3, 256);
    }

    public final boolean clearKeyboardFocusForVirtualView(int i2) {
        if (this.mKeyboardFocusedVirtualViewId != i2) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
        onVirtualViewKeyboardFocusChanged(i2, false);
        sendEventForVirtualView(i2, 8);
        return true;
    }

    public final boolean dispatchHoverEvent(@lvui MotionEvent motionEvent) {
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
            updateHoveredVirtualView(virtualViewAt);
            return virtualViewAt != Integer.MIN_VALUE;
        }
        if (action != 10 || this.mHoveredVirtualViewId == Integer.MIN_VALUE) {
            return false;
        }
        updateHoveredVirtualView(Integer.MIN_VALUE);
        return true;
    }

    public final boolean dispatchKeyEvent(@lvui KeyEvent keyEvent) {
        int i2 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return moveFocus(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return moveFocus(1, null);
            }
            return false;
        }
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    int iKeyToDirection = keyToDirection(keyCode);
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z2 = false;
                    while (i2 < repeatCount && moveFocus(iKeyToDirection, null)) {
                        i2++;
                        z2 = true;
                    }
                    return z2;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        clickKeyboardFocusedVirtualView();
        return true;
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    @Override // androidx.core.view.C0701k
    public t8r getAccessibilityNodeProvider(View view) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new zy();
        }
        return this.mNodeProvider;
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.mKeyboardFocusedVirtualViewId;
    }

    protected abstract int getVirtualViewAt(float f2, float f3);

    protected abstract void getVisibleVirtualViews(List<Integer> list);

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i2) {
        invalidateVirtualView(i2, 0);
    }

    @lvui
    ki obtainAccessibilityNodeInfo(int i2) {
        return i2 == -1 ? createNodeForHost() : createNodeForChild(i2);
    }

    public final void onFocusChanged(boolean z2, int i2, @dd Rect rect) {
        int i3 = this.mKeyboardFocusedVirtualViewId;
        if (i3 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i3);
        }
        if (z2) {
            moveFocus(i2, rect);
        }
    }

    @Override // androidx.core.view.C0701k
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    @Override // androidx.core.view.C0701k
    public void onInitializeAccessibilityNodeInfo(View view, ki kiVar) {
        super.onInitializeAccessibilityNodeInfo(view, kiVar);
        onPopulateNodeForHost(kiVar);
    }

    protected abstract boolean onPerformActionForVirtualView(int i2, int i3, @dd Bundle bundle);

    protected void onPopulateEventForHost(@lvui AccessibilityEvent accessibilityEvent) {
    }

    protected void onPopulateEventForVirtualView(int i2, @lvui AccessibilityEvent accessibilityEvent) {
    }

    protected void onPopulateNodeForHost(@lvui ki kiVar) {
    }

    protected abstract void onPopulateNodeForVirtualView(int i2, @lvui ki kiVar);

    protected void onVirtualViewKeyboardFocusChanged(int i2, boolean z2) {
    }

    boolean performAction(int i2, int i3, Bundle bundle) {
        return i2 != -1 ? performActionForChild(i2, i3, bundle) : performActionForHost(i3, bundle);
    }

    public final boolean requestKeyboardFocusForVirtualView(int i2) {
        int i3;
        if ((!this.mHost.isFocused() && !this.mHost.requestFocus()) || (i3 = this.mKeyboardFocusedVirtualViewId) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i3);
        }
        if (i2 == Integer.MIN_VALUE) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = i2;
        onVirtualViewKeyboardFocusChanged(i2, true);
        sendEventForVirtualView(i2, 8);
        return true;
    }

    public final boolean sendEventForVirtualView(int i2, int i3) {
        ViewParent parent;
        if (i2 == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.mHost, createEvent(i2, i3));
    }

    public final void invalidateVirtualView(int i2, int i3) {
        ViewParent parent;
        if (i2 == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(i2, 2048);
        androidx.core.view.accessibility.toq.m3095s(accessibilityEventCreateEvent, i3);
        parent.requestSendAccessibilityEvent(this.mHost, accessibilityEventCreateEvent);
    }
}
