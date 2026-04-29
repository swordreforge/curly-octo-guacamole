package miuix.nestedheader.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.core.view.ncyb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import miuix.animation.Folme;
import miuix.animation.base.AnimConfig;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;
import miuix.core.util.C7084p;
import miuix.device.C7106k;
import miuix.internal.util.C7164n;
import miuix.nestedheader.widget.NestedScrollingLayout;
import miuix.view.x2;
import wwp.C7745k;
import xzl.toq;
import zy.dd;
import zy.hyr;

/* JADX INFO: loaded from: classes3.dex */
public class NestedHeaderLayout extends NestedScrollingLayout implements miuix.view.toq {
    private static final String ls9 = "NestedHeaderLayout";
    private int ac;
    private int ad;
    private boolean aj;
    private int am;
    private boolean ar;
    private int ax;
    private float ay;
    private x2 az;
    private boolean ba;
    private float bc;
    private View bd;
    private boolean be;
    private int bq;
    private Drawable bs;
    private float bu;
    private int cw14;
    private boolean d1cy;
    private int dy;
    private boolean ei;
    private int hp;
    private Drawable k0;
    private int k6e;
    private int mjvl;
    private int ndjo;
    private int q7k9;
    private int s8y;
    private View sk1t;

    @dd
    private View tgs;
    private int th6;
    private View tlhn;
    private String ut;
    private int vb6;

    @dd
    private View w97r;
    private NestedScrollingLayout.toq wh6;
    private Rect wra;
    private int xhv;
    private int xk5;
    private boolean xqx;
    private int xy8;

    @dd
    private View yl25;
    private InterfaceC7204n zm;
    private View zmmu;
    private boolean zr5t;
    private boolean zsl;

    /* JADX INFO: renamed from: miuix.nestedheader.widget.NestedHeaderLayout$k */
    class ViewOnLayoutChangeListenerC7203k implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC7203k() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            int i10 = (i5 - i3) - (i9 - i7);
            if (i10 != 0) {
                NestedHeaderLayout nestedHeaderLayout = NestedHeaderLayout.this;
                if (nestedHeaderLayout.f40692y) {
                    nestedHeaderLayout.bo(true, false, false, false);
                    NestedHeaderLayout nestedHeaderLayout2 = NestedHeaderLayout.this;
                    nestedHeaderLayout2.m26143u(Math.min(nestedHeaderLayout2.getScrollingProgress() + i10, -NestedHeaderLayout.this.hp));
                }
            }
        }
    }

    /* JADX INFO: renamed from: miuix.nestedheader.widget.NestedHeaderLayout$n */
    public interface InterfaceC7204n {
        /* JADX INFO: renamed from: g */
        default void m26144g(boolean z2) {
        }

        /* JADX INFO: renamed from: k */
        default void m26145k(View view) {
        }

        /* JADX INFO: renamed from: n */
        default void m26146n(int i2, boolean z2, int i3, float f2) {
        }

        /* JADX INFO: renamed from: q */
        default void m26147q(View view) {
        }

        default void toq(View view) {
        }

        default void zy(View view) {
        }
    }

    /* JADX INFO: renamed from: miuix.nestedheader.widget.NestedHeaderLayout$q */
    class C7205q extends TransitionListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f40664k;

        C7205q(String str) {
            this.f40664k = str;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            UpdateInfo updateInfoFindByName = UpdateInfo.findByName(collection, this.f40664k);
            if (updateInfoFindByName == null || !NestedHeaderLayout.this.bf2(this.f40664k)) {
                return;
            }
            NestedHeaderLayout.this.lv5(updateInfoFindByName.getIntValue());
        }
    }

    class toq implements x2.InterfaceC7388k {
        toq() {
        }

        @Override // miuix.view.x2.InterfaceC7388k
        /* JADX INFO: renamed from: k */
        public void mo25107k(x2 x2Var) {
            boolean zM25951q = C7164n.m25951q(NestedHeaderLayout.this.getContext(), R.attr.isLightTheme, true);
            int[] iArrF7l8 = x2.f7l8(NestedHeaderLayout.this.getContext(), NestedHeaderLayout.this.bs, zM25951q ? C7745k.k.toq.f98862toq : C7745k.k.C8141k.f98860toq);
            int[] iArr = zM25951q ? C7745k.toq.C8142toq.f45385k : C7745k.toq.k.f45384k;
            if (NestedHeaderLayout.this.ar) {
                x2Var.x2(new int[]{iArrF7l8[0]}, new int[]{iArr[0]}, 66);
            } else {
                x2Var.x2(iArrF7l8, iArr, 66);
            }
        }

        @Override // miuix.view.x2.InterfaceC7388k
        public void toq(boolean z2) {
            if (z2) {
                NestedHeaderLayout.this.k0 = new ColorDrawable(0);
            }
        }

        @Override // miuix.view.x2.InterfaceC7388k
        public void zy(boolean z2) {
            if (z2) {
                NestedHeaderLayout.this.tlhn.setBackground(NestedHeaderLayout.this.k0);
            } else {
                NestedHeaderLayout.this.tlhn.setBackground(NestedHeaderLayout.this.bs);
            }
            if (NestedHeaderLayout.this.zm != null) {
                NestedHeaderLayout.this.zm.m26144g(z2);
            }
        }
    }

    class zy implements NestedScrollingLayout.toq {

        /* JADX INFO: renamed from: miuix.nestedheader.widget.NestedHeaderLayout$zy$k */
        class C7206k extends TransitionListener {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ String f40667k;

            C7206k(String str) {
                this.f40667k = str;
            }

            @Override // miuix.animation.listener.TransitionListener
            public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
                UpdateInfo updateInfoFindByName = UpdateInfo.findByName(collection, this.f40667k);
                if (updateInfoFindByName == null || !NestedHeaderLayout.this.bf2(this.f40667k)) {
                    return;
                }
                NestedHeaderLayout.this.nmn5(updateInfoFindByName.getIntValue());
            }
        }

        zy() {
        }

        private void f7l8(boolean z2) {
            NestedHeaderLayout.this.d1cy = z2;
            if (NestedHeaderLayout.this.d1cy) {
                m26148g();
            }
        }

        /* JADX INFO: renamed from: g */
        private void m26148g() {
            NestedHeaderLayout.this.ut = Long.toString(SystemClock.elapsedRealtime());
        }

        /* JADX INFO: renamed from: n */
        private void m26149n() {
            int scrollingFrom = NestedHeaderLayout.this.getScrollingFrom();
            int scrollingTo = NestedHeaderLayout.this.getScrollingTo();
            NestedHeaderLayout nestedHeaderLayout = NestedHeaderLayout.this;
            int i2 = nestedHeaderLayout.f40675h + scrollingFrom;
            int scrollingProgress = nestedHeaderLayout.getScrollingProgress();
            if (scrollingProgress == 0 || scrollingProgress >= scrollingTo || scrollingProgress <= scrollingFrom) {
                if (NestedHeaderLayout.this.f40682o > 0) {
                    m26150q();
                    return;
                }
                return;
            }
            if (NestedHeaderLayout.this.be && scrollingProgress < i2 * 0.33f) {
                scrollingTo = (NestedHeaderLayout.this.y9n() || scrollingProgress >= i2) ? NestedHeaderLayout.this.getHeaderCloseProgress() : NestedHeaderLayout.this.getScrollingFrom();
            } else if (scrollingProgress < scrollingTo * 0.5f) {
                if (!NestedHeaderLayout.this.be && scrollingProgress < 0) {
                    return;
                } else {
                    scrollingTo = 0;
                }
            }
            NestedHeaderLayout.this.m26135j(scrollingTo);
        }

        /* JADX INFO: renamed from: q */
        private void m26150q() {
            String string = Long.toString(SystemClock.elapsedRealtime());
            NestedHeaderLayout.this.ut = string;
            Folme.useValue(new Object[0]).setTo(string, Integer.valueOf(NestedHeaderLayout.this.f40682o)).to(string, 0, new AnimConfig().setEase(-2, 1.0f, 0.4f).addListeners(new C7206k(string)));
        }

        @Override // miuix.nestedheader.widget.NestedScrollingLayout.toq
        /* JADX INFO: renamed from: k */
        public void mo26128k(int i2) {
            if (i2 == 0) {
                f7l8(false);
            }
        }

        @Override // miuix.nestedheader.widget.NestedScrollingLayout.toq
        public void toq(int i2) {
            if (NestedHeaderLayout.this.xqx) {
                m26149n();
            }
        }

        @Override // miuix.nestedheader.widget.NestedScrollingLayout.toq
        public void zy(int i2) {
            if (i2 == 0) {
                f7l8(true);
            } else {
                m26148g();
            }
        }
    }

    public NestedHeaderLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    private List<View> m26131a(View view) {
        return a98o(view, this.ad == toq.C7769n.f100188hyr || this.zmmu != null);
    }

    private List<View> a98o(View view, boolean z2) {
        if (view == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!z2) {
            arrayList.add(view);
            return arrayList;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                arrayList.add(viewGroup.getChildAt(i2));
            }
        } else {
            arrayList.add(view);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean bf2(String str) {
        return (this.d1cy || !this.ut.equals(str) || getAcceptedNestedFlingInConsumedProgress()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bo(boolean z2, boolean z3, boolean z5, boolean z6) {
        boolean z7;
        int i2;
        boolean z8;
        boolean z9;
        int i3 = 0;
        int i4 = this.f40681n ? (-(this.f40675h + (getClipToPadding() ? 0 : getPaddingTop()))) + 0 : 0;
        this.hp = 0;
        View view = this.w97r;
        if (view == null || view.getVisibility() == 8) {
            z7 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.w97r.getLayoutParams();
            this.dy = marginLayoutParams.bottomMargin;
            this.vb6 = marginLayoutParams.topMargin;
            int measuredHeight = this.w97r.getMeasuredHeight();
            this.cw14 = measuredHeight;
            this.hp = measuredHeight + this.vb6 + this.dy;
            View view2 = this.zmmu;
            if (view2 != null) {
                this.s8y = ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).bottomMargin;
            }
            i4 += (int) ((-this.hp) + this.ay);
            z7 = true;
        }
        this.q7k9 = 0;
        View view3 = this.tgs;
        if (view3 == null || view3.getVisibility() == 8) {
            i2 = i4;
            z8 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.tgs.getLayoutParams();
            int measuredHeight2 = this.tgs.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            this.q7k9 = measuredHeight2;
            if (this.f40681n) {
                i4 += -measuredHeight2;
            }
            i2 = i4;
            z8 = true;
        }
        View view4 = this.yl25;
        if (view4 == null || view4.getVisibility() == 8) {
            z9 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.yl25.getLayoutParams();
            this.k6e = marginLayoutParams3.bottomMargin;
            this.xk5 = marginLayoutParams3.topMargin;
            this.th6 = this.yl25.getMeasuredHeight();
            View view5 = this.sk1t;
            if (view5 != null) {
                this.mjvl = ((ViewGroup.MarginLayoutParams) view5.getLayoutParams()).bottomMargin;
            }
            i3 = 0 + this.th6 + this.xk5 + this.k6e;
            z9 = true;
        }
        if (this.f40692y) {
            int i5 = -this.hp;
            if (z8 && this.tgs.getVisibility() == 4) {
                i5 -= this.q7k9;
            }
            i3 = i5;
        }
        setScrollingRange(i2, i3, z7, z9, z8, z2, z3, z5, z6);
    }

    private void hb(List<View> list, float f2) {
        if (list == null) {
            return;
        }
        float fMax = Math.max(0.0f, Math.min(1.0f, f2));
        Iterator<View> it = list.iterator();
        while (it.hasNext()) {
            it.next().setAlpha(fMax);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public void m26135j(int i2) {
        String string = Long.toString(SystemClock.elapsedRealtime());
        this.ut = string;
        Folme.useValue(new Object[0]).setTo(string, Integer.valueOf(getScrollingProgress())).to(string, Integer.valueOf(i2), new AnimConfig().setEase(-2, 1.0f, 0.35f).addListeners(new C7205q(string)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lv5(int i2) {
        oc(i2);
        jk(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nmn5(int i2) {
        this.f40682o = i2;
        oc(getScrollingProgress());
        jk(getScrollingProgress());
    }

    /* JADX INFO: renamed from: o */
    private void m26137o(int i2, int i3, boolean z2) {
        if (this.zm == null) {
            return;
        }
        int iMax = 0;
        if (z2) {
            if (i3 == getScrollingTo() && getTriggerViewVisible()) {
                this.zm.toq(this.yl25);
            }
            if ((i2 < getHeaderProgressTo() && i3 >= getHeaderProgressTo() && getHeaderViewVisible()) || i3 == getHeaderProgressTo()) {
                this.zm.m26147q(this.w97r);
            }
        } else {
            if (i3 == 0 && getTriggerViewVisible()) {
                this.zm.zy(this.yl25);
            } else if (i3 == getScrollingFrom() && !getHeaderViewVisible()) {
                this.zm.zy(this.yl25);
            }
            int scrollingFrom = getHeaderViewVisible() ? 0 : getScrollingFrom();
            if (i2 > getHeaderProgressFrom() && i3 <= getHeaderProgressFrom() && getHeaderViewVisible()) {
                this.zm.m26145k(this.w97r);
            }
            if (i2 > scrollingFrom && i3 < scrollingFrom && getTriggerViewVisible()) {
                this.zm.zy(this.yl25);
            }
        }
        boolean z3 = i3 < getHeaderProgressFrom();
        View view = this.w97r;
        if (view != null) {
            int height = view.getHeight();
            Rect clipBounds = this.w97r.getClipBounds();
            iMax = clipBounds != null ? Math.max(0, clipBounds.height()) : height;
        }
        this.zm.m26146n(i3, z3, iMax, Math.max(0.0f, 1.0f - ((iMax * 1.0f) / this.hp)));
    }

    private void t8iq(int i2, int i3) {
        if (this.tlhn != null) {
            int i4 = this.hp;
            if (this.f40692y) {
                if ((this.f40680m > this.xhv) || (i2 = i2 - getStickyScrollToOnNested()) > 0) {
                    i2 = 0;
                }
            } else {
                i3 = i4;
            }
            if (!this.f40681n) {
                if (getTop() <= 0 && i2 < (-i3) && !this.zsl) {
                    this.zsl = true;
                    this.tlhn.setVisibility(0);
                } else if ((getTop() > 0 || i2 >= (-i3)) && this.zsl) {
                    this.zsl = false;
                    this.tlhn.setVisibility(4);
                }
                Rect clipBounds = this.f40683p.getClipBounds();
                if (clipBounds == null) {
                    clipBounds = new Rect();
                }
                clipBounds.set(0, 0, this.f40683p.getWidth(), this.f40683p.getHeight());
                this.f40683p.setClipBounds(clipBounds);
                return;
            }
            if (getTop() <= 0 && i2 < (-i3) && !this.zsl) {
                this.zsl = true;
                this.tlhn.setVisibility(0);
                mo25100g(true);
            } else if ((getTop() > 0 || i2 >= (-i3)) && this.zsl) {
                this.zsl = false;
                this.tlhn.setVisibility(4);
                mo25100g(false);
            }
            if (this.tlhn.getVisibility() == 0) {
                this.f40683p.setClipBounds(null);
                return;
            }
            int height = this.tlhn.getHeight();
            if (this.ar && this.tlhn.getClipBounds() != null) {
                height = this.tlhn.getClipBounds().height();
            }
            Rect clipBounds2 = this.f40683p.getClipBounds();
            if (clipBounds2 == null) {
                clipBounds2 = new Rect();
            }
            clipBounds2.set(0, height - this.f40683p.getTop(), this.f40683p.getWidth(), this.f40683p.getHeight());
            this.f40683p.setClipBounds(clipBounds2);
        }
    }

    /* JADX INFO: renamed from: x */
    private void m26139x(View view, View view2, int i2, int i3, boolean z2) {
        view.layout(view.getLeft(), i2, view.getRight(), Math.max(i2, view.getMeasuredHeight() + i2 + i3));
        if (view != view2) {
            int iMax = Math.max(view2.getTop(), 0);
            int top = view2.getTop();
            int measuredHeight = view2.getMeasuredHeight() + iMax;
            if (z2) {
                i3 /= 2;
            }
            view2.layout(view2.getLeft(), iMax, view2.getRight(), Math.max(top, measuredHeight + i3));
        }
    }

    private List<View> zp(View view) {
        return a98o(view, this.am == toq.C7769n.f100216r8s8 || this.sk1t != null);
    }

    @Override // miuix.nestedheader.widget.NestedScrollingLayout
    public void a9(boolean z2, int i2, int i3, int i4, int i5) {
        super.a9(z2, i2, i3, i4, i5);
        bo(true, false, false, false);
    }

    /* JADX INFO: renamed from: b */
    public boolean m26140b() {
        return this.f40681n;
    }

    public void ch() {
        this.zm = null;
    }

    public boolean ek5k() {
        return this.zr5t;
    }

    @Override // miuix.view.toq
    /* JADX INFO: renamed from: g */
    public void mo25100g(boolean z2) {
        x2 x2Var = this.az;
        if (x2Var != null) {
            x2Var.mo25100g(z2);
        }
    }

    @Override // miuix.nestedheader.widget.NestedScrollingLayout
    protected int getHeaderCloseProgress() {
        return this.f40681n ? getScrollingFrom() + this.f40675h + this.q7k9 : getScrollingFrom();
    }

    @Override // miuix.nestedheader.widget.NestedScrollingLayout
    protected int getHeaderProgressFrom() {
        return this.f40681n ? getScrollingFrom() + this.f40675h + this.hp : getScrollingFrom();
    }

    @Override // miuix.nestedheader.widget.NestedScrollingLayout
    protected int getHeaderProgressTo() {
        int scrollingFrom;
        int i2;
        if (this.f40681n) {
            scrollingFrom = getScrollingFrom() + this.f40675h + this.hp;
            i2 = this.q7k9;
        } else {
            scrollingFrom = getScrollingFrom();
            i2 = this.hp;
        }
        return scrollingFrom + i2;
    }

    public View getHeaderView() {
        return this.w97r;
    }

    public boolean getHeaderViewVisible() {
        View view = this.w97r;
        return view != null && view.getVisibility() == 0;
    }

    @Override // miuix.nestedheader.widget.NestedScrollingLayout, qh4d.toq
    public int getNestedScrollableValue() {
        return -(this.q7k9 + this.hp);
    }

    public View getScrollableView() {
        return this.f40683p;
    }

    @Override // miuix.nestedheader.widget.NestedScrollingLayout
    protected int getScrollableViewMaxHeightWithoutOverlay() {
        int measuredHeight;
        int i2;
        View view;
        if (!this.f40692y || (view = this.tgs) == null || view.getVisibility() == 0) {
            View view2 = this.tgs;
            if (view2 != null && view2.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.tgs.getLayoutParams();
                this.q7k9 = this.tgs.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
            measuredHeight = getMeasuredHeight() - this.f40675h;
            i2 = this.q7k9;
        } else {
            measuredHeight = getMeasuredHeight();
            i2 = this.f40675h;
        }
        return measuredHeight - i2;
    }

    @Override // miuix.nestedheader.widget.NestedScrollingLayout
    protected int getStickyScrollToOnNested() {
        int scrollingFrom;
        int i2;
        View view;
        if (this.f40692y && (view = this.tgs) != null && view.getVisibility() == 4) {
            scrollingFrom = getScrollingFrom();
            i2 = this.f40675h;
        } else {
            scrollingFrom = getScrollingFrom() + this.f40675h;
            i2 = this.q7k9;
        }
        return scrollingFrom + i2;
    }

    public View getStickyView() {
        return this.tgs;
    }

    public boolean getStickyViewVisible() {
        View view = this.tgs;
        return view != null && view.getVisibility() == 0;
    }

    public boolean getTriggerViewVisible() {
        View view = this.yl25;
        return view != null && view.getVisibility() == 0;
    }

    public boolean i1() {
        return getTriggerViewVisible() && ((getHeaderViewVisible() && getScrollingProgress() >= getScrollingTo()) || (!getHeaderViewVisible() && getScrollingProgress() >= 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    @Override // miuix.nestedheader.widget.NestedScrollingLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void jk(int r23) {
        /*
            Method dump skipped, instruction units count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.nestedheader.widget.NestedHeaderLayout.jk(int):void");
    }

    @Override // miuix.nestedheader.widget.NestedScrollingLayout, qh4d.toq
    /* JADX INFO: renamed from: k */
    public void mo26141k(int i2, int i3) {
        super.mo26141k(i2, i3);
        if (this.f40692y) {
            m26143u(Math.min(i2, 0));
        } else {
            t8iq(getScrollingProgress(), this.xy8);
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m26142m() {
        return this.ei;
    }

    @Override // miuix.view.toq
    /* JADX INFO: renamed from: n */
    public boolean mo25102n() {
        x2 x2Var = this.az;
        if (x2Var != null) {
            return x2Var.mo25102n();
        }
        return false;
    }

    @Override // android.view.View
    public void offsetTopAndBottom(int i2) {
        super.offsetTopAndBottom(i2);
        t8iq(getScrollingProgress(), this.xy8);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.bd = getRootView();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        x2 x2Var = this.az;
        if (x2Var != null) {
            x2Var.m26788s();
        }
        if (!C7084p.m25593g() || this.ba || m26140b() || this.f40674g != null) {
            return;
        }
        this.f40681n = true;
    }

    @Override // miuix.nestedheader.widget.NestedScrollingLayout, android.view.View
    @hyr(api = 21)
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.w97r = findViewById(this.ax);
        this.tgs = findViewById(this.bq);
        this.yl25 = findViewById(this.ac);
        View view = this.tgs;
        if (view != null) {
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC7203k());
        }
        View view2 = this.w97r;
        if (view2 == null && this.yl25 == null && this.tgs == null) {
            throw new IllegalArgumentException("The headerView or triggerView or stickyView attribute is required and must refer to a valid child.");
        }
        if (view2 != null) {
            View viewFindViewById = view2.findViewById(this.ad);
            this.zmmu = viewFindViewById;
            if (viewFindViewById == null) {
                this.zmmu = this.w97r.findViewById(R.id.inputArea);
            }
        }
        View view3 = this.yl25;
        if (view3 != null) {
            View viewFindViewById2 = view3.findViewById(this.am);
            this.sk1t = viewFindViewById2;
            if (viewFindViewById2 == null) {
                this.sk1t = this.yl25.findViewById(R.id.inputArea);
            }
        }
        if (this.tlhn == null) {
            View view4 = new View(getContext());
            this.tlhn = view4;
            view4.setVisibility(4);
            this.tlhn.setClickable(true);
            this.tlhn.setBackground(this.bs);
            this.tlhn.setImportantForAccessibility(4);
            addView(this.tlhn, indexOfChild(this.f40683p) + 1, new ViewGroup.LayoutParams(-1, -2));
        }
        this.f40681n = true;
        this.az = new x2(getContext(), this.tlhn, false, new toq());
        this.ba = C7106k.d2ok() || C7106k.d3() || C7106k.lvui();
        if (!C7084p.m25593g() || this.ba) {
            this.f40681n = false;
        } else {
            setSupportBlur(true);
            setEnableBlur(true);
        }
        Boolean bool = this.f40674g;
        if (bool != null) {
            this.f40681n = bool.booleanValue();
        }
    }

    @Override // miuix.nestedheader.widget.NestedScrollingLayout, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        View childAt;
        super.onMeasure(i2, i3);
        View view = this.w97r;
        if (!(((view instanceof ViewGroup) && (view instanceof ncyb)) || (view instanceof ScrollView)) || (childAt = ((ViewGroup) view).getChildAt(0)) == null || childAt.getMeasuredHeight() <= this.w97r.getMeasuredHeight()) {
            return;
        }
        this.w97r.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 0));
    }

    @Override // miuix.view.toq
    /* JADX INFO: renamed from: q */
    public boolean mo25103q() {
        x2 x2Var = this.az;
        if (x2Var != null) {
            return x2Var.mo25103q();
        }
        return false;
    }

    public void setAcceptTriggerRootViewAlpha(boolean z2) {
        this.zr5t = z2;
    }

    public void setAutoAllClose(boolean z2) {
        if (this.id) {
            startNestedScroll(2, 1);
            dispatchNestedPreScroll(0, this.f40669b, new int[2], new int[2], 1);
            stopNestedScroll(1);
        }
        if (getScrollingProgress() > getHeaderCloseProgress()) {
            if (z2) {
                m26135j(getHeaderCloseProgress());
            } else {
                lv5(getHeaderCloseProgress());
            }
        }
    }

    public void setAutoAllOpen(boolean z2) {
        if (this.id) {
            startNestedScroll(2, 1);
            dispatchNestedScroll(0, 0, 0, -this.f40669b, this.f40684q, 1);
            stopNestedScroll(1);
        }
        if (getScrollingProgress() < getScrollingTo()) {
            if (z2) {
                m26135j(getScrollingTo());
            } else {
                lv5(getScrollingTo());
            }
        }
    }

    public void setAutoAnim(boolean z2) {
        this.xqx = z2;
    }

    public void setAutoHeaderClose(boolean z2) {
        if (this.id) {
            startNestedScroll(2, 1);
            dispatchNestedPreScroll(0, this.f40669b, new int[2], new int[2], 1);
            stopNestedScroll(1);
        }
        if (!getHeaderViewVisible() || getScrollingProgress() <= getScrollingFrom()) {
            return;
        }
        if (z2) {
            m26135j(getHeaderCloseProgress());
        } else if (getHeaderViewVisible()) {
            lv5(getHeaderCloseProgress());
        }
    }

    public void setAutoHeaderOpen(boolean z2) {
        if (this.id) {
            startNestedScroll(2, 1);
            dispatchNestedScroll(0, 0, 0, -this.f40669b, this.f40684q, 1);
            stopNestedScroll(1);
        }
        if (!getHeaderViewVisible() || getScrollingProgress() >= 0) {
            return;
        }
        if (z2) {
            m26135j(getHeaderProgressTo());
        } else {
            lv5(getHeaderProgressTo());
        }
    }

    public void setAutoTriggerClose(boolean z2) {
        int scrollingFrom = (getTriggerViewVisible() && getHeaderViewVisible() && getScrollingProgress() > 0) ? 0 : (!getTriggerViewVisible() || getHeaderViewVisible() || getScrollingProgress() <= getScrollingFrom()) ? -1 : getScrollingFrom();
        if (scrollingFrom != -1 && z2) {
            m26135j(scrollingFrom);
        } else if (scrollingFrom != -1) {
            lv5(scrollingFrom);
        }
    }

    public void setAutoTriggerOpen(boolean z2) {
        if (this.id && !y9n()) {
            startNestedScroll(2, 1);
            dispatchNestedScroll(0, 0, 0, -this.f40669b, this.f40684q, 1);
            stopNestedScroll(1);
        }
        if (!getTriggerViewVisible() || getScrollingProgress() >= getScrollingTo()) {
            return;
        }
        if (z2) {
            m26135j(getScrollingTo());
        } else {
            lv5(getScrollingTo());
        }
    }

    @Override // miuix.view.toq
    public void setEnableBlur(boolean z2) {
        x2 x2Var = this.az;
        if (x2Var != null) {
            x2Var.setEnableBlur(z2);
        }
    }

    public void setHeaderAutoCloseEnable(boolean z2) {
        this.be = z2;
    }

    public void setHeaderRootViewAcceptAlpha(boolean z2) {
        this.ei = z2;
    }

    public void setHeaderViewVisible(boolean z2) {
        View view = this.w97r;
        if (view != null) {
            view.setVisibility(z2 ? 0 : 8);
            bo(false, false, false, z2);
        }
    }

    public void setInSearchMode(boolean z2) {
        this.f40692y = z2;
        if (z2) {
            this.xhv = getNestedScrollableValue();
        } else {
            this.xhv = 0;
        }
        bo(false, false, false, false);
        requestLayout();
    }

    public void setNestedHeaderChangedListener(InterfaceC7204n interfaceC7204n) {
        this.zm = interfaceC7204n;
    }

    public void setOverlayMode(boolean z2) {
        this.f40674g = Boolean.valueOf(z2);
        this.f40681n = z2;
    }

    @Override // miuix.nestedheader.widget.NestedScrollingLayout
    public void setSelfScrollFirst(boolean z2) {
        boolean z3 = this.id;
        if (z3 != z2 && z3 && !y9n()) {
            startNestedScroll(2, 1);
            dispatchNestedScroll(0, 0, 0, -this.f40669b, this.f40684q, 1);
            stopNestedScroll(1);
            lv5(0);
        }
        super.setSelfScrollFirst(z2);
    }

    public void setStickyViewVisible(boolean z2) {
        View view = this.tgs;
        if (view != null) {
            view.setVisibility(z2 ? 0 : 8);
            bo(false, false, z2, false);
        }
    }

    @Override // miuix.view.toq
    public void setSupportBlur(boolean z2) {
        x2 x2Var = this.az;
        if (x2Var != null) {
            x2Var.setSupportBlur(z2);
        }
    }

    public void setTriggerViewVisible(boolean z2) {
        View view = this.yl25;
        if (view != null) {
            view.setVisibility(z2 ? 0 : 8);
            bo(false, z2, false, false);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m26143u(int i2) {
        oc(i2);
        jk(i2);
    }

    public boolean y9n() {
        return getHeaderViewVisible() && getScrollingProgress() >= getHeaderProgressTo();
    }

    public boolean yz() {
        return this.xqx;
    }

    @Override // miuix.view.toq
    public boolean zy() {
        x2 x2Var = this.az;
        if (x2Var != null) {
            return x2Var.zy();
        }
        return false;
    }

    public NestedHeaderLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedHeaderLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.dy = 0;
        this.vb6 = 0;
        this.k6e = 0;
        this.xk5 = 0;
        this.s8y = 0;
        this.mjvl = 0;
        this.hp = 0;
        this.cw14 = 0;
        this.xy8 = 0;
        this.th6 = 0;
        this.q7k9 = 0;
        this.ndjo = 0;
        this.d1cy = false;
        this.xqx = true;
        this.zr5t = false;
        this.ei = false;
        this.wra = new Rect();
        this.zsl = false;
        this.xhv = 0;
        this.ut = Long.toString(SystemClock.elapsedRealtime());
        this.wh6 = new zy();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.C7770p.f100249dr);
        this.ax = typedArrayObtainStyledAttributes.getResourceId(toq.C7770p.f45812d, toq.C7769n.f45789f);
        this.bq = typedArrayObtainStyledAttributes.getResourceId(toq.C7770p.f100254fnq8, toq.C7769n.f45805v);
        this.ac = typedArrayObtainStyledAttributes.getResourceId(toq.C7770p.f100300wo, toq.C7769n.f100201m4);
        this.ad = typedArrayObtainStyledAttributes.getResourceId(toq.C7770p.f45830v, toq.C7769n.f100188hyr);
        this.am = typedArrayObtainStyledAttributes.getResourceId(toq.C7770p.f100288qo, toq.C7769n.f100216r8s8);
        int i3 = toq.C7770p.f100265ikck;
        Resources resources = context.getResources();
        int i4 = toq.zy.f45900y;
        this.bc = typedArrayObtainStyledAttributes.getDimension(i3, resources.getDimension(i4));
        this.bu = typedArrayObtainStyledAttributes.getDimension(toq.C7770p.f100293tfm, context.getResources().getDimension(i4));
        this.ay = typedArrayObtainStyledAttributes.getDimension(toq.C7770p.f100297vq, 0.0f);
        this.be = typedArrayObtainStyledAttributes.getBoolean(toq.C7770p.f100304xwq3, true);
        this.aj = typedArrayObtainStyledAttributes.getBoolean(toq.C7770p.f100287qkj8, false);
        try {
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(toq.C7770p.f100277mu);
            this.bs = drawable;
            if (drawable == null) {
                Drawable drawableMutate = C7164n.m25952s(getContext(), R.attr.windowBackground).mutate();
                this.bs = drawableMutate;
                if (drawableMutate instanceof BitmapDrawable) {
                    this.ar = true;
                }
            }
        } catch (Exception e2) {
            Log.e(ls9, "maskBackground error " + e2);
        }
        typedArrayObtainStyledAttributes.recycle();
        qrj(this.wh6);
    }
}
