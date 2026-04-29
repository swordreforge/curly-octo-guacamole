package com.android.thememanager.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.android.thememanager.R;
import com.android.thememanager.view.C2940t;
import com.android.thememanager.view.mcp;
import java.util.ArrayList;
import java.util.List;
import l05.InterfaceC6765n;
import l05.InterfaceC6768s;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import zy.InterfaceC7843t;

/* JADX INFO: compiled from: DraggableFrameLayout.kt */
/* JADX INFO: loaded from: classes2.dex */
public class DraggableFrameLayout extends FrameLayout implements mcp {

    /* JADX INFO: renamed from: g */
    @InterfaceC7395n
    private mcp f17252g;

    /* JADX INFO: renamed from: h */
    @InterfaceC7395n
    private List<View> f17253h;

    /* JADX INFO: renamed from: i */
    private boolean f17254i;

    /* JADX INFO: renamed from: k */
    private float f17255k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final C2940t.toq f17256n;

    /* JADX INFO: renamed from: p */
    @InterfaceC6765n
    protected boolean f17257p;

    /* JADX INFO: renamed from: q */
    private float f17258q;

    /* JADX INFO: renamed from: s */
    @InterfaceC7395n
    private int[] f17259s;

    /* JADX INFO: renamed from: y */
    @InterfaceC6765n
    protected boolean f17260y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6768s
    public DraggableFrameLayout(@InterfaceC7396q Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.d2ok.m23075h(context, "context");
    }

    public /* synthetic */ DraggableFrameLayout(Context context, AttributeSet attributeSet, int i2, kotlin.jvm.internal.ni7 ni7Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: k */
    private final void m10234k(mcp mcpVar) {
        this.f17252g = mcpVar;
        int[] iArrOc = mcpVar.oc();
        this.f17259s = iArrOc;
        if (iArrOc == null) {
            this.f17259s = new int[]{R.id.activity_drawer_handler_container};
            return;
        }
        kotlin.jvm.internal.d2ok.qrj(iArrOc);
        int[] iArr = new int[iArrOc.length + 2];
        this.f17259s = iArr;
        kotlin.jvm.internal.d2ok.qrj(iArr);
        iArr[0] = R.id.activity_drawer_handler_container;
        int[] iArr2 = this.f17259s;
        kotlin.jvm.internal.d2ok.qrj(iArr2);
        System.arraycopy(iArrOc, 0, iArr2, 2, iArrOc.length);
    }

    private final void toq() {
        int[] iArr = this.f17259s;
        if (iArr != null) {
            ArrayList arrayList = new ArrayList();
            for (int i2 : iArr) {
                View viewFindViewById = findViewById(i2);
                if (viewFindViewById != null && viewFindViewById.getVisibility() == 0) {
                    arrayList.add(viewFindViewById);
                }
            }
            this.f17253h = arrayList;
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f17256n.m10428q().kja0(true)) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@InterfaceC7396q MotionEvent ev) {
        kotlin.jvm.internal.d2ok.m23075h(ev, "ev");
        if (ev.getAction() == 0) {
            this.f17257p = false;
            this.f17260y = false;
            toq();
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override // com.android.thememanager.view.mcp
    public void eqxt() {
        mcp mcpVar = this.f17252g;
        if (mcpVar != null) {
            mcpVar.eqxt();
        }
    }

    @Override // com.android.thememanager.view.mcp
    public void f7l8() {
        mcp mcpVar = this.f17252g;
        if (mcpVar != null) {
            mcpVar.f7l8();
        }
    }

    @Override // com.android.thememanager.view.mcp
    public void fu4(boolean z2) {
        mcp mcpVar = this.f17252g;
        if (mcpVar != null) {
            mcpVar.fu4(z2);
        }
    }

    @InterfaceC7395n
    public final List<View> getMCanDragSlideView() {
        return this.f17253h;
    }

    @Override // com.android.thememanager.view.mcp
    @InterfaceC7843t
    @InterfaceC7395n
    public int[] oc() {
        return mcp.C2929k.toq(this);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@InterfaceC7396q MotionEvent ev) {
        kotlin.jvm.internal.d2ok.m23075h(ev, "ev");
        boolean zM10235q = m10235q(ev);
        this.f17257p = zM10235q;
        return zM10235q;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@InterfaceC7396q MotionEvent ev) {
        kotlin.jvm.internal.d2ok.m23075h(ev, "ev");
        if (ev.getAction() == 0) {
            this.f17255k = ev.getRawX();
            this.f17258q = ev.getRawY();
        }
        if (this.f17260y) {
            this.f17256n.m10428q().lvui(ev);
        }
        return this.f17257p;
    }

    /* JADX INFO: renamed from: q */
    protected final boolean m10235q(@InterfaceC7396q MotionEvent ev) {
        kotlin.jvm.internal.d2ok.m23075h(ev, "ev");
        if (!(this.f17256n.m10428q().kja0(false) ^ true ? this.f17256n.zy(ev) : false)) {
            return false;
        }
        this.f17260y = true;
        return this.f17256n.m10428q().lrht(ev);
    }

    @Override // com.android.thememanager.view.mcp
    public void qrj() {
        mcp mcpVar = this.f17252g;
        if (mcpVar != null) {
            mcpVar.qrj();
        }
    }

    public final void setExecuteContentAnim(boolean z2) {
        this.f17254i = z2;
    }

    public final boolean zy() {
        return this.f17254i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6768s
    public DraggableFrameLayout(@InterfaceC7396q Context context, @InterfaceC7395n AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.d2ok.m23075h(context, "context");
        this.f17256n = C2940t.m10424q(new C2940t(), this, 0.0f, 2, null);
        if (context instanceof mcp) {
            m10234k((mcp) context);
        }
    }
}
