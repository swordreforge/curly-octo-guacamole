package com.android.thememanager.share;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.android.thememanager.R;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: ShareUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class ld6 {

    /* JADX INFO: renamed from: k */
    public static final boolean f16031k = false;

    /* JADX INFO: renamed from: q */
    private static Handler f16032q = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f61090toq = "MiuiShare";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static Toast f61091zy;

    /* JADX INFO: renamed from: com.android.thememanager.share.ld6$k */
    /* JADX INFO: compiled from: ShareUtils.java */
    class AsyncTaskC2704k extends AsyncTask<Void, Void, ArrayList<Bitmap>> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Intent f16033k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ Activity f61092toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ zy f61093zy;

        AsyncTaskC2704k(final Intent val$intent, final Activity val$activity, final zy val$listener) {
            this.f16033k = val$intent;
            this.f61092toq = val$activity;
            this.f61093zy = val$listener;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ArrayList<Bitmap> doInBackground(Void... params) {
            ArrayList parcelableArrayList;
            String action = this.f16033k.getAction();
            Bundle extras = this.f16033k.getExtras();
            ArrayList<Bitmap> arrayList = new ArrayList<>();
            if (TextUtils.equals("android.intent.action.SEND", action)) {
                Uri uri = (Uri) extras.getParcelable("android.intent.extra.STREAM");
                int i2 = extras.getInt(C2702g.f61069f7l8, 0);
                if (uri != null) {
                    arrayList.add(ld6.m9448i(this.f61092toq, uri, i2));
                }
            } else if (TextUtils.equals("android.intent.action.SEND_MULTIPLE", action) && (parcelableArrayList = extras.getParcelableArrayList("android.intent.extra.STREAM")) != null) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(ld6.t8r(this.f61092toq, (Uri) it.next()));
                }
            }
            return arrayList;
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(ArrayList<Bitmap> bitmaps) {
            super.onPostExecute(bitmaps);
            Bundle extras = this.f16033k.getExtras();
            String string = extras.getString("android.intent.extra.TEXT", "");
            this.f61093zy.mo9458k(extras.getString("android.intent.extra.SUBJECT", ""), string, extras.getString(C2702g.f16019g, ""), null, bitmaps);
        }
    }

    /* JADX INFO: compiled from: ShareUtils.java */
    class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Context f16034k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ int f16035n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ String f16036q;

        toq(final Context val$context, final String val$text, final int val$duration) {
            this.f16034k = val$context;
            this.f16036q = val$text;
            this.f16035n = val$duration;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ld6.f61091zy != null) {
                ld6.f61091zy.cancel();
            }
            Toast unused = ld6.f61091zy = Toast.makeText(this.f16034k, this.f16036q, this.f16035n);
            ld6.f61091zy.show();
        }
    }

    /* JADX INFO: compiled from: ShareUtils.java */
    public interface zy {
        /* JADX INFO: renamed from: k */
        boolean mo9458k(String subject, String text, String url, ArrayList<Uri> imageUris, ArrayList<Bitmap> bitmaps);
    }

    public static void a9(final Context context, final String text, final int duration) {
        f16032q.post(new toq(context, text, duration));
    }

    private static Bitmap cdj(Context context, int resId) {
        return BitmapFactory.decodeResource(context.getResources(), resId);
    }

    public static void f7l8() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("This method must be called on Main thread");
        }
    }

    private static Bitmap fn3e(Context context, Uri uri, String scheme) {
        try {
            return MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri);
        } catch (IOException e2) {
            Log.e(f61090toq, "IOException is " + e2);
            return null;
        }
    }

    public static void fti(Activity activity, Intent shareIntent) {
        Intent intent = (Intent) shareIntent.getParcelableExtra(C2702g.f61068d3);
        if (intent != null) {
            shareIntent = intent;
        }
        activity.startActivity(Intent.createChooser(m9447h(shareIntent), activity.getString(R.string.miuishare_sys_title_share)));
    }

    private static Bitmap fu4(String filePath) {
        return BitmapFactory.decodeFile(filePath);
    }

    /* JADX INFO: renamed from: g */
    public static byte[] m9446g(Bitmap bmp, boolean needRecycle) {
        return m9450n(bmp, 100, needRecycle);
    }

    /* JADX INFO: renamed from: h */
    public static Intent m9447h(Intent originalIntent) {
        String action = originalIntent.getAction();
        if (!TextUtils.equals("android.intent.action.SEND_MULTIPLE", action)) {
            action = "android.intent.action.SEND";
        }
        Intent intent = new Intent(originalIntent);
        intent.setAction(action);
        intent.setComponent(null);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static Bitmap m9448i(Context context, Uri uri, int bgColor) {
        String scheme = uri.getScheme();
        if (TextUtils.equals("http", scheme) || TextUtils.equals("https", scheme)) {
            return ni7(uri, bgColor);
        }
        if (TextUtils.equals("file", scheme)) {
            return m9456z(uri.getPath(), bgColor);
        }
        if (TextUtils.equals("content", scheme)) {
            return fn3e(context, uri, scheme);
        }
        if (!TextUtils.equals("android.resource", scheme)) {
            return null;
        }
        try {
            return ki(context, ld6(context, uri), bgColor);
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static boolean jk(final Activity activity, final Intent intent, final zy listener, boolean prepareBitmap) {
        String type;
        ArrayList<Uri> parcelableArrayList;
        f7l8();
        if (listener == null || intent == null || (type = intent.getType()) == null) {
            return false;
        }
        if (type.startsWith("text/")) {
            return listener.mo9458k(null, intent.getExtras().getString("android.intent.extra.TEXT", ""), null, null, null);
        }
        if (!intent.getType().startsWith("image/")) {
            prepareBitmap = false;
        }
        if (prepareBitmap) {
            new AsyncTaskC2704k(intent, activity, listener).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return true;
        }
        String action = intent.getAction();
        Bundle extras = intent.getExtras();
        String string = extras.getString("android.intent.extra.TEXT", "");
        String string2 = extras.getString("android.intent.extra.SUBJECT", "");
        String string3 = extras.getString(C2702g.f16019g, "");
        ArrayList<Uri> arrayList = null;
        if (!TextUtils.equals("android.intent.action.SEND", action)) {
            if (TextUtils.equals("android.intent.action.SEND_MULTIPLE", action)) {
                parcelableArrayList = extras.getParcelableArrayList("android.intent.extra.STREAM");
            }
            return listener.mo9458k(string2, string, string3, parcelableArrayList, null);
        }
        Uri uri = (Uri) extras.getParcelable("android.intent.extra.STREAM");
        if (uri != null) {
            arrayList = new ArrayList<>();
            arrayList.add(uri);
        }
        parcelableArrayList = arrayList;
        return listener.mo9458k(string2, string, string3, parcelableArrayList, null);
    }

    private static Bitmap ki(Context context, int resId, int bgColor) {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), resId);
        if (bgColor == 0 || bitmapDecodeResource == null) {
            return bitmapDecodeResource;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight(), Bitmap.Config.ARGB_8888);
        Paint paint = new Paint();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(bgColor);
        canvas.drawBitmap(bitmapDecodeResource, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    public static boolean kja0(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    private static int ld6(Context context, Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return identifier;
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    public static boolean mcp(Activity activity, Intent intent, zy listener) {
        return jk(activity, intent, listener, true);
    }

    /* JADX INFO: renamed from: n */
    public static byte[] m9450n(Bitmap bmp, int quality, boolean needRecycle) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.JPEG, quality, byteArrayOutputStream);
        if (needRecycle) {
            bmp.recycle();
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return byteArray;
    }

    public static boolean n7h(Context context, String packageName) {
        try {
            context.getPackageManager().getPackageInfo(packageName, 0);
            return true;
        } catch (Exception e2) {
            Log.e(f61090toq, "Application " + packageName + " is NOT installed - " + e2.toString());
            return false;
        }
    }

    private static Bitmap ni7(Uri uri, int bgColor) {
        String string = uri.toString();
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new URI(string).toURL().openStream());
            if (bgColor == 0 || bitmapDecodeStream == null) {
                return bitmapDecodeStream;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), Bitmap.Config.ARGB_8888);
            Paint paint = new Paint();
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawColor(bgColor);
            canvas.drawBitmap(bitmapDecodeStream, 0.0f, 0.0f, paint);
            return bitmapCreateBitmap;
        } catch (Exception e2) {
            Log.e(f61090toq, "prepareBitmap " + string + " failed. " + e2.toString());
            return null;
        }
    }

    public static ResolveInfo o1t(Intent share, String packageName, String activityName, Context context) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(share, 0);
        if (listQueryIntentActivities.isEmpty()) {
            return null;
        }
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            if (TextUtils.equals(resolveInfo.activityInfo.packageName, packageName)) {
                if (TextUtils.isEmpty(activityName)) {
                    return resolveInfo;
                }
                if (TextUtils.equals(resolveInfo.activityInfo.name, activityName)) {
                    return resolveInfo;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static CharSequence m9451p(Context context, String packageName) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0));
        } catch (Exception e2) {
            Log.e(f61090toq, "Can NOT get Application " + packageName + " name - " + e2.toString());
            return null;
        }
    }

    public static boolean qrj(Activity activity) {
        return (activity == null || activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    /* JADX INFO: renamed from: s */
    public static Drawable m9453s(Context context, String packageName) {
        try {
            return context.getApplicationContext().getPackageManager().getApplicationIcon(packageName);
        } catch (Exception e2) {
            Log.e(f61090toq, "Can NOT get Application " + packageName + " icon - " + e2.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m9454t(Intent share, String packageName, String activityName, Context context) {
        boolean z2 = false;
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(share, 0);
        if (listQueryIntentActivities.isEmpty()) {
            return;
        }
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ResolveInfo next = it.next();
            if (next.activityInfo.packageName.contains(packageName)) {
                share.setPackage(next.activityInfo.packageName);
                if (!TextUtils.isEmpty(activityName) && next.activityInfo.name.contains(activityName)) {
                    ActivityInfo activityInfo = next.activityInfo;
                    share.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                }
                z2 = true;
            }
        }
        if (z2) {
            context.startActivity(Intent.createChooser(share, context.getResources().getString(R.string.miuishare_title_share)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap t8r(Context context, Uri uri) {
        String scheme = uri.getScheme();
        if (TextUtils.equals("http", scheme) || TextUtils.equals("https", scheme)) {
            return zurt(uri);
        }
        if (TextUtils.equals("file", scheme)) {
            return fu4(uri.getPath());
        }
        if (!TextUtils.equals("android.resource", scheme)) {
            return null;
        }
        try {
            return cdj(context, ld6(context, uri));
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static void wvg(Intent share, Context context) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(share, 0);
        if (listQueryIntentActivities.isEmpty()) {
            return;
        }
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            Log.d(f61090toq, "ResolveInfo - packageName = " + resolveInfo.activityInfo.packageName + ", Name = " + resolveInfo.activityInfo.name);
        }
    }

    public static ArrayList<String> x2(ArrayList<Uri> uris) {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<Uri> it = uris.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    public static Drawable m9455y(Intent intent, String packageName, String activityName, Context context) {
        ResolveInfo resolveInfoO1t = o1t(intent, packageName, activityName, context);
        if (resolveInfoO1t != null) {
            return resolveInfoO1t.activityInfo.loadIcon(context.getPackageManager());
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    private static Bitmap m9456z(String filePath, int bgColor) {
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(filePath);
        if (bgColor == 0 || bitmapDecodeFile == null) {
            return bitmapDecodeFile;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), Bitmap.Config.ARGB_8888);
        Paint paint = new Paint();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(bgColor);
        canvas.drawBitmap(bitmapDecodeFile, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    private static Bitmap zurt(Uri uri) {
        String string = uri.toString();
        try {
            return BitmapFactory.decodeStream(new URI(string).toURL().openStream());
        } catch (Exception e2) {
            Log.e(f61090toq, "prepareBitmap " + string + " failed. " + e2.toString());
            return null;
        }
    }
}
