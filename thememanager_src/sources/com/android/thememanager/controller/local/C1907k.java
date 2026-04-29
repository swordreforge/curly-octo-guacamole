package com.android.thememanager.controller.local;

import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.basemodule.resource.model.Resource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/* JADX INFO: renamed from: com.android.thememanager.controller.local.k */
/* JADX INFO: compiled from: BootanimationzipPathHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1907k {

    /* JADX INFO: renamed from: k */
    public static final String f10893k = "/system/media/theme/.data/meta/bootanimation/default.mrm";

    /* JADX INFO: renamed from: k */
    public void m7506k(String target, String source) {
        if (TextUtils.isEmpty(target)) {
            return;
        }
        try {
            File file = new File(source);
            if (!file.exists()) {
                return;
            }
            ZipFile zipFile = new ZipFile(file);
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return;
                }
                String name = nextEntry.getName();
                StringBuilder sb = new StringBuilder();
                sb.append(target);
                String str = File.separator;
                sb.append(str);
                sb.append(name);
                File file2 = new File(sb.toString());
                if (nextEntry.isDirectory()) {
                    new File(target + str + name).mkdirs();
                } else {
                    if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                        file2.getParentFile().mkdirs();
                    }
                    byte[] bArr = new byte[1024];
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    InputStream inputStream = zipFile.getInputStream(nextEntry);
                    while (true) {
                        int i2 = inputStream.read(bArr);
                        if (i2 == -1) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, i2);
                        }
                    }
                    fileOutputStream.close();
                    inputStream.close();
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m7507n(File file) {
        return file.getAbsolutePath().equals(f10893k);
    }

    /* JADX INFO: renamed from: q */
    public String m7508q(File file) {
        String strNextLine;
        String str = null;
        try {
            Scanner scanner = new Scanner(new FileReader(file));
            while (scanner.hasNextLine() && (strNextLine = scanner.nextLine()) != null && strNextLine.trim().length() != 0) {
                if (!scanner.hasNextLine()) {
                    return strNextLine;
                }
                str = strNextLine;
            }
            scanner.close();
            return str;
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            Log.d("BootanimationzipPath", "getTextFileLastLine: MIUIROM-284381 " + e2.toString());
            return null;
        }
    }

    public List<String> toq(File file, Resource resource) {
        ArrayList arrayList = new ArrayList();
        String strZy = zy(file, resource);
        if (!TextUtils.isEmpty(strZy)) {
            arrayList.add(strZy);
        }
        return arrayList;
    }

    public String zy(File file, Resource resource) {
        if (!m7507n(file)) {
            return null;
        }
        File externalFilesDir = bf2.toq.toq().getExternalFilesDir("presetbootanimationdir");
        if (!externalFilesDir.exists()) {
            externalFilesDir.mkdirs();
        }
        m7506k(externalFilesDir.getAbsolutePath(), resource.getContentPath());
        File file2 = new File(externalFilesDir.getAbsolutePath() + File.separator + "desc.txt");
        String strM7508q = m7508q(file2);
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(strM7508q)) {
            return null;
        }
        for (int length = strM7508q.length() - 1; length >= 0 && strM7508q.charAt(length) != 't'; length--) {
            sb.append(strM7508q.charAt(length));
        }
        String str = "part" + ((Object) sb.reverse());
        for (File file3 : file2.getParentFile().listFiles()) {
            if (file3.getName().equals(str)) {
                File[] fileArrListFiles = file3.listFiles();
                Arrays.sort(fileArrListFiles);
                return fileArrListFiles[fileArrListFiles.length - 1].getAbsolutePath();
            }
        }
        return null;
    }
}
