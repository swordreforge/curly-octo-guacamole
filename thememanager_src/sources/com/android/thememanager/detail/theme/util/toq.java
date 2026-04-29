package com.android.thememanager.detail.theme.util;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import androidx.core.content.FileProvider;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.basemodule.utils.a9;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p029m.zy;
import yz.C7794k;
import zy.lvui;
import zy.y9n;

/* JADX INFO: compiled from: ShareUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq {

    /* JADX INFO: renamed from: g */
    public static final String f11188g = "com.sina.weibo";

    /* JADX INFO: renamed from: k */
    private static final String f11189k = "com.android.thememanager.detail.theme.util.toq";

    /* JADX INFO: renamed from: n */
    public static final String f11190n = "com.tencent.mobileqq";

    /* JADX INFO: renamed from: q */
    public static final String f11191q = "com.tencent.mm";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f58017toq = "com.sina.weibo.composerinde.ComposerDispatchActivity";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f58018zy = "com.tencent.mobileqq.activity.JumpActivity";

    public static Uri f7l8(@lvui Context context, @lvui File file) {
        return FileProvider.m2162g(context, com.android.thememanager.basemodule.resource.constants.toq.o9qk, file);
    }

    /* JADX INFO: renamed from: g */
    private static File m7745g(Context context) {
        File file = new File(context.getCacheDir().getAbsolutePath() + File.separator + "share_pic");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: k */
    private static void m7746k(Context ctx, Intent intent) {
        if (ctx == null || intent == null) {
            return;
        }
        Intent intent2 = null;
        try {
            if (ctx.getPackageManager().resolveActivity(intent, 65536) == null) {
                if (ctx.getPackageManager().resolveService(intent, 65536) == null) {
                    intent = null;
                }
            }
            intent2 = intent;
        } catch (Exception unused) {
        }
        if (intent2 != null) {
            try {
                ctx.startActivity(intent2);
            } catch (Exception e2) {
                Log.w(f11189k, "startActivity. error. " + e2);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static File m7747n(@lvui Context context, @lvui String name) {
        File fileM7745g = m7745g(context);
        C1821p.m7190s(fileM7745g.getAbsolutePath());
        return new File(fileM7745g, name + ".png");
    }

    /* JADX INFO: renamed from: q */
    public static List<Integer> m7748q() {
        ArrayList arrayList = new ArrayList(3);
        if (a9.m6999s("com.tencent.mm")) {
            arrayList.add(Integer.valueOf(R.drawable.de_icon_wechat));
        }
        if (a9.m6999s(f11190n)) {
            arrayList.add(Integer.valueOf(R.drawable.de_icon_qq));
        }
        if (a9.m6999s(f11188g)) {
            arrayList.add(Integer.valueOf(R.drawable.de_icon_weibo));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public static void m7749s(Context context, String title, String content, Uri imageUri) {
        StringBuilder sb = new StringBuilder();
        if (!zy.toq(title)) {
            sb.append(title);
            sb.append("\n");
        }
        if (!zy.toq(content)) {
            sb.append(content);
        }
        Intent intent = new Intent("android.intent.action.SEND");
        if (imageUri == null) {
            intent.setType("text/plain");
        } else {
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.STREAM", imageUri);
            intent.addFlags(1);
        }
        intent.putExtra("android.intent.extra.TEXT", sb.toString());
        intent.setComponent(new ComponentName(f11188g, f58017toq));
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setFlags(268435456);
        intent.addFlags(32768);
        m7746k(context, intent);
    }

    public static void toq(Context context) {
        if (context == null || ((context instanceof Activity) && !C1819o.eqxt((Activity) context))) {
            Log.d(f11189k, "clearShareCache fail.");
            return;
        }
        File[] fileArrListFiles = m7745g(context).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
            return;
        }
        for (File file : fileArrListFiles) {
            file.delete();
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m7750y(Context context, String title, String content, Uri imageUri) {
        StringBuilder sb = new StringBuilder();
        if (!zy.toq(title)) {
            sb.append(title);
            sb.append("\n");
        }
        if (!zy.toq(content)) {
            sb.append(content);
        }
        Intent intent = new Intent("android.intent.action.SEND");
        if (imageUri == null) {
            intent.setType("text/plain");
        } else {
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.STREAM", imageUri);
            intent.addFlags(1);
        }
        intent.putExtra("android.intent.extra.TEXT", sb.toString());
        intent.setComponent(new ComponentName(f11190n, f58018zy));
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setFlags(268435456);
        intent.addFlags(32768);
        m7746k(context, intent);
    }

    @y9n
    public static boolean zy(Context context, String url, String savePath) {
        boolean z2 = false;
        if (context == null || ((context instanceof Activity) && !C1819o.eqxt((Activity) context))) {
            Log.e(f11189k, "downloadPicture fail.");
            return false;
        }
        File file = new File(savePath + ".temp");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                Bitmap bitmap = com.bumptech.glide.zy.a9(context).zurt().mo6748i(url).dxef().get();
                if (bitmap == null || bitmap.isRecycled()) {
                    C7794k.toq(f11189k, "downloadPicture failed.");
                } else {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream);
                    File file2 = new File(savePath);
                    file.renameTo(file2);
                    C1821p.m7189q(file2, 509);
                    z2 = true;
                }
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | InterruptedException | ExecutionException e2) {
            Log.e(f11189k, e2.getLocalizedMessage());
        }
        return z2;
    }
}
