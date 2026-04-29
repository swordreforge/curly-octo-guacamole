package com.xiaomi.push;

/* JADX INFO: loaded from: classes3.dex */
public class koj {

    /* JADX INFO: renamed from: k */
    private static int f33174k = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: k */
    public static void m21140k(ip ipVar, byte b2) {
        toq(ipVar, b2, f33174k);
    }

    public static void toq(ip ipVar, byte b2, int i2) throws sb {
        if (i2 <= 0) {
            throw new sb("Maximum skip depth exceeded");
        }
        int i3 = 0;
        switch (b2) {
            case 2:
                ipVar.mo21000z();
                return;
            case 3:
                ipVar.mo20993k();
                return;
            case 4:
                ipVar.toq();
                return;
            case 5:
            case 7:
            case 9:
            default:
                return;
            case 6:
                ipVar.x2();
                return;
            case 8:
                ipVar.zy();
                return;
            case 10:
                ipVar.mo20996q();
                return;
            case 11:
                ipVar.ld6();
                return;
            case 12:
                ipVar.mo20997s();
                while (true) {
                    byte b3 = ipVar.mo20994n().f73703toq;
                    if (b3 == 0) {
                        ipVar.jk();
                        return;
                    } else {
                        toq(ipVar, b3, i2 - 1);
                        ipVar.a9();
                    }
                }
                break;
            case 13:
                ap23 ap23VarF7l8 = ipVar.f7l8();
                while (i3 < ap23VarF7l8.f73265zy) {
                    int i4 = i2 - 1;
                    toq(ipVar, ap23VarF7l8.f32695k, i4);
                    toq(ipVar, ap23VarF7l8.f73264toq, i4);
                    i3++;
                }
                ipVar.fti();
                return;
            case 14:
                oei oeiVarMo20999y = ipVar.mo20999y();
                while (i3 < oeiVarMo20999y.f73516toq) {
                    toq(ipVar, oeiVarMo20999y.f33497k, i2 - 1);
                    i3++;
                }
                ipVar.gvn7();
                return;
            case 15:
                izu izuVarMo20990g = ipVar.mo20990g();
                while (i3 < izuVarMo20990g.f73378toq) {
                    toq(ipVar, izuVarMo20990g.f33060k, i2 - 1);
                    i3++;
                }
                ipVar.jp0y();
                return;
        }
    }
}
