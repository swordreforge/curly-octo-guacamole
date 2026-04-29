package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.zy;
import androidx.core.view.C0683f;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class ActivityChooserView extends ViewGroup implements zy.InterfaceC0227k {

    /* JADX INFO: renamed from: c */
    boolean f681c;

    /* JADX INFO: renamed from: e */
    int f682e;

    /* JADX INFO: renamed from: f */
    PopupWindow.OnDismissListener f683f;

    /* JADX INFO: renamed from: g */
    private final Drawable f684g;

    /* JADX INFO: renamed from: h */
    private final ImageView f685h;

    /* JADX INFO: renamed from: i */
    private final int f686i;

    /* JADX INFO: renamed from: j */
    private boolean f687j;

    /* JADX INFO: renamed from: k */
    final C0152g f688k;

    /* JADX INFO: renamed from: l */
    private n5r1 f689l;

    /* JADX INFO: renamed from: n */
    private final View f690n;

    /* JADX INFO: renamed from: o */
    private int f691o;

    /* JADX INFO: renamed from: p */
    final FrameLayout f692p;

    /* JADX INFO: renamed from: q */
    private final f7l8 f693q;

    /* JADX INFO: renamed from: r */
    private final ViewTreeObserver.OnGlobalLayoutListener f694r;

    /* JADX INFO: renamed from: s */
    private final ImageView f695s;

    /* JADX INFO: renamed from: t */
    final DataSetObserver f696t;

    /* JADX INFO: renamed from: y */
    final FrameLayout f697y;

    /* JADX INFO: renamed from: z */
    androidx.core.view.toq f698z;

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public static class InnerLayout extends LinearLayout {

        /* JADX INFO: renamed from: k */
        private static final int[] f699k = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C0184b c0184bFti = C0184b.fti(context, attributeSet, f699k);
            setBackgroundDrawable(c0184bFti.m553y(0));
            c0184bFti.d3();
        }
    }

    private class f7l8 implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        f7l8() {
        }

        /* JADX INFO: renamed from: k */
        private void m437k() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f683f;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f692p) {
                if (view != activityChooserView.f697y) {
                    throw new IllegalArgumentException();
                }
                activityChooserView.f681c = false;
                activityChooserView.m436q(activityChooserView.f682e);
                return;
            }
            activityChooserView.m434k();
            Intent qVar = ActivityChooserView.this.f688k.toq().toq(ActivityChooserView.this.f688k.toq().f7l8(ActivityChooserView.this.f688k.zy()));
            if (qVar != null) {
                qVar.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(qVar);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            m437k();
            androidx.core.view.toq toqVar = ActivityChooserView.this.f698z;
            if (toqVar != null) {
                toqVar.qrj(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            int itemViewType = ((C0152g) adapterView.getAdapter()).getItemViewType(i2);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                ActivityChooserView.this.m436q(Integer.MAX_VALUE);
                return;
            }
            ActivityChooserView.this.m434k();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.f681c) {
                if (i2 > 0) {
                    activityChooserView.f688k.toq().ki(i2);
                    return;
                }
                return;
            }
            if (!activityChooserView.f688k.m440n()) {
                i2++;
            }
            Intent qVar = ActivityChooserView.this.f688k.toq().toq(i2);
            if (qVar != null) {
                qVar.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(qVar);
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f692p) {
                throw new IllegalArgumentException();
            }
            if (activityChooserView.f688k.getCount() > 0) {
                ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                activityChooserView2.f681c = true;
                activityChooserView2.m436q(activityChooserView2.f682e);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$g */
    private class C0152g extends BaseAdapter {

        /* JADX INFO: renamed from: h */
        public static final int f701h = 4;

        /* JADX INFO: renamed from: i */
        private static final int f702i = 0;

        /* JADX INFO: renamed from: p */
        public static final int f703p = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: t */
        private static final int f704t = 3;

        /* JADX INFO: renamed from: z */
        private static final int f705z = 1;

        /* JADX INFO: renamed from: g */
        private boolean f706g;

        /* JADX INFO: renamed from: k */
        private androidx.appcompat.widget.zy f707k;

        /* JADX INFO: renamed from: n */
        private boolean f708n;

        /* JADX INFO: renamed from: q */
        private int f709q = 4;

        /* JADX INFO: renamed from: y */
        private boolean f711y;

        C0152g() {
        }

        public void f7l8(androidx.appcompat.widget.zy zyVar) {
            androidx.appcompat.widget.zy qVar = ActivityChooserView.this.f688k.toq();
            if (qVar != null && ActivityChooserView.this.isShown()) {
                qVar.unregisterObserver(ActivityChooserView.this.f696t);
            }
            this.f707k = zyVar;
            if (zyVar != null && ActivityChooserView.this.isShown()) {
                zyVar.registerObserver(ActivityChooserView.this.f696t);
            }
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: g */
        public int m438g() {
            int i2 = this.f709q;
            this.f709q = Integer.MAX_VALUE;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            int iMax = 0;
            View view = null;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, null);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                iMax = Math.max(iMax, view.getMeasuredWidth());
            }
            this.f709q = i2;
            return iMax;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int iM754g = this.f707k.m754g();
            if (!this.f708n && this.f707k.m759y() != null) {
                iM754g--;
            }
            int iMin = Math.min(iM754g, this.f709q);
            return this.f711y ? iMin + 1 : iMin;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            int itemViewType = getItemViewType(i2);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (!this.f708n && this.f707k.m759y() != null) {
                i2++;
            }
            return this.f707k.m756n(i2);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i2) {
            return (this.f711y && i2 == getCount() - 1) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i2);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                if (view != null && view.getId() == 1) {
                    return view;
                }
                View viewInflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C7397k.p.f42420y, viewGroup, false);
                viewInflate.setId(1);
                ((TextView) viewInflate.findViewById(C7397k.f7l8.f92342t8iq)).setText(ActivityChooserView.this.getContext().getString(C7397k.ld6.f42379n));
                return viewInflate;
            }
            if (view == null || view.getId() != C7397k.f7l8.f92319gvn7) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C7397k.p.f42420y, viewGroup, false);
            }
            PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(C7397k.f7l8.f92302a9);
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i2);
            imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((TextView) view.findViewById(C7397k.f7l8.f92342t8iq)).setText(resolveInfo.loadLabel(packageManager));
            if (this.f708n && i2 == 0 && this.f706g) {
                view.setActivated(true);
            } else {
                view.setActivated(false);
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }

        /* JADX INFO: renamed from: k */
        public int m439k() {
            return this.f707k.m754g();
        }

        /* JADX INFO: renamed from: n */
        public boolean m440n() {
            return this.f708n;
        }

        /* JADX INFO: renamed from: p */
        public void m441p(boolean z2) {
            if (this.f711y != z2) {
                this.f711y = z2;
                notifyDataSetChanged();
            }
        }

        /* JADX INFO: renamed from: q */
        public int m442q() {
            return this.f707k.m757p();
        }

        /* JADX INFO: renamed from: s */
        public void m443s(boolean z2, boolean z3) {
            if (this.f708n == z2 && this.f706g == z3) {
                return;
            }
            this.f708n = z2;
            this.f706g = z3;
            notifyDataSetChanged();
        }

        public androidx.appcompat.widget.zy toq() {
            return this.f707k;
        }

        /* JADX INFO: renamed from: y */
        public void m444y(int i2) {
            if (this.f709q != i2) {
                this.f709q = i2;
                notifyDataSetChanged();
            }
        }

        public ResolveInfo zy() {
            return this.f707k.m759y();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$k */
    class C0153k extends DataSetObserver {
        C0153k() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f688k.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f688k.notifyDataSetInvalidated();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$n */
    class C0154n extends DataSetObserver {
        C0154n() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.m435n();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$q */
    class C0155q extends dd {
        C0155q(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.dd
        /* JADX INFO: renamed from: q */
        protected boolean mo432q() {
            ActivityChooserView.this.m434k();
            return true;
        }

        @Override // androidx.appcompat.widget.dd
        public androidx.appcompat.view.menu.cdj toq() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override // androidx.appcompat.widget.dd
        protected boolean zy() {
            ActivityChooserView.this.zy();
            return true;
        }
    }

    class toq implements ViewTreeObserver.OnGlobalLayoutListener {
        toq() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ActivityChooserView.this.toq()) {
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().dismiss();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().mo318g();
                androidx.core.view.toq toqVar = ActivityChooserView.this.f698z;
                if (toqVar != null) {
                    toqVar.qrj(true);
                }
            }
        }
    }

    class zy extends View.AccessibilityDelegate {
        zy() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            androidx.core.view.accessibility.ki.r25n(accessibilityNodeInfo).m4(true);
        }
    }

    public ActivityChooserView(@zy.lvui Context context) {
        this(context, null);
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY})
    public androidx.appcompat.widget.zy getDataModel() {
        return this.f688k.toq();
    }

    n5r1 getListPopupWindow() {
        if (this.f689l == null) {
            n5r1 n5r1Var = new n5r1(getContext());
            this.f689l = n5r1Var;
            n5r1Var.x2(this.f688k);
            this.f689l.x9kr(this);
            this.f689l.nn86(true);
            this.f689l.m670j(this.f693q);
            this.f689l.hb(this.f693q);
        }
        return this.f689l;
    }

    /* JADX INFO: renamed from: k */
    public boolean m434k() {
        if (!toq()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f694r);
        return true;
    }

    /* JADX INFO: renamed from: n */
    void m435n() {
        if (this.f688k.getCount() > 0) {
            this.f697y.setEnabled(true);
        } else {
            this.f697y.setEnabled(false);
        }
        int iM439k = this.f688k.m439k();
        int iM442q = this.f688k.m442q();
        if (iM439k == 1 || (iM439k > 1 && iM442q > 0)) {
            this.f692p.setVisibility(0);
            ResolveInfo resolveInfoZy = this.f688k.zy();
            PackageManager packageManager = getContext().getPackageManager();
            this.f685h.setImageDrawable(resolveInfoZy.loadIcon(packageManager));
            if (this.f691o != 0) {
                this.f692p.setContentDescription(getContext().getString(this.f691o, resolveInfoZy.loadLabel(packageManager)));
            }
        } else {
            this.f692p.setVisibility(8);
        }
        if (this.f692p.getVisibility() == 0) {
            this.f690n.setBackgroundDrawable(this.f684g);
        } else {
            this.f690n.setBackgroundDrawable(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        androidx.appcompat.widget.zy qVar = this.f688k.toq();
        if (qVar != null) {
            qVar.registerObserver(this.f696t);
        }
        this.f687j = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.zy qVar = this.f688k.toq();
        if (qVar != null) {
            qVar.unregisterObserver(this.f696t);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f694r);
        }
        if (toq()) {
            m434k();
        }
        this.f687j = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        this.f690n.layout(0, 0, i4 - i2, i5 - i3);
        if (toq()) {
            return;
        }
        m434k();
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        View view = this.f690n;
        if (this.f692p.getVisibility() != 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
        }
        measureChild(view, i2, i3);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: q */
    void m436q(int i2) {
        if (this.f688k.toq() == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.f694r);
        ?? r0 = this.f692p.getVisibility() == 0 ? 1 : 0;
        int iM439k = this.f688k.m439k();
        if (i2 == Integer.MAX_VALUE || iM439k <= i2 + r0) {
            this.f688k.m441p(false);
            this.f688k.m444y(i2);
        } else {
            this.f688k.m441p(true);
            this.f688k.m444y(i2 - 1);
        }
        n5r1 listPopupWindow = getListPopupWindow();
        if (listPopupWindow.isShowing()) {
            return;
        }
        if (this.f681c || r0 == 0) {
            this.f688k.m443s(true, r0);
        } else {
            this.f688k.m443s(false, false);
        }
        listPopupWindow.m672l(Math.min(this.f688k.m438g(), this.f686i));
        listPopupWindow.mo318g();
        androidx.core.view.toq toqVar = this.f698z;
        if (toqVar != null) {
            toqVar.qrj(true);
        }
        listPopupWindow.n7h().setContentDescription(getContext().getString(C7397k.ld6.f42375g));
        listPopupWindow.n7h().setSelector(new ColorDrawable(0));
    }

    @Override // androidx.appcompat.widget.zy.InterfaceC0227k
    @zy.uv6({uv6.EnumC7844k.LIBRARY})
    public void setActivityChooserModel(androidx.appcompat.widget.zy zyVar) {
        this.f688k.f7l8(zyVar);
        if (toq()) {
            m434k();
            zy();
        }
    }

    public void setDefaultActionButtonContentDescription(int i2) {
        this.f691o = i2;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i2) {
        this.f695s.setContentDescription(getContext().getString(i2));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f695s.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i2) {
        this.f682e = i2;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f683f = onDismissListener;
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setProvider(androidx.core.view.toq toqVar) {
        this.f698z = toqVar;
    }

    public boolean toq() {
        return getListPopupWindow().isShowing();
    }

    public boolean zy() {
        if (toq() || !this.f687j) {
            return false;
        }
        this.f681c = false;
        m436q(this.f682e);
        return true;
    }

    public ActivityChooserView(@zy.lvui Context context, @zy.dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(@zy.lvui Context context, @zy.dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f696t = new C0153k();
        this.f694r = new toq();
        this.f682e = 4;
        int[] iArr = C7397k.qrj.f92740qkj8;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        C0683f.ij(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        this.f682e = typedArrayObtainStyledAttributes.getInt(C7397k.qrj.f92741qo, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C7397k.qrj.f92653fnq8);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(C7397k.p.f92528f7l8, (ViewGroup) this, true);
        f7l8 f7l8Var = new f7l8();
        this.f693q = f7l8Var;
        View viewFindViewById = findViewById(C7397k.f7l8.f92334n7h);
        this.f690n = viewFindViewById;
        this.f684g = viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(C7397k.f7l8.f42340z);
        this.f692p = frameLayout;
        frameLayout.setOnClickListener(f7l8Var);
        frameLayout.setOnLongClickListener(f7l8Var);
        int i3 = C7397k.f7l8.f92317fti;
        this.f685h = (ImageView) frameLayout.findViewById(i3);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(C7397k.f7l8.f92347wvg);
        frameLayout2.setOnClickListener(f7l8Var);
        frameLayout2.setAccessibilityDelegate(new zy());
        frameLayout2.setOnTouchListener(new C0155q(frameLayout2));
        this.f697y = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(i3);
        this.f695s = imageView;
        imageView.setImageDrawable(drawable);
        C0152g c0152g = new C0152g();
        this.f688k = c0152g;
        c0152g.registerDataSetObserver(new C0154n());
        Resources resources = context.getResources();
        this.f686i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C7397k.n.f92471fu4));
    }
}
