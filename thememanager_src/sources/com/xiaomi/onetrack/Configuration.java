package com.xiaomi.onetrack;

import android.text.TextUtils;
import com.xiaomi.onetrack.OneTrack;

/* JADX INFO: loaded from: classes3.dex */
public class Configuration {

    /* JADX INFO: renamed from: a */
    private String f31456a;

    /* JADX INFO: renamed from: b */
    private String f31457b;

    /* JADX INFO: renamed from: c */
    private String f31458c;

    /* JADX INFO: renamed from: d */
    private boolean f31459d;

    /* JADX INFO: renamed from: e */
    private String f31460e;

    /* JADX INFO: renamed from: f */
    private OneTrack.Mode f31461f;

    /* JADX INFO: renamed from: g */
    private boolean f31462g;

    /* JADX INFO: renamed from: h */
    private boolean f31463h;

    /* JADX INFO: renamed from: i */
    private boolean f31464i;

    /* JADX INFO: renamed from: j */
    private boolean f31465j;

    /* JADX INFO: renamed from: k */
    private boolean f31466k;

    /* JADX INFO: renamed from: l */
    private boolean f31467l;

    /* JADX INFO: renamed from: m */
    private String f31468m;

    /* JADX INFO: renamed from: n */
    private boolean f31469n;

    /* JADX INFO: renamed from: o */
    private String f31470o;

    /* JADX INFO: renamed from: p */
    private OneTrack.IEventHook f31471p;

    public static class Builder {

        /* JADX INFO: renamed from: a */
        private String f31472a;

        /* JADX INFO: renamed from: b */
        private String f31473b;

        /* JADX INFO: renamed from: c */
        private String f31474c;

        /* JADX INFO: renamed from: d */
        private boolean f31475d;

        /* JADX INFO: renamed from: e */
        private String f31476e;

        /* JADX INFO: renamed from: m */
        private String f31484m;

        /* JADX INFO: renamed from: o */
        private String f31486o;

        /* JADX INFO: renamed from: f */
        private OneTrack.Mode f31477f = OneTrack.Mode.APP;

        /* JADX INFO: renamed from: g */
        private boolean f31478g = true;

        /* JADX INFO: renamed from: h */
        private boolean f31479h = true;

        /* JADX INFO: renamed from: i */
        private boolean f31480i = true;

        /* JADX INFO: renamed from: j */
        private boolean f31481j = false;

        /* JADX INFO: renamed from: k */
        private boolean f31482k = true;

        /* JADX INFO: renamed from: l */
        private boolean f31483l = false;

        /* JADX INFO: renamed from: n */
        private boolean f31485n = false;

        public Configuration build() {
            return new Configuration(this);
        }

        public Builder setAdEventAppId(String str) {
            this.f31486o = str;
            return this;
        }

        public Builder setAppId(String str) {
            this.f31472a = str;
            return this;
        }

        public Builder setAutoTrackActivityAction(boolean z2) {
            this.f31482k = z2;
            return this;
        }

        public Builder setChannel(String str) {
            this.f31474c = str;
            return this;
        }

        public Builder setExceptionCatcherEnable(boolean z2) {
            this.f31481j = z2;
            return this;
        }

        @Deprecated
        public Builder setGAIDEnable(boolean z2) {
            this.f31478g = z2;
            return this;
        }

        public Builder setImeiEnable(boolean z2) {
            this.f31480i = z2;
            return this;
        }

        public Builder setImsiEnable(boolean z2) {
            this.f31479h = z2;
            return this;
        }

        public Builder setInstanceId(String str) {
            this.f31484m = str;
            return this;
        }

        public Builder setInternational(boolean z2) {
            this.f31475d = z2;
            return this;
        }

        public Builder setMode(OneTrack.Mode mode) {
            this.f31477f = mode;
            return this;
        }

        public Builder setOverrideMiuiRegionSetting(boolean z2) {
            this.f31483l = z2;
            return this;
        }

        public Builder setPluginId(String str) {
            this.f31473b = str;
            return this;
        }

        public Builder setRegion(String str) {
            this.f31476e = str;
            return this;
        }

        public Builder setUseCustomPrivacyPolicy(boolean z2) {
            this.f31485n = z2;
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    private String m19588a(String str) {
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(str) || str.length() <= 4) {
            sb.append(str);
        } else {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (i2 == 0 || i2 == 1 || i2 == str.length() - 2 || i2 == str.length() - 1) {
                    sb.append(str.charAt(i2));
                } else {
                    sb.append("*");
                }
            }
        }
        return sb.toString();
    }

    public String getAdEventAppId() {
        return this.f31470o;
    }

    public String getAppId() {
        return this.f31456a;
    }

    public String getChannel() {
        return this.f31458c;
    }

    public String getInstanceId() {
        return this.f31468m;
    }

    public OneTrack.Mode getMode() {
        return this.f31461f;
    }

    public String getPluginId() {
        return this.f31457b;
    }

    public String getRegion() {
        return this.f31460e;
    }

    public boolean isAutoTrackActivityAction() {
        return this.f31466k;
    }

    public boolean isExceptionCatcherEnable() {
        return this.f31465j;
    }

    @Deprecated
    public boolean isGAIDEnable() {
        return this.f31462g;
    }

    public boolean isIMEIEnable() {
        return this.f31464i;
    }

    public boolean isIMSIEnable() {
        return this.f31463h;
    }

    public boolean isInternational() {
        return this.f31459d;
    }

    public boolean isOverrideMiuiRegionSetting() {
        return this.f31467l;
    }

    public boolean isUseCustomPrivacyPolicy() {
        return this.f31469n;
    }

    public String toString() {
        try {
            return "Configuration{appId='" + m19588a(this.f31456a) + "', pluginId='" + m19588a(this.f31457b) + "', channel='" + this.f31458c + "', international=" + this.f31459d + ", region='" + this.f31460e + "', overrideMiuiRegionSetting=" + this.f31467l + ", mode=" + this.f31461f + ", GAIDEnable=" + this.f31462g + ", IMSIEnable=" + this.f31463h + ", IMEIEnable=" + this.f31464i + ", ExceptionCatcherEnable=" + this.f31465j + ", instanceId=" + m19588a(this.f31468m) + '}';
        } catch (Exception unused) {
            return "";
        }
    }

    private Configuration(Builder builder) {
        this.f31461f = OneTrack.Mode.APP;
        this.f31462g = true;
        this.f31463h = true;
        this.f31464i = true;
        this.f31466k = true;
        this.f31467l = false;
        this.f31469n = false;
        this.f31456a = builder.f31472a;
        this.f31457b = builder.f31473b;
        this.f31458c = builder.f31474c;
        this.f31459d = builder.f31475d;
        this.f31460e = builder.f31476e;
        this.f31461f = builder.f31477f;
        this.f31462g = builder.f31478g;
        this.f31464i = builder.f31480i;
        this.f31463h = builder.f31479h;
        this.f31465j = builder.f31481j;
        this.f31466k = builder.f31482k;
        this.f31467l = builder.f31483l;
        this.f31468m = builder.f31484m;
        this.f31469n = builder.f31485n;
        this.f31470o = builder.f31486o;
    }
}
