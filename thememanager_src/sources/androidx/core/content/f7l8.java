package androidx.core.content;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.exifinterface.media.C0846k;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import zy.InterfaceC7828g;
import zy.hb;

/* JADX INFO: compiled from: Context.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u00006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001aN\u0010\u0011\u001a\u00020\u000e*\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\t2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0086\b\u001a8\u0010\u0013\u001a\u00020\u000e*\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0086\b¨\u0006\u0014"}, d2 = {"", C0846k.zaso, "Landroid/content/Context;", "k", "(Landroid/content/Context;)Ljava/lang/Object;", "Landroid/util/AttributeSet;", "set", "", "attrs", "", "defStyleAttr", "defStyleRes", "Lkotlin/Function1;", "Landroid/content/res/TypedArray;", "Lkotlin/was;", "Lkotlin/fn3e;", "block", "zy", "resourceId", "toq", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class f7l8 {
    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ <T> T m2174k(@InterfaceC7396q Context getSystemService) {
        d2ok.cdj(getSystemService, "$this$getSystemService");
        d2ok.m23086z(4, C0846k.zaso);
        return (T) C0498q.kja0(getSystemService, Object.class);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m2175q(Context withStyledAttributes, AttributeSet attributeSet, int[] attrs, int i2, int i3, cyoe.x2 block, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            attributeSet = null;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        d2ok.cdj(withStyledAttributes, "$this$withStyledAttributes");
        d2ok.cdj(attrs, "attrs");
        d2ok.cdj(block, "block");
        TypedArray typedArrayObtainStyledAttributes = withStyledAttributes.obtainStyledAttributes(attributeSet, attrs, i2, i3);
        block.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final void toq(@InterfaceC7396q Context withStyledAttributes, @hb int i2, @InterfaceC7396q int[] attrs, @InterfaceC7396q cyoe.x2<? super TypedArray, was> block) {
        d2ok.cdj(withStyledAttributes, "$this$withStyledAttributes");
        d2ok.cdj(attrs, "attrs");
        d2ok.cdj(block, "block");
        TypedArray typedArrayObtainStyledAttributes = withStyledAttributes.obtainStyledAttributes(i2, attrs);
        block.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final void zy(@InterfaceC7396q Context withStyledAttributes, @InterfaceC7395n AttributeSet attributeSet, @InterfaceC7396q int[] attrs, @InterfaceC7828g int i2, @hb int i3, @InterfaceC7396q cyoe.x2<? super TypedArray, was> block) {
        d2ok.cdj(withStyledAttributes, "$this$withStyledAttributes");
        d2ok.cdj(attrs, "attrs");
        d2ok.cdj(block, "block");
        TypedArray typedArrayObtainStyledAttributes = withStyledAttributes.obtainStyledAttributes(attributeSet, attrs, i2, i3);
        block.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}
