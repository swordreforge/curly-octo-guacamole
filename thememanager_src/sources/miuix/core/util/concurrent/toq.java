package miuix.core.util.concurrent;

/* JADX INFO: compiled from: Queue.java */
/* JADX INFO: loaded from: classes3.dex */
public interface toq<T> {

    /* JADX INFO: renamed from: miuix.core.util.concurrent.toq$k */
    /* JADX INFO: compiled from: Queue.java */
    public interface InterfaceC7076k<T> {
        boolean apply(T t2);
    }

    int clear();

    T get();

    boolean isEmpty();

    /* JADX INFO: renamed from: k */
    int mo25526k();

    boolean put(T t2);

    boolean remove(T t2);

    int toq(InterfaceC7076k<T> interfaceC7076k);
}
