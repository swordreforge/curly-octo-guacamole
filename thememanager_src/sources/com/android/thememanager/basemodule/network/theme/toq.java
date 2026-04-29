package com.android.thememanager.basemodule.network.theme;

import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import java.util.Random;
import retrofit2.C7639i;
import zy.dd;

/* JADX INFO: compiled from: ApiUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    private static final Object f10115k = new Object();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static volatile Random f57608toq;

    /* JADX INFO: renamed from: k */
    public static <T> boolean m6892k(@dd C7639i<CommonResponse<T>> response) {
        return (response == null || !response.f7l8() || response.m27986k() == null || response.m27986k().apiCode != 0 || response.m27986k().apiData == null) ? false : true;
    }

    public static int toq() {
        if (f57608toq == null) {
            synchronized (f10115k) {
                if (f57608toq == null) {
                    f57608toq = new Random();
                }
            }
        }
        return f57608toq.nextInt(1000);
    }
}
