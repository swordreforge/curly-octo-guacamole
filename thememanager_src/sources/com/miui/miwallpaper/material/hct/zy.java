package com.miui.miwallpaper.material.hct;

import com.miui.miwallpaper.material.utils.C5283k;

/* JADX INFO: compiled from: HctSolver.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: k */
    static final double[][] f29507k = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static final double[][] f72150toq = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    static final double[] f72151zy = {0.2126d, 0.7152d, 0.0722d};

    /* JADX INFO: renamed from: q */
    static final double[] f29508q = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};

    private zy() {
    }

    public static C5275k cdj(double d2, double d4, double d5) {
        return C5275k.toq(ki(d2, d4, d5));
    }

    static int f7l8(double d2, double d4, double d5) {
        double dSqrt = Math.sqrt(d5) * 11.0d;
        C5276q c5276q = C5276q.f72144ld6;
        double dPow = 1.0d / Math.pow(1.64d - Math.pow(0.29d, c5276q.m17878g()), 0.73d);
        double dCos = (Math.cos(d2 + 2.0d) + 3.8d) * 0.25d * 3846.153846153846d * c5276q.m17883y() * c5276q.m17882s();
        double dSin = Math.sin(d2);
        double dCos2 = Math.cos(d2);
        int i2 = 0;
        while (i2 < 5) {
            double d6 = dSqrt / 100.0d;
            double d7 = dPow;
            double dPow2 = Math.pow(((d4 == 0.0d || dSqrt == 0.0d) ? 0.0d : d4 / Math.sqrt(d6)) * dPow, 1.1111111111111112d);
            double d8 = dSqrt;
            double qVar = (c5276q.toq() * Math.pow(d6, (1.0d / c5276q.zy()) / c5276q.ld6())) / c5276q.f7l8();
            double d9 = (((0.305d + qVar) * 23.0d) * dPow2) / (((23.0d * dCos) + ((dPow2 * 11.0d) * dCos2)) + ((dPow2 * 108.0d) * dSin));
            double d10 = d9 * dCos2;
            double d11 = d9 * dSin;
            double d12 = qVar * 460.0d;
            double[] dArrM17974n = com.miui.miwallpaper.material.utils.toq.m17974n(new double[]{m17895p((((451.0d * d10) + d12) + (288.0d * d11)) / 1403.0d), m17895p(((d12 - (891.0d * d10)) - (261.0d * d11)) / 1403.0d), m17895p(((d12 - (d10 * 220.0d)) - (d11 * 6300.0d)) / 1403.0d)}, f72150toq);
            double d13 = dArrM17974n[0];
            if (d13 < 0.0d) {
                break;
            }
            double d14 = dArrM17974n[1];
            if (d14 < 0.0d) {
                break;
            }
            double d15 = dArrM17974n[2];
            if (d15 < 0.0d) {
                break;
            }
            double[] dArr = f72151zy;
            double d16 = (dArr[0] * d13) + (dArr[1] * d14) + (dArr[2] * d15);
            if (d16 <= 0.0d) {
                return 0;
            }
            if (i2 != 4) {
                double d17 = d16 - d5;
                if (Math.abs(d17) >= 0.002d) {
                    dSqrt = d8 - ((d17 * d8) / (d16 * 2.0d));
                    i2++;
                    dPow = d7;
                }
            }
            if (dArrM17974n[0] <= 100.01d && dArrM17974n[1] <= 100.01d && dArrM17974n[2] <= 100.01d) {
                return C5283k.zy(dArrM17974n);
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    static int m17891g(double d2) {
        return (int) Math.floor(d2 - 0.5d);
    }

    /* JADX INFO: renamed from: h */
    static double[] m17892h(double[] dArr, double d2, double[] dArr2, int i2) {
        return x2(dArr, m17897s(dArr[i2], d2, dArr2[i2]), dArr2);
    }

    /* JADX INFO: renamed from: k */
    static boolean m17893k(double d2, double d4, double d5) {
        return kja0(d4 - d2) < kja0(d5 - d2);
    }

    public static int ki(double d2, double d4, double d5) {
        if (d4 < 1.0E-4d || d5 < 1.0E-4d || d5 > 99.9999d) {
            return C5283k.m17959q(d5);
        }
        double dF7l8 = (com.miui.miwallpaper.material.utils.toq.f7l8(d2) / 180.0d) * 3.141592653589793d;
        double dM17955i = C5283k.m17955i(d5);
        int iF7l8 = f7l8(dF7l8, d4, dM17955i);
        return iF7l8 != 0 ? iF7l8 : C5283k.zy(toq(dM17955i, dF7l8));
    }

    static double kja0(double d2) {
        return (d2 + 25.132741228718345d) % 6.283185307179586d;
    }

    static boolean ld6(double d2) {
        return 0.0d <= d2 && d2 <= 100.0d;
    }

    /* JADX INFO: renamed from: n */
    static int m17894n(double d2) {
        return (int) Math.ceil(d2 - 0.5d);
    }

    static double[] n7h(double d2, int i2) {
        double[] dArr = f72151zy;
        double d4 = dArr[0];
        double d5 = dArr[1];
        double d6 = dArr[2];
        double d7 = i2 % 4 <= 1 ? 0.0d : 100.0d;
        double d8 = i2 % 2 != 0 ? 100.0d : 0.0d;
        if (i2 < 4) {
            double d9 = ((d2 - (d5 * d7)) - (d6 * d8)) / d4;
            return ld6(d9) ? new double[]{d9, d7, d8} : new double[]{-1.0d, -1.0d, -1.0d};
        }
        if (i2 < 8) {
            double d10 = ((d2 - (d4 * d8)) - (d6 * d7)) / d5;
            return ld6(d10) ? new double[]{d8, d10, d7} : new double[]{-1.0d, -1.0d, -1.0d};
        }
        double d11 = ((d2 - (d4 * d7)) - (d5 * d8)) / d6;
        return ld6(d11) ? new double[]{d7, d8, d11} : new double[]{-1.0d, -1.0d, -1.0d};
    }

    /* JADX INFO: renamed from: p */
    static double m17895p(double d2) {
        double dAbs = Math.abs(d2);
        return ((double) com.miui.miwallpaper.material.utils.toq.m17976s(d2)) * Math.pow(Math.max(0.0d, (27.13d * dAbs) / (400.0d - dAbs)), 2.380952380952381d);
    }

    /* JADX INFO: renamed from: q */
    static double m17896q(double d2) {
        double dPow = Math.pow(Math.abs(d2), 0.42d);
        return ((((double) com.miui.miwallpaper.material.utils.toq.m17976s(d2)) * 400.0d) * dPow) / (dPow + 27.13d);
    }

    static double[] qrj(double[] dArr, double[] dArr2) {
        return new double[]{(dArr[0] + dArr2[0]) / 2.0d, (dArr[1] + dArr2[1]) / 2.0d, (dArr[2] + dArr2[2]) / 2.0d};
    }

    /* JADX INFO: renamed from: s */
    static double m17897s(double d2, double d4, double d5) {
        return (d4 - d2) / (d5 - d2);
    }

    static double t8r(double d2) {
        double d4 = d2 / 100.0d;
        return (d4 <= 0.0031308d ? d4 * 12.92d : (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }

    static double[] toq(double d2, double d4) {
        int iM17894n;
        int iM17891g;
        double[][] dArrZy = zy(d2, d4);
        double[] dArr = dArrZy[0];
        double dM17898y = m17898y(dArr);
        double[] dArr2 = dArrZy[1];
        for (int i2 = 0; i2 < 3; i2++) {
            double d5 = dArr[i2];
            double d6 = dArr2[i2];
            if (d5 != d6) {
                if (d5 < d6) {
                    iM17894n = m17891g(t8r(d5));
                    iM17891g = m17894n(t8r(dArr2[i2]));
                } else {
                    iM17894n = m17894n(t8r(d5));
                    iM17891g = m17891g(t8r(dArr2[i2]));
                }
                int i3 = iM17894n;
                int i4 = iM17891g;
                for (int i5 = 0; i5 < 8 && Math.abs(i4 - i3) > 1; i5++) {
                    int iFloor = (int) Math.floor(((double) (i3 + i4)) / 2.0d);
                    double[] dArrM17892h = m17892h(dArr, f29508q[iFloor], dArr2, i2);
                    double dM17898y2 = m17898y(dArrM17892h);
                    if (m17893k(dM17898y, d4, dM17898y2)) {
                        dArr2 = dArrM17892h;
                        i4 = iFloor;
                    } else {
                        dArr = dArrM17892h;
                        dM17898y = dM17898y2;
                        i3 = iFloor;
                    }
                }
            }
        }
        return qrj(dArr, dArr2);
    }

    static double[] x2(double[] dArr, double d2, double[] dArr2) {
        double d4 = dArr[0];
        double d5 = dArr[1];
        double d6 = dArr[2];
        return new double[]{d4 + ((dArr2[0] - d4) * d2), d5 + ((dArr2[1] - d5) * d2), d6 + ((dArr2[2] - d6) * d2)};
    }

    /* JADX INFO: renamed from: y */
    static double m17898y(double[] dArr) {
        double[] dArrM17974n = com.miui.miwallpaper.material.utils.toq.m17974n(dArr, f29507k);
        double dM17896q = m17896q(dArrM17974n[0]);
        double dM17896q2 = m17896q(dArrM17974n[1]);
        double dM17896q3 = m17896q(dArrM17974n[2]);
        return Math.atan2(((dM17896q + dM17896q2) - (dM17896q3 * 2.0d)) / 9.0d, (((dM17896q * 11.0d) + ((-12.0d) * dM17896q2)) + dM17896q3) / 11.0d);
    }

    static double[][] zy(double d2, double d4) {
        double[] dArr = {-1.0d, -1.0d, -1.0d};
        double[] dArr2 = dArr;
        double d5 = 0.0d;
        double d6 = 0.0d;
        boolean z2 = true;
        boolean z3 = false;
        for (int i2 = 0; i2 < 12; i2++) {
            double[] dArrN7h = n7h(d2, i2);
            if (dArrN7h[0] >= 0.0d) {
                double dM17898y = m17898y(dArrN7h);
                if (!z3) {
                    z3 = true;
                    dArr = dArrN7h;
                    dArr2 = dArr;
                    d5 = dM17898y;
                    d6 = d5;
                } else if (z2 || m17893k(d5, dM17898y, d6)) {
                    if (m17893k(d5, d4, dM17898y)) {
                        z2 = false;
                        dArr2 = dArrN7h;
                        d6 = dM17898y;
                    } else {
                        z2 = false;
                        dArr = dArrN7h;
                        d5 = dM17898y;
                    }
                }
            }
        }
        return new double[][]{dArr, dArr2};
    }
}
