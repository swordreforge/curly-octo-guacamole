package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.InterfaceC3555s;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.tfm;
import com.google.android.exoplayer2.util.C3844k;
import com.google.common.collect.se;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: MediaItem.java */
/* JADX INFO: loaded from: classes2.dex */
public final class tfm implements InterfaceC3555s {

    /* JADX INFO: renamed from: h */
    public static final String f22140h = "";

    /* JADX INFO: renamed from: l */
    private static final int f22142l = 3;

    /* JADX INFO: renamed from: r */
    private static final int f22143r = 2;

    /* JADX INFO: renamed from: t */
    private static final int f22144t = 1;

    /* JADX INFO: renamed from: z */
    private static final int f22145z = 0;

    /* JADX INFO: renamed from: g */
    public final f7l8 f22146g;

    /* JADX INFO: renamed from: k */
    public final String f22147k;

    /* JADX INFO: renamed from: n */
    @Deprecated
    @zy.dd
    public final C3699s f22148n;

    /* JADX INFO: renamed from: p */
    @Deprecated
    public final C3696n f22149p;

    /* JADX INFO: renamed from: q */
    @zy.dd
    public final C3701y f22150q;

    /* JADX INFO: renamed from: s */
    public final C3698q f22151s;

    /* JADX INFO: renamed from: y */
    public final was f22152y;

    /* JADX INFO: renamed from: i */
    public static final tfm f22141i = new zy().m13065k();

    /* JADX INFO: renamed from: f */
    public static final InterfaceC3555s.k<tfm> f22139f = new InterfaceC3555s.k() { // from class: com.google.android.exoplayer2.qo
        @Override // com.google.android.exoplayer2.InterfaceC3555s.k
        /* JADX INFO: renamed from: k */
        public final InterfaceC3555s mo11492k(Bundle bundle) {
            return tfm.zy(bundle);
        }
    };

    /* JADX INFO: compiled from: MediaItem.java */
    public static final class f7l8 implements InterfaceC3555s {

        /* JADX INFO: renamed from: h */
        private static final int f22153h = 1;

        /* JADX INFO: renamed from: i */
        private static final int f22154i = 2;

        /* JADX INFO: renamed from: p */
        private static final int f22155p = 0;

        /* JADX INFO: renamed from: t */
        private static final int f22158t = 4;

        /* JADX INFO: renamed from: z */
        private static final int f22159z = 3;

        /* JADX INFO: renamed from: g */
        public final float f22160g;

        /* JADX INFO: renamed from: k */
        public final long f22161k;

        /* JADX INFO: renamed from: n */
        public final long f22162n;

        /* JADX INFO: renamed from: q */
        public final long f22163q;

        /* JADX INFO: renamed from: y */
        public final float f22164y;

        /* JADX INFO: renamed from: s */
        public static final f7l8 f22157s = new C3692k().m13027g();

        /* JADX INFO: renamed from: r */
        public static final InterfaceC3555s.k<f7l8> f22156r = new InterfaceC3555s.k() { // from class: com.google.android.exoplayer2.d8wk
            @Override // com.google.android.exoplayer2.InterfaceC3555s.k
            /* JADX INFO: renamed from: k */
            public final InterfaceC3555s mo11492k(Bundle bundle) {
                return tfm.f7l8.m13023q(bundle);
            }
        };

        /* JADX INFO: renamed from: com.google.android.exoplayer2.tfm$f7l8$k */
        /* JADX INFO: compiled from: MediaItem.java */
        public static final class C3692k {

            /* JADX INFO: renamed from: k */
            private long f22165k;

            /* JADX INFO: renamed from: n */
            private float f22166n;

            /* JADX INFO: renamed from: q */
            private float f22167q;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private long f65973toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            private long f65974zy;

            public C3692k f7l8(long j2) {
                this.f65974zy = j2;
                return this;
            }

            /* JADX INFO: renamed from: g */
            public f7l8 m13027g() {
                return new f7l8(this);
            }

            public C3692k ld6(long j2) {
                this.f22165k = j2;
                return this;
            }

            /* JADX INFO: renamed from: p */
            public C3692k m13028p(float f2) {
                this.f22167q = f2;
                return this;
            }

            /* JADX INFO: renamed from: s */
            public C3692k m13029s(long j2) {
                this.f65973toq = j2;
                return this;
            }

            /* JADX INFO: renamed from: y */
            public C3692k m13030y(float f2) {
                this.f22166n = f2;
                return this;
            }

            public C3692k() {
                this.f22165k = C3548p.f65257toq;
                this.f65973toq = C3548p.f65257toq;
                this.f65974zy = C3548p.f65257toq;
                this.f22167q = -3.4028235E38f;
                this.f22166n = -3.4028235E38f;
            }

            private C3692k(f7l8 f7l8Var) {
                this.f22165k = f7l8Var.f22161k;
                this.f65973toq = f7l8Var.f22163q;
                this.f65974zy = f7l8Var.f22162n;
                this.f22167q = f7l8Var.f22160g;
                this.f22166n = f7l8Var.f22164y;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public static /* synthetic */ f7l8 m13023q(Bundle bundle) {
            return new f7l8(bundle.getLong(zy(0), C3548p.f65257toq), bundle.getLong(zy(1), C3548p.f65257toq), bundle.getLong(zy(2), C3548p.f65257toq), bundle.getFloat(zy(3), -3.4028235E38f), bundle.getFloat(zy(4), -3.4028235E38f));
        }

        private static String zy(int i2) {
            return Integer.toString(i2, 36);
        }

        public boolean equals(@zy.dd Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f7l8)) {
                return false;
            }
            f7l8 f7l8Var = (f7l8) obj;
            return this.f22161k == f7l8Var.f22161k && this.f22163q == f7l8Var.f22163q && this.f22162n == f7l8Var.f22162n && this.f22160g == f7l8Var.f22160g && this.f22164y == f7l8Var.f22164y;
        }

        public int hashCode() {
            long j2 = this.f22161k;
            long j3 = this.f22163q;
            int i2 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j4 = this.f22162n;
            int i3 = (i2 + ((int) ((j4 >>> 32) ^ j4))) * 31;
            float f2 = this.f22160g;
            int iFloatToIntBits = (i3 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.f22164y;
            return iFloatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
        }

        @Override // com.google.android.exoplayer2.InterfaceC3555s
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(zy(0), this.f22161k);
            bundle.putLong(zy(1), this.f22163q);
            bundle.putLong(zy(2), this.f22162n);
            bundle.putFloat(zy(3), this.f22160g);
            bundle.putFloat(zy(4), this.f22164y);
            return bundle;
        }

        public C3692k toq() {
            return new C3692k();
        }

        private f7l8(C3692k c3692k) {
            this(c3692k.f22165k, c3692k.f65973toq, c3692k.f65974zy, c3692k.f22167q, c3692k.f22166n);
        }

        @Deprecated
        public f7l8(long j2, long j3, long j4, float f2, float f3) {
            this.f22161k = j2;
            this.f22163q = j3;
            this.f22162n = j4;
            this.f22160g = f2;
            this.f22164y = f3;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.tfm$g */
    /* JADX INFO: compiled from: MediaItem.java */
    public static final class C3693g {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public final boolean f65975f7l8;

        /* JADX INFO: renamed from: g */
        public final boolean f22168g;

        /* JADX INFO: renamed from: k */
        public final UUID f22169k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        @zy.dd
        private final byte[] f65976ld6;

        /* JADX INFO: renamed from: n */
        public final com.google.common.collect.zkd<String, String> f22170n;

        /* JADX INFO: renamed from: p */
        public final com.google.common.collect.se<Integer> f22171p;

        /* JADX INFO: renamed from: q */
        @Deprecated
        public final com.google.common.collect.zkd<String, String> f22172q;

        /* JADX INFO: renamed from: s */
        @Deprecated
        public final com.google.common.collect.se<Integer> f22173s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @Deprecated
        public final UUID f65977toq;

        /* JADX INFO: renamed from: y */
        public final boolean f22174y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @zy.dd
        public final Uri f65978zy;

        public boolean equals(@zy.dd Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3693g)) {
                return false;
            }
            C3693g c3693g = (C3693g) obj;
            return this.f22169k.equals(c3693g.f22169k) && com.google.android.exoplayer2.util.lrht.zy(this.f65978zy, c3693g.f65978zy) && com.google.android.exoplayer2.util.lrht.zy(this.f22170n, c3693g.f22170n) && this.f22168g == c3693g.f22168g && this.f22174y == c3693g.f22174y && this.f65975f7l8 == c3693g.f65975f7l8 && this.f22171p.equals(c3693g.f22171p) && Arrays.equals(this.f65976ld6, c3693g.f65976ld6);
        }

        public int hashCode() {
            int iHashCode = this.f22169k.hashCode() * 31;
            Uri uri = this.f65978zy;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f22170n.hashCode()) * 31) + (this.f22168g ? 1 : 0)) * 31) + (this.f22174y ? 1 : 0)) * 31) + (this.f65975f7l8 ? 1 : 0)) * 31) + this.f22171p.hashCode()) * 31) + Arrays.hashCode(this.f65976ld6);
        }

        public k toq() {
            return new k();
        }

        @zy.dd
        public byte[] zy() {
            byte[] bArr = this.f65976ld6;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        /* JADX INFO: renamed from: com.google.android.exoplayer2.tfm$g$k */
        /* JADX INFO: compiled from: MediaItem.java */
        public static final class k {

            /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
            private com.google.common.collect.se<Integer> f65979f7l8;

            /* JADX INFO: renamed from: g */
            private boolean f22175g;

            /* JADX INFO: renamed from: k */
            @zy.dd
            private UUID f22176k;

            /* JADX INFO: renamed from: n */
            private boolean f22177n;

            /* JADX INFO: renamed from: q */
            private boolean f22178q;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            @zy.dd
            private Uri f65980toq;

            /* JADX INFO: renamed from: y */
            @zy.dd
            private byte[] f22179y;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            private com.google.common.collect.zkd<String, String> f65981zy;

            /* JADX INFO: Access modifiers changed from: private */
            @Deprecated
            public k t8r(@zy.dd UUID uuid) {
                this.f22176k = uuid;
                return this;
            }

            public k cdj(@zy.dd String str) {
                this.f65980toq = str == null ? null : Uri.parse(str);
                return this;
            }

            public k fn3e(UUID uuid) {
                this.f22176k = uuid;
                return this;
            }

            /* JADX INFO: renamed from: h */
            public k m13038h(@zy.dd Uri uri) {
                this.f65980toq = uri;
                return this;
            }

            /* JADX INFO: renamed from: i */
            public k m13039i(boolean z2) {
                this.f22177n = z2;
                return this;
            }

            public k ki(boolean z2) {
                this.f22178q = z2;
                return this;
            }

            public k kja0(Map<String, String> map) {
                this.f65981zy = com.google.common.collect.zkd.copyOf((Map) map);
                return this;
            }

            public k ld6(boolean z2) {
                qrj(z2 ? com.google.common.collect.se.of(2, 1) : com.google.common.collect.se.of());
                return this;
            }

            public k n7h(@zy.dd byte[] bArr) {
                this.f22179y = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
                return this;
            }

            /* JADX INFO: renamed from: p */
            public C3693g m13040p() {
                return new C3693g(this);
            }

            public k qrj(List<Integer> list) {
                this.f65979f7l8 = com.google.common.collect.se.copyOf((Collection) list);
                return this;
            }

            public k x2(boolean z2) {
                this.f22175g = z2;
                return this;
            }

            public k(UUID uuid) {
                this.f22176k = uuid;
                this.f65981zy = com.google.common.collect.zkd.of();
                this.f65979f7l8 = com.google.common.collect.se.of();
            }

            @Deprecated
            private k() {
                this.f65981zy = com.google.common.collect.zkd.of();
                this.f65979f7l8 = com.google.common.collect.se.of();
            }

            private k(C3693g c3693g) {
                this.f22176k = c3693g.f22169k;
                this.f65980toq = c3693g.f65978zy;
                this.f65981zy = c3693g.f22170n;
                this.f22178q = c3693g.f22168g;
                this.f22177n = c3693g.f65975f7l8;
                this.f22175g = c3693g.f22174y;
                this.f65979f7l8 = c3693g.f22171p;
                this.f22179y = c3693g.f65976ld6;
            }
        }

        private C3693g(k kVar) {
            C3844k.m13633s((kVar.f22175g && kVar.f65980toq == null) ? false : true);
            UUID uuid = (UUID) C3844k.f7l8(kVar.f22176k);
            this.f22169k = uuid;
            this.f65977toq = uuid;
            this.f65978zy = kVar.f65980toq;
            this.f22172q = kVar.f65981zy;
            this.f22170n = kVar.f65981zy;
            this.f22168g = kVar.f22178q;
            this.f22174y = kVar.f22175g;
            this.f65975f7l8 = kVar.f22177n;
            this.f22173s = kVar.f65979f7l8;
            this.f22171p = kVar.f65979f7l8;
            this.f65976ld6 = kVar.f22179y != null ? Arrays.copyOf(kVar.f22179y, kVar.f22179y.length) : null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.tfm$n */
    /* JADX INFO: compiled from: MediaItem.java */
    @Deprecated
    public static final class C3696n extends C3698q {

        /* JADX INFO: renamed from: l */
        public static final C3696n f22188l = new C3698q.k().f7l8();

        private C3696n(C3698q.k kVar) {
            super(kVar);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.tfm$p */
    /* JADX INFO: compiled from: MediaItem.java */
    @Deprecated
    public static final class C3697p extends ld6 {
        @Deprecated
        public C3697p(Uri uri, String str, @zy.dd String str2) {
            this(uri, str, str2, 0);
        }

        @Deprecated
        public C3697p(Uri uri, String str, @zy.dd String str2, int i2) {
            this(uri, str, str2, i2, 0, null);
        }

        @Deprecated
        public C3697p(Uri uri, String str, @zy.dd String str2, int i2, int i3, @zy.dd String str3) {
            super(uri, str, str2, i2, i3, str3);
        }

        private C3697p(ld6.C3695k c3695k) {
            super(c3695k);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.tfm$q */
    /* JADX INFO: compiled from: MediaItem.java */
    public static class C3698q implements InterfaceC3555s {

        /* JADX INFO: renamed from: h */
        private static final int f22189h = 1;

        /* JADX INFO: renamed from: i */
        private static final int f22190i = 2;

        /* JADX INFO: renamed from: p */
        private static final int f22191p = 0;

        /* JADX INFO: renamed from: t */
        private static final int f22194t = 4;

        /* JADX INFO: renamed from: z */
        private static final int f22195z = 3;

        /* JADX INFO: renamed from: g */
        public final boolean f22196g;

        /* JADX INFO: renamed from: k */
        @zy.a9(from = 0)
        public final long f22197k;

        /* JADX INFO: renamed from: n */
        public final boolean f22198n;

        /* JADX INFO: renamed from: q */
        public final long f22199q;

        /* JADX INFO: renamed from: y */
        public final boolean f22200y;

        /* JADX INFO: renamed from: s */
        public static final C3698q f22193s = new k().m13054g();

        /* JADX INFO: renamed from: r */
        public static final InterfaceC3555s.k<C3696n> f22192r = new InterfaceC3555s.k() { // from class: com.google.android.exoplayer2.wo
            @Override // com.google.android.exoplayer2.InterfaceC3555s.k
            /* JADX INFO: renamed from: k */
            public final InterfaceC3555s mo11492k(Bundle bundle) {
                return tfm.C3698q.m13050q(bundle);
            }
        };

        /* JADX INFO: renamed from: com.google.android.exoplayer2.tfm$q$k */
        /* JADX INFO: compiled from: MediaItem.java */
        public static final class k {

            /* JADX INFO: renamed from: k */
            private long f22201k;

            /* JADX INFO: renamed from: n */
            private boolean f22202n;

            /* JADX INFO: renamed from: q */
            private boolean f22203q;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private long f65986toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            private boolean f65987zy;

            @Deprecated
            public C3696n f7l8() {
                return new C3696n(this);
            }

            /* JADX INFO: renamed from: g */
            public C3698q m13054g() {
                return f7l8();
            }

            public k ld6(@zy.a9(from = 0) long j2) {
                C3844k.m13629k(j2 >= 0);
                this.f22201k = j2;
                return this;
            }

            /* JADX INFO: renamed from: p */
            public k m13055p(boolean z2) {
                this.f65987zy = z2;
                return this;
            }

            /* JADX INFO: renamed from: s */
            public k m13056s(boolean z2) {
                this.f22203q = z2;
                return this;
            }

            public k x2(boolean z2) {
                this.f22202n = z2;
                return this;
            }

            /* JADX INFO: renamed from: y */
            public k m13057y(long j2) {
                C3844k.m13629k(j2 == Long.MIN_VALUE || j2 >= 0);
                this.f65986toq = j2;
                return this;
            }

            public k() {
                this.f65986toq = Long.MIN_VALUE;
            }

            private k(C3698q c3698q) {
                this.f22201k = c3698q.f22197k;
                this.f65986toq = c3698q.f22199q;
                this.f65987zy = c3698q.f22198n;
                this.f22203q = c3698q.f22196g;
                this.f22202n = c3698q.f22200y;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public static /* synthetic */ C3696n m13050q(Bundle bundle) {
            return new k().ld6(bundle.getLong(zy(0), 0L)).m13057y(bundle.getLong(zy(1), Long.MIN_VALUE)).m13055p(bundle.getBoolean(zy(2), false)).m13056s(bundle.getBoolean(zy(3), false)).x2(bundle.getBoolean(zy(4), false)).f7l8();
        }

        private static String zy(int i2) {
            return Integer.toString(i2, 36);
        }

        public boolean equals(@zy.dd Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3698q)) {
                return false;
            }
            C3698q c3698q = (C3698q) obj;
            return this.f22197k == c3698q.f22197k && this.f22199q == c3698q.f22199q && this.f22198n == c3698q.f22198n && this.f22196g == c3698q.f22196g && this.f22200y == c3698q.f22200y;
        }

        public int hashCode() {
            long j2 = this.f22197k;
            int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
            long j3 = this.f22199q;
            return ((((((i2 + ((int) ((j3 >>> 32) ^ j3))) * 31) + (this.f22198n ? 1 : 0)) * 31) + (this.f22196g ? 1 : 0)) * 31) + (this.f22200y ? 1 : 0);
        }

        @Override // com.google.android.exoplayer2.InterfaceC3555s
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(zy(0), this.f22197k);
            bundle.putLong(zy(1), this.f22199q);
            bundle.putBoolean(zy(2), this.f22198n);
            bundle.putBoolean(zy(3), this.f22196g);
            bundle.putBoolean(zy(4), this.f22200y);
            return bundle;
        }

        public k toq() {
            return new k();
        }

        private C3698q(k kVar) {
            this.f22197k = kVar.f22201k;
            this.f22199q = kVar.f65986toq;
            this.f22198n = kVar.f65987zy;
            this.f22196g = kVar.f22203q;
            this.f22200y = kVar.f22202n;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.tfm$s */
    /* JADX INFO: compiled from: MediaItem.java */
    @Deprecated
    public static final class C3699s extends C3701y {
        private C3699s(Uri uri, @zy.dd String str, @zy.dd C3693g c3693g, @zy.dd toq toqVar, List<StreamKey> list, @zy.dd String str2, com.google.common.collect.se<ld6> seVar, @zy.dd Object obj) {
            super(uri, str, c3693g, toqVar, list, str2, seVar, obj);
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static final class toq {

        /* JADX INFO: renamed from: k */
        public final Uri f22204k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @zy.dd
        public final Object f65988toq;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.tfm$toq$k */
        /* JADX INFO: compiled from: MediaItem.java */
        public static final class C3700k {

            /* JADX INFO: renamed from: k */
            private Uri f22205k;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            @zy.dd
            private Object f65989toq;

            public C3700k(Uri uri) {
                this.f22205k = uri;
            }

            /* JADX INFO: renamed from: n */
            public C3700k m13060n(@zy.dd Object obj) {
                this.f65989toq = obj;
                return this;
            }

            /* JADX INFO: renamed from: q */
            public C3700k m13061q(Uri uri) {
                this.f22205k = uri;
                return this;
            }

            public toq zy() {
                return new toq(this);
            }
        }

        public boolean equals(@zy.dd Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof toq)) {
                return false;
            }
            toq toqVar = (toq) obj;
            return this.f22204k.equals(toqVar.f22204k) && com.google.android.exoplayer2.util.lrht.zy(this.f65988toq, toqVar.f65988toq);
        }

        public int hashCode() {
            int iHashCode = this.f22204k.hashCode() * 31;
            Object obj = this.f65988toq;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }

        /* JADX INFO: renamed from: k */
        public C3700k m13058k() {
            return new C3700k(this.f22204k).m13060n(this.f65988toq);
        }

        private toq(C3700k c3700k) {
            this.f22204k = c3700k.f22205k;
            this.f65988toq = c3700k.f65989toq;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.tfm$y */
    /* JADX INFO: compiled from: MediaItem.java */
    public static class C3701y {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public final com.google.common.collect.se<ld6> f65990f7l8;

        /* JADX INFO: renamed from: g */
        @zy.dd
        public final String f22206g;

        /* JADX INFO: renamed from: k */
        public final Uri f22207k;

        /* JADX INFO: renamed from: n */
        public final List<StreamKey> f22208n;

        /* JADX INFO: renamed from: q */
        @zy.dd
        public final toq f22209q;

        /* JADX INFO: renamed from: s */
        @zy.dd
        public final Object f22210s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @zy.dd
        public final String f65991toq;

        /* JADX INFO: renamed from: y */
        @Deprecated
        public final List<C3697p> f22211y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @zy.dd
        public final C3693g f65992zy;

        public boolean equals(@zy.dd Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3701y)) {
                return false;
            }
            C3701y c3701y = (C3701y) obj;
            return this.f22207k.equals(c3701y.f22207k) && com.google.android.exoplayer2.util.lrht.zy(this.f65991toq, c3701y.f65991toq) && com.google.android.exoplayer2.util.lrht.zy(this.f65992zy, c3701y.f65992zy) && com.google.android.exoplayer2.util.lrht.zy(this.f22209q, c3701y.f22209q) && this.f22208n.equals(c3701y.f22208n) && com.google.android.exoplayer2.util.lrht.zy(this.f22206g, c3701y.f22206g) && this.f65990f7l8.equals(c3701y.f65990f7l8) && com.google.android.exoplayer2.util.lrht.zy(this.f22210s, c3701y.f22210s);
        }

        public int hashCode() {
            int iHashCode = this.f22207k.hashCode() * 31;
            String str = this.f65991toq;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            C3693g c3693g = this.f65992zy;
            int iHashCode3 = (iHashCode2 + (c3693g == null ? 0 : c3693g.hashCode())) * 31;
            toq toqVar = this.f22209q;
            int iHashCode4 = (((iHashCode3 + (toqVar == null ? 0 : toqVar.hashCode())) * 31) + this.f22208n.hashCode()) * 31;
            String str2 = this.f22206g;
            int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f65990f7l8.hashCode()) * 31;
            Object obj = this.f22210s;
            return iHashCode5 + (obj != null ? obj.hashCode() : 0);
        }

        private C3701y(Uri uri, @zy.dd String str, @zy.dd C3693g c3693g, @zy.dd toq toqVar, List<StreamKey> list, @zy.dd String str2, com.google.common.collect.se<ld6> seVar, @zy.dd Object obj) {
            this.f22207k = uri;
            this.f65991toq = str;
            this.f65992zy = c3693g;
            this.f22209q = toqVar;
            this.f22208n = list;
            this.f22206g = str2;
            this.f65990f7l8 = seVar;
            se.C4520k c4520kBuilder = com.google.common.collect.se.builder();
            for (int i2 = 0; i2 < seVar.size(); i2++) {
                c4520kBuilder.mo15569k(seVar.get(i2).m13041k().m13046s());
            }
            this.f22211y = c4520kBuilder.mo15570n();
            this.f22210s = obj;
        }
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static final class zy {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @zy.dd
        private String f65993f7l8;

        /* JADX INFO: renamed from: g */
        private List<StreamKey> f22212g;

        /* JADX INFO: renamed from: k */
        @zy.dd
        private String f22213k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        @zy.dd
        private was f65994ld6;

        /* JADX INFO: renamed from: n */
        private C3693g.k f22214n;

        /* JADX INFO: renamed from: p */
        @zy.dd
        private Object f22215p;

        /* JADX INFO: renamed from: q */
        private C3698q.k f22216q;

        /* JADX INFO: renamed from: s */
        @zy.dd
        private toq f22217s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @zy.dd
        private Uri f65995toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private f7l8.C3692k f65996x2;

        /* JADX INFO: renamed from: y */
        private com.google.common.collect.se<ld6> f22218y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @zy.dd
        private String f65997zy;

        public zy a9(was wasVar) {
            this.f65994ld6 = wasVar;
            return this;
        }

        @Deprecated
        public zy cdj(@zy.dd Uri uri) {
            this.f22214n.m13038h(uri);
            return this;
        }

        public zy d2ok(@zy.dd String str) {
            return eqxt(str == null ? null : Uri.parse(str));
        }

        @Deprecated
        public zy d3(@zy.dd List<C3697p> list) {
            this.f22218y = list != null ? com.google.common.collect.se.copyOf((Collection) list) : com.google.common.collect.se.of();
            return this;
        }

        public zy eqxt(@zy.dd Uri uri) {
            this.f65995toq = uri;
            return this;
        }

        @Deprecated
        public zy f7l8(boolean z2) {
            this.f22216q.m13056s(z2);
            return this;
        }

        @Deprecated
        public zy fn3e(boolean z2) {
            this.f22214n.ld6(z2);
            return this;
        }

        public zy fti(@zy.dd String str) {
            this.f65997zy = str;
            return this;
        }

        public zy fu4(f7l8 f7l8Var) {
            this.f65996x2 = f7l8Var.toq();
            return this;
        }

        @Deprecated
        /* JADX INFO: renamed from: g */
        public zy m13062g(long j2) {
            this.f22216q.m13057y(j2);
            return this;
        }

        public zy gvn7(List<ld6> list) {
            this.f22218y = com.google.common.collect.se.copyOf((Collection) list);
            return this;
        }

        @Deprecated
        /* JADX INFO: renamed from: h */
        public zy m13063h(@zy.dd Map<String, String> map) {
            C3693g.k kVar = this.f22214n;
            if (map == null) {
                map = com.google.common.collect.zkd.of();
            }
            kVar.kja0(map);
            return this;
        }

        @Deprecated
        /* JADX INFO: renamed from: i */
        public zy m13064i(boolean z2) {
            this.f22214n.m13039i(z2);
            return this;
        }

        public zy jk(String str) {
            this.f22213k = (String) C3844k.f7l8(str);
            return this;
        }

        public zy jp0y(@zy.dd List<StreamKey> list) {
            this.f22212g = (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(list));
            return this;
        }

        /* JADX INFO: renamed from: k */
        public tfm m13065k() {
            C3699s c3699s;
            C3844k.m13633s(this.f22214n.f65980toq == null || this.f22214n.f22176k != null);
            Uri uri = this.f65995toq;
            if (uri != null) {
                c3699s = new C3699s(uri, this.f65997zy, this.f22214n.f22176k != null ? this.f22214n.m13040p() : null, this.f22217s, this.f22212g, this.f65993f7l8, this.f22218y, this.f22215p);
            } else {
                c3699s = null;
            }
            String str = this.f22213k;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            C3696n c3696nF7l8 = this.f22216q.f7l8();
            f7l8 f7l8VarM13027g = this.f65996x2.m13027g();
            was wasVar = this.f65994ld6;
            if (wasVar == null) {
                wasVar = was.xk5;
            }
            return new tfm(str2, c3696nF7l8, c3699s, f7l8VarM13027g, wasVar);
        }

        @Deprecated
        public zy ki(@zy.dd String str) {
            this.f22214n.cdj(str);
            return this;
        }

        @Deprecated
        public zy kja0(@zy.dd byte[] bArr) {
            this.f22214n.n7h(bArr);
            return this;
        }

        public zy ld6(C3698q c3698q) {
            this.f22216q = c3698q.toq();
            return this;
        }

        @Deprecated
        public zy mcp(long j2) {
            this.f65996x2.ld6(j2);
            return this;
        }

        /* JADX INFO: renamed from: n */
        public zy m13066n(@zy.dd toq toqVar) {
            this.f22217s = toqVar;
            return this;
        }

        @Deprecated
        public zy n7h(boolean z2) {
            this.f22214n.x2(z2);
            return this;
        }

        @Deprecated
        public zy ni7(@zy.dd UUID uuid) {
            this.f22214n.t8r(uuid);
            return this;
        }

        @Deprecated
        public zy o1t(float f2) {
            this.f65996x2.m13030y(f2);
            return this;
        }

        public zy oc(@zy.dd Object obj) {
            this.f22215p = obj;
            return this;
        }

        @Deprecated
        /* JADX INFO: renamed from: p */
        public zy m13067p(boolean z2) {
            this.f22216q.x2(z2);
            return this;
        }

        @Deprecated
        /* JADX INFO: renamed from: q */
        public zy m13068q(@zy.dd String str) {
            return toq(str != null ? Uri.parse(str) : null);
        }

        public zy qrj(@zy.dd C3693g c3693g) {
            this.f22214n = c3693g != null ? c3693g.toq() : new C3693g.k();
            return this;
        }

        @Deprecated
        /* JADX INFO: renamed from: s */
        public zy m13069s(@zy.a9(from = 0) long j2) {
            this.f22216q.ld6(j2);
            return this;
        }

        @Deprecated
        /* JADX INFO: renamed from: t */
        public zy m13070t(float f2) {
            this.f65996x2.m13028p(f2);
            return this;
        }

        @Deprecated
        public zy t8r(boolean z2) {
            this.f22214n.ki(z2);
            return this;
        }

        @Deprecated
        public zy toq(@zy.dd Uri uri) {
            return zy(uri, null);
        }

        @Deprecated
        public zy wvg(long j2) {
            this.f65996x2.m13029s(j2);
            return this;
        }

        public zy x2(@zy.dd String str) {
            this.f65993f7l8 = str;
            return this;
        }

        @Deprecated
        /* JADX INFO: renamed from: y */
        public zy m13071y(boolean z2) {
            this.f22216q.m13055p(z2);
            return this;
        }

        @Deprecated
        /* JADX INFO: renamed from: z */
        public zy m13072z(long j2) {
            this.f65996x2.f7l8(j2);
            return this;
        }

        @Deprecated
        public zy zurt(@zy.dd List<Integer> list) {
            C3693g.k kVar = this.f22214n;
            if (list == null) {
                list = com.google.common.collect.se.of();
            }
            kVar.qrj(list);
            return this;
        }

        @Deprecated
        public zy zy(@zy.dd Uri uri, @zy.dd Object obj) {
            this.f22217s = uri != null ? new toq.C3700k(uri).m13060n(obj).zy() : null;
            return this;
        }

        public zy() {
            this.f22216q = new C3698q.k();
            this.f22214n = new C3693g.k();
            this.f22212g = Collections.emptyList();
            this.f22218y = com.google.common.collect.se.of();
            this.f65996x2 = new f7l8.C3692k();
        }

        private zy(tfm tfmVar) {
            C3693g.k kVar;
            this();
            this.f22216q = tfmVar.f22151s.toq();
            this.f22213k = tfmVar.f22147k;
            this.f65994ld6 = tfmVar.f22152y;
            this.f65996x2 = tfmVar.f22146g.toq();
            C3701y c3701y = tfmVar.f22150q;
            if (c3701y != null) {
                this.f65993f7l8 = c3701y.f22206g;
                this.f65997zy = c3701y.f65991toq;
                this.f65995toq = c3701y.f22207k;
                this.f22212g = c3701y.f22208n;
                this.f22218y = c3701y.f65990f7l8;
                this.f22215p = c3701y.f22210s;
                C3693g c3693g = c3701y.f65992zy;
                if (c3693g != null) {
                    kVar = c3693g.toq();
                } else {
                    kVar = new C3693g.k();
                }
                this.f22214n = kVar;
                this.f22217s = c3701y.f22209q;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private static String m13018g(int i2) {
        return Integer.toString(i2, 36);
    }

    /* JADX INFO: renamed from: n */
    public static tfm m13020n(String str) {
        return new zy().d2ok(str).m13065k();
    }

    /* JADX INFO: renamed from: q */
    public static tfm m13021q(Uri uri) {
        return new zy().eqxt(uri).m13065k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static tfm zy(Bundle bundle) {
        String str = (String) C3844k.f7l8(bundle.getString(m13018g(0), ""));
        Bundle bundle2 = bundle.getBundle(m13018g(1));
        f7l8 f7l8Var = bundle2 == null ? f7l8.f22157s : (f7l8) f7l8.f22156r.mo11492k(bundle2);
        Bundle bundle3 = bundle.getBundle(m13018g(2));
        was wasVar = bundle3 == null ? was.xk5 : (was) was.h06.mo11492k(bundle3);
        Bundle bundle4 = bundle.getBundle(m13018g(3));
        return new tfm(str, bundle4 == null ? C3696n.f22188l : (C3696n) C3698q.f22192r.mo11492k(bundle4), null, f7l8Var, wasVar);
    }

    public boolean equals(@zy.dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfm)) {
            return false;
        }
        tfm tfmVar = (tfm) obj;
        return com.google.android.exoplayer2.util.lrht.zy(this.f22147k, tfmVar.f22147k) && this.f22151s.equals(tfmVar.f22151s) && com.google.android.exoplayer2.util.lrht.zy(this.f22150q, tfmVar.f22150q) && com.google.android.exoplayer2.util.lrht.zy(this.f22146g, tfmVar.f22146g) && com.google.android.exoplayer2.util.lrht.zy(this.f22152y, tfmVar.f22152y);
    }

    public int hashCode() {
        int iHashCode = this.f22147k.hashCode() * 31;
        C3701y c3701y = this.f22150q;
        return ((((((iHashCode + (c3701y != null ? c3701y.hashCode() : 0)) * 31) + this.f22146g.hashCode()) * 31) + this.f22151s.hashCode()) * 31) + this.f22152y.hashCode();
    }

    @Override // com.google.android.exoplayer2.InterfaceC3555s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(m13018g(0), this.f22147k);
        bundle.putBundle(m13018g(1), this.f22146g.toBundle());
        bundle.putBundle(m13018g(2), this.f22152y.toBundle());
        bundle.putBundle(m13018g(3), this.f22151s.toBundle());
        return bundle;
    }

    public zy toq() {
        return new zy();
    }

    /* JADX INFO: compiled from: MediaItem.java */
    public static class ld6 {

        /* JADX INFO: renamed from: g */
        @zy.dd
        public final String f22180g;

        /* JADX INFO: renamed from: k */
        public final Uri f22181k;

        /* JADX INFO: renamed from: n */
        public final int f22182n;

        /* JADX INFO: renamed from: q */
        public final int f22183q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @zy.dd
        public final String f65982toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @zy.dd
        public final String f65983zy;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.tfm$ld6$k */
        /* JADX INFO: compiled from: MediaItem.java */
        public static final class C3695k {

            /* JADX INFO: renamed from: g */
            @zy.dd
            private String f22184g;

            /* JADX INFO: renamed from: k */
            private Uri f22185k;

            /* JADX INFO: renamed from: n */
            private int f22186n;

            /* JADX INFO: renamed from: q */
            private int f22187q;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            @zy.dd
            private String f65984toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            @zy.dd
            private String f65985zy;

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: s */
            public C3697p m13046s() {
                return new C3697p(this);
            }

            public C3695k kja0(Uri uri) {
                this.f22185k = uri;
                return this;
            }

            public C3695k ld6(@zy.dd String str) {
                this.f65985zy = str;
                return this;
            }

            public C3695k n7h(int i2) {
                this.f22187q = i2;
                return this;
            }

            /* JADX INFO: renamed from: p */
            public C3695k m13047p(@zy.dd String str) {
                this.f22184g = str;
                return this;
            }

            public C3695k qrj(int i2) {
                this.f22186n = i2;
                return this;
            }

            public C3695k x2(String str) {
                this.f65984toq = str;
                return this;
            }

            /* JADX INFO: renamed from: y */
            public ld6 m13048y() {
                return new ld6(this);
            }

            public C3695k(Uri uri) {
                this.f22185k = uri;
            }

            private C3695k(ld6 ld6Var) {
                this.f22185k = ld6Var.f22181k;
                this.f65984toq = ld6Var.f65982toq;
                this.f65985zy = ld6Var.f65983zy;
                this.f22187q = ld6Var.f22183q;
                this.f22186n = ld6Var.f22182n;
                this.f22184g = ld6Var.f22180g;
            }
        }

        public boolean equals(@zy.dd Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ld6)) {
                return false;
            }
            ld6 ld6Var = (ld6) obj;
            return this.f22181k.equals(ld6Var.f22181k) && com.google.android.exoplayer2.util.lrht.zy(this.f65982toq, ld6Var.f65982toq) && com.google.android.exoplayer2.util.lrht.zy(this.f65983zy, ld6Var.f65983zy) && this.f22183q == ld6Var.f22183q && this.f22182n == ld6Var.f22182n && com.google.android.exoplayer2.util.lrht.zy(this.f22180g, ld6Var.f22180g);
        }

        public int hashCode() {
            int iHashCode = this.f22181k.hashCode() * 31;
            String str = this.f65982toq;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f65983zy;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f22183q) * 31) + this.f22182n) * 31;
            String str3 = this.f22180g;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX INFO: renamed from: k */
        public C3695k m13041k() {
            return new C3695k();
        }

        private ld6(Uri uri, String str, @zy.dd String str2, int i2, int i3, @zy.dd String str3) {
            this.f22181k = uri;
            this.f65982toq = str;
            this.f65983zy = str2;
            this.f22183q = i2;
            this.f22182n = i3;
            this.f22180g = str3;
        }

        private ld6(C3695k c3695k) {
            this.f22181k = c3695k.f22185k;
            this.f65982toq = c3695k.f65984toq;
            this.f65983zy = c3695k.f65985zy;
            this.f22183q = c3695k.f22187q;
            this.f22182n = c3695k.f22186n;
            this.f22180g = c3695k.f22184g;
        }
    }

    private tfm(String str, C3696n c3696n, @zy.dd C3699s c3699s, f7l8 f7l8Var, was wasVar) {
        this.f22147k = str;
        this.f22150q = c3699s;
        this.f22148n = c3699s;
        this.f22146g = f7l8Var;
        this.f22152y = wasVar;
        this.f22151s = c3696n;
        this.f22149p = c3696n;
    }
}
