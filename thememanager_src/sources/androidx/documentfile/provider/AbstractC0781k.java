package androidx.documentfile.provider;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.io.File;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: androidx.documentfile.provider.k */
/* JADX INFO: compiled from: DocumentFile.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0781k {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static final String f51020toq = "DocumentFile";

    /* JADX INFO: renamed from: k */
    @dd
    private final AbstractC0781k f4349k;

    AbstractC0781k(@dd AbstractC0781k abstractC0781k) {
        this.f4349k = abstractC0781k;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m3764h(@lvui Context context, @dd Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri);
    }

    @dd
    /* JADX INFO: renamed from: p */
    public static AbstractC0781k m3765p(@lvui Context context, @lvui Uri uri) {
        return new C0782n(null, context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
    }

    @dd
    /* JADX INFO: renamed from: s */
    public static AbstractC0781k m3766s(@lvui Context context, @lvui Uri uri) {
        return new C0783q(null, context, uri);
    }

    @lvui
    /* JADX INFO: renamed from: y */
    public static AbstractC0781k m3767y(@lvui File file) {
        return new zy(null, file);
    }

    public abstract boolean cdj();

    @dd
    public AbstractC0781k f7l8(@lvui String str) {
        for (AbstractC0781k abstractC0781k : fn3e()) {
            if (str.equals(abstractC0781k.ld6())) {
                return abstractC0781k;
            }
        }
        return null;
    }

    @lvui
    public abstract AbstractC0781k[] fn3e();

    /* JADX INFO: renamed from: g */
    public abstract boolean mo3768g();

    /* JADX INFO: renamed from: i */
    public abstract long mo3769i();

    /* JADX INFO: renamed from: k */
    public abstract boolean mo3770k();

    public abstract boolean ki();

    public abstract boolean kja0();

    @dd
    public abstract String ld6();

    /* JADX INFO: renamed from: n */
    public abstract boolean mo3771n();

    @lvui
    public abstract Uri n7h();

    @dd
    /* JADX INFO: renamed from: q */
    public abstract AbstractC0781k mo3772q(@lvui String str, @lvui String str2);

    @dd
    public abstract String qrj();

    public abstract long t8r();

    public abstract boolean toq();

    @dd
    public AbstractC0781k x2() {
        return this.f4349k;
    }

    public abstract boolean zurt(@lvui String str);

    @dd
    public abstract AbstractC0781k zy(@lvui String str);
}
