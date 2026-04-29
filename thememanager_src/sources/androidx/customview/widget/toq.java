package androidx.customview.widget;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: FocusStrategy.java */
/* JADX INFO: loaded from: classes.dex */
class toq {

    /* JADX INFO: renamed from: androidx.customview.widget.toq$k */
    /* JADX INFO: compiled from: FocusStrategy.java */
    public interface InterfaceC0780k<T> {
        /* JADX INFO: renamed from: k */
        void mo3732k(T t2, Rect rect);
    }

    /* JADX INFO: renamed from: androidx.customview.widget.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FocusStrategy.java */
    public interface InterfaceC7876toq<T, V> {
        /* JADX INFO: renamed from: k */
        V mo3733k(T t2, int i2);

        int toq(T t2);
    }

    /* JADX INFO: compiled from: FocusStrategy.java */
    private static class zy<T> implements Comparator<T> {

        /* JADX INFO: renamed from: g */
        private final InterfaceC0780k<T> f4345g;

        /* JADX INFO: renamed from: n */
        private final boolean f4347n;

        /* JADX INFO: renamed from: k */
        private final Rect f4346k = new Rect();

        /* JADX INFO: renamed from: q */
        private final Rect f4348q = new Rect();

        zy(boolean z2, InterfaceC0780k<T> interfaceC0780k) {
            this.f4347n = z2;
            this.f4345g = interfaceC0780k;
        }

        @Override // java.util.Comparator
        public int compare(T t2, T t3) {
            Rect rect = this.f4346k;
            Rect rect2 = this.f4348q;
            this.f4345g.mo3732k(t2, rect);
            this.f4345g.mo3732k(t3, rect2);
            int i2 = rect.top;
            int i3 = rect2.top;
            if (i2 < i3) {
                return -1;
            }
            if (i2 > i3) {
                return 1;
            }
            int i4 = rect.left;
            int i5 = rect2.left;
            if (i4 < i5) {
                return this.f4347n ? 1 : -1;
            }
            if (i4 > i5) {
                return this.f4347n ? -1 : 1;
            }
            int i6 = rect.bottom;
            int i7 = rect2.bottom;
            if (i6 < i7) {
                return -1;
            }
            if (i6 > i7) {
                return 1;
            }
            int i8 = rect.right;
            int i9 = rect2.right;
            if (i8 < i9) {
                return this.f4347n ? 1 : -1;
            }
            if (i8 > i9) {
                return this.f4347n ? -1 : 1;
            }
            return 0;
        }
    }

    private toq() {
    }

    private static int f7l8(int i2, int i3) {
        return (i2 * 13 * i2) + (i3 * i3);
    }

    /* JADX INFO: renamed from: g */
    private static <T> T m3757g(T t2, ArrayList<T> arrayList, boolean z2) {
        int size = arrayList.size();
        int iIndexOf = (t2 == null ? size : arrayList.indexOf(t2)) - 1;
        if (iIndexOf >= 0) {
            return arrayList.get(iIndexOf);
        }
        if (!z2 || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* JADX INFO: renamed from: k */
    private static boolean m3758k(int i2, @lvui Rect rect, @lvui Rect rect2, @lvui Rect rect3) {
        boolean qVar = toq(i2, rect, rect2);
        if (toq(i2, rect, rect3) || !qVar) {
            return false;
        }
        return !m3760p(i2, rect, rect3) || i2 == 17 || i2 == 66 || ld6(i2, rect, rect2) < qrj(i2, rect, rect3);
    }

    private static int kja0(int i2, @lvui Rect rect, @lvui Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }

    private static int ld6(int i2, @lvui Rect rect, @lvui Rect rect2) {
        return Math.max(0, x2(i2, rect, rect2));
    }

    /* JADX INFO: renamed from: n */
    private static <T> T m3759n(T t2, ArrayList<T> arrayList, boolean z2) {
        int size = arrayList.size();
        int iLastIndexOf = (t2 == null ? -1 : arrayList.lastIndexOf(t2)) + 1;
        if (iLastIndexOf < size) {
            return arrayList.get(iLastIndexOf);
        }
        if (!z2 || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    private static int n7h(int i2, @lvui Rect rect, @lvui Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.left;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.top;
        } else if (i2 == 66) {
            i3 = rect2.right;
            i4 = rect.right;
        } else {
            if (i2 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i3 = rect2.bottom;
            i4 = rect.bottom;
        }
        return i3 - i4;
    }

    /* JADX INFO: renamed from: p */
    private static boolean m3760p(int i2, @lvui Rect rect, @lvui Rect rect2) {
        if (i2 == 17) {
            return rect.left >= rect2.right;
        }
        if (i2 == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i2 == 66) {
            return rect.right <= rect2.left;
        }
        if (i2 == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* JADX INFO: renamed from: q */
    public static <L, T> T m3761q(@lvui L l2, @lvui InterfaceC7876toq<L, T> interfaceC7876toq, @lvui InterfaceC0780k<T> interfaceC0780k, @dd T t2, int i2, boolean z2, boolean z3) {
        int qVar = interfaceC7876toq.toq(l2);
        ArrayList arrayList = new ArrayList(qVar);
        for (int i3 = 0; i3 < qVar; i3++) {
            arrayList.add(interfaceC7876toq.mo3733k(l2, i3));
        }
        Collections.sort(arrayList, new zy(z2, interfaceC0780k));
        if (i2 == 1) {
            return (T) m3757g(t2, arrayList, z3);
        }
        if (i2 == 2) {
            return (T) m3759n(t2, arrayList, z3);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    private static int qrj(int i2, @lvui Rect rect, @lvui Rect rect2) {
        return Math.max(1, n7h(i2, rect, rect2));
    }

    /* JADX INFO: renamed from: s */
    private static boolean m3762s(@lvui Rect rect, @lvui Rect rect2, int i2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            return (i3 > i4 || rect.left >= i4) && rect.left > rect2.left;
        }
        if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            return (i5 > i6 || rect.top >= i6) && rect.top > rect2.top;
        }
        if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            return (i7 < i8 || rect.right <= i8) && rect.right < rect2.right;
        }
        if (i2 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        return (i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom;
    }

    private static boolean toq(int i2, @lvui Rect rect, @lvui Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    private static int x2(int i2, @lvui Rect rect, @lvui Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else {
            if (i2 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i3 = rect2.top;
            i4 = rect.bottom;
        }
        return i3 - i4;
    }

    /* JADX INFO: renamed from: y */
    private static boolean m3763y(int i2, @lvui Rect rect, @lvui Rect rect2, @lvui Rect rect3) {
        if (!m3762s(rect, rect2, i2)) {
            return false;
        }
        if (m3762s(rect, rect3, i2) && !m3758k(i2, rect, rect2, rect3)) {
            return !m3758k(i2, rect, rect3, rect2) && f7l8(ld6(i2, rect, rect2), kja0(i2, rect, rect2)) < f7l8(ld6(i2, rect, rect3), kja0(i2, rect, rect3));
        }
        return true;
    }

    public static <L, T> T zy(@lvui L l2, @lvui InterfaceC7876toq<L, T> interfaceC7876toq, @lvui InterfaceC0780k<T> interfaceC0780k, @dd T t2, @lvui Rect rect, int i2) {
        Rect rect2 = new Rect(rect);
        if (i2 == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i2 == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i2 == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else {
            if (i2 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect2.offset(0, -(rect.height() + 1));
        }
        T t3 = null;
        int qVar = interfaceC7876toq.toq(l2);
        Rect rect3 = new Rect();
        for (int i3 = 0; i3 < qVar; i3++) {
            T tMo3733k = interfaceC7876toq.mo3733k(l2, i3);
            if (tMo3733k != t2) {
                interfaceC0780k.mo3732k(tMo3733k, rect3);
                if (m3763y(i2, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t3 = tMo3733k;
                }
            }
        }
        return t3;
    }
}
