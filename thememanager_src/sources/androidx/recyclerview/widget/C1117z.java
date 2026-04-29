package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1084k;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.z */
/* JADX INFO: compiled from: OpReorderer.java */
/* JADX INFO: loaded from: classes.dex */
class C1117z {

    /* JADX INFO: renamed from: k */
    final k f6124k;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.z$k */
    /* JADX INFO: compiled from: OpReorderer.java */
    interface k {
        /* JADX INFO: renamed from: k */
        C1084k.toq mo5000k(int i2, int i3, int i4, Object obj);

        void toq(C1084k.toq toqVar);
    }

    C1117z(k kVar) {
        this.f6124k = kVar;
    }

    /* JADX INFO: renamed from: k */
    private int m5134k(List<C1084k.toq> list) {
        boolean z2 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f5890k != 8) {
                z2 = true;
            } else if (z2) {
                return size;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: q */
    private void m5135q(List<C1084k.toq> list, int i2, int i3) {
        C1084k.toq toqVar = list.get(i2);
        C1084k.toq toqVar2 = list.get(i3);
        int i4 = toqVar2.f5890k;
        if (i4 == 1) {
            zy(list, i2, toqVar, i3, toqVar2);
        } else if (i4 == 2) {
            m5137n(list, i2, toqVar, i3, toqVar2);
        } else {
            if (i4 != 4) {
                return;
            }
            m5136g(list, i2, toqVar, i3, toqVar2);
        }
    }

    private void zy(List<C1084k.toq> list, int i2, C1084k.toq toqVar, int i3, C1084k.toq toqVar2) {
        int i4 = toqVar.f5891q;
        int i5 = toqVar2.f52145toq;
        int i6 = i4 < i5 ? -1 : 0;
        int i7 = toqVar.f52145toq;
        if (i7 < i5) {
            i6++;
        }
        if (i5 <= i7) {
            toqVar.f52145toq = i7 + toqVar2.f5891q;
        }
        int i8 = toqVar2.f52145toq;
        if (i8 <= i4) {
            toqVar.f5891q = i4 + toqVar2.f5891q;
        }
        toqVar2.f52145toq = i8 + i6;
        list.set(i2, toqVar2);
        list.set(i3, toqVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m5136g(java.util.List<androidx.recyclerview.widget.C1084k.toq> r9, int r10, androidx.recyclerview.widget.C1084k.toq r11, int r12, androidx.recyclerview.widget.C1084k.toq r13) {
        /*
            r8 = this;
            int r0 = r11.f5891q
            int r1 = r13.f52145toq
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto Ld
            int r1 = r1 - r4
            r13.f52145toq = r1
            goto L20
        Ld:
            int r5 = r13.f5891q
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r4
            r13.f5891q = r5
            androidx.recyclerview.widget.z$k r0 = r8.f6124k
            int r1 = r11.f52145toq
            java.lang.Object r5 = r13.f52146zy
            androidx.recyclerview.widget.k$toq r0 = r0.mo5000k(r2, r1, r4, r5)
            goto L21
        L20:
            r0 = r3
        L21:
            int r1 = r11.f52145toq
            int r5 = r13.f52145toq
            if (r1 > r5) goto L2b
            int r5 = r5 + r4
            r13.f52145toq = r5
            goto L41
        L2b:
            int r6 = r13.f5891q
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.z$k r3 = r8.f6124k
            int r1 = r1 + r4
            java.lang.Object r4 = r13.f52146zy
            androidx.recyclerview.widget.k$toq r3 = r3.mo5000k(r2, r1, r5, r4)
            int r1 = r13.f5891q
            int r1 = r1 - r5
            r13.f5891q = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f5891q
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.z$k r11 = r8.f6124k
            r11.toq(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r3 == 0) goto L5e
            r9.add(r10, r3)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1117z.m5136g(java.util.List, int, androidx.recyclerview.widget.k$toq, int, androidx.recyclerview.widget.k$toq):void");
    }

    /* JADX INFO: renamed from: n */
    void m5137n(List<C1084k.toq> list, int i2, C1084k.toq toqVar, int i3, C1084k.toq toqVar2) {
        boolean z2;
        int i4 = toqVar.f52145toq;
        int i5 = toqVar.f5891q;
        boolean z3 = false;
        if (i4 < i5) {
            if (toqVar2.f52145toq == i4 && toqVar2.f5891q == i5 - i4) {
                z2 = false;
                z3 = true;
            } else {
                z2 = false;
            }
        } else if (toqVar2.f52145toq == i5 + 1 && toqVar2.f5891q == i4 - i5) {
            z2 = true;
            z3 = true;
        } else {
            z2 = true;
        }
        int i6 = toqVar2.f52145toq;
        if (i5 < i6) {
            toqVar2.f52145toq = i6 - 1;
        } else {
            int i7 = toqVar2.f5891q;
            if (i5 < i6 + i7) {
                toqVar2.f5891q = i7 - 1;
                toqVar.f5890k = 2;
                toqVar.f5891q = 1;
                if (toqVar2.f5891q == 0) {
                    list.remove(i3);
                    this.f6124k.toq(toqVar2);
                    return;
                }
                return;
            }
        }
        int i8 = toqVar.f52145toq;
        int i9 = toqVar2.f52145toq;
        C1084k.toq toqVarMo5000k = null;
        if (i8 <= i9) {
            toqVar2.f52145toq = i9 + 1;
        } else {
            int i10 = toqVar2.f5891q;
            if (i8 < i9 + i10) {
                toqVarMo5000k = this.f6124k.mo5000k(2, i8 + 1, (i9 + i10) - i8, null);
                toqVar2.f5891q = toqVar.f52145toq - toqVar2.f52145toq;
            }
        }
        if (z3) {
            list.set(i2, toqVar2);
            list.remove(i3);
            this.f6124k.toq(toqVar);
            return;
        }
        if (z2) {
            if (toqVarMo5000k != null) {
                int i11 = toqVar.f52145toq;
                if (i11 > toqVarMo5000k.f52145toq) {
                    toqVar.f52145toq = i11 - toqVarMo5000k.f5891q;
                }
                int i12 = toqVar.f5891q;
                if (i12 > toqVarMo5000k.f52145toq) {
                    toqVar.f5891q = i12 - toqVarMo5000k.f5891q;
                }
            }
            int i13 = toqVar.f52145toq;
            if (i13 > toqVar2.f52145toq) {
                toqVar.f52145toq = i13 - toqVar2.f5891q;
            }
            int i14 = toqVar.f5891q;
            if (i14 > toqVar2.f52145toq) {
                toqVar.f5891q = i14 - toqVar2.f5891q;
            }
        } else {
            if (toqVarMo5000k != null) {
                int i15 = toqVar.f52145toq;
                if (i15 >= toqVarMo5000k.f52145toq) {
                    toqVar.f52145toq = i15 - toqVarMo5000k.f5891q;
                }
                int i16 = toqVar.f5891q;
                if (i16 >= toqVarMo5000k.f52145toq) {
                    toqVar.f5891q = i16 - toqVarMo5000k.f5891q;
                }
            }
            int i17 = toqVar.f52145toq;
            if (i17 >= toqVar2.f52145toq) {
                toqVar.f52145toq = i17 - toqVar2.f5891q;
            }
            int i18 = toqVar.f5891q;
            if (i18 >= toqVar2.f52145toq) {
                toqVar.f5891q = i18 - toqVar2.f5891q;
            }
        }
        list.set(i2, toqVar2);
        if (toqVar.f52145toq != toqVar.f5891q) {
            list.set(i3, toqVar);
        } else {
            list.remove(i3);
        }
        if (toqVarMo5000k != null) {
            list.add(i2, toqVarMo5000k);
        }
    }

    void toq(List<C1084k.toq> list) {
        while (true) {
            int iM5134k = m5134k(list);
            if (iM5134k == -1) {
                return;
            } else {
                m5135q(list, iM5134k, iM5134k + 1);
            }
        }
    }
}
