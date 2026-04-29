package miuix.os;

import android.os.Environment;
import java.io.File;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: miuix.os.n */
/* JADX INFO: compiled from: Environment.java */
/* JADX INFO: loaded from: classes3.dex */
public class EnvironmentC7212n extends Environment {

    /* JADX INFO: renamed from: k */
    private static final String f40709k = "MIUI";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static File f87871toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final File f87872zy = new File("/data/miui/");

    /* JADX INFO: renamed from: q */
    private static final File f40711q = new File(m26175n(), "apps");

    /* JADX INFO: renamed from: n */
    private static final File f40710n = new File(m26175n(), "preset_apps");

    /* JADX INFO: renamed from: g */
    private static final File f40708g = new File(m26175n(), "current");

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static int f87870f7l8 = 0;

    protected EnvironmentC7212n() throws InstantiationException {
        throw new InstantiationException("Cannot instantiate utility class");
    }

    public static boolean f7l8() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* JADX INFO: renamed from: g */
    public static File m26173g() {
        return f40710n;
    }

    /* JADX INFO: renamed from: k */
    public static int m26174k() {
        if (f87870f7l8 == 0) {
            Pattern patternCompile = Pattern.compile("cpu[0-9]*");
            int i2 = 0;
            for (String str : new File("/sys/devices/system/cpu/").list()) {
                if (patternCompile.matcher(str).matches()) {
                    i2++;
                }
            }
            f87870f7l8 = i2;
        }
        return f87870f7l8;
    }

    /* JADX INFO: renamed from: n */
    public static File m26175n() {
        return f87872zy;
    }

    /* JADX INFO: renamed from: q */
    public static File m26176q() {
        return f40708g;
    }

    public static File toq() {
        try {
            if (f87871toq == null) {
                f87871toq = new File(Environment.getExternalStorageDirectory(), f40709k);
            }
            if (!f87871toq.exists() && Environment.getExternalStorageDirectory().exists()) {
                f87871toq.mkdir();
            }
            return f87871toq;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static File zy() {
        return f40711q;
    }
}
