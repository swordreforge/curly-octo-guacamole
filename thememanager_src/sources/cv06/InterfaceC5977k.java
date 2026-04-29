package cv06;

/* JADX INFO: renamed from: cv06.k */
/* JADX INFO: compiled from: ISuperWallpaperScene.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5977k {

    /* JADX INFO: renamed from: cv06.k$k */
    /* JADX INFO: compiled from: ISuperWallpaperScene.java */
    public interface k {

        /* JADX INFO: renamed from: cv06.k$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ISuperWallpaperScene.java */
        public enum EnumC8043k {
            SCENE_CHANGE,
            SCENE_RESUME,
            SCENE_PAUSE,
            SCENE_DESTROY
        }

        /* JADX INFO: renamed from: k */
        default void mo9489k(toq sceneType) {
        }

        /* JADX INFO: renamed from: q */
        default void mo9524q() {
        }

        default void toq() {
        }

        default void zy() {
        }
    }

    /* JADX INFO: renamed from: cv06.k$toq */
    /* JADX INFO: compiled from: ISuperWallpaperScene.java */
    public enum toq {
        AOD(0),
        LOCKSCREEN(1),
        DESKTOP(2);

        private int mIndex;

        toq(int index) {
            this.mIndex = index;
        }

        public int index() {
            return this.mIndex;
        }
    }

    void o1t(boolean isSequence);

    toq zurt();
}
