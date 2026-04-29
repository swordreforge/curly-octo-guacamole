package ch;

import ek5k.C6002g;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import miuix.core.util.C7083n;
import org.json.JSONException;
import org.json.JSONObject;
import zy.dd;

/* JADX INFO: compiled from: KVPreference.java */
/* JADX INFO: loaded from: classes.dex */
public class zy implements InterfaceC1395k {

    /* JADX INFO: renamed from: k */
    private String f7680k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private JSONObject f55678toq;

    public zy(String filePath) {
        this.f7680k = filePath;
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                C7083n.kja0(filePath, "{}");
            }
            this.f55678toq = new JSONObject(C7083n.qrj(filePath));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: k */
    private String m5863k(String key) {
        if (this.f55678toq == null || !contains(key)) {
            return null;
        }
        try {
            return (String) this.f55678toq.get(key);
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private InterfaceC1395k toq(String key, String content) {
        JSONObject jSONObject = this.f55678toq;
        if (jSONObject != null) {
            try {
                jSONObject.put(key, content);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return this;
    }

    private InterfaceC1395k zy(String key) {
        JSONObject jSONObject = this.f55678toq;
        if (jSONObject != null) {
            jSONObject.remove(key);
        }
        return this;
    }

    @Override // ch.InterfaceC1395k
    public void apply() {
        C6002g.m22240g(new Runnable() { // from class: ch.toq
            @Override // java.lang.Runnable
            public final void run() {
                this.f7679k.commit();
            }
        });
    }

    @Override // ch.InterfaceC1395k
    public void commit() {
        JSONObject jSONObject = this.f55678toq;
        if (jSONObject == null) {
            return;
        }
        synchronized (jSONObject) {
            try {
                C7083n.kja0(this.f7680k, this.f55678toq.toString());
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // ch.InterfaceC1395k
    public boolean contains(String key) {
        JSONObject jSONObject = this.f55678toq;
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.has(key);
    }

    @Override // ch.InterfaceC1395k
    public boolean getBoolean(String key, boolean defValue) {
        String strM5863k = m5863k(key);
        if (strM5863k == null) {
            return defValue;
        }
        try {
            return Boolean.parseBoolean(strM5863k);
        } catch (Exception unused) {
            return defValue;
        }
    }

    @Override // ch.InterfaceC1395k
    public int getInt(String key, int defValue) {
        String strM5863k = m5863k(key);
        if (strM5863k == null) {
            return defValue;
        }
        try {
            return Integer.parseInt(strM5863k);
        } catch (Exception unused) {
            return defValue;
        }
    }

    @Override // ch.InterfaceC1395k
    public long getLong(String key, long defValue) {
        String strM5863k = m5863k(key);
        if (strM5863k == null) {
            return defValue;
        }
        try {
            return Long.parseLong(strM5863k);
        } catch (Exception unused) {
            return defValue;
        }
    }

    @Override // ch.InterfaceC1395k
    public String getString(String key, String defValue) {
        String strM5863k = m5863k(key);
        return strM5863k == null ? defValue : strM5863k;
    }

    @Override // ch.InterfaceC1395k
    @dd
    public Iterator<String> keySet() {
        JSONObject jSONObject = this.f55678toq;
        if (jSONObject != null) {
            return jSONObject.keys();
        }
        return null;
    }

    @Override // ch.InterfaceC1395k
    public InterfaceC1395k putBoolean(String key, boolean value) {
        return toq(key, value + "");
    }

    @Override // ch.InterfaceC1395k
    public InterfaceC1395k putInt(String key, int value) {
        return toq(key, value + "");
    }

    @Override // ch.InterfaceC1395k
    public InterfaceC1395k putLong(String key, long value) {
        return toq(key, value + "");
    }

    @Override // ch.InterfaceC1395k
    public InterfaceC1395k putString(String key, String value) {
        return toq(key, value);
    }

    @Override // ch.InterfaceC1395k
    public InterfaceC1395k remove(String key) {
        return zy(key);
    }

    @Override // ch.InterfaceC1395k
    public int size() {
        JSONObject jSONObject = this.f55678toq;
        if (jSONObject != null) {
            return jSONObject.length();
        }
        return 0;
    }
}
