package com.tencent.p003a.p004a.p005a.p006a;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.a.a.a.a.k */
/* JADX INFO: loaded from: classes3.dex */
final class C5358k {
    /* JADX INFO: renamed from: k */
    static List<String> m18230k(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                fileReader.close();
                bufferedReader.close();
                return arrayList;
            }
            arrayList.add(line.trim());
        }
    }

    static File toq(String str) {
        File file = new File(str);
        if (file.exists()) {
            return file;
        }
        if (!file.getParentFile().exists()) {
            toq(file.getParentFile().getAbsolutePath());
        }
        file.mkdir();
        return file;
    }
}
