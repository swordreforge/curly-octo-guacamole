package androidx.core.util;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: androidx.core.util.k */
/* JADX INFO: compiled from: AtomicFile.java */
/* JADX INFO: loaded from: classes.dex */
public class C0637k {

    /* JADX INFO: renamed from: q */
    private static final String f3887q = "AtomicFile";

    /* JADX INFO: renamed from: k */
    private final File f3888k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final File f50631toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final File f50632zy;

    public C0637k(@lvui File file) {
        this.f3888k = file;
        this.f50631toq = new File(file.getPath() + ".new");
        this.f50632zy = new File(file.getPath() + ".bak");
    }

    private static void f7l8(@lvui File file, @lvui File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e(f3887q, "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e(f3887q, "Failed to rename " + file + " to " + file2);
    }

    /* JADX INFO: renamed from: s */
    private static boolean m2961s(@lvui FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @lvui
    /* JADX INFO: renamed from: g */
    public byte[] m2962g() throws IOException {
        FileInputStream fileInputStreamM2964n = m2964n();
        try {
            byte[] bArr = new byte[fileInputStreamM2964n.available()];
            int i2 = 0;
            while (true) {
                int i3 = fileInputStreamM2964n.read(bArr, i2, bArr.length - i2);
                if (i3 <= 0) {
                    return bArr;
                }
                i2 += i3;
                int iAvailable = fileInputStreamM2964n.available();
                if (iAvailable > bArr.length - i2) {
                    byte[] bArr2 = new byte[iAvailable + i2];
                    System.arraycopy(bArr, 0, bArr2, 0, i2);
                    bArr = bArr2;
                }
            }
        } finally {
            fileInputStreamM2964n.close();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m2963k() {
        this.f3888k.delete();
        this.f50631toq.delete();
        this.f50632zy.delete();
    }

    @lvui
    /* JADX INFO: renamed from: n */
    public FileInputStream m2964n() throws FileNotFoundException {
        if (this.f50632zy.exists()) {
            f7l8(this.f50632zy, this.f3888k);
        }
        if (this.f50631toq.exists() && this.f3888k.exists() && !this.f50631toq.delete()) {
            Log.e(f3887q, "Failed to delete outdated new file " + this.f50631toq);
        }
        return new FileInputStream(this.f3888k);
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public File m2965q() {
        return this.f3888k;
    }

    public void toq(@dd FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!m2961s(fileOutputStream)) {
            Log.e(f3887q, "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e2) {
            Log.e(f3887q, "Failed to close file output stream", e2);
        }
        if (this.f50631toq.delete()) {
            return;
        }
        Log.e(f3887q, "Failed to delete new file " + this.f50631toq);
    }

    @lvui
    /* JADX INFO: renamed from: y */
    public FileOutputStream m2966y() throws IOException {
        if (this.f50632zy.exists()) {
            f7l8(this.f50632zy, this.f3888k);
        }
        try {
            return new FileOutputStream(this.f50631toq);
        } catch (FileNotFoundException unused) {
            if (!this.f50631toq.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + this.f50631toq);
            }
            try {
                return new FileOutputStream(this.f50631toq);
            } catch (FileNotFoundException e2) {
                throw new IOException("Failed to create new file " + this.f50631toq, e2);
            }
        }
    }

    public void zy(@dd FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!m2961s(fileOutputStream)) {
            Log.e(f3887q, "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e2) {
            Log.e(f3887q, "Failed to close file output stream", e2);
        }
        f7l8(this.f50631toq, this.f3888k);
    }
}
