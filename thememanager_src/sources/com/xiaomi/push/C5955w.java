package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* JADX INFO: renamed from: com.xiaomi.push.w */
/* JADX INFO: loaded from: classes3.dex */
public class C5955w implements oaex<C5955w, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public byte f34066a;

    /* JADX INFO: renamed from: a */
    public int f34067a;

    /* JADX INFO: renamed from: a */
    public String f34068a;

    /* JADX INFO: renamed from: a */
    private BitSet f34069a = new BitSet(6);

    /* JADX INFO: renamed from: b */
    public int f34070b;

    /* JADX INFO: renamed from: b */
    public String f34071b;

    /* JADX INFO: renamed from: c */
    public int f34072c;

    /* JADX INFO: renamed from: c */
    public String f34073c;

    /* JADX INFO: renamed from: d */
    public int f34074d;

    /* JADX INFO: renamed from: d */
    public String f34075d;

    /* JADX INFO: renamed from: e */
    public int f34076e;

    /* JADX INFO: renamed from: k */
    private static final s31 f34058k = new s31("StatsEvent");

    /* JADX INFO: renamed from: q */
    private static final vc f34061q = new vc("", (byte) 3, 1);

    /* JADX INFO: renamed from: n */
    private static final vc f34059n = new vc("", (byte) 8, 2);

    /* JADX INFO: renamed from: g */
    private static final vc f34055g = new vc("", (byte) 8, 3);

    /* JADX INFO: renamed from: y */
    private static final vc f34064y = new vc("", com.google.common.base.zy.f68132qrj, 4);

    /* JADX INFO: renamed from: s */
    private static final vc f34062s = new vc("", com.google.common.base.zy.f68132qrj, 5);

    /* JADX INFO: renamed from: p */
    private static final vc f34060p = new vc("", (byte) 8, 6);

    /* JADX INFO: renamed from: h */
    private static final vc f34056h = new vc("", com.google.common.base.zy.f68132qrj, 7);

    /* JADX INFO: renamed from: i */
    private static final vc f34057i = new vc("", com.google.common.base.zy.f68132qrj, 8);

    /* JADX INFO: renamed from: z */
    private static final vc f34065z = new vc("", (byte) 8, 9);

    /* JADX INFO: renamed from: t */
    private static final vc f34063t = new vc("", (byte) 8, 10);

    /* JADX INFO: renamed from: a */
    public C5955w m21929a(byte b2) {
        this.f34066a = b2;
        m21933a(true);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public boolean m21939b() {
        return this.f34069a.get(1);
    }

    /* JADX INFO: renamed from: c */
    public boolean m21943c() {
        return this.f34069a.get(2);
    }

    /* JADX INFO: renamed from: d */
    public boolean m21947d() {
        return this.f34068a != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m21949e() {
        return this.f34071b != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C5955w)) {
            return m21935a((C5955w) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m21951f() {
        return this.f34069a.get(3);
    }

    /* JADX INFO: renamed from: g */
    public boolean m21952g() {
        return this.f34073c != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m21953h() {
        return this.f34075d != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m21954i() {
        return this.f34069a.get(4);
    }

    /* JADX INFO: renamed from: j */
    public boolean m21955j() {
        return this.f34069a.get(5);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StatsEvent(");
        sb.append("chid:");
        sb.append((int) this.f34066a);
        sb.append(", ");
        sb.append("type:");
        sb.append(this.f34067a);
        sb.append(", ");
        sb.append("value:");
        sb.append(this.f34070b);
        sb.append(", ");
        sb.append("connpt:");
        String str = this.f34068a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (m21949e()) {
            sb.append(", ");
            sb.append("host:");
            String str2 = this.f34071b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        if (m21951f()) {
            sb.append(", ");
            sb.append("subvalue:");
            sb.append(this.f34072c);
        }
        if (m21952g()) {
            sb.append(", ");
            sb.append("annotation:");
            String str3 = this.f34073c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (m21953h()) {
            sb.append(", ");
            sb.append("user:");
            String str4 = this.f34075d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m21954i()) {
            sb.append(", ");
            sb.append("time:");
            sb.append(this.f34074d);
        }
        if (m21955j()) {
            sb.append(", ");
            sb.append("clientIp:");
            sb.append(this.f34076e);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public void m21938b(boolean z2) {
        this.f34069a.set(1, z2);
    }

    /* JADX INFO: renamed from: c */
    public void m21942c(boolean z2) {
        this.f34069a.set(2, z2);
    }

    /* JADX INFO: renamed from: d */
    public void m21946d(boolean z2) {
        this.f34069a.set(3, z2);
    }

    /* JADX INFO: renamed from: e */
    public void m21948e(boolean z2) {
        this.f34069a.set(4, z2);
    }

    /* JADX INFO: renamed from: f */
    public void m21950f(boolean z2) {
        this.f34069a.set(5, z2);
    }

    /* JADX INFO: renamed from: a */
    public boolean m21934a() {
        return this.f34069a.get(0);
    }

    /* JADX INFO: renamed from: b */
    public C5955w m21936b(int i2) {
        this.f34070b = i2;
        m21942c(true);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public C5955w m21940c(int i2) {
        this.f34072c = i2;
        m21946d(true);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C5955w m21945d(String str) {
        this.f34075d = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m21933a(boolean z2) {
        this.f34069a.set(0, z2);
    }

    /* JADX INFO: renamed from: d */
    public C5955w m21944d(int i2) {
        this.f34074d = i2;
        m21948e(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C5955w m21930a(int i2) {
        this.f34067a = i2;
        m21938b(true);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C5955w m21937b(String str) {
        this.f34071b = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public C5955w m21941c(String str) {
        this.f34073c = str;
        return this;
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: b */
    public void mo20561b(ip ipVar) {
        m21932a();
        ipVar.mo20992i(f34058k);
        ipVar.cdj(f34061q);
        ipVar.n7h(this.f34066a);
        ipVar.o1t();
        ipVar.cdj(f34059n);
        ipVar.kja0(this.f34067a);
        ipVar.o1t();
        ipVar.cdj(f34055g);
        ipVar.kja0(this.f34070b);
        ipVar.o1t();
        if (this.f34068a != null) {
            ipVar.cdj(f34064y);
            ipVar.fn3e(this.f34068a);
            ipVar.o1t();
        }
        if (this.f34071b != null && m21949e()) {
            ipVar.cdj(f34062s);
            ipVar.fn3e(this.f34071b);
            ipVar.o1t();
        }
        if (m21951f()) {
            ipVar.cdj(f34060p);
            ipVar.kja0(this.f34072c);
            ipVar.o1t();
        }
        if (this.f34073c != null && m21952g()) {
            ipVar.cdj(f34056h);
            ipVar.fn3e(this.f34073c);
            ipVar.o1t();
        }
        if (this.f34075d != null && m21953h()) {
            ipVar.cdj(f34057i);
            ipVar.fn3e(this.f34075d);
            ipVar.o1t();
        }
        if (m21954i()) {
            ipVar.cdj(f34065z);
            ipVar.kja0(this.f34074d);
            ipVar.o1t();
        }
        if (m21955j()) {
            ipVar.cdj(f34063t);
            ipVar.kja0(this.f34076e);
            ipVar.o1t();
        }
        ipVar.wvg();
        ipVar.qrj();
    }

    /* JADX INFO: renamed from: a */
    public C5955w m21931a(String str) {
        this.f34068a = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m21935a(C5955w c5955w) {
        if (c5955w == null || this.f34066a != c5955w.f34066a || this.f34067a != c5955w.f34067a || this.f34070b != c5955w.f34070b) {
            return false;
        }
        boolean zM21947d = m21947d();
        boolean zM21947d2 = c5955w.m21947d();
        if ((zM21947d || zM21947d2) && !(zM21947d && zM21947d2 && this.f34068a.equals(c5955w.f34068a))) {
            return false;
        }
        boolean zM21949e = m21949e();
        boolean zM21949e2 = c5955w.m21949e();
        if ((zM21949e || zM21949e2) && !(zM21949e && zM21949e2 && this.f34071b.equals(c5955w.f34071b))) {
            return false;
        }
        boolean zM21951f = m21951f();
        boolean zM21951f2 = c5955w.m21951f();
        if ((zM21951f || zM21951f2) && !(zM21951f && zM21951f2 && this.f34072c == c5955w.f34072c)) {
            return false;
        }
        boolean zM21952g = m21952g();
        boolean zM21952g2 = c5955w.m21952g();
        if ((zM21952g || zM21952g2) && !(zM21952g && zM21952g2 && this.f34073c.equals(c5955w.f34073c))) {
            return false;
        }
        boolean zM21953h = m21953h();
        boolean zM21953h2 = c5955w.m21953h();
        if ((zM21953h || zM21953h2) && !(zM21953h && zM21953h2 && this.f34075d.equals(c5955w.f34075d))) {
            return false;
        }
        boolean zM21954i = m21954i();
        boolean zM21954i2 = c5955w.m21954i();
        if ((zM21954i || zM21954i2) && !(zM21954i && zM21954i2 && this.f34074d == c5955w.f34074d)) {
            return false;
        }
        boolean zM21955j = m21955j();
        boolean zM21955j2 = c5955w.m21955j();
        if (zM21955j || zM21955j2) {
            return zM21955j && zM21955j2 && this.f34076e == c5955w.f34076e;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C5955w c5955w) {
        int qVar;
        int qVar2;
        int iM21911n;
        int iM21911n2;
        int qVar3;
        int iM21911n3;
        int iM21911n4;
        int qVar4;
        int qVar5;
        int iM21910k;
        if (!getClass().equals(c5955w.getClass())) {
            return getClass().getName().compareTo(c5955w.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m21934a()).compareTo(Boolean.valueOf(c5955w.m21934a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m21934a() && (iM21910k = vh.m21910k(this.f34066a, c5955w.f34066a)) != 0) {
            return iM21910k;
        }
        int iCompareTo2 = Boolean.valueOf(m21939b()).compareTo(Boolean.valueOf(c5955w.m21939b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m21939b() && (qVar5 = vh.toq(this.f34067a, c5955w.f34067a)) != 0) {
            return qVar5;
        }
        int iCompareTo3 = Boolean.valueOf(m21943c()).compareTo(Boolean.valueOf(c5955w.m21943c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m21943c() && (qVar4 = vh.toq(this.f34070b, c5955w.f34070b)) != 0) {
            return qVar4;
        }
        int iCompareTo4 = Boolean.valueOf(m21947d()).compareTo(Boolean.valueOf(c5955w.m21947d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m21947d() && (iM21911n4 = vh.m21911n(this.f34068a, c5955w.f34068a)) != 0) {
            return iM21911n4;
        }
        int iCompareTo5 = Boolean.valueOf(m21949e()).compareTo(Boolean.valueOf(c5955w.m21949e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m21949e() && (iM21911n3 = vh.m21911n(this.f34071b, c5955w.f34071b)) != 0) {
            return iM21911n3;
        }
        int iCompareTo6 = Boolean.valueOf(m21951f()).compareTo(Boolean.valueOf(c5955w.m21951f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m21951f() && (qVar3 = vh.toq(this.f34072c, c5955w.f34072c)) != 0) {
            return qVar3;
        }
        int iCompareTo7 = Boolean.valueOf(m21952g()).compareTo(Boolean.valueOf(c5955w.m21952g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m21952g() && (iM21911n2 = vh.m21911n(this.f34073c, c5955w.f34073c)) != 0) {
            return iM21911n2;
        }
        int iCompareTo8 = Boolean.valueOf(m21953h()).compareTo(Boolean.valueOf(c5955w.m21953h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m21953h() && (iM21911n = vh.m21911n(this.f34075d, c5955w.f34075d)) != 0) {
            return iM21911n;
        }
        int iCompareTo9 = Boolean.valueOf(m21954i()).compareTo(Boolean.valueOf(c5955w.m21954i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m21954i() && (qVar2 = vh.toq(this.f34074d, c5955w.f34074d)) != 0) {
            return qVar2;
        }
        int iCompareTo10 = Boolean.valueOf(m21955j()).compareTo(Boolean.valueOf(c5955w.m21955j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (!m21955j() || (qVar = vh.toq(this.f34076e, c5955w.f34076e)) == 0) {
            return 0;
        }
        return qVar;
    }

    @Override // com.xiaomi.push.oaex
    /* JADX INFO: renamed from: a */
    public void mo20557a(ip ipVar) {
        ipVar.mo20997s();
        while (true) {
            vc vcVarMo20994n = ipVar.mo20994n();
            byte b2 = vcVarMo20994n.f73703toq;
            if (b2 == 0) {
                ipVar.jk();
                if (m21934a()) {
                    if (m21939b()) {
                        if (m21943c()) {
                            m21932a();
                            return;
                        }
                        throw new dbf("Required field 'value' was not found in serialized data! Struct: " + toString());
                    }
                    throw new dbf("Required field 'type' was not found in serialized data! Struct: " + toString());
                }
                throw new dbf("Required field 'chid' was not found in serialized data! Struct: " + toString());
            }
            switch (vcVarMo20994n.f73704zy) {
                case 1:
                    if (b2 == 3) {
                        this.f34066a = ipVar.mo20993k();
                        m21933a(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 2:
                    if (b2 == 8) {
                        this.f34067a = ipVar.zy();
                        m21938b(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 3:
                    if (b2 == 8) {
                        this.f34070b = ipVar.zy();
                        m21942c(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 4:
                    if (b2 == 11) {
                        this.f34068a = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 5:
                    if (b2 == 11) {
                        this.f34071b = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 6:
                    if (b2 == 8) {
                        this.f34072c = ipVar.zy();
                        m21946d(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 7:
                    if (b2 == 11) {
                        this.f34073c = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 8:
                    if (b2 == 11) {
                        this.f34075d = ipVar.mo20995p();
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 9:
                    if (b2 == 8) {
                        this.f34074d = ipVar.zy();
                        m21948e(true);
                    } else {
                        koj.m21140k(ipVar, b2);
                    }
                    break;
                case 10:
                    if (b2 == 8) {
                        this.f34076e = ipVar.zy();
                        m21950f(true);
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
    public void m21932a() throws dbf {
        if (this.f34068a != null) {
            return;
        }
        throw new dbf("Required field 'connpt' was not present! Struct: " + toString());
    }
}
