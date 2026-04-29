package com.miui.unifiedAdSdk;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.miui.systemAdSolution.changeSkin.IChangeSkinService;
import com.miui.systemAdSolution.common.AdTrackType;
import com.xiaomi.ad.entity.common.C5586q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import u38j.C7683q;

/* JADX INFO: compiled from: RemoteUnifiedAdService.java */
/* JADX INFO: loaded from: classes3.dex */
public class f7l8 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final String f72510f7l8 = "RemoteUnifiedAdService";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static long f72511kja0 = 0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f72512ld6 = "com.miui.systemAdSolution";

    /* JADX INFO: renamed from: p */
    private static final String f29868p = "miui.intent.action.ad.CHANGE_SKIN";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final long f72515x2 = 1000;

    /* JADX INFO: renamed from: y */
    private static final String f29870y = "unified_ad_list";

    /* JADX INFO: renamed from: k */
    private Context f29872k;

    /* JADX INFO: renamed from: n */
    private C5356y f29873n;

    /* JADX INFO: renamed from: s */
    private static final ExecutorService f29869s = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final Set<Long> f72514qrj = new ConcurrentSkipListSet();

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static volatile f7l8 f72513n7h = null;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private IChangeSkinService f72516toq = null;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Object f72517zy = new Object();

    /* JADX INFO: renamed from: q */
    private Map<String, zy> f29874q = new ConcurrentHashMap();

    /* JADX INFO: renamed from: g */
    private ServiceConnection f29871g = new com.miui.unifiedAdSdk.zy(this);

    /* JADX INFO: renamed from: com.miui.unifiedAdSdk.f7l8$k */
    /* JADX INFO: compiled from: RemoteUnifiedAdService.java */
    abstract class AbstractRunnableC5350k<P, R> implements Runnable {

        /* JADX INFO: renamed from: k */
        P f29875k;

        protected AbstractRunnableC5350k(P p2) {
            this.f29875k = p2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public R m18211q() {
            R qVar;
            synchronized (f7l8.this.f72517zy) {
                f7l8.this.fn3e();
                if (f7l8.this.t8r()) {
                    qVar = toq(f7l8.this.f72516toq, this.f29875k);
                } else {
                    f7l8.this.f72517zy.wait(1000L);
                    qVar = f7l8.this.t8r() ? toq(f7l8.this.f72516toq, this.f29875k) : null;
                }
            }
            return qVar;
        }

        /* JADX INFO: renamed from: n */
        public R m18212n(long j2, Executor executor) {
            if (j2 <= 0 || executor == null) {
                return null;
            }
            FutureTask futureTask = new FutureTask(new CallableC5353n(this));
            executor.execute(futureTask);
            return (R) futureTask.get(j2, TimeUnit.MILLISECONDS);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                new Handler(f7l8.this.f29872k.getMainLooper()).post(new RunnableC5351g(this, m18211q()));
            } catch (Exception e2) {
                Log.e(f7l8.f72510f7l8, "colud not invoke the remote method.", e2);
            }
        }

        abstract R toq(IChangeSkinService iChangeSkinService, P p2);

        void zy(R r2) {
        }
    }

    /* JADX INFO: compiled from: RemoteUnifiedAdService.java */
    private class toq extends AbstractRunnableC5350k<String, Void> {
        /* synthetic */ toq(f7l8 f7l8Var, String str, com.miui.unifiedAdSdk.zy zyVar) {
            this(str);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.miui.unifiedAdSdk.f7l8.AbstractRunnableC5350k
        /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
        public void zy(Void r1) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.miui.unifiedAdSdk.f7l8.AbstractRunnableC5350k
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Void toq(IChangeSkinService iChangeSkinService, String str) {
            if (TextUtils.isEmpty(str)) {
                C7683q.m28057q(f7l8.f72510f7l8, "tag id is null.");
                return null;
            }
            try {
                String skinInfoByTagId = iChangeSkinService.getSkinInfoByTagId(str, f7l8.this.f29872k.getPackageName());
                Log.i(f7l8.f72510f7l8, "get the newest unified ad info list[" + skinInfoByTagId + "] of [" + ((String) this.f29875k) + "]");
                List<com.xiaomi.ad.entity.unified.toq> listLd6 = f7l8.this.ld6(skinInfoByTagId);
                zy zyVar = (zy) f7l8.this.f29874q.get(str);
                if (zyVar != null ? zyVar.toq(listLd6) : true) {
                    f7l8.this.f29873n.ld6((String) this.f29875k, listLd6);
                }
            } catch (Exception e2) {
                C7683q.m28055n(f7l8.f72510f7l8, "could not conver string to a adInfo list.", e2);
            }
            return null;
        }

        private toq(String str) {
            super(str);
        }
    }

    /* JADX INFO: compiled from: RemoteUnifiedAdService.java */
    public interface zy {
        /* JADX INFO: renamed from: k */
        boolean m18214k(com.xiaomi.ad.entity.unified.toq toqVar);

        boolean toq(List<com.xiaomi.ad.entity.unified.toq> list);
    }

    private f7l8(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("the context is null");
        }
        Context applicationContext = context.getApplicationContext();
        this.f29872k = applicationContext;
        if (applicationContext == null) {
            this.f29872k = context;
        }
        this.f29873n = new C5356y(this.f29872k);
        qrj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fn3e() {
        if (this.f72516toq == null) {
            qrj();
        }
    }

    /* JADX INFO: renamed from: h */
    private static Intent m18202h() {
        Intent intent = new Intent();
        intent.setAction(f29868p);
        intent.setPackage("com.miui.systemAdSolution");
        return intent;
    }

    /* JADX INFO: renamed from: i */
    private static boolean m18203i(Context context) {
        List<ResolveInfo> listQueryIntentServices;
        try {
            Intent intentM18202h = m18202h();
            if (context != null && context.getPackageManager() != null && (listQueryIntentServices = context.getPackageManager().queryIntentServices(intentM18202h, 0)) != null && listQueryIntentServices.size() > 0) {
                Log.d(f72510f7l8, "find the ad service in systemAdSolution.");
                return true;
            }
        } catch (Exception e2) {
            Log.e(f72510f7l8, "some exceptions occur when judge if there is the system ad app.", e2);
        }
        Log.e(f72510f7l8, "there is no a systemAdSolution app.");
        return false;
    }

    public static synchronized f7l8 ki(Context context) {
        if (f72513n7h == null) {
            f72513n7h = new f7l8(context);
        }
        return f72513n7h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<com.xiaomi.ad.entity.unified.toq> ld6(String str) {
        com.xiaomi.ad.entity.unified.toq toqVarM19205p;
        ArrayList arrayList = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONArray jSONArray = new JSONArray(str);
        int length = jSONArray.length();
        if (length > 0) {
            arrayList = new ArrayList();
            for (int i2 = 0; i2 < length; i2++) {
                String strOptString = jSONArray.optString(i2);
                if (!TextUtils.isEmpty(strOptString) && (toqVarM19205p = com.xiaomi.ad.entity.unified.toq.m19205p(strOptString)) != null) {
                    arrayList.add(toqVarM19205p);
                }
            }
        }
        return arrayList;
    }

    private void qrj() {
        if (m18203i(this.f29872k)) {
            try {
                this.f29872k.bindService(m18202h(), this.f29871g, 1);
                f72511kja0 = System.currentTimeMillis();
                Log.d(f72510f7l8, "start bind service " + f72511kja0);
            } catch (Exception e2) {
                Log.e(f72510f7l8, "could not bind the service.", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t8r() {
        return m18203i(this.f29872k) && this.f72516toq != null;
    }

    public void cdj(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            f29869s.execute(new toq(this, str, null));
        } catch (Exception e2) {
            Log.e(f72510f7l8, "colud not get skin info from system ad app. becuase some exceptions occur.", e2);
        }
    }

    public com.xiaomi.ad.entity.unified.toq kja0(String str) {
        com.xiaomi.ad.entity.unified.toq next;
        C5586q c5586q;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            List<com.xiaomi.ad.entity.unified.toq> listF7l8 = this.f29873n.f7l8(str);
            if (listF7l8 != null && !listF7l8.isEmpty()) {
                Iterator<com.xiaomi.ad.entity.unified.toq> it = listF7l8.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (next != null) {
                        if (!next.m19207i()) {
                            zy zyVar = this.f29874q.get(str);
                            if (zyVar == null || zyVar.m18214k(next)) {
                                break;
                            }
                        }
                    }
                }
                if (next == null) {
                    Log.i(f72510f7l8, "could not get skin info by [" + str + "]. no fitted ad info. maybe all ads are invalid.");
                    return null;
                }
                List<C5586q> listKja0 = next.kja0();
                if (listKja0 != null && !listKja0.isEmpty() && (c5586q = listKja0.get(0)) != null && c5586q.m19186h()) {
                    f72514qrj.add(new Long(next.getId()));
                }
                return next;
            }
            Log.i(f72510f7l8, "there is no unified ad for tagId[" + str + "] now.");
            return null;
        } catch (Exception e2) {
            Log.e(f72510f7l8, "could not get the ad from local.", e2);
            return null;
        }
    }

    <P, R> void n7h(AbstractRunnableC5350k<P, R> abstractRunnableC5350k) {
        if (abstractRunnableC5350k == null) {
            return;
        }
        try {
            f29869s.execute(abstractRunnableC5350k);
        } catch (Exception e2) {
            Log.e(f72510f7l8, "exec some command failed.", e2);
        }
    }

    public void ni7() {
        if (m18203i(this.f29872k)) {
            this.f29872k.unbindService(this.f29871g);
        }
    }

    public boolean x2(String str, AdTrackType adTrackType, String str2, long j2, C5586q c5586q, long j3) throws TimeoutException {
        String str3;
        String packageName;
        if (this.f29872k == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || adTrackType == null || j2 < 0 || c5586q == null) {
            Log.e(f72510f7l8, "the params are invalid.");
            return false;
        }
        if (adTrackType.getValue() == AdTrackType.EnumC5325k.TRACK_VIEW && c5586q.m19186h() && !f72514qrj.remove(new Long(j2))) {
            Log.i(f72510f7l8, "could not track. becasue the method getAdInfoFromLocal is not called before this material level tracking.");
            return false;
        }
        try {
            try {
                packageName = this.f29872k.getPackageName();
                str3 = f72510f7l8;
            } catch (Exception e2) {
                e = e2;
                str3 = f72510f7l8;
            }
            try {
                Boolean boolM18212n = new C5354q(this, null, packageName, str, adTrackType, str2, j2, c5586q, j3).m18212n(1000L, f29869s);
                Log.i(str3, "the track type is :" + adTrackType.getValue().name());
                StringBuilder sb = new StringBuilder();
                sb.append("do track! the ad info id is ");
                sb.append(j2);
                sb.append(", the material id is ");
                sb.append(c5586q.getId());
                sb.append(", the resource id is ");
                sb.append(j3);
                sb.append(", the level is ");
                sb.append(c5586q.m19186h() ? "material leve" : "resource level.");
                Log.i(str3, sb.toString());
                if (boolM18212n == null) {
                    return false;
                }
                return boolM18212n.booleanValue();
            } catch (Exception e3) {
                e = e3;
                Log.e(str3, "colud not do track.", e);
                return false;
            }
        } catch (TimeoutException unused) {
            throw new TimeoutException("do track is time out(more than 1000 second.)");
        }
    }

    public void zurt(String str, zy zyVar) {
        if (TextUtils.isEmpty(str) || zyVar == null) {
            return;
        }
        this.f29874q.put(str, zyVar);
    }
}
