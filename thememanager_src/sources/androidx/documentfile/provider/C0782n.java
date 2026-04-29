package androidx.documentfile.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import java.util.ArrayList;
import zy.dd;
import zy.hyr;

/* JADX INFO: renamed from: androidx.documentfile.provider.n */
/* JADX INFO: compiled from: TreeDocumentFile.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(21)
class C0782n extends AbstractC0781k {

    /* JADX INFO: renamed from: q */
    private Uri f4350q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Context f51021zy;

    C0782n(@dd AbstractC0781k abstractC0781k, Context context, Uri uri) {
        super(abstractC0781k);
        this.f51021zy = context;
        this.f4350q = uri;
    }

    @dd
    private static Uri fu4(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void ni7(@dd AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    public boolean cdj() {
        return toq.m3777p(this.f51021zy, this.f4350q);
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    public AbstractC0781k[] fn3e() {
        ContentResolver contentResolver = this.f51021zy.getContentResolver();
        Uri uri = this.f4350q;
        Uri uriBuildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uriBuildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                while (cursorQuery.moveToNext()) {
                    arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.f4350q, cursorQuery.getString(0)));
                }
            } catch (Exception e2) {
                Log.w("DocumentFile", "Failed query: " + e2);
            }
            Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
            AbstractC0781k[] abstractC0781kArr = new AbstractC0781k[uriArr.length];
            for (int i2 = 0; i2 < uriArr.length; i2++) {
                abstractC0781kArr[i2] = new C0782n(this, this.f51021zy, uriArr[i2]);
            }
            return abstractC0781kArr;
        } finally {
            ni7(cursorQuery);
        }
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    /* JADX INFO: renamed from: g */
    public boolean mo3768g() {
        return toq.m3778q(this.f51021zy, this.f4350q);
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    /* JADX INFO: renamed from: i */
    public long mo3769i() {
        return toq.qrj(this.f51021zy, this.f4350q);
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    /* JADX INFO: renamed from: k */
    public boolean mo3770k() {
        return toq.m3775k(this.f51021zy, this.f4350q);
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    public boolean ki() {
        return toq.ld6(this.f51021zy, this.f4350q);
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    public boolean kja0() {
        return toq.m3779s(this.f51021zy, this.f4350q);
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    @dd
    public String ld6() {
        return toq.m3773g(this.f51021zy, this.f4350q);
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    /* JADX INFO: renamed from: n */
    public boolean mo3771n() {
        try {
            return DocumentsContract.deleteDocument(this.f51021zy.getContentResolver(), this.f4350q);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    public Uri n7h() {
        return this.f4350q;
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    @dd
    /* JADX INFO: renamed from: q */
    public AbstractC0781k mo3772q(String str, String str2) {
        Uri uriFu4 = fu4(this.f51021zy, this.f4350q, str, str2);
        if (uriFu4 != null) {
            return new C0782n(this, this.f51021zy, uriFu4);
        }
        return null;
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    @dd
    public String qrj() {
        return toq.m3780y(this.f51021zy, this.f4350q);
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    public long t8r() {
        return toq.x2(this.f51021zy, this.f4350q);
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    public boolean toq() {
        return toq.toq(this.f51021zy, this.f4350q);
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    public boolean zurt(String str) {
        try {
            Uri uriRenameDocument = DocumentsContract.renameDocument(this.f51021zy.getContentResolver(), this.f4350q, str);
            if (uriRenameDocument != null) {
                this.f4350q = uriRenameDocument;
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    @dd
    public AbstractC0781k zy(String str) {
        Uri uriFu4 = fu4(this.f51021zy, this.f4350q, "vnd.android.document/directory", str);
        if (uriFu4 != null) {
            return new C0782n(this, this.f51021zy, uriFu4);
        }
        return null;
    }
}
