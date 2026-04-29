package androidx.emoji2.viewsintegration;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.C0830n;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.emoji2.viewsintegration.y */
/* JADX INFO: compiled from: EmojiTransformationMethod.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(19)
@uv6({uv6.EnumC7844k.LIBRARY})
class C0844y implements TransformationMethod {

    /* JADX INFO: renamed from: k */
    @dd
    private final TransformationMethod f4598k;

    C0844y(@dd TransformationMethod transformationMethod) {
        this.f4598k = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(@dd CharSequence charSequence, @lvui View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f4598k;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || C0830n.toq().m4035n() != 1) ? charSequence : C0830n.toq().m4034i(charSequence);
    }

    /* JADX INFO: renamed from: k */
    public TransformationMethod m4122k() {
        return this.f4598k;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z2, int i2, Rect rect) {
        TransformationMethod transformationMethod = this.f4598k;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z2, i2, rect);
        }
    }
}
