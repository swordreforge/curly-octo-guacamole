package miuix.popupwidget.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatButton;
import c25.toq;
import miuix.popupwidget.internal.widget.ArrowPopupView;

/* JADX INFO: renamed from: miuix.popupwidget.widget.k */
/* JADX INFO: compiled from: ArrowPopupWindow.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7264k extends PopupWindow {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f88054cdj = 2;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f88055f7l8 = 8;

    /* JADX INFO: renamed from: h */
    public static final int f41068h = 1;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f88056kja0 = 0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f88057ld6 = 17;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f88058n7h = 64;

    /* JADX INFO: renamed from: p */
    public static final int f41069p = 16;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f88059qrj = 32;

    /* JADX INFO: renamed from: s */
    public static final int f41070s = 9;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f88060x2 = 18;

    /* JADX INFO: renamed from: y */
    public static final int f41071y = 10;

    /* JADX INFO: renamed from: g */
    private int f41072g;

    /* JADX INFO: renamed from: k */
    protected ArrowPopupView f41073k;

    /* JADX INFO: renamed from: n */
    protected int f41074n;

    /* JADX INFO: renamed from: q */
    private boolean f41075q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Context f88061toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f88062zy;

    public C7264k(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: t */
    private void m26412t() {
        this.f88062zy = this.f88061toq.getResources().getDimensionPixelOffset(toq.C1385g.f54348b3e);
        ArrowPopupView arrowPopupView = (ArrowPopupView) m26421y().inflate(toq.x2.f55347jk, (ViewGroup) null, false);
        this.f41073k = arrowPopupView;
        super.setContentView(arrowPopupView);
        super.setWidth(-1);
        super.setHeight(-1);
        setSoftInputMode(3);
        this.f41073k.setArrowPopupWindow(this);
        super.setTouchInterceptor(f7l8());
        this.f41073k.m26394h();
        x2();
        update();
    }

    public final void cdj(View view, ViewGroup.LayoutParams layoutParams) {
        this.f41073k.setContentView(view, layoutParams);
    }

    public View.OnTouchListener f7l8() {
        return this.f41073k;
    }

    public void fn3e(CharSequence charSequence, View.OnClickListener onClickListener) {
        this.f41073k.setNegativeButton(charSequence, onClickListener);
    }

    protected void fu4(int i2) {
        super.setHeight(i2);
    }

    /* JADX INFO: renamed from: g */
    public Context m26413g() {
        return this.f88061toq;
    }

    @Override // android.widget.PopupWindow
    public View getContentView() {
        return this.f41073k.getContentView();
    }

    @Override // android.widget.PopupWindow
    public int getHeight() {
        return m26419q();
    }

    @Override // android.widget.PopupWindow
    public int getWidth() {
        return m26417n();
    }

    /* JADX INFO: renamed from: h */
    public final void m26414h(int i2) {
        this.f41073k.setContentView(i2);
    }

    /* JADX INFO: renamed from: i */
    public void m26415i(int i2, View.OnClickListener onClickListener) {
        fn3e(this.f88061toq.getString(i2), onClickListener);
    }

    /* JADX INFO: renamed from: k */
    public void m26416k(boolean z2) {
        if (z2) {
            this.f41073k.m26395i();
        } else {
            dismiss();
        }
    }

    public void ki(int i2) {
        View contentView = getContentView();
        if (contentView != null) {
            ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
            layoutParams.width = i2;
            contentView.setLayoutParams(layoutParams);
        }
    }

    public void kja0(int i2) {
        int i3;
        if (i2 == this.f41072g) {
            i2 -= this.f41073k.getContentFrameWrapperBottomPadding() + this.f41073k.getContentFrameWrapperTopPadding();
        }
        if (!this.f41073k.jp0y()) {
            i2 -= this.f41073k.getTitleHeight();
        }
        View contentView = getContentView();
        if ((contentView instanceof ListView) && i2 > (i3 = this.f88062zy)) {
            i2 = i3;
        }
        if (contentView != null) {
            ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
            layoutParams.height = i2;
            contentView.setLayoutParams(layoutParams);
        }
    }

    public AppCompatButton ld6() {
        return this.f41073k.getPositiveButton();
    }

    public void mcp(View view, int i2, int i3) {
        this.f41073k.setAnchor(view);
        this.f41073k.setOffset(i2, i3);
        showAtLocation(view, 8388659, 0, 0);
        this.f41073k.setAutoDismiss(this.f41075q);
        this.f41073k.fn3e();
    }

    /* JADX INFO: renamed from: n */
    public int m26417n() {
        View contentView = getContentView();
        if (contentView != null) {
            return contentView.getWidth();
        }
        return 0;
    }

    public void n7h(boolean z2) {
        this.f41075q = z2;
    }

    public void ni7(CharSequence charSequence, View.OnClickListener onClickListener) {
        this.f41073k.setPositiveButton(charSequence, onClickListener);
    }

    public void o1t(int i2) {
        wvg(this.f88061toq.getString(i2));
    }

    /* JADX INFO: renamed from: p */
    public AppCompatButton m26418p() {
        return this.f41073k.getNegativeButton();
    }

    /* JADX INFO: renamed from: q */
    public int m26419q() {
        View contentView = getContentView();
        if (contentView != null) {
            return contentView.getHeight();
        }
        return 0;
    }

    public void qrj(int i2) {
        this.f41073k.setArrowMode(i2);
    }

    /* JADX INFO: renamed from: s */
    int m26420s(int i2, int i3) {
        int qVar = toq();
        switch (qVar) {
            case 8:
            case 9:
            case 10:
                break;
            default:
                switch (qVar) {
                    case 16:
                    case 17:
                    case 18:
                        i2 = i3;
                        break;
                    default:
                        i2 = Math.max(i2, i3);
                        break;
                }
                break;
        }
        this.f41072g = i2;
        return i2;
    }

    @Override // android.widget.PopupWindow
    public final void setContentView(View view) {
        this.f41073k.setContentView(view);
    }

    @Override // android.widget.PopupWindow
    public void setHeight(int i2) {
        kja0(i2);
    }

    @Override // android.widget.PopupWindow
    public void setTouchInterceptor(View.OnTouchListener onTouchListener) {
        this.f41073k.setTouchInterceptor(onTouchListener);
    }

    @Override // android.widget.PopupWindow
    public void setWidth(int i2) {
        ki(i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i2, int i3) {
        mcp(view, i2, i3);
    }

    public void t8r(int i2) {
        if (i2 > 2 || i2 < 0) {
            this.f41074n = 2;
        } else {
            this.f41074n = i2;
        }
        this.f41073k.setLayoutRtlMode(i2);
    }

    public int toq() {
        return this.f41073k.getArrowMode();
    }

    @Override // android.widget.PopupWindow
    public void update(int i2, int i3, int i4, int i5, boolean z2) {
        super.update(0, 0, -2, -2, z2);
        kja0(i5);
    }

    public void wvg(CharSequence charSequence) {
        this.f41073k.setTitle(charSequence);
    }

    protected void x2() {
    }

    /* JADX INFO: renamed from: y */
    protected LayoutInflater m26421y() {
        return LayoutInflater.from(this.f88061toq);
    }

    /* JADX INFO: renamed from: z */
    protected void m26422z(int i2) {
        super.setWidth(i2);
    }

    public void zurt(int i2, View.OnClickListener onClickListener) {
        ni7(this.f88061toq.getString(i2), onClickListener);
    }

    public boolean zy() {
        return this.f41075q;
    }

    public C7264k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i2, int i3, int i4) {
        mcp(view, i2, i3);
    }

    public C7264k(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public C7264k(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f41074n = 2;
        this.f88061toq = context;
        this.f41075q = true;
        m26412t();
        this.f41073k.setLayoutRtlMode(this.f41074n);
    }
}
