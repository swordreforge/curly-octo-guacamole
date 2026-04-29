package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: g */
    private LayoutInflater f947g;

    /* JADX INFO: renamed from: k */
    private int f948k;

    /* JADX INFO: renamed from: n */
    private WeakReference<View> f949n;

    /* JADX INFO: renamed from: q */
    private int f950q;

    /* JADX INFO: renamed from: y */
    private InterfaceC0181k f951y;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ViewStubCompat$k */
    public interface InterfaceC0181k {
        /* JADX INFO: renamed from: k */
        void m527k(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(@zy.lvui Context context, @zy.dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f950q;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f947g;
    }

    public int getLayoutResource() {
        return this.f948k;
    }

    /* JADX INFO: renamed from: k */
    public View m526k() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f948k == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f947g;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f948k, viewGroup, false);
        int i2 = this.f950q;
        if (i2 != -1) {
            viewInflate.setId(i2);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f949n = new WeakReference<>(viewInflate);
        InterfaceC0181k interfaceC0181k = this.f951y;
        if (interfaceC0181k != null) {
            interfaceC0181k.m527k(this, viewInflate);
        }
        return viewInflate;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i2) {
        this.f950q = i2;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f947g = layoutInflater;
    }

    public void setLayoutResource(int i2) {
        this.f948k = i2;
    }

    public void setOnInflateListener(InterfaceC0181k interfaceC0181k) {
        this.f951y = interfaceC0181k;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        WeakReference<View> weakReference = this.f949n;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i2);
            return;
        }
        super.setVisibility(i2);
        if (i2 == 0 || i2 == 4) {
            m526k();
        }
    }

    public ViewStubCompat(@zy.lvui Context context, @zy.dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f948k = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7397k.qrj.u3gu, i2, 0);
        this.f950q = typedArrayObtainStyledAttributes.getResourceId(C7397k.qrj.nrcs, -1);
        this.f948k = typedArrayObtainStyledAttributes.getResourceId(C7397k.qrj.fn9, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(C7397k.qrj.qspg, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
