package miuix.appcompat.app;

import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.List;

/* JADX INFO: compiled from: ShortcutsCallback.java */
/* JADX INFO: loaded from: classes3.dex */
public interface ncyb {
    /* JADX WARN: Multi-variable type inference failed */
    static boolean bek6(FragmentManager fragmentManager, MotionEvent motionEvent) {
        for (Fragment fragment : fragmentManager.fnq8()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ncyb) && ((ncyb) fragment).mo25017y(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean bo(FragmentManager fragmentManager, KeyEvent keyEvent) {
        for (Fragment fragment : fragmentManager.fnq8()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ncyb) && ((ncyb) fragment).ni7(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean h7am(FragmentManager fragmentManager, KeyEvent keyEvent) {
        for (Fragment fragment : fragmentManager.fnq8()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ncyb) && ((ncyb) fragment).i9jn(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void lh(FragmentManager fragmentManager, List<KeyboardShortcutGroup> list, Menu menu, int i2) {
        for (Fragment fragment : fragmentManager.fnq8()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ncyb)) {
                ((ncyb) fragment).onProvideKeyboardShortcuts(list, menu, i2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean nsb(FragmentManager fragmentManager, int i2, KeyEvent keyEvent) {
        for (Fragment fragment : fragmentManager.fnq8()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ncyb) && ((ncyb) fragment).onKeyUp(i2, keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean sok(FragmentManager fragmentManager, int i2, int i3, KeyEvent keyEvent) {
        for (Fragment fragment : fragmentManager.fnq8()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ncyb) && ((ncyb) fragment).onKeyMultiple(i2, i3, keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean tfm(FragmentManager fragmentManager, MotionEvent motionEvent) {
        for (Fragment fragment : fragmentManager.fnq8()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ncyb) && ((ncyb) fragment).o1t(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean wo(FragmentManager fragmentManager, int i2, KeyEvent keyEvent) {
        for (Fragment fragment : fragmentManager.fnq8()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ncyb) && ((ncyb) fragment).onKeyDown(i2, keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean wvg(FragmentManager fragmentManager, int i2, KeyEvent keyEvent) {
        for (Fragment fragment : fragmentManager.fnq8()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ncyb) && ((ncyb) fragment).onKeyLongPress(i2, keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    static boolean m25063z(FragmentManager fragmentManager, MotionEvent motionEvent) {
        for (Fragment fragment : fragmentManager.fnq8()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ncyb) && ((ncyb) fragment).fn3e(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    default boolean fn3e(MotionEvent motionEvent) {
        return false;
    }

    default boolean i9jn(KeyEvent keyEvent) {
        return false;
    }

    default boolean ni7(KeyEvent keyEvent) {
        return false;
    }

    default boolean o1t(MotionEvent motionEvent) {
        return false;
    }

    default boolean onKeyDown(int i2, KeyEvent keyEvent) {
        return false;
    }

    default boolean onKeyLongPress(int i2, KeyEvent keyEvent) {
        return false;
    }

    default boolean onKeyMultiple(int i2, int i3, KeyEvent keyEvent) {
        return false;
    }

    default boolean onKeyUp(int i2, KeyEvent keyEvent) {
        return false;
    }

    default void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
    }

    /* JADX INFO: renamed from: y */
    default boolean mo25017y(MotionEvent motionEvent) {
        return false;
    }
}
