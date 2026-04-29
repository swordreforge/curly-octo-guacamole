package androidx.documentfile.provider;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import zy.dd;
import zy.hyr;

/* JADX INFO: renamed from: androidx.documentfile.provider.q */
/* JADX INFO: compiled from: SingleDocumentFile.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(19)
class C0783q extends AbstractC0781k {

    /* JADX INFO: renamed from: q */
    private Uri f4351q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Context f51022zy;

    C0783q(@dd AbstractC0781k abstractC0781k, Context context, Uri uri) {
        super(abstractC0781k);
        this.f51022zy = context;
        this.f4351q = uri;
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    public boolean cdj() {
        return toq.m3777p(this.f51022zy, this.f4351q);
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    public AbstractC0781k[] fn3e() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    /* JADX INFO: renamed from: g */
    public boolean mo3768g() {
        return toq.m3778q(this.f51022zy, this.f4351q);
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    /* JADX INFO: renamed from: i */
    public long mo3769i() {
        return toq.qrj(this.f51022zy, this.f4351q);
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    /* JADX INFO: renamed from: k */
    public boolean mo3770k() {
        return toq.m3775k(this.f51022zy, this.f4351q);
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    public boolean ki() {
        return toq.ld6(this.f51022zy, this.f4351q);
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    public boolean kja0() {
        return toq.m3779s(this.f51022zy, this.f4351q);
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    @dd
    public String ld6() {
        return toq.m3773g(this.f51022zy, this.f4351q);
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    /* JADX INFO: renamed from: n */
    public boolean mo3771n() {
        try {
            return DocumentsContract.deleteDocument(this.f51022zy.getContentResolver(), this.f4351q);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    public Uri n7h() {
        return this.f4351q;
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    /* JADX INFO: renamed from: q */
    public AbstractC0781k mo3772q(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    @dd
    public String qrj() {
        return toq.m3780y(this.f51022zy, this.f4351q);
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    public long t8r() {
        return toq.x2(this.f51022zy, this.f4351q);
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    public boolean toq() {
        return toq.toq(this.f51022zy, this.f4351q);
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    public boolean zurt(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    public AbstractC0781k zy(String str) {
        throw new UnsupportedOperationException();
    }
}
