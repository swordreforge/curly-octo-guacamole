package com.android.thememanager.search;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.android.thememanager.C2082k;
import com.android.thememanager.ThemeApplication;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.controller.online.ld6;
import com.android.thememanager.controller.online.zurt;
import com.android.thememanager.fu4;
import com.android.thememanager.util.C2755a;
import com.android.thememanager.util.ch;
import com.android.thememanager.util.ek5k;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: compiled from: ResourceSearchHintDataManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy {

    /* JADX INFO: renamed from: n */
    private static final long f14709n = 300000;

    /* JADX INFO: renamed from: q */
    private static final String f14710q = "search_hint_history_";

    /* JADX INFO: renamed from: k */
    private final Context f14711k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final fu4 f60758toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    protected final SharedPreferences f60759zy;

    /* JADX INFO: renamed from: com.android.thememanager.search.zy$k */
    /* JADX INFO: compiled from: ResourceSearchHintDataManager.java */
    class C2485k implements Comparator<Map.Entry<String, ?>> {
        C2485k() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compare(Map.Entry<String, ?> lhs, Map.Entry<String, ?> rhs) {
            return Long.compare(((Long) rhs.getValue()).longValue(), ((Long) lhs.getValue()).longValue());
        }
    }

    public zy(fu4 resourceContext) {
        ThemeApplication qVar = C2082k.zy().toq();
        this.f14711k = qVar;
        this.f60758toq = resourceContext;
        this.f60759zy = qVar.getSharedPreferences(f14710q + resourceContext.getResourceCode(), 0);
    }

    /* JADX INFO: renamed from: g */
    private String m8884g(String url) {
        return this.f60758toq.getSearchHintCacheFolder() + ch.gvn7(url);
    }

    private static C2481q[] zy(File file) {
        try {
            JSONArray jSONArrayM9706k = ek5k.m9706k(file);
            a98o.zy zyVar = new a98o.zy();
            for (int i2 = 0; i2 < jSONArrayM9706k.length(); i2++) {
                zyVar.add(new C2481q(jSONArrayM9706k.getString(i2), false));
            }
            return (C2481q[]) zyVar.toArray(new C2481q[0]);
        } catch (Exception e2) {
            Log.e(C2755a.f16307g, "Wron json fromat of comment list from server: " + e2);
            e2.printStackTrace();
            return null;
        }
    }

    public boolean f7l8() {
        y9n.m7257y();
        SharedPreferences.Editor editorEdit = this.f60759zy.edit();
        editorEdit.clear();
        editorEdit.commit();
        return true;
    }

    /* JADX INFO: renamed from: k */
    public boolean m8885k(String historyHint) {
        y9n.m7257y();
        if (historyHint == null || historyHint.trim().length() == 0) {
            return false;
        }
        List<C2481q> listM8887q = m8887q();
        SharedPreferences.Editor editorEdit = this.f60759zy.edit();
        if (listM8887q.size() >= 11) {
            for (int i2 = 11; i2 < listM8887q.size(); i2++) {
                m8888y(listM8887q.get(i2).f14652k);
            }
        }
        editorEdit.putLong(historyHint.trim(), System.currentTimeMillis());
        editorEdit.commit();
        return true;
    }

    /* JADX INFO: renamed from: n */
    public C2481q[] m8886n(String filterText) {
        zurt zurtVarGyi = new ld6(this.f60758toq).gyi(filterText);
        String strM8884g = m8884g(zurtVarGyi.getUrlId());
        if (System.currentTimeMillis() - new File(strM8884g).lastModified() > 300000) {
            new com.android.thememanager.controller.online.toq(strM8884g).toq(zurtVarGyi, strM8884g);
        }
        return zy(new File(strM8884g));
    }

    /* JADX INFO: renamed from: q */
    public List<C2481q> m8887q() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.f60759zy.getAll().entrySet());
        Collections.sort(arrayList2, new C2485k());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(new C2481q((String) ((Map.Entry) it.next()).getKey(), true));
        }
        return arrayList;
    }

    public boolean toq(String historyHint) {
        y9n.m7257y();
        if (historyHint == null || historyHint.trim().length() == 0) {
            return false;
        }
        String strTrim = historyHint.trim();
        SharedPreferences.Editor editorEdit = this.f60759zy.edit();
        editorEdit.putLong(strTrim, System.currentTimeMillis());
        editorEdit.commit();
        return true;
    }

    /* JADX INFO: renamed from: y */
    public void m8888y(String removeKey) {
        SharedPreferences.Editor editorEdit = this.f60759zy.edit();
        editorEdit.remove(removeKey);
        editorEdit.apply();
    }
}
