package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ge implements oaex<ge, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public int f32979a;

    /* JADX INFO: renamed from: a */
    public long f32980a;

    /* JADX INFO: renamed from: a */
    public String f32981a;

    /* JADX INFO: renamed from: a */
    private BitSet f32982a;

    /* JADX INFO: renamed from: a */
    public Map<String, String> f32983a;

    /* JADX INFO: renamed from: a */
    public boolean f32984a;

    /* JADX INFO: renamed from: b */
    public int f32985b;

    /* JADX INFO: renamed from: b */
    public String f32986b;

    /* JADX INFO: renamed from: b */
    public Map<String, String> f32987b;

    /* JADX INFO: renamed from: c */
    public int f32988c;

    /* JADX INFO: renamed from: c */
    public String f32989c;

    /* JADX INFO: renamed from: c */
    public Map<String, String> f32990c;

    /* JADX INFO: renamed from: d */
    public String f32991d;

    /* JADX INFO: renamed from: e */
    public String f32992e;

    /* JADX INFO: renamed from: k */
    private static final s31 f32969k = new s31("PushMetaInfo");

    /* JADX INFO: renamed from: q */
    private static final vc f32973q = new vc("", com.google.common.base.zy.f68132qrj, 1);

    /* JADX INFO: renamed from: n */
    private static final vc f32971n = new vc("", (byte) 10, 2);

    /* JADX INFO: renamed from: g */
    private static final vc f32966g = new vc("", com.google.common.base.zy.f68132qrj, 3);

    /* JADX INFO: renamed from: y */
    private static final vc f32977y = new vc("", com.google.common.base.zy.f68132qrj, 4);

    /* JADX INFO: renamed from: s */
    private static final vc f32975s = new vc("", com.google.common.base.zy.f68132qrj, 5);

    /* JADX INFO: renamed from: p */
    private static final vc f32972p = new vc("", (byte) 8, 6);

    /* JADX INFO: renamed from: h */
    private static final vc f32967h = new vc("", com.google.common.base.zy.f68132qrj, 7);

    /* JADX INFO: renamed from: i */
    private static final vc f32968i = new vc("", (byte) 8, 8);

    /* JADX INFO: renamed from: z */
    private static final vc f32978z = new vc("", (byte) 8, 9);

    /* JADX INFO: renamed from: t */
    private static final vc f32976t = new vc("", com.google.common.base.zy.f68124kja0, 10);

    /* JADX INFO: renamed from: r */
    private static final vc f32974r = new vc("", com.google.common.base.zy.f68124kja0, 11);

    /* JADX INFO: renamed from: l */
    private static final vc f32970l = new vc("", (byte) 2, 12);

    /* JADX INFO: renamed from: f */
    private static final vc f32965f = new vc("", com.google.common.base.zy.f68124kja0, 13);

    public ge() {
        this.f32982a = new BitSet(5);
        this.f32984a = false;
    }

    /* JADX INFO: renamed from: a */
    public ge m20902a() {
        return new ge(this);
    }

    /* JADX INFO: renamed from: b */
    public boolean m20920b() {
        return this.f32982a.get(0);
    }

    /* JADX INFO: renamed from: c */
    public boolean m20926c() {
        return this.f32986b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m20930d() {
        return this.f32989c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m20932e() {
        return this.f32991d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ge)) {
            return m20912a((ge) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m20933f() {
        return this.f32982a.get(1);
    }

    /* JADX INFO: renamed from: g */
    public boolean m20934g() {
        return this.f32992e != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m20935h() {
        return this.f32982a.get(2);
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m20936i() {
        return this.f32982a.get(3);
    }

    /* JADX INFO: renamed from: j */
    public boolean m20937j() {
        return this.f32983a != null;
    }

    /* JADX INFO: renamed from: k */
    public boolean m20938k() {
        return this.f32987b != null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m20939l() {
        return this.f32984a;
    }

    /* JADX INFO: renamed from: m */
    public boolean m20940m() {
        return this.f32982a.get(4);
    }

    /* JADX INFO: renamed from: n */
    public boolean m20941n() {
        return this.f32990c != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PushMetaInfo(");
        sb.append("id:");
        String str = this.f32981a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(com.xiaomi.push.service.gvn7.toq(str));
        }
        sb.append(", ");
        sb.append("messageTs:");
        sb.append(this.f32980a);
        if (m20926c()) {
            sb.append(", ");
            sb.append("topic:");
            String str2 = this.f32986b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        if (m20930d()) {
            sb.append(", ");
            sb.append("title:");
            String str3 = this.f32989c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (m20932e()) {
            sb.append(", ");
            sb.append("description:");
            String str4 = this.f32991d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m20933f()) {
            sb.append(", ");
            sb.append("notifyType:");
            sb.append(this.f32979a);
        }
        if (m20934g()) {
            sb.append(", ");
            sb.append("url:");
            String str5 = this.f32992e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m20935h()) {
            sb.append(", ");
            sb.append("passThrough:");
            sb.append(this.f32985b);
        }
        if (m20936i()) {
            sb.append(", ");
            sb.append("notifyId:");
            sb.append(this.f32988c);
        }
        if (m20937j()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f32983a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (m20938k()) {
            sb.append(", ");
            sb.append("internal:");
            Map<String, String> map2 = this.f32987b;
            if (map2 == null) {
                sb.append("null");
            } else {
                sb.append(map2);
            }
        }
        if (m20940m()) {
            sb.append(", ");
            sb.append("ignoreRegInfo:");
            sb.append(this.f32984a);
        }
        if (m20941n()) {
            sb.append(", ");
            sb.append("apsProperFields:");
            Map<String, String> map3 = this.f32990c;
            if (map3 == null) {
                sb.append("null");
            } else {
                sb.append(map3);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public String m20906a() {
        return this.f32981a;
    }

    /* JADX INFO: renamed from: b */
    public String m20916b() {
        return this.f32986b;
    }

    /* JADX INFO: renamed from: c */
    public String m20924c() {
        return this.f32989c;
    }

    /* JADX INFO: renamed from: d */
    public String m20928d() {
        return this.f32991d;
    }

    /* JADX INFO: renamed from: e */
    public void m20931e(boolean z2) {
        this.f32982a.set(4, z2);
    }

    /* JADX INFO: renamed from: a */
    public ge m20904a(String str) {
        this.f32981a = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public ge m20915b(String str) {
        this.f32986b = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public ge m20923c(String str) {
        this.f32989c = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public ge m20927d(String str) {
        this.f32991d = str;
        return this;
    }

    public ge(ge geVar) {
        BitSet bitSet = new BitSet(5);
        this.f32982a = bitSet;
        bitSet.clear();
        this.f32982a.or(geVar.f32982a);
        if (geVar.m20911a()) {
            this.f32981a = geVar.f32981a;
        }
        this.f32980a = geVar.f32980a;
        if (geVar.m20926c()) {
            this.f32986b = geVar.f32986b;
        }
        if (geVar.m20930d()) {
            this.f32989c = geVar.f32989c;
        }
        if (geVar.m20932e()) {
            this.f32991d = geVar.f32991d;
        }
        this.f32979a = geVar.f32979a;
        if (geVar.m20934g()) {
            this.f32992e = geVar.f32992e;
        }
        this.f32985b = geVar.f32985b;
        this.f32988c = geVar.f32988c;
        if (geVar.m20937j()) {
            HashMap map = new HashMap();
            for (Map.Entry<String, String> entry : geVar.f32983a.entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
            this.f32983a = map;
        }
        if (geVar.m20938k()) {
            HashMap map2 = new HashMap();
            for (Map.Entry<String, String> entry2 : geVar.f32987b.entrySet()) {
                map2.put(entry2.getKey(), entry2.getValue());
            }
            this.f32987b = map2;
        }
        this.f32984a = geVar.f32984a;
        if (geVar.m20941n()) {
            HashMap map3 = new HashMap();
            for (Map.Entry<String, String> entry3 : geVar.f32990c.entrySet()) {
                map3.put(entry3.getKey(), entry3.getValue());
            }
            this.f32990c = map3;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m20911a() {
        return this.f32981a != null;
    }

    /* JADX INFO: renamed from: b */
    public void m20919b(boolean z2) {
        this.f32982a.set(1, z2);
    }

    /* JADX INFO: renamed from: c */
    public void m20925c(boolean z2) {
        this.f32982a.set(2, z2);
    }

    /* JADX INFO: renamed from: d */
    public void m20929d(boolean z2) {
        this.f32982a.set(3, z2);
    }

    /* JADX INFO: renamed from: a */
    public long m20901a() {
        return this.f32980a;
    }

    /* JADX INFO: renamed from: b */
    public int m20913b() {
        return this.f32985b;
    }

    /* JADX INFO: renamed from: c */
    public int m20921c() {
        return this.f32988c;
    }

    /* JADX INFO: renamed from: a */
    public void m20910a(boolean z2) {
        this.f32982a.set(0, z2);
    }

    /* JADX INFO: renamed from: b */
    public ge m20914b(int i2) {
        this.f32985b = i2;
        m20925c(true);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public ge m20922c(int i2) {
        this.f32988c = i2;
        m20929d(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public int m20899a() {
        return this.f32979a;
    }

    /* JADX INFO: renamed from: a */
    public ge m20903a(int i2) {
        this.f32979a = i2;
        m20919b(true);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m20918b(String str, String str2) {
        if (this.f32987b == null) {
            this.f32987b = new HashMap();
        }
        this.f32987b.put(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public void m20909a(String str, String str2) {
        if (this.f32983a == null) {
            this.f32983a = new HashMap();
        }
        this.f32983a.put(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public Map<String, String> m20917b() {
        return this.f32987b;
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: b */
    public void mo20561b(ip ipVar) throws dbf {
        m20908a();
        ipVar.mo20992i(f32969k);
        if (this.f32981a != null) {
            ipVar.cdj(f32973q);
            ipVar.fn3e(this.f32981a);
            ipVar.o1t();
        }
        ipVar.cdj(f32971n);
        ipVar.mo20991h(this.f32980a);
        ipVar.o1t();
        if (this.f32986b != null && m20926c()) {
            ipVar.cdj(f32966g);
            ipVar.fn3e(this.f32986b);
            ipVar.o1t();
        }
        if (this.f32989c != null && m20930d()) {
            ipVar.cdj(f32977y);
            ipVar.fn3e(this.f32989c);
            ipVar.o1t();
        }
        if (this.f32991d != null && m20932e()) {
            ipVar.cdj(f32975s);
            ipVar.fn3e(this.f32991d);
            ipVar.o1t();
        }
        if (m20933f()) {
            ipVar.cdj(f32972p);
            ipVar.kja0(this.f32979a);
            ipVar.o1t();
        }
        if (this.f32992e != null && m20934g()) {
            ipVar.cdj(f32967h);
            ipVar.fn3e(this.f32992e);
            ipVar.o1t();
        }
        if (m20935h()) {
            ipVar.cdj(f32968i);
            ipVar.kja0(this.f32985b);
            ipVar.o1t();
        }
        if (m20936i()) {
            ipVar.cdj(f32978z);
            ipVar.kja0(this.f32988c);
            ipVar.o1t();
        }
        if (this.f32983a != null && m20937j()) {
            ipVar.cdj(f32976t);
            ipVar.t8r(new ap23(com.google.common.base.zy.f68132qrj, com.google.common.base.zy.f68132qrj, this.f32983a.size()));
            for (Map.Entry<String, String> entry : this.f32983a.entrySet()) {
                ipVar.fn3e(entry.getKey());
                ipVar.fn3e(entry.getValue());
            }
            ipVar.mo20998t();
            ipVar.o1t();
        }
        if (this.f32987b != null && m20938k()) {
            ipVar.cdj(f32974r);
            ipVar.t8r(new ap23(com.google.common.base.zy.f68132qrj, com.google.common.base.zy.f68132qrj, this.f32987b.size()));
            for (Map.Entry<String, String> entry2 : this.f32987b.entrySet()) {
                ipVar.fn3e(entry2.getKey());
                ipVar.fn3e(entry2.getValue());
            }
            ipVar.mo20998t();
            ipVar.o1t();
        }
        if (m20940m()) {
            ipVar.cdj(f32970l);
            ipVar.fu4(this.f32984a);
            ipVar.o1t();
        }
        if (this.f32990c != null && m20941n()) {
            ipVar.cdj(f32965f);
            ipVar.t8r(new ap23(com.google.common.base.zy.f68132qrj, com.google.common.base.zy.f68132qrj, this.f32990c.size()));
            for (Map.Entry<String, String> entry3 : this.f32990c.entrySet()) {
                ipVar.fn3e(entry3.getKey());
                ipVar.fn3e(entry3.getValue());
            }
            ipVar.mo20998t();
            ipVar.o1t();
        }
        ipVar.wvg();
        ipVar.qrj();
    }

    /* JADX INFO: renamed from: a */
    public Map<String, String> m20907a() {
        return this.f32983a;
    }

    /* JADX INFO: renamed from: a */
    public ge m20905a(Map<String, String> map) {
        this.f32983a = map;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m20912a(ge geVar) {
        if (geVar == null) {
            return false;
        }
        boolean zM20911a = m20911a();
        boolean zM20911a2 = geVar.m20911a();
        if (((zM20911a || zM20911a2) && !(zM20911a && zM20911a2 && this.f32981a.equals(geVar.f32981a))) || this.f32980a != geVar.f32980a) {
            return false;
        }
        boolean zM20926c = m20926c();
        boolean zM20926c2 = geVar.m20926c();
        if ((zM20926c || zM20926c2) && !(zM20926c && zM20926c2 && this.f32986b.equals(geVar.f32986b))) {
            return false;
        }
        boolean zM20930d = m20930d();
        boolean zM20930d2 = geVar.m20930d();
        if ((zM20930d || zM20930d2) && !(zM20930d && zM20930d2 && this.f32989c.equals(geVar.f32989c))) {
            return false;
        }
        boolean zM20932e = m20932e();
        boolean zM20932e2 = geVar.m20932e();
        if ((zM20932e || zM20932e2) && !(zM20932e && zM20932e2 && this.f32991d.equals(geVar.f32991d))) {
            return false;
        }
        boolean zM20933f = m20933f();
        boolean zM20933f2 = geVar.m20933f();
        if ((zM20933f || zM20933f2) && !(zM20933f && zM20933f2 && this.f32979a == geVar.f32979a)) {
            return false;
        }
        boolean zM20934g = m20934g();
        boolean zM20934g2 = geVar.m20934g();
        if ((zM20934g || zM20934g2) && !(zM20934g && zM20934g2 && this.f32992e.equals(geVar.f32992e))) {
            return false;
        }
        boolean zM20935h = m20935h();
        boolean zM20935h2 = geVar.m20935h();
        if ((zM20935h || zM20935h2) && !(zM20935h && zM20935h2 && this.f32985b == geVar.f32985b)) {
            return false;
        }
        boolean zM20936i = m20936i();
        boolean zM20936i2 = geVar.m20936i();
        if ((zM20936i || zM20936i2) && !(zM20936i && zM20936i2 && this.f32988c == geVar.f32988c)) {
            return false;
        }
        boolean zM20937j = m20937j();
        boolean zM20937j2 = geVar.m20937j();
        if ((zM20937j || zM20937j2) && !(zM20937j && zM20937j2 && this.f32983a.equals(geVar.f32983a))) {
            return false;
        }
        boolean zM20938k = m20938k();
        boolean zM20938k2 = geVar.m20938k();
        if ((zM20938k || zM20938k2) && !(zM20938k && zM20938k2 && this.f32987b.equals(geVar.f32987b))) {
            return false;
        }
        boolean zM20940m = m20940m();
        boolean zM20940m2 = geVar.m20940m();
        if ((zM20940m || zM20940m2) && !(zM20940m && zM20940m2 && this.f32984a == geVar.f32984a)) {
            return false;
        }
        boolean zM20941n = m20941n();
        boolean zM20941n2 = geVar.m20941n();
        if (zM20941n || zM20941n2) {
            return zM20941n && zM20941n2 && this.f32990c.equals(geVar.f32990c);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ge geVar) {
        int iM21915y;
        int iLd6;
        int iM21915y2;
        int iM21915y3;
        int qVar;
        int qVar2;
        int iM21911n;
        int qVar3;
        int iM21911n2;
        int iM21911n3;
        int iM21911n4;
        int iZy;
        int iM21911n5;
        if (!getClass().equals(geVar.getClass())) {
            return getClass().getName().compareTo(geVar.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m20911a()).compareTo(Boolean.valueOf(geVar.m20911a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m20911a() && (iM21911n5 = vh.m21911n(this.f32981a, geVar.f32981a)) != 0) {
            return iM21911n5;
        }
        int iCompareTo2 = Boolean.valueOf(m20920b()).compareTo(Boolean.valueOf(geVar.m20920b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m20920b() && (iZy = vh.zy(this.f32980a, geVar.f32980a)) != 0) {
            return iZy;
        }
        int iCompareTo3 = Boolean.valueOf(m20926c()).compareTo(Boolean.valueOf(geVar.m20926c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m20926c() && (iM21911n4 = vh.m21911n(this.f32986b, geVar.f32986b)) != 0) {
            return iM21911n4;
        }
        int iCompareTo4 = Boolean.valueOf(m20930d()).compareTo(Boolean.valueOf(geVar.m20930d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m20930d() && (iM21911n3 = vh.m21911n(this.f32989c, geVar.f32989c)) != 0) {
            return iM21911n3;
        }
        int iCompareTo5 = Boolean.valueOf(m20932e()).compareTo(Boolean.valueOf(geVar.m20932e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m20932e() && (iM21911n2 = vh.m21911n(this.f32991d, geVar.f32991d)) != 0) {
            return iM21911n2;
        }
        int iCompareTo6 = Boolean.valueOf(m20933f()).compareTo(Boolean.valueOf(geVar.m20933f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m20933f() && (qVar3 = vh.toq(this.f32979a, geVar.f32979a)) != 0) {
            return qVar3;
        }
        int iCompareTo7 = Boolean.valueOf(m20934g()).compareTo(Boolean.valueOf(geVar.m20934g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m20934g() && (iM21911n = vh.m21911n(this.f32992e, geVar.f32992e)) != 0) {
            return iM21911n;
        }
        int iCompareTo8 = Boolean.valueOf(m20935h()).compareTo(Boolean.valueOf(geVar.m20935h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m20935h() && (qVar2 = vh.toq(this.f32985b, geVar.f32985b)) != 0) {
            return qVar2;
        }
        int iCompareTo9 = Boolean.valueOf(m20936i()).compareTo(Boolean.valueOf(geVar.m20936i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m20936i() && (qVar = vh.toq(this.f32988c, geVar.f32988c)) != 0) {
            return qVar;
        }
        int iCompareTo10 = Boolean.valueOf(m20937j()).compareTo(Boolean.valueOf(geVar.m20937j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (m20937j() && (iM21915y3 = vh.m21915y(this.f32983a, geVar.f32983a)) != 0) {
            return iM21915y3;
        }
        int iCompareTo11 = Boolean.valueOf(m20938k()).compareTo(Boolean.valueOf(geVar.m20938k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (m20938k() && (iM21915y2 = vh.m21915y(this.f32987b, geVar.f32987b)) != 0) {
            return iM21915y2;
        }
        int iCompareTo12 = Boolean.valueOf(m20940m()).compareTo(Boolean.valueOf(geVar.m20940m()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (m20940m() && (iLd6 = vh.ld6(this.f32984a, geVar.f32984a)) != 0) {
            return iLd6;
        }
        int iCompareTo13 = Boolean.valueOf(m20941n()).compareTo(Boolean.valueOf(geVar.m20941n()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (!m20941n() || (iM21915y = vh.m21915y(this.f32990c, geVar.f32990c)) == 0) {
            return 0;
        }
        return iM21915y;
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: a */
    public void mo20557a(ip ipVar) throws dbf {
        ipVar.mo20997s();
        while (true) {
            vc vcVarMo20994n = ipVar.mo20994n();
            byte b2 = vcVarMo20994n.f73703toq;
            if (b2 == 0) {
                ipVar.jk();
                if (m20920b()) {
                    m20908a();
                    return;
                }
                throw new dbf("Required field 'messageTs' was not found in serialized data! Struct: " + toString());
            }
            int i2 = 0;
            switch (vcVarMo20994n.f73704zy) {
                case 1:
                    if (b2 == 11) {
                        this.f32981a = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 10) {
                        this.f32980a = ipVar.mo20996q();
                        m20910a(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 11) {
                        this.f32986b = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f32989c = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f32991d = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 6:
                    if (b2 == 8) {
                        this.f32979a = ipVar.zy();
                        m20919b(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f32992e = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 8) {
                        this.f32985b = ipVar.zy();
                        m20925c(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 9:
                    if (b2 == 8) {
                        this.f32988c = ipVar.zy();
                        m20929d(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 10:
                    if (b2 == 13) {
                        ap23 ap23VarF7l8 = ipVar.f7l8();
                        this.f32983a = new HashMap(ap23VarF7l8.f73265zy * 2);
                        while (i2 < ap23VarF7l8.f73265zy) {
                            this.f32983a.put(ipVar.mo20995p(), ipVar.mo20995p());
                            i2++;
                        }
                        ipVar.fti();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 11:
                    if (b2 == 13) {
                        ap23 ap23VarF7l82 = ipVar.f7l8();
                        this.f32987b = new HashMap(ap23VarF7l82.f73265zy * 2);
                        while (i2 < ap23VarF7l82.f73265zy) {
                            this.f32987b.put(ipVar.mo20995p(), ipVar.mo20995p());
                            i2++;
                        }
                        ipVar.fti();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 12:
                    if (b2 == 2) {
                        this.f32984a = ipVar.mo21000z();
                        m20931e(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 13:
                    if (b2 == 13) {
                        ap23 ap23VarF7l83 = ipVar.f7l8();
                        this.f32990c = new HashMap(ap23VarF7l83.f73265zy * 2);
                        while (i2 < ap23VarF7l83.f73265zy) {
                            this.f32990c.put(ipVar.mo20995p(), ipVar.mo20995p());
                            i2++;
                        }
                        ipVar.fti();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                default:
                    koj.m21140k(ipVar, b2);
                    break;
            }
            ipVar.a9();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m20908a() throws dbf {
        if (this.f32981a != null) {
            return;
        }
        throw new dbf("Required field 'id' was not present! Struct: " + toString());
    }
}
