package com.miui.maml.compat;

import com.miui.maml.ScreenElementRoot;
import com.miui.maml.util.MamlLog;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class AwesomeClockCompat {
    private static final String AWESOME = "awesome";
    private static final String LOG_TAG = "AwesomeClockCompat";
    private static final int MINUTE_IN_MILLIS = 60000;
    private static final String ROOT_TAG = "clock";
    private static final int SECOND_IN_MILLIS = 1000;
    private static final String TYPE_ATTR_NAME = "type";
    private static final String UPDATE_INTERVAL_TAG = "update_interval";

    public static void compatClock(Element element, ScreenElementRoot screenElementRoot) {
        int i2;
        screenElementRoot.setScaleByDensity(true);
        try {
            i2 = Integer.parseInt(element.getAttribute(UPDATE_INTERVAL_TAG));
        } catch (Exception e2) {
            MamlLog.m17851e(LOG_TAG, "compatClock error" + e2);
            i2 = 60000;
        }
        screenElementRoot.setDefaultFramerate(1000.0f / i2);
    }

    public static boolean isAwesomeClock(Element element, String str) {
        return ROOT_TAG.equalsIgnoreCase(str) && AWESOME.equalsIgnoreCase(element.getAttribute("type"));
    }
}
