package miuix.nestedheader.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import miuix.animation.Folme;
import miuix.animation.base.AnimConfig;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;
import miuix.nestedheader.widget.NestedScrollingLayout;
import xzl.toq;
import zy.hyr;

/* JADX INFO: loaded from: classes3.dex */
public class LegacyNestedHeaderLayout extends NestedScrollingLayout {
    private static final String cw14 = "NestedHeaderLayout";
    public static final int xy8 = 1;
    private float ac;
    private float ad;
    private View aj;
    private float am;
    private int ar;
    private int ax;
    private View ay;
    private int az;
    private int ba;
    private int bc;
    private int bd;
    private View be;
    private int bq;
    private View bs;
    private int bu;
    private boolean dy;
    private NestedScrollingLayout.toq hp;
    private int k0;
    private boolean k6e;
    private String mjvl;
    private zy s8y;
    private int sk1t;
    private int tgs;
    private int tlhn;
    private boolean vb6;
    private int w97r;
    private boolean xk5;
    private int yl25;
    private int zmmu;

    /* JADX INFO: renamed from: miuix.nestedheader.widget.LegacyNestedHeaderLayout$k */
    class C7202k implements NestedScrollingLayout.toq {
        C7202k() {
        }

        @Override // miuix.nestedheader.widget.NestedScrollingLayout.toq
        /* JADX INFO: renamed from: k */
        public void mo26128k(int i2) {
            if (i2 == 0) {
                LegacyNestedHeaderLayout.this.m26119b(false);
            }
        }

        @Override // miuix.nestedheader.widget.NestedScrollingLayout.toq
        public void toq(int i2) {
            if (LegacyNestedHeaderLayout.this.vb6) {
                LegacyNestedHeaderLayout.this.ek5k();
            }
        }

        @Override // miuix.nestedheader.widget.NestedScrollingLayout.toq
        public void zy(int i2) {
            if (i2 == 0) {
                LegacyNestedHeaderLayout.this.m26119b(true);
            } else {
                LegacyNestedHeaderLayout.this.y9n();
            }
        }
    }

    class toq extends TransitionListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f40662k;

        toq(String str) {
            this.f40662k = str;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            UpdateInfo updateInfoFindByName = UpdateInfo.findByName(collection, this.f40662k);
            if (updateInfoFindByName == null || !LegacyNestedHeaderLayout.this.uv6(this.f40662k)) {
                return;
            }
            LegacyNestedHeaderLayout.this.m26123m(updateInfoFindByName.getIntValue());
        }
    }

    public interface zy {
        /* JADX INFO: renamed from: k */
        void m26129k(View view);

        /* JADX INFO: renamed from: q */
        void m26130q(View view);

        void toq(View view);

        void zy(View view);
    }

    public LegacyNestedHeaderLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m26119b(boolean z2) {
        this.dy = z2;
        if (z2) {
            y9n();
        }
    }

    /* JADX INFO: renamed from: e */
    private List<View> m26120e(View view, boolean z2) {
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
    public void ek5k() {
        if (getScrollingProgress() == 0 || getScrollingProgress() >= getScrollingTo() || getScrollingProgress() <= getScrollingFrom()) {
            return;
        }
        int scrollingTo = 0;
        if (getScrollingProgress() > getScrollingFrom() && getScrollingProgress() < getScrollingFrom() * 0.5f) {
            scrollingTo = getScrollingFrom();
        } else if ((getScrollingProgress() < getScrollingFrom() * 0.5f || getScrollingProgress() >= 0) && ((getScrollingProgress() <= 0 || getScrollingProgress() >= getScrollingTo() * 0.5f) && getScrollingProgress() >= getScrollingTo() * 0.5f && getScrollingProgress() < getScrollingTo())) {
            scrollingTo = getScrollingTo();
        }
        m26122l(scrollingTo);
    }

    private List<View> hb(View view) {
        return m26120e(view, this.bq == toq.C7769n.f100216r8s8 || this.bs != null);
    }

    /* JADX INFO: renamed from: j */
    private void m26121j(View view, View view2, int i2, int i3, boolean z2) {
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

    /* JADX INFO: renamed from: l */
    private void m26122l(int i2) {
        String string = Long.toString(SystemClock.elapsedRealtime());
        this.mjvl = string;
        Folme.useValue(new Object[0]).setTo(string, Integer.valueOf(getScrollingProgress())).to(string, Integer.valueOf(i2), new AnimConfig().addListeners(new toq(string)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m26123m(int i2) {
        oc(i2);
        jk(i2);
    }

    private void n5r1(int i2, int i3, boolean z2) {
        if (this.s8y == null) {
            return;
        }
        if (z2) {
            if (i3 == 0 && getHeaderViewVisible()) {
                this.s8y.m26130q(this.ay);
            } else if (i3 == getScrollingTo() && getTriggerViewVisible()) {
                this.s8y.toq(this.be);
            }
            if (i2 >= 0 || i3 <= 0 || !getHeaderViewVisible()) {
                return;
            }
            this.s8y.m26130q(this.ay);
            return;
        }
        if (i3 == 0 && getTriggerViewVisible()) {
            this.s8y.zy(this.be);
        } else if (i3 == getScrollingFrom() && getHeaderViewVisible()) {
            this.s8y.m26129k(this.ay);
        } else if (i3 == getScrollingFrom() && !getHeaderViewVisible()) {
            this.s8y.zy(this.be);
        }
        int scrollingFrom = getHeaderViewVisible() ? 0 : getScrollingFrom();
        if (i2 <= scrollingFrom || i3 >= scrollingFrom || !getTriggerViewVisible()) {
            return;
        }
        this.s8y.zy(this.be);
    }

    private void ncyb(List<View> list, float f2) {
        if (list == null) {
            return;
        }
        float fMax = Math.max(0.0f, Math.min(1.0f, f2));
        Iterator<View> it = list.iterator();
        while (it.hasNext()) {
            it.next().setAlpha(fMax);
        }
    }

    private List<View> nn86(View view) {
        return m26120e(view, this.ax == toq.C7769n.f100188hyr || this.aj != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean uv6(String str) {
        return (this.dy || !this.mjvl.equals(str) || getAcceptedNestedFlingInConsumedProgress()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y9n() {
        this.mjvl = Long.toString(SystemClock.elapsedRealtime());
    }

    private void yz(boolean z2, boolean z3, boolean z5) {
        int i2;
        boolean z6;
        int i3;
        int i4;
        boolean z7;
        View view = this.ay;
        if (view == null || view.getVisibility() == 8) {
            i2 = 0;
            z6 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.ay.getLayoutParams();
            this.k0 = marginLayoutParams.bottomMargin;
            this.ar = marginLayoutParams.topMargin;
            int measuredHeight = this.ay.getMeasuredHeight();
            this.yl25 = measuredHeight;
            this.tgs = this.ar + measuredHeight + this.k0;
            View view2 = this.aj;
            if (view2 != null) {
                this.tlhn = ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).bottomMargin;
            }
            i2 = ((int) (this.ac - this.tgs)) + 0;
            z6 = true;
        }
        View view3 = this.be;
        if (view3 == null || view3.getVisibility() == 8) {
            i3 = i2;
            i4 = 0;
            z7 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.be.getLayoutParams();
            this.bc = marginLayoutParams2.bottomMargin;
            this.bu = marginLayoutParams2.topMargin;
            this.zmmu = this.be.getMeasuredHeight();
            View view4 = this.bs;
            if (view4 != null) {
                this.w97r = ((ViewGroup.MarginLayoutParams) view4.getLayoutParams()).bottomMargin;
            }
            i4 = this.zmmu + this.bu + this.bc + 0;
            if (z6) {
                z7 = true;
            } else {
                i2 = -i4;
                z7 = true;
                i4 = 0;
            }
            i3 = i2;
        }
        setScrollingRange(i3, i4, z6, z7, false, z2, z3, false, z5);
    }

    @Override // miuix.nestedheader.widget.NestedScrollingLayout
    public void a9(boolean z2, int i2, int i3, int i4, int i5) {
        super.a9(z2, i2, i3, i4, i5);
        yz(true, false, false);
    }

    /* JADX INFO: renamed from: c */
    public boolean m26125c() {
        return this.vb6;
    }

    /* JADX INFO: renamed from: f */
    public boolean m26126f() {
        return this.k6e;
    }

    @Override // miuix.nestedheader.widget.NestedScrollingLayout
    protected int getHeaderProgressFrom() {
        return getScrollingFrom() + this.f40675h + this.tgs;
    }

    public View getHeaderView() {
        return this.ay;
    }

    public boolean getHeaderViewVisible() {
        View view = this.ay;
        return view != null && view.getVisibility() == 0;
    }

    public View getScrollableView() {
        return this.f40683p;
    }

    public boolean getTriggerViewVisible() {
        View view = this.be;
        return view != null && view.getVisibility() == 0;
    }

    public boolean hyr() {
        return this.xk5;
    }

    @Override // miuix.nestedheader.widget.NestedScrollingLayout
    protected void jk(int i2) {
        int iMax;
        int i3;
        float f2;
        float f3;
        int i4;
        int i5;
        float f4;
        float f5;
        super.jk(i2);
        View view = this.be;
        if (view == null || view.getVisibility() == 8) {
            iMax = i2;
            i3 = 0;
        } else {
            iMax = i2 - Math.max(0, Math.min(getScrollingTo(), i2));
            int iMax2 = Math.max(getScrollingFrom(), Math.min(getScrollingTo(), i2));
            int i6 = this.bu;
            View view2 = this.ay;
            if (view2 == null || view2.getVisibility() == 8) {
                int i7 = this.bu + this.bc + this.zmmu;
                i4 = iMax2 + i7;
                i5 = i6;
                i3 = i7;
            } else {
                i4 = iMax2;
                i5 = this.tgs + this.bu;
                i3 = 0;
            }
            View view3 = this.bs;
            if (view3 == null) {
                view3 = this.be;
            }
            View view4 = view3;
            m26121j(this.be, view4, i5, ((i4 - this.bc) - this.bu) - this.zmmu, false);
            if (this.bs == null) {
                f4 = i4 - this.bc;
                f5 = this.am;
            } else {
                f4 = i4 - this.w97r;
                f5 = this.am;
            }
            float f6 = f4 / f5;
            float fMax = Math.max(0.0f, Math.min(1.0f, f6));
            if (this.k6e) {
                this.be.setAlpha(fMax);
            } else {
                View view5 = this.be;
                if ((view5 instanceof ViewGroup) && ((ViewGroup) view5).getChildCount() > 0) {
                    for (int i8 = 0; i8 < ((ViewGroup) this.be).getChildCount(); i8++) {
                        ((ViewGroup) this.be).getChildAt(i8).setAlpha(fMax);
                    }
                }
            }
            ncyb(hb(view4), f6 - 1.0f);
        }
        View view6 = this.ay;
        if (view6 != null && view6.getVisibility() != 8) {
            int i9 = this.bd + this.ar;
            View view7 = this.aj;
            if (view7 == null) {
                view7 = this.ay;
            }
            View view8 = view7;
            m26121j(this.ay, view8, i9, iMax, false);
            if (this.aj == null) {
                f2 = iMax - this.k0;
                f3 = this.ad;
            } else {
                f2 = iMax - this.tlhn;
                f3 = this.ad;
            }
            float f7 = (f2 + f3) / f3;
            float fMax2 = Math.max(0.0f, Math.min(1.0f, f7 + 1.0f));
            if (this.xk5) {
                this.ay.setAlpha(fMax2);
            } else {
                View view9 = this.ay;
                if ((view9 instanceof ViewGroup) && ((ViewGroup) view9).getChildCount() > 0) {
                    for (int i10 = 0; i10 < ((ViewGroup) this.ay).getChildCount(); i10++) {
                        ((ViewGroup) this.ay).getChildAt(i10).setAlpha(fMax2);
                    }
                }
            }
            ncyb(nn86(view8), f7);
            i3 = this.tgs;
        }
        View view10 = this.f40683p;
        view10.offsetTopAndBottom((i2 + i3) - view10.getTop());
        int i11 = this.sk1t;
        if (i2 - i11 > 0) {
            n5r1(i11, i2, true);
        } else if (i2 - i11 < 0) {
            n5r1(i11, i2, false);
        }
        this.sk1t = i2;
        d3(lrht());
    }

    public boolean lrht() {
        return getHeaderViewVisible() && getScrollingProgress() >= 0;
    }

    /* JADX INFO: renamed from: o */
    public void m26127o() {
        this.s8y = null;
    }

    @Override // miuix.nestedheader.widget.NestedScrollingLayout, android.view.View
    @hyr(api = 21)
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.ay = findViewById(this.az);
        View viewFindViewById = findViewById(this.ba);
        this.be = viewFindViewById;
        View view = this.ay;
        if (view == null && viewFindViewById == null) {
            throw new IllegalArgumentException("The headerView or triggerView attribute is required and must refer to a valid child.");
        }
        if (view != null) {
            View viewFindViewById2 = view.findViewById(this.ax);
            this.aj = viewFindViewById2;
            if (viewFindViewById2 == null) {
                this.aj = this.ay.findViewById(R.id.inputArea);
            }
        }
        View view2 = this.be;
        if (view2 != null) {
            View viewFindViewById3 = view2.findViewById(this.bq);
            this.bs = viewFindViewById3;
            if (viewFindViewById3 == null) {
                this.bs = this.be.findViewById(R.id.inputArea);
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View view = this.ay;
        if (view != null) {
            this.bd = view.getTop();
        }
    }

    public void setAcceptTriggerRootViewAlpha(boolean z2) {
        this.k6e = z2;
    }

    public void setAutoAllClose(boolean z2) {
        if (!z2 || getScrollingProgress() <= getScrollingFrom()) {
            m26123m(getScrollingFrom());
        } else {
            m26122l(getScrollingFrom());
        }
    }

    public void setAutoAllOpen(boolean z2) {
        if (!z2 || getScrollingProgress() >= getScrollingTo()) {
            m26123m(getScrollingTo());
        } else {
            m26122l(getScrollingTo());
        }
    }

    public void setAutoAnim(boolean z2) {
        this.vb6 = z2;
    }

    public void setAutoHeaderClose(boolean z2) {
        if (!getHeaderViewVisible() || getScrollingProgress() <= getScrollingFrom()) {
            return;
        }
        if (z2) {
            m26122l(getScrollingFrom());
        } else if (getHeaderViewVisible()) {
            m26123m(getScrollingFrom());
        }
    }

    public void setAutoHeaderOpen(boolean z2) {
        if (!getHeaderViewVisible() || getScrollingProgress() >= 0) {
            return;
        }
        if (z2) {
            m26122l(0);
        } else {
            m26123m(0);
        }
    }

    public void setAutoTriggerClose(boolean z2) {
        int scrollingFrom = (getTriggerViewVisible() && getHeaderViewVisible() && getScrollingProgress() > 0) ? 0 : (!getTriggerViewVisible() || getHeaderViewVisible() || getScrollingProgress() <= getScrollingFrom()) ? -1 : getScrollingFrom();
        if (scrollingFrom != -1 && z2) {
            m26122l(scrollingFrom);
        } else if (scrollingFrom != -1) {
            m26123m(scrollingFrom);
        }
    }

    public void setAutoTriggerOpen(boolean z2) {
        if (!getTriggerViewVisible() || getScrollingProgress() >= getScrollingTo()) {
            return;
        }
        if (z2) {
            m26122l(getScrollingTo());
        } else {
            m26123m(getScrollingTo());
        }
    }

    public void setHeaderRootViewAcceptAlpha(boolean z2) {
        this.xk5 = z2;
    }

    public void setHeaderViewVisible(boolean z2) {
        View view = this.ay;
        if (view != null) {
            view.setVisibility(z2 ? 0 : 8);
            yz(false, false, z2);
        }
    }

    public void setNestedHeaderChangedListener(zy zyVar) {
        this.s8y = zyVar;
    }

    public void setTriggerViewVisible(boolean z2) {
        View view = this.be;
        if (view != null) {
            view.setVisibility(z2 ? 0 : 8);
            yz(false, z2, false);
        }
    }

    public boolean vyq() {
        return getTriggerViewVisible() && ((getHeaderViewVisible() && getScrollingProgress() >= getScrollingTo()) || (!getHeaderViewVisible() && getScrollingProgress() >= 0));
    }

    public LegacyNestedHeaderLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LegacyNestedHeaderLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.k0 = 0;
        this.ar = 0;
        this.bc = 0;
        this.bu = 0;
        this.bd = 0;
        this.tlhn = 0;
        this.w97r = 0;
        this.tgs = 0;
        this.yl25 = 0;
        this.zmmu = 0;
        this.sk1t = 0;
        this.dy = false;
        this.vb6 = true;
        this.k6e = false;
        this.xk5 = false;
        this.mjvl = Long.toString(SystemClock.elapsedRealtime());
        this.hp = new C7202k();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.C7770p.f100249dr);
        this.az = typedArrayObtainStyledAttributes.getResourceId(toq.C7770p.f45812d, toq.C7769n.f45789f);
        this.ba = typedArrayObtainStyledAttributes.getResourceId(toq.C7770p.f100300wo, toq.C7769n.f100201m4);
        this.ax = typedArrayObtainStyledAttributes.getResourceId(toq.C7770p.f45830v, toq.C7769n.f100188hyr);
        this.bq = typedArrayObtainStyledAttributes.getResourceId(toq.C7770p.f100288qo, toq.C7769n.f100216r8s8);
        int i3 = toq.C7770p.f100265ikck;
        Resources resources = context.getResources();
        int i4 = toq.zy.f45900y;
        this.ad = typedArrayObtainStyledAttributes.getDimension(i3, resources.getDimension(i4));
        this.am = typedArrayObtainStyledAttributes.getDimension(toq.C7770p.f100293tfm, context.getResources().getDimension(i4));
        this.ac = typedArrayObtainStyledAttributes.getDimension(toq.C7770p.f100297vq, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        qrj(this.hp);
    }
}
