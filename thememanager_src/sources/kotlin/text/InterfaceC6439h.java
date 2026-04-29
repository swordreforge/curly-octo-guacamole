package kotlin.text;

import java.util.List;
import kotlin.internal.InterfaceC6234g;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.text.h */
/* JADX INFO: compiled from: MatchResult.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC6439h {

    /* JADX INFO: renamed from: kotlin.text.h$k */
    /* JADX INFO: compiled from: MatchResult.kt */
    public static final class k {
        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public static toq m23529k(@InterfaceC7396q InterfaceC6439h interfaceC6439h) {
            return new toq(interfaceC6439h);
        }
    }

    /* JADX INFO: renamed from: kotlin.text.h$toq */
    /* JADX INFO: compiled from: MatchResult.kt */
    public static final class toq {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final InterfaceC6439h f36693k;

        public toq(@InterfaceC7396q InterfaceC6439h match) {
            kotlin.jvm.internal.d2ok.m23075h(match, "match");
            this.f36693k = match;
        }

        @InterfaceC6234g
        private final String f7l8() {
            return ld6().toq().get(6);
        }

        @InterfaceC6234g
        /* JADX INFO: renamed from: g */
        private final String m23530g() {
            return ld6().toq().get(5);
        }

        @InterfaceC6234g
        /* JADX INFO: renamed from: k */
        private final String m23531k() {
            return ld6().toq().get(1);
        }

        @InterfaceC6234g
        /* JADX INFO: renamed from: n */
        private final String m23532n() {
            return ld6().toq().get(4);
        }

        @InterfaceC6234g
        /* JADX INFO: renamed from: p */
        private final String m23533p() {
            return ld6().toq().get(9);
        }

        @InterfaceC6234g
        /* JADX INFO: renamed from: q */
        private final String m23534q() {
            return ld6().toq().get(3);
        }

        @InterfaceC6234g
        /* JADX INFO: renamed from: s */
        private final String m23535s() {
            return ld6().toq().get(8);
        }

        @InterfaceC6234g
        private final String toq() {
            return ld6().toq().get(10);
        }

        @InterfaceC6234g
        /* JADX INFO: renamed from: y */
        private final String m23536y() {
            return ld6().toq().get(7);
        }

        @InterfaceC6234g
        private final String zy() {
            return ld6().toq().get(2);
        }

        @InterfaceC7396q
        public final InterfaceC6439h ld6() {
            return this.f36693k;
        }

        @InterfaceC7396q
        public final List<String> x2() {
            return this.f36693k.toq().subList(1, this.f36693k.toq().size());
        }
    }

    @InterfaceC7396q
    String getValue();

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    toq mo23506k();

    @InterfaceC7395n
    InterfaceC6439h next();

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    n7h mo23507q();

    @InterfaceC7396q
    List<String> toq();

    @InterfaceC7396q
    kotlin.ranges.x2 zy();
}
