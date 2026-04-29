package miuix.appcompat.internal.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRadioButton;
import gb.toq;
import miuix.appcompat.internal.view.menu.f7l8;
import miuix.appcompat.internal.view.menu.x2;

/* JADX INFO: loaded from: classes3.dex */
public class ListMenuItemView extends LinearLayout implements x2.InterfaceC7037k {

    /* JADX INFO: renamed from: f */
    private boolean f39365f;

    /* JADX INFO: renamed from: g */
    private TextView f39366g;

    /* JADX INFO: renamed from: h */
    private Drawable f39367h;

    /* JADX INFO: renamed from: i */
    private int f39368i;

    /* JADX INFO: renamed from: k */
    private MenuItemC7036s f39369k;

    /* JADX INFO: renamed from: l */
    private LayoutInflater f39370l;

    /* JADX INFO: renamed from: n */
    private AppCompatRadioButton f39371n;

    /* JADX INFO: renamed from: p */
    private View f39372p;

    /* JADX INFO: renamed from: q */
    private AppCompatImageView f39373q;

    /* JADX INFO: renamed from: r */
    private Context f39374r;

    /* JADX INFO: renamed from: s */
    private TextView f39375s;

    /* JADX INFO: renamed from: t */
    private boolean f39376t;

    /* JADX INFO: renamed from: y */
    private AppCompatCheckBox f39377y;

    /* JADX INFO: renamed from: z */
    private Context f39378z;

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        this.f39374r = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.ki.qpih, i2, 0);
        this.f39367h = typedArrayObtainStyledAttributes.getDrawable(toq.ki.gm);
        this.f39368i = typedArrayObtainStyledAttributes.getResourceId(toq.ki.aqx, -1);
        this.f39376t = typedArrayObtainStyledAttributes.getBoolean(toq.ki.ymez, false);
        this.f39378z = context;
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: g */
    private void m25266g() {
        AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) getInflater().inflate(toq.qrj.f34942d, (ViewGroup) this, false);
        this.f39371n = appCompatRadioButton;
        addView(appCompatRadioButton, 0);
    }

    private LayoutInflater getInflater() {
        if (this.f39370l == null) {
            this.f39370l = LayoutInflater.from(this.f39374r);
        }
        return this.f39370l;
    }

    /* JADX INFO: renamed from: n */
    private void m25267n() {
        AppCompatImageView appCompatImageView = (AppCompatImageView) getInflater().inflate(toq.qrj.f34960v, (ViewGroup) this, false);
        this.f39373q = appCompatImageView;
        addView(appCompatImageView, 0);
    }

    /* JADX INFO: renamed from: q */
    private void m25268q() {
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) getInflater().inflate(toq.qrj.f76769xwq3, (ViewGroup) this, false);
        this.f39377y = appCompatCheckBox;
        addView(appCompatCheckBox);
    }

    @Override // miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    public MenuItemC7036s getItemData() {
        return this.f39369k;
    }

    @Override // miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    /* JADX INFO: renamed from: k */
    public boolean mo25269k() {
        return false;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f39367h);
        TextView textView = (TextView) findViewById(toq.C6054p.x8);
        this.f39366g = textView;
        int i2 = this.f39368i;
        if (i2 != -1) {
            textView.setTextAppearance(this.f39378z, i2);
        }
        this.f39375s = (TextView) findViewById(toq.C6054p.vymi);
        this.f39372p = getChildAt(0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.f39373q != null && this.f39376t) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f39373q.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    @Override // miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (!z2 && this.f39371n == null && this.f39377y == null) {
            return;
        }
        if (this.f39369k.t8r()) {
            if (this.f39371n == null) {
                m25266g();
            }
            compoundButton = this.f39371n;
            view = this.f39377y;
        } else {
            if (this.f39377y == null) {
                m25268q();
            }
            compoundButton = this.f39377y;
            view = this.f39371n;
        }
        if (z2) {
            compoundButton.setChecked(this.f39369k.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        AppCompatCheckBox appCompatCheckBox = this.f39377y;
        if (appCompatCheckBox != null) {
            appCompatCheckBox.setVisibility(8);
        }
        AppCompatRadioButton appCompatRadioButton = this.f39371n;
        if (appCompatRadioButton != null) {
            appCompatRadioButton.setVisibility(8);
        }
    }

    @Override // miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if (this.f39369k.t8r()) {
            if (this.f39371n == null) {
                m25266g();
            }
            compoundButton = this.f39371n;
        } else {
            if (this.f39377y == null) {
                m25268q();
            }
            compoundButton = this.f39377y;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f39365f = z2;
        this.f39376t = z2;
    }

    @Override // miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    public void setIcon(Drawable drawable) {
        boolean z2 = this.f39369k.d3() || this.f39365f;
        if (z2 || this.f39376t) {
            AppCompatImageView appCompatImageView = this.f39373q;
            if (appCompatImageView == null && drawable == null && !this.f39376t) {
                return;
            }
            if (appCompatImageView == null) {
                m25267n();
            }
            if (drawable == null && !this.f39376t) {
                this.f39373q.setVisibility(8);
                return;
            }
            AppCompatImageView appCompatImageView2 = this.f39373q;
            if (!z2) {
                drawable = null;
            }
            appCompatImageView2.setImageDrawable(drawable);
            if (this.f39373q.getVisibility() != 0) {
                this.f39373q.setVisibility(0);
            }
        }
    }

    @Override // miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    public void setItemInvoker(f7l8.zy zyVar) {
        throw new UnsupportedOperationException();
    }

    @Override // miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    public void setShortcut(boolean z2, char c2) {
        int i2 = (z2 && this.f39369k.oc()) ? 0 : 8;
        if (i2 == 0) {
            this.f39375s.setText(this.f39369k.ld6());
        }
        if (this.f39375s.getVisibility() != i2) {
            this.f39375s.setVisibility(i2);
        }
    }

    @Override // miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f39366g.getVisibility() != 8) {
                this.f39366g.setVisibility(8);
            }
        } else {
            this.f39366g.setText(charSequence);
            if (this.f39366g.getVisibility() != 0) {
                this.f39366g.setVisibility(0);
            }
        }
    }

    @Override // miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    public boolean toq() {
        return this.f39365f;
    }

    @Override // miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    public void zy(MenuItemC7036s menuItemC7036s, int i2) {
        this.f39369k = menuItemC7036s;
        setVisibility(menuItemC7036s.isVisible() ? 0 : 8);
        setTitle(menuItemC7036s.n7h(this));
        setCheckable(menuItemC7036s.isCheckable());
        setShortcut(menuItemC7036s.oc(), menuItemC7036s.m25372p());
        setIcon(menuItemC7036s.getIcon());
        setEnabled(menuItemC7036s.isEnabled());
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
