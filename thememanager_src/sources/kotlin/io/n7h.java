package kotlin.io;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.text.fti;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: FilePathComponents.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nFilePathComponents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n1549#2:149\n1620#2,3:150\n*S KotlinDebug\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n*L\n133#1:149\n133#1:150,3\n*E\n"})
class n7h {
    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static final C6276s m22938g(@InterfaceC7396q File file) {
        List listA9;
        d2ok.m23075h(file, "<this>");
        String path = file.getPath();
        d2ok.kja0(path, "path");
        int qVar = toq(path);
        String strSubstring = path.substring(0, qVar);
        d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        String strSubstring2 = path.substring(qVar);
        d2ok.kja0(strSubstring2, "this as java.lang.String).substring(startIndex)");
        if (strSubstring2.length() == 0) {
            listA9 = kotlin.collections.ni7.a9();
        } else {
            List listQexj = fti.qexj(strSubstring2, new char[]{File.separatorChar}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(kotlin.collections.fu4.vyq(listQexj, 10));
            Iterator it = listQexj.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            listA9 = arrayList;
        }
        return new C6276s(new File(strSubstring), listA9);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final File m22939k(@InterfaceC7396q File file) {
        d2ok.m23075h(file, "<this>");
        return new File(zy(file));
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final File m22940n(@InterfaceC7396q File file, int i2, int i3) {
        d2ok.m23075h(file, "<this>");
        return m22938g(file).m23008p(i2, i3);
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m22941q(@InterfaceC7396q File file) {
        d2ok.m23075h(file, "<this>");
        String path = file.getPath();
        d2ok.kja0(path, "path");
        return toq(path) > 0;
    }

    private static final int toq(String str) {
        int iSc;
        int iSc2 = fti.sc(str, File.separatorChar, 0, false, 4, null);
        if (iSc2 != 0) {
            if (iSc2 > 0 && str.charAt(iSc2 - 1) == ':') {
                return iSc2 + 1;
            }
            if (iSc2 == -1 && fti.c25(str, ':', false, 2, null)) {
                return str.length();
            }
            return 0;
        }
        if (str.length() > 1) {
            char cCharAt = str.charAt(1);
            char c2 = File.separatorChar;
            if (cCharAt == c2 && (iSc = fti.sc(str, c2, 2, false, 4, null)) >= 0) {
                int iSc3 = fti.sc(str, File.separatorChar, iSc + 1, false, 4, null);
                return iSc3 >= 0 ? iSc3 + 1 : str.length();
            }
        }
        return 1;
    }

    @InterfaceC7396q
    public static final String zy(@InterfaceC7396q File file) {
        d2ok.m23075h(file, "<this>");
        String path = file.getPath();
        d2ok.kja0(path, "path");
        String path2 = file.getPath();
        d2ok.kja0(path2, "path");
        String strSubstring = path.substring(0, toq(path2));
        d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
