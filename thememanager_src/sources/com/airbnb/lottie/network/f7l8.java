package com.airbnb.lottie.network;

import android.util.Pair;
import com.airbnb.lottie.utils.C1510q;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import zy.dd;
import zy.lvui;
import zy.y9n;

/* JADX INFO: compiled from: NetworkCache.java */
/* JADX INFO: loaded from: classes.dex */
public class f7l8 {

    /* JADX INFO: renamed from: k */
    @lvui
    private final InterfaceC1479n f8128k;

    public f7l8(@lvui InterfaceC1479n interfaceC1479n) {
        this.f8128k = interfaceC1479n;
    }

    /* JADX INFO: renamed from: n */
    private File m6109n() {
        File fileMo5962k = this.f8128k.mo5962k();
        if (fileMo5962k.isFile()) {
            fileMo5962k.delete();
        }
        if (!fileMo5962k.exists()) {
            fileMo5962k.mkdirs();
        }
        return fileMo5962k;
    }

    @dd
    /* JADX INFO: renamed from: q */
    private File m6110q(String str) throws FileNotFoundException {
        File file = new File(m6109n(), zy(str, zy.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(m6109n(), zy(str, zy.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    private static String zy(String str, zy zyVar, boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z2 ? zyVar.tempExtension() : zyVar.extension);
        return sb.toString();
    }

    File f7l8(String str, InputStream inputStream, zy zyVar) throws IOException {
        File file = new File(m6109n(), zy(str, zyVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i2 = inputStream.read(bArr);
                    if (i2 == -1) {
                        fileOutputStream.flush();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i2);
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }

    /* JADX INFO: renamed from: g */
    void m6111g(String str, zy zyVar) {
        File file = new File(m6109n(), zy(str, zyVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        C1510q.m6254k("Copying temp file to real file (" + file2 + ")");
        if (zRenameTo) {
            return;
        }
        C1510q.m6255n("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }

    /* JADX INFO: renamed from: k */
    public void m6112k() {
        File fileM6109n = m6109n();
        if (fileM6109n.exists()) {
            File[] fileArrListFiles = fileM6109n.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file : fileM6109n.listFiles()) {
                    file.delete();
                }
            }
            fileM6109n.delete();
        }
    }

    @dd
    @y9n
    Pair<zy, InputStream> toq(String str) {
        try {
            File fileM6110q = m6110q(str);
            if (fileM6110q == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileM6110q);
            zy zyVar = fileM6110q.getAbsolutePath().endsWith(".zip") ? zy.ZIP : zy.JSON;
            C1510q.m6254k("Cache hit for " + str + " at " + fileM6110q.getAbsolutePath());
            return new Pair<>(zyVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }
}
