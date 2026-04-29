package com.google.android.exoplayer2.text.ttml;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.text.toq;
import com.google.android.exoplayer2.util.C3844k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.text.ttml.q */
/* JADX INFO: compiled from: TtmlNode.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3678q {

    /* JADX INFO: renamed from: a */
    public static final String f22036a = "center";

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final String f65801a9 = "origin";

    /* JADX INFO: renamed from: a98o, reason: collision with root package name */
    public static final String f65802a98o = "left";

    /* JADX INFO: renamed from: b */
    public static final String f22037b = "nounderline";

    /* JADX INFO: renamed from: bf2, reason: collision with root package name */
    public static final String f65803bf2 = "italic";

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    public static final String f65804bo = "tbrl";

    /* JADX INFO: renamed from: c */
    public static final String f22038c = "multiRowAlign";

    /* JADX INFO: renamed from: c8jq, reason: collision with root package name */
    public static final String f65805c8jq = "auto";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final String f65806cdj = "div";

    /* JADX INFO: renamed from: ch, reason: collision with root package name */
    public static final String f65807ch = "end";

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    public static final String f65808d2ok = "fontWeight";

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final String f65809d3 = "fontStyle";

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    public static final String f65810dd = "rubyPosition";

    /* JADX INFO: renamed from: dr, reason: collision with root package name */
    public static final String f65811dr = "sesame";

    /* JADX INFO: renamed from: e */
    public static final String f22039e = "text";

    /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
    public static final String f65812ek5k = "linethrough";

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    public static final String f65813eqxt = "fontFamily";

    /* JADX INFO: renamed from: f */
    public static final String f22040f = "shear";

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final String f65814fn3e = "style";

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    public static final String f65815fti = "extent";

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final String f65816fu4 = "region";

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    public static final String f65817gvn7 = "backgroundColor";

    /* JADX INFO: renamed from: gyi, reason: collision with root package name */
    public static final String f65818gyi = "dot";

    /* JADX INFO: renamed from: h */
    public static final String f22041h = "body";

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    public static final String f65819hb = "delimiter";

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    public static final String f65820hyr = "writingMode";

    /* JADX INFO: renamed from: i */
    public static final String f22042i = "br";

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final String f65821i1 = "bold";

    /* JADX INFO: renamed from: ikck, reason: collision with root package name */
    public static final String f65822ikck = "open";

    /* JADX INFO: renamed from: j */
    public static final String f22043j = "before";

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final String f65823jk = "id";

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    public static final String f65824jp0y = "displayAlign";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final String f65825ki = "p";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final String f65826kja0 = "head";

    /* JADX INFO: renamed from: l */
    public static final String f22044l = "textCombine";

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    public static final String f65827lrht = "container";

    /* JADX INFO: renamed from: lv5, reason: collision with root package name */
    public static final String f65828lv5 = "all";

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    public static final String f65829lvui = "color";

    /* JADX INFO: renamed from: m */
    public static final String f22045m = "outside";

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final String f65830mcp = "";

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    public static final String f65831n5r1 = "textEmphasis";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final String f65832n7h = "tt";

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    public static final String f65833ncyb = "textAlign";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final String f65834ni7 = "layout";

    /* JADX INFO: renamed from: nmn5, reason: collision with root package name */
    public static final String f65835nmn5 = "none";

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    public static final String f65836nn86 = "textContainer";

    /* JADX INFO: renamed from: o */
    public static final String f22046o = "after";

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final String f65837o1t = "image";

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    public static final String f65838oc = "fontSize";

    /* JADX INFO: renamed from: r */
    public static final String f22047r = "ruby";

    /* JADX INFO: renamed from: t */
    public static final String f22048t = "information";

    /* JADX INFO: renamed from: t8iq, reason: collision with root package name */
    public static final String f65839t8iq = "tb";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final String f65840t8r = "span";

    /* JADX INFO: renamed from: u */
    public static final String f22049u = "tblr";

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    public static final String f65841uv6 = "base";

    /* JADX INFO: renamed from: v */
    public static final String f22050v = "filled";

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    public static final String f65842vyq = "baseContainer";

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final String f65843wvg = "data";

    /* JADX INFO: renamed from: x */
    public static final String f22051x = "start";

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    public static final String f65844x9kr = "textDecoration";

    /* JADX INFO: renamed from: xwq3, reason: collision with root package name */
    public static final String f65845xwq3 = "circle";

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public static final String f65846y2 = "none";

    /* JADX INFO: renamed from: y9n, reason: collision with root package name */
    public static final String f65847y9n = "underline";

    /* JADX INFO: renamed from: yz, reason: collision with root package name */
    public static final String f65848yz = "nolinethrough";

    /* JADX INFO: renamed from: z */
    public static final String f22052z = "metadata";

    /* JADX INFO: renamed from: zp, reason: collision with root package name */
    public static final String f65849zp = "right";

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final String f65850zurt = "styling";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @dd
    private final String[] f65851f7l8;

    /* JADX INFO: renamed from: g */
    @dd
    public final f7l8 f22053g;

    /* JADX INFO: renamed from: k */
    @dd
    public final String f22054k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final HashMap<String, Integer> f65852ld6;

    /* JADX INFO: renamed from: n */
    public final long f22055n;

    /* JADX INFO: renamed from: p */
    @dd
    public final C3678q f22056p;

    /* JADX INFO: renamed from: q */
    public final long f22057q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private List<C3678q> f65853qrj;

    /* JADX INFO: renamed from: s */
    @dd
    public final String f22058s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @dd
    public final String f65854toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final HashMap<String, Integer> f65855x2;

    /* JADX INFO: renamed from: y */
    public final String f22059y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final boolean f65856zy;

    private C3678q(@dd String str, @dd String str2, long j2, long j3, @dd f7l8 f7l8Var, @dd String[] strArr, String str3, @dd String str4, @dd C3678q c3678q) {
        this.f22054k = str;
        this.f65854toq = str2;
        this.f22058s = str4;
        this.f22053g = f7l8Var;
        this.f65851f7l8 = strArr;
        this.f65856zy = str2 != null;
        this.f22057q = j2;
        this.f22055n = j3;
        this.f22059y = (String) C3844k.f7l8(str3);
        this.f22056p = c3678q;
        this.f65852ld6 = new HashMap<>();
        this.f65855x2 = new HashMap<>();
    }

    /* JADX INFO: renamed from: h */
    private void m12961h(long j2, boolean z2, String str, Map<String, toq.zy> map) {
        this.f65852ld6.clear();
        this.f65855x2.clear();
        if (f22052z.equals(this.f22054k)) {
            return;
        }
        if (!"".equals(this.f22059y)) {
            str = this.f22059y;
        }
        if (this.f65856zy && z2) {
            ld6(str, map).append((CharSequence) C3844k.f7l8(this.f65854toq));
            return;
        }
        if (f22042i.equals(this.f22054k) && z2) {
            ld6(str, map).append('\n');
            return;
        }
        if (qrj(j2)) {
            for (Map.Entry<String, toq.zy> entry : map.entrySet()) {
                this.f65852ld6.put(entry.getKey(), Integer.valueOf(((CharSequence) C3844k.f7l8(entry.getValue().ld6())).length()));
            }
            boolean zEquals = "p".equals(this.f22054k);
            for (int i2 = 0; i2 < f7l8(); i2++) {
                m12965g(i2).m12961h(j2, z2 || zEquals, str, map);
            }
            if (zEquals) {
                C3675g.zy(ld6(str, map));
            }
            for (Map.Entry<String, toq.zy> entry2 : map.entrySet()) {
                this.f65855x2.put(entry2.getKey(), Integer.valueOf(((CharSequence) C3844k.f7l8(entry2.getValue().ld6())).length()));
            }
        }
    }

    private void kja0(long j2, Map<String, f7l8> map, Map<String, C3677n> map2, String str, Map<String, toq.zy> map3) {
        int i2;
        if (qrj(j2)) {
            String str2 = "".equals(this.f22059y) ? str : this.f22059y;
            Iterator<Map.Entry<String, Integer>> it = this.f65855x2.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int iIntValue = this.f65852ld6.containsKey(key) ? this.f65852ld6.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    toq(map, (toq.zy) C3844k.f7l8(map3.get(key)), iIntValue, iIntValue2, ((C3677n) C3844k.f7l8(map2.get(str2))).f22032p);
                }
            }
            while (i2 < f7l8()) {
                m12965g(i2).kja0(j2, map, map2, str2, map3);
                i2++;
            }
        }
    }

    private static SpannableStringBuilder ld6(String str, Map<String, toq.zy> map) {
        if (!map.containsKey(str)) {
            toq.zy zyVar = new toq.zy();
            zyVar.wvg(new SpannableStringBuilder());
            map.put(str, zyVar);
        }
        return (SpannableStringBuilder) C3844k.f7l8(map.get(str).ld6());
    }

    /* JADX INFO: renamed from: n */
    private static void m12962n(SpannableStringBuilder spannableStringBuilder) {
        for (C3676k c3676k : (C3676k[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C3676k.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c3676k), spannableStringBuilder.getSpanEnd(c3676k), "");
        }
        for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
            if (spannableStringBuilder.charAt(i2) == ' ') {
                int i3 = i2 + 1;
                int i4 = i3;
                while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                    i4++;
                }
                int i5 = i4 - i3;
                if (i5 > 0) {
                    spannableStringBuilder.delete(i2, i5 + i2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i6 = 0; i6 < spannableStringBuilder.length() - 1; i6++) {
            if (spannableStringBuilder.charAt(i6) == '\n') {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
            if (spannableStringBuilder.charAt(i8) == ' ') {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i9) == '\n') {
                    spannableStringBuilder.delete(i8, i9);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    private void n7h(long j2, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f22059y)) {
            str = this.f22059y;
        }
        if (qrj(j2) && f65806cdj.equals(this.f22054k) && this.f22058s != null) {
            list.add(new Pair<>(str, this.f22058s));
            return;
        }
        for (int i2 = 0; i2 < f7l8(); i2++) {
            m12965g(i2).n7h(j2, str, list);
        }
    }

    /* JADX INFO: renamed from: q */
    public static C3678q m12963q(String str) {
        return new C3678q(null, C3675g.toq(str), C3548p.f65257toq, C3548p.f65257toq, null, null, "", null, null);
    }

    /* JADX INFO: renamed from: s */
    private void m12964s(TreeSet<Long> treeSet, boolean z2) {
        boolean zEquals = "p".equals(this.f22054k);
        boolean zEquals2 = f65806cdj.equals(this.f22054k);
        if (z2 || zEquals || (zEquals2 && this.f22058s != null)) {
            long j2 = this.f22057q;
            if (j2 != C3548p.f65257toq) {
                treeSet.add(Long.valueOf(j2));
            }
            long j3 = this.f22055n;
            if (j3 != C3548p.f65257toq) {
                treeSet.add(Long.valueOf(j3));
            }
        }
        if (this.f65853qrj == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f65853qrj.size(); i2++) {
            this.f65853qrj.get(i2).m12964s(treeSet, z2 || zEquals);
        }
    }

    private void toq(Map<String, f7l8> map, toq.zy zyVar, int i2, int i3, int i4) {
        f7l8 f7l8VarM12957g = C3675g.m12957g(this.f22053g, this.f65851f7l8, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zyVar.ld6();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            zyVar.wvg(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (f7l8VarM12957g != null) {
            C3675g.m12958k(spannableStringBuilder2, i2, i3, f7l8VarM12957g, this.f22056p, map, i4);
            if ("p".equals(this.f22054k)) {
                if (f7l8VarM12957g.ld6() != Float.MAX_VALUE) {
                    zyVar.m12945z((f7l8VarM12957g.ld6() * (-90.0f)) / 100.0f);
                }
                if (f7l8VarM12957g.qrj() != null) {
                    zyVar.m12943t(f7l8VarM12957g.qrj());
                }
                if (f7l8VarM12957g.m12955y() != null) {
                    zyVar.zurt(f7l8VarM12957g.m12955y());
                }
            }
        }
    }

    public static C3678q zy(@dd String str, long j2, long j3, @dd f7l8 f7l8Var, @dd String[] strArr, String str2, @dd String str3, @dd C3678q c3678q) {
        return new C3678q(str, null, j2, j3, f7l8Var, strArr, str2, str3, c3678q);
    }

    public int f7l8() {
        List<C3678q> list = this.f65853qrj;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: g */
    public C3678q m12965g(int i2) {
        List<C3678q> list = this.f65853qrj;
        if (list != null) {
            return list.get(i2);
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: k */
    public void m12966k(C3678q c3678q) {
        if (this.f65853qrj == null) {
            this.f65853qrj = new ArrayList();
        }
        this.f65853qrj.add(c3678q);
    }

    /* JADX INFO: renamed from: p */
    public long[] m12967p() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i2 = 0;
        m12964s(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i2] = it.next().longValue();
            i2++;
        }
        return jArr;
    }

    public boolean qrj(long j2) {
        long j3 = this.f22057q;
        return (j3 == C3548p.f65257toq && this.f22055n == C3548p.f65257toq) || (j3 <= j2 && this.f22055n == C3548p.f65257toq) || ((j3 == C3548p.f65257toq && j2 < this.f22055n) || (j3 <= j2 && j2 < this.f22055n));
    }

    @dd
    public String[] x2() {
        return this.f65851f7l8;
    }

    /* JADX INFO: renamed from: y */
    public List<com.google.android.exoplayer2.text.toq> m12968y(long j2, Map<String, f7l8> map, Map<String, C3677n> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        n7h(j2, this.f22059y, arrayList);
        TreeMap treeMap = new TreeMap();
        m12961h(j2, false, this.f22059y, treeMap);
        kja0(j2, map, map2, this.f22059y, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                C3677n c3677n = (C3677n) C3844k.f7l8(map2.get(pair.first));
                arrayList2.add(new toq.zy().ki(bitmapDecodeByteArray).ni7(c3677n.f65799toq).fu4(0).m12937i(c3677n.f65800zy, 0).fn3e(c3677n.f22031n).o1t(c3677n.f22029g).t8r(c3677n.f65798f7l8).jk(c3677n.f22032p).m12938k());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C3677n c3677n2 = (C3677n) C3844k.f7l8(map2.get(entry.getKey()));
            toq.zy zyVar = (toq.zy) entry.getValue();
            m12962n((SpannableStringBuilder) C3844k.f7l8(zyVar.ld6()));
            zyVar.m12937i(c3677n2.f65800zy, c3677n2.f22033q);
            zyVar.fn3e(c3677n2.f22031n);
            zyVar.ni7(c3677n2.f65799toq);
            zyVar.o1t(c3677n2.f22029g);
            zyVar.mcp(c3677n2.f22034s, c3677n2.f22035y);
            zyVar.jk(c3677n2.f22032p);
            arrayList2.add(zyVar.m12938k());
        }
        return arrayList2;
    }
}
