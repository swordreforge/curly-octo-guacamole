package com.android.thememanager.util;

import java.util.Calendar;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: TimeUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class v0af {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final v0af f16853k = new v0af();

    /* JADX INFO: renamed from: com.android.thememanager.util.v0af$k */
    /* JADX INFO: compiled from: TimeUtil.kt */
    public static final class C2813k {

        /* JADX INFO: renamed from: k */
        private final int f16854k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f61419toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f61420zy;

        public C2813k(int i2, int i3, int i4) {
            this.f16854k = i2;
            this.f61419toq = i3;
            this.f61420zy = i4;
        }

        /* JADX INFO: renamed from: n */
        public static /* synthetic */ C2813k m10047n(C2813k c2813k, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i2 = c2813k.f16854k;
            }
            if ((i5 & 2) != 0) {
                i3 = c2813k.f61419toq;
            }
            if ((i5 & 4) != 0) {
                i4 = c2813k.f61420zy;
            }
            return c2813k.m10051q(i2, i3, i4);
        }

        public boolean equals(@InterfaceC7395n Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2813k)) {
                return false;
            }
            C2813k c2813k = (C2813k) obj;
            return this.f16854k == c2813k.f16854k && this.f61419toq == c2813k.f61419toq && this.f61420zy == c2813k.f61420zy;
        }

        public final int f7l8() {
            return this.f61419toq;
        }

        /* JADX INFO: renamed from: g */
        public final int m10048g() {
            return this.f61420zy;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f16854k) * 31) + Integer.hashCode(this.f61419toq)) * 31) + Integer.hashCode(this.f61420zy);
        }

        /* JADX INFO: renamed from: k */
        public final int m10049k() {
            return this.f16854k;
        }

        public final boolean ld6(int i2, int i3, int i4) {
            return this.f16854k < i2 || this.f61419toq < i3 || this.f61420zy < i4;
        }

        /* JADX INFO: renamed from: p */
        public final boolean m10050p(@InterfaceC7396q C2813k timeMessage) {
            kotlin.jvm.internal.d2ok.m23075h(timeMessage, "timeMessage");
            return m10052s(timeMessage.f16854k, timeMessage.f61419toq, timeMessage.f61420zy);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public final C2813k m10051q(int i2, int i3, int i4) {
            return new C2813k(i2, i3, i4);
        }

        /* JADX INFO: renamed from: s */
        public final boolean m10052s(int i2, int i3, int i4) {
            return this.f16854k > i2 || this.f61419toq > i3 || this.f61420zy > i4;
        }

        @InterfaceC7396q
        public String toString() {
            return "TimeMessage(year=" + this.f16854k + ", month=" + this.f61419toq + ", day=" + this.f61420zy + ')';
        }

        public final int toq() {
            return this.f61419toq;
        }

        public final boolean x2(@InterfaceC7396q C2813k timeMessage) {
            kotlin.jvm.internal.d2ok.m23075h(timeMessage, "timeMessage");
            return ld6(timeMessage.f16854k, timeMessage.f61419toq, timeMessage.f61420zy);
        }

        /* JADX INFO: renamed from: y */
        public final int m10053y() {
            return this.f16854k;
        }

        public final int zy() {
            return this.f61420zy;
        }
    }

    private v0af() {
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final C2813k m10046k() {
        Calendar calendar = Calendar.getInstance();
        return new C2813k(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
    }
}
