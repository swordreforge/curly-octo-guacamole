package com.xiaomi.push;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ngy {

    /* JADX INFO: renamed from: com.xiaomi.push.ngy$k */
    public static final class C5884k extends bz2 {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private boolean f73503f7l8;

        /* JADX INFO: renamed from: k */
        private boolean f33440k;

        /* JADX INFO: renamed from: n */
        private boolean f33441n;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f73505zy;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f73504toq = 0;

        /* JADX INFO: renamed from: q */
        private boolean f33443q = false;

        /* JADX INFO: renamed from: g */
        private int f33439g = 0;

        /* JADX INFO: renamed from: y */
        private boolean f33445y = false;

        /* JADX INFO: renamed from: s */
        private List<String> f33444s = Collections.emptyList();

        /* JADX INFO: renamed from: p */
        private int f33442p = -1;

        public static C5884k ki(jk jkVar) {
            return new C5884k().toq(jkVar);
        }

        public static C5884k n7h(byte[] bArr) {
            return (C5884k) new C5884k().zy(bArr);
        }

        public C5884k cdj(int i2) {
            this.f33441n = true;
            this.f33439g = i2;
            return this;
        }

        public int fn3e() {
            return this.f73504toq;
        }

        public boolean fu4() {
            return this.f33441n;
        }

        /* JADX INFO: renamed from: h */
        public boolean m21318h() {
            return this.f33440k;
        }

        /* JADX INFO: renamed from: i */
        public boolean m21319i() {
            return this.f33443q;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: k */
        public int mo20670k() {
            if (this.f33442p < 0) {
                mo20673s();
            }
            return this.f33442p;
        }

        public List<String> kja0() {
            return this.f33444s;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public C5884k toq(jk jkVar) throws qkj8 {
            while (true) {
                int qVar = jkVar.toq();
                if (qVar == 0) {
                    return this;
                }
                if (qVar == 8) {
                    m21320p(jkVar.fn3e());
                } else if (qVar == 16) {
                    qrj(jkVar.x2());
                } else if (qVar == 24) {
                    cdj(jkVar.m21053h());
                } else if (qVar == 32) {
                    t8r(jkVar.x2());
                } else if (qVar == 42) {
                    x2(jkVar.m21060y());
                } else if (!f7l8(jkVar, qVar)) {
                    return this;
                }
            }
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: n */
        public void mo20671n(C5882m c5882m) {
            if (m21318h()) {
                c5882m.lvui(1, fn3e());
            }
            if (zurt()) {
                c5882m.m21233z(2, m21319i());
            }
            if (fu4()) {
                c5882m.m21229i(3, ni7());
            }
            if (wvg()) {
                c5882m.m21233z(4, o1t());
            }
            Iterator<String> it = kja0().iterator();
            while (it.hasNext()) {
                c5882m.fu4(5, it.next());
            }
        }

        public int ni7() {
            return this.f33439g;
        }

        public boolean o1t() {
            return this.f33445y;
        }

        /* JADX INFO: renamed from: p */
        public C5884k m21320p(int i2) {
            this.f33440k = true;
            this.f73504toq = i2;
            return this;
        }

        public C5884k qrj(boolean z2) {
            this.f73505zy = true;
            this.f33443q = z2;
            return this;
        }

        @Override // com.xiaomi.push.bz2
        /* JADX INFO: renamed from: s */
        public int mo20673s() {
            int iX2 = 0;
            int iGvn7 = m21318h() ? C5882m.gvn7(1, fn3e()) + 0 : 0;
            if (zurt()) {
                iGvn7 += C5882m.m21227y(2, m21319i());
            }
            if (fu4()) {
                iGvn7 += C5882m.zy(3, ni7());
            }
            if (wvg()) {
                iGvn7 += C5882m.m21227y(4, o1t());
            }
            Iterator<String> it = kja0().iterator();
            while (it.hasNext()) {
                iX2 += C5882m.x2(it.next());
            }
            int size = iGvn7 + iX2 + (kja0().size() * 1);
            this.f33442p = size;
            return size;
        }

        public C5884k t8r(boolean z2) {
            this.f73503f7l8 = true;
            this.f33445y = z2;
            return this;
        }

        public boolean wvg() {
            return this.f73503f7l8;
        }

        public C5884k x2(String str) {
            str.getClass();
            if (this.f33444s.isEmpty()) {
                this.f33444s = new ArrayList();
            }
            this.f33444s.add(str);
            return this;
        }

        /* JADX INFO: renamed from: z */
        public int m21321z() {
            return this.f33444s.size();
        }

        public boolean zurt() {
            return this.f73505zy;
        }
    }
}
