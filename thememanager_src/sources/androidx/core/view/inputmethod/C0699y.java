package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: androidx.core.view.inputmethod.y */
/* JADX INFO: compiled from: InputContentInfoCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0699y {

    /* JADX INFO: renamed from: k */
    private final zy f4054k;

    /* JADX INFO: renamed from: androidx.core.view.inputmethod.y$toq */
    /* JADX INFO: compiled from: InputContentInfoCompat.java */
    private static final class toq implements zy {

        /* JADX INFO: renamed from: k */
        @lvui
        private final Uri f4056k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @lvui
        private final ClipDescription f50835toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @dd
        private final Uri f50836zy;

        toq(@lvui Uri uri, @lvui ClipDescription clipDescription, @dd Uri uri2) {
            this.f4056k = uri;
            this.f50835toq = clipDescription;
            this.f50836zy = uri2;
        }

        @Override // androidx.core.view.inputmethod.C0699y.zy
        /* JADX INFO: renamed from: g */
        public void mo3341g() {
        }

        @Override // androidx.core.view.inputmethod.C0699y.zy
        @dd
        /* JADX INFO: renamed from: k */
        public Uri mo3342k() {
            return this.f50836zy;
        }

        @Override // androidx.core.view.inputmethod.C0699y.zy
        /* JADX INFO: renamed from: n */
        public void mo3343n() {
        }

        @Override // androidx.core.view.inputmethod.C0699y.zy
        @lvui
        /* JADX INFO: renamed from: q */
        public Uri mo3344q() {
            return this.f4056k;
        }

        @Override // androidx.core.view.inputmethod.C0699y.zy
        @lvui
        public ClipDescription toq() {
            return this.f50835toq;
        }

        @Override // androidx.core.view.inputmethod.C0699y.zy
        @dd
        public Object zy() {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.inputmethod.y$zy */
    /* JADX INFO: compiled from: InputContentInfoCompat.java */
    private interface zy {
        /* JADX INFO: renamed from: g */
        void mo3341g();

        @dd
        /* JADX INFO: renamed from: k */
        Uri mo3342k();

        /* JADX INFO: renamed from: n */
        void mo3343n();

        @lvui
        /* JADX INFO: renamed from: q */
        Uri mo3344q();

        @lvui
        ClipDescription toq();

        @dd
        Object zy();
    }

    public C0699y(@lvui Uri uri, @lvui ClipDescription clipDescription, @dd Uri uri2) {
        this.f4054k = new k(uri, clipDescription, uri2);
    }

    @dd
    public static C0699y f7l8(@dd Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0699y(new k(obj));
    }

    @dd
    /* JADX INFO: renamed from: g */
    public Object m3337g() {
        return this.f4054k.zy();
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public Uri m3338k() {
        return this.f4054k.mo3344q();
    }

    /* JADX INFO: renamed from: n */
    public void m3339n() {
        this.f4054k.mo3343n();
    }

    /* JADX INFO: renamed from: q */
    public void m3340q() {
        this.f4054k.mo3341g();
    }

    @lvui
    public ClipDescription toq() {
        return this.f4054k.toq();
    }

    @dd
    public Uri zy() {
        return this.f4054k.mo3342k();
    }

    /* JADX INFO: renamed from: androidx.core.view.inputmethod.y$k */
    /* JADX INFO: compiled from: InputContentInfoCompat.java */
    @hyr(25)
    private static final class k implements zy {

        /* JADX INFO: renamed from: k */
        @lvui
        final InputContentInfo f4055k;

        k(@lvui Object obj) {
            this.f4055k = (InputContentInfo) obj;
        }

        @Override // androidx.core.view.inputmethod.C0699y.zy
        /* JADX INFO: renamed from: g */
        public void mo3341g() {
            this.f4055k.releasePermission();
        }

        @Override // androidx.core.view.inputmethod.C0699y.zy
        @dd
        /* JADX INFO: renamed from: k */
        public Uri mo3342k() {
            return this.f4055k.getLinkUri();
        }

        @Override // androidx.core.view.inputmethod.C0699y.zy
        /* JADX INFO: renamed from: n */
        public void mo3343n() {
            this.f4055k.requestPermission();
        }

        @Override // androidx.core.view.inputmethod.C0699y.zy
        @lvui
        /* JADX INFO: renamed from: q */
        public Uri mo3344q() {
            return this.f4055k.getContentUri();
        }

        @Override // androidx.core.view.inputmethod.C0699y.zy
        @lvui
        public ClipDescription toq() {
            return this.f4055k.getDescription();
        }

        @Override // androidx.core.view.inputmethod.C0699y.zy
        @lvui
        public Object zy() {
            return this.f4055k;
        }

        k(@lvui Uri uri, @lvui ClipDescription clipDescription, @dd Uri uri2) {
            this.f4055k = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private C0699y(@lvui zy zyVar) {
        this.f4054k = zyVar;
    }
}
