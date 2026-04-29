package miuix.graphics.shadow;

import android.content.Context;
import android.graphics.BlurMaskFilter;

/* JADX INFO: renamed from: miuix.graphics.shadow.q */
/* JADX INFO: compiled from: DropShadowMaskHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7114q extends toq {

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private BlurMaskFilter f87680x2;

    public C7114q(Context context, C7113k c7113k, boolean z2) {
        super(context, c7113k, z2);
    }

    @Override // miuix.graphics.shadow.toq
    /* JADX INFO: renamed from: g */
    public void mo25760g(int i2, int i3, int i4, int i5) {
        super.mo25760g(i2, i3, i4, i5);
        this.f87681f7l8.offset(this.f87684zy, this.f40144q);
    }

    @Override // miuix.graphics.shadow.toq
    /* JADX INFO: renamed from: n */
    protected void mo25761n(float f2, C7113k c7113k) {
        super.mo25761n(f2, c7113k);
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(this.f40142n, c7113k.f87679zy);
        this.f87680x2 = blurMaskFilter;
        this.f40146y.setMaskFilter(blurMaskFilter);
    }
}
