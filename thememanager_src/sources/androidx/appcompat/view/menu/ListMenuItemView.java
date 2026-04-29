package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.kja0;
import androidx.appcompat.widget.C0184b;
import androidx.core.view.C0683f;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class ListMenuItemView extends LinearLayout implements kja0.InterfaceC0124k, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: o */
    private static final String f436o = "ListMenuItemView";

    /* JADX INFO: renamed from: c */
    private boolean f437c;

    /* JADX INFO: renamed from: e */
    private LayoutInflater f438e;

    /* JADX INFO: renamed from: f */
    private Drawable f439f;

    /* JADX INFO: renamed from: g */
    private TextView f440g;

    /* JADX INFO: renamed from: h */
    private ImageView f441h;

    /* JADX INFO: renamed from: i */
    private LinearLayout f442i;

    /* JADX INFO: renamed from: j */
    private boolean f443j;

    /* JADX INFO: renamed from: k */
    private C0130p f444k;

    /* JADX INFO: renamed from: l */
    private boolean f445l;

    /* JADX INFO: renamed from: n */
    private RadioButton f446n;

    /* JADX INFO: renamed from: p */
    private ImageView f447p;

    /* JADX INFO: renamed from: q */
    private ImageView f448q;

    /* JADX INFO: renamed from: r */
    private Context f449r;

    /* JADX INFO: renamed from: s */
    private TextView f450s;

    /* JADX INFO: renamed from: t */
    private int f451t;

    /* JADX INFO: renamed from: y */
    private CheckBox f452y;

    /* JADX INFO: renamed from: z */
    private Drawable f453z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7397k.toq.f92851ew);
    }

    private void f7l8() {
        ImageView imageView = (ImageView) getInflater().inflate(C7397k.p.f42412h, (ViewGroup) this, false);
        this.f448q = imageView;
        m316q(imageView, 0);
    }

    private LayoutInflater getInflater() {
        if (this.f438e == null) {
            this.f438e = LayoutInflater.from(getContext());
        }
        return this.f438e;
    }

    /* JADX INFO: renamed from: n */
    private void m315n() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C7397k.p.f92534kja0, (ViewGroup) this, false);
        this.f452y = checkBox;
        zy(checkBox);
    }

    /* JADX INFO: renamed from: q */
    private void m316q(View view, int i2) {
        LinearLayout linearLayout = this.f442i;
        if (linearLayout != null) {
            linearLayout.addView(view, i2);
        } else {
            addView(view, i2);
        }
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f447p;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: y */
    private void m317y() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C7397k.p.f92533ki, (ViewGroup) this, false);
        this.f446n = radioButton;
        zy(radioButton);
    }

    private void zy(View view) {
        m316q(view, -1);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f441h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f441h.getLayoutParams();
        rect.top += this.f441h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    /* JADX INFO: renamed from: g */
    public void mo309g(C0130p c0130p, int i2) {
        this.f444k = c0130p;
        setVisibility(c0130p.isVisible() ? 0 : 8);
        setTitle(c0130p.x2(this));
        setCheckable(c0130p.isCheckable());
        setShortcut(c0130p.jk(), c0130p.m373p());
        setIcon(c0130p.getIcon());
        setEnabled(c0130p.isEnabled());
        setSubMenuArrowVisible(c0130p.hasSubMenu());
        setContentDescription(c0130p.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    public C0130p getItemData() {
        return this.f444k;
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    /* JADX INFO: renamed from: k */
    public boolean mo310k() {
        return false;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C0683f.wlev(this, this.f453z);
        TextView textView = (TextView) findViewById(C7397k.f7l8.f92342t8iq);
        this.f440g = textView;
        int i2 = this.f451t;
        if (i2 != -1) {
            textView.setTextAppearance(this.f449r, i2);
        }
        this.f450s = (TextView) findViewById(C7397k.f7l8.f92352y9n);
        ImageView imageView = (ImageView) findViewById(C7397k.f7l8.f92354zp);
        this.f447p = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f439f);
        }
        this.f441h = (ImageView) findViewById(C7397k.f7l8.f92332mcp);
        this.f442i = (LinearLayout) findViewById(C7397k.f7l8.f42325i);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.f448q != null && this.f445l) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f448q.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (!z2 && this.f446n == null && this.f452y == null) {
            return;
        }
        if (this.f444k.m370h()) {
            if (this.f446n == null) {
                m317y();
            }
            compoundButton = this.f446n;
            view = this.f452y;
        } else {
            if (this.f452y == null) {
                m315n();
            }
            compoundButton = this.f452y;
            view = this.f446n;
        }
        if (z2) {
            compoundButton.setChecked(this.f444k.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f452y;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f446n;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if (this.f444k.m370h()) {
            if (this.f446n == null) {
                m317y();
            }
            compoundButton = this.f446n;
        } else {
            if (this.f452y == null) {
                m315n();
            }
            compoundButton = this.f452y;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f443j = z2;
        this.f445l = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.f441h;
        if (imageView != null) {
            imageView.setVisibility((this.f437c || !z2) ? 8 : 0);
        }
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    public void setIcon(Drawable drawable) {
        boolean z2 = this.f444k.mcp() || this.f443j;
        if (z2 || this.f445l) {
            ImageView imageView = this.f448q;
            if (imageView == null && drawable == null && !this.f445l) {
                return;
            }
            if (imageView == null) {
                f7l8();
            }
            if (drawable == null && !this.f445l) {
                this.f448q.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f448q;
            if (!z2) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f448q.getVisibility() != 0) {
                this.f448q.setVisibility(0);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    public void setShortcut(boolean z2, char c2) {
        int i2 = (z2 && this.f444k.jk()) ? 0 : 8;
        if (i2 == 0) {
            this.f450s.setText(this.f444k.ld6());
        }
        if (this.f450s.getVisibility() != i2) {
            this.f450s.setVisibility(i2);
        }
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f440g.getVisibility() != 8) {
                this.f440g.setVisibility(8);
            }
        } else {
            this.f440g.setText(charSequence);
            if (this.f440g.getVisibility() != 0) {
                this.f440g.setVisibility(0);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    public boolean toq() {
        return this.f443j;
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        C0184b c0184bJp0y = C0184b.jp0y(getContext(), attributeSet, C7397k.qrj.ahb, i2, 0);
        this.f453z = c0184bJp0y.m553y(C7397k.qrj.p996);
        this.f451t = c0184bJp0y.fn3e(C7397k.qrj.l92, -1);
        this.f445l = c0184bJp0y.m547k(C7397k.qrj.e9s, false);
        this.f449r = context;
        this.f439f = c0184bJp0y.m553y(C7397k.qrj.xh);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, C7397k.toq.f92914mbx, 0);
        this.f437c = typedArrayObtainStyledAttributes.hasValue(0);
        c0184bJp0y.d3();
        typedArrayObtainStyledAttributes.recycle();
    }
}
