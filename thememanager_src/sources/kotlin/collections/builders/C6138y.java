package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.i1;
import kotlin.collections.zurt;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.collections.builders.y */
/* JADX INFO: compiled from: ListBuilder.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/SerializedCollection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n1#2:433\n*E\n"})
public final class C6138y implements Externalizable {

    @InterfaceC7396q
    public static final k Companion = new k(null);
    private static final long serialVersionUID = 0;
    public static final int tagList = 0;
    public static final int tagSet = 1;

    @InterfaceC7396q
    private Collection<?> collection;
    private final int tag;

    /* JADX INFO: renamed from: kotlin.collections.builders.y$k */
    /* JADX INFO: compiled from: ListBuilder.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }
    }

    public C6138y(@InterfaceC7396q Collection<?> collection, int i2) {
        d2ok.m23075h(collection, "collection");
        this.collection = collection;
        this.tag = i2;
    }

    private final Object readResolve() {
        return this.collection;
    }

    @Override // java.io.Externalizable
    public void readExternal(@InterfaceC7396q ObjectInput input) throws IOException {
        Collection<?> collectionM22674k;
        d2ok.m23075h(input, "input");
        byte b2 = input.readByte();
        int i2 = b2 & 1;
        if ((b2 & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b2) + '.');
        }
        int i3 = input.readInt();
        if (i3 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i3 + '.');
        }
        int i4 = 0;
        if (i2 == 0) {
            List listM22676p = zurt.m22676p(i3);
            while (i4 < i3) {
                listM22676p.add(input.readObject());
                i4++;
            }
            collectionM22674k = zurt.m22674k(listM22676p);
        } else {
            if (i2 != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i2 + '.');
            }
            Set setM22501n = i1.m22501n(i3);
            while (i4 < i3) {
                setM22501n.add(input.readObject());
                i4++;
            }
            collectionM22674k = i1.m22500k(setM22501n);
        }
        this.collection = collectionM22674k;
    }

    @Override // java.io.Externalizable
    public void writeExternal(@InterfaceC7396q ObjectOutput output) throws IOException {
        d2ok.m23075h(output, "output");
        output.writeByte(this.tag);
        output.writeInt(this.collection.size());
        Iterator<?> it = this.collection.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }

    public C6138y() {
        this(kotlin.collections.ni7.a9(), 0);
    }
}
