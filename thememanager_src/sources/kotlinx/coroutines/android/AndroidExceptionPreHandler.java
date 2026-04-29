package kotlinx.coroutines.android;

import android.os.Build;
import androidx.annotation.Keep;
import com.market.sdk.reflect.C4991s;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.coroutines.AbstractC6212k;
import kotlin.coroutines.f7l8;
import kotlin.d3;
import kotlinx.coroutines.x9kr;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: AndroidExceptionPreHandler.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/android/AndroidExceptionPreHandler;", "Lkotlin/coroutines/k;", "Lkotlinx/coroutines/x9kr;", "Ljava/lang/reflect/Method;", "preHandler", "Lkotlin/coroutines/f7l8;", "context", "", "exception", "Lkotlin/was;", "handleException", "", "_preHandler", "Ljava/lang/Object;", C4991s.f28129n, "()V", "kotlinx-coroutines-android"}, m22787k = 1, mv = {1, 6, 0})
@Keep
public final class AndroidExceptionPreHandler extends AbstractC6212k implements x9kr {

    @InterfaceC7395n
    private volatile Object _preHandler;

    public AndroidExceptionPreHandler() {
        super(x9kr.mdr8);
        this._preHandler = this;
    }

    private final Method preHandler() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            boolean z2 = false;
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    z2 = true;
                }
            }
            if (z2) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // kotlinx.coroutines.x9kr
    public void handleException(@InterfaceC7396q f7l8 f7l8Var, @InterfaceC7396q Throwable th) {
        if (Build.VERSION.SDK_INT < 28) {
            Method methodPreHandler = preHandler();
            Object objInvoke = methodPreHandler == null ? null : methodPreHandler.invoke(null, new Object[0]);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objInvoke : null;
            if (uncaughtExceptionHandler == null) {
                return;
            }
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
    }
}
