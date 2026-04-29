package com.android.thememanager.util;

import android.app.Activity;
import android.app.WallpaperManager;
import android.bluetooth.BluetoothSocket;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.util.Pair;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.ThemeApplication;
import com.android.thememanager.basemodule.resource.constants.C1788k;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.lvui;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipOutputStream;
import miuix.appcompat.app.ki;

/* JADX INFO: compiled from: BackupThemeTask.java */
/* JADX INFO: loaded from: classes2.dex */
public class ki extends AsyncTask<Void, Void, Integer> implements InterfaceC1789q, lvui.toq {

    /* JADX INFO: renamed from: c */
    private static Set<String> f16583c = null;

    /* JADX INFO: renamed from: e */
    private static Set<String> f16584e = null;

    /* JADX INFO: renamed from: f */
    public static final String f16585f;

    /* JADX INFO: renamed from: h */
    public static final int f16586h = -1;

    /* JADX INFO: renamed from: i */
    public static final String f16587i;

    /* JADX INFO: renamed from: l */
    public static final String f16588l = "/system/media/theme/.data/preview/default/preview_lockscreen_0.jpg";

    /* JADX INFO: renamed from: p */
    public static final int f16589p = 1;

    /* JADX INFO: renamed from: r */
    public static final String f16590r;

    /* JADX INFO: renamed from: s */
    public static final int f16591s = 0;

    /* JADX INFO: renamed from: t */
    public static final String f16592t;

    /* JADX INFO: renamed from: z */
    public static final String f16593z;

    /* JADX INFO: renamed from: g */
    private boolean f16594g;

    /* JADX INFO: renamed from: k */
    private WeakReference<Activity> f16595k;

    /* JADX INFO: renamed from: q */
    private miuix.appcompat.app.dd f16597q;

    /* JADX INFO: renamed from: n */
    private byte[] f16596n = new byte[0];

    /* JADX INFO: renamed from: y */
    private Set<String> f16598y = new HashSet();

    static {
        String str = C1788k.f10175k + "theme/.backup/";
        f16587i = str;
        f16593z = str + "wallpaper.temp";
        f16592t = str + InterfaceC1789q.b4;
        f16590r = str + "preview_lockscreen_0.jpg";
        f16585f = str + "backup.mtz";
        f16583c = new HashSet();
        f16584e = new HashSet();
        f16583c.add("theme");
        f16583c.add("wallpaper");
        f16583c.add("lockscreen");
        f16583c.add("ringtone");
        f16583c.add("alarm");
        f16583c.add(com.android.thememanager.basemodule.analysis.toq.mle);
        for (String str2 : InterfaceC1789q.qxj) {
            f16584e.add(str2);
        }
    }

    public ki(Activity activity) {
        this.f16595k = new WeakReference<>(activity);
    }

    private boolean f7l8(String resourceCode) {
        return f16583c.contains(resourceCode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    private void m9842k(ZipOutputStream out) throws Throwable {
        FileOutputStream fileOutputStream;
        Exception e2;
        BluetoothSocket bluetoothSocket = 0;
        try {
            try {
                Bitmap bitmap = ((BitmapDrawable) ((WallpaperManager) C2082k.zy().toq().getSystemService("wallpaper")).getDrawable()).getBitmap();
                String str = f16593z;
                fileOutputStream = new FileOutputStream(new File(str));
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    C1821p.zy(str, 511);
                    ch.bo(out, new File(str), InterfaceC1789q.noa, this.f16598y);
                    new File(str).delete();
                } catch (Exception e3) {
                    e2 = e3;
                    e2.printStackTrace();
                }
            } catch (Throwable th) {
                th = th;
                bluetoothSocket = InterfaceC1789q.iu;
                com.android.thememanager.basemodule.utils.y9n.m7246g(bluetoothSocket);
                throw th;
            }
        } catch (Exception e4) {
            fileOutputStream = null;
            e2 = e4;
        } catch (Throwable th2) {
            th = th2;
            com.android.thememanager.basemodule.utils.y9n.m7246g(bluetoothSocket);
            throw th;
        }
        com.android.thememanager.basemodule.utils.y9n.m7246g(fileOutputStream);
        ch.bo(out, new File(InterfaceC1789q.sxpt), InterfaceC1789q.iu, this.f16598y);
    }

    /* JADX INFO: renamed from: s */
    private void m9843s(ZipOutputStream out) throws Throwable {
        ThemeApplication qVar = C2082k.zy().toq();
        String str = i1.zy(qVar) + "/description.xml";
        ch.t8iq(new ByteArrayInputStream(("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<theme>\n\t<title>" + qVar.getString(R.string.backup_theme_name) + "</title>\n\t<designer></designer>\n\t<isBackUpVersion>true</isBackUpVersion>\n\t<author></author>\n\t<version>1.0</version>\n\t<platform>" + InterfaceC1789q.y7 + "</platform>\t<screenRatio>" + InterfaceC1789q.t9 + "</screenRatio>\n</theme>").getBytes()), str);
        ch.bo(out, new File(str), "description.xml", this.f16598y);
    }

    private boolean zy(String lockscreenPath) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        if (lockscreenPath != null && new File(lockscreenPath).exists()) {
            Pair<Integer, Integer> pairJp0y = uc.jp0y(false);
            BufferedOutputStream bufferedOutputStream2 = null;
            Bitmap bitmapCopy = BitmapFactory.decodeFile(lockscreenPath, null).copy(Bitmap.Config.ARGB_8888, true);
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(C2082k.zy().toq().getResources(), R.drawable.wallpaper_detail_lockscreen_mask, null);
            if (bitmapCopy != null && bitmapDecodeResource != null) {
                int height = bitmapCopy.getHeight();
                int width = bitmapCopy.getWidth();
                int i2 = width * 2;
                if (height > i2) {
                    bitmapCopy = Bitmap.createBitmap(bitmapCopy, 0, (height / 2) - width, width, i2);
                } else if (height < i2) {
                    bitmapCopy = Bitmap.createBitmap(bitmapCopy, (width / 2) - (height / 4), 0, height / 2, height);
                }
                Canvas canvas = new Canvas(bitmapCopy);
                canvas.drawBitmap(Bitmap.createScaledBitmap(bitmapDecodeResource, ((Integer) pairJp0y.first).intValue(), ((Integer) pairJp0y.second).intValue(), false), 0.0f, 0.0f, (Paint) null);
                canvas.save();
                canvas.restore();
                File file = new File(f16590r);
                try {
                    try {
                        file.createNewFile();
                        bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
                try {
                    bitmapCopy.compress(Bitmap.CompressFormat.JPEG, 70, bufferedOutputStream);
                    com.android.thememanager.basemodule.utils.y9n.m7246g(bufferedOutputStream);
                    return true;
                } catch (IOException e3) {
                    e = e3;
                    bufferedOutputStream2 = bufferedOutputStream;
                    e.printStackTrace();
                    com.android.thememanager.basemodule.utils.y9n.m7246g(bufferedOutputStream2);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedOutputStream2 = bufferedOutputStream;
                    com.android.thememanager.basemodule.utils.y9n.m7246g(bufferedOutputStream2);
                    throw th;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x02eb: MOVE (r2 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:152:0x02ea */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0276 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:? A[Catch: Exception -> 0x0280, all -> 0x02e9, SYNTHETIC, TRY_LEAVE, TryCatch #9 {all -> 0x02e9, blocks: (B:7:0x0038, B:9:0x0061, B:11:0x006c, B:13:0x0072, B:19:0x0080, B:20:0x0085, B:21:0x0089, B:23:0x008f, B:26:0x009c, B:29:0x00b6, B:32:0x00c3, B:34:0x00cb, B:36:0x00d1, B:39:0x00d8, B:41:0x00e3, B:44:0x00ee, B:46:0x00f4, B:52:0x0102, B:54:0x0108, B:56:0x0110, B:58:0x0128, B:61:0x0131, B:62:0x0147, B:64:0x014d, B:65:0x0173, B:66:0x017b, B:68:0x0181, B:70:0x01a7, B:72:0x01af, B:74:0x01b7, B:75:0x01cd, B:77:0x01dc, B:79:0x01e8, B:80:0x01f2, B:81:0x020f, B:82:0x0227, B:88:0x0243, B:106:0x0261, B:92:0x0249, B:112:0x0276, B:117:0x027f, B:116:0x027c, B:102:0x025a, B:85:0x0233, B:124:0x0288), top: B:175:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014d A[Catch: Exception -> 0x010c, all -> 0x02e9, LOOP:1: B:62:0x0147->B:64:0x014d, LOOP_END, TryCatch #4 {Exception -> 0x010c, blocks: (B:61:0x0131, B:62:0x0147, B:64:0x014d, B:65:0x0173, B:66:0x017b, B:68:0x0181), top: B:166:0x0131 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0181 A[Catch: Exception -> 0x010c, all -> 0x02e9, LOOP:2: B:66:0x017b->B:68:0x0181, LOOP_END, TRY_LEAVE, TryCatch #4 {Exception -> 0x010c, blocks: (B:61:0x0131, B:62:0x0147, B:64:0x014d, B:65:0x0173, B:66:0x017b, B:68:0x0181), top: B:166:0x0131 }] */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Integer doInBackground(java.lang.Void... r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.util.ki.doInBackground(java.lang.Void[]):java.lang.Integer");
    }

    @Override // com.android.thememanager.lvui.toq
    /* JADX INFO: renamed from: n */
    public void mo6395n(Resource resource) {
        synchronized (this.f16596n) {
            this.f16594g = true;
            this.f16596n.notifyAll();
        }
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        Activity activity = this.f16595k.get();
        if (gc3c.cdj(activity)) {
            miuix.appcompat.app.dd ddVar = new miuix.appcompat.app.dd(activity);
            this.f16597q = ddVar;
            ddVar.m24877x(true);
            this.f16597q.n5r1(activity.getString(R.string.backup_theme_progress_message));
            this.f16597q.setCancelable(false);
            this.f16597q.show();
        }
    }

    @Override // com.android.thememanager.lvui.toq
    /* JADX INFO: renamed from: p */
    public void mo6396p(Resource resource) {
        synchronized (this.f16596n) {
            this.f16594g = true;
            this.f16596n.notifyAll();
        }
    }

    @Override // com.android.thememanager.lvui.toq
    /* JADX INFO: renamed from: q */
    public void mo6397q(Resource resource) {
    }

    @Override // com.android.thememanager.lvui.toq
    public void toq(Resource resource, int downloadBytes, int totalBytes) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Integer result) {
        this.f16597q.dismiss();
        Activity activity = this.f16595k.get();
        if (gc3c.cdj(activity)) {
            if (result.intValue() == 0) {
                new ki.C6947k(activity).fu4(R.string.backup_theme_success_message).dd(android.R.string.ok, null).m25037g().show();
            } else if (result.intValue() == 1) {
                new ki.C6947k(activity).fu4(R.string.backup_theme_fail_trial_rights_message).dd(android.R.string.ok, null).m25037g().show();
            }
        }
    }
}
