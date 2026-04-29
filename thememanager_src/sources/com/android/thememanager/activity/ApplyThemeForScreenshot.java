package com.android.thememanager.activity;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.content.res.MiuiConfiguration;
import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import com.android.thememanager.C2082k;
import com.android.thememanager.C2320q;
import com.android.thememanager.ThemeResourceProxyTabActivity;
import com.android.thememanager.basemodule.guideview.RestoreHomeIconHelper;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.RelatedResource;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.controller.strategy.C1955s;
import com.android.thememanager.detail.theme.model.ApplyThemeInfo;
import com.android.thememanager.module.detail.util.C2247q;
import com.android.thememanager.settings.AlbumLoader;
import com.android.thememanager.settings.personalize.activity.PersonalizeActivity;
import com.android.thememanager.util.AsyncTaskC2806s;
import ek5k.C6002g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class ApplyThemeForScreenshot extends Activity implements InterfaceC1789q, RestoreHomeIconHelper.toq {

    /* JADX INFO: renamed from: a */
    private static final String f8727a = "ver2_step_apply";

    /* JADX INFO: renamed from: b */
    private static final String f8728b = "ver2_step_init";

    /* JADX INFO: renamed from: c */
    private static final String f8729c = "theme_remove_flags";

    /* JADX INFO: renamed from: e */
    private static final String f8730e = "api_called_from";

    /* JADX INFO: renamed from: f */
    private static final String f8731f = "theme_apply_flags";

    /* JADX INFO: renamed from: i */
    private static final String f8732i = "snapshot";

    /* JADX INFO: renamed from: j */
    private static final String f8733j = "large_icon_package_name";

    /* JADX INFO: renamed from: l */
    private static final String f8734l = "theme_file_path";

    /* JADX INFO: renamed from: m */
    private static final String f8735m = "ver2_step";

    /* JADX INFO: renamed from: o */
    private static final String f8736o = "large_icon_type";

    /* JADX INFO: renamed from: r */
    private static final String f8737r = "default";

    /* JADX INFO: renamed from: t */
    private static final boolean f8738t = false;

    /* JADX INFO: renamed from: x */
    private static String f8739x = null;

    /* JADX INFO: renamed from: z */
    private static final String f8740z = "RestoreFromConfigurationChange";

    /* JADX INFO: renamed from: g */
    private Set<String> f8741g = new HashSet();

    /* JADX INFO: renamed from: h */
    private int f8742h;

    /* JADX INFO: renamed from: k */
    private TextView f8743k;

    /* JADX INFO: renamed from: n */
    private String f8744n;

    /* JADX INFO: renamed from: p */
    private String f8745p;

    /* JADX INFO: renamed from: q */
    private String f8746q;

    /* JADX INFO: renamed from: s */
    private com.android.thememanager.mine.local.resource.toq f8747s;

    /* JADX INFO: renamed from: y */
    private String f8748y;

    private static class f7l8 {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private boolean f57257f7l8;

        /* JADX INFO: renamed from: g */
        private String f8749g;

        /* JADX INFO: renamed from: k */
        private String f8750k;

        /* JADX INFO: renamed from: n */
        private String f8751n;

        /* JADX INFO: renamed from: q */
        private String f8752q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f57258toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private String f57259zy;

        public f7l8(String mtzPath) {
            if (TextUtils.isEmpty(mtzPath) || !mtzPath.startsWith("/sdcard") || !mtzPath.endsWith(".mtz")) {
                Log.d(ApplyThemeForScreenshot.f8732i, "chownMtz2Theme mtzPath error. path=" + mtzPath);
                return;
            }
            String strSubstring = mtzPath.substring(mtzPath.lastIndexOf("/") + 1);
            this.f8750k = strSubstring;
            this.f57258toq = strSubstring.substring(0, strSubstring.lastIndexOf(".mtz"));
            this.f57259zy = mtzPath.substring(8, mtzPath.lastIndexOf(this.f8750k) - 1);
            this.f8752q = mtzPath.substring(7);
            this.f8751n = Environment.getExternalStorageDirectory() + this.f8752q;
            this.f8749g = Environment.getExternalStorageDirectory() + "/" + this.f57259zy;
            this.f57257f7l8 = true;
        }

        public String f7l8() {
            return this.f8749g;
        }

        /* JADX INFO: renamed from: g */
        public String m6334g() {
            return this.f57259zy;
        }

        /* JADX INFO: renamed from: n */
        public String m6335n() {
            return this.f8751n;
        }

        /* JADX INFO: renamed from: q */
        public String m6336q() {
            return this.f8752q;
        }

        /* JADX INFO: renamed from: s */
        public boolean m6337s() {
            return this.f57257f7l8;
        }

        /* JADX INFO: renamed from: y */
        public String m6338y() {
            return this.f57258toq;
        }

        public String zy() {
            return this.f8750k;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.ApplyThemeForScreenshot$g */
    private static class C1537g {

        /* JADX INFO: renamed from: k */
        public int f8753k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public Resource f57260toq;

        public C1537g(int code, Resource resource) {
            this.f8753k = code;
            this.f57260toq = resource;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.ApplyThemeForScreenshot$k */
    class AsyncTaskC1538k extends AsyncTaskC1542y {
        AsyncTaskC1538k() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.android.thememanager.activity.ApplyThemeForScreenshot.AsyncTaskC1542y, android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer result) {
            super.onPostExecute(result);
            Intent intent = new Intent();
            intent.putExtra("init_result", result.intValue());
            ApplyThemeForScreenshot.this.setResult(-1, intent);
            ApplyThemeForScreenshot.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.ApplyThemeForScreenshot$n */
    class C1539n implements com.android.thememanager.mine.local.resource.zy {
        C1539n() {
        }

        @Override // com.android.thememanager.mine.local.resource.zy
        /* JADX INFO: renamed from: n */
        public void mo6339n(Resource resource) {
            ApplyThemeForScreenshot.this.m6332y(resource);
        }

        @Override // com.android.thememanager.mine.local.resource.zy
        /* JADX INFO: renamed from: p */
        public void mo6340p(Resource resource) {
        }

        @Override // com.android.thememanager.mine.local.resource.zy
        /* JADX INFO: renamed from: q */
        public void mo6341q(Resource resource) {
        }

        @Override // com.android.thememanager.mine.local.resource.zy
        public void toq(Resource resource, int downloadBytes, int totalBytes) {
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.ApplyThemeForScreenshot$q */
    class AsyncTaskC1540q extends com.android.thememanager.util.qrj {
        final /* synthetic */ Resource bb;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AsyncTaskC1540q(Activity activity, com.android.thememanager.fu4 resContext, Resource resource, ApplyThemeInfo applyThemeInfo, final Resource val$resource) {
            super(activity, resContext, resource, applyThemeInfo);
            this.bb = val$resource;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.android.thememanager.util.qrj, android.os.AsyncTask
        /* JADX INFO: renamed from: gvn7 */
        public void onPostExecute(Void object) {
            long jM5739h;
            super.onPostExecute(object);
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            int localPlatform = this.bb.getLocalPlatform();
            if ("theme".equals(ApplyThemeForScreenshot.this.f8744n)) {
                Iterator<RelatedResource> it = this.bb.getSubResources().iterator();
                jM5739h = 0;
                while (it.hasNext()) {
                    String resourceCode = it.next().getResourceCode();
                    if (!ApplyThemeForScreenshot.this.f8741g.contains(resourceCode) && com.android.thememanager.util.g1.m9748l(localPlatform, resourceCode)) {
                        jM5739h |= p001b.toq.m5739h(p001b.toq.ni7(resourceCode));
                    }
                }
            } else {
                jM5739h = InterfaceC1789q.gx2z.equals(ApplyThemeForScreenshot.this.f8744n) ? 4100L : p001b.toq.m5739h(ApplyThemeForScreenshot.this.f8744n);
            }
            MiuiConfiguration.sendThemeConfigurationChangeMsg(InterfaceC1789q.h60v);
            a9(ApplyThemeForScreenshot.this);
            bundle.putLong(InterfaceC1925p.l1l1, jM5739h);
            bundle.putString("path", ApplyThemeForScreenshot.this.f8746q);
            bundle.putString("title", this.bb.getLocalInfo().getTitle());
            bundle.putString("author", this.bb.getLocalInfo().getAuthor());
            bundle.putString("version", this.bb.getLocalInfo().getVersion());
            bundle.putString(InterfaceC1925p.lj, String.valueOf(localPlatform));
            intent.putExtras(bundle);
            ApplyThemeForScreenshot.this.setResult(-1, intent);
            ApplyThemeForScreenshot.this.finish();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.ApplyThemeForScreenshot$s */
    private class AsyncTaskC1541s extends AsyncTask<String, Void, Resource> {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final String f57261f7l8 = "/sdcard/Android/data/com.android.thememanager/files/snapshot/tmp.mtz";

        /* JADX INFO: renamed from: g */
        private static final String f8756g = "/sdcard/Android/data/com.android.thememanager/files/snapshot/tmp_unzip_folder/";

        /* JADX INFO: renamed from: n */
        private static final int f8757n = -2;

        /* JADX INFO: renamed from: q */
        private static final int f8758q = -1;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final int f57262zy = 0;

        /* JADX INFO: renamed from: k */
        private miuix.appcompat.app.dd f8759k;

        private AsyncTaskC1541s() {
        }

        /* JADX INFO: renamed from: k */
        public boolean m6342k(String mtzUri) throws Throwable {
            FileInputStream fileInputStream;
            FileOutputStream fileOutputStream;
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    File file = new File(f57261f7l8);
                    if (file.exists()) {
                        file.delete();
                    } else {
                        File parentFile = file.getParentFile();
                        if (!parentFile.exists()) {
                            parentFile.mkdirs();
                        }
                    }
                    Log.d(ApplyThemeForScreenshot.f8732i, "copyMtz2ThemeFile path=" + mtzUri);
                    fileInputStream = new FileInputStream(mtzUri);
                    try {
                        fileOutputStream = new FileOutputStream(f57261f7l8);
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e3) {
                e = e3;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
            }
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i2 = fileInputStream.read(bArr);
                    if (i2 < 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i2);
                }
                try {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    fileInputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                return true;
            } catch (Exception e6) {
                fileOutputStream2 = fileOutputStream;
                e = e6;
                Log.e(ApplyThemeForScreenshot.f8732i, "copyMtz2ThemeFile fail.", e);
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                        return false;
                    }
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return false;
            } catch (Throwable th3) {
                fileOutputStream2 = fileOutputStream;
                th = th3;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                        throw th;
                    }
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            this.f8759k = new miuix.appcompat.app.dd(ApplyThemeForScreenshot.this);
            if (!ApplyThemeForScreenshot.this.isFinishing()) {
                this.f8759k.show();
                return;
            }
            Log.e(ApplyThemeForScreenshot.f8732i, "ApplyThemeForScreenshot: activity was finished and it shold not occur: " + ApplyThemeForScreenshot.this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public Resource doInBackground(String... params) {
            if (TextUtils.equals(ApplyThemeForScreenshot.f8727a, params[1])) {
                if (!m6342k(new f7l8(params[0]).m6335n())) {
                    return null;
                }
                params[0] = f57261f7l8;
            }
            return ApplyThemeForScreenshot.kja0(params[0], f8756g);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Resource result) {
            if (ApplyThemeForScreenshot.this.isFinishing() || ApplyThemeForScreenshot.this.isDestroyed()) {
                return;
            }
            this.f8759k.dismiss();
        }

        /* synthetic */ AsyncTaskC1541s(ApplyThemeForScreenshot applyThemeForScreenshot, AsyncTaskC1538k asyncTaskC1538k) {
            this();
        }
    }

    class toq extends AsyncTaskC1541s {
        toq() {
            super(ApplyThemeForScreenshot.this, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.android.thememanager.activity.ApplyThemeForScreenshot.AsyncTaskC1541s, android.os.AsyncTask
        /* JADX INFO: renamed from: zy */
        public void onPostExecute(Resource result) {
            super.onPostExecute(result);
            if (result == null && TextUtils.equals(ApplyThemeForScreenshot.this.f8746q, "default")) {
                result = ApplyThemeForScreenshot.this.ld6();
            }
            ApplyThemeForScreenshot.this.f7l8(result);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.ApplyThemeForScreenshot$y */
    private static class AsyncTaskC1542y extends AsyncTask<String, Void, Integer> {

        /* JADX INFO: renamed from: k */
        private static final int f8761k = 0;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static final int f57264toq = -1;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final int f57265zy = -2;

        private AsyncTaskC1542y() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(String... params) {
            if (!TextUtils.equals(ApplyThemeForScreenshot.f8728b, params[1])) {
                return -1;
            }
            f7l8 f7l8Var = new f7l8(params[0]);
            if (!f7l8Var.m6337s()) {
                return -1;
            }
            MediaScannerConnection.scanFile(bf2.toq.toq(), new String[]{f7l8Var.f8751n}, null, null);
            ApplyThemeForScreenshot.m6329p();
            String strM6331s = ApplyThemeForScreenshot.m6331s(params[0]);
            if (ApplyThemeForScreenshot.n7h(f7l8Var.f57258toq)) {
                return -2;
            }
            Log.e(ApplyThemeForScreenshot.f8732i, "chownMtz2Theme success. uriString=" + strM6331s);
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq */
        public void onPostExecute(Integer result) {
            if (result.intValue() == -2) {
                Toast.makeText(bf2.toq.toq(), "应用错误，请更换文件名", 0).show();
            } else if (result.intValue() == -1) {
                Toast.makeText(bf2.toq.toq(), "应用失败，路径错误", 0).show();
            } else {
                Toast.makeText(bf2.toq.toq(), "请稍等，即将应用主题", 0).show();
            }
        }

        /* synthetic */ AsyncTaskC1542y(AsyncTaskC1538k asyncTaskC1538k) {
            this();
        }
    }

    class zy extends AsyncTaskC2806s {
        zy(Resource resource, Activity activity, C2247q param, boolean withProcess, androidx.lifecycle.fti status) {
            super(resource, activity, param, withProcess, status);
        }

        @Override // com.android.thememanager.util.AsyncTaskC2806s, android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            ApplyThemeForScreenshot.this.finish();
        }
    }

    private static String cdj(String key, String value) {
        if (key == null || value == null) {
            Log.e(f8732i, "key or value is null,  key is :" + key + " value is :" + value);
            return "error";
        }
        char[] charArray = key.toCharArray();
        char[] charArray2 = (value + "#").toCharArray();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        int i3 = 0;
        while (sb.length() < 32) {
            sb.append((char) (charArray2[i2 % charArray2.length] ^ charArray[i3 % charArray.length]));
            i2++;
            i3++;
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f7l8(final Resource resource) {
        if (resource == null) {
            this.f8743k.setText("解压主题包失败: themePath=" + this.f8746q);
            setResult(0);
            finish();
            return;
        }
        if (isFinishing()) {
            return;
        }
        List<RelatedResource> subResources = resource.getSubResources();
        if (subResources != null && subResources.size() == 2) {
            Iterator<RelatedResource> it = subResources.iterator();
            while (it.hasNext()) {
                if (it.next().getResourceCode().equals("fonts")) {
                    C2320q.oc(Uri.fromFile(new File(this.f8746q)), C1791k.getInstance("theme"), 100, null);
                    return;
                }
            }
        }
        m6332y(resource);
    }

    /* JADX INFO: renamed from: h */
    public static void m6326h(String unzipThemeFolder) {
        if (new File(unzipThemeFolder, com.android.thememanager.util.g1.f16456c).exists()) {
            new File(unzipThemeFolder, com.android.thememanager.util.g1.f16456c).renameTo(new File(unzipThemeFolder, InterfaceC1789q.k9));
        }
        File file = new File(unzipThemeFolder, InterfaceC1789q.igu);
        if (!file.exists()) {
            String[] strArr = InterfaceC1789q.kzk;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                File file2 = new File(unzipThemeFolder, strArr[i2]);
                if (file2.exists()) {
                    file.delete();
                    file2.renameTo(file);
                    break;
                }
                i2++;
            }
        }
        File file3 = new File(unzipThemeFolder, InterfaceC1789q.xd);
        if (file3.exists()) {
            return;
        }
        for (String str : InterfaceC1789q.gr) {
            File file4 = new File(unzipThemeFolder, str);
            if (file4.exists()) {
                file3.delete();
                file4.renameTo(file3);
                return;
            }
        }
    }

    public static Resource kja0(String themeFilePath, String unzipFolderPath) throws Throwable {
        boolean z2;
        try {
            String str = File.separator;
            if (!unzipFolderPath.endsWith(str)) {
                unzipFolderPath = unzipFolderPath + str;
            }
            C1821p.ki(unzipFolderPath);
            new File(unzipFolderPath).mkdirs();
            com.android.thememanager.util.ch.ch(themeFilePath, unzipFolderPath, null);
            Resource resource = new Resource();
            com.android.thememanager.controller.local.qrj qrjVar = new com.android.thememanager.controller.local.qrj(new File(unzipFolderPath + "description.xml"));
            resource.setLocalPlatform(qrjVar.m7530y());
            resource.getLocalInfo().setVersion(qrjVar.qrj());
            resource.getLocalInfo().setAuthors(qrjVar.toq());
            resource.getLocalInfo().setDesigners(qrjVar.m7528q());
            resource.getLocalInfo().setTitles(qrjVar.x2());
            resource.getLocalInfo().setDescriptions(qrjVar.zy());
            if (new File(unzipFolderPath, "largeicons").exists()) {
                resource.setCategory("largeicons");
            }
            if (C1807g.zurt()) {
                resource.setFrameRate(qrjVar.m7523g());
                resource.setAllFrameCount(qrjVar.m7525k());
                resource.setSmallFrameCount(qrjVar.m7527p());
            }
            com.android.thememanager.basemodule.utils.fu4.m7066g(resource);
            m6326h(unzipFolderPath);
            Map<String, String> mapM5746y = p001b.toq.m5746y();
            ArrayList arrayList = new ArrayList();
            for (String str2 : mapM5746y.keySet()) {
                File file = new File(unzipFolderPath, str2);
                if (file.isFile()) {
                    RelatedResource relatedResource = new RelatedResource();
                    relatedResource.setResourceCode(mapM5746y.get(str2));
                    relatedResource.setContentPath(file.getAbsolutePath());
                    arrayList.add(relatedResource);
                }
            }
            for (File file2 : new File(unzipFolderPath).listFiles()) {
                if (file2.isFile()) {
                    Iterator<RelatedResource> it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z2 = false;
                            break;
                        }
                        if (new File(it.next().getContentPath()).getAbsolutePath().equals(file2.getAbsolutePath())) {
                            z2 = true;
                            break;
                        }
                    }
                    if (!z2) {
                        RelatedResource relatedResource2 = new RelatedResource();
                        relatedResource2.setResourceCode(file2.getName());
                        relatedResource2.setContentPath(file2.getAbsolutePath());
                        arrayList.add(relatedResource2);
                    }
                }
            }
            resource.setSubResources(arrayList);
            return resource;
        } catch (Exception e2) {
            Log.d(f8732i, e2.getMessage());
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Resource ld6() {
        Resource resource = new Resource();
        ArrayList arrayList = new ArrayList();
        for (String str : InterfaceC1789q.bzx) {
            RelatedResource relatedResource = new RelatedResource();
            relatedResource.setResourceCode(str);
            relatedResource.setContentPath("");
            arrayList.add(relatedResource);
        }
        resource.setSubResources(arrayList);
        return resource;
    }

    public static boolean n7h(String title) {
        try {
            Cursor cursorQuery = bf2.toq.toq().getContentResolver().query(MediaStore.Files.getContentUri("external"), null, "(owner_package_name = 'com.android.themamanager' OR _display_name = '" + title + ".mtz' )", null, null);
            int count = cursorQuery.getCount();
            Log.d(f8732i, "mtzNameChangedAfterInsertDB. count=" + count);
            cursorQuery.close();
            return count > 1;
        } catch (Exception e2) {
            Log.e(f8732i, "query count=" + e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m6329p() {
        Log.d(f8732i, "clearThemeDataFromFile count=" + bf2.toq.toq().getContentResolver().delete(MediaStore.Files.getContentUri("external"), "(owner_package_name LIKE 'com.android.thememanager' )", null));
    }

    private com.android.thememanager.mine.local.resource.zy qrj() {
        return new C1539n();
    }

    /* JADX INFO: renamed from: s */
    public static String m6331s(String mtzPath) {
        if (TextUtils.isEmpty(mtzPath) || !mtzPath.startsWith("/sdcard") || !mtzPath.endsWith(".mtz")) {
            Log.d(f8732i, "chownMtz2Theme mtzPath error. path=" + mtzPath);
            return null;
        }
        try {
            String strSubstring = mtzPath.substring(mtzPath.lastIndexOf("/") + 1);
            String strSubstring2 = strSubstring.substring(0, strSubstring.lastIndexOf(".mtz"));
            String strSubstring3 = mtzPath.substring(8, mtzPath.lastIndexOf(strSubstring) - 1);
            String str = Environment.getExternalStorageDirectory() + mtzPath.substring(7);
            Uri contentUri = MediaStore.Files.getContentUri("external");
            ContentValues contentValues = new ContentValues();
            contentValues.put("title", strSubstring2);
            contentValues.put("_display_name", strSubstring);
            contentValues.put("relative_path", strSubstring3);
            contentValues.put("_data", str);
            contentValues.put("is_download", (Integer) 1);
            contentValues.put(AlbumLoader.f14877s, "application/octet-stream");
            contentValues.put("owner_package_name", "com.android.thememanager");
            return bf2.toq.toq().getContentResolver().insert(contentUri, contentValues).toString();
        } catch (Exception e2) {
            Log.d(f8732i, "chownMtz2Theme filed.", e2);
            return null;
        }
    }

    private long x2(String extraName, long defaultValue) {
        long longExtra = getIntent().getLongExtra(extraName, defaultValue);
        if (longExtra != defaultValue) {
            return longExtra;
        }
        try {
            return Long.parseLong(getIntent().getStringExtra(extraName));
        } catch (Exception unused) {
            return longExtra;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m6332y(final Resource resource) {
        if (!"largeicons".equals(resource.getCategory())) {
            new AsyncTaskC1540q(this, C2082k.zy().m8001n().m10535g(this.f8744n), resource, new ApplyThemeInfo().setIgnoreCodeSet(this.f8741g), resource).executeOnExecutor(C6002g.ld6(), new Void[0]);
            return;
        }
        C2247q c2247q = new C2247q(this.f8744n, false, null, false, false);
        c2247q.f13157s = this.f8745p;
        if (resource.getLocalId() == null) {
            resource.setLocalId(new C1955s().mo7689k());
        }
        c2247q.f60526f7l8 = resource.getLocalId();
        c2247q.f13158y = this.f8742h;
        new zy(resource, this, c2247q, true, null).executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.getBoolean(f8740z, false)) {
            Log.i(f8732i, "Applying config change: finish");
            finish();
            return;
        }
        String stringExtra = getIntent().getStringExtra(f8734l);
        this.f8746q = stringExtra;
        if (stringExtra == null) {
            Intent intent = new Intent();
            if (C1807g.m7081r()) {
                intent.setClass(this, PersonalizeActivity.class);
            } else {
                intent.setPackage(getPackageName());
                intent.setAction(ThemeResourceProxyTabActivity.bl);
            }
            startActivity(intent);
            Log.i(f8732i, "start theme home page");
            finish();
        }
        long jX2 = x2(f8731f, -1L);
        long jX22 = x2(f8729c, -1L);
        long j2 = ~(jX2 | jX22);
        this.f8744n = p001b.toq.m5741k(com.android.thememanager.util.g1.a9(jX2));
        this.f8745p = getIntent().getStringExtra(f8733j);
        this.f8742h = getIntent().getIntExtra(f8736o, 1);
        if (TextUtils.isEmpty(this.f8744n)) {
            Log.i(f8732i, "undefine resourceCode, Going to finish");
            finish();
            return;
        }
        this.f8741g.clear();
        if ("theme".equals(this.f8744n)) {
            for (String str : InterfaceC1789q.bzx) {
                if ((p001b.toq.m5739h(str) & j2) != 0) {
                    this.f8741g.add(str);
                }
            }
        }
        TextView textView = new TextView(this);
        this.f8743k = textView;
        textView.setGravity(17);
        this.f8743k.setTextSize(30.0f);
        this.f8743k.setText("正在应用主题，请稍候!\n\n" + this.f8746q);
        setContentView(this.f8743k);
        com.android.thememanager.mine.local.resource.toq toqVar = new com.android.thememanager.mine.local.resource.toq(this);
        this.f8747s = toqVar;
        toqVar.m8232p(qrj());
        this.f8747s.m8235y();
        String stringExtra2 = getIntent().getStringExtra(f8730e);
        this.f8748y = stringExtra2;
        if (TextUtils.isEmpty(stringExtra2)) {
            MediaScannerConnection.scanFile(this, new String[]{"test.jpg"}, null, null);
            this.f8743k.setText("没有设置来源!");
            finish();
            return;
        }
        String stringExtra3 = getIntent().getStringExtra(f8735m);
        Log.i(f8732i, "ThemeManger.ApplyThemeForScreenshot: themePath=" + this.f8746q + " ver2_step=" + stringExtra3 + " applyFlags=0x" + Long.toHexString(jX2) + " removeFlags=0x" + Long.toHexString(jX22));
        if (TextUtils.equals(f8728b, stringExtra3)) {
            new AsyncTaskC1538k().executeOnExecutor(C6002g.ld6(), this.f8746q, stringExtra3);
        } else {
            new toq().executeOnExecutor(C6002g.ld6(), this.f8746q, stringExtra3);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        com.android.thememanager.mine.local.resource.toq toqVar = this.f8747s;
        if (toqVar != null) {
            toqVar.ld6();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean(f8740z, isFinishing());
    }
}
