package com.android.thememanager.controller.online;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.util.Pair;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.fti;
import androidx.lifecycle.lrht;
import androidx.lifecycle.uv6;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.C1723y;
import com.android.thememanager.controller.online.t8r;
import cyoe.InterfaceC5979h;
import kotlin.C6318m;
import kotlin.ch;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import kotlinx.coroutines.C6708p;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.dd;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.android.thememanager.controller.online.i */
/* JADX INFO: compiled from: PurchaseModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C1917i {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final lrht f10933k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final fti<ch<Integer, Integer, String>> f10934n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final fti<t8r.C1936n> f10935q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final fti<t8r.EnumC1938y> f57945toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final fti<C1723y<Integer>> f57946zy;

    /* JADX INFO: renamed from: com.android.thememanager.controller.online.i$k */
    /* JADX INFO: compiled from: PurchaseModel.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.controller.online.PurchaseModel$createOrder$1", m22756f = "PurchaseModel.kt", m22757i = {}, m22758l = {66}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ String $onlineId;
        final /* synthetic */ String $resCode;
        final /* synthetic */ t8r.EnumC1934g $type;
        int label;

        /* JADX INFO: renamed from: com.android.thememanager.controller.online.i$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PurchaseModel.kt */
        @InterfaceC6205g(m22755c = "com.android.thememanager.controller.online.PurchaseModel$createOrder$1$result$1", m22756f = "PurchaseModel.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        static final class C7912k extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super t8r.C1936n>, Object> {
            final /* synthetic */ String $onlineId;
            final /* synthetic */ String $resCode;
            final /* synthetic */ t8r.EnumC1934g $type;
            int label;
            final /* synthetic */ C1917i this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7912k(C1917i c1917i, String str, t8r.EnumC1934g enumC1934g, String str2, InterfaceC6216q<? super C7912k> interfaceC6216q) {
                super(2, interfaceC6216q);
                this.this$0 = c1917i;
                this.$resCode = str;
                this.$type = enumC1934g;
                this.$onlineId = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7396q
            public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                return new C7912k(this.this$0, this.$resCode, this.$type, this.$onlineId, interfaceC6216q);
            }

            @Override // cyoe.InterfaceC5979h
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super t8r.C1936n> interfaceC6216q) {
                return ((C7912k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                C6199q.x2();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
                return this.this$0.m7554q(this.$resCode, this.$type, this.$onlineId);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, t8r.EnumC1934g enumC1934g, String str2, InterfaceC6216q<? super k> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$resCode = str;
            this.$type = enumC1934g;
            this.$onlineId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return C1917i.this.new k(this.$resCode, this.$type, this.$onlineId, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((k) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) throws Throwable {
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
                d2ok.qrj(arrayMapM6679k);
                arrayMapM6679k.put("resourceType", "theme");
                C1708s.f7l8().ld6().n5r1(com.android.thememanager.basemodule.analysis.toq.z1r, C1706p.ki(arrayMapM6679k));
                dd ddVarZy = ek5k.f7l8.zy();
                C7912k c7912k = new C7912k(C1917i.this, this.$resCode, this.$type, this.$onlineId, null);
                this.label = 1;
                obj = C6708p.m24523y(ddVarZy, c7912k, this);
                if (obj == objX2) {
                    return objX2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
            }
            C1917i.this.f10935q.cdj((t8r.C1936n) obj);
            return was.f36763k;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.controller.online.i$toq */
    /* JADX INFO: compiled from: PurchaseModel.kt */
    @InterfaceC6205g(m22755c = "com.android.thememanager.controller.online.PurchaseModel$payVerity$1", m22756f = "PurchaseModel.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class toq extends kotlin.coroutines.jvm.internal.kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ String $pOrder;
        final /* synthetic */ String $payResult;
        final /* synthetic */ t8r.EnumC1934g $type;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toq(t8r.EnumC1934g enumC1934g, String str, String str2, InterfaceC6216q<? super toq> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$type = enumC1934g;
            this.$pOrder = str;
            this.$payResult = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return new toq(this.$type, this.$pOrder, this.$payResult, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((toq) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) {
            String strF7l8;
            C6199q.x2();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6318m.n7h(obj);
            try {
                strF7l8 = C1915g.f7l8(ld6.a98o(this.$pOrder, this.$payResult, this.$type == t8r.EnumC1934g.EXCHANGE_CODE ? "gift" : null));
                d2ok.kja0(strF7l8, "requestString(...)");
            } catch (Exception e2) {
                Log.e("PurchaseModel", "payVerity failed:" + e2);
                strF7l8 = "";
            }
            Pair<Integer, JSONObject> pairKi = C1944y.ki(strF7l8);
            d2ok.kja0(pairKi, "parseBaseJsonData(...)");
            Integer num = (Integer) pairKi.first;
            if (num != null && num.intValue() == 0) {
                Log.i("PurchaseModel", "Success to verify payment result.");
            } else {
                Log.e("PurchaseModel", "Fail to verify payment result: " + strF7l8);
            }
            return was.f36763k;
        }
    }

    public C1917i(@InterfaceC7396q lrht vm) {
        d2ok.m23075h(vm, "vm");
        this.f10933k = vm;
        this.f57945toq = new fti<>(t8r.EnumC1938y.NONE);
        this.f57946zy = new fti<>(new C1723y(0));
        this.f10935q = new fti<>(null);
        this.f10934n = new fti<>();
    }

    private final void f7l8(int i2, int i3, String str) {
        this.f10934n.cdj(new ch<>(Integer.valueOf(i2), Integer.valueOf(i3), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(15:14|(2:73|15)|(13:17|(1:19)|22|(2:(1:25)|26)|(1:28)(1:29)|30|(1:32)(1:34)|35|74|(4:37|(2:39|(1:41)(3:46|(1:48)|49))|65|(1:69))(2:51|(1:53)(3:54|55|(2:67|69)))|50|65|(0))(1:20)|21|22|(0)|(0)(0)|30|(0)(0)|35|74|(0)(0)|50|65|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0128, code lost:
    
        r0.printStackTrace();
        r12 = 6;
        r7 = "RuntimeException(" + r0 + ')';
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0145, code lost:
    
        r0.printStackTrace();
        r7 = "Http(" + r0 + ')';
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a A[Catch: Exception -> 0x0126, IOException -> 0x0143, n -> 0x015c, TryCatch #1 {n -> 0x015c, blocks: (B:15:0x0058, B:17:0x005e, B:19:0x0075, B:22:0x0082, B:25:0x008a, B:26:0x008f, B:28:0x009a, B:30:0x00a4, B:32:0x00b3, B:41:0x00c7, B:46:0x00e4, B:48:0x00eb, B:49:0x00fa, B:51:0x0107, B:53:0x011a, B:54:0x0120, B:29:0x009f), top: B:73:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f A[Catch: Exception -> 0x0126, IOException -> 0x0143, n -> 0x015c, TryCatch #1 {n -> 0x015c, blocks: (B:15:0x0058, B:17:0x005e, B:19:0x0075, B:22:0x0082, B:25:0x008a, B:26:0x008f, B:28:0x009a, B:30:0x00a4, B:32:0x00b3, B:41:0x00c7, B:46:0x00e4, B:48:0x00eb, B:49:0x00fa, B:51:0x0107, B:53:0x011a, B:54:0x0120, B:29:0x009f), top: B:73:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3 A[Catch: Exception -> 0x0126, IOException -> 0x0143, n -> 0x015c, TRY_LEAVE, TryCatch #1 {n -> 0x015c, blocks: (B:15:0x0058, B:17:0x005e, B:19:0x0075, B:22:0x0082, B:25:0x008a, B:26:0x008f, B:28:0x009a, B:30:0x00a4, B:32:0x00b3, B:41:0x00c7, B:46:0x00e4, B:48:0x00eb, B:49:0x00fa, B:51:0x0107, B:53:0x011a, B:54:0x0120, B:29:0x009f), top: B:73:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0107 A[Catch: Exception -> 0x00e0, IOException -> 0x00e2, n -> 0x015c, TryCatch #1 {n -> 0x015c, blocks: (B:15:0x0058, B:17:0x005e, B:19:0x0075, B:22:0x0082, B:25:0x008a, B:26:0x008f, B:28:0x009a, B:30:0x00a4, B:32:0x00b3, B:41:0x00c7, B:46:0x00e4, B:48:0x00eb, B:49:0x00fa, B:51:0x0107, B:53:0x011a, B:54:0x0120, B:29:0x009f), top: B:73:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018c  */
    @zy.y9n
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.android.thememanager.controller.online.t8r.C1936n m7554q(java.lang.String r17, com.android.thememanager.controller.online.t8r.EnumC1934g r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.controller.online.C1917i.m7554q(java.lang.String, com.android.thememanager.controller.online.t8r$g, java.lang.String):com.android.thememanager.controller.online.t8r$n");
    }

    /* JADX INFO: renamed from: y */
    private final void m7555y() {
        this.f10934n.n7h(new ch<>(0, 0, ""));
    }

    public final void cdj() {
        this.f57945toq.cdj(t8r.EnumC1938y.NONE);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public final lrht m7556g() {
        return this.f10933k;
    }

    /* JADX INFO: renamed from: h */
    public final void m7557h(@InterfaceC7396q t8r.EnumC1934g type, @InterfaceC7395n String str, @InterfaceC7395n String str2) {
        d2ok.m23075h(type, "type");
        kotlinx.coroutines.x2.m24649g(uv6.m4473k(this.f10933k), ek5k.f7l8.zy(), null, new toq(type, str, str2, null), 2, null);
    }

    public final void kja0(@InterfaceC7395n String str, @InterfaceC7395n Bundle bundle, @InterfaceC7396q t8r.EnumC1934g pType) {
        d2ok.m23075h(pType, "pType");
        Log.e("PurchaseModel", "CreateOrderTask paymentListener onSuccess: ");
        t8r.C1936n c1936nM4388g = this.f10935q.m4388g();
        m7557h(pType, c1936nM4388g != null ? c1936nM4388g.f11021q : null, bundle != null ? bundle.getString("result") : null);
        m7555y();
        C1708s.f7l8().ld6().d2ok(C1706p.toq(com.android.thememanager.basemodule.analysis.toq.qs, str));
        Log.i("PurchaseModel", "mi pay success");
    }

    @InterfaceC7396q
    public final LiveData<ch<Integer, Integer, String>> ld6() {
        return this.f10934n;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: n */
    public final t8r.EnumC1938y m7558n() {
        return this.f57945toq.m4388g();
    }

    public final void n7h(@InterfaceC7396q t8r.C1936n ret, @InterfaceC7395n String str, @InterfaceC7396q t8r.EnumC1934g pType) {
        d2ok.m23075h(ret, "ret");
        d2ok.m23075h(pType, "pType");
        int i2 = ret.f11020k;
        int i3 = ret.f57963toq;
        String str2 = ret.f57964zy;
        String str3 = ret.f11021q;
        Log.i("PurchaseModel", "CreateOrderTask return: " + i2 + " onlineId=" + str + " type=" + pType);
        if (this.f57945toq.m4388g() != t8r.EnumC1938y.GETTING_ORDER) {
            Log.i("PurchaseModel", "onPostCreateOrder.not GETTING_ORDER , step:" + this.f57945toq.m4388g());
        }
        switch (i2) {
            case 1:
                m7555y();
                break;
            case 2:
                if (!TextUtils.isEmpty(str3)) {
                    this.f57945toq.cdj(t8r.EnumC1938y.WAITING_PAYMENT);
                    Log.d("PurchaseModel", "onPostCreateOrder: PaymentManager payForOrder");
                    this.f57946zy.cdj(new C1723y<>(1));
                } else {
                    f7l8(t8r.f11003o, i3, str2);
                }
                break;
            case 3:
                f7l8(t8r.f11006t, i3, str2);
                break;
            case 4:
                if (i3 != 407) {
                    if (i3 == 408) {
                        f7l8(t8r.f11000j, i3, str2);
                    } else if (i3 != 410) {
                        f7l8(t8r.f11001l, i3, str2);
                    }
                }
                f7l8(t8r.f11002m, i3, str2);
                break;
            case 5:
                f7l8(t8r.f10997f, i3, str2);
                break;
            case 6:
                f7l8(t8r.f10994c, i3, str2);
                break;
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public final LiveData<t8r.C1936n> m7559p() {
        return this.f10935q;
    }

    public final void qrj(int i2, @InterfaceC7395n String str) {
        Log.e("PurchaseModel", "CreateOrderTask paymentListener onFailed: " + i2 + ',' + str);
        if (i2 == 7) {
            m7555y();
        } else if (i2 == 14) {
            this.f10934n.cdj(new ch<>(Integer.valueOf(t8r.f11008v), Integer.valueOf(i2), str));
        } else {
            this.f10934n.cdj(new ch<>(Integer.valueOf(t8r.f10995d), Integer.valueOf(i2), "mipayResult(" + i2 + ',' + str + ')'));
        }
        Log.i("PurchaseModel", "mi pay failed: code=" + i2 + " message=" + str);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: s */
    public final LiveData<C1723y<Integer>> m7560s() {
        return this.f57946zy;
    }

    @InterfaceC7396q
    public final LiveData<t8r.EnumC1938y> x2() {
        return this.f57945toq;
    }

    public final void zy(@InterfaceC7395n String str, @InterfaceC7396q t8r.EnumC1934g type, @InterfaceC7396q String resCode) {
        d2ok.m23075h(type, "type");
        d2ok.m23075h(resCode, "resCode");
        this.f57945toq.cdj(t8r.EnumC1938y.GETTING_ORDER);
        kotlinx.coroutines.x2.m24649g(uv6.m4473k(this.f10933k), null, null, new k(resCode, type, str, null), 3, null);
    }
}
