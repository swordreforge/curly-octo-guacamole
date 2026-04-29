package gcp;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.miui.clock.C5049g;
import com.miui.clock.MiuiTextGlassView;
import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.fu4;
import com.miui.clock.module.toq;
import java.util.Locale;
import miuix.pickerwidget.date.C7230k;

/* JADX INFO: renamed from: gcp.k */
/* JADX INFO: compiled from: ClassicClockTimeUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class C6061k {

    /* JADX INFO: renamed from: k */
    private static final String[] f35040k = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九", "十"};

    public static String cdj(Context context, C7230k c7230k) {
        int[] iArr = (int[]) C6063p.m22328n(c7230k, C7230k.class, "mFields", int[].class);
        if (iArr == null || iArr.length <= 15) {
            return "";
        }
        return context.getResources().getStringArray(C5049g.k.f28965k)[iArr[15]];
    }

    public static int f7l8(C7230k c7230k) {
        return c7230k.get(9);
    }

    public static void fn3e(MiuiTextGlassView miuiTextGlassView, int i2, int i3, int i4, boolean z2, boolean z3) {
        if (i2 != 0) {
            miuiTextGlassView.setTextColor(i2);
        }
        miuiTextGlassView.setEnableDiffusion(z2);
        if (z3) {
            f7l8.t8r(miuiTextGlassView, i3);
        } else if (i4 == 301 || i4 == 304 || i4 == 305) {
            f7l8.ki(miuiTextGlassView, i3, true);
        } else {
            f7l8.ki(miuiTextGlassView, i3, false);
        }
        if (z2) {
            miuiTextGlassView.m17573s(f7l8.m22302q(i3));
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m22306g(Context context, C7230k c7230k, boolean z2, int i2) {
        if (!toq.C5079n.toq(i2)) {
            i2 = 300;
        }
        int iM22311p = m22311p(z2, c7230k);
        String strKi = ki(iM22311p, false);
        int i3 = c7230k.get(20);
        String strKi2 = ki(i3, i3 != 0);
        switch (i2) {
            case 301:
                if (i3 == 0) {
                    return zy(iM22311p, false) + "时整";
                }
                return zy(iM22311p, false) + "时" + zy(i3, true) + "分";
            case 302:
                return context.getResources().getString(C5049g.s.f71702d2ok, strKi);
            case 303:
                return context.getResources().getString(C5049g.s.f29063t, strKi2);
            case 304:
                return context.getResources().getString(C5049g.s.f71750n7h, strKi);
            case 305:
                return context.getResources().getString(C5049g.s.f71736kja0, strKi2);
            default:
                return context.getResources().getString(C5049g.s.f71715fu4, strKi, strKi2);
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m22307h(Context context, C7230k c7230k) {
        return c7230k.format(context, "YY年");
    }

    /* JADX INFO: renamed from: i */
    public static void m22308i(C7230k c7230k, boolean z2, int i2, TextView textView, boolean z3) {
        if (textView != null) {
            textView.setText(m22310n(textView.getContext(), c7230k, z2, i2, z3));
        }
    }

    /* JADX INFO: renamed from: k */
    private static void m22309k(StringBuilder sb, int i2, boolean z2) {
        if (i2 <= 10) {
            sb.append(f35040k[i2]);
        } else if (i2 < 20) {
            String[] strArr = f35040k;
            sb.append(strArr[10]);
            sb.append(strArr[i2 % 10]);
        } else if (i2 == 20) {
            String[] strArr2 = f35040k;
            sb.append(strArr2[2]);
            sb.append(strArr2[10]);
        } else {
            String[] strArr3 = f35040k;
            sb.append(strArr3[i2 / 10]);
            if (z2) {
                sb.append(strArr3[10]);
            }
            sb.append(strArr3[i2 % 10]);
        }
        if (f7l8.kja0()) {
            sb.append("時");
        } else {
            sb.append("时");
        }
    }

    public static String ki(int i2, boolean z2) {
        if (i2 >= 10 || !z2) {
            return String.valueOf(i2);
        }
        return "0" + i2;
    }

    public static int kja0(int i2) {
        return i2 == 25 ? C5049g.q.f71659wvg : C5049g.q.f71589mcp;
    }

    public static String ld6(Context context, C7230k c7230k) {
        return c7230k.format(context, "N月e");
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0008  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m22310n(android.content.Context r3, miuix.pickerwidget.date.C7230k r4, boolean r5, int r6, boolean r7) {
        /*
            boolean r0 = com.miui.clock.module.toq.C5079n.toq(r6)
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 != 0) goto La
        L8:
            r6 = r1
            goto L12
        La:
            if (r7 == 0) goto L12
            switch(r6) {
                case 302: goto L8;
                case 303: goto L8;
                case 304: goto L10;
                case 305: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L12
        L10:
            r6 = 301(0x12d, float:4.22E-43)
        L12:
            int r7 = m22311p(r5, r4)
            r0 = 20
            int r4 = r4.get(r0)
            r0 = 0
            r1 = 1
            switch(r6) {
                case 300: goto L5d;
                case 301: goto L58;
                case 302: goto L53;
                case 303: goto L4e;
                case 304: goto L3b;
                case 305: goto L24;
                default: goto L21;
            }
        L21:
            java.lang.String r3 = ""
            goto L76
        L24:
            android.content.res.Resources r3 = r3.getResources()
            int r5 = com.miui.clock.C5049g.s.f71736kja0
            java.lang.Object[] r6 = new java.lang.Object[r1]
            if (r4 == 0) goto L2f
            goto L30
        L2f:
            r1 = r0
        L30:
            java.lang.String r4 = zy(r4, r1)
            r6[r0] = r4
            java.lang.String r3 = r3.getString(r5, r6)
            goto L76
        L3b:
            android.content.res.Resources r3 = r3.getResources()
            int r4 = com.miui.clock.C5049g.s.f71750n7h
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r6 = zy(r7, r0)
            r5[r0] = r6
            java.lang.String r3 = r3.getString(r4, r5)
            goto L76
        L4e:
            java.lang.String r3 = ki(r4, r1)
            goto L76
        L53:
            java.lang.String r3 = ki(r7, r1)
            goto L76
        L58:
            java.lang.String r3 = m22312q(r7, r4)
            goto L76
        L5d:
            android.content.res.Resources r3 = r3.getResources()
            int r6 = com.miui.clock.C5049g.s.f71715fu4
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r5 = ki(r7, r5)
            r2[r0] = r5
            java.lang.String r4 = ki(r4, r1)
            r2[r1] = r4
            java.lang.String r3 = r3.getString(r6, r2)
        L76:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: gcp.C6061k.m22310n(android.content.Context, miuix.pickerwidget.date.k, boolean, int, boolean):java.lang.String");
    }

    public static int n7h(int i2) {
        return i2 == 25 ? C5049g.q.f71685zurt : C5049g.q.f29043z;
    }

    /* JADX INFO: renamed from: p */
    public static int m22311p(boolean z2, C7230k c7230k) {
        if (z2) {
            return c7230k.get(18);
        }
        int i2 = c7230k.get(18);
        if (i2 == 0) {
            return 12;
        }
        return i2 < 13 ? i2 : i2 - 12;
    }

    /* JADX INFO: renamed from: q */
    public static String m22312q(int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        if (i2 <= 10) {
            m22309k(sb, i2, true);
            toq(sb, i3, true);
        } else if (i2 > 20 && i3 != 0) {
            m22309k(sb, i2, false);
            toq(sb, i3, false);
        } else {
            m22309k(sb, i2, true);
            toq(sb, i3, false);
        }
        return sb.toString();
    }

    public static int qrj(C7230k c7230k) {
        return c7230k.get(5) + 1;
    }

    /* JADX INFO: renamed from: s */
    public static String m22313s(int i2) {
        int i3 = i2 % 10;
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? "TH" : "RD" : "ND" : "ST";
    }

    public static void t8r(TextView textView, int i2, int i3) {
        boolean zEquals = Locale.CHINESE.getLanguage().equals(Locale.getDefault().getLanguage());
        switch (i3) {
            case 201:
            case 203:
            case 204:
            case toq.zy.f72000f7l8 /* 206 */:
            case toq.zy.f29240y /* 207 */:
            case toq.zy.f29239s /* 208 */:
                f7l8.ki(textView, i2, zEquals);
                break;
            case 202:
            case 205:
            case toq.zy.f29237p /* 209 */:
            case toq.zy.f72001ld6 /* 210 */:
            default:
                f7l8.ki(textView, i2, false);
                break;
            case toq.zy.f72004x2 /* 211 */:
            case toq.zy.f72002qrj /* 212 */:
                f7l8.ki(textView, i2, true);
                break;
        }
    }

    private static void toq(StringBuilder sb, int i2, boolean z2) {
        if (i2 == 0) {
            sb.append("整");
            return;
        }
        if (i2 < 10) {
            String[] strArr = f35040k;
            sb.append(strArr[0]);
            sb.append(strArr[i2]);
            return;
        }
        if (i2 == 10) {
            sb.append(f35040k[10]);
            sb.append("分");
            return;
        }
        if (i2 < 20) {
            String[] strArr2 = f35040k;
            sb.append(strArr2[10]);
            sb.append(strArr2[i2 % 10]);
            if (z2) {
                sb.append("分");
                return;
            }
            return;
        }
        int i3 = i2 % 10;
        if (i3 != 0) {
            String[] strArr3 = f35040k;
            sb.append(strArr3[i2 / 10]);
            if (z2) {
                sb.append(strArr3[10]);
            }
            sb.append(strArr3[i3]);
            return;
        }
        String[] strArr4 = f35040k;
        sb.append(strArr4[i2 / 10]);
        sb.append(strArr4[10]);
        if (z2) {
            sb.append("分");
        }
    }

    private static int x2(C7230k c7230k) {
        return c7230k.get(20);
    }

    /* JADX INFO: renamed from: y */
    public static String m22314y(Context context, C7230k c7230k) {
        return c7230k.format(context, context.getString(C5049g.s.f71738ld6)).toUpperCase();
    }

    public static void zurt(MiuiTextGlassView miuiTextGlassView, fu4 fu4Var) {
        String strKja0 = fu4Var.kja0();
        fn3e(miuiTextGlassView, fu4Var.qrj(), fu4Var.x9kr(), fu4Var.lvui(), fu4Var.ncyb(), TextUtils.equals(strKja0, "classic_plus") || TextUtils.equals(strKja0, AbstractC5074q.f71945fn3e));
    }

    public static String zy(int i2, boolean z2) {
        if (i2 < 10) {
            if (!z2) {
                return f35040k[i2];
            }
            StringBuilder sb = new StringBuilder();
            String[] strArr = f35040k;
            sb.append(strArr[0]);
            sb.append(strArr[i2]);
            return sb.toString();
        }
        if (i2 == 10) {
            return f35040k[10];
        }
        int i3 = i2 % 10;
        if (i2 < 20) {
            StringBuilder sb2 = new StringBuilder();
            String[] strArr2 = f35040k;
            sb2.append(strArr2[10]);
            sb2.append(strArr2[i3]);
            return sb2.toString();
        }
        if (i3 == 0) {
            StringBuilder sb3 = new StringBuilder();
            String[] strArr3 = f35040k;
            sb3.append(strArr3[i2 / 10]);
            sb3.append(strArr3[10]);
            return sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        String[] strArr4 = f35040k;
        sb4.append(strArr4[i2 / 10]);
        sb4.append(strArr4[10]);
        sb4.append(strArr4[i3]);
        return sb4.toString();
    }
}
