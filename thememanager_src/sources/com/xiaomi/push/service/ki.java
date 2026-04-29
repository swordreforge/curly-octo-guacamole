package com.xiaomi.push.service;

import android.os.Process;
import android.text.TextUtils;
import com.xiaomi.push.f26p;
import com.xiaomi.push.kiv;
import com.xiaomi.push.ngy;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class ki {

    /* JADX INFO: renamed from: k */
    private static final Pattern f33829k = Pattern.compile("([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})");

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static long f73629toq = 0;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static ThreadPoolExecutor f73630zy = new ThreadPoolExecutor(1, 1, 20, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static boolean m21657g(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            com.xiaomi.channel.commonutils.logger.zy.kja0("ConnectivityTest: begin to connect to " + str);
            Socket socket = new Socket();
            socket.connect(com.xiaomi.push.fnq8.m20879q(str, 5222), 5000);
            socket.setTcpNoDelay(true);
            com.xiaomi.channel.commonutils.logger.zy.kja0("ConnectivityTest: connect to " + str + " in " + (System.currentTimeMillis() - jCurrentTimeMillis));
            socket.close();
            return true;
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.zy.jk("ConnectivityTest: could not connect to:" + str + " exception: " + th.getClass().getSimpleName() + " description: " + th.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    private static String m21658k(String str) throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(str)));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        String string = sb.toString();
                        f26p.toq(bufferedReader);
                        return string;
                    }
                    sb.append("\n");
                    sb.append(line);
                }
            } catch (Exception unused) {
                f26p.toq(bufferedReader);
                return null;
            } catch (Throwable th2) {
                th = th2;
                f26p.toq(bufferedReader);
                throw th;
            }
        } catch (Exception unused2) {
            bufferedReader = null;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m21659n() throws Throwable {
        String strM21658k = m21658k("/proc/self/net/tcp");
        if (!TextUtils.isEmpty(strM21658k)) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("dump tcp for uid = " + Process.myUid());
            com.xiaomi.channel.commonutils.logger.zy.kja0(strM21658k);
        }
        String strM21658k2 = m21658k("/proc/self/net/tcp6");
        if (TextUtils.isEmpty(strM21658k2)) {
            return;
        }
        com.xiaomi.channel.commonutils.logger.zy.kja0("dump tcp6 for uid = " + Process.myUid());
        com.xiaomi.channel.commonutils.logger.zy.kja0(strM21658k2);
    }

    public static void toq() {
        ngy.C5884k c5884kZy;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if ((f73630zy.getActiveCount() <= 0 || jCurrentTimeMillis - f73629toq >= 1800000) && kiv.m21078g().ld6() && (c5884kZy = nn86.m21710g().zy()) != null && c5884kZy.m21321z() > 0) {
            f73629toq = jCurrentTimeMillis;
            zy(c5884kZy.kja0(), true);
        }
    }

    public static void zy(List<String> list, boolean z2) {
        f73630zy.execute(new t8r(list, z2));
    }
}
