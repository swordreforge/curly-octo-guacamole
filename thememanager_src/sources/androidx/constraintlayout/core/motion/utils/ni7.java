package androidx.constraintlayout.core.motion.utils;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes.dex */
public class ni7 {

    /* JADX INFO: renamed from: k */
    static InterfaceC0282k f1631k;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.ni7$k */
    /* JADX INFO: compiled from: Utils.java */
    public interface InterfaceC0282k {
        /* JADX INFO: renamed from: k */
        void m1046k(String str);
    }

    public static int f7l8(float f2, float f3, float f4, float f5) {
        int iM1041k = m1041k((int) (f2 * 255.0f));
        int iM1041k2 = m1041k((int) (f3 * 255.0f));
        return (iM1041k << 16) | (m1041k((int) (f5 * 255.0f)) << 24) | (iM1041k2 << 8) | m1041k((int) (f4 * 255.0f));
    }

    /* JADX INFO: renamed from: g */
    public static void m1040g(String str, String str2) {
        System.err.println(str + " : " + str2);
    }

    /* JADX INFO: renamed from: k */
    private static int m1041k(int i2) {
        int i3 = (i2 & (~(i2 >> 31))) - 255;
        return (i3 & (i3 >> 31)) + 255;
    }

    /* JADX INFO: renamed from: n */
    public static void m1042n(String str, int i2) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iMin = Math.min(i2, stackTrace.length - 1);
        String str2 = " ";
        for (int i3 = 1; i3 <= iMin; i3++) {
            StackTraceElement stackTraceElement = stackTrace[i3];
            String str3 = ".(" + stackTrace[i3].getFileName() + ":" + stackTrace[i3].getLineNumber() + ") " + stackTrace[i3].getMethodName();
            str2 = str2 + " ";
            System.out.println(str + str2 + str3 + str2);
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m1043q(String str, String str2) {
        System.out.println(str + " : " + str2);
    }

    /* JADX INFO: renamed from: s */
    public static void m1044s(String str) {
        try {
            OutputStream outputStream = new Socket("127.0.0.1", 5327).getOutputStream();
            outputStream.write(str.getBytes());
            outputStream.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m1045y(InterfaceC0282k interfaceC0282k) {
        f1631k = interfaceC0282k;
    }

    public static void zy(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String strSubstring = (stackTraceElement.getMethodName() + "                  ").substring(0, 17);
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")" + "    ".substring(Integer.toString(stackTraceElement.getLineNumber()).length()) + strSubstring;
        System.out.println(str2 + " " + str);
        InterfaceC0282k interfaceC0282k = f1631k;
        if (interfaceC0282k != null) {
            interfaceC0282k.m1046k(str2 + " " + str);
        }
    }

    public int toq(float[] fArr) {
        return (m1041k((int) (fArr[3] * 255.0f)) << 24) | (m1041k((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m1041k((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m1041k((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }
}
