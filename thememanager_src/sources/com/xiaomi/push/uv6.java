package com.xiaomi.push;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class uv6 extends JSONObject implements InterfaceC5853c {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f73693toq = 2;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f73694zy = 3;

    /* JADX INFO: renamed from: k */
    private final LinkedHashMap<String, Integer> f34010k = new LinkedHashMap<>();

    @Override // com.xiaomi.push.InterfaceC5853c
    /* JADX INFO: renamed from: a */
    public int mo20675a() {
        int iIntValue = f73693toq;
        Iterator<Integer> it = this.f34010k.values().iterator();
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue + (length() - 1);
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, int i2) {
        if (!TextUtils.isEmpty(str)) {
            this.f34010k.put(str, Integer.valueOf(str.length() + String.valueOf(i2).length() + f73694zy));
        }
        return super.put(str, i2);
    }

    @Override // org.json.JSONObject
    public Object remove(String str) {
        this.f34010k.remove(str);
        return super.remove(str);
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, long j2) {
        if (!TextUtils.isEmpty(str)) {
            this.f34010k.put(str, Integer.valueOf(str.length() + String.valueOf(j2).length() + f73694zy));
        }
        return super.put(str, j2);
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, double d2) {
        if (!TextUtils.isEmpty(str)) {
            this.f34010k.put(str, Integer.valueOf(str.length() + String.valueOf(d2).length() + f73694zy));
        }
        return super.put(str, d2);
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, Object obj) throws JSONException {
        JSONObject jSONObjectPut = super.put(str, obj);
        if (!TextUtils.isEmpty(str) && obj != null) {
            if (obj instanceof InterfaceC5853c) {
                this.f34010k.put(str, Integer.valueOf(str.length() + ((InterfaceC5853c) obj).mo20675a() + f73694zy));
            } else {
                this.f34010k.put(str, Integer.valueOf(str.length() + String.valueOf(obj).getBytes(StandardCharsets.UTF_8).length + f73694zy + f73693toq));
            }
        }
        return jSONObjectPut;
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, boolean z2) {
        if (!TextUtils.isEmpty(str)) {
            this.f34010k.put(str, Integer.valueOf(str.length() + String.valueOf(z2).length() + f73694zy));
        }
        return super.put(str, z2);
    }
}
