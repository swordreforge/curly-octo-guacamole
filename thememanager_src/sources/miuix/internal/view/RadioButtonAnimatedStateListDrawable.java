package miuix.internal.view;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import gb.toq;
import miuix.internal.view.C7175k;
import zy.hyr;

/* JADX INFO: loaded from: classes3.dex */
@hyr(api = 21)
public class RadioButtonAnimatedStateListDrawable extends CheckBoxAnimatedStateListDrawable {

    /* JADX INFO: renamed from: r */
    private int f40409r;

    /* JADX INFO: renamed from: miuix.internal.view.RadioButtonAnimatedStateListDrawable$k */
    protected static class C7174k extends C7175k.k {
        protected C7174k() {
        }

        @Override // miuix.internal.view.C7175k.k
        /* JADX INFO: renamed from: k */
        protected Drawable mo26006k(Resources resources, Resources.Theme theme, C7175k.k kVar) {
            return new RadioButtonAnimatedStateListDrawable(resources, theme, kVar);
        }
    }

    public RadioButtonAnimatedStateListDrawable() {
        this.f40409r = 19;
    }

    @Override // miuix.internal.view.CheckBoxAnimatedStateListDrawable, miuix.internal.view.C7175k
    /* JADX INFO: renamed from: k */
    protected C7175k.k mo26001k() {
        return new C7174k();
    }

    @Override // miuix.internal.view.CheckBoxAnimatedStateListDrawable
    /* JADX INFO: renamed from: n */
    protected boolean mo26002n() {
        return true;
    }

    @Override // miuix.internal.view.CheckBoxAnimatedStateListDrawable
    /* JADX INFO: renamed from: p */
    protected void mo26003p(Rect rect) {
        int i2 = this.f40409r;
        rect.inset(i2, i2);
        super.mo26003p(rect);
    }

    @Override // miuix.internal.view.CheckBoxAnimatedStateListDrawable
    /* JADX INFO: renamed from: s */
    protected void mo26005s(int i2, int i3, int i4, int i5) {
        int i6 = this.f40409r;
        super.mo26005s(i2 + i6, i3 + i6, i4 - i6, i5 - i6);
    }

    @Override // miuix.internal.view.CheckBoxAnimatedStateListDrawable
    protected int toq() {
        return toq.cdj.f75273mj;
    }

    public RadioButtonAnimatedStateListDrawable(Resources resources, Resources.Theme theme, C7175k.k kVar) {
        super(resources, theme, kVar);
        this.f40409r = 19;
        if (resources != null) {
            this.f40409r = resources.getDimensionPixelSize(toq.f7l8.c2lu);
        }
    }
}
