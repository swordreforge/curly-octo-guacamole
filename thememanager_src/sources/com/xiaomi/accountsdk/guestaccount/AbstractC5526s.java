package com.xiaomi.accountsdk.guestaccount;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.accountsdk.guestaccount.GuestAccountUiHelper;
import com.xiaomi.accountsdk.guestaccount.data.C5513g;
import com.xiaomi.accountsdk.guestaccount.data.EnumC5515n;
import com.xiaomi.accountsdk.guestaccount.data.EnumC5516q;
import com.xiaomi.accountsdk.utils.fn3e;
import com.xiaomi.accountsdk.utils.ni7;
import com.xiaomi.accountsdk.utils.zurt;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.guestaccount.s */
/* JADX INFO: compiled from: GuestAccountManager.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5526s implements n7h {

    /* JADX INFO: renamed from: k */
    protected final Context f30878k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final GuestAccountUiHelper f72876toq = GuestAccountUiHelper.zy.f30826k;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.guestaccount.s$k */
    /* JADX INFO: compiled from: GuestAccountManager.java */
    static /* synthetic */ class k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f30879k;

        static {
            int[] iArr = new int[EnumC5516q.values().length];
            f30879k = iArr;
            try {
                iArr[EnumC5516q.USE_APP_GUEST_ACCOUNT_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30879k[EnumC5516q.USE_MIUI_GUEST_ACCOUNT_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30879k[EnumC5516q.TRY_MIUI_THEN_APP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    protected AbstractC5526s(Context context) {
        this.f30878k = context.getApplicationContext();
    }

    public static n7h qrj(Context context, EnumC5516q enumC5516q, EnumC5515n enumC5515n) {
        if (context == null) {
            throw new IllegalArgumentException("context == null");
        }
        if (enumC5516q == null) {
            throw new IllegalArgumentException("policy == null");
        }
        if (enumC5515n == null) {
            throw new IllegalArgumentException("type == null");
        }
        int i2 = k.f30879k[enumC5516q.ordinal()];
        if (i2 == 1) {
            return C5524p.zurt(context, enumC5515n);
        }
        if (i2 == 2) {
            return ld6.cdj(context);
        }
        if (i2 == 3) {
            return !ld6.ki(context) ? C5524p.zurt(context, enumC5515n) : (fn3e.m19074q(false) && ni7.zy(new ni7(8, 2), false)) ? C5524p.zurt(context, enumC5515n) : (fn3e.zy(false) && zurt.zy(new zurt(6, 11, 3), false)) ? C5524p.zurt(context, enumC5515n) : ld6.cdj(context);
        }
        throw new IllegalStateException("not here");
    }

    public static n7h x2(Context context) {
        return qrj(context, EnumC5516q.TRY_MIUI_THEN_APP, EnumC5515n.DEFAULT);
    }

    @Override // com.xiaomi.accountsdk.guestaccount.n7h
    /* JADX INFO: renamed from: g */
    public final com.xiaomi.accountsdk.guestaccount.data.toq mo18882g(Context context, String str) {
        if (str != null) {
            return mo18876h(new C5513g().f7l8(str).m18861s(str).m18862y(toq.f30883k), new GuestAccountUiHelper.GuestAccountIntentHandlerImpl(context));
        }
        throw new IllegalArgumentException("sid == null");
    }

    /* JADX INFO: renamed from: h */
    protected abstract com.xiaomi.accountsdk.guestaccount.data.toq mo18876h(C5513g c5513g, IGuestAccountIntentHandler iGuestAccountIntentHandler);

    protected abstract com.xiaomi.accountsdk.guestaccount.data.toq kja0(C5513g c5513g);

    @Override // com.xiaomi.accountsdk.guestaccount.n7h
    public final com.xiaomi.accountsdk.guestaccount.data.toq ld6(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("sid == null or empty");
        }
        return n7h(new C5513g().f7l8(str2).m18861s(str).m18862y(toq.f30883k), new GuestAccountUiHelper.GuestAccountIntentHandlerImpl(context));
    }

    @Override // com.xiaomi.accountsdk.guestaccount.n7h
    /* JADX INFO: renamed from: n */
    public final com.xiaomi.accountsdk.guestaccount.data.toq mo18883n(Context context, String str) {
        return ld6(context, str, str);
    }

    protected abstract com.xiaomi.accountsdk.guestaccount.data.toq n7h(C5513g c5513g, IGuestAccountIntentHandler iGuestAccountIntentHandler);

    @Override // com.xiaomi.accountsdk.guestaccount.n7h
    /* JADX INFO: renamed from: q */
    public final void mo18884q(Activity activity, com.xiaomi.accountsdk.guestaccount.data.zy zyVar) {
        this.f72876toq.zy(activity, zyVar);
    }

    @Override // com.xiaomi.accountsdk.guestaccount.n7h
    public final void toq(GuestAccountUiHelper.InterfaceC5510q interfaceC5510q) {
        this.f72876toq.toq(interfaceC5510q);
    }

    @Override // com.xiaomi.accountsdk.guestaccount.n7h
    public final com.xiaomi.accountsdk.guestaccount.data.toq zy() {
        return kja0(new C5513g().m18862y(toq.f30883k));
    }
}
