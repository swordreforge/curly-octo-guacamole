package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.menu.C0122k;
import androidx.appcompat.view.menu.f7l8;
import androidx.appcompat.view.menu.n7h;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C0683f;
import androidx.core.view.gyi;
import androidx.core.view.xwq3;
import p023g.C6045k;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: compiled from: ToolbarWidgetWrapper.java */
/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class a98o implements d3 {

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final long f46831fn3e = 200;

    /* JADX INFO: renamed from: i */
    private static final int f952i = 3;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final String f46832t8r = "ToolbarWidgetWrapper";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private int f46833cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private Drawable f46834f7l8;

    /* JADX INFO: renamed from: g */
    private Drawable f953g;

    /* JADX INFO: renamed from: h */
    private int f954h;

    /* JADX INFO: renamed from: k */
    Toolbar f955k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private Drawable f46835ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private ActionMenuPresenter f46836kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private CharSequence f46837ld6;

    /* JADX INFO: renamed from: n */
    private View f956n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    boolean f46838n7h;

    /* JADX INFO: renamed from: p */
    CharSequence f957p;

    /* JADX INFO: renamed from: q */
    private Spinner f958q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    Window.Callback f46839qrj;

    /* JADX INFO: renamed from: s */
    private boolean f959s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f46840toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private CharSequence f46841x2;

    /* JADX INFO: renamed from: y */
    private Drawable f960y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private View f46842zy;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a98o$k */
    /* JADX INFO: compiled from: ToolbarWidgetWrapper.java */
    class ViewOnClickListenerC0183k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final C0122k f961k;

        ViewOnClickListenerC0183k() {
            this.f961k = new C0122k(a98o.this.f955k.getContext(), 0, R.id.home, 0, 0, a98o.this.f957p);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a98o a98oVar = a98o.this;
            Window.Callback callback = a98oVar.f46839qrj;
            if (callback == null || !a98oVar.f46838n7h) {
                return;
            }
            callback.onMenuItemSelected(0, this.f961k);
        }
    }

    /* JADX INFO: compiled from: ToolbarWidgetWrapper.java */
    class toq extends xwq3 {

        /* JADX INFO: renamed from: k */
        private boolean f963k = false;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ int f46843toq;

        toq(int i2) {
            this.f46843toq = i2;
        }

        @Override // androidx.core.view.xwq3, androidx.core.view.dr
        /* JADX INFO: renamed from: k */
        public void mo543k(View view) {
            this.f963k = true;
        }

        @Override // androidx.core.view.xwq3, androidx.core.view.dr
        public void toq(View view) {
            if (this.f963k) {
                return;
            }
            a98o.this.f955k.setVisibility(this.f46843toq);
        }

        @Override // androidx.core.view.xwq3, androidx.core.view.dr
        public void zy(View view) {
            a98o.this.f955k.setVisibility(0);
        }
    }

    public a98o(Toolbar toolbar, boolean z2) {
        this(toolbar, z2, C7397k.ld6.f92448toq, C7397k.g.f92419zurt);
    }

    private void dd() {
        if (this.f958q == null) {
            this.f958q = new AppCompatSpinner(getContext(), null, C7397k.toq.f92948qrj);
            this.f958q.setLayoutParams(new Toolbar.C0179n(-2, -2, 8388627));
        }
    }

    /* JADX INFO: renamed from: l */
    private void m530l() {
        if ((this.f46840toq & 4) == 0) {
            this.f955k.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f955k;
        Drawable drawable = this.f960y;
        if (drawable == null) {
            drawable = this.f46835ki;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void n5r1() {
        Drawable drawable;
        int i2 = this.f46840toq;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f46834f7l8) == null) {
            drawable = this.f953g;
        }
        this.f955k.setLogo(drawable);
    }

    private void ncyb() {
        if ((this.f46840toq & 4) != 0) {
            if (TextUtils.isEmpty(this.f46841x2)) {
                this.f955k.setNavigationContentDescription(this.f46833cdj);
            } else {
                this.f955k.setNavigationContentDescription(this.f46841x2);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    private int m531r() {
        if (this.f955k.getNavigationIcon() == null) {
            return 11;
        }
        this.f46835ki = this.f955k.getNavigationIcon();
        return 15;
    }

    private void x9kr(CharSequence charSequence) {
        this.f957p = charSequence;
        if ((this.f46840toq & 8) != 0) {
            this.f955k.setTitle(charSequence);
            if (this.f959s) {
                C0683f.ngy(this.f955k.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.widget.d3
    public void a9(int i2) {
        gyi gyiVarKja0 = kja0(i2, 200L);
        if (gyiVarKja0 != null) {
            gyiVarKja0.m3302z();
        }
    }

    @Override // androidx.appcompat.widget.d3
    public ViewGroup cdj() {
        return this.f955k;
    }

    @Override // androidx.appcompat.widget.d3
    public void collapseActionView() {
        this.f955k.m519p();
    }

    @Override // androidx.appcompat.widget.d3
    public void d2ok() {
        Log.i(f46832t8r, "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.d3
    public void d3(SparseArray<Parcelable> sparseArray) {
        this.f955k.restoreHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.d3
    public int eqxt() {
        return this.f46840toq;
    }

    @Override // androidx.appcompat.widget.d3
    public boolean f7l8() {
        return this.f955k.wvg();
    }

    @Override // androidx.appcompat.widget.d3
    public void fn3e() {
        Log.i(f46832t8r, "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.d3
    public void fti(int i2) {
        lvui(i2 != 0 ? C6045k.toq(getContext(), i2) : null);
    }

    @Override // androidx.appcompat.widget.d3
    public void fu4(int i2) {
        if (i2 == this.f46833cdj) {
            return;
        }
        this.f46833cdj = i2;
        if (TextUtils.isEmpty(this.f955k.getNavigationContentDescription())) {
            mo534i(this.f46833cdj);
        }
    }

    @Override // androidx.appcompat.widget.d3
    /* JADX INFO: renamed from: g */
    public boolean mo532g() {
        return this.f955k.a9();
    }

    @Override // androidx.appcompat.widget.d3
    public Context getContext() {
        return this.f955k.getContext();
    }

    @Override // androidx.appcompat.widget.d3
    public View getCustomView() {
        return this.f956n;
    }

    @Override // androidx.appcompat.widget.d3
    public CharSequence getTitle() {
        return this.f955k.getTitle();
    }

    @Override // androidx.appcompat.widget.d3
    public int getVisibility() {
        return this.f955k.getVisibility();
    }

    @Override // androidx.appcompat.widget.d3
    public void gvn7(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        dd();
        this.f958q.setAdapter(spinnerAdapter);
        this.f958q.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // androidx.appcompat.widget.d3
    /* JADX INFO: renamed from: h */
    public void mo533h(int i2) {
        View view;
        int i3 = this.f954h;
        if (i2 != i3) {
            if (i3 == 1) {
                Spinner spinner = this.f958q;
                if (spinner != null) {
                    ViewParent parent = spinner.getParent();
                    Toolbar toolbar = this.f955k;
                    if (parent == toolbar) {
                        toolbar.removeView(this.f958q);
                    }
                }
            } else if (i3 == 2 && (view = this.f46842zy) != null) {
                ViewParent parent2 = view.getParent();
                Toolbar toolbar2 = this.f955k;
                if (parent2 == toolbar2) {
                    toolbar2.removeView(this.f46842zy);
                }
            }
            this.f954h = i2;
            if (i2 != 0) {
                if (i2 == 1) {
                    dd();
                    this.f955k.addView(this.f958q, 0);
                    return;
                }
                if (i2 != 2) {
                    throw new IllegalArgumentException("Invalid navigation mode " + i2);
                }
                View view2 = this.f46842zy;
                if (view2 != null) {
                    this.f955k.addView(view2, 0);
                    Toolbar.C0179n c0179n = (Toolbar.C0179n) this.f46842zy.getLayoutParams();
                    ((ViewGroup.MarginLayoutParams) c0179n).width = -2;
                    ((ViewGroup.MarginLayoutParams) c0179n).height = -2;
                    c0179n.f281k = 8388691;
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.d3
    public boolean hideOverflowMenu() {
        return this.f955k.m523t();
    }

    @Override // androidx.appcompat.widget.d3
    /* JADX INFO: renamed from: i */
    public void mo534i(int i2) {
        mo537p(i2 == 0 ? null : getContext().getString(i2));
    }

    @Override // androidx.appcompat.widget.d3
    public boolean jk() {
        return this.f46842zy != null;
    }

    @Override // androidx.appcompat.widget.d3
    public void jp0y(n7h.InterfaceC0129k interfaceC0129k, f7l8.InterfaceC0118k interfaceC0118k) {
        this.f955k.setMenuCallbacks(interfaceC0129k, interfaceC0118k);
    }

    @Override // androidx.appcompat.widget.d3
    /* JADX INFO: renamed from: k */
    public int mo535k() {
        return this.f955k.getHeight();
    }

    @Override // androidx.appcompat.widget.d3
    public void ki(boolean z2) {
    }

    @Override // androidx.appcompat.widget.d3
    public gyi kja0(int i2, long j2) {
        return C0683f.f7l8(this.f955k).toq(i2 == 0 ? 1.0f : 0.0f).t8r(j2).fn3e(new toq(i2));
    }

    @Override // androidx.appcompat.widget.d3
    public void ld6(CharSequence charSequence) {
        this.f46837ld6 = charSequence;
        if ((this.f46840toq & 8) != 0) {
            this.f955k.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.d3
    public void lvui(Drawable drawable) {
        this.f960y = drawable;
        m530l();
    }

    @Override // androidx.appcompat.widget.d3
    public void mcp(SparseArray<Parcelable> sparseArray) {
        this.f955k.saveHierarchyState(sparseArray);
    }

    @Override // androidx.appcompat.widget.d3
    /* JADX INFO: renamed from: n */
    public boolean mo536n() {
        return this.f46834f7l8 != null;
    }

    @Override // androidx.appcompat.widget.d3
    public int n7h() {
        return this.f954h;
    }

    @Override // androidx.appcompat.widget.d3
    public void ni7(boolean z2) {
        this.f955k.setCollapsible(z2);
    }

    @Override // androidx.appcompat.widget.d3
    public void o1t(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f46842zy;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f955k;
            if (parent == toolbar) {
                toolbar.removeView(this.f46842zy);
            }
        }
        this.f46842zy = scrollingTabContainerView;
        if (scrollingTabContainerView == null || this.f954h != 2) {
            return;
        }
        this.f955k.addView(scrollingTabContainerView, 0);
        Toolbar.C0179n c0179n = (Toolbar.C0179n) this.f46842zy.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0179n).width = -2;
        ((ViewGroup.MarginLayoutParams) c0179n).height = -2;
        c0179n.f281k = 8388691;
        scrollingTabContainerView.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.d3
    public CharSequence oc() {
        return this.f955k.getSubtitle();
    }

    @Override // androidx.appcompat.widget.d3
    /* JADX INFO: renamed from: p */
    public void mo537p(CharSequence charSequence) {
        this.f46841x2 = charSequence;
        ncyb();
    }

    @Override // androidx.appcompat.widget.d3
    /* JADX INFO: renamed from: q */
    public boolean mo538q() {
        return this.f955k.fti();
    }

    @Override // androidx.appcompat.widget.d3
    public Menu qrj() {
        return this.f955k.getMenu();
    }

    @Override // androidx.appcompat.widget.d3
    /* JADX INFO: renamed from: s */
    public void mo539s(int i2) {
        View view;
        int i3 = this.f46840toq ^ i2;
        this.f46840toq = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    ncyb();
                }
                m530l();
            }
            if ((i3 & 3) != 0) {
                n5r1();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.f955k.setTitle(this.f957p);
                    this.f955k.setSubtitle(this.f46837ld6);
                } else {
                    this.f955k.setTitle((CharSequence) null);
                    this.f955k.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) == 0 || (view = this.f956n) == null) {
                return;
            }
            if ((i2 & 16) != 0) {
                this.f955k.addView(view);
            } else {
                this.f955k.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.d3
    public void setBackgroundDrawable(Drawable drawable) {
        C0683f.wlev(this.f955k, drawable);
    }

    @Override // androidx.appcompat.widget.d3
    public void setCustomView(View view) {
        View view2 = this.f956n;
        if (view2 != null && (this.f46840toq & 16) != 0) {
            this.f955k.removeView(view2);
        }
        this.f956n = view;
        if (view == null || (this.f46840toq & 16) == 0) {
            return;
        }
        this.f955k.addView(view);
    }

    @Override // androidx.appcompat.widget.d3
    public void setIcon(int i2) {
        setIcon(i2 != 0 ? C6045k.toq(getContext(), i2) : null);
    }

    @Override // androidx.appcompat.widget.d3
    public void setLogo(int i2) {
        wvg(i2 != 0 ? C6045k.toq(getContext(), i2) : null);
    }

    @Override // androidx.appcompat.widget.d3
    public void setMenu(Menu menu, n7h.InterfaceC0129k interfaceC0129k) {
        if (this.f46836kja0 == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f955k.getContext());
            this.f46836kja0 = actionMenuPresenter;
            actionMenuPresenter.t8r(C7397k.f7l8.f42332p);
        }
        this.f46836kja0.mo356s(interfaceC0129k);
        this.f955k.setMenu((androidx.appcompat.view.menu.f7l8) menu, this.f46836kja0);
    }

    @Override // androidx.appcompat.widget.d3
    public void setMenuPrepared() {
        this.f46838n7h = true;
    }

    @Override // androidx.appcompat.widget.d3
    public void setTitle(CharSequence charSequence) {
        this.f959s = true;
        x9kr(charSequence);
    }

    @Override // androidx.appcompat.widget.d3
    public void setVisibility(int i2) {
        this.f955k.setVisibility(i2);
    }

    @Override // androidx.appcompat.widget.d3
    public void setWindowCallback(Window.Callback callback) {
        this.f46839qrj = callback;
    }

    @Override // androidx.appcompat.widget.d3
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f959s) {
            return;
        }
        x9kr(charSequence);
    }

    @Override // androidx.appcompat.widget.d3
    public boolean showOverflowMenu() {
        return this.f955k.ncyb();
    }

    @Override // androidx.appcompat.widget.d3
    /* JADX INFO: renamed from: t */
    public void mo540t(Drawable drawable) {
        if (this.f46835ki != drawable) {
            this.f46835ki = drawable;
            m530l();
        }
    }

    @Override // androidx.appcompat.widget.d3
    public int t8r() {
        Spinner spinner = this.f958q;
        if (spinner != null) {
            return spinner.getSelectedItemPosition();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.d3
    public boolean toq() {
        return this.f953g != null;
    }

    @Override // androidx.appcompat.widget.d3
    public void wvg(Drawable drawable) {
        this.f46834f7l8 = drawable;
        n5r1();
    }

    @Override // androidx.appcompat.widget.d3
    public void x2(int i2) {
        Spinner spinner = this.f958q;
        if (spinner == null) {
            throw new IllegalStateException("Can't set dropdown selected position without an adapter");
        }
        spinner.setSelection(i2);
    }

    @Override // androidx.appcompat.widget.d3
    /* JADX INFO: renamed from: y */
    public boolean mo541y() {
        return this.f955k.jp0y();
    }

    @Override // androidx.appcompat.widget.d3
    /* JADX INFO: renamed from: z */
    public void mo542z() {
        this.f955k.ld6();
    }

    @Override // androidx.appcompat.widget.d3
    public int zurt() {
        Spinner spinner = this.f958q;
        if (spinner != null) {
            return spinner.getCount();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.d3
    public boolean zy() {
        return this.f955k.m522s();
    }

    public a98o(Toolbar toolbar, boolean z2, int i2, int i3) {
        Drawable drawable;
        this.f954h = 0;
        this.f46833cdj = 0;
        this.f955k = toolbar;
        this.f957p = toolbar.getTitle();
        this.f46837ld6 = toolbar.getSubtitle();
        this.f959s = this.f957p != null;
        this.f960y = toolbar.getNavigationIcon();
        C0184b c0184bJp0y = C0184b.jp0y(toolbar.getContext(), null, C7397k.qrj.f42457k, C7397k.toq.f42483g, 0);
        this.f46835ki = c0184bJp0y.m553y(C7397k.qrj.f92783x9kr);
        if (z2) {
            CharSequence charSequenceFu4 = c0184bJp0y.fu4(C7397k.qrj.f92795yz);
            if (!TextUtils.isEmpty(charSequenceFu4)) {
                setTitle(charSequenceFu4);
            }
            CharSequence charSequenceFu42 = c0184bJp0y.fu4(C7397k.qrj.f42461o);
            if (!TextUtils.isEmpty(charSequenceFu42)) {
                ld6(charSequenceFu42);
            }
            Drawable drawableM553y = c0184bJp0y.m553y(C7397k.qrj.f42452f);
            if (drawableM553y != null) {
                wvg(drawableM553y);
            }
            Drawable drawableM553y2 = c0184bJp0y.m553y(C7397k.qrj.f42458l);
            if (drawableM553y2 != null) {
                setIcon(drawableM553y2);
            }
            if (this.f960y == null && (drawable = this.f46835ki) != null) {
                lvui(drawable);
            }
            mo539s(c0184bJp0y.kja0(C7397k.qrj.f92663gvn7, 0));
            int iFn3e = c0184bJp0y.fn3e(C7397k.qrj.f92654fti, 0);
            if (iFn3e != 0) {
                setCustomView(LayoutInflater.from(this.f955k.getContext()).inflate(iFn3e, (ViewGroup) this.f955k, false));
                mo539s(this.f46840toq | 16);
            }
            int iCdj = c0184bJp0y.cdj(C7397k.qrj.f42464r, 0);
            if (iCdj > 0) {
                ViewGroup.LayoutParams layoutParams = this.f955k.getLayoutParams();
                layoutParams.height = iCdj;
                this.f955k.setLayoutParams(layoutParams);
            }
            int iM544g = c0184bJp0y.m544g(C7397k.qrj.f92680jk, -1);
            int iM544g2 = c0184bJp0y.m544g(C7397k.qrj.f92727o1t, -1);
            if (iM544g >= 0 || iM544g2 >= 0) {
                this.f955k.setContentInsetsRelative(Math.max(iM544g, 0), Math.max(iM544g2, 0));
            }
            int iFn3e2 = c0184bJp0y.fn3e(C7397k.qrj.f92615bf2, 0);
            if (iFn3e2 != 0) {
                Toolbar toolbar2 = this.f955k;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), iFn3e2);
            }
            int iFn3e3 = c0184bJp0y.fn3e(C7397k.qrj.f42459m, 0);
            if (iFn3e3 != 0) {
                Toolbar toolbar3 = this.f955k;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), iFn3e3);
            }
            int iFn3e4 = c0184bJp0y.fn3e(C7397k.qrj.f92772vyq, 0);
            if (iFn3e4 != 0) {
                this.f955k.setPopupTheme(iFn3e4);
            }
        } else {
            this.f46840toq = m531r();
        }
        c0184bJp0y.d3();
        fu4(i2);
        this.f46841x2 = this.f955k.getNavigationContentDescription();
        this.f955k.setNavigationOnClickListener(new ViewOnClickListenerC0183k());
    }

    @Override // androidx.appcompat.widget.d3
    public void setIcon(Drawable drawable) {
        this.f953g = drawable;
        n5r1();
    }
}
