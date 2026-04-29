package com.android.thememanager.basemodule.analysis;

import android.text.TextUtils;
import android.util.ArrayMap;
import com.android.thememanager.basemodule.config.C1724k;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.analysis.p */
/* JADX INFO: compiled from: StatsParamUtil.java */
/* JADX INFO: loaded from: classes.dex */
public class C1706p implements toq {
    public static boolean cdj(String str) {
        if (!TextUtils.isEmpty(str)) {
            String strTrim = str.trim();
            if (strTrim.startsWith("{") && strTrim.endsWith("}")) {
                return true;
            }
            if (strTrim.startsWith("[") && strTrim.endsWith("]")) {
                return true;
            }
        }
        return false;
    }

    public static ArrayMap<String, Object> f7l8(String pageId, String trackIds, String extra, String tip) {
        ArrayMap arrayMap = new ArrayMap(7);
        arrayMap.put("pageId", pageId);
        if (!p029m.zy.toq(trackIds)) {
            arrayMap.put("trackId", trackIds);
        }
        if (!p029m.zy.toq(extra)) {
            arrayMap.put("extra", extra);
        }
        if (!p029m.zy.toq(tip)) {
            arrayMap.put("tip", tip);
        }
        return ki(arrayMap);
    }

    /* JADX INFO: renamed from: g */
    public static ArrayMap<String, Object> m6649g(String content, boolean enable) {
        ArrayMap arrayMap = new ArrayMap(6);
        arrayMap.put("content", content);
        arrayMap.put(toq.u0z, Boolean.valueOf(enable));
        arrayMap.put(toq.bmt3, C1807g.f7l8());
        return ki(arrayMap);
    }

    /* JADX INFO: renamed from: h */
    public static ArrayMap<String, Object> m6650h(String pageId, String trackId, String userId, String extra, ArrayMap<String, Object> exParam) {
        ArrayMap arrayMap = new ArrayMap(4);
        arrayMap.put("pageId", pageId);
        arrayMap.put("trackId", trackId);
        if (!p029m.zy.toq(trackId)) {
            arrayMap.putAll((ArrayMap) x2.toq(trackId));
            if (arrayMap.containsKey(toq.c7g)) {
                arrayMap.put(toq.fpn, arrayMap.remove(toq.c7g));
            }
        }
        if (!p029m.zy.toq(extra)) {
            arrayMap.put("extra", extra);
        }
        if (exParam != null) {
            arrayMap.putAll((ArrayMap) exParam);
        }
        return ki(arrayMap);
    }

    /* JADX INFO: renamed from: k */
    public static ArrayMap<String, Object> m6651k(String resourceType, String productId, String hint) {
        ArrayMap arrayMap = new ArrayMap(6);
        arrayMap.put("resourceType", resourceType);
        arrayMap.put("productId", productId);
        arrayMap.put("hint", hint);
        return ki(arrayMap);
    }

    public static ArrayMap<String, Object> ki(ArrayMap<String, Object> exParam) {
        if (!exParam.containsKey("xRef")) {
            exParam.put("xRef", f7l8.m6613s());
        }
        if (!exParam.containsKey("xPrevRef")) {
            exParam.put("xPrevRef", f7l8.m6614y());
        }
        if (!exParam.containsKey("entryType")) {
            exParam.put("entryType", f7l8.m6607g());
        }
        if (!exParam.containsKey(toq.ahb)) {
            exParam.put(toq.ahb, f7l8.f7l8());
        }
        if (!exParam.containsKey("orientation")) {
            exParam.put("orientation", C1819o.ncyb(bf2.toq.toq()) ? toq.ob7 : toq.ht);
        }
        if (!exParam.containsKey(toq.bmt3)) {
            exParam.put(toq.bmt3, C1807g.n7h());
        }
        if (C1807g.zurt()) {
            exParam.put(toq.wtm, C1807g.wvg() ? toq.bp0b : toq.mo);
        }
        if (!exParam.containsKey("exp_id")) {
            String str = C1724k.m6723p().ld6().expIds;
            if (!p029m.zy.toq(str)) {
                exParam.put("exp_id", str);
            }
        }
        return exParam;
    }

    public static ArrayMap<String, Object> kja0(String pageId, String trackId, String extra) {
        return m6650h(pageId, trackId, null, extra, null);
    }

    public static ArrayMap<String, Object> ld6(String content) {
        ArrayMap arrayMap = new ArrayMap(4);
        arrayMap.put("content", content);
        return ki(arrayMap);
    }

    /* JADX INFO: renamed from: n */
    public static ArrayMap<String, Object> m6652n(String pageId, String trackIds, String extra, String deviceType) {
        ArrayMap arrayMap = new ArrayMap(7);
        arrayMap.put("pageId", pageId);
        if (!p029m.zy.toq(trackIds)) {
            arrayMap.put("trackId", trackIds);
        }
        if (!p029m.zy.toq(extra)) {
            arrayMap.put("extra", extra);
        }
        if (!p029m.zy.toq(deviceType)) {
            arrayMap.put(toq.bmt3, deviceType);
        }
        return ki(arrayMap);
    }

    public static ArrayMap<String, Object> n7h(String pageId, String trackId, ArrayMap<String, Object> exParam) {
        return m6650h(pageId, trackId, null, null, exParam);
    }

    /* JADX INFO: renamed from: p */
    public static ArrayMap<String, Object> m6653p(String page, String enterType) {
        ArrayMap arrayMap = new ArrayMap(5);
        arrayMap.put("pageId", page);
        arrayMap.put("entryType", enterType);
        return ki(arrayMap);
    }

    /* JADX INFO: renamed from: q */
    public static ArrayMap<String, Object> m6654q(String pageId, String trackIds, String extra) {
        ArrayMap arrayMap = new ArrayMap(6);
        arrayMap.put("pageId", pageId);
        if (!p029m.zy.toq(trackIds)) {
            arrayMap.put("trackId", trackIds);
        }
        if (!p029m.zy.toq(extra)) {
            arrayMap.put("extra", extra);
        }
        return ki(arrayMap);
    }

    public static ArrayMap<String, Object> qrj(String content, boolean hasLogin) {
        ArrayMap arrayMap = new ArrayMap(4);
        arrayMap.put("content", content);
        arrayMap.put(toq.ff8y, Boolean.valueOf(hasLogin));
        return ki(arrayMap);
    }

    /* JADX INFO: renamed from: s */
    public static ArrayMap<String, Object> m6655s(String page) {
        ArrayMap arrayMap = new ArrayMap(4);
        arrayMap.put("pageId", page);
        return ki(arrayMap);
    }

    public static ArrayMap<String, Object> toq(String content, String productId) {
        ArrayMap arrayMap = new ArrayMap(5);
        arrayMap.put("content", content);
        arrayMap.put("productId", productId);
        return ki(arrayMap);
    }

    public static ArrayMap<String, Object> x2(String pageId, String trackIds, String extra, String deviceType) {
        ArrayMap arrayMap = new ArrayMap(7);
        arrayMap.put("pageId", pageId);
        if (!p029m.zy.toq(trackIds)) {
            arrayMap.put("trackId", trackIds);
        }
        if (!p029m.zy.toq(extra)) {
            arrayMap.put("extra", extra);
        }
        if (!p029m.zy.toq(deviceType)) {
            arrayMap.put(toq.bmt3, deviceType);
        }
        return ki(arrayMap);
    }

    /* JADX INFO: renamed from: y */
    public static ArrayMap<String, Object> m6656y(String resourceType, String productId) {
        ArrayMap arrayMap = new ArrayMap(5);
        arrayMap.put("resourceType", resourceType);
        arrayMap.put("productId", productId);
        return ki(arrayMap);
    }

    public static ArrayMap<String, Object> zy(String content) {
        ArrayMap arrayMap = new ArrayMap(5);
        arrayMap.put("content", content);
        arrayMap.put(toq.bmt3, C1807g.f7l8());
        return ki(arrayMap);
    }
}
