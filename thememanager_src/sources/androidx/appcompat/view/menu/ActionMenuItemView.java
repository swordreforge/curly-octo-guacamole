package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.f7l8;
import androidx.appcompat.view.menu.kja0;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0182a;
import androidx.appcompat.widget.dd;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class ActionMenuItemView extends AppCompatTextView implements kja0.InterfaceC0124k, View.OnClickListener, ActionMenuView.InterfaceC0149k {

    /* JADX INFO: renamed from: m */
    private static final int f419m = 32;

    /* JADX INFO: renamed from: o */
    private static final String f420o = "ActionMenuItemView";

    /* JADX INFO: renamed from: c */
    private int f421c;

    /* JADX INFO: renamed from: e */
    private int f422e;

    /* JADX INFO: renamed from: f */
    private boolean f423f;

    /* JADX INFO: renamed from: h */
    private CharSequence f424h;

    /* JADX INFO: renamed from: i */
    private Drawable f425i;

    /* JADX INFO: renamed from: j */
    private int f426j;

    /* JADX INFO: renamed from: l */
    private boolean f427l;

    /* JADX INFO: renamed from: p */
    C0130p f428p;

    /* JADX INFO: renamed from: r */
    toq f429r;

    /* JADX INFO: renamed from: t */
    private dd f430t;

    /* JADX INFO: renamed from: z */
    f7l8.toq f431z;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ActionMenuItemView$k */
    private class C0117k extends dd {
        public C0117k() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.dd
        public cdj toq() {
            toq toqVar = ActionMenuItemView.this.f429r;
            if (toqVar != null) {
                return toqVar.mo313k();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.dd
        protected boolean zy() {
            cdj qVar;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            f7l8.toq toqVar = actionMenuItemView.f431z;
            return toqVar != null && toqVar.mo314q(actionMenuItemView.f428p) && (qVar = toq()) != null && qVar.isShowing();
        }
    }

    public static abstract class toq {
        /* JADX INFO: renamed from: k */
        public abstract cdj mo313k();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: p */
    private void m307p() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f424h);
        if (this.f425i != null && (!this.f428p.a9() || (!this.f427l && !this.f423f))) {
            z2 = false;
        }
        boolean z5 = z3 & z2;
        setText(z5 ? this.f424h : null);
        CharSequence contentDescription = this.f428p.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z5 ? null : this.f428p.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f428p.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            C0182a.m528k(this, z5 ? null : this.f428p.getTitle());
        } else {
            C0182a.m528k(this, tooltipText);
        }
    }

    /* JADX INFO: renamed from: s */
    private boolean m308s() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    /* JADX INFO: renamed from: g */
    public void mo309g(C0130p c0130p, int i2) {
        this.f428p = c0130p;
        setIcon(c0130p.getIcon());
        setTitle(c0130p.x2(this));
        setId(c0130p.getItemId());
        setVisibility(c0130p.isVisible() ? 0 : 8);
        setEnabled(c0130p.isEnabled());
        if (c0130p.hasSubMenu() && this.f430t == null) {
            this.f430t = new C0117k();
        }
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    public C0130p getItemData() {
        return this.f428p;
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    /* JADX INFO: renamed from: k */
    public boolean mo310k() {
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        f7l8.toq toqVar = this.f431z;
        if (toqVar != null) {
            toqVar.mo314q(this.f428p);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f427l = m308s();
        m307p();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        int i4;
        boolean zM312y = m312y();
        if (zM312y && (i4 = this.f422e) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f421c) : this.f421c;
        if (mode != 1073741824 && this.f421c > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i3);
        }
        if (zM312y || this.f425i == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f425i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        dd ddVar;
        if (this.f428p.hasSubMenu() && (ddVar = this.f430t) != null && ddVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0149k
    /* JADX INFO: renamed from: q */
    public boolean mo311q() {
        return m312y() && this.f428p.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    public void setCheckable(boolean z2) {
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f423f != z2) {
            this.f423f = z2;
            C0130p c0130p = this.f428p;
            if (c0130p != null) {
                c0130p.m372n();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    public void setIcon(Drawable drawable) {
        this.f425i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f426j;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, null, null, null);
        m307p();
    }

    public void setItemInvoker(f7l8.toq toqVar) {
        this.f431z = toqVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        this.f422e = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(toq toqVar) {
        this.f429r = toqVar;
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    public void setShortcut(boolean z2, char c2) {
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    public void setTitle(CharSequence charSequence) {
        this.f424h = charSequence;
        m307p();
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    public boolean toq() {
        return true;
    }

    /* JADX INFO: renamed from: y */
    public boolean m312y() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0149k
    public boolean zy() {
        return m312y();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Resources resources = context.getResources();
        this.f427l = m308s();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7397k.qrj.f92802zp, i2, 0);
        this.f421c = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7397k.qrj.f42470x, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f426j = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f422e = -1;
        setSaveEnabled(false);
    }
}
