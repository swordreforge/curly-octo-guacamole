package com.xiaomi.analytics;

/* JADX INFO: loaded from: classes3.dex */
public class Actions {
    public static AdAction newAdAction(String str) {
        return new AdAction(str);
    }

    public static CustomAction newCustomAction() {
        return new CustomAction();
    }

    public static EventAction newEventAction(String str) {
        return new EventAction(str);
    }

    public static AdAction newAdAction(String str, String str2) {
        return new AdAction(str, str2);
    }

    public static EventAction newEventAction(String str, String str2) {
        return new EventAction(str, str2);
    }
}
