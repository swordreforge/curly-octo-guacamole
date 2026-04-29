package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.widget.C0394g;

/* JADX INFO: loaded from: classes.dex */
public class MotionEffect extends MotionHelper {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final int f48003ab = -1;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    public static final int f48004bo = 0;

    /* JADX INFO: renamed from: d */
    public static final int f2156d = 2;

    /* JADX INFO: renamed from: u */
    public static final int f2157u = -1;

    /* JADX INFO: renamed from: v */
    public static final int f2158v = 1;

    /* JADX INFO: renamed from: w */
    public static final int f2159w = 3;

    /* JADX INFO: renamed from: x */
    public static final String f2160x = "FadeMove";

    /* JADX INFO: renamed from: a */
    private int f2161a;

    /* JADX INFO: renamed from: b */
    private int f2162b;

    /* JADX INFO: renamed from: c */
    private int f2163c;

    /* JADX INFO: renamed from: e */
    private int f2164e;

    /* JADX INFO: renamed from: f */
    private float f2165f;

    /* JADX INFO: renamed from: j */
    private int f2166j;

    /* JADX INFO: renamed from: m */
    private boolean f2167m;

    /* JADX INFO: renamed from: o */
    private int f2168o;

    public MotionEffect(Context context) {
        super(context);
        this.f2165f = 0.1f;
        this.f2163c = 49;
        this.f2164e = 50;
        this.f2166j = 0;
        this.f2168o = 0;
        this.f2167m = true;
        this.f2162b = -1;
        this.f2161a = -1;
    }

    private void oc(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C0394g.qrj.so0v);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0394g.qrj.vt2p) {
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, this.f2163c);
                    this.f2163c = i3;
                    this.f2163c = Math.max(Math.min(i3, 99), 0);
                } else if (index == C0394g.qrj.zac) {
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, this.f2164e);
                    this.f2164e = i4;
                    this.f2164e = Math.max(Math.min(i4, 99), 0);
                } else if (index == C0394g.qrj.dzu0) {
                    this.f2166j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2166j);
                } else if (index == C0394g.qrj.lsos) {
                    this.f2168o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2168o);
                } else if (index == C0394g.qrj.tx) {
                    this.f2165f = typedArrayObtainStyledAttributes.getFloat(index, this.f2165f);
                } else if (index == C0394g.qrj.k7u) {
                    this.f2161a = typedArrayObtainStyledAttributes.getInt(index, this.f2161a);
                } else if (index == C0394g.qrj.g45) {
                    this.f2167m = typedArrayObtainStyledAttributes.getBoolean(index, this.f2167m);
                } else if (index == C0394g.qrj.nsiv) {
                    this.f2162b = typedArrayObtainStyledAttributes.getResourceId(index, this.f2162b);
                }
            }
            int i5 = this.f2163c;
            int i6 = this.f2164e;
            if (i5 == i6) {
                if (i5 > 0) {
                    this.f2163c = i5 - 1;
                } else {
                    this.f2164e = i6 + 1;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.InterfaceC0369h
    public boolean ld6() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0186, code lost:
    
        if (r14 == 0.0f) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x019a, code lost:
    
        if (r14 == 0.0f) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01aa, code lost:
    
        if (r15 == 0.0f) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0162  */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.InterfaceC0369h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void zy(androidx.constraintlayout.motion.widget.MotionLayout r22, java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.kja0> r23) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.MotionEffect.zy(androidx.constraintlayout.motion.widget.MotionLayout, java.util.HashMap):void");
    }

    public MotionEffect(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f2165f = 0.1f;
        this.f2163c = 49;
        this.f2164e = 50;
        this.f2166j = 0;
        this.f2168o = 0;
        this.f2167m = true;
        this.f2162b = -1;
        this.f2161a = -1;
        oc(context, attrs);
    }

    public MotionEffect(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f2165f = 0.1f;
        this.f2163c = 49;
        this.f2164e = 50;
        this.f2166j = 0;
        this.f2168o = 0;
        this.f2167m = true;
        this.f2162b = -1;
        this.f2161a = -1;
        oc(context, attrs);
    }
}
