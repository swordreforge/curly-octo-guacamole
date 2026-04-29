package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.core.util.n7h;
import androidx.emoji2.text.C0830n;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.emoji2.viewsintegration.g */
/* JADX INFO: compiled from: EmojiTextViewHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0839g {

    /* JADX INFO: renamed from: k */
    private final toq f4589k;

    /* JADX INFO: renamed from: androidx.emoji2.viewsintegration.g$k */
    /* JADX INFO: compiled from: EmojiTextViewHelper.java */
    @hyr(19)
    private static class k extends toq {

        /* JADX INFO: renamed from: k */
        private final TextView f4590k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final C0842q f51194toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f51195zy = true;

        k(TextView textView) {
            this.f4590k = textView;
            this.f51194toq = new C0842q(textView);
        }

        @lvui
        private InputFilter[] f7l8(@lvui InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f51194toq) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f51194toq;
            return inputFilterArr2;
        }

        @dd
        private TransformationMethod ld6(@dd TransformationMethod transformationMethod) {
            return transformationMethod instanceof C0844y ? ((C0844y) transformationMethod).m4122k() : transformationMethod;
        }

        @lvui
        private TransformationMethod qrj(@dd TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof C0844y) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C0844y(transformationMethod);
        }

        @lvui
        /* JADX INFO: renamed from: s */
        private InputFilter[] m4104s(@lvui InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArrayM4105y = m4105y(inputFilterArr);
            if (sparseArrayM4105y.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayM4105y.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArrayM4105y.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }

        private void x2() {
            this.f4590k.setFilters(mo4107k(this.f4590k.getFilters()));
        }

        /* JADX INFO: renamed from: y */
        private SparseArray<InputFilter> m4105y(@lvui InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i2 = 0; i2 < inputFilterArr.length; i2++) {
                InputFilter inputFilter = inputFilterArr[i2];
                if (inputFilter instanceof C0842q) {
                    sparseArray.put(i2, inputFilter);
                }
            }
            return sparseArray;
        }

        @Override // androidx.emoji2.viewsintegration.C0839g.toq
        @dd
        /* JADX INFO: renamed from: g */
        TransformationMethod mo4106g(@dd TransformationMethod transformationMethod) {
            return this.f51195zy ? qrj(transformationMethod) : ld6(transformationMethod);
        }

        @Override // androidx.emoji2.viewsintegration.C0839g.toq
        @lvui
        /* JADX INFO: renamed from: k */
        InputFilter[] mo4107k(@lvui InputFilter[] inputFilterArr) {
            return !this.f51195zy ? m4104s(inputFilterArr) : f7l8(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.C0839g.toq
        /* JADX INFO: renamed from: n */
        void mo4108n() {
            this.f4590k.setTransformationMethod(mo4106g(this.f4590k.getTransformationMethod()));
        }

        @uv6({uv6.EnumC7844k.LIBRARY})
        /* JADX INFO: renamed from: p */
        void m4109p(boolean z2) {
            this.f51195zy = z2;
        }

        @Override // androidx.emoji2.viewsintegration.C0839g.toq
        /* JADX INFO: renamed from: q */
        void mo4110q(boolean z2) {
            this.f51195zy = z2;
            mo4108n();
            x2();
        }

        @Override // androidx.emoji2.viewsintegration.C0839g.toq
        public boolean toq() {
            return this.f51195zy;
        }

        @Override // androidx.emoji2.viewsintegration.C0839g.toq
        void zy(boolean z2) {
            if (z2) {
                mo4108n();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.viewsintegration.g$toq */
    /* JADX INFO: compiled from: EmojiTextViewHelper.java */
    static class toq {
        toq() {
        }

        @dd
        /* JADX INFO: renamed from: g */
        TransformationMethod mo4106g(@dd TransformationMethod transformationMethod) {
            return transformationMethod;
        }

        @lvui
        /* JADX INFO: renamed from: k */
        InputFilter[] mo4107k(@lvui InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        /* JADX INFO: renamed from: n */
        void mo4108n() {
        }

        /* JADX INFO: renamed from: q */
        void mo4110q(boolean z2) {
        }

        public boolean toq() {
            return false;
        }

        void zy(boolean z2) {
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.viewsintegration.g$zy */
    /* JADX INFO: compiled from: EmojiTextViewHelper.java */
    @hyr(19)
    private static class zy extends toq {

        /* JADX INFO: renamed from: k */
        private final k f4591k;

        zy(TextView textView) {
            this.f4591k = new k(textView);
        }

        private boolean f7l8() {
            return !C0830n.qrj();
        }

        @Override // androidx.emoji2.viewsintegration.C0839g.toq
        @dd
        /* JADX INFO: renamed from: g */
        TransformationMethod mo4106g(@dd TransformationMethod transformationMethod) {
            return f7l8() ? transformationMethod : this.f4591k.mo4106g(transformationMethod);
        }

        @Override // androidx.emoji2.viewsintegration.C0839g.toq
        @lvui
        /* JADX INFO: renamed from: k */
        InputFilter[] mo4107k(@lvui InputFilter[] inputFilterArr) {
            return f7l8() ? inputFilterArr : this.f4591k.mo4107k(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.C0839g.toq
        /* JADX INFO: renamed from: n */
        void mo4108n() {
            if (f7l8()) {
                return;
            }
            this.f4591k.mo4108n();
        }

        @Override // androidx.emoji2.viewsintegration.C0839g.toq
        /* JADX INFO: renamed from: q */
        void mo4110q(boolean z2) {
            if (f7l8()) {
                this.f4591k.m4109p(z2);
            } else {
                this.f4591k.mo4110q(z2);
            }
        }

        @Override // androidx.emoji2.viewsintegration.C0839g.toq
        public boolean toq() {
            return this.f4591k.toq();
        }

        @Override // androidx.emoji2.viewsintegration.C0839g.toq
        void zy(boolean z2) {
            if (f7l8()) {
                return;
            }
            this.f4591k.zy(z2);
        }
    }

    public C0839g(@lvui TextView textView) {
        this(textView, true);
    }

    @dd
    /* JADX INFO: renamed from: g */
    public TransformationMethod m4100g(@dd TransformationMethod transformationMethod) {
        return this.f4589k.mo4106g(transformationMethod);
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public InputFilter[] m4101k(@lvui InputFilter[] inputFilterArr) {
        return this.f4589k.mo4107k(inputFilterArr);
    }

    /* JADX INFO: renamed from: n */
    public void m4102n() {
        this.f4589k.mo4108n();
    }

    /* JADX INFO: renamed from: q */
    public void m4103q(boolean z2) {
        this.f4589k.mo4110q(z2);
    }

    public boolean toq() {
        return this.f4589k.toq();
    }

    public void zy(boolean z2) {
        this.f4589k.zy(z2);
    }

    public C0839g(@lvui TextView textView, boolean z2) {
        n7h.qrj(textView, "textView cannot be null");
        if (z2) {
            this.f4589k = new k(textView);
        } else {
            this.f4589k = new zy(textView);
        }
    }
}
