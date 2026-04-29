package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.collections.C6140e;
import kotlin.collections.nn86;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.collections.builders.s */
/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes3.dex */
final class C6136s implements Externalizable {

    @InterfaceC7396q
    public static final k Companion = new k(null);
    private static final long serialVersionUID = 0;

    @InterfaceC7396q
    private Map<?, ?> map;

    /* JADX INFO: renamed from: kotlin.collections.builders.s$k */
    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }
    }

    public C6136s(@InterfaceC7396q Map<?, ?> map) {
        d2ok.m23075h(map, "map");
        this.map = map;
    }

    private final Object readResolve() {
        return this.map;
    }

    @Override // java.io.Externalizable
    public void readExternal(@InterfaceC7396q ObjectInput input) throws IOException {
        d2ok.m23075h(input, "input");
        byte b2 = input.readByte();
        if (b2 != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b2));
        }
        int i2 = input.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i2 + '.');
        }
        Map mapM22482y = C6140e.m22482y(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            mapM22482y.put(input.readObject(), input.readObject());
        }
        this.map = C6140e.m22480q(mapM22482y);
    }

    @Override // java.io.Externalizable
    public void writeExternal(@InterfaceC7396q ObjectOutput output) throws IOException {
        d2ok.m23075h(output, "output");
        output.writeByte(0);
        output.writeInt(this.map.size());
        for (Map.Entry<?, ?> entry : this.map.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }

    public C6136s() {
        this(nn86.o1t());
    }
}
