package com.bumptech.glide.load.model;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zy.dd;
import zy.lvui;
import zy.yz;

/* JADX INFO: compiled from: LazyHeaders.java */
/* JADX INFO: loaded from: classes2.dex */
public final class ld6 implements InterfaceC3071s {

    /* JADX INFO: renamed from: q */
    private volatile Map<String, String> f18595q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Map<String, List<InterfaceC3069p>> f62841zy;

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.ld6$k */
    /* JADX INFO: compiled from: LazyHeaders.java */
    public static final class C3064k {

        /* JADX INFO: renamed from: g */
        private static final Map<String, List<InterfaceC3069p>> f18596g;

        /* JADX INFO: renamed from: n */
        private static final String f18597n;

        /* JADX INFO: renamed from: q */
        private static final String f18598q = "User-Agent";

        /* JADX INFO: renamed from: k */
        private boolean f18599k = true;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private Map<String, List<InterfaceC3069p>> f62842toq = f18596g;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f62843zy = true;

        static {
            String strF7l8 = f7l8();
            f18597n = strF7l8;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strF7l8)) {
                map.put("User-Agent", Collections.singletonList(new toq(strF7l8)));
            }
            f18596g = Collections.unmodifiableMap(map);
        }

        @yz
        static String f7l8() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = property.charAt(i2);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb.append(cCharAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        /* JADX INFO: renamed from: g */
        private List<InterfaceC3069p> m10876g(String str) {
            List<InterfaceC3069p> list = this.f62842toq.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.f62842toq.put(str, arrayList);
            return arrayList;
        }

        /* JADX INFO: renamed from: n */
        private void m10877n() {
            if (this.f18599k) {
                this.f18599k = false;
                this.f62842toq = m10878q();
            }
        }

        /* JADX INFO: renamed from: q */
        private Map<String, List<InterfaceC3069p>> m10878q() {
            HashMap map = new HashMap(this.f62842toq.size());
            for (Map.Entry<String, List<InterfaceC3069p>> entry : this.f62842toq.entrySet()) {
                map.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
            return map;
        }

        /* JADX INFO: renamed from: k */
        public C3064k m10879k(@lvui String str, @lvui InterfaceC3069p interfaceC3069p) {
            if (this.f62843zy && "User-Agent".equalsIgnoreCase(str)) {
                return m10881y(str, interfaceC3069p);
            }
            m10877n();
            m10876g(str).add(interfaceC3069p);
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C3064k m10880s(@lvui String str, @dd String str2) {
            return m10881y(str, str2 == null ? null : new toq(str2));
        }

        public C3064k toq(@lvui String str, @lvui String str2) {
            return m10879k(str, new toq(str2));
        }

        /* JADX INFO: renamed from: y */
        public C3064k m10881y(@lvui String str, @dd InterfaceC3069p interfaceC3069p) {
            m10877n();
            if (interfaceC3069p == null) {
                this.f62842toq.remove(str);
            } else {
                List<InterfaceC3069p> listM10876g = m10876g(str);
                listM10876g.clear();
                listM10876g.add(interfaceC3069p);
            }
            if (this.f62843zy && "User-Agent".equalsIgnoreCase(str)) {
                this.f62843zy = false;
            }
            return this;
        }

        public ld6 zy() {
            this.f18599k = true;
            return new ld6(this.f62842toq);
        }
    }

    /* JADX INFO: compiled from: LazyHeaders.java */
    static final class toq implements InterfaceC3069p {

        /* JADX INFO: renamed from: k */
        @lvui
        private final String f18600k;

        toq(@lvui String str) {
            this.f18600k = str;
        }

        public boolean equals(Object obj) {
            if (obj instanceof toq) {
                return this.f18600k.equals(((toq) obj).f18600k);
            }
            return false;
        }

        public int hashCode() {
            return this.f18600k.hashCode();
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3069p
        /* JADX INFO: renamed from: k */
        public String mo10882k() {
            return this.f18600k;
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f18600k + "'}";
        }
    }

    ld6(Map<String, List<InterfaceC3069p>> map) {
        this.f62841zy = Collections.unmodifiableMap(map);
    }

    @lvui
    private String toq(@lvui List<InterfaceC3069p> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strMo10882k = list.get(i2).mo10882k();
            if (!TextUtils.isEmpty(strMo10882k)) {
                sb.append(strMo10882k);
                if (i2 != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    private Map<String, String> zy() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<InterfaceC3069p>> entry : this.f62841zy.entrySet()) {
            String qVar = toq(entry.getValue());
            if (!TextUtils.isEmpty(qVar)) {
                map.put(entry.getKey(), qVar);
            }
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ld6) {
            return this.f62841zy.equals(((ld6) obj).f62841zy);
        }
        return false;
    }

    public int hashCode() {
        return this.f62841zy.hashCode();
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3071s
    /* JADX INFO: renamed from: k */
    public Map<String, String> mo10875k() {
        if (this.f18595q == null) {
            synchronized (this) {
                if (this.f18595q == null) {
                    this.f18595q = Collections.unmodifiableMap(zy());
                }
            }
        }
        return this.f18595q;
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f62841zy + '}';
    }
}
