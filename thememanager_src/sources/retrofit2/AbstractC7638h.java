package retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.C7534z;
import okhttp3.a9;

/* JADX INFO: renamed from: retrofit2.h */
/* JADX INFO: compiled from: ParameterHandler.java */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC7638h<T> {

    /* JADX INFO: renamed from: retrofit2.h$cdj */
    /* JADX INFO: compiled from: ParameterHandler.java */
    static final class cdj<T> extends AbstractC7638h<T> {

        /* JADX INFO: renamed from: k */
        final Class<T> f44150k;

        cdj(Class<T> cls) {
            this.f44150k = cls;
        }

        @Override // retrofit2.AbstractC7638h
        /* JADX INFO: renamed from: k */
        void mo27975k(ki kiVar, @Nullable T t2) {
            kiVar.m27996y(this.f44150k, t2);
        }
    }

    /* JADX INFO: renamed from: retrofit2.h$f7l8 */
    /* JADX INFO: compiled from: ParameterHandler.java */
    static final class f7l8<T> extends AbstractC7638h<Map<String, T>> {

        /* JADX INFO: renamed from: k */
        private final Method f44151k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f94691toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final InterfaceC7637g<T, String> f94692zy;

        f7l8(Method method, int i2, InterfaceC7637g<T, String> interfaceC7637g) {
            this.f44151k = method;
            this.f94691toq = i2;
            this.f94692zy = interfaceC7637g;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.AbstractC7638h
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void mo27975k(ki kiVar, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw C7657z.kja0(this.f44151k, this.f94691toq, "Header map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw C7657z.kja0(this.f44151k, this.f94691toq, "Header map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw C7657z.kja0(this.f44151k, this.f94691toq, "Header map contained null value for key '" + key + "'.", new Object[0]);
                }
                kiVar.toq(key, this.f94692zy.mo27951k(value));
            }
        }
    }

    /* JADX INFO: renamed from: retrofit2.h$g */
    /* JADX INFO: compiled from: ParameterHandler.java */
    static final class g<T> extends AbstractC7638h<T> {

        /* JADX INFO: renamed from: k */
        private final String f44152k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final InterfaceC7637g<T, String> f94693toq;

        g(String str, InterfaceC7637g<T, String> interfaceC7637g) {
            Objects.requireNonNull(str, "name == null");
            this.f44152k = str;
            this.f94693toq = interfaceC7637g;
        }

        @Override // retrofit2.AbstractC7638h
        /* JADX INFO: renamed from: k */
        void mo27975k(ki kiVar, @Nullable T t2) throws IOException {
            String strMo27951k;
            if (t2 == null || (strMo27951k = this.f94693toq.mo27951k(t2)) == null) {
                return;
            }
            kiVar.toq(this.f44152k, strMo27951k);
        }
    }

    /* JADX INFO: renamed from: retrofit2.h$h */
    /* JADX INFO: compiled from: ParameterHandler.java */
    static final class h extends AbstractC7638h<Object> {

        /* JADX INFO: renamed from: k */
        private final Method f44153k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f94694toq;

        h(Method method, int i2) {
            this.f44153k = method;
            this.f94694toq = i2;
        }

        @Override // retrofit2.AbstractC7638h
        /* JADX INFO: renamed from: k */
        void mo27975k(ki kiVar, @Nullable Object obj) {
            if (obj == null) {
                throw C7657z.kja0(this.f44153k, this.f94694toq, "@Url parameter is null.", new Object[0]);
            }
            kiVar.qrj(obj);
        }
    }

    /* JADX INFO: renamed from: retrofit2.h$k */
    /* JADX INFO: compiled from: ParameterHandler.java */
    class k extends AbstractC7638h<Iterable<T>> {
        k() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.AbstractC7638h
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void mo27975k(ki kiVar, @Nullable Iterable<T> iterable) throws IOException {
            if (iterable == null) {
                return;
            }
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                AbstractC7638h.this.mo27975k(kiVar, it.next());
            }
        }
    }

    /* JADX INFO: renamed from: retrofit2.h$kja0 */
    /* JADX INFO: compiled from: ParameterHandler.java */
    static final class kja0 extends AbstractC7638h<C7534z.zy> {

        /* JADX INFO: renamed from: k */
        static final kja0 f44155k = new kja0();

        private kja0() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.AbstractC7638h
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void mo27975k(ki kiVar, @Nullable C7534z.zy zyVar) {
            if (zyVar != null) {
                kiVar.m27994n(zyVar);
            }
        }
    }

    /* JADX INFO: renamed from: retrofit2.h$ld6 */
    /* JADX INFO: compiled from: ParameterHandler.java */
    static final class ld6<T> extends AbstractC7638h<T> {

        /* JADX INFO: renamed from: k */
        private final Method f44156k;

        /* JADX INFO: renamed from: n */
        private final boolean f44157n;

        /* JADX INFO: renamed from: q */
        private final InterfaceC7637g<T, String> f44158q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f94695toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final String f94696zy;

        ld6(Method method, int i2, String str, InterfaceC7637g<T, String> interfaceC7637g, boolean z2) {
            this.f44156k = method;
            this.f94695toq = i2;
            Objects.requireNonNull(str, "name == null");
            this.f94696zy = str;
            this.f44158q = interfaceC7637g;
            this.f44157n = z2;
        }

        @Override // retrofit2.AbstractC7638h
        /* JADX INFO: renamed from: k */
        void mo27975k(ki kiVar, @Nullable T t2) throws IOException {
            if (t2 != null) {
                kiVar.m27992g(this.f94696zy, this.f44158q.mo27951k(t2), this.f44157n);
                return;
            }
            throw C7657z.kja0(this.f44156k, this.f94695toq, "Path parameter \"" + this.f94696zy + "\" value must not be null.", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: retrofit2.h$n */
    /* JADX INFO: compiled from: ParameterHandler.java */
    static final class n<T> extends AbstractC7638h<Map<String, T>> {

        /* JADX INFO: renamed from: k */
        private final Method f44159k;

        /* JADX INFO: renamed from: q */
        private final boolean f44160q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f94697toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final InterfaceC7637g<T, String> f94698zy;

        n(Method method, int i2, InterfaceC7637g<T, String> interfaceC7637g, boolean z2) {
            this.f44159k = method;
            this.f94697toq = i2;
            this.f94698zy = interfaceC7637g;
            this.f44160q = z2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.AbstractC7638h
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void mo27975k(ki kiVar, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw C7657z.kja0(this.f44159k, this.f94697toq, "Field map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw C7657z.kja0(this.f44159k, this.f94697toq, "Field map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw C7657z.kja0(this.f44159k, this.f94697toq, "Field map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strMo27951k = this.f94698zy.mo27951k(value);
                if (strMo27951k == null) {
                    throw C7657z.kja0(this.f44159k, this.f94697toq, "Field map value '" + value + "' converted to null by " + this.f94698zy.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                kiVar.m27993k(key, strMo27951k, this.f44160q);
            }
        }
    }

    /* JADX INFO: renamed from: retrofit2.h$n7h */
    /* JADX INFO: compiled from: ParameterHandler.java */
    static final class n7h<T> extends AbstractC7638h<T> {

        /* JADX INFO: renamed from: k */
        private final InterfaceC7637g<T, String> f44161k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final boolean f94699toq;

        n7h(InterfaceC7637g<T, String> interfaceC7637g, boolean z2) {
            this.f44161k = interfaceC7637g;
            this.f94699toq = z2;
        }

        @Override // retrofit2.AbstractC7638h
        /* JADX INFO: renamed from: k */
        void mo27975k(ki kiVar, @Nullable T t2) throws IOException {
            if (t2 == null) {
                return;
            }
            kiVar.f7l8(this.f44161k.mo27951k(t2), null, this.f94699toq);
        }
    }

    /* JADX INFO: renamed from: retrofit2.h$p */
    /* JADX INFO: compiled from: ParameterHandler.java */
    static final class p<T> extends AbstractC7638h<Map<String, T>> {

        /* JADX INFO: renamed from: k */
        private final Method f44162k;

        /* JADX INFO: renamed from: q */
        private final String f44163q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f94700toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final InterfaceC7637g<T, a9> f94701zy;

        p(Method method, int i2, InterfaceC7637g<T, a9> interfaceC7637g, String str) {
            this.f44162k = method;
            this.f94700toq = i2;
            this.f94701zy = interfaceC7637g;
            this.f44163q = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.AbstractC7638h
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void mo27975k(ki kiVar, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw C7657z.kja0(this.f44162k, this.f94700toq, "Part map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw C7657z.kja0(this.f44162k, this.f94700toq, "Part map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw C7657z.kja0(this.f44162k, this.f94700toq, "Part map contained null value for key '" + key + "'.", new Object[0]);
                }
                kiVar.m27995q(okhttp3.fn3e.x2(com.google.common.net.zy.f68526lrht, "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.f44163q), this.f94701zy.mo27951k(value));
            }
        }
    }

    /* JADX INFO: renamed from: retrofit2.h$q */
    /* JADX INFO: compiled from: ParameterHandler.java */
    static final class q<T> extends AbstractC7638h<T> {

        /* JADX INFO: renamed from: k */
        private final String f44164k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final InterfaceC7637g<T, String> f94702toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final boolean f94703zy;

        q(String str, InterfaceC7637g<T, String> interfaceC7637g, boolean z2) {
            Objects.requireNonNull(str, "name == null");
            this.f44164k = str;
            this.f94702toq = interfaceC7637g;
            this.f94703zy = z2;
        }

        @Override // retrofit2.AbstractC7638h
        /* JADX INFO: renamed from: k */
        void mo27975k(ki kiVar, @Nullable T t2) throws IOException {
            String strMo27951k;
            if (t2 == null || (strMo27951k = this.f94702toq.mo27951k(t2)) == null) {
                return;
            }
            kiVar.m27993k(this.f44164k, strMo27951k, this.f94703zy);
        }
    }

    /* JADX INFO: renamed from: retrofit2.h$qrj */
    /* JADX INFO: compiled from: ParameterHandler.java */
    static final class qrj<T> extends AbstractC7638h<Map<String, T>> {

        /* JADX INFO: renamed from: k */
        private final Method f44165k;

        /* JADX INFO: renamed from: q */
        private final boolean f44166q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f94704toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final InterfaceC7637g<T, String> f94705zy;

        qrj(Method method, int i2, InterfaceC7637g<T, String> interfaceC7637g, boolean z2) {
            this.f44165k = method;
            this.f94704toq = i2;
            this.f94705zy = interfaceC7637g;
            this.f44166q = z2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.AbstractC7638h
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void mo27975k(ki kiVar, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw C7657z.kja0(this.f44165k, this.f94704toq, "Query map was null", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw C7657z.kja0(this.f44165k, this.f94704toq, "Query map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw C7657z.kja0(this.f44165k, this.f94704toq, "Query map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strMo27951k = this.f94705zy.mo27951k(value);
                if (strMo27951k == null) {
                    throw C7657z.kja0(this.f44165k, this.f94704toq, "Query map value '" + value + "' converted to null by " + this.f94705zy.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                kiVar.f7l8(key, strMo27951k, this.f44166q);
            }
        }
    }

    /* JADX INFO: renamed from: retrofit2.h$s */
    /* JADX INFO: compiled from: ParameterHandler.java */
    static final class s<T> extends AbstractC7638h<T> {

        /* JADX INFO: renamed from: k */
        private final Method f44167k;

        /* JADX INFO: renamed from: q */
        private final InterfaceC7637g<T, a9> f44168q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f94706toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final okhttp3.fn3e f94707zy;

        s(Method method, int i2, okhttp3.fn3e fn3eVar, InterfaceC7637g<T, a9> interfaceC7637g) {
            this.f44167k = method;
            this.f94706toq = i2;
            this.f94707zy = fn3eVar;
            this.f44168q = interfaceC7637g;
        }

        @Override // retrofit2.AbstractC7638h
        /* JADX INFO: renamed from: k */
        void mo27975k(ki kiVar, @Nullable T t2) {
            if (t2 == null) {
                return;
            }
            try {
                kiVar.m27995q(this.f94707zy, this.f44168q.mo27951k(t2));
            } catch (IOException e2) {
                throw C7657z.kja0(this.f44167k, this.f94706toq, "Unable to convert " + t2 + " to RequestBody", e2);
            }
        }
    }

    /* JADX INFO: renamed from: retrofit2.h$toq */
    /* JADX INFO: compiled from: ParameterHandler.java */
    class toq extends AbstractC7638h<Object> {
        toq() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.AbstractC7638h
        /* JADX INFO: renamed from: k */
        void mo27975k(ki kiVar, @Nullable Object obj) throws IOException {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i2 = 0; i2 < length; i2++) {
                AbstractC7638h.this.mo27975k(kiVar, Array.get(obj, i2));
            }
        }
    }

    /* JADX INFO: renamed from: retrofit2.h$x2 */
    /* JADX INFO: compiled from: ParameterHandler.java */
    static final class x2<T> extends AbstractC7638h<T> {

        /* JADX INFO: renamed from: k */
        private final String f44170k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final InterfaceC7637g<T, String> f94708toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final boolean f94709zy;

        x2(String str, InterfaceC7637g<T, String> interfaceC7637g, boolean z2) {
            Objects.requireNonNull(str, "name == null");
            this.f44170k = str;
            this.f94708toq = interfaceC7637g;
            this.f94709zy = z2;
        }

        @Override // retrofit2.AbstractC7638h
        /* JADX INFO: renamed from: k */
        void mo27975k(ki kiVar, @Nullable T t2) throws IOException {
            String strMo27951k;
            if (t2 == null || (strMo27951k = this.f94708toq.mo27951k(t2)) == null) {
                return;
            }
            kiVar.f7l8(this.f44170k, strMo27951k, this.f94709zy);
        }
    }

    /* JADX INFO: renamed from: retrofit2.h$y */
    /* JADX INFO: compiled from: ParameterHandler.java */
    static final class y extends AbstractC7638h<okhttp3.fn3e> {

        /* JADX INFO: renamed from: k */
        private final Method f44171k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f94710toq;

        y(Method method, int i2) {
            this.f44171k = method;
            this.f94710toq = i2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.AbstractC7638h
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void mo27975k(ki kiVar, @Nullable okhttp3.fn3e fn3eVar) {
            if (fn3eVar == null) {
                throw C7657z.kja0(this.f44171k, this.f94710toq, "Headers parameter must not be null.", new Object[0]);
            }
            kiVar.zy(fn3eVar);
        }
    }

    /* JADX INFO: renamed from: retrofit2.h$zy */
    /* JADX INFO: compiled from: ParameterHandler.java */
    static final class zy<T> extends AbstractC7638h<T> {

        /* JADX INFO: renamed from: k */
        private final Method f44172k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f94711toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final InterfaceC7637g<T, a9> f94712zy;

        zy(Method method, int i2, InterfaceC7637g<T, a9> interfaceC7637g) {
            this.f44172k = method;
            this.f94711toq = i2;
            this.f94712zy = interfaceC7637g;
        }

        @Override // retrofit2.AbstractC7638h
        /* JADX INFO: renamed from: k */
        void mo27975k(ki kiVar, @Nullable T t2) {
            if (t2 == null) {
                throw C7657z.kja0(this.f44172k, this.f94711toq, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                kiVar.x2(this.f94712zy.mo27951k(t2));
            } catch (IOException e2) {
                throw C7657z.m28020h(this.f44172k, e2, this.f94711toq, "Unable to convert " + t2 + " to RequestBody", new Object[0]);
            }
        }
    }

    AbstractC7638h() {
    }

    /* JADX INFO: renamed from: k */
    abstract void mo27975k(ki kiVar, @Nullable T t2) throws IOException;

    final AbstractC7638h<Object> toq() {
        return new toq();
    }

    final AbstractC7638h<Iterable<T>> zy() {
        return new k();
    }
}
