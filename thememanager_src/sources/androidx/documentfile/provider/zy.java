package androidx.documentfile.provider;

import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import zy.dd;

/* JADX INFO: compiled from: RawDocumentFile.java */
/* JADX INFO: loaded from: classes.dex */
class zy extends AbstractC0781k {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private File f51024zy;

    zy(@dd AbstractC0781k abstractC0781k, File file) {
        super(abstractC0781k);
        this.f51024zy = file;
    }

    private static String fu4(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(iLastIndexOf + 1).toLowerCase());
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    private static boolean ni7(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zNi7 = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    zNi7 &= ni7(file2);
                }
                if (!file2.delete()) {
                    Log.w("DocumentFile", "Failed to delete " + file2);
                    zNi7 = false;
                }
            }
        }
        return zNi7;
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    public boolean cdj() {
        return this.f51024zy.isFile();
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    public AbstractC0781k[] fn3e() {
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = this.f51024zy.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                arrayList.add(new zy(this, file));
            }
        }
        return (AbstractC0781k[]) arrayList.toArray(new AbstractC0781k[arrayList.size()]);
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    /* JADX INFO: renamed from: g */
    public boolean mo3768g() {
        return this.f51024zy.exists();
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    /* JADX INFO: renamed from: i */
    public long mo3769i() {
        return this.f51024zy.length();
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    /* JADX INFO: renamed from: k */
    public boolean mo3770k() {
        return this.f51024zy.canRead();
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    public boolean ki() {
        return false;
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    public boolean kja0() {
        return this.f51024zy.isDirectory();
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    public String ld6() {
        return this.f51024zy.getName();
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    /* JADX INFO: renamed from: n */
    public boolean mo3771n() {
        ni7(this.f51024zy);
        return this.f51024zy.delete();
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    public Uri n7h() {
        return Uri.fromFile(this.f51024zy);
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    @dd
    /* JADX INFO: renamed from: q */
    public AbstractC0781k mo3772q(String str, String str2) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            str2 = str2 + "." + extensionFromMimeType;
        }
        File file = new File(this.f51024zy, str2);
        try {
            file.createNewFile();
            return new zy(this, file);
        } catch (IOException e2) {
            Log.w("DocumentFile", "Failed to createFile: " + e2);
            return null;
        }
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    @dd
    public String qrj() {
        if (this.f51024zy.isDirectory()) {
            return null;
        }
        return fu4(this.f51024zy.getName());
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    public long t8r() {
        return this.f51024zy.lastModified();
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    public boolean toq() {
        return this.f51024zy.canWrite();
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    public boolean zurt(String str) {
        File file = new File(this.f51024zy.getParentFile(), str);
        if (!this.f51024zy.renameTo(file)) {
            return false;
        }
        this.f51024zy = file;
        return true;
    }

    @Override // androidx.documentfile.provider.AbstractC0781k
    @dd
    public AbstractC0781k zy(String str) {
        File file = new File(this.f51024zy, str);
        if (file.isDirectory() || file.mkdir()) {
            return new zy(this, file);
        }
        return null;
    }
}
