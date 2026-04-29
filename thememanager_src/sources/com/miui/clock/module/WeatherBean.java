package com.miui.clock.module;

import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.miui.clock.C5049g;
import miuix.pickerwidget.date.C7230k;

/* JADX INFO: loaded from: classes3.dex */
public class WeatherBean {
    private static final String FEEL_TEMPERATURE = "feel_temperature";
    private static final String TAG = "WeatherBean";
    private static final int TEMPERATURE_UNIT_DEGREE_CELSIUS = 1;
    private static final int TEMPERATURE_UNIT_FAHRENHEIT_SCALE = 0;
    private static final String WEATHER_TEMPERATURE = "weather_temperature";
    private int UVILevel;
    private int aqiLevel;
    private String description;
    private boolean feelTemperatureValid;
    private int humidity;
    private int pressure;
    private String rainProbability = "--";
    private int rainProbabilityInt;
    private int somatosensoryTemperature;
    private int sunriseHour;
    private int sunriseHourTomorrow;
    private int sunriseMin;
    private int sunriseMinTomorrow;
    private int sunsetHour;
    private int sunsetMin;
    private int temperature;
    private int temperatureUnit;
    private boolean temperatureValid;
    private long updateTime;
    private int weatherType;
    private float windAngel;
    private String windStrength;

    private static String convertSpeedToLevelDesc(float f2) {
        return f2 < 0.0f ? "" : f2 < 6.0f ? "1" : f2 < 12.0f ? "2" : f2 < 20.0f ? "3" : f2 < 29.0f ? "4" : f2 < 39.0f ? "5" : f2 < 50.0f ? "6" : f2 < 62.0f ? "7" : f2 < 75.0f ? "8" : f2 < 89.0f ? "9" : f2 < 103.0f ? InterfaceC1925p.jvci : f2 < 117.0f ? "11" : "12";
    }

    public static int getSomatosensoryEmptyResId(int i2) {
        return (i2 == 24 || i2 == 25) ? C5049g.n.td : C5049g.n.w0;
    }

    private void setTemperatureDataValid(String str, boolean z2) {
        if (TextUtils.equals(str, WEATHER_TEMPERATURE)) {
            setTemperatureValid(z2);
        } else if (TextUtils.equals(str, FEEL_TEMPERATURE)) {
            setFeelTemperatureValid(z2);
        }
    }

    public String getAQILevel() {
        return String.valueOf(this.aqiLevel);
    }

    public String getDescription() {
        return this.description;
    }

    public boolean getFeelTemperatureValid() {
        return this.feelTemperatureValid;
    }

    public int getHumidity() {
        return this.humidity;
    }

    public int getIconResId(boolean z2, boolean z3) {
        switch (this.weatherType) {
            case 1:
                return z2 ? z3 ? C5049g.n.mn : C5049g.n.c4 : z3 ? C5049g.n.a5rs : C5049g.n.n358;
            case 2:
                return C5049g.n.p1t5;
            case 3:
                return z2 ? z3 ? C5049g.n.fai : C5049g.n.crha : z3 ? C5049g.n.fm : C5049g.n.mc;
            case 4:
            case 5:
            case 6:
            case 9:
                return C5049g.n.zalf;
            case 7:
                return z3 ? C5049g.n.mqs : C5049g.n.rb7;
            case 8:
            case 11:
                return C5049g.n.ffy;
            case 10:
                return C5049g.n.aq2a;
            case 12:
            case 25:
                return C5049g.n.ebaq;
            case 13:
            case 15:
                return z3 ? C5049g.n.m4ll : C5049g.n.fjcj;
            case 14:
            case 17:
                return C5049g.n.f1;
            case 16:
                return z3 ? C5049g.n.dhzo : C5049g.n.ue;
            case 18:
            case 19:
            case 20:
            case 21:
                return z3 ? C5049g.n.wutb : C5049g.n.lz;
            case 22:
                return C5049g.n.bbg;
            case 23:
                return z3 ? C5049g.n.cun : C5049g.n.t57j;
            case 24:
                return z3 ? C5049g.n.w6w4 : C5049g.n.p68f;
            default:
                return z2 ? C5049g.n.l0u : C5049g.n.ym8;
        }
    }

    public int getPressure() {
        return this.pressure;
    }

    public int getPressureIconResId() {
        int i2 = this.pressure;
        return i2 < 1013 ? C5049g.n.yh8z : i2 > 1013 ? C5049g.n.g8 : C5049g.n.lm5;
    }

    public String getPressureString() {
        return String.valueOf(this.pressure);
    }

    public String getRainProbability() {
        return this.rainProbability;
    }

    public int getRainProbabilityInt() {
        return this.rainProbabilityInt;
    }

    public int getSomatosensoryResId(int i2) {
        if (i2 == 24 || i2 == 25) {
            int i3 = this.somatosensoryTemperature;
            return i3 > 25 ? C5049g.n.gl8t : i3 <= 17 ? C5049g.n.bv : C5049g.n.xx;
        }
        int i4 = this.somatosensoryTemperature;
        return i4 > 25 ? C5049g.n.w2bz : i4 <= 17 ? C5049g.n.wqg : C5049g.n.vf;
    }

    public int getSomatosensoryTemperature() {
        return this.somatosensoryTemperature;
    }

    public String getSomatosensoryTemperatureWithUnit() {
        return this.somatosensoryTemperature + "℃";
    }

    public int getSunriseMinuteTime() {
        return (this.sunriseHour * 60) + this.sunriseMin;
    }

    public String getSunriseTimeString() {
        Object objValueOf;
        StringBuilder sb = new StringBuilder();
        sb.append(this.sunriseHour);
        sb.append(":");
        int i2 = this.sunriseMin;
        if (i2 < 10) {
            objValueOf = "0" + this.sunriseMin;
        } else {
            objValueOf = Integer.valueOf(i2);
        }
        sb.append(objValueOf);
        return sb.toString();
    }

    public int getSunriseTomorrowMinuteTime() {
        return (this.sunriseHour * 60) + this.sunriseMin;
    }

    public String getSunriseTomorrowTimeString() {
        Object objValueOf;
        StringBuilder sb = new StringBuilder();
        sb.append(this.sunriseHourTomorrow);
        sb.append(":");
        int i2 = this.sunriseMinTomorrow;
        if (i2 < 10) {
            objValueOf = "0" + this.sunriseMinTomorrow;
        } else {
            objValueOf = Integer.valueOf(i2);
        }
        sb.append(objValueOf);
        return sb.toString();
    }

    public int getSunsetMinuteTime() {
        return (this.sunsetHour * 60) + this.sunsetMin;
    }

    public String getSunsetTimeString() {
        Object objValueOf;
        StringBuilder sb = new StringBuilder();
        sb.append(this.sunsetHour);
        sb.append(":");
        int i2 = this.sunsetMin;
        if (i2 < 10) {
            objValueOf = "0" + this.sunsetMin;
        } else {
            objValueOf = Integer.valueOf(i2);
        }
        sb.append(objValueOf);
        return sb.toString();
    }

    public int getTemperature() {
        return this.temperature;
    }

    public boolean getTemperatureValid() {
        return this.temperatureValid;
    }

    public String getTemperatureWithoutUnit() {
        return String.valueOf(this.temperature);
    }

    public String getUVILevel() {
        return String.valueOf(this.UVILevel);
    }

    public int getUVILevelDescResID() {
        int i2 = this.UVILevel;
        return i2 <= 2 ? C5049g.s.f29054k : i2 <= 5 ? C5049g.s.f71771toq : i2 <= 8 ? C5049g.s.f71799zy : i2 <= 10 ? C5049g.s.f29060q : C5049g.s.f29057n;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public int getWindDescResId() {
        float f2 = this.windAngel;
        return (((double) f2) < 22.5d || ((double) f2) > 67.5d) ? (((double) f2) <= 67.5d || ((double) f2) >= 112.5d) ? (((double) f2) < 112.5d || ((double) f2) > 157.5d) ? (((double) f2) <= 157.5d || ((double) f2) >= 202.5d) ? (((double) f2) < 202.5d || ((double) f2) > 247.5d) ? (((double) f2) <= 247.5d || ((double) f2) >= 292.5d) ? (((double) f2) < 292.5d || ((double) f2) > 337.5d) ? C5049g.s.f46228do : C5049g.s.f71739lh : C5049g.s.f71752ngy : C5049g.s.f71748n2t : C5049g.s.f71798zwy : C5049g.s.f71727ij : C5049g.s.f71759pc : C5049g.s.f71774ukdy;
    }

    public int getWindDescResIdFull() {
        float f2 = this.windAngel;
        return (((double) f2) < 22.5d || ((double) f2) > 67.5d) ? (((double) f2) <= 67.5d || ((double) f2) >= 112.5d) ? (((double) f2) < 112.5d || ((double) f2) > 157.5d) ? (((double) f2) <= 157.5d || ((double) f2) >= 202.5d) ? (((double) f2) < 202.5d || ((double) f2) > 247.5d) ? (((double) f2) <= 247.5d || ((double) f2) >= 292.5d) ? (((double) f2) < 292.5d || ((double) f2) > 337.5d) ? C5049g.s.f46228do : C5049g.s.f71691bap7 : C5049g.s.f71752ngy : C5049g.s.f71760pjz9 : C5049g.s.f71798zwy : C5049g.s.f71756nsb : C5049g.s.f71759pc : C5049g.s.f71707ebn;
    }

    public int getWindIconResId() {
        float f2 = this.windAngel;
        return (((double) f2) < 22.5d || ((double) f2) > 67.5d) ? (((double) f2) <= 67.5d || ((double) f2) >= 112.5d) ? (((double) f2) < 112.5d || ((double) f2) > 157.5d) ? (((double) f2) <= 157.5d || ((double) f2) >= 202.5d) ? (((double) f2) < 202.5d || ((double) f2) > 247.5d) ? (((double) f2) <= 247.5d || ((double) f2) >= 292.5d) ? (((double) f2) < 292.5d || ((double) f2) > 337.5d) ? C5049g.n.thtw : C5049g.n.dwra : C5049g.n.hfwa : C5049g.n.u4 : C5049g.n.g6i : C5049g.n.mru : C5049g.n.hzl : C5049g.n.nm;
    }

    public String getWindStrength() {
        return this.windStrength;
    }

    public boolean isAQIDateValid() {
        return this.aqiLevel >= 0;
    }

    public void setAqiLevel(int i2) {
        this.aqiLevel = i2;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setFeelTemperatureValid(boolean z2) {
        this.feelTemperatureValid = z2;
    }

    public void setHumidity(int i2) {
        this.humidity = i2;
    }

    public void setPressure(int i2) {
        this.pressure = i2;
    }

    public void setRainProbability(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.rainProbabilityInt = Integer.parseInt(str.trim());
        } catch (Exception unused) {
            Log.e(TAG, "format rain probability fail");
        }
        this.rainProbability = str;
    }

    public void setSomatosensoryTemperature(int i2) {
        this.somatosensoryTemperature = i2;
    }

    public void setSunTime(long j2, long j3, long j4) {
        if (j2 == 0 && j3 == 0 && j4 == 0) {
            Log.d(TAG, "invalid date! sunrise = [" + j2 + "], sunset = [" + j3 + "], sunriseTomorrow = [" + j4 + "]");
            return;
        }
        C7230k c7230k = new C7230k();
        c7230k.setTimeInMillis(j2);
        this.sunriseHour = c7230k.get(18);
        this.sunriseMin = c7230k.get(20);
        c7230k.setTimeInMillis(j3);
        this.sunsetHour = c7230k.get(18);
        this.sunsetMin = c7230k.get(20);
        c7230k.setTimeInMillis(j4);
        this.sunriseHourTomorrow = c7230k.get(18);
        this.sunriseMinTomorrow = c7230k.get(20);
    }

    public void setTemperature(String str) {
        this.temperature = getTemperatureWithoutUnit(str, WEATHER_TEMPERATURE);
    }

    public void setTemperatureUnit(int i2) {
        this.temperatureUnit = i2;
    }

    public void setTemperatureValid(boolean z2) {
        this.temperatureValid = z2;
    }

    public void setUVILevel(int i2) {
        this.UVILevel = i2;
    }

    public void setUpdateTime(long j2) {
        this.updateTime = j2;
    }

    public void setWeatherType(int i2) {
        this.weatherType = i2;
    }

    public void setWindAngel(String str) {
        float f2;
        try {
            f2 = Float.parseFloat(str);
        } catch (Exception unused) {
            Log.e(TAG, "setWindAngel format fail, value = " + str);
            f2 = 0.0f;
        }
        setWindAngel(f2);
    }

    public void setWindSpeed(String str) {
        this.windStrength = getWindStrength(str);
    }

    public String toJsonString() {
        return "{\"weatherType\":" + this.weatherType + ",\"temperature\":" + this.temperature + ",\"temperatureUnit\":" + this.temperatureUnit + ",\"aqiLevel\":" + this.aqiLevel + ",\"humidity\":" + this.humidity + ",\"sunriseHour\":" + this.sunriseHour + ",\"sunriseMin\":" + this.sunriseMin + ",\"sunriseHourTomorrow\":" + this.sunriseHourTomorrow + ",\"sunriseMinTomorrow\":" + this.sunriseMinTomorrow + ",\"sunsetHour\":" + this.sunsetHour + ",\"sunsetMin\":" + this.sunsetMin + ",\"windAngel\":" + this.windAngel + ",\"windStrength\":\"" + this.windStrength + "\",\"pressure\":" + this.pressure + ",\"description\":\"" + this.description + "\",\"rainProbability\":\"" + this.rainProbability + "\",\"rainProbabilityInt\":" + this.rainProbabilityInt + ",\"somatosensoryTemperature\":" + this.somatosensoryTemperature + ",\"UVILevel\":" + this.UVILevel + ",\"updateTime\":" + this.updateTime + '}';
    }

    public String toString() {
        return "WeatherBean{weatherType=" + this.weatherType + ", temperature='" + this.temperature + "', temperatureUnit=" + this.temperatureUnit + ", aqiLevel=" + this.aqiLevel + ", humidity=" + this.humidity + ", sunriseHour=" + this.sunriseHour + ", sunriseMin=" + this.sunriseMin + ", sunriseHourTomorrow=" + this.sunriseHourTomorrow + ", sunriseMinTomorrow=" + this.sunriseMinTomorrow + ", sunsetHour=" + this.sunsetHour + ", sunsetMin=" + this.sunsetMin + ", windAngel=" + this.windAngel + ", windStrength='" + this.windStrength + "', pressure=" + this.pressure + ", description='" + this.description + "', rainProbability='" + this.rainProbability + "', somatosensoryTemperature=" + this.somatosensoryTemperature + ", UVILevel=" + this.UVILevel + ", updateTime=" + this.updateTime + '}';
    }

    private int getTemperatureWithoutUnit(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            int iIndexOf = this.temperatureUnit == 0 ? str.indexOf("℉") : str.indexOf("℃");
            if (iIndexOf > 0) {
                String strSubstring = str.substring(0, iIndexOf);
                try {
                    strSubstring = strSubstring.trim();
                    return Integer.parseInt(strSubstring);
                } catch (Exception unused) {
                    Log.e(TAG, "parseInt temperature fail, value =" + strSubstring + ".");
                    setTemperatureDataValid(str2, false);
                    return 0;
                }
            }
        }
        setTemperatureDataValid(str2, false);
        return 0;
    }

    private String getWindStrength(String str) {
        float f2;
        try {
            f2 = Float.parseFloat(str.trim());
        } catch (Exception unused) {
            Log.e(TAG, "format wind speed fail");
            f2 = 0.0f;
        }
        return convertSpeedToLevelDesc(f2);
    }

    public void setSomatosensoryTemperature(String str) {
        this.somatosensoryTemperature = getTemperatureWithoutUnit(str, FEEL_TEMPERATURE);
    }

    public void setUVILevel(String str) {
        try {
            this.UVILevel = Integer.parseInt(str.trim());
        } catch (Exception unused) {
            Log.e(TAG, "setUVILevel format fail, value = " + str);
        }
    }

    public void setWindAngel(float f2) {
        this.windAngel = f2;
    }
}
