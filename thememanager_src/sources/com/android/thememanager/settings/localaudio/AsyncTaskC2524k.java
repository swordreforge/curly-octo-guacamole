package com.android.thememanager.settings.localaudio;

import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0891q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.util.bwp;
import com.android.thememanager.util.g1;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.android.thememanager.settings.localaudio.k */
/* JADX INFO: compiled from: ImportAudioTask.java */
/* JADX INFO: loaded from: classes2.dex */
public class AsyncTaskC2524k extends AsyncTask<Void, Void, String> {

    /* JADX INFO: renamed from: q */
    private static final String f15108q = "add_resource_too_large";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f60788zy = "ImportResourceTask";

    /* JADX INFO: renamed from: k */
    private final WeakReference<k> f15109k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Uri f60789toq;

    /* JADX INFO: renamed from: com.android.thememanager.settings.localaudio.k$k */
    /* JADX INFO: compiled from: ImportAudioTask.java */
    public interface k {
        /* JADX INFO: renamed from: e */
        void mo8972e(String currentPath);

        boolean fu4();

        ActivityC0891q getActivity();

        /* JADX INFO: renamed from: k */
        String mo8236k();

        /* JADX INFO: renamed from: m */
        void mo8973m(boolean visible);
    }

    public AsyncTaskC2524k(k fragment, Uri uri) {
        this.f15109k = new WeakReference<>(fragment);
        this.f60789toq = uri;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0132, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0133, code lost:
    
        r0 = r12;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0137, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0138, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015f, code lost:
    
        com.android.thememanager.basemodule.utils.y9n.m7246g(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0162, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r12v3, types: [android.content.Context, com.android.thememanager.ThemeApplication] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String doInBackground(java.lang.Void... r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.settings.localaudio.AsyncTaskC2524k.doInBackground(java.lang.Void[]):java.lang.String");
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        super.onPreExecute();
        k kVar = this.f15109k.get();
        if (kVar != null) {
            kVar.mo8973m(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String result) {
        k kVar = this.f15109k.get();
        if (kVar == null) {
            return;
        }
        kVar.mo8973m(false);
        if (TextUtils.equals(result, f15108q)) {
            nn86.toq(bf2.toq.toq().getString(R.string.resource_ringtone_too_large_waring, 50), 0);
            return;
        }
        if (TextUtils.isEmpty(result)) {
            nn86.m7150k(R.string.add_resource_detail_fail, 0);
            return;
        }
        if (kVar.fu4()) {
            if (kVar.getActivity() == null) {
                return;
            } else {
                bwp.f7l8(-1, null, kVar.getActivity(), result);
            }
        } else if ("bootaudio".equals(kVar.mo8236k())) {
            g1.m9747k(kVar.getActivity(), result);
        }
        kVar.mo8972e(result);
    }
}
