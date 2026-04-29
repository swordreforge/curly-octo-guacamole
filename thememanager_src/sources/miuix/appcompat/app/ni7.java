package miuix.appcompat.app;

import android.app.Fragment;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.UserHandle;
import android.util.Log;
import miui.securityspace.CrossUserUtils;
import ovdh.C7597k;

/* JADX INFO: compiled from: CrossUserPickerActivity.java */
/* JADX INFO: loaded from: classes3.dex */
public class ni7 extends t8r {

    /* JADX INFO: renamed from: g */
    private static final String f38970g = "android.intent.extra.picked_user_id";

    /* JADX INFO: renamed from: s */
    public static final int f38971s = -1;

    /* JADX INFO: renamed from: y */
    private static final String f38972y = "CrossUserPickerActivity";

    /* JADX INFO: renamed from: k */
    private volatile ContextWrapper f38973k;

    /* JADX INFO: renamed from: n */
    private final Object f38974n = new Object();

    /* JADX INFO: renamed from: q */
    private volatile ContentResolver f38975q;

    /* JADX INFO: renamed from: miuix.appcompat.app.ni7$k */
    /* JADX INFO: compiled from: CrossUserPickerActivity.java */
    class C6953k extends ContextWrapper {

        /* JADX INFO: renamed from: k */
        Context f38976k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        UserHandle f86895toq;

        public C6953k(Context context, UserHandle userHandle) {
            super(context);
            this.f38976k = context;
            this.f86895toq = userHandle;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public ContentResolver getContentResolver() {
            return C7597k.m27905k(this.f38976k, this.f86895toq);
        }
    }

    /* JADX INFO: renamed from: j */
    private int m25064j() {
        if (getIntent() == null) {
            return -1;
        }
        int intExtra = getIntent().getIntExtra(f38970g, -1);
        if (nn86()) {
            return intExtra;
        }
        return -1;
    }

    private boolean nn86() {
        return getPackageName().equals(getCallingPackage()) || CrossUserUtils.checkUidPermission(this, getCallingPackage());
    }

    /* JADX INFO: renamed from: e */
    public boolean m25065e() {
        return m25064j() != -1;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context getApplicationContext() {
        if (!m25065e() || !miuix.core.util.x2.m25682s()) {
            Log.d(f38972y, "getApplicationContext: NormalApplication");
            return super.getApplicationContext();
        }
        if (this.f38973k == null) {
            synchronized (this.f38974n) {
                if (this.f38973k == null) {
                    this.f38973k = new C6953k(super.getApplicationContext(), ovdh.toq.m27906k(m25064j()));
                }
            }
        }
        Log.d(f38972y, "getApplicationContext: WrapperedApplication");
        return this.f38973k;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public ContentResolver getContentResolver() {
        if (!m25065e() || !miuix.core.util.x2.m25682s()) {
            Log.d(f38972y, "getContentResolver: NormalContentResolver");
            return super.getContentResolver();
        }
        if (this.f38975q == null) {
            synchronized (this.f38974n) {
                if (this.f38975q == null) {
                    this.f38975q = C7597k.m27905k(this, ovdh.toq.m27906k(m25064j()));
                }
            }
        }
        Log.d(f38972y, "getContentResolver: CrossUserContentResolver");
        return this.f38975q;
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        if (m25065e()) {
            intent.putExtra(f38970g, m25064j());
        }
        super.startActivity(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i2) {
        if (m25065e()) {
            intent.putExtra(f38970g, m25064j());
        }
        super.startActivityForResult(intent, i2);
    }

    @Override // android.app.Activity
    public void startActivityFromFragment(Fragment fragment, Intent intent, int i2, Bundle bundle) {
        if (m25065e()) {
            intent.putExtra(f38970g, m25064j());
        }
        super.startActivityFromFragment(fragment, intent, i2, bundle);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent, @zy.dd Bundle bundle) {
        if (m25065e()) {
            intent.putExtra(f38970g, m25064j());
        }
        super.startActivity(intent, bundle);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i2, @zy.dd Bundle bundle) {
        if (m25065e()) {
            intent.putExtra(f38970g, m25064j());
        }
        super.startActivityForResult(intent, i2, bundle);
    }
}
