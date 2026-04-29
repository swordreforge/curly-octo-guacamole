package miuix.core.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.system.ErrnoException;
import android.system.Os;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import miuix.core.util.toq;

/* JADX INFO: compiled from: DirectIndexedFileExtractor.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static String f87404f7l8 = null;

    /* JADX INFO: renamed from: g */
    private static final String f39939g = "-tmp";

    /* JADX INFO: renamed from: k */
    private static final String f39940k = "DirectIndexedFileExt";

    /* JADX INFO: renamed from: n */
    private static final String f39941n = ".idf";

    /* JADX INFO: renamed from: q */
    private static final String f39942q = "idf";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f87405toq = 505;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f87406zy = 436;

    /* JADX INFO: renamed from: k */
    private static void m25685k(Context context) {
        if (f87404f7l8 == null) {
            try {
                Context contextCreatePackageContext = context.createPackageContext(context.getPackageName(), 2);
                try {
                    contextCreatePackageContext = (Context) contextCreatePackageContext.getClass().getMethod("createDeviceProtectedStorageContext", new Class[0]).invoke(contextCreatePackageContext, new Object[0]);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
                if (contextCreatePackageContext.getFilesDir() != null) {
                    f87404f7l8 = contextCreatePackageContext.getFilesDir().getAbsolutePath() + File.separator + f39942q;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                e2.printStackTrace();
            }
        }
        if (f87404f7l8 == null) {
            Log.w(f39940k, "Error: Cannot locate IDF_FILES_PATH");
            return;
        }
        File file = new File(f87404f7l8);
        if (file.exists() || !file.mkdirs()) {
            return;
        }
        try {
            Os.mkdir(f87404f7l8, 505);
        } catch (ErrnoException e3) {
            e3.printStackTrace();
        }
    }

    public static String toq(Context context, String str) {
        m25685k(context);
        if (f87404f7l8 == null) {
            return null;
        }
        return f87404f7l8 + File.separator + str;
    }

    private static boolean zy(Context context, String str, String str2) {
        try {
            toq.C7097p qVar = toq.toq(context.getAssets().open(str, 1));
            try {
                toq.C7097p c7097pZy = toq.zy(str2);
                boolean z2 = qVar.m25648n() > c7097pZy.m25648n();
                qVar.m25647k();
                c7097pZy.m25647k();
                return z2;
            } catch (IOException e2) {
                e2.printStackTrace();
                qVar.m25647k();
                return true;
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            return false;
        }
    }
}
