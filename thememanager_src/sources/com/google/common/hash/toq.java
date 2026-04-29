package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: AbstractCompositeHashFunction.java */
/* JADX INFO: loaded from: classes2.dex */
@Immutable
abstract class toq extends zy {

    /* JADX INFO: renamed from: q */
    private static final long f27034q = 0;

    /* JADX INFO: renamed from: k */
    final kja0[] f27035k;

    /* JADX INFO: renamed from: com.google.common.hash.toq$k */
    /* JADX INFO: compiled from: AbstractCompositeHashFunction.java */
    class C4679k implements InterfaceC4663h {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC4663h[] f27036k;

        C4679k(InterfaceC4663h[] interfaceC4663hArr) {
            this.f27036k = interfaceC4663hArr;
        }

        @Override // com.google.common.hash.InterfaceC4663h
        public n7h kja0() {
            return toq.this.toq(this.f27036k);
        }

        @Override // com.google.common.hash.InterfaceC4663h
        public <T> InterfaceC4663h n7h(T t2, x2<? super T> x2Var) {
            for (InterfaceC4663h interfaceC4663h : this.f27036k) {
                interfaceC4663h.n7h(t2, x2Var);
            }
            return this;
        }

        @Override // com.google.common.hash.mcp
        public InterfaceC4663h f7l8(byte[] bArr) {
            for (InterfaceC4663h interfaceC4663h : this.f27036k) {
                interfaceC4663h.f7l8(bArr);
            }
            return this;
        }

        @Override // com.google.common.hash.mcp
        /* JADX INFO: renamed from: g */
        public InterfaceC4663h mo16337g(long j2) {
            for (InterfaceC4663h interfaceC4663h : this.f27036k) {
                interfaceC4663h.mo16337g(j2);
            }
            return this;
        }

        @Override // com.google.common.hash.mcp
        /* JADX INFO: renamed from: k */
        public InterfaceC4663h mo16343k(double d2) {
            for (InterfaceC4663h interfaceC4663h : this.f27036k) {
                interfaceC4663h.mo16343k(d2);
            }
            return this;
        }

        @Override // com.google.common.hash.mcp
        public InterfaceC4663h ld6(byte[] bArr, int i2, int i3) {
            for (InterfaceC4663h interfaceC4663h : this.f27036k) {
                interfaceC4663h.ld6(bArr, i2, i3);
            }
            return this;
        }

        @Override // com.google.common.hash.mcp
        /* JADX INFO: renamed from: n */
        public InterfaceC4663h mo16340n(int i2) {
            for (InterfaceC4663h interfaceC4663h : this.f27036k) {
                interfaceC4663h.mo16340n(i2);
            }
            return this;
        }

        @Override // com.google.common.hash.mcp
        /* JADX INFO: renamed from: p */
        public InterfaceC4663h mo16344p(CharSequence charSequence) {
            for (InterfaceC4663h interfaceC4663h : this.f27036k) {
                interfaceC4663h.mo16344p(charSequence);
            }
            return this;
        }

        @Override // com.google.common.hash.mcp
        /* JADX INFO: renamed from: q */
        public InterfaceC4663h mo16345q(boolean z2) {
            for (InterfaceC4663h interfaceC4663h : this.f27036k) {
                interfaceC4663h.mo16345q(z2);
            }
            return this;
        }

        @Override // com.google.common.hash.mcp
        public InterfaceC4663h qrj(CharSequence charSequence, Charset charset) {
            for (InterfaceC4663h interfaceC4663h : this.f27036k) {
                interfaceC4663h.qrj(charSequence, charset);
            }
            return this;
        }

        @Override // com.google.common.hash.mcp
        /* JADX INFO: renamed from: s */
        public InterfaceC4663h mo16341s(byte b2) {
            for (InterfaceC4663h interfaceC4663h : this.f27036k) {
                interfaceC4663h.mo16341s(b2);
            }
            return this;
        }

        @Override // com.google.common.hash.mcp
        public InterfaceC4663h toq(float f2) {
            for (InterfaceC4663h interfaceC4663h : this.f27036k) {
                interfaceC4663h.toq(f2);
            }
            return this;
        }

        @Override // com.google.common.hash.mcp
        public InterfaceC4663h x2(ByteBuffer byteBuffer) {
            int iPosition = byteBuffer.position();
            for (InterfaceC4663h interfaceC4663h : this.f27036k) {
                byteBuffer.position(iPosition);
                interfaceC4663h.x2(byteBuffer);
            }
            return this;
        }

        @Override // com.google.common.hash.mcp
        /* JADX INFO: renamed from: y */
        public InterfaceC4663h mo16342y(char c2) {
            for (InterfaceC4663h interfaceC4663h : this.f27036k) {
                interfaceC4663h.mo16342y(c2);
            }
            return this;
        }

        @Override // com.google.common.hash.mcp
        public InterfaceC4663h zy(short s2) {
            for (InterfaceC4663h interfaceC4663h : this.f27036k) {
                interfaceC4663h.zy(s2);
            }
            return this;
        }
    }

    toq(kja0... kja0VarArr) {
        for (kja0 kja0Var : kja0VarArr) {
            com.google.common.base.jk.a9(kja0Var);
        }
        this.f27035k = kja0VarArr;
    }

    /* JADX INFO: renamed from: k */
    private InterfaceC4663h m16371k(InterfaceC4663h[] interfaceC4663hArr) {
        return new C4679k(interfaceC4663hArr);
    }

    @Override // com.google.common.hash.kja0
    public InterfaceC4663h newHasher() {
        int length = this.f27035k.length;
        InterfaceC4663h[] interfaceC4663hArr = new InterfaceC4663h[length];
        for (int i2 = 0; i2 < length; i2++) {
            interfaceC4663hArr[i2] = this.f27035k[i2].newHasher();
        }
        return m16371k(interfaceC4663hArr);
    }

    abstract n7h toq(InterfaceC4663h[] interfaceC4663hArr);

    @Override // com.google.common.hash.zy, com.google.common.hash.kja0
    public InterfaceC4663h newHasher(int i2) {
        com.google.common.base.jk.m15383q(i2 >= 0);
        int length = this.f27035k.length;
        InterfaceC4663h[] interfaceC4663hArr = new InterfaceC4663h[length];
        for (int i3 = 0; i3 < length; i3++) {
            interfaceC4663hArr[i3] = this.f27035k[i3].newHasher(i2);
        }
        return m16371k(interfaceC4663hArr);
    }
}
