package a98o;

import android.util.Pair;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: renamed from: a98o.q */
/* JADX INFO: compiled from: SerializablePair.java */
/* JADX INFO: loaded from: classes.dex */
public class C0005q<F, S> implements Serializable {
    private static final long serialVersionUID = 1;
    public final F first;
    public final S second;

    public C0005q(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public static <A, B> Pair<A, B> create(A a2, B b2) {
        return new Pair<>(a2, b2);
    }

    public boolean equals(Object o2) {
        if (!(o2 instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) o2;
        return Objects.equals(pair.first, this.first) && Objects.equals(pair.second, this.second);
    }

    public int hashCode() {
        F f2 = this.first;
        int iHashCode = f2 == null ? 0 : f2.hashCode();
        S s2 = this.second;
        return iHashCode ^ (s2 != null ? s2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.first) + " " + String.valueOf(this.second) + "}";
    }
}
