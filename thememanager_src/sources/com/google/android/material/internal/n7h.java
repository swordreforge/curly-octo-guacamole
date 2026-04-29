package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.google.android.material.resources.AbstractC4089g;
import com.google.android.material.resources.C4092q;
import java.lang.ref.WeakReference;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: TextDrawableHelper.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class n7h {

    /* JADX INFO: renamed from: g */
    @dd
    private C4092q f24554g;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private float f67647zy;

    /* JADX INFO: renamed from: k */
    private final TextPaint f24555k = new TextPaint(1);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final AbstractC4089g f67646toq = new C4050k();

    /* JADX INFO: renamed from: q */
    private boolean f24557q = true;

    /* JADX INFO: renamed from: n */
    @dd
    private WeakReference<toq> f24556n = new WeakReference<>(null);

    /* JADX INFO: renamed from: com.google.android.material.internal.n7h$k */
    /* JADX INFO: compiled from: TextDrawableHelper.java */
    class C4050k extends AbstractC4089g {
        C4050k() {
        }

        @Override // com.google.android.material.resources.AbstractC4089g
        /* JADX INFO: renamed from: k */
        public void mo14231k(int i2) {
            n7h.this.f24557q = true;
            toq toqVar = (toq) n7h.this.f24556n.get();
            if (toqVar != null) {
                toqVar.mo14092k();
            }
        }

        @Override // com.google.android.material.resources.AbstractC4089g
        public void toq(@lvui Typeface typeface, boolean z2) {
            if (z2) {
                return;
            }
            n7h.this.f24557q = true;
            toq toqVar = (toq) n7h.this.f24556n.get();
            if (toqVar != null) {
                toqVar.mo14092k();
            }
        }
    }

    /* JADX INFO: compiled from: TextDrawableHelper.java */
    public interface toq {
        @lvui
        int[] getState();

        /* JADX INFO: renamed from: k */
        void mo14092k();

        boolean onStateChange(int[] iArr);
    }

    public n7h(@dd toq toqVar) {
        m14568y(toqVar);
    }

    private float zy(@dd CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f24555k.measureText(charSequence, 0, charSequence.length());
    }

    public boolean f7l8() {
        return this.f24557q;
    }

    /* JADX INFO: renamed from: g */
    public float m14563g(String str) {
        if (!this.f24557q) {
            return this.f67647zy;
        }
        float fZy = zy(str);
        this.f67647zy = fZy;
        this.f24557q = false;
        return fZy;
    }

    public void ld6(Context context) {
        this.f24554g.n7h(context, this.f24555k, this.f67646toq);
    }

    @lvui
    /* JADX INFO: renamed from: n */
    public TextPaint m14564n() {
        return this.f24555k;
    }

    /* JADX INFO: renamed from: p */
    public void m14565p(boolean z2) {
        this.f24557q = z2;
    }

    @dd
    /* JADX INFO: renamed from: q */
    public C4092q m14566q() {
        return this.f24554g;
    }

    /* JADX INFO: renamed from: s */
    public void m14567s(@dd C4092q c4092q, Context context) {
        if (this.f24554g != c4092q) {
            this.f24554g = c4092q;
            if (c4092q != null) {
                c4092q.kja0(context, this.f24555k, this.f67646toq);
                toq toqVar = this.f24556n.get();
                if (toqVar != null) {
                    this.f24555k.drawableState = toqVar.getState();
                }
                c4092q.n7h(context, this.f24555k, this.f67646toq);
                this.f24557q = true;
            }
            toq toqVar2 = this.f24556n.get();
            if (toqVar2 != null) {
                toqVar2.mo14092k();
                toqVar2.onStateChange(toqVar2.getState());
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void m14568y(@dd toq toqVar) {
        this.f24556n = new WeakReference<>(toqVar);
    }
}
