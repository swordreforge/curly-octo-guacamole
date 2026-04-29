package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.emoji2.viewsintegration.C0839g;
import p030n.C7397k;

/* JADX INFO: compiled from: AppCompatEmojiTextHelper.java */
/* JADX INFO: loaded from: classes.dex */
class n7h {

    /* JADX INFO: renamed from: k */
    @zy.lvui
    private final TextView f1146k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @zy.lvui
    private final C0839g f46929toq;

    n7h(@zy.lvui TextView textView) {
        this.f1146k = textView;
        this.f46929toq = new C0839g(textView, false);
    }

    @zy.dd
    /* JADX INFO: renamed from: g */
    public TransformationMethod m680g(@zy.dd TransformationMethod transformationMethod) {
        return this.f46929toq.m4100g(transformationMethod);
    }

    @zy.lvui
    /* JADX INFO: renamed from: k */
    InputFilter[] m681k(@zy.lvui InputFilter[] inputFilterArr) {
        return this.f46929toq.m4101k(inputFilterArr);
    }

    /* JADX INFO: renamed from: n */
    void m682n(boolean z2) {
        this.f46929toq.m4103q(z2);
    }

    /* JADX INFO: renamed from: q */
    void m683q(boolean z2) {
        this.f46929toq.zy(z2);
    }

    public boolean toq() {
        return this.f46929toq.toq();
    }

    void zy(@zy.dd AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = this.f1146k.getContext().obtainStyledAttributes(attributeSet, C7397k.qrj.f92666h7am, i2, 0);
        try {
            int i3 = C7397k.qrj.f92714n2t;
            boolean z2 = typedArrayObtainStyledAttributes.hasValue(i3) ? typedArrayObtainStyledAttributes.getBoolean(i3, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m682n(z2);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
