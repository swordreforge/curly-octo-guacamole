package com.mibi.sdk.app;

import a5id.C0002k;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.mibi.sdk.common.C5032k;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import vy.zy;

/* JADX INFO: loaded from: classes3.dex */
public class MibiTransitionActivity extends Activity {
    public static final String PAYMENT_KEY_PAYMENT_RESULT = "payment_payment_result";
    private static final String TAG = "MibiTransitionActivity";

    /* JADX INFO: renamed from: com.mibi.sdk.app.MibiTransitionActivity$k */
    class C5030k implements InvocationHandler {
        C5030k() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if ("onSuccess".equalsIgnoreCase(method.getName())) {
                MibiTransitionActivity.this.setSuccessResult((Bundle) objArr[1]);
                return null;
            }
            if (!"onFailed".equalsIgnoreCase(method.getName())) {
                return null;
            }
            MibiTransitionActivity.this.setErrorResult(((Integer) objArr[1]).intValue(), (String) objArr[2], (Bundle) objArr[3]);
            return null;
        }
    }

    private Object getPaymentListener(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C5030k());
    }

    private boolean payForOrderByResponse(Activity activity, String str, zy zyVar, Bundle bundle) {
        try {
            Log.d(TAG, "use reslection payForOrderByResponse()");
            Class<?> clsM17528q = C5032k.m17528q();
            Object objInvoke = clsM17528q.getDeclaredMethod("get", Context.class).invoke(null, activity);
            Class<?> clsM17527n = C5032k.m17527n();
            clsM17528q.getDeclaredMethod("payForOrder", Activity.class, String.class, String.class, Bundle.class, clsM17527n).invoke(objInvoke, activity, "-11", str, bundle, getPaymentListener(clsM17527n));
            return true;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return false;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            return false;
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorResult(int i2, String str, Bundle bundle) {
        String string = bundle != null ? bundle.getString(PAYMENT_KEY_PAYMENT_RESULT) : null;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("code", i2);
        bundle2.putString("message", str);
        bundle2.putString("result", string);
        Intent intent = new Intent();
        intent.putExtras(bundle2);
        setResult(i2, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuccessResult(Bundle bundle) {
        String string = bundle != null ? bundle.getString(PAYMENT_KEY_PAYMENT_RESULT) : null;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("code", -1);
        bundle2.putString("result", string);
        Intent intent = new Intent();
        intent.putExtras(bundle2);
        setResult(-1, intent);
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zy zyVarM1k = C0002k.m1k();
        if (zyVarM1k != null) {
            Intent intent = getIntent();
            if (payForOrderByResponse(this, intent.getStringExtra("order"), zyVarM1k, intent.getExtras())) {
                return;
            }
            setErrorResult(17, "not in miui system but has mibi app", new Bundle());
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putInt("code", 17);
        bundle2.putString("result", "Has no account info");
        Intent intent2 = new Intent();
        intent2.putExtras(bundle2);
        setResult(17, intent2);
        finish();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        C0002k.m1k();
    }
}
