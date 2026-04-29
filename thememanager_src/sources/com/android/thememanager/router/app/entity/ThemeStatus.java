package com.android.thememanager.router.app.entity;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public class ThemeStatus {
    public static final int STATUS_COMPLETE = 255;
    public int maxProgress;
    public int progress;
    public int status;
    public String taskId;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Apply {
        public static final int APPLYING = 96;
        public static final int END = 99;
        public static final int FAIL = 97;
        public static final int SUCCESS = 98;
    }

    public @interface Buy {
        public static final int BUYING = 112;
        public static final int FAIL = 113;
        public static final int SUCCESS = 114;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface CheckRights {
        public static final int CHECKING = 80;
        public static final int FAIL = 81;
        public static final int SUCCESS = 82;
    }

    public @interface Default {
        public static final int DEFAULT = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Download {
        public static final int DOWNLOADING = 32;
        public static final int DOWNLOAD_PAUSE = 35;
        public static final int FAIL = 33;
        public static final int START_DOWNLOAD = 36;
        public static final int SUCCESS = 34;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FetchRights {
        public static final int FAIL = 65;
        public static final int FETCHING = 64;
        public static final int SUCCESS = 66;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Import {
        public static final int FAIL = 49;
        public static final int IMPORTING = 48;
        public static final int SUCCESS = 50;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Login {
        public static final int FAIL = 129;
        public static final int LOGGING = 128;
        public static final int SUCCESS = 130;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Purchase {
        public static final int FAIL = 17;
        public static final int PURCHASING = 16;
        public static final int SUCCESS = 18;
    }

    public @interface Redeem {
        public static final int REDEEMING = 160;
    }

    public @interface Try {
        public static final int BEGIN = 145;
        public static final int END = 146;
        public static final int TRYING = 144;
    }

    public ThemeStatus(String taskId) {
        this.taskId = taskId;
    }

    public int getProgress() {
        int i2 = this.maxProgress;
        if (i2 > 0) {
            return (int) ((((double) this.progress) / ((double) i2)) * 100.0d);
        }
        return 0;
    }
}
