package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: compiled from: TypedValues.java */
/* JADX INFO: loaded from: classes.dex */
public interface zurt {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f47372f7l8 = 101;

    /* JADX INFO: renamed from: g */
    public static final int f1697g = 100;

    /* JADX INFO: renamed from: k */
    public static final String f1698k = "CUSTOM";

    /* JADX INFO: renamed from: n */
    public static final int f1699n = 8;

    /* JADX INFO: renamed from: q */
    public static final int f1700q = 4;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f47373toq = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f47374zy = 2;

    /* JADX INFO: compiled from: TypedValues.java */
    public interface f7l8 {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        public static final int f47375cdj = 509;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public static final String f47376f7l8 = "percentX";

        /* JADX INFO: renamed from: g */
        public static final String f1701g = "sizePercent";

        /* JADX INFO: renamed from: h */
        public static final int f1702h = 508;

        /* JADX INFO: renamed from: k */
        public static final String f1703k = "KeyPosition";

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        public static final int f47377ki = 510;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        public static final int f47378kja0 = 507;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public static final int f47379ld6 = 503;

        /* JADX INFO: renamed from: n */
        public static final String f1704n = "percentHeight";

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        public static final int f47380n7h = 506;

        /* JADX INFO: renamed from: p */
        public static final int f1705p = 502;

        /* JADX INFO: renamed from: q */
        public static final String f1706q = "percentWidth";

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        public static final int f47381qrj = 505;

        /* JADX INFO: renamed from: s */
        public static final int f1707s = 501;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        public static final String[] f47382t8r = {"transitionEasing", "drawPath", "percentWidth", "percentHeight", "sizePercent", "percentX", "percentY"};

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final String f47383toq = "transitionEasing";

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        public static final int f47384x2 = 504;

        /* JADX INFO: renamed from: y */
        public static final String f1708y = "percentY";

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final String f47385zy = "drawPath";

        static int getType(int i2) {
            if (i2 == 100) {
                return 2;
            }
            if (i2 == 101) {
                return 8;
            }
            switch (i2) {
                case 501:
                case 502:
                    return 8;
                case 503:
                case 504:
                case 505:
                case 506:
                case 507:
                    return 4;
                case 508:
                    return 2;
                default:
                    return -1;
            }
        }

        /* JADX INFO: renamed from: k */
        static int m1086k(String str) {
            str.hashCode();
            switch (str) {
                case "transitionEasing":
                    return 501;
                case "percentWidth":
                    return 503;
                case "percentHeight":
                    return 504;
                case "drawPath":
                    return 502;
                case "sizePercent":
                    return 505;
                case "percentX":
                    return 506;
                case "percentY":
                    return 507;
                default:
                    return -1;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.zurt$g */
    /* JADX INFO: compiled from: TypedValues.java */
    public interface InterfaceC0289g {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public static final String f47387f7l8 = "springdamping";

        /* JADX INFO: renamed from: g */
        public static final String f1709g = "springstiffness";

        /* JADX INFO: renamed from: h */
        public static final String f1710h = "ontouchup";

        /* JADX INFO: renamed from: i */
        public static final String f1711i = "autocompletemode";

        /* JADX INFO: renamed from: k */
        public static final String f1712k = "dragscale";

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        public static final String f47389ki = "springboundary";

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        public static final String f47390kja0 = "movewhenscrollattop";

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public static final String f47391ld6 = "touchanchorside";

        /* JADX INFO: renamed from: n */
        public static final String f1713n = "springmass";

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        public static final String f47392n7h = "limitboundsto";

        /* JADX INFO: renamed from: p */
        public static final String f1714p = "touchanchorid";

        /* JADX INFO: renamed from: q */
        public static final String f1715q = "maxacceleration";

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        public static final String f47394qrj = "touchregionid";

        /* JADX INFO: renamed from: s */
        public static final String f1716s = "dragdirection";

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final String f47396toq = "dragthreshold";

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        public static final String f47397x2 = "rotationcenterid";

        /* JADX INFO: renamed from: y */
        public static final String f1717y = "springstopthreshold";

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        public static final String f47398zurt = "nestedscrollflags";

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final String f47399zy = "maxvelocity";

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        public static final String[] f47386cdj = {"autoComplete", "autoCompleteToStart", "autoCompleteToEnd", "stop", "decelerate", "decelerateAndComplete", "neverCompleteToStart", "neverCompleteToEnd"};

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        public static final String[] f47395t8r = {"overshoot", "bounceStart", "bounceEnd", "bounceBoth"};

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        public static final String[] f47388fn3e = {"continuousVelocity", "spring"};

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        public static final String[] f47393ni7 = {"none", "disablePostScroll", "disableScroll", "supportScrollUp"};
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.zurt$k */
    /* JADX INFO: compiled from: TypedValues.java */
    public interface InterfaceC0290k {

        /* JADX INFO: renamed from: a9, reason: collision with root package name */
        public static final String f47400a9 = "scaleY";

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        public static final int f47401cdj = 316;

        /* JADX INFO: renamed from: d3, reason: collision with root package name */
        public static final String f47403d3 = "pathRotate";

        /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
        public static final String f47405eqxt = "CUSTOM";

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public static final int f47406f7l8 = 306;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        public static final String f47407fn3e = "visibility";

        /* JADX INFO: renamed from: fti, reason: collision with root package name */
        public static final String f47408fti = "pivotX";

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        public static final String f47409fu4 = "translationY";

        /* JADX INFO: renamed from: g */
        public static final int f1718g = 305;

        /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
        public static final String f47410gvn7 = "progress";

        /* JADX INFO: renamed from: h */
        public static final int f1719h = 315;

        /* JADX INFO: renamed from: i */
        public static final String f1720i = "curveFit";

        /* JADX INFO: renamed from: jk, reason: collision with root package name */
        public static final String f47411jk = "scaleX";

        /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
        public static final String f47412jp0y = "pivotY";

        /* JADX INFO: renamed from: k */
        public static final String f1721k = "KeyAttributes";

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        public static final int f47413ki = 317;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        public static final int f47414kja0 = 314;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public static final int f47415ld6 = 310;

        /* JADX INFO: renamed from: mcp, reason: collision with root package name */
        public static final String f47417mcp = "rotationZ";

        /* JADX INFO: renamed from: n */
        public static final int f1722n = 304;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        public static final int f47418n7h = 313;

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        public static final String f47419ni7 = "translationX";

        /* JADX INFO: renamed from: o1t, reason: collision with root package name */
        public static final String f47420o1t = "elevation";

        /* JADX INFO: renamed from: oc, reason: collision with root package name */
        public static final String f47421oc = "easing";

        /* JADX INFO: renamed from: p */
        public static final int f1723p = 309;

        /* JADX INFO: renamed from: q */
        public static final int f1724q = 303;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        public static final int f47422qrj = 312;

        /* JADX INFO: renamed from: s */
        public static final int f1726s = 308;

        /* JADX INFO: renamed from: t */
        public static final String f1727t = "rotationY";

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        public static final int f47423t8r = 318;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final int f47424toq = 301;

        /* JADX INFO: renamed from: wvg, reason: collision with root package name */
        public static final String f47425wvg = "rotationX";

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        public static final int f47426x2 = 311;

        /* JADX INFO: renamed from: y */
        public static final int f1728y = 307;

        /* JADX INFO: renamed from: z */
        public static final String f1729z = "translationZ";

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        public static final String f47427zurt = "alpha";

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final int f47428zy = 302;

        /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
        public static final String f47402d2ok = "frame";

        /* JADX INFO: renamed from: lvui, reason: collision with root package name */
        public static final String f47416lvui = "target";

        /* JADX INFO: renamed from: r */
        public static final String f1725r = "pivotTarget";

        /* JADX INFO: renamed from: dd, reason: collision with root package name */
        public static final String[] f47404dd = {"curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", "pivotY", "progress", "pathRotate", "easing", "CUSTOM", f47402d2ok, f47416lvui, f1725r};

        static int getType(int i2) {
            if (i2 == 100) {
                return 2;
            }
            if (i2 == 101) {
                return 8;
            }
            switch (i2) {
                case 301:
                case 302:
                    return 2;
                case 303:
                case 304:
                case 305:
                case 306:
                case 307:
                case 308:
                case 309:
                case 310:
                case 311:
                case 312:
                case 313:
                case 314:
                case 315:
                case f47401cdj /* 316 */:
                    return 4;
                case f47413ki /* 317 */:
                case f47423t8r /* 318 */:
                    return 8;
                default:
                    return -1;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX INFO: renamed from: k */
        static int m1087k(String str) {
            byte b2;
            str.hashCode();
            switch (str.hashCode()) {
                case -1310311125:
                    b2 = !str.equals("easing") ? (byte) -1 : (byte) 0;
                    break;
                case -1249320806:
                    b2 = !str.equals("rotationX") ? (byte) -1 : (byte) 1;
                    break;
                case -1249320805:
                    b2 = !str.equals("rotationY") ? (byte) -1 : (byte) 2;
                    break;
                case -1249320804:
                    b2 = !str.equals("rotationZ") ? (byte) -1 : (byte) 3;
                    break;
                case -1225497657:
                    b2 = !str.equals("translationX") ? (byte) -1 : (byte) 4;
                    break;
                case -1225497656:
                    b2 = !str.equals("translationY") ? (byte) -1 : (byte) 5;
                    break;
                case -1225497655:
                    b2 = !str.equals("translationZ") ? (byte) -1 : (byte) 6;
                    break;
                case -1001078227:
                    b2 = !str.equals("progress") ? (byte) -1 : (byte) 7;
                    break;
                case -987906986:
                    b2 = !str.equals("pivotX") ? (byte) -1 : (byte) 8;
                    break;
                case -987906985:
                    b2 = !str.equals("pivotY") ? (byte) -1 : (byte) 9;
                    break;
                case -908189618:
                    b2 = !str.equals("scaleX") ? (byte) -1 : (byte) 10;
                    break;
                case -908189617:
                    b2 = !str.equals("scaleY") ? (byte) -1 : com.google.common.base.zy.f68132qrj;
                    break;
                case -880905839:
                    b2 = !str.equals(f47416lvui) ? (byte) -1 : com.google.common.base.zy.f68128n7h;
                    break;
                case -4379043:
                    b2 = !str.equals("elevation") ? (byte) -1 : com.google.common.base.zy.f68124kja0;
                    break;
                case 92909918:
                    b2 = !str.equals("alpha") ? (byte) -1 : com.google.common.base.zy.f25751h;
                    break;
                case 97692013:
                    b2 = !str.equals(f47402d2ok) ? (byte) -1 : com.google.common.base.zy.f68111cdj;
                    break;
                case 579057826:
                    b2 = !str.equals("curveFit") ? (byte) -1 : (byte) 16;
                    break;
                case 803192288:
                    b2 = !str.equals("pathRotate") ? (byte) -1 : (byte) 17;
                    break;
                case 1167159411:
                    b2 = !str.equals(f1725r) ? (byte) -1 : (byte) 18;
                    break;
                case 1941332754:
                    b2 = !str.equals("visibility") ? (byte) -1 : (byte) 19;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                    return f47413ki;
                case 1:
                    return 308;
                case 2:
                    return 309;
                case 3:
                    return 310;
                case 4:
                    return 304;
                case 5:
                    return 305;
                case 6:
                    return 306;
                case 7:
                    return 315;
                case 8:
                    return 313;
                case 9:
                    return 314;
                case 10:
                    return 311;
                case 11:
                    return 312;
                case 12:
                    return 101;
                case 13:
                    return 307;
                case 14:
                    return 303;
                case 15:
                    return 100;
                case 16:
                    return 301;
                case 17:
                    return f47401cdj;
                case 18:
                    return f47423t8r;
                case 19:
                    return 302;
                default:
                    return -1;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.zurt$n */
    /* JADX INFO: compiled from: TypedValues.java */
    public interface InterfaceC0291n {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        public static final int f47429cdj = 601;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        public static final int f47431fn3e = 605;

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        public static final int f47432fu4 = 608;

        /* JADX INFO: renamed from: h */
        public static final int f1731h = 600;

        /* JADX INFO: renamed from: i */
        public static final int f1732i = 604;

        /* JADX INFO: renamed from: k */
        public static final String f1733k = "Motion";

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        public static final int f47433ki = 602;

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        public static final int f47437ni7 = 607;

        /* JADX INFO: renamed from: o1t, reason: collision with root package name */
        public static final int f47438o1t = 610;

        /* JADX INFO: renamed from: t */
        public static final int f1738t = 612;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        public static final int f47440t8r = 603;

        /* JADX INFO: renamed from: wvg, reason: collision with root package name */
        public static final int f47442wvg = 611;

        /* JADX INFO: renamed from: z */
        public static final int f1740z = 609;

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        public static final int f47444zurt = 606;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final String f47441toq = "Stagger";

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final String f47445zy = "PathRotate";

        /* JADX INFO: renamed from: q */
        public static final String f1736q = "QuantizeMotionPhase";

        /* JADX INFO: renamed from: n */
        public static final String f1734n = "TransitionEasing";

        /* JADX INFO: renamed from: g */
        public static final String f1730g = "QuantizeInterpolator";

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public static final String f47430f7l8 = "AnimateRelativeTo";

        /* JADX INFO: renamed from: y */
        public static final String f1739y = "AnimateCircleAngleTo";

        /* JADX INFO: renamed from: s */
        public static final String f1737s = "PathMotionArc";

        /* JADX INFO: renamed from: p */
        public static final String f1735p = "DrawPath";

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public static final String f47435ld6 = "PolarRelativeTo";

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        public static final String f47443x2 = "QuantizeMotionSteps";

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        public static final String f47439qrj = "QuantizeInterpolatorType";

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        public static final String f47436n7h = "QuantizeInterpolatorID";

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        public static final String[] f47434kja0 = {f47441toq, f47445zy, f1736q, f1734n, f1730g, f47430f7l8, f1739y, f1737s, f1735p, f47435ld6, f47443x2, f47439qrj, f47436n7h};

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX INFO: renamed from: k */
        static int m1088k(String str) {
            byte b2;
            str.hashCode();
            switch (str.hashCode()) {
                case -2033446275:
                    b2 = !str.equals(f1739y) ? (byte) -1 : (byte) 0;
                    break;
                case -1532277420:
                    b2 = !str.equals(f1736q) ? (byte) -1 : (byte) 1;
                    break;
                case -1529145600:
                    b2 = !str.equals(f47443x2) ? (byte) -1 : (byte) 2;
                    break;
                case -1498310144:
                    b2 = !str.equals(f47445zy) ? (byte) -1 : (byte) 3;
                    break;
                case -1030753096:
                    b2 = !str.equals(f1730g) ? (byte) -1 : (byte) 4;
                    break;
                case -762370135:
                    b2 = !str.equals(f1735p) ? (byte) -1 : (byte) 5;
                    break;
                case -232872051:
                    b2 = !str.equals(f47441toq) ? (byte) -1 : (byte) 6;
                    break;
                case 1138491429:
                    b2 = !str.equals(f47435ld6) ? (byte) -1 : (byte) 7;
                    break;
                case 1539234834:
                    b2 = !str.equals(f47439qrj) ? (byte) -1 : (byte) 8;
                    break;
                case 1583722451:
                    b2 = !str.equals(f47436n7h) ? (byte) -1 : (byte) 9;
                    break;
                case 1639368448:
                    b2 = !str.equals(f1734n) ? (byte) -1 : (byte) 10;
                    break;
                case 1900899336:
                    b2 = !str.equals(f47430f7l8) ? (byte) -1 : com.google.common.base.zy.f68132qrj;
                    break;
                case 2109694967:
                    b2 = !str.equals(f1737s) ? (byte) -1 : com.google.common.base.zy.f68128n7h;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                    return f47444zurt;
                case 1:
                    return f47433ki;
                case 2:
                    return f47438o1t;
                case 3:
                    return 601;
                case 4:
                    return f1732i;
                case 5:
                    return f47432fu4;
                case 6:
                    return 600;
                case 7:
                    return f1740z;
                case 8:
                    return f47442wvg;
                case 9:
                    return f1738t;
                case 10:
                    return f47440t8r;
                case 11:
                    return f47431fn3e;
                case 12:
                    return f47437ni7;
                default:
                    return -1;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.zurt$q */
    /* JADX INFO: compiled from: TypedValues.java */
    public interface InterfaceC0292q {

        /* JADX INFO: renamed from: k */
        public static final String f1742k = "MotionScene";

        /* JADX INFO: renamed from: n */
        public static final int f1743n = 601;

        /* JADX INFO: renamed from: q */
        public static final int f1744q = 600;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final String f47446toq = "defaultDuration";

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final String f47447zy = "layoutDuringTransition";

        /* JADX INFO: renamed from: g */
        public static final String[] f1741g = {f47446toq, f47447zy};

        static int getType(int i2) {
            if (i2 != 600) {
                return i2 != 601 ? -1 : 1;
            }
            return 2;
        }

        /* JADX INFO: renamed from: k */
        static int m1089k(String str) {
            str.hashCode();
            if (str.equals(f47446toq)) {
                return 600;
            }
            return !str.equals(f47447zy) ? -1 : 601;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.zurt$s */
    /* JADX INFO: compiled from: TypedValues.java */
    public interface InterfaceC0293s {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        public static final int f47448cdj = 303;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public static final String f47449f7l8 = "triggerCollisionView";

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        public static final int f47450fn3e = 307;

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        public static final int f47451fu4 = 310;

        /* JADX INFO: renamed from: g */
        public static final String f1745g = "triggerSlack";

        /* JADX INFO: renamed from: h */
        public static final int f1746h = 302;

        /* JADX INFO: renamed from: i */
        public static final int f1747i = 306;

        /* JADX INFO: renamed from: k */
        public static final String f1748k = "KeyTrigger";

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        public static final int f47452ki = 304;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        public static final int f47453kja0 = 301;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public static final String f47454ld6 = "negativeCross";

        /* JADX INFO: renamed from: n */
        public static final String f1749n = "postLayout";

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        public static final String[] f47455n7h = {"viewTransitionOnCross", "viewTransitionOnPositiveCross", "viewTransitionOnNegativeCross", "postLayout", "triggerSlack", "triggerCollisionView", "triggerCollisionId", "triggerID", "positiveCross", "negativeCross", "triggerReceiver", "CROSS"};

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        public static final int f47456ni7 = 309;

        /* JADX INFO: renamed from: o1t, reason: collision with root package name */
        public static final int f47457o1t = 312;

        /* JADX INFO: renamed from: p */
        public static final String f1750p = "positiveCross";

        /* JADX INFO: renamed from: q */
        public static final String f1751q = "viewTransitionOnNegativeCross";

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        public static final String f47458qrj = "CROSS";

        /* JADX INFO: renamed from: s */
        public static final String f1752s = "triggerID";

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        public static final int f47459t8r = 305;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final String f47460toq = "viewTransitionOnCross";

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        public static final String f47461x2 = "triggerReceiver";

        /* JADX INFO: renamed from: y */
        public static final String f1753y = "triggerCollisionId";

        /* JADX INFO: renamed from: z */
        public static final int f1754z = 311;

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        public static final int f47462zurt = 308;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final String f47463zy = "viewTransitionOnPositiveCross";

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX INFO: renamed from: k */
        static int m1090k(String str) {
            byte b2;
            str.hashCode();
            switch (str.hashCode()) {
                case -1594793529:
                    b2 = !str.equals("positiveCross") ? (byte) -1 : (byte) 0;
                    break;
                case -966421266:
                    b2 = !str.equals("viewTransitionOnPositiveCross") ? (byte) -1 : (byte) 1;
                    break;
                case -786670827:
                    b2 = !str.equals("triggerCollisionId") ? (byte) -1 : (byte) 2;
                    break;
                case -648752941:
                    b2 = !str.equals("triggerID") ? (byte) -1 : (byte) 3;
                    break;
                case -638126837:
                    b2 = !str.equals("negativeCross") ? (byte) -1 : (byte) 4;
                    break;
                case -76025313:
                    b2 = !str.equals("triggerCollisionView") ? (byte) -1 : (byte) 5;
                    break;
                case -9754574:
                    b2 = !str.equals("viewTransitionOnNegativeCross") ? (byte) -1 : (byte) 6;
                    break;
                case 64397344:
                    b2 = !str.equals("CROSS") ? (byte) -1 : (byte) 7;
                    break;
                case 364489912:
                    b2 = !str.equals("triggerSlack") ? (byte) -1 : (byte) 8;
                    break;
                case 1301930599:
                    b2 = !str.equals("viewTransitionOnCross") ? (byte) -1 : (byte) 9;
                    break;
                case 1401391082:
                    b2 = !str.equals("postLayout") ? (byte) -1 : (byte) 10;
                    break;
                case 1535404999:
                    b2 = !str.equals("triggerReceiver") ? (byte) -1 : com.google.common.base.zy.f68132qrj;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                    return 309;
                case 1:
                    return 302;
                case 2:
                    return 307;
                case 3:
                    return 308;
                case 4:
                    return 310;
                case 5:
                    return 306;
                case 6:
                    return 303;
                case 7:
                    return 312;
                case 8:
                    return 305;
                case 9:
                    return 301;
                case 10:
                    return 304;
                case 11:
                    return 311;
                default:
                    return -1;
            }
        }
    }

    /* JADX INFO: compiled from: TypedValues.java */
    public interface toq {

        /* JADX INFO: renamed from: h */
        public static final int f1756h = 906;

        /* JADX INFO: renamed from: k */
        public static final String f1757k = "Custom";

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        public static final int f47465kja0 = 905;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public static final int f47466ld6 = 901;

        /* JADX INFO: renamed from: n */
        public static final String f1758n = "string";

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        public static final int f47467n7h = 904;

        /* JADX INFO: renamed from: p */
        public static final int f1759p = 900;

        /* JADX INFO: renamed from: q */
        public static final String f1760q = "color";

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        public static final int f47468qrj = 903;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final String f47469toq = "integer";

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        public static final int f47470x2 = 902;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final String f47471zy = "float";

        /* JADX INFO: renamed from: g */
        public static final String f1755g = "boolean";

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public static final String f47464f7l8 = "dimension";

        /* JADX INFO: renamed from: y */
        public static final String f1762y = "refrence";

        /* JADX INFO: renamed from: s */
        public static final String[] f1761s = {f47471zy, "color", "string", f1755g, f47464f7l8, f1762y};

        /* JADX INFO: renamed from: k */
        static int m1091k(String str) {
            str.hashCode();
            switch (str) {
                case "dimension":
                    return f47465kja0;
                case "string":
                    return f47468qrj;
                case "refrence":
                    return f1756h;
                case "boolean":
                    return f47467n7h;
                case "color":
                    return f47470x2;
                case "float":
                    return f47466ld6;
                case "integer":
                    return f1759p;
                default:
                    return -1;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.utils.zurt$y */
    /* JADX INFO: compiled from: TypedValues.java */
    public interface InterfaceC0294y {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        public static final int f47472cdj = 707;

        /* JADX INFO: renamed from: h */
        public static final int f1764h = 706;

        /* JADX INFO: renamed from: k */
        public static final String f1765k = "Transitions";

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        public static final int f47475kja0 = 705;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public static final int f47476ld6 = 701;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        public static final int f47477n7h = 704;

        /* JADX INFO: renamed from: p */
        public static final int f1767p = 700;

        /* JADX INFO: renamed from: q */
        public static final String f1768q = "to";

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        public static final int f47478qrj = 509;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final String f47479toq = "duration";

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        public static final int f47480x2 = 702;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final String f47481zy = "from";

        /* JADX INFO: renamed from: n */
        public static final String f1766n = "pathMotionArc";

        /* JADX INFO: renamed from: g */
        public static final String f1763g = "autoTransition";

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public static final String f47473f7l8 = "motionInterpolator";

        /* JADX INFO: renamed from: y */
        public static final String f1770y = "staggered";

        /* JADX INFO: renamed from: s */
        public static final String f1769s = "transitionFlags";

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        public static final String[] f47474ki = {"duration", "from", "to", f1766n, f1763g, f47473f7l8, f1770y, "from", f1769s};

        static int getType(int i2) {
            if (i2 == 509) {
                return 2;
            }
            switch (i2) {
                case f1767p /* 700 */:
                    return 2;
                case f47476ld6 /* 701 */:
                case f47480x2 /* 702 */:
                    return 8;
                default:
                    switch (i2) {
                        case f47475kja0 /* 705 */:
                        case f47472cdj /* 707 */:
                            return 8;
                        case f1764h /* 706 */:
                            return 4;
                        default:
                            return -1;
                    }
            }
        }

        /* JADX INFO: renamed from: k */
        static int m1092k(String str) {
            str.hashCode();
            switch (str) {
                case "transitionFlags":
                    return f47472cdj;
                case "duration":
                    return f1767p;
                case "motionInterpolator":
                    return f47475kja0;
                case "autoTransition":
                    return f47477n7h;
                case "to":
                    return f47480x2;
                case "from":
                    return f47476ld6;
                case "pathMotionArc":
                    return 509;
                case "staggered":
                    return f1764h;
                default:
                    return -1;
            }
        }
    }

    /* JADX INFO: compiled from: TypedValues.java */
    public interface zy {

        /* JADX INFO: renamed from: a9, reason: collision with root package name */
        public static final String f47482a9 = "rotationX";

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        public static final int f47483cdj = 416;

        /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
        public static final String f47484d2ok = "progress";

        /* JADX INFO: renamed from: d3, reason: collision with root package name */
        public static final String f47485d3 = "scaleY";

        /* JADX INFO: renamed from: dd, reason: collision with root package name */
        public static final String f47486dd = "waveShape";

        /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
        public static final String f47487eqxt = "pivotY";

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public static final int f47488f7l8 = 306;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        public static final int f47489fn3e = 423;

        /* JADX INFO: renamed from: fti, reason: collision with root package name */
        public static final String f47490fti = "rotationY";

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        public static final String f47491fu4 = "curveFit";

        /* JADX INFO: renamed from: g */
        public static final int f1771g = 305;

        /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
        public static final String f47492gvn7 = "scaleX";

        /* JADX INFO: renamed from: h */
        public static final int f1772h = 315;

        /* JADX INFO: renamed from: i */
        public static final int f1773i = 422;

        /* JADX INFO: renamed from: jk, reason: collision with root package name */
        public static final String f47494jk = "elevation";

        /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
        public static final String f47495jp0y = "rotationZ";

        /* JADX INFO: renamed from: k */
        public static final String f1774k = "KeyCycle";

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        public static final int f47496ki = 420;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        public static final int f47497kja0 = 314;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public static final int f47498ld6 = 310;

        /* JADX INFO: renamed from: lvui, reason: collision with root package name */
        public static final String f47499lvui = "pathRotate";

        /* JADX INFO: renamed from: mcp, reason: collision with root package name */
        public static final String f47500mcp = "translationZ";

        /* JADX INFO: renamed from: n */
        public static final int f1776n = 304;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        public static final int f47502n7h = 313;

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        public static final int f47504ni7 = 425;

        /* JADX INFO: renamed from: o1t, reason: collision with root package name */
        public static final String f47505o1t = "alpha";

        /* JADX INFO: renamed from: oc, reason: collision with root package name */
        public static final String f47506oc = "pivotX";

        /* JADX INFO: renamed from: p */
        public static final int f1777p = 309;

        /* JADX INFO: renamed from: q */
        public static final int f1778q = 403;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        public static final int f47507qrj = 312;

        /* JADX INFO: renamed from: r */
        public static final String f1779r = "easing";

        /* JADX INFO: renamed from: s */
        public static final int f1780s = 308;

        /* JADX INFO: renamed from: t */
        public static final String f1781t = "translationY";

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        public static final int f47508t8r = 421;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final int f47509toq = 401;

        /* JADX INFO: renamed from: wvg, reason: collision with root package name */
        public static final String f47510wvg = "translationX";

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        public static final int f47511x2 = 311;

        /* JADX INFO: renamed from: y */
        public static final int f1782y = 307;

        /* JADX INFO: renamed from: z */
        public static final String f1783z = "visibility";

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        public static final int f47513zurt = 424;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final int f47514zy = 402;

        /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
        public static final String f47512x9kr = "customWave";

        /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
        public static final String f47503ncyb = "period";

        /* JADX INFO: renamed from: l */
        public static final String f1775l = "offset";

        /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
        public static final String f47501n5r1 = "phase";

        /* JADX INFO: renamed from: hyr, reason: collision with root package name */
        public static final String[] f47493hyr = {"curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", "pivotY", "progress", "pathRotate", "easing", "waveShape", f47512x9kr, f47503ncyb, f1775l, f47501n5r1};

        static int getType(int i2) {
            if (i2 == 100) {
                return 2;
            }
            if (i2 == 101) {
                return 8;
            }
            if (i2 == 416) {
                return 4;
            }
            if (i2 == 420 || i2 == 421) {
                return 8;
            }
            switch (i2) {
                case 304:
                case 305:
                case 306:
                case 307:
                case 308:
                case 309:
                case 310:
                case 311:
                case 312:
                case 313:
                case 314:
                case 315:
                    return 4;
                default:
                    switch (i2) {
                        case 401:
                        case 402:
                            return 2;
                        case 403:
                            return 4;
                        default:
                            switch (i2) {
                                case f47489fn3e /* 423 */:
                                case 424:
                                case 425:
                                    return 4;
                                default:
                                    return -1;
                            }
                    }
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX INFO: renamed from: k */
        static int m1093k(String str) {
            byte b2;
            str.hashCode();
            switch (str.hashCode()) {
                case -1310311125:
                    b2 = !str.equals("easing") ? (byte) -1 : (byte) 0;
                    break;
                case -1249320806:
                    b2 = !str.equals("rotationX") ? (byte) -1 : (byte) 1;
                    break;
                case -1249320805:
                    b2 = !str.equals("rotationY") ? (byte) -1 : (byte) 2;
                    break;
                case -1249320804:
                    b2 = !str.equals("rotationZ") ? (byte) -1 : (byte) 3;
                    break;
                case -1225497657:
                    b2 = !str.equals("translationX") ? (byte) -1 : (byte) 4;
                    break;
                case -1225497656:
                    b2 = !str.equals("translationY") ? (byte) -1 : (byte) 5;
                    break;
                case -1225497655:
                    b2 = !str.equals("translationZ") ? (byte) -1 : (byte) 6;
                    break;
                case -1001078227:
                    b2 = !str.equals("progress") ? (byte) -1 : (byte) 7;
                    break;
                case -987906986:
                    b2 = !str.equals("pivotX") ? (byte) -1 : (byte) 8;
                    break;
                case -987906985:
                    b2 = !str.equals("pivotY") ? (byte) -1 : (byte) 9;
                    break;
                case -908189618:
                    b2 = !str.equals("scaleX") ? (byte) -1 : (byte) 10;
                    break;
                case -908189617:
                    b2 = !str.equals("scaleY") ? (byte) -1 : com.google.common.base.zy.f68132qrj;
                    break;
                case 92909918:
                    b2 = !str.equals("alpha") ? (byte) -1 : com.google.common.base.zy.f68128n7h;
                    break;
                case 579057826:
                    b2 = !str.equals("curveFit") ? (byte) -1 : com.google.common.base.zy.f68124kja0;
                    break;
                case 803192288:
                    b2 = !str.equals("pathRotate") ? (byte) -1 : com.google.common.base.zy.f25751h;
                    break;
                case 1941332754:
                    b2 = !str.equals("visibility") ? (byte) -1 : com.google.common.base.zy.f68111cdj;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                    return f47496ki;
                case 1:
                    return 308;
                case 2:
                    return 309;
                case 3:
                    return 310;
                case 4:
                    return 304;
                case 5:
                    return 305;
                case 6:
                    return 306;
                case 7:
                    return 315;
                case 8:
                    return 313;
                case 9:
                    return 314;
                case 10:
                    return 311;
                case 11:
                    return 312;
                case 12:
                    return 403;
                case 13:
                    return 401;
                case 14:
                    return f47483cdj;
                case 15:
                    return 402;
                default:
                    return -1;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    int mo933k(String str);

    /* JADX INFO: renamed from: n */
    boolean mo935n(int i2, String str);

    /* JADX INFO: renamed from: q */
    boolean mo937q(int i2, boolean z2);

    boolean toq(int i2, int i3);

    boolean zy(int i2, float f2);
}
