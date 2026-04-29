package com.google.android.material.color;

import android.content.Context;
import android.util.Pair;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.material.color.n */
/* JADX INFO: compiled from: ColorResourcesTableCreator.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3984n {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final byte f67499f7l8 = 127;

    /* JADX INFO: renamed from: g */
    private static final byte f24191g = 1;

    /* JADX INFO: renamed from: k */
    private static final short f24192k = 2;

    /* JADX INFO: renamed from: n */
    private static final short f24193n = 514;

    /* JADX INFO: renamed from: q */
    private static final short f24195q = 513;

    /* JADX INFO: renamed from: s */
    private static byte f24196s = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final short f67501toq = 1;

    /* JADX INFO: renamed from: y */
    private static final String f24197y = "color";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final short f67502zy = 512;

    /* JADX INFO: renamed from: p */
    private static final q f24194p = new q(1, "android");

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final Comparator<toq> f67500ld6 = new k();

    /* JADX INFO: renamed from: com.google.android.material.color.n$f7l8 */
    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    private static class f7l8 {

        /* JADX INFO: renamed from: n */
        private static final short f24198n = 12;

        /* JADX INFO: renamed from: k */
        private final n f24199k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f67503toq;

        /* JADX INFO: renamed from: q */
        private final List<zy> f24200q = new ArrayList();

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final y f67504zy = new y(new String[0]);

        f7l8(Map<q, List<toq>> map) {
            this.f67503toq = map.size();
            for (Map.Entry<q, List<toq>> entry : map.entrySet()) {
                List<toq> value = entry.getValue();
                Collections.sort(value, C3984n.f67500ld6);
                this.f24200q.add(new zy(entry.getKey(), value));
            }
            this.f24199k = new n((short) 2, (short) 12, m14296k());
        }

        /* JADX INFO: renamed from: k */
        private int m14296k() {
            Iterator<zy> it = this.f24200q.iterator();
            int iM14309k = 0;
            while (it.hasNext()) {
                iM14309k += it.next().m14309k();
            }
            return this.f67504zy.m14308k() + 12 + iM14309k;
        }

        void toq(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f24199k.m14300k(byteArrayOutputStream);
            byteArrayOutputStream.write(C3984n.m14292p(this.f67503toq));
            this.f67504zy.zy(byteArrayOutputStream);
            Iterator<zy> it = this.f24200q.iterator();
            while (it.hasNext()) {
                it.next().toq(byteArrayOutputStream);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.color.n$g */
    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    private static class g {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final int f67505f7l8 = 16;

        /* JADX INFO: renamed from: g */
        private static final byte f24201g = 28;

        /* JADX INFO: renamed from: n */
        private static final short f24202n = 8;

        /* JADX INFO: renamed from: q */
        private static final short f24203q = 2;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final short f67506zy = 8;

        /* JADX INFO: renamed from: k */
        private final int f24204k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f67507toq;

        g(int i2, @zy.x2 int i3) {
            this.f24204k = i2;
            this.f67507toq = i3;
        }

        /* JADX INFO: renamed from: k */
        void m14297k(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(C3984n.ld6((short) 8));
            byteArrayOutputStream.write(C3984n.ld6((short) 2));
            byteArrayOutputStream.write(C3984n.m14292p(this.f24204k));
            byteArrayOutputStream.write(C3984n.ld6((short) 8));
            byteArrayOutputStream.write(new byte[]{0, 28});
            byteArrayOutputStream.write(C3984n.m14292p(this.f67507toq));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.color.n$k */
    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    class k implements Comparator<toq> {
        k() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compare(toq toqVar, toq toqVar2) {
            return toqVar.f67519zy - toqVar2.f67519zy;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.color.n$ld6 */
    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    private static class ld6 {

        /* JADX INFO: renamed from: g */
        private static final int f24205g = 1073741824;

        /* JADX INFO: renamed from: n */
        private static final short f24206n = 16;

        /* JADX INFO: renamed from: k */
        private final n f24207k;

        /* JADX INFO: renamed from: q */
        private final p f24208q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f67508toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int[] f67509zy;

        ld6(List<toq> list) {
            this.f67508toq = list.get(list.size() - 1).f67519zy + 1;
            HashSet hashSet = new HashSet();
            Iterator<toq> it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(Short.valueOf(it.next().f67519zy));
            }
            this.f67509zy = new int[this.f67508toq];
            for (short s2 = 0; s2 < this.f67508toq; s2 = (short) (s2 + 1)) {
                if (hashSet.contains(Short.valueOf(s2))) {
                    this.f67509zy[s2] = 1073741824;
                }
            }
            this.f24207k = new n(C3984n.f24193n, (short) 16, m14299k());
            this.f24208q = new p(list, hashSet, this.f67508toq);
        }

        /* JADX INFO: renamed from: k */
        private int m14299k() {
            return (this.f67508toq * 4) + 16;
        }

        int toq() {
            return m14299k() + this.f24208q.m14301k();
        }

        void zy(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f24207k.m14300k(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{C3984n.f24196s, 0, 0, 0});
            byteArrayOutputStream.write(C3984n.m14292p(this.f67508toq));
            for (int i2 : this.f67509zy) {
                byteArrayOutputStream.write(C3984n.m14292p(i2));
            }
            this.f24208q.m14302q(byteArrayOutputStream);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.color.n$n */
    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    private static class n {

        /* JADX INFO: renamed from: k */
        private final short f24209k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final short f67510toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f67511zy;

        n(short s2, short s3, int i2) {
            this.f24209k = s2;
            this.f67510toq = s3;
            this.f67511zy = i2;
        }

        /* JADX INFO: renamed from: k */
        void m14300k(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(C3984n.ld6(this.f24209k));
            byteArrayOutputStream.write(C3984n.ld6(this.f67510toq));
            byteArrayOutputStream.write(C3984n.m14292p(this.f67511zy));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.color.n$p */
    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    private static class p {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final short f67512f7l8 = 84;

        /* JADX INFO: renamed from: g */
        private static final int f24210g = -1;

        /* JADX INFO: renamed from: y */
        private static final byte f24211y = 64;

        /* JADX INFO: renamed from: k */
        private final n f24212k;

        /* JADX INFO: renamed from: n */
        private final g[] f24213n;

        /* JADX INFO: renamed from: q */
        private final int[] f24214q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f67513toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final byte[] f67514zy;

        p(List<toq> list, Set<Short> set, int i2) {
            byte[] bArr = new byte[64];
            this.f67514zy = bArr;
            this.f67513toq = i2;
            bArr[0] = 64;
            this.f24213n = new g[list.size()];
            for (int i3 = 0; i3 < list.size(); i3++) {
                this.f24213n[i3] = new g(i3, list.get(i3).f24219n);
            }
            this.f24214q = new int[i2];
            int i4 = 0;
            for (short s2 = 0; s2 < i2; s2 = (short) (s2 + 1)) {
                if (set.contains(Short.valueOf(s2))) {
                    this.f24214q[s2] = i4;
                    i4 += 16;
                } else {
                    this.f24214q[s2] = -1;
                }
            }
            this.f24212k = new n(C3984n.f24195q, f67512f7l8, m14301k());
        }

        private int toq() {
            return zy() + 84;
        }

        private int zy() {
            return this.f24214q.length * 4;
        }

        /* JADX INFO: renamed from: k */
        int m14301k() {
            return toq() + (this.f24213n.length * 16);
        }

        /* JADX INFO: renamed from: q */
        void m14302q(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f24212k.m14300k(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{C3984n.f24196s, 0, 0, 0});
            byteArrayOutputStream.write(C3984n.m14292p(this.f67513toq));
            byteArrayOutputStream.write(C3984n.m14292p(toq()));
            byteArrayOutputStream.write(this.f67514zy);
            for (int i2 : this.f24214q) {
                byteArrayOutputStream.write(C3984n.m14292p(i2));
            }
            for (g gVar : this.f24213n) {
                gVar.m14297k(byteArrayOutputStream);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.color.n$q */
    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    static class q {

        /* JADX INFO: renamed from: k */
        private final int f24215k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final String f67515toq;

        q(int i2, String str) {
            this.f24215k = i2;
            this.f67515toq = str;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.color.n$s */
    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    private static class s {

        /* JADX INFO: renamed from: k */
        private byte[] f24216k;

        /* JADX INFO: renamed from: q */
        private int f24217q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f67516toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f67517zy;

        private s() {
        }

        void toq(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(C3984n.m14292p(this.f67516toq));
            byteArrayOutputStream.write(C3984n.m14292p(this.f67517zy));
            byteArrayOutputStream.write(C3984n.m14292p(this.f24217q));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.color.n$toq */
    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    static class toq {

        /* JADX INFO: renamed from: k */
        private final byte f24218k;

        /* JADX INFO: renamed from: n */
        @zy.x2
        private final int f24219n;

        /* JADX INFO: renamed from: q */
        private final String f24220q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final byte f67518toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final short f67519zy;

        toq(int i2, String str, int i3) {
            this.f24220q = str;
            this.f24219n = i3;
            this.f67519zy = (short) (65535 & i2);
            this.f67518toq = (byte) ((i2 >> 16) & 255);
            this.f24218k = (byte) ((i2 >> 24) & 255);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.color.n$y */
    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    private static class y {

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private static final int f67520kja0 = -1;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private static final int f67521n7h = 256;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private static final short f67522qrj = 28;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private final List<Integer> f67523f7l8;

        /* JADX INFO: renamed from: g */
        private final List<Integer> f24221g;

        /* JADX INFO: renamed from: k */
        private final n f24222k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private final int f67524ld6;

        /* JADX INFO: renamed from: n */
        private final int f24223n;

        /* JADX INFO: renamed from: p */
        private final boolean f24224p;

        /* JADX INFO: renamed from: q */
        private final int f24225q;

        /* JADX INFO: renamed from: s */
        private final List<List<s>> f24226s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f67525toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private final int f67526x2;

        /* JADX INFO: renamed from: y */
        private final List<byte[]> f24227y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f67527zy;

        y(String... strArr) {
            this(false, strArr);
        }

        private Pair<byte[], List<s>> toq(String str) {
            return new Pair<>(this.f24224p ? C3984n.qrj(str) : C3984n.x2(str), Collections.emptyList());
        }

        /* JADX INFO: renamed from: k */
        int m14308k() {
            return this.f67526x2;
        }

        void zy(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f24222k.m14300k(byteArrayOutputStream);
            byteArrayOutputStream.write(C3984n.m14292p(this.f67525toq));
            byteArrayOutputStream.write(C3984n.m14292p(this.f67527zy));
            byteArrayOutputStream.write(C3984n.m14292p(this.f24224p ? 256 : 0));
            byteArrayOutputStream.write(C3984n.m14292p(this.f24225q));
            byteArrayOutputStream.write(C3984n.m14292p(this.f24223n));
            Iterator<Integer> it = this.f24221g.iterator();
            while (it.hasNext()) {
                byteArrayOutputStream.write(C3984n.m14292p(it.next().intValue()));
            }
            Iterator<Integer> it2 = this.f67523f7l8.iterator();
            while (it2.hasNext()) {
                byteArrayOutputStream.write(C3984n.m14292p(it2.next().intValue()));
            }
            Iterator<byte[]> it3 = this.f24227y.iterator();
            while (it3.hasNext()) {
                byteArrayOutputStream.write(it3.next());
            }
            int i2 = this.f67524ld6;
            if (i2 > 0) {
                byteArrayOutputStream.write(new byte[i2]);
            }
            Iterator<List<s>> it4 = this.f24226s.iterator();
            while (it4.hasNext()) {
                Iterator<s> it5 = it4.next().iterator();
                while (it5.hasNext()) {
                    it5.next().toq(byteArrayOutputStream);
                }
                byteArrayOutputStream.write(C3984n.m14292p(-1));
            }
        }

        y(boolean z2, String... strArr) {
            this.f24221g = new ArrayList();
            this.f67523f7l8 = new ArrayList();
            this.f24227y = new ArrayList();
            this.f24226s = new ArrayList();
            this.f24224p = z2;
            int length = 0;
            for (String str : strArr) {
                Pair<byte[], List<s>> qVar = toq(str);
                this.f24221g.add(Integer.valueOf(length));
                Object obj = qVar.first;
                length += ((byte[]) obj).length;
                this.f24227y.add((byte[]) obj);
                this.f24226s.add((List<s>) qVar.second);
            }
            int size = 0;
            for (List<s> list : this.f24226s) {
                for (s sVar : list) {
                    this.f24221g.add(Integer.valueOf(length));
                    length += sVar.f24216k.length;
                    this.f24227y.add(sVar.f24216k);
                }
                this.f67523f7l8.add(Integer.valueOf(size));
                size += (list.size() * 12) + 4;
            }
            int i2 = length % 4;
            int i3 = i2 == 0 ? 0 : 4 - i2;
            this.f67524ld6 = i3;
            int size2 = this.f24227y.size();
            this.f67525toq = size2;
            this.f67527zy = this.f24227y.size() - strArr.length;
            boolean z3 = this.f24227y.size() - strArr.length > 0;
            if (!z3) {
                this.f67523f7l8.clear();
                this.f24226s.clear();
            }
            int size3 = (size2 * 4) + 28 + (this.f67523f7l8.size() * 4);
            this.f24225q = size3;
            int i4 = length + i3;
            this.f24223n = z3 ? size3 + i4 : 0;
            int i5 = size3 + i4 + (z3 ? size : 0);
            this.f67526x2 = i5;
            this.f24222k = new n((short) 1, f67522qrj, i5);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.color.n$zy */
    /* JADX INFO: compiled from: ColorResourcesTableCreator.java */
    private static class zy {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final int f67528f7l8 = 128;

        /* JADX INFO: renamed from: g */
        private static final short f24228g = 288;

        /* JADX INFO: renamed from: k */
        private final n f24229k;

        /* JADX INFO: renamed from: n */
        private final ld6 f24230n;

        /* JADX INFO: renamed from: q */
        private final y f24231q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final q f67529toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final y f67530zy = new y(false, "?1", "?2", "?3", "?4", "?5", "color");

        zy(q qVar, List<toq> list) {
            this.f67529toq = qVar;
            String[] strArr = new String[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                strArr[i2] = list.get(i2).f24220q;
            }
            this.f24231q = new y(true, strArr);
            this.f24230n = new ld6(list);
            this.f24229k = new n(C3984n.f67502zy, f24228g, m14309k());
        }

        /* JADX INFO: renamed from: k */
        int m14309k() {
            return this.f67530zy.m14308k() + 288 + this.f24231q.m14308k() + this.f24230n.toq();
        }

        void toq(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f24229k.m14300k(byteArrayOutputStream);
            byteArrayOutputStream.write(C3984n.m14292p(this.f67529toq.f24215k));
            char[] charArray = this.f67529toq.f67515toq.toCharArray();
            for (int i2 = 0; i2 < 128; i2++) {
                if (i2 < charArray.length) {
                    byteArrayOutputStream.write(C3984n.m14295y(charArray[i2]));
                } else {
                    byteArrayOutputStream.write(C3984n.m14295y((char) 0));
                }
            }
            byteArrayOutputStream.write(C3984n.m14292p(288));
            byteArrayOutputStream.write(C3984n.m14292p(0));
            byteArrayOutputStream.write(C3984n.m14292p(this.f67530zy.m14308k() + 288));
            byteArrayOutputStream.write(C3984n.m14292p(0));
            byteArrayOutputStream.write(C3984n.m14292p(0));
            this.f67530zy.zy(byteArrayOutputStream);
            this.f24231q.zy(byteArrayOutputStream);
            this.f24230n.zy(byteArrayOutputStream);
        }
    }

    private C3984n() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] ld6(short s2) {
        return new byte[]{(byte) (s2 & 255), (byte) ((s2 >> 8) & 255)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static byte[] m14292p(int i2) {
        return new byte[]{(byte) (i2 & 255), (byte) ((i2 >> 8) & 255), (byte) ((i2 >> 16) & 255), (byte) ((i2 >> 24) & 255)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] qrj(String str) {
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        byte length = (byte) bytes.length;
        int length2 = bytes.length + 3;
        byte[] bArr = new byte[length2];
        System.arraycopy(bytes, 0, bArr, 2, length);
        bArr[1] = length;
        bArr[0] = length;
        bArr[length2 - 1] = 0;
        return bArr;
    }

    /* JADX INFO: renamed from: s */
    static byte[] m14294s(Context context, Map<Integer, Integer> map) throws IOException {
        q qVar;
        if (map.entrySet().isEmpty()) {
            throw new IllegalArgumentException("No color resources provided for harmonization.");
        }
        q qVar2 = new q(127, context.getPackageName());
        HashMap map2 = new HashMap();
        toq toqVar = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            toq toqVar2 = new toq(entry.getKey().intValue(), context.getResources().getResourceName(entry.getKey().intValue()), entry.getValue().intValue());
            if (!context.getResources().getResourceTypeName(entry.getKey().intValue()).equals("color")) {
                throw new IllegalArgumentException("Non color resource found: name=" + toqVar2.f24220q + ", typeId=" + Integer.toHexString(toqVar2.f67518toq & 255));
            }
            if (toqVar2.f24218k == 1) {
                qVar = f24194p;
            } else {
                if (toqVar2.f24218k != 127) {
                    throw new IllegalArgumentException("Not supported with unknown package id: " + ((int) toqVar2.f24218k));
                }
                qVar = qVar2;
            }
            if (!map2.containsKey(qVar)) {
                map2.put(qVar, new ArrayList());
            }
            ((List) map2.get(qVar)).add(toqVar2);
            toqVar = toqVar2;
        }
        byte b2 = toqVar.f67518toq;
        f24196s = b2;
        if (b2 == 0) {
            throw new IllegalArgumentException("No color resources found for harmonization.");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new f7l8(map2).toq(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] x2(String str) {
        char[] charArray = str.toCharArray();
        int length = (charArray.length * 2) + 4;
        byte[] bArr = new byte[length];
        byte[] bArrLd6 = ld6((short) charArray.length);
        bArr[0] = bArrLd6[0];
        bArr[1] = bArrLd6[1];
        for (int i2 = 0; i2 < charArray.length; i2++) {
            byte[] bArrM14295y = m14295y(charArray[i2]);
            int i3 = i2 * 2;
            bArr[i3 + 2] = bArrM14295y[0];
            bArr[i3 + 3] = bArrM14295y[1];
        }
        bArr[length - 2] = 0;
        bArr[length - 1] = 0;
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static byte[] m14295y(char c2) {
        return new byte[]{(byte) (c2 & 255), (byte) ((c2 >> '\b') & 255)};
    }
}
