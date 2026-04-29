package com.google.common.collect;

import com.google.common.collect.o05;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: Serialization.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
final class el {

    /* JADX INFO: compiled from: Serialization.java */
    static final class toq<T> {

        /* JADX INFO: renamed from: k */
        private final Field f26093k;

        /* JADX INFO: renamed from: k */
        void m15651k(T t2, int i2) {
            try {
                this.f26093k.set(t2, Integer.valueOf(i2));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        void toq(T t2, Object obj) {
            try {
                this.f26093k.set(t2, obj);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        private toq(Field field) {
            this.f26093k = field;
            field.setAccessible(true);
        }
    }

    private el() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <E> void f7l8(o05<E> o05Var, ObjectInputStream objectInputStream, int i2) throws IOException, ClassNotFoundException {
        for (int i3 = 0; i3 < i2; i3++) {
            o05Var.add(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    /* JADX INFO: renamed from: g */
    static <E> void m15644g(o05<E> o05Var, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        f7l8(o05Var, objectInputStream, objectInputStream.readInt());
    }

    /* JADX INFO: renamed from: k */
    static <T> toq<T> m15645k(Class<T> cls, String str) {
        try {
            return new toq<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e2) {
            throw new AssertionError(e2);
        }
    }

    static <E> void ld6(o05<E> o05Var, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(o05Var.entrySet().size());
        for (o05.InterfaceC4482k<E> interfaceC4482k : o05Var.entrySet()) {
            objectOutputStream.writeObject(interfaceC4482k.getElement());
            objectOutputStream.writeInt(interfaceC4482k.getCount());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    static <K, V> void m15646n(lw<K, V> lwVar, ObjectInputStream objectInputStream, int i2) throws IOException, ClassNotFoundException {
        for (int i3 = 0; i3 < i2; i3++) {
            Collection collection = lwVar.get(objectInputStream.readObject());
            int i4 = objectInputStream.readInt();
            for (int i5 = 0; i5 < i4; i5++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    /* JADX INFO: renamed from: p */
    static <K, V> void m15647p(lw<K, V> lwVar, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(lwVar.asMap().size());
        for (Map.Entry<K, Collection<V>> entry : lwVar.asMap().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            Iterator<V> it = entry.getValue().iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: q */
    static <K, V> void m15648q(lw<K, V> lwVar, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        m15646n(lwVar, objectInputStream, objectInputStream.readInt());
    }

    /* JADX INFO: renamed from: s */
    static <K, V> void m15649s(Map<K, V> map, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    static <K, V> void toq(Map<K, V> map, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        zy(map, objectInputStream, objectInputStream.readInt());
    }

    /* JADX INFO: renamed from: y */
    static int m15650y(ObjectInputStream objectInputStream) throws IOException {
        return objectInputStream.readInt();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> void zy(Map<K, V> map, ObjectInputStream objectInputStream, int i2) throws IOException, ClassNotFoundException {
        for (int i3 = 0; i3 < i2; i3++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }
}
