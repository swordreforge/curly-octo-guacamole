package miuix.appcompat.internal.app.widget;

import android.R;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import gb.toq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import miuix.animation.Folme;
import miuix.animation.ITouchStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.utils.EaseManager;
import miuix.appcompat.internal.view.C7040n;
import miuix.internal.util.C7162g;
import miuix.internal.util.n7h;
import miuix.view.C7380g;
import miuix.view.InterfaceC7382k;
import miuix.view.inputmethod.C7381k;
import miuix.view.n7h;
import miuix.viewpager.widget.ViewPager;
import qh4d.InterfaceC7614k;
import zy.dd;

/* JADX INFO: loaded from: classes3.dex */
public class SearchActionModeView extends FrameLayout implements Animator.AnimatorListener, zurt, TextWatcher, View.OnClickListener {
    public static final int bu = 400;

    /* JADX INFO: renamed from: a */
    private int f39177a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private int f86912ab;
    private n7h.InterfaceC7384k ac;
    private View.OnClickListener ad;
    private int aj;
    private float am;
    private int an;
    private int ar;
    private ActionBarContainer as;
    private FrameLayout ax;
    private boolean ay;
    private View az;

    /* JADX INFO: renamed from: b */
    private int f39178b;
    private View ba;
    private boolean bb;
    private int bc;
    private boolean be;
    private ActionBarView bg;
    private ActionBarContainer bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private int f86913bo;
    private boolean bp;
    private List<InterfaceC7382k> bq;
    private int bs;
    private int bv;

    /* JADX INFO: renamed from: c */
    private WeakReference<View> f39179c;

    /* JADX INFO: renamed from: d */
    private int f39180d;

    /* JADX INFO: renamed from: e */
    private WeakReference<View> f39181e;

    /* JADX INFO: renamed from: f */
    private WeakReference<View> f39182f;

    /* JADX INFO: renamed from: g */
    private boolean f39183g;

    /* JADX INFO: renamed from: h */
    private boolean f39184h;

    /* JADX INFO: renamed from: i */
    @dd
    private C7040n f39185i;
    private boolean id;
    private ObjectAnimator in;

    /* JADX INFO: renamed from: j */
    private int[] f39186j;

    /* JADX INFO: renamed from: k */
    private EditText f39187k;
    private int k0;

    /* JADX INFO: renamed from: l */
    private WeakReference<View> f39188l;

    /* JADX INFO: renamed from: m */
    private float f39189m;

    /* JADX INFO: renamed from: n */
    private ViewGroup f39190n;

    /* JADX INFO: renamed from: o */
    private boolean f39191o;

    /* JADX INFO: renamed from: p */
    private int f39192p;

    /* JADX INFO: renamed from: q */
    private TextView f39193q;

    /* JADX INFO: renamed from: r */
    private WeakReference<View> f39194r;

    /* JADX INFO: renamed from: s */
    private n7h.C7166n f39195s;

    /* JADX INFO: renamed from: t */
    private WeakReference<View> f39196t;

    /* JADX INFO: renamed from: u */
    private int f39197u;

    /* JADX INFO: renamed from: v */
    private int f39198v;

    /* JADX INFO: renamed from: w */
    private int f39199w;

    /* JADX INFO: renamed from: x */
    private int f39200x;

    /* JADX INFO: renamed from: y */
    private n7h.C7166n f39201y;

    /* JADX INFO: renamed from: z */
    private int f39202z;

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.SearchActionModeView$k */
    class C6984k implements InterfaceC7382k {
        C6984k() {
        }

        @Override // miuix.view.InterfaceC7382k
        /* JADX INFO: renamed from: p */
        public void mo25168p(boolean z2, float f2) {
        }

        @Override // miuix.view.InterfaceC7382k
        /* JADX INFO: renamed from: q */
        public void mo25169q(boolean z2) {
            View tabContainer;
            if (!z2 || (tabContainer = SearchActionModeView.this.bl.getTabContainer()) == null) {
                return;
            }
            tabContainer.setVisibility(8);
        }

        @Override // miuix.view.InterfaceC7382k
        public void x2(boolean z2) {
            if (z2) {
                SearchActionModeView.this.bl.setVisibility(SearchActionModeView.this.bp ? 4 : 8);
                return;
            }
            View tabContainer = SearchActionModeView.this.bl.getTabContainer();
            if (tabContainer != null) {
                tabContainer.setVisibility(0);
            }
            SearchActionModeView.this.bl.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.SearchActionModeView$n */
    class C6985n implements InterfaceC7382k {
        C6985n() {
        }

        @Override // miuix.view.InterfaceC7382k
        /* JADX INFO: renamed from: p */
        public void mo25168p(boolean z2, float f2) {
            if (!z2) {
                f2 = 1.0f - f2;
            }
            ActionBarContainer splitActionBarContainer = SearchActionModeView.this.getSplitActionBarContainer();
            if (splitActionBarContainer != null) {
                splitActionBarContainer.setTranslationY(f2 * splitActionBarContainer.getHeight());
            }
        }

        @Override // miuix.view.InterfaceC7382k
        /* JADX INFO: renamed from: q */
        public void mo25169q(boolean z2) {
        }

        @Override // miuix.view.InterfaceC7382k
        public void x2(boolean z2) {
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.SearchActionModeView$q */
    class C6986q implements InterfaceC7382k {
        C6986q() {
        }

        /* JADX INFO: renamed from: k */
        public void m25200k(float f2, int i2) {
            float f3 = 1.0f - f2;
            if (miuix.internal.util.n7h.x2(SearchActionModeView.this)) {
                f3 = f2 - 1.0f;
            }
            int measuredWidth = SearchActionModeView.this.f39193q.getMeasuredWidth();
            if (SearchActionModeView.this.f39193q.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) SearchActionModeView.this.f39193q.getLayoutParams();
                measuredWidth += marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
            }
            SearchActionModeView.this.f39193q.setTranslationX(measuredWidth * f3);
            if (SearchActionModeView.this.f39190n.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) SearchActionModeView.this.f39190n.getLayoutParams();
                marginLayoutParams2.setMarginEnd(Math.max(SearchActionModeView.this.getPaddingStart(), (int) (((measuredWidth - i2) * f2) + i2)));
                SearchActionModeView.this.f39190n.setLayoutParams(marginLayoutParams2);
            }
        }

        @Override // miuix.view.InterfaceC7382k
        /* JADX INFO: renamed from: p */
        public void mo25168p(boolean z2, float f2) {
            if (!z2) {
                f2 = 1.0f - f2;
            }
            int i2 = SearchActionModeView.this.f39197u;
            SearchActionModeView searchActionModeView = SearchActionModeView.this;
            float f3 = i2 * f2;
            searchActionModeView.setPaddingRelative(searchActionModeView.getPaddingStart(), (int) (SearchActionModeView.this.f39200x + f3), SearchActionModeView.this.getPaddingEnd(), SearchActionModeView.this.getPaddingBottom());
            ViewGroup.LayoutParams layoutParams = SearchActionModeView.this.getLayoutParams();
            layoutParams.height = SearchActionModeView.this.k0 + ((int) f3);
            m25200k(f2, SearchActionModeView.this.bc);
            SearchActionModeView.this.setLayoutParams(layoutParams);
        }

        @Override // miuix.view.InterfaceC7382k
        /* JADX INFO: renamed from: q */
        public void mo25169q(boolean z2) {
            if (!z2) {
                SearchActionModeView.this.f39187k.removeTextChangedListener(SearchActionModeView.this);
                return;
            }
            int i2 = SearchActionModeView.this.f39197u;
            SearchActionModeView searchActionModeView = SearchActionModeView.this;
            searchActionModeView.setPaddingRelative(searchActionModeView.getPaddingStart(), SearchActionModeView.this.f39200x + i2, SearchActionModeView.this.getPaddingEnd(), SearchActionModeView.this.getPaddingBottom());
            ViewGroup.LayoutParams layoutParams = SearchActionModeView.this.getLayoutParams();
            layoutParams.height = SearchActionModeView.this.k0 + i2;
            m25200k(1.0f, SearchActionModeView.this.bc);
            SearchActionModeView.this.setLayoutParams(layoutParams);
        }

        @Override // miuix.view.InterfaceC7382k
        public void x2(boolean z2) {
            m25200k(z2 ? 0.0f : 1.0f, SearchActionModeView.this.bc);
            if (z2) {
                SearchActionModeView.this.f39187k.getText().clear();
                SearchActionModeView.this.f39187k.addTextChangedListener(SearchActionModeView.this);
            } else {
                SearchActionModeView.this.f39187k.removeTextChangedListener(SearchActionModeView.this);
                SearchActionModeView.this.f39187k.getText().clear();
            }
        }
    }

    class toq implements InterfaceC7382k {

        /* JADX INFO: renamed from: f */
        private View f39207f;

        /* JADX INFO: renamed from: g */
        private int f39208g;

        /* JADX INFO: renamed from: h */
        private ActionBarView f39209h;

        /* JADX INFO: renamed from: i */
        private View f39210i;

        /* JADX INFO: renamed from: l */
        private View f39212l;

        /* JADX INFO: renamed from: p */
        private int f39214p;

        /* JADX INFO: renamed from: r */
        private int f39216r;

        /* JADX INFO: renamed from: s */
        private int f39217s;

        /* JADX INFO: renamed from: t */
        private boolean f39218t;

        /* JADX INFO: renamed from: y */
        private int f39219y;

        /* JADX INFO: renamed from: z */
        private qh4d.toq f39220z;

        /* JADX INFO: renamed from: k */
        private int f39211k = 0;

        /* JADX INFO: renamed from: q */
        private int f39215q = 0;

        /* JADX INFO: renamed from: n */
        private int f39213n = 0;

        toq() {
        }

        /* JADX INFO: renamed from: k */
        private void m25201k() {
            qh4d.toq toqVar = this.f39220z;
            if (toqVar != null) {
                this.f39216r = toqVar.getNestedScrollableValue();
            }
            ActionBarView actionBarView = this.f39209h;
            if (actionBarView == null) {
                this.f39210i.getLocationInWindow(SearchActionModeView.this.f39186j);
                int i2 = SearchActionModeView.this.f39186j[1];
                this.f39208g = i2;
                int i3 = i2 - SearchActionModeView.this.aj;
                this.f39208g = i3;
                int i4 = -i3;
                this.f39219y = i4;
                this.f39214p = i4;
                return;
            }
            int top = actionBarView.getTop();
            int collapsedHeight = this.f39209h.getCollapsedHeight();
            int expandedHeight = this.f39209h.getExpandedHeight();
            if (this.f39209h.getExpandState() == 0) {
                top += collapsedHeight;
            } else if (this.f39209h.getExpandState() == 1) {
                top += expandedHeight;
            }
            this.f39208g = top;
            int i5 = -top;
            this.f39219y = i5;
            this.f39214p = i5 + this.f39209h.getTop();
            if (this.f39220z == null || this.f39218t || !SearchActionModeView.this.bp) {
                return;
            }
            this.f39216r += -(expandedHeight - collapsedHeight);
        }

        @Override // miuix.view.InterfaceC7382k
        /* JADX INFO: renamed from: p */
        public void mo25168p(boolean z2, float f2) {
            if (!z2) {
                f2 = 1.0f - f2;
            }
            SearchActionModeView.this.setTranslationY(this.f39208g + (this.f39219y * f2));
            SearchActionModeView.this.az.setTranslationY(SearchActionModeView.this.getTranslationY() + SearchActionModeView.this.getHeight());
            int i2 = this.f39216r;
            int iMax = Math.max(i2, Math.round(i2 * f2));
            if (!SearchActionModeView.this.bp) {
                if (z2) {
                    if (this.f39220z != null) {
                        SearchActionModeView.this.setContentViewTranslation(((1.0f - f2) * this.f39217s) + (f2 * SearchActionModeView.this.getViewHeight()));
                        this.f39220z.mo26141k(iMax, 0);
                    } else {
                        SearchActionModeView searchActionModeView = SearchActionModeView.this;
                        searchActionModeView.setContentViewTranslation(searchActionModeView.getTranslationY() - ((1.0f - f2) * SearchActionModeView.this.f39197u));
                    }
                } else if (this.f39220z != null) {
                    SearchActionModeView.this.setContentViewTranslation((int) (SearchActionModeView.this.getViewHeight() + SearchActionModeView.this.f39197u + ((1.0f - f2) * ((this.f39208g - SearchActionModeView.this.getViewHeight()) - SearchActionModeView.this.f39197u))));
                    this.f39220z.mo26141k(iMax, 0);
                } else {
                    SearchActionModeView searchActionModeView2 = SearchActionModeView.this;
                    searchActionModeView2.setContentViewTranslation(searchActionModeView2.getTranslationY() - ((1.0f - f2) * SearchActionModeView.this.f39197u));
                }
            }
            if (SearchActionModeView.this.ac != null) {
                SearchActionModeView.this.ac.mo25151k(iMax);
            }
        }

        @Override // miuix.view.InterfaceC7382k
        /* JADX INFO: renamed from: q */
        public void mo25169q(boolean z2) {
            if (z2) {
                if (SearchActionModeView.this.ac != null) {
                    SearchActionModeView.this.ac.mo25151k(this.f39216r);
                    SearchActionModeView.this.ac.toq(true);
                }
                if (!SearchActionModeView.this.bp) {
                    SearchActionModeView.this.setContentViewTranslation(0.0f);
                    qh4d.toq toqVar = this.f39220z;
                    if (toqVar != null) {
                        toqVar.mo26141k(this.f39216r, 0);
                        SearchActionModeView searchActionModeView = SearchActionModeView.this;
                        searchActionModeView.dd(searchActionModeView.f39197u + SearchActionModeView.this.getViewHeight(), 0);
                    } else {
                        SearchActionModeView searchActionModeView2 = SearchActionModeView.this;
                        searchActionModeView2.dd(searchActionModeView2.f39197u, 0);
                    }
                }
                if (this.f39207f != null && SearchActionModeView.this.bp) {
                    View view = this.f39207f;
                    view.setPadding(view.getPaddingLeft(), Math.max(SearchActionModeView.this.getViewHeight() + SearchActionModeView.this.f39197u, SearchActionModeView.this.f39198v), this.f39207f.getPaddingRight(), SearchActionModeView.this.f39180d);
                }
            } else {
                if (SearchActionModeView.this.ac != null) {
                    SearchActionModeView.this.ac.mo25151k(0);
                }
                if (!SearchActionModeView.this.bp) {
                    qh4d.toq toqVar2 = this.f39220z;
                    if (toqVar2 != null) {
                        toqVar2.mo26141k(0, 0);
                    }
                    SearchActionModeView.this.setContentViewTranslation(0.0f);
                    SearchActionModeView searchActionModeView3 = SearchActionModeView.this;
                    searchActionModeView3.dd(searchActionModeView3.bv, SearchActionModeView.this.an);
                }
                if (this.f39207f != null && SearchActionModeView.this.bp) {
                    View view2 = this.f39207f;
                    view2.setPadding(view2.getPaddingLeft(), SearchActionModeView.this.f39198v, this.f39207f.getPaddingRight(), SearchActionModeView.this.f39180d);
                }
            }
            SearchActionModeView.this.setTranslationY(this.f39208g + this.f39219y);
            SearchActionModeView.this.az.setTranslationY(SearchActionModeView.this.getTranslationY() + SearchActionModeView.this.getHeight());
        }

        @Override // miuix.view.InterfaceC7382k
        public void x2(boolean z2) {
            ActionBarView actionBarView;
            this.f39209h = SearchActionModeView.this.getActionBarView();
            this.f39210i = SearchActionModeView.this.f39188l != null ? (View) SearchActionModeView.this.f39188l.get() : null;
            this.f39212l = SearchActionModeView.this.f39179c != null ? (View) SearchActionModeView.this.f39179c.get() : null;
            this.f39207f = SearchActionModeView.this.f39181e != null ? (View) SearchActionModeView.this.f39181e.get() : null;
            KeyEvent.Callback callback = SearchActionModeView.this.f39182f != null ? (View) SearchActionModeView.this.f39182f.get() : null;
            if (callback instanceof qh4d.toq) {
                this.f39220z = (qh4d.toq) callback;
            }
            if (SearchActionModeView.this.aj == Integer.MAX_VALUE) {
                ((View) SearchActionModeView.this.getParent()).getLocationInWindow(SearchActionModeView.this.f39186j);
                SearchActionModeView searchActionModeView = SearchActionModeView.this;
                searchActionModeView.aj = searchActionModeView.f39186j[1];
            }
            View view = this.f39210i;
            if (view != null) {
                view.setAlpha(0.0f);
            }
            if (z2 && (actionBarView = this.f39209h) != null) {
                this.f39218t = actionBarView.getExpandState() == 0;
            }
            if (this.f39210i != null) {
                m25201k();
            }
            if (!z2) {
                if (SearchActionModeView.this.ac != null) {
                    SearchActionModeView.this.ac.toq(false);
                }
                View view2 = this.f39210i;
                if (view2 != null) {
                    view2.setImportantForAccessibility(this.f39211k);
                }
                View view3 = this.f39212l;
                if (view3 != null) {
                    view3.setImportantForAccessibility(this.f39215q);
                }
                View view4 = this.f39207f;
                if (view4 != null) {
                    view4.setImportantForAccessibility(this.f39213n);
                }
                if (SearchActionModeView.this.bp || this.f39220z == null) {
                    return;
                }
                SearchActionModeView.this.setContentViewTranslation(r4.getViewHeight() + SearchActionModeView.this.f39197u);
                this.f39220z.mo26141k(0, 0);
                SearchActionModeView.this.dd(0, 0);
                return;
            }
            View view5 = this.f39210i;
            if (view5 != null) {
                this.f39211k = view5.getImportantForAccessibility();
                this.f39210i.setImportantForAccessibility(4);
            }
            View view6 = this.f39212l;
            if (view6 != null) {
                this.f39215q = view6.getImportantForAccessibility();
                this.f39212l.setImportantForAccessibility(4);
            }
            View view7 = this.f39207f;
            if (view7 != null) {
                this.f39213n = view7.getImportantForAccessibility();
                this.f39207f.setImportantForAccessibility(1);
            }
            SearchActionModeView.this.setTranslationY(this.f39208g);
            if (SearchActionModeView.this.bp) {
                return;
            }
            int i2 = this.f39208g - SearchActionModeView.this.f39197u;
            this.f39217s = i2;
            SearchActionModeView.this.setContentViewTranslation(i2);
            SearchActionModeView searchActionModeView2 = SearchActionModeView.this;
            searchActionModeView2.dd(searchActionModeView2.f39197u, 0);
        }
    }

    class zy implements InterfaceC7382k {
        zy() {
        }

        @Override // miuix.view.InterfaceC7382k
        /* JADX INFO: renamed from: p */
        public void mo25168p(boolean z2, float f2) {
            if (!z2) {
                f2 = 1.0f - f2;
            }
            SearchActionModeView.this.az.setAlpha(f2);
        }

        @Override // miuix.view.InterfaceC7382k
        /* JADX INFO: renamed from: q */
        public void mo25169q(boolean z2) {
            if (z2) {
                if (SearchActionModeView.this.f39187k.getText().length() > 0) {
                    SearchActionModeView.this.az.setVisibility(8);
                }
            } else {
                SearchActionModeView.this.az.setVisibility(8);
                SearchActionModeView.this.az.setAlpha(1.0f);
                SearchActionModeView.this.az.setTranslationY(0.0f);
            }
        }

        @Override // miuix.view.InterfaceC7382k
        public void x2(boolean z2) {
            if (z2) {
                SearchActionModeView.this.az.setOnClickListener(SearchActionModeView.this);
                SearchActionModeView.this.az.setVisibility(0);
                SearchActionModeView.this.az.setAlpha(0.0f);
            }
        }
    }

    public SearchActionModeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39183g = false;
        this.f39201y = null;
        this.f39195s = null;
        this.f39186j = new int[2];
        this.f39191o = true;
        this.f39197u = -1;
        this.aj = Integer.MAX_VALUE;
        setAlpha(0.0f);
        this.k0 = context.getResources().getDimensionPixelSize(toq.f7l8.tn);
        this.ar = context.getResources().getDimensionPixelSize(toq.f7l8.goq);
        Resources resources = context.getResources();
        int i2 = toq.f7l8.iby;
        this.bc = resources.getDimensionPixelSize(i2);
        this.f39192p = miuix.core.util.ld6.m25579n(context, i2);
        this.f39202z = 0;
        this.f39184h = false;
    }

    /* JADX INFO: renamed from: f */
    private void m25191f(int i2, float f2) {
        setPaddingRelative(((int) (this.f39192p * f2)) + i2, getPaddingTop(), getPaddingEnd(), getPaddingBottom());
        TextView textView = this.f39193q;
        n7h.C7166n c7166n = this.f39195s;
        textView.setPaddingRelative(c7166n.f87769toq, c7166n.f87770zy, c7166n.f40383q, c7166n.f40382n);
        int measuredWidth = this.f39193q.getMeasuredWidth();
        if (this.f39193q.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f39193q.getLayoutParams();
            marginLayoutParams.setMarginEnd(getResources().getDimensionPixelSize(toq.f7l8.y76) + i2);
            this.f39193q.setLayoutParams(marginLayoutParams);
            measuredWidth += marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
        }
        if (this.f39190n.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f39190n.getLayoutParams();
            marginLayoutParams2.setMarginEnd(Math.max(getPaddingStart(), measuredWidth));
            this.f39190n.setLayoutParams(marginLayoutParams2);
        }
    }

    private View getContentView() {
        WeakReference<View> weakReference = this.f39194r;
        if (weakReference != null && weakReference.get() != null) {
            return this.f39194r.get();
        }
        WeakReference<View> weakReference2 = this.f39196t;
        ViewGroup viewGroup = weakReference2 != null ? (ViewGroup) weakReference2.get() : null;
        if (viewGroup == null) {
            return null;
        }
        View viewFindViewById = viewGroup.findViewById(R.id.content);
        this.f39194r = new WeakReference<>(viewFindViewById);
        return viewFindViewById;
    }

    private void hyr(boolean z2) {
        if (z2) {
            WeakReference<View> weakReference = this.f39181e;
            View view = weakReference != null ? weakReference.get() : null;
            WeakReference<View> weakReference2 = this.f39188l;
            View view2 = weakReference2 != null ? weakReference2.get() : null;
            if (((view2 == null || view == null || view2.getParent() == view.getParent()) ? false : true) || view == null || !(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || this.bp) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.topMargin = getViewHeight();
            marginLayoutParams.bottomMargin = 0;
            view.setLayoutParams(marginLayoutParams);
            view.requestLayout();
        }
    }

    /* JADX INFO: renamed from: l */
    private void m25194l(float f2) {
        WeakReference<View> weakReference = this.f39196t;
        ActionBarOverlayLayout actionBarOverlayLayout = weakReference != null ? (ActionBarOverlayLayout) weakReference.get() : null;
        boolean zEqxt = actionBarOverlayLayout != null ? actionBarOverlayLayout.eqxt() : false;
        C7040n c7040n = this.f39185i;
        if (c7040n != null && c7040n.m25385s() && (zEqxt || this.f39184h)) {
            this.f39202z = (int) (this.f39185i.m25382g() * f2);
        } else {
            this.f39202z = 0;
        }
    }

    private void n5r1() {
        setPaddingRelative(getPaddingStart(), this.f39200x + this.f39197u, getPaddingEnd(), getPaddingBottom());
        getLayoutParams().height = this.k0 + this.f39197u;
    }

    /* JADX INFO: renamed from: r */
    private void m25197r() {
        this.aj = Integer.MAX_VALUE;
    }

    private boolean x9kr() {
        return this.f39188l != null;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        View view;
        if ((editable == null ? 0 : editable.length()) == 0) {
            View view2 = this.az;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            C7381k.m26780k(getContext()).m26781q(this.f39187k);
            return;
        }
        if (this.f86913bo != 0 || (view = this.az) == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        this.f86913bo = charSequence == null ? 0 : charSequence.length();
    }

    public void d2ok(Rect rect) {
        int i2 = this.f39197u;
        int i3 = rect.top;
        if (i2 != i3) {
            this.f39197u = i3;
            n5r1();
            if (!this.bp) {
                WeakReference<View> weakReference = this.f39182f;
                if ((weakReference != null ? weakReference.get() : null) instanceof qh4d.toq) {
                    dd(this.f39197u + getViewHeight(), 0);
                } else {
                    dd(this.f39197u, 0);
                }
            }
            hyr(this.f39183g);
            requestLayout();
        }
    }

    public TimeInterpolator d3() {
        EaseManager.InterpolateEaseStyle interpolateEaseStyle = new EaseManager.InterpolateEaseStyle(0, new float[0]);
        interpolateEaseStyle.setFactors(0.98f, 0.75f);
        return EaseManager.getInterpolator(interpolateEaseStyle);
    }

    protected void dd(int i2, int i3) {
        View contentView = getContentView();
        if (contentView != null) {
            contentView.setPaddingRelative(contentView.getPaddingStart(), i2 + this.bv, contentView.getPaddingEnd(), i3 + this.an);
        }
    }

    protected void eqxt() {
        getActionBarView();
        getActionBarContainer();
        getSplitActionBarContainer();
    }

    @Override // miuix.appcompat.internal.app.widget.zurt
    public void f7l8(ActionMode actionMode) {
        this.f39183g = true;
        hyr(true);
    }

    protected void fti() {
        if (this.bq == null) {
            this.bq = new ArrayList();
        }
        this.bq.add(new C6986q());
        if (x9kr()) {
            this.bq.add(new toq());
            this.bq.add(new C6984k());
            this.bq.add(new C6985n());
        }
        if (getDimView() != null) {
            this.bq.add(new zy());
        }
    }

    @Override // miuix.appcompat.internal.app.widget.zurt
    /* JADX INFO: renamed from: g */
    public void mo25118g(boolean z2) {
        List<InterfaceC7382k> list = this.bq;
        if (list == null) {
            return;
        }
        Iterator<InterfaceC7382k> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo25169q(z2);
        }
    }

    protected ActionBarContainer getActionBarContainer() {
        if (this.bl == null) {
            WeakReference<View> weakReference = this.f39196t;
            ViewGroup viewGroup = weakReference != null ? (ViewGroup) weakReference.get() : null;
            if (viewGroup != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= viewGroup.getChildCount()) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt.getId() == toq.C6054p.f76334hyr && (childAt instanceof ActionBarContainer)) {
                        this.bl = (ActionBarContainer) childAt;
                        break;
                    }
                    i2++;
                }
            }
            ActionBarContainer actionBarContainer = this.bl;
            if (actionBarContainer != null) {
                int i3 = ((ViewGroup.MarginLayoutParams) actionBarContainer.getLayoutParams()).topMargin;
                this.bs = i3;
                if (i3 > 0) {
                    setPaddingRelative(getPaddingStart(), this.f39200x + this.f39197u + this.bs, getPaddingEnd(), getPaddingBottom());
                }
            }
        }
        return this.bl;
    }

    protected ActionBarView getActionBarView() {
        if (this.bg == null) {
            WeakReference<View> weakReference = this.f39196t;
            ViewGroup viewGroup = weakReference != null ? (ViewGroup) weakReference.get() : null;
            if (viewGroup != null) {
                this.bg = (ActionBarView) viewGroup.findViewById(toq.C6054p.f76448x9kr);
            }
        }
        return this.bg;
    }

    public float getAnimationProgress() {
        return this.am;
    }

    public View getCustomView() {
        return this.ba;
    }

    protected View getDimView() {
        if (this.az == null) {
            WeakReference<View> weakReference = this.f39196t;
            ViewStub viewStub = null;
            ViewGroup viewGroup = weakReference != null ? (ViewGroup) weakReference.get() : null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount() - 1;
                while (true) {
                    if (childCount < 0) {
                        break;
                    }
                    if (viewGroup.getChildAt(childCount).getId() == toq.C6054p.zi4o) {
                        viewStub = (ViewStub) viewGroup.getChildAt(childCount);
                        break;
                    }
                    childCount--;
                }
                if (viewStub != null) {
                    this.az = viewStub.inflate();
                } else {
                    this.az = viewGroup.findViewById(toq.C6054p.rig);
                }
            }
        }
        FrameLayout frameLayout = this.ax;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        return this.az;
    }

    public EditText getSearchInput() {
        return this.f39187k;
    }

    protected ActionBarContainer getSplitActionBarContainer() {
        if (this.as == null) {
            WeakReference<View> weakReference = this.f39196t;
            ViewGroup viewGroup = weakReference != null ? (ViewGroup) weakReference.get() : null;
            if (viewGroup != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= viewGroup.getChildCount()) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt.getId() == toq.C6054p.cyg && (childAt instanceof ActionBarContainer)) {
                        this.as = (ActionBarContainer) childAt;
                        break;
                    }
                    i2++;
                }
            }
        }
        return this.as;
    }

    @Override // miuix.appcompat.internal.app.widget.zurt
    public int getViewHeight() {
        return this.k0;
    }

    protected ViewPager getViewPager() {
        WeakReference<View> weakReference = this.f39196t;
        ActionBarOverlayLayout actionBarOverlayLayout = weakReference != null ? (ActionBarOverlayLayout) weakReference.get() : null;
        if (actionBarOverlayLayout == null || !((C6998s) actionBarOverlayLayout.getActionBar()).uj2j()) {
            return null;
        }
        return (ViewPager) actionBarOverlayLayout.findViewById(toq.C6054p.xx);
    }

    protected ObjectAnimator gvn7() {
        ObjectAnimator objectAnimator = this.in;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.in = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "AnimationProgress", 0.0f, 1.0f);
        objectAnimatorOfFloat.addListener(this);
        objectAnimatorOfFloat.setDuration(C7162g.m25943k() ? 400L : 0L);
        objectAnimatorOfFloat.setInterpolator(d3());
        return objectAnimatorOfFloat;
    }

    protected void jp0y() {
        ObjectAnimator objectAnimator = this.in;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.in = null;
        }
    }

    @Override // miuix.appcompat.internal.app.widget.zurt
    /* JADX INFO: renamed from: k */
    public void mo25121k(InterfaceC7382k interfaceC7382k) {
        List<InterfaceC7382k> list;
        if (interfaceC7382k == null || (list = this.bq) == null) {
            return;
        }
        list.remove(interfaceC7382k);
    }

    @Override // miuix.appcompat.internal.app.widget.zurt
    public void ld6() {
        this.f39187k.setFocusable(false);
        this.f39187k.setFocusableInTouchMode(false);
        ObjectAnimator objectAnimator = this.in;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        FrameLayout frameLayout = this.ax;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    public void lvui() {
        if (this.ay) {
            ViewGroup viewGroup = (ViewGroup) this.az;
            FrameLayout frameLayout = this.ax;
            if (frameLayout != null) {
                View view = this.ba;
                if (view != null) {
                    frameLayout.removeView(view);
                }
                viewGroup.removeView(this.ax);
            }
            this.ba = null;
            this.ax = null;
            this.ay = false;
        }
    }

    @Override // miuix.appcompat.internal.app.widget.zurt
    /* JADX INFO: renamed from: n */
    public void mo25122n() {
        jp0y();
        this.f39183g = false;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        this.bl = null;
        this.bg = null;
        List<InterfaceC7382k> list = this.bq;
        if (list != null) {
            list.clear();
            this.bq = null;
        }
        if (this.ac != null) {
            this.ac = null;
        }
        this.as = null;
    }

    public void ncyb(boolean z2) {
        Drawable background = getBackground();
        if (z2) {
            background.setAlpha(0);
        } else {
            background.setAlpha(255);
        }
    }

    public void oc() {
        m25197r();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.be = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.be) {
            return;
        }
        this.in = null;
        mo25118g(this.id);
        if (this.id) {
            this.f39187k.setFocusable(true);
            this.f39187k.setFocusableInTouchMode(true);
            C7381k.m26780k(getContext()).m26781q(this.f39187k);
        } else {
            C7381k.m26780k(getContext()).zy(this.f39187k);
        }
        if (this.id) {
            return;
        }
        WeakReference<View> weakReference = this.f39196t;
        ActionBarOverlayLayout actionBarOverlayLayout = weakReference != null ? (ActionBarOverlayLayout) weakReference.get() : null;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setOverlayMode(this.bp);
            actionBarOverlayLayout.m25144c();
        }
        WeakReference<View> weakReference2 = this.f39188l;
        View view = weakReference2 != null ? weakReference2.get() : null;
        if (view != null) {
            view.setAlpha(1.0f);
        }
        setAlpha(0.0f);
        mo25122n();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.be = false;
        if (this.id) {
            setAlpha(1.0f);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.ad != null) {
            if (view.getId() == toq.C6054p.zaso || view.getId() == toq.C6054p.rig) {
                this.ad.onClick(view);
            }
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m25197r();
        this.f39191o = true;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f39201y = new n7h.C7166n(this);
        TextView textView = (TextView) findViewById(toq.C6054p.zaso);
        this.f39193q = textView;
        textView.setOnClickListener(this);
        this.f39195s = new n7h.C7166n(this.f39193q);
        ViewGroup viewGroup = (ViewGroup) findViewById(toq.C6054p.ae4);
        this.f39190n = viewGroup;
        C7380g.toq(viewGroup, false);
        this.f39187k = (EditText) findViewById(R.id.input);
        Folme.useAt(this.f39190n).touch().setScale(1.0f, new ITouchStyle.TouchType[0]).handleTouchOf(this.f39187k, new AnimConfig[0]);
        this.f39200x = this.f39201y.f87770zy;
        View contentView = getContentView();
        if (contentView != null) {
            this.bv = contentView.getPaddingTop();
            this.an = contentView.getPaddingBottom();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        View view = this.az;
        if (view != null) {
            view.setTranslationY((getTranslationY() + i5) - i3);
        }
        ObjectAnimator objectAnimator = this.in;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            float f2 = getResources().getDisplayMetrics().density;
            m25194l(f2);
            m25191f(this.f39202z, f2);
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // miuix.appcompat.internal.app.widget.zurt
    /* JADX INFO: renamed from: s */
    public void mo25124s(boolean z2, float f2) {
        List<InterfaceC7382k> list = this.bq;
        if (list == null) {
            return;
        }
        Iterator<InterfaceC7382k> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo25168p(z2, f2);
        }
    }

    public void setAnchorApplyExtraPaddingByUser(boolean z2) {
        if (this.f39184h != z2) {
            this.f39184h = z2;
            float f2 = getResources().getDisplayMetrics().density;
            m25194l(f2);
            m25191f(this.f39202z, f2);
        }
    }

    public void setAnchorView(View view) {
        if (view == null || view.findViewById(toq.C6054p.sm) == null) {
            return;
        }
        this.f39188l = new WeakReference<>(view);
        if (view.getParent() != null) {
            this.f39182f = new WeakReference<>((View) view.getParent());
        }
    }

    public void setAnimateView(View view) {
        if (view != null) {
            this.f39179c = new WeakReference<>(view);
        }
    }

    public void setAnimatedViewListener(n7h.InterfaceC7384k interfaceC7384k) {
        this.ac = interfaceC7384k;
    }

    public void setAnimationProgress(float f2) {
        this.am = f2;
        mo25124s(this.id, f2);
    }

    protected void setContentViewTranslation(float f2) {
        View contentView = getContentView();
        if (contentView != null) {
            contentView.setTranslationY(f2);
        }
    }

    public void setCustomView(View view) {
        if (view == null || this.ay) {
            return;
        }
        this.ba = view;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.ax = frameLayout;
        frameLayout.setLayoutParams(layoutParams);
        this.ax.setId(toq.C6054p.b6);
        this.ax.addView(this.ba, layoutParams);
        this.ax.setPadding(0, 0, 0, 0);
        getDimView();
        ((ViewGroup) this.az).addView(this.ax, layoutParams);
        this.ay = true;
    }

    public void setExtraPaddingPolicy(C7040n c7040n) {
        if (this.f39185i != c7040n) {
            this.f39185i = c7040n;
            float f2 = getResources().getDisplayMetrics().density;
            m25194l(f2);
            m25191f(this.f39202z, f2);
        }
    }

    public void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.ad = onClickListener;
    }

    public void setOverlayModeView(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f39196t = new WeakReference<>(actionBarOverlayLayout);
        this.bp = actionBarOverlayLayout.d2ok();
    }

    public void setResultView(View view) {
        if (view == null || (((View) view.getParent()) instanceof InterfaceC7614k)) {
            return;
        }
        this.f39181e = new WeakReference<>(view);
        this.f39198v = view.getPaddingTop();
        this.f39180d = view.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.f39199w = marginLayoutParams.topMargin;
            this.f86912ab = marginLayoutParams.bottomMargin;
        }
        this.bb = true;
    }

    @Override // miuix.appcompat.internal.app.widget.zurt
    public void toq(InterfaceC7382k interfaceC7382k) {
        if (interfaceC7382k == null) {
            return;
        }
        if (this.bq == null) {
            this.bq = new ArrayList();
        }
        if (this.bq.contains(interfaceC7382k)) {
            return;
        }
        this.bq.add(interfaceC7382k);
    }

    @Override // miuix.appcompat.internal.app.widget.zurt
    /* JADX INFO: renamed from: y */
    public void mo25127y(boolean z2) {
        eqxt();
        float f2 = getResources().getDisplayMetrics().density;
        m25194l(f2);
        m25191f(this.f39202z, f2);
        this.id = z2;
        this.in = gvn7();
        if (z2) {
            fti();
            WeakReference<View> weakReference = this.f39196t;
            ActionBarOverlayLayout actionBarOverlayLayout = weakReference != null ? (ActionBarOverlayLayout) weakReference.get() : null;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setOverlayMode(true);
            }
        }
        zy(z2);
        this.in.start();
        if (this.id) {
            return;
        }
        this.f39187k.clearFocus();
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f39187k.getWindowToken(), 0);
    }

    @Override // miuix.appcompat.internal.app.widget.zurt
    public void zy(boolean z2) {
        List<InterfaceC7382k> list = this.bq;
        if (list == null) {
            return;
        }
        Iterator<InterfaceC7382k> it = list.iterator();
        while (it.hasNext()) {
            it.next().x2(z2);
        }
    }
}
