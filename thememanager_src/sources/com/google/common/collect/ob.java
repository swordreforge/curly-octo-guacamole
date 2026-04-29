package com.google.common.collect;

import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: SortedLists.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
@InterfaceC7731k
final class ob {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: SortedLists.java */
    static abstract class toq {
        public static final toq INVERTED_INSERTION_INDEX;
        public static final toq NEXT_HIGHER;
        public static final toq NEXT_LOWER;

        /* JADX INFO: renamed from: k */
        private static final /* synthetic */ toq[] f26499k;

        /* JADX INFO: renamed from: com.google.common.collect.ob$toq$k */
        /* JADX INFO: compiled from: SortedLists.java */
        enum C4486k extends toq {
            C4486k(String str, int i2) {
                super(str, i2);
            }

            @Override // com.google.common.collect.ob.toq
            int resultIndex(int i2) {
                return i2 - 1;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.ob$toq$toq, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SortedLists.java */
        enum C7992toq extends toq {
            C7992toq(String str, int i2) {
                super(str, i2);
            }

            @Override // com.google.common.collect.ob.toq
            public int resultIndex(int i2) {
                return i2;
            }
        }

        /* JADX INFO: compiled from: SortedLists.java */
        enum zy extends toq {
            zy(String str, int i2) {
                super(str, i2);
            }

            @Override // com.google.common.collect.ob.toq
            public int resultIndex(int i2) {
                return ~i2;
            }
        }

        static {
            C4486k c4486k = new C4486k("NEXT_LOWER", 0);
            NEXT_LOWER = c4486k;
            C7992toq c7992toq = new C7992toq("NEXT_HIGHER", 1);
            NEXT_HIGHER = c7992toq;
            zy zyVar = new zy("INVERTED_INSERTION_INDEX", 2);
            INVERTED_INSERTION_INDEX = zyVar;
            f26499k = new toq[]{c4486k, c7992toq, zyVar};
        }

        private toq(String str, int i2) {
        }

        public static toq valueOf(String str) {
            return (toq) Enum.valueOf(toq.class, str);
        }

        public static toq[] values() {
            return (toq[]) f26499k.clone();
        }

        abstract int resultIndex(int i2);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: SortedLists.java */
    static abstract class zy {
        public static final zy ANY_PRESENT;
        public static final zy FIRST_AFTER;
        public static final zy FIRST_PRESENT;
        public static final zy LAST_BEFORE;
        public static final zy LAST_PRESENT;

        /* JADX INFO: renamed from: k */
        private static final /* synthetic */ zy[] f26500k;

        /* JADX INFO: renamed from: com.google.common.collect.ob$zy$k */
        /* JADX INFO: compiled from: SortedLists.java */
        enum C4487k extends zy {
            C4487k(String str, int i2) {
                super(str, i2);
            }

            @Override // com.google.common.collect.ob.zy
            <E> int resultIndex(Comparator<? super E> comparator, E e2, List<? extends E> list, int i2) {
                return i2;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.ob$zy$n */
        /* JADX INFO: compiled from: SortedLists.java */
        enum C4488n extends zy {
            C4488n(String str, int i2) {
                super(str, i2);
            }

            @Override // com.google.common.collect.ob.zy
            public <E> int resultIndex(Comparator<? super E> comparator, E e2, List<? extends E> list, int i2) {
                return zy.FIRST_PRESENT.resultIndex(comparator, e2, list, i2) - 1;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.ob$zy$q */
        /* JADX INFO: compiled from: SortedLists.java */
        enum C4489q extends zy {
            C4489q(String str, int i2) {
                super(str, i2);
            }

            @Override // com.google.common.collect.ob.zy
            public <E> int resultIndex(Comparator<? super E> comparator, E e2, List<? extends E> list, int i2) {
                return zy.LAST_PRESENT.resultIndex(comparator, e2, list, i2) + 1;
            }
        }

        /* JADX INFO: compiled from: SortedLists.java */
        enum toq extends zy {
            toq(String str, int i2) {
                super(str, i2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.ob.zy
            <E> int resultIndex(Comparator<? super E> comparator, E e2, List<? extends E> list, int i2) {
                int size = list.size() - 1;
                while (i2 < size) {
                    int i3 = ((i2 + size) + 1) >>> 1;
                    if (comparator.compare(list.get(i3), e2) > 0) {
                        size = i3 - 1;
                    } else {
                        i2 = i3;
                    }
                }
                return i2;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.ob$zy$zy, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SortedLists.java */
        enum C7993zy extends zy {
            C7993zy(String str, int i2) {
                super(str, i2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.ob.zy
            <E> int resultIndex(Comparator<? super E> comparator, E e2, List<? extends E> list, int i2) {
                int i3 = 0;
                while (i3 < i2) {
                    int i4 = (i3 + i2) >>> 1;
                    if (comparator.compare(list.get(i4), e2) < 0) {
                        i3 = i4 + 1;
                    } else {
                        i2 = i4;
                    }
                }
                return i3;
            }
        }

        static {
            C4487k c4487k = new C4487k("ANY_PRESENT", 0);
            ANY_PRESENT = c4487k;
            toq toqVar = new toq("LAST_PRESENT", 1);
            LAST_PRESENT = toqVar;
            C7993zy c7993zy = new C7993zy("FIRST_PRESENT", 2);
            FIRST_PRESENT = c7993zy;
            C4489q c4489q = new C4489q("FIRST_AFTER", 3);
            FIRST_AFTER = c4489q;
            C4488n c4488n = new C4488n("LAST_BEFORE", 4);
            LAST_BEFORE = c4488n;
            f26500k = new zy[]{c4487k, toqVar, c7993zy, c4489q, c4488n};
        }

        private zy(String str, int i2) {
        }

        public static zy valueOf(String str) {
            return (zy) Enum.valueOf(zy.class, str);
        }

        public static zy[] values() {
            return (zy[]) f26500k.clone();
        }

        abstract <E> int resultIndex(Comparator<? super E> comparator, E e2, List<? extends E> list, int i2);
    }

    private ob() {
    }

    /* JADX INFO: renamed from: k */
    public static <E, K extends Comparable> int m15920k(List<E> list, com.google.common.base.t8r<? super E, K> t8rVar, @NullableDecl K k2, zy zyVar, toq toqVar) {
        return toq(list, t8rVar, k2, kx3.natural(), zyVar, toqVar);
    }

    /* JADX INFO: renamed from: q */
    public static <E> int m15921q(List<? extends E> list, @NullableDecl E e2, Comparator<? super E> comparator, zy zyVar, toq toqVar) {
        com.google.common.base.jk.a9(comparator);
        com.google.common.base.jk.a9(list);
        com.google.common.base.jk.a9(zyVar);
        com.google.common.base.jk.a9(toqVar);
        if (!(list instanceof RandomAccess)) {
            list = wlev.ki(list);
        }
        int i2 = 0;
        int size = list.size() - 1;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iCompare = comparator.compare(e2, list.get(i3));
            if (iCompare < 0) {
                size = i3 - 1;
            } else {
                if (iCompare <= 0) {
                    return i2 + zyVar.resultIndex(comparator, e2, list.subList(i2, size + 1), i3 - i2);
                }
                i2 = i3 + 1;
            }
        }
        return toqVar.resultIndex(i2);
    }

    public static <E, K> int toq(List<E> list, com.google.common.base.t8r<? super E, K> t8rVar, @NullableDecl K k2, Comparator<? super K> comparator, zy zyVar, toq toqVar) {
        return m15921q(wlev.jk(list, t8rVar), k2, comparator, zyVar, toqVar);
    }

    public static <E extends Comparable> int zy(List<? extends E> list, E e2, zy zyVar, toq toqVar) {
        com.google.common.base.jk.a9(e2);
        return m15921q(list, e2, kx3.natural(), zyVar, toqVar);
    }
}
