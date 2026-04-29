package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.xiaomi.push.C5883n;
import com.xiaomi.push.le7;
import com.xiaomi.push.oph;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class a9 {

    /* JADX INFO: renamed from: q */
    private static volatile a9 f33714q;

    /* JADX INFO: renamed from: k */
    protected SharedPreferences f33715k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected SharedPreferences f73556toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private HashSet<AbstractRunnableC5906k> f73557zy = new HashSet<>();

    /* JADX INFO: renamed from: com.xiaomi.push.service.a9$k */
    public static abstract class AbstractRunnableC5906k implements Runnable {

        /* JADX INFO: renamed from: k */
        private int f33716k;

        /* JADX INFO: renamed from: q */
        private String f33717q;

        public AbstractRunnableC5906k(int i2, String str) {
            this.f33716k = i2;
            this.f33717q = str;
        }

        public boolean equals(Object obj) {
            return (obj instanceof AbstractRunnableC5906k) && this.f33716k == ((AbstractRunnableC5906k) obj).f33716k;
        }

        public int hashCode() {
            return this.f33716k;
        }

        /* JADX INFO: renamed from: k */
        protected abstract void mo19383k();

        @Override // java.lang.Runnable
        public final void run() {
            mo19383k();
        }
    }

    private a9(Context context) {
        this.f33715k = context.getSharedPreferences("mipush_oc_normal", 0);
        this.f73556toq = context.getSharedPreferences("mipush_oc_custom", 0);
    }

    private String f7l8(le7 le7Var) {
        return "oc_version_" + le7Var.m21155a();
    }

    /* JADX INFO: renamed from: n */
    private String m21549n(int i2) {
        return "oc_" + i2;
    }

    /* JADX INFO: renamed from: q */
    public static a9 m21550q(Context context) {
        if (f33714q == null) {
            synchronized (a9.class) {
                if (f33714q == null) {
                    f33714q = new a9(context);
                }
            }
        }
        return f33714q;
    }

    /* JADX INFO: renamed from: s */
    private void m21551s(SharedPreferences.Editor editor, Pair<Integer, Object> pair, String str) {
        Object obj = pair.second;
        if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            editor.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (!(obj instanceof String)) {
            if (obj instanceof Boolean) {
                editor.putBoolean(str, ((Boolean) obj).booleanValue());
            }
        } else {
            String str2 = (String) obj;
            if (str.equals(m21549n(oph.AppIsInstalledList.m21370a()))) {
                editor.putString(str, com.xiaomi.push.x9kr.m22019k(str2));
            } else {
                editor.putString(str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public String m21552g(int i2, String str) {
        try {
            String strM21549n = m21549n(i2);
            return this.f73556toq.contains(strM21549n) ? this.f73556toq.getString(strM21549n, null) : this.f33715k.contains(strM21549n) ? this.f33715k.getString(strM21549n, null) : str;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.kja0(i2 + " oc string error " + e2);
            return str;
        }
    }

    /* JADX INFO: renamed from: k */
    public int m21553k(int i2, int i3) {
        try {
            String strM21549n = m21549n(i2);
            return this.f73556toq.contains(strM21549n) ? this.f73556toq.getInt(strM21549n, 0) : this.f33715k.contains(strM21549n) ? this.f33715k.getInt(strM21549n, 0) : i3;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.kja0(i2 + " oc int error " + e2);
            return i3;
        }
    }

    public void ld6(List<Pair<Integer, Object>> list) {
        if (C5883n.m21299k(list)) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f73556toq.edit();
        for (Pair<Integer, Object> pair : list) {
            Object obj = pair.first;
            if (obj != null) {
                String strM21549n = m21549n(((Integer) obj).intValue());
                if (pair.second == null) {
                    editorEdit.remove(strM21549n);
                } else {
                    m21551s(editorEdit, pair, strM21549n);
                }
            }
        }
        editorEdit.apply();
    }

    void n7h() {
        com.xiaomi.channel.commonutils.logger.zy.m19300t("OC_Callback : receive new oc data");
        HashSet<AbstractRunnableC5906k> hashSet = new HashSet();
        synchronized (this) {
            hashSet.addAll(this.f73557zy);
        }
        for (AbstractRunnableC5906k abstractRunnableC5906k : hashSet) {
            if (abstractRunnableC5906k != null) {
                abstractRunnableC5906k.run();
            }
        }
        hashSet.clear();
    }

    /* JADX INFO: renamed from: p */
    public synchronized void m21554p(AbstractRunnableC5906k abstractRunnableC5906k) {
        if (!this.f73557zy.contains(abstractRunnableC5906k)) {
            this.f73557zy.add(abstractRunnableC5906k);
        }
    }

    public boolean qrj(int i2, boolean z2) {
        try {
            String strM21549n = m21549n(i2);
            return this.f73556toq.contains(strM21549n) ? this.f73556toq.getBoolean(strM21549n, false) : this.f33715k.contains(strM21549n) ? this.f33715k.getBoolean(strM21549n, false) : z2;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.kja0(i2 + " oc boolean error " + e2);
            return z2;
        }
    }

    public int toq(le7 le7Var, int i2) {
        try {
            return this.f33715k.getInt(f7l8(le7Var), i2);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.kja0(le7Var + " version error " + e2);
            return i2;
        }
    }

    public void x2(List<Pair<le7, Integer>> list, List<Pair<Integer, Object>> list2) {
        if (C5883n.m21299k(list) || C5883n.m21299k(list2)) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("not update oc, because versions or configs are empty");
            return;
        }
        SharedPreferences.Editor editorEdit = this.f33715k.edit();
        editorEdit.clear();
        for (Pair<le7, Integer> pair : list) {
            Object obj = pair.first;
            if (obj != null && pair.second != null) {
                editorEdit.putInt(f7l8((le7) obj), ((Integer) pair.second).intValue());
            }
        }
        for (Pair<Integer, Object> pair2 : list2) {
            Object obj2 = pair2.first;
            if (obj2 != null && pair2.second != null) {
                m21551s(editorEdit, pair2, m21549n(((Integer) obj2).intValue()));
            }
        }
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: y */
    public synchronized void m21555y() {
        this.f73557zy.clear();
    }

    public long zy(int i2, long j2) {
        try {
            String strM21549n = m21549n(i2);
            return this.f73556toq.contains(strM21549n) ? this.f73556toq.getLong(strM21549n, 0L) : this.f33715k.contains(strM21549n) ? this.f33715k.getLong(strM21549n, 0L) : j2;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.kja0(i2 + " oc long error " + e2);
            return j2;
        }
    }
}
