package com.xiaomi.accountsdk.guestaccount;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.RemoteException;
import com.xiaomi.accountsdk.guestaccount.IGuestAccountIntentHandler;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class GuestAccountUiHelper {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final InterfaceC5510q f72861toq = new C5509k();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final InterfaceC5510q f72862zy = new toq();

    /* JADX INFO: renamed from: k */
    InterfaceC5510q f30825k;

    static final class GuestAccountIntentHandlerImpl extends IGuestAccountIntentHandler.Stub {
        private final WeakReference<Activity> activityWeakReference;

        public GuestAccountIntentHandlerImpl(Context context) {
            this.activityWeakReference = new WeakReference<>(context instanceof Activity ? (Activity) context : null);
        }

        @Override // com.xiaomi.accountsdk.guestaccount.IGuestAccountIntentHandler
        public boolean handleIntent(Intent intent) throws RemoteException {
            Activity activity = this.activityWeakReference.get();
            if (intent == null || activity == null || activity.isFinishing()) {
                return false;
            }
            activity.startActivity(intent);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.guestaccount.GuestAccountUiHelper$k */
    static class C5509k implements InterfaceC5510q {
        C5509k() {
        }

        @Override // com.xiaomi.accountsdk.guestaccount.GuestAccountUiHelper.InterfaceC5510q
        /* JADX INFO: renamed from: k */
        public CharSequence mo18845k(int i2) {
            return "获取游客帐号信息出错";
        }

        @Override // com.xiaomi.accountsdk.guestaccount.GuestAccountUiHelper.InterfaceC5510q
        public CharSequence toq(int i2, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("获取游客帐号信息出错:");
            if (i2 > 100) {
                sb.append("错误码=");
                sb.append(i2);
            } else if (i2 == 6) {
                sb.append("网络错误");
            } else if (i2 == 5) {
                sb.append("服务器错误");
            } else if (i2 == 2) {
                sb.append("APP权限错误");
            } else if (i2 == 4) {
                sb.append("未同意“我的小米”联网");
            } else if (i2 == 7) {
                sb.append("本地参数错误：" + str);
            } else {
                sb.append("未错误(错误码=");
                sb.append(i2);
                sb.append(")");
            }
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.guestaccount.GuestAccountUiHelper$q */
    public interface InterfaceC5510q {
        /* JADX INFO: renamed from: k */
        CharSequence mo18845k(int i2);

        CharSequence toq(int i2, String str);
    }

    static class toq implements InterfaceC5510q {
        toq() {
        }

        @Override // com.xiaomi.accountsdk.guestaccount.GuestAccountUiHelper.InterfaceC5510q
        /* JADX INFO: renamed from: k */
        public CharSequence mo18845k(int i2) {
            return "Guest Account Error";
        }

        @Override // com.xiaomi.accountsdk.guestaccount.GuestAccountUiHelper.InterfaceC5510q
        public CharSequence toq(int i2, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("Guest Account Error: ");
            if (i2 > 100) {
                sb.append("code=");
                sb.append(i2);
            } else if (i2 == 6) {
                sb.append("Network Error");
            } else if (i2 == 5) {
                sb.append("Server Error");
            } else if (i2 == 2) {
                sb.append("APP Permission Error");
            } else if (i2 == 4) {
                sb.append("Please allow XiaomiAccount app for internet");
            } else if (i2 == 7) {
                sb.append("Local parameter error:" + str);
            } else {
                sb.append("System Error(code=");
                sb.append(i2);
                sb.append(")");
            }
            return sb.toString();
        }
    }

    static class zy {

        /* JADX INFO: renamed from: k */
        static GuestAccountUiHelper f30826k = new GuestAccountUiHelper();

        zy() {
        }
    }

    /* JADX INFO: renamed from: k */
    final InterfaceC5510q m18844k() {
        InterfaceC5510q interfaceC5510q = this.f30825k;
        return interfaceC5510q != null ? interfaceC5510q : Locale.getDefault().equals(Locale.SIMPLIFIED_CHINESE) ? f72861toq : f72862zy;
    }

    final void toq(InterfaceC5510q interfaceC5510q) {
        if (interfaceC5510q == null) {
            throw new IllegalArgumentException("stringResourceInjector == null");
        }
        this.f30825k = interfaceC5510q;
    }

    final void zy(Activity activity, com.xiaomi.accountsdk.guestaccount.data.zy zyVar) {
        if (zyVar == null) {
            return;
        }
        Intent intentM18865n = zyVar.m18865n();
        if (intentM18865n != null) {
            activity.startActivity(intentM18865n);
            return;
        }
        int qVar = zyVar.toq();
        String strZy = zyVar.zy();
        if (qVar == 0) {
            return;
        }
        InterfaceC5510q interfaceC5510qM18844k = m18844k();
        new AlertDialog.Builder(activity).setTitle(interfaceC5510qM18844k.mo18845k(qVar)).setMessage(interfaceC5510qM18844k.toq(qVar, strZy)).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).show();
    }
}
