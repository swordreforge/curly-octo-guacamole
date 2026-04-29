package androidx.core.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.io.FileNotFoundException;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: DocumentsContractCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class zy {

    /* JADX INFO: renamed from: k */
    private static final String f3796k = "tree";

    /* JADX INFO: renamed from: androidx.core.provider.zy$k */
    /* JADX INFO: compiled from: DocumentsContractCompat.java */
    public static final class C0606k {

        /* JADX INFO: renamed from: k */
        public static final int f3797k = 512;

        private C0606k() {
        }
    }

    /* JADX INFO: renamed from: androidx.core.provider.zy$q */
    /* JADX INFO: compiled from: DocumentsContractCompat.java */
    @hyr(24)
    private static class C0607q {
        private C0607q() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static boolean m2831k(@lvui Uri uri) {
            return DocumentsContract.isTreeUri(uri);
        }

        @InterfaceC7830i
        static boolean toq(ContentResolver contentResolver, Uri uri, Uri uri2) throws FileNotFoundException {
            return DocumentsContract.removeDocument(contentResolver, uri, uri2);
        }
    }

    /* JADX INFO: compiled from: DocumentsContractCompat.java */
    @hyr(19)
    private static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        public static Uri m2832k(String str, String str2) {
            return DocumentsContract.buildDocumentUri(str, str2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static boolean m2833q(Context context, @dd Uri uri) {
            return DocumentsContract.isDocumentUri(context, uri);
        }

        @InterfaceC7830i
        static boolean toq(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
            return DocumentsContract.deleteDocument(contentResolver, uri);
        }

        @InterfaceC7830i
        static String zy(Uri uri) {
            return DocumentsContract.getDocumentId(uri);
        }
    }

    /* JADX INFO: renamed from: androidx.core.provider.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DocumentsContractCompat.java */
    @hyr(21)
    private static class C7868zy {
        private C7868zy() {
        }

        @InterfaceC7830i
        static Uri f7l8(@lvui ContentResolver contentResolver, @lvui Uri uri, @lvui String str) throws FileNotFoundException {
            return DocumentsContract.renameDocument(contentResolver, uri, str);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: g */
        static String m2834g(Uri uri) {
            return DocumentsContract.getTreeDocumentId(uri);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static Uri m2835k(String str, String str2) {
            return DocumentsContract.buildChildDocumentsUri(str, str2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: n */
        static Uri m2836n(ContentResolver contentResolver, Uri uri, String str, String str2) throws FileNotFoundException {
            return DocumentsContract.createDocument(contentResolver, uri, str, str2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        public static Uri m2837q(String str, String str2) {
            return DocumentsContract.buildTreeDocumentUri(str, str2);
        }

        @InterfaceC7830i
        static Uri toq(Uri uri, String str) {
            return DocumentsContract.buildChildDocumentsUriUsingTree(uri, str);
        }

        @InterfaceC7830i
        static Uri zy(Uri uri, String str) {
            return DocumentsContract.buildDocumentUriUsingTree(uri, str);
        }
    }

    private zy() {
    }

    @dd
    public static String f7l8(@lvui Uri uri) {
        return toq.zy(uri);
    }

    @dd
    /* JADX INFO: renamed from: g */
    public static Uri m2824g(@lvui ContentResolver contentResolver, @lvui Uri uri, @lvui String str, @lvui String str2) throws FileNotFoundException {
        return C7868zy.m2836n(contentResolver, uri, str, str2);
    }

    @dd
    /* JADX INFO: renamed from: k */
    public static Uri m2825k(@lvui String str, @dd String str2) {
        return C7868zy.m2835k(str, str2);
    }

    public static boolean ld6(@lvui ContentResolver contentResolver, @lvui Uri uri, @lvui Uri uri2) throws FileNotFoundException {
        return C0607q.toq(contentResolver, uri, uri2);
    }

    @dd
    /* JADX INFO: renamed from: n */
    public static Uri m2826n(@lvui String str, @lvui String str2) {
        return C7868zy.m2837q(str, str2);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m2827p(@lvui Uri uri) {
        return C0607q.m2831k(uri);
    }

    @dd
    /* JADX INFO: renamed from: q */
    public static Uri m2828q(@lvui Uri uri, @lvui String str) {
        return C7868zy.zy(uri, str);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m2829s(@lvui Context context, @dd Uri uri) {
        return toq.m2833q(context, uri);
    }

    @dd
    public static Uri toq(@lvui Uri uri, @lvui String str) {
        return C7868zy.toq(uri, str);
    }

    @dd
    public static Uri x2(@lvui ContentResolver contentResolver, @lvui Uri uri, @lvui String str) throws FileNotFoundException {
        return C7868zy.f7l8(contentResolver, uri, str);
    }

    @dd
    /* JADX INFO: renamed from: y */
    public static String m2830y(@lvui Uri uri) {
        return C7868zy.m2834g(uri);
    }

    @dd
    public static Uri zy(@lvui String str, @lvui String str2) {
        return toq.m2832k(str, str2);
    }
}
