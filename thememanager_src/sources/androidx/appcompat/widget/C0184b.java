package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.C0506s;
import p023g.C6045k;
import zy.InterfaceC7831j;
import zy.uv6;

/* JADX INFO: renamed from: androidx.appcompat.widget.b */
/* JADX INFO: compiled from: TintTypedArray.java */
/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class C0184b {

    /* JADX INFO: renamed from: k */
    private final Context f964k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final TypedArray f46845toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private TypedValue f46846zy;

    private C0184b(Context context, TypedArray typedArray) {
        this.f964k = context;
        this.f46845toq = typedArray;
    }

    public static C0184b a9(Context context, int i2, int[] iArr) {
        return new C0184b(context, context.obtainStyledAttributes(i2, iArr));
    }

    public static C0184b fti(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0184b(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static C0184b jp0y(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        return new C0184b(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    public int cdj(int i2, int i3) {
        return this.f46845toq.getLayoutDimension(i2, i3);
    }

    public void d3() {
        this.f46845toq.recycle();
    }

    public int f7l8(int i2, int i3) {
        return this.f46845toq.getDimensionPixelSize(i2, i3);
    }

    public int fn3e(int i2, int i3) {
        return this.f46845toq.getResourceId(i2, i3);
    }

    public CharSequence fu4(int i2) {
        return this.f46845toq.getText(i2);
    }

    /* JADX INFO: renamed from: g */
    public int m544g(int i2, int i3) {
        return this.f46845toq.getDimensionPixelOffset(i2, i3);
    }

    public TypedValue gvn7(int i2) {
        return this.f46845toq.peekValue(i2);
    }

    /* JADX INFO: renamed from: h */
    public int m545h(int i2, int i3) {
        return this.f46845toq.getInteger(i2, i3);
    }

    /* JADX INFO: renamed from: i */
    public String m546i() {
        return this.f46845toq.getPositionDescription();
    }

    public int jk() {
        return this.f46845toq.length();
    }

    /* JADX INFO: renamed from: k */
    public boolean m547k(int i2, boolean z2) {
        return this.f46845toq.getBoolean(i2, z2);
    }

    public int ki(int i2, String str) {
        return this.f46845toq.getLayoutDimension(i2, str);
    }

    public int kja0(int i2, int i3) {
        return this.f46845toq.getInt(i2, i3);
    }

    @zy.dd
    public Typeface ld6(@InterfaceC7831j int i2, int i3, @zy.dd C0506s.f7l8 f7l8Var) {
        int resourceId = this.f46845toq.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f46846zy == null) {
            this.f46846zy = new TypedValue();
        }
        return C0506s.ld6(this.f964k, resourceId, this.f46846zy, i3, f7l8Var);
    }

    public boolean mcp(int i2) {
        return this.f46845toq.hasValue(i2);
    }

    /* JADX INFO: renamed from: n */
    public float m548n(int i2, float f2) {
        return this.f46845toq.getDimension(i2, f2);
    }

    public int n7h() {
        return this.f46845toq.getIndexCount();
    }

    public String ni7(int i2) {
        return this.f46845toq.getString(i2);
    }

    public int o1t(int i2) {
        return this.f46845toq.getType(i2);
    }

    /* JADX INFO: renamed from: p */
    public float m549p(int i2, float f2) {
        return this.f46845toq.getFloat(i2, f2);
    }

    /* JADX INFO: renamed from: q */
    public ColorStateList m550q(int i2) {
        int resourceId;
        ColorStateList colorStateListM22274k;
        return (!this.f46845toq.hasValue(i2) || (resourceId = this.f46845toq.getResourceId(i2, 0)) == 0 || (colorStateListM22274k = C6045k.m22274k(this.f964k, resourceId)) == null) ? this.f46845toq.getColorStateList(i2) : colorStateListM22274k;
    }

    public int qrj(int i2) {
        return this.f46845toq.getIndex(i2);
    }

    /* JADX INFO: renamed from: s */
    public Drawable m551s(int i2) {
        int resourceId;
        if (!this.f46845toq.hasValue(i2) || (resourceId = this.f46845toq.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return ld6.toq().m633q(this.f964k, resourceId, true);
    }

    /* JADX INFO: renamed from: t */
    public TypedArray m552t() {
        return this.f46845toq;
    }

    public String t8r(int i2) {
        return this.f46845toq.getNonResourceString(i2);
    }

    @zy.hyr(21)
    public int toq() {
        return this.f46845toq.getChangingConfigurations();
    }

    public boolean wvg(int i2, TypedValue typedValue) {
        return this.f46845toq.getValue(i2, typedValue);
    }

    public float x2(int i2, int i3, int i4, float f2) {
        return this.f46845toq.getFraction(i2, i3, i4, f2);
    }

    /* JADX INFO: renamed from: y */
    public Drawable m553y(int i2) {
        int resourceId;
        return (!this.f46845toq.hasValue(i2) || (resourceId = this.f46845toq.getResourceId(i2, 0)) == 0) ? this.f46845toq.getDrawable(i2) : C6045k.toq(this.f964k, resourceId);
    }

    /* JADX INFO: renamed from: z */
    public CharSequence[] m554z(int i2) {
        return this.f46845toq.getTextArray(i2);
    }

    public Resources zurt() {
        return this.f46845toq.getResources();
    }

    public int zy(int i2, int i3) {
        return this.f46845toq.getColor(i2, i3);
    }
}
