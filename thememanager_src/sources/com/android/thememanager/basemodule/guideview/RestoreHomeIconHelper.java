package com.android.thememanager.basemodule.guideview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Process;
import android.util.ArrayMap;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.view.C0136q;
import androidx.core.graphics.drawable.qrj;
import androidx.core.graphics.drawable.x2;
import androidx.lifecycle.InterfaceC0928g;
import androidx.lifecycle.InterfaceC0954z;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.analysis.f7l8;
import com.android.thememanager.basemodule.guideview.InterfaceC1727k;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.a9;
import com.android.thememanager.basemodule.utils.hyr;
import com.android.thememanager.basemodule.utils.ni7;
import ek5k.C6002g;
import java.lang.ref.WeakReference;
import java.util.List;
import miuix.appcompat.app.ki;
import yz.C7794k;
import zy.dd;
import zy.lvui;
import zy.oc;
import zy.y9n;

/* JADX INFO: loaded from: classes.dex */
public class RestoreHomeIconHelper implements DialogInterface.OnClickListener, InterfaceC0928g, InterfaceC1727k.k, InterfaceC1727k.toq {

    /* JADX INFO: renamed from: f */
    private static boolean f9899f = false;

    /* JADX INFO: renamed from: g */
    private static final String f9900g = "restore_icon_dialog_no_more";

    /* JADX INFO: renamed from: h */
    public static final String f9901h = "show_restore_icon_dialog";

    /* JADX INFO: renamed from: i */
    public static final String f9902i = "from_restore_icon_dialog";

    /* JADX INFO: renamed from: l */
    public static final String f9903l = "action.restore_icon_success";

    /* JADX INFO: renamed from: n */
    private static final String f9904n = "restore_show_guide";

    /* JADX INFO: renamed from: p */
    public static final String f9905p = "add_restore_icon";

    /* JADX INFO: renamed from: q */
    private static final String f9906q = "RestoreHomeIcon";

    /* JADX INFO: renamed from: r */
    public static final String f9907r = "from_restore_icon_my";

    /* JADX INFO: renamed from: s */
    public static final String f9908s = "close_restore_icon";

    /* JADX INFO: renamed from: t */
    public static final String f9909t = "from_restore_icon_pref";

    /* JADX INFO: renamed from: y */
    private static final String f9910y = "restore_icon_popup_no_more";

    /* JADX INFO: renamed from: z */
    public static final String f9911z = "from_restore_icon_notice";

    /* JADX INFO: renamed from: k */
    private final ki f9912k;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.guideview.RestoreHomeIconHelper$k */
    public static class AsyncTaskC1726k extends AsyncTask<String, Void, Boolean> {

        /* JADX INFO: renamed from: k */
        final WeakReference<InterfaceC1727k.k> f9913k;

        public AsyncTaskC1726k(InterfaceC1727k.k helper) {
            this.f9913k = new WeakReference<>(helper);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Boolean doInBackground(java.lang.String... r7) {
            /*
                r6 = this;
                java.lang.String r0 = "RestoreHomeIcon"
                if (r7 == 0) goto Lab
                int r1 = r7.length
                r2 = 1
                if (r1 >= r2) goto La
                goto Lab
            La:
                r1 = 0
                r7 = r7[r1]
                java.lang.String r3 = "from_restore_icon_pref"
                boolean r3 = r3.equals(r7)
                if (r3 == 0) goto L26
                boolean r3 = r6.isCancelled()
                if (r3 != 0) goto L23
                boolean r3 = com.android.thememanager.basemodule.utils.a9.ld6()
                if (r3 == 0) goto L23
                goto L8f
            L23:
                r2 = r1
                goto L8f
            L26:
                java.lang.String r3 = "from_restore_icon_dialog"
                boolean r3 = r3.equals(r7)
                if (r3 == 0) goto L62
                android.content.SharedPreferences r3 = com.android.thememanager.basemodule.guideview.RestoreHomeIconHelper.m6732k()
                java.lang.String r4 = "restore_icon_dialog_no_more"
                boolean r3 = r3.getBoolean(r4, r1)
                java.lang.String r4 = com.android.thememanager.basemodule.analysis.f7l8.m6607g()
                java.lang.String r5 = "settings"
                boolean r4 = r5.equals(r4)
                if (r4 != 0) goto L59
                boolean r4 = r6.isCancelled()
                if (r4 != 0) goto L59
                boolean r4 = com.android.thememanager.basemodule.guideview.RestoreHomeIconHelper.toq()
                if (r4 != 0) goto L59
                if (r3 != 0) goto L59
                boolean r3 = com.android.thememanager.basemodule.utils.a9.ld6()
                if (r3 == 0) goto L59
                goto L5a
            L59:
                r2 = r1
            L5a:
                if (r2 == 0) goto L8f
                r3 = 2000(0x7d0, double:9.88E-321)
                android.os.SystemClock.sleep(r3)
                goto L8f
            L62:
                java.lang.String r3 = "from_restore_icon_my"
                boolean r3 = r3.equals(r7)
                if (r3 == 0) goto L83
                android.content.SharedPreferences r3 = com.android.thememanager.basemodule.guideview.RestoreHomeIconHelper.m6732k()
                java.lang.String r4 = "restore_icon_popup_no_more"
                boolean r3 = r3.getBoolean(r4, r1)
                boolean r4 = r6.isCancelled()
                if (r4 != 0) goto L23
                if (r3 != 0) goto L23
                boolean r3 = com.android.thememanager.basemodule.utils.a9.ld6()
                if (r3 == 0) goto L23
                goto L8f
            L83:
                boolean r3 = r6.isCancelled()
                if (r3 != 0) goto L23
                boolean r3 = com.android.thememanager.basemodule.guideview.RestoreHomeIconHelper.zy()
                if (r3 == 0) goto L23
            L8f:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r7)
                java.lang.String r7 = ", check home icon task. "
                r1.append(r7)
                r1.append(r2)
                java.lang.String r7 = r1.toString()
                android.util.Log.i(r0, r7)
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
                return r7
            Lab:
                java.lang.String r7 = "args  invalid"
                android.util.Log.w(r0, r7)
                java.lang.Boolean r7 = java.lang.Boolean.FALSE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.basemodule.guideview.RestoreHomeIconHelper.AsyncTaskC1726k.doInBackground(java.lang.String[]):java.lang.Boolean");
        }

        public void toq(String from) {
            executeOnExecutor(C6002g.ld6(), from);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean result) {
            InterfaceC1727k.k kVar = this.f9913k.get();
            if (isCancelled() || kVar == null) {
                return;
            }
            kVar.ki(result.booleanValue());
        }
    }

    public interface toq {
        default void ni7() {
        }
    }

    private static class zy extends AsyncTask<Void, Void, Boolean> {

        /* JADX INFO: renamed from: k */
        WeakReference<InterfaceC1727k.toq> f9914k;

        zy(InterfaceC1727k.toq callback) {
            this.f9914k = callback == null ? null : new WeakReference<>(callback);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voids) {
            return Boolean.valueOf(a9.n7h());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean result) {
            if (result.booleanValue()) {
                RestoreHomeIconHelper.m6733n().edit().remove(RestoreHomeIconHelper.f9910y).remove(RestoreHomeIconHelper.f9904n).remove(RestoreHomeIconHelper.f9900g).apply();
                ni7.m7146k().zy(RestoreHomeIconHelper.f9903l, new Intent(RestoreHomeIconHelper.f9903l));
            }
            WeakReference<InterfaceC1727k.toq> weakReference = this.f9914k;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f9914k.get().vq(result.booleanValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RestoreHomeIconHelper(@lvui Activity activity) {
        ImageView imageView = new ImageView(activity);
        Drawable drawable = activity.getDrawable(R.drawable.icon);
        if (drawable instanceof BitmapDrawable) {
            x2 x2VarM2430k = qrj.m2430k(activity.getResources(), ((BitmapDrawable) drawable).getBitmap());
            x2VarM2430k.qrj(activity.getResources().getDimensionPixelSize(R.dimen.restore_icon_radius));
            x2VarM2430k.ld6(true);
            imageView.setImageDrawable(x2VarM2430k);
        } else {
            Log.i(f9906q, "RestoreHomeIconHelper getBitmap error," + drawable);
        }
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.restore_icon_dialog_size);
        imageView.setMinimumWidth(dimensionPixelSize);
        imageView.setMinimumHeight(dimensionPixelSize);
        this.f9912k = new ki.C6947k(activity).n7h(imageView).fu4(R.string.restore_home_icon_text).m25044p(false, activity.getString(R.string.no_more_notice)).dd(android.R.string.ok, this).mcp(android.R.string.cancel, this).m25037g();
        if (activity instanceof InterfaceC0954z) {
            ((InterfaceC0954z) activity).getLifecycle().mo4451k(this);
        } else {
            C7794k.f7l8("activity not LifecycleOwner..");
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m6731g() {
        m6733n().edit().putBoolean(f9910y, true).apply();
    }

    @oc
    public static void ld6(@dd InterfaceC1727k.toq cb, String from) {
        new zy(cb).executeOnExecutor(C6002g.ld6(), new Void[0]);
        m6735q("T_CLICK", f9905p, from);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static SharedPreferences m6733n() {
        return androidx.preference.ki.m4689q(bf2.toq.toq());
    }

    @oc
    /* JADX INFO: renamed from: p */
    public static void m6734p(String from) {
        m6733n().edit().putString(f9904n, String.valueOf(Process.myPid())).apply();
        m6735q("T_CLICK", f9908s, from);
    }

    /* JADX INFO: renamed from: q */
    public static void m6735q(String event, String name, String from) {
        ArrayMap arrayMap = new ArrayMap(3);
        arrayMap.put("entryType", f7l8.m6607g());
        arrayMap.put("name", name);
        if (from != null) {
            arrayMap.put("source", from);
        }
        C1708s.f7l8().ld6().n5r1(event, arrayMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @y9n
    /* JADX INFO: renamed from: s */
    public static boolean m6736s() {
        String strValueOf;
        SharedPreferences sharedPreferencesM6733n = m6733n();
        if (!a9.ld6()) {
            return false;
        }
        int iMyPid = Process.myPid();
        String string = sharedPreferencesM6733n.getString(f9904n, null);
        List<String> listM7090g = hyr.m7090g(",", string);
        if (listM7090g == null || listM7090g.size() == 0 || listM7090g.size() > 3) {
            return true;
        }
        if (listM7090g.contains(iMyPid + "")) {
            return false;
        }
        if (string == null || string.length() == 0) {
            strValueOf = String.valueOf(iMyPid);
        } else {
            strValueOf = string + "," + iMyPid;
        }
        sharedPreferencesM6733n.edit().putString(f9904n, strValueOf).apply();
        return false;
    }

    /* JADX INFO: renamed from: y */
    private boolean m6737y(Context context) {
        if (context instanceof Activity) {
            if (C1819o.eqxt((Activity) context)) {
                return true;
            }
            Log.w(f9906q, "can not show Dialog, activity not valid.");
            return false;
        }
        if (context instanceof ContextThemeWrapper) {
            return m6737y(((ContextThemeWrapper) context).getBaseContext());
        }
        if (context instanceof C0136q) {
            return m6737y(((C0136q) context).getBaseContext());
        }
        return false;
    }

    @Override // com.android.thememanager.basemodule.guideview.InterfaceC1727k.k
    public void ki(boolean need) {
        ki kiVar;
        if (need && (kiVar = this.f9912k) != null && m6737y(kiVar.getContext())) {
            this.f9912k.show();
            m6735q("T_EXPOSE", f9901h, null);
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialog, int which) {
        if (which == -1) {
            ld6(this, f9902i);
        } else if (which == -2) {
            m6735q("T_CLICK", f9908s, f9902i);
        }
        if (this.f9912k.t8r()) {
            m6733n().edit().putBoolean(f9900g, true).apply();
        }
        f9899f = true;
        dialog.dismiss();
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@lvui InterfaceC0954z owner) {
        this.f9912k.dismiss();
    }

    @Override // com.android.thememanager.basemodule.guideview.InterfaceC1727k.toq
    public void vq(boolean success) {
        Toast.makeText(this.f9912k.getContext(), R.string.add_home_icon_success, 0).show();
    }

    public void x2() {
        if (com.android.thememanager.basemodule.utils.y9n.vyq()) {
            Log.i(f9906q, "not need check");
        } else {
            new AsyncTaskC1726k(this).toq(f9902i);
        }
    }
}
