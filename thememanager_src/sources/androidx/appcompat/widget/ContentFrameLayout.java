package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.core.view.C0683f;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY})
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: g */
    private TypedValue f795g;

    /* JADX INFO: renamed from: h */
    private InterfaceC0161k f796h;

    /* JADX INFO: renamed from: k */
    private TypedValue f797k;

    /* JADX INFO: renamed from: n */
    private TypedValue f798n;

    /* JADX INFO: renamed from: p */
    private final Rect f799p;

    /* JADX INFO: renamed from: q */
    private TypedValue f800q;

    /* JADX INFO: renamed from: s */
    private TypedValue f801s;

    /* JADX INFO: renamed from: y */
    private TypedValue f802y;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ContentFrameLayout$k */
    public interface InterfaceC0161k {
        /* JADX INFO: renamed from: k */
        void mo141k();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(@zy.lvui Context context) {
        this(context, null);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f802y == null) {
            this.f802y = new TypedValue();
        }
        return this.f802y;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f801s == null) {
            this.f801s = new TypedValue();
        }
        return this.f801s;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f798n == null) {
            this.f798n = new TypedValue();
        }
        return this.f798n;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f795g == null) {
            this.f795g = new TypedValue();
        }
        return this.f795g;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f797k == null) {
            this.f797k = new TypedValue();
        }
        return this.f797k;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f800q == null) {
            this.f800q = new TypedValue();
        }
        return this.f800q;
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY})
    /* JADX INFO: renamed from: k */
    public void m461k(Rect rect) {
        fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0161k interfaceC0161k = this.f796h;
        if (interfaceC0161k != null) {
            interfaceC0161k.mo141k();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0161k interfaceC0161k = this.f796h;
        if (interfaceC0161k != null) {
            interfaceC0161k.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC0161k interfaceC0161k) {
        this.f796h = interfaceC0161k;
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY})
    public void setDecorPadding(int i2, int i3, int i4, int i5) {
        this.f799p.set(i2, i3, i4, i5);
        if (C0683f.v0af(this)) {
            requestLayout();
        }
    }

    public ContentFrameLayout(@zy.lvui Context context, @zy.dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(@zy.lvui Context context, @zy.dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f799p = new Rect();
    }
}
