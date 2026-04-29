package gcp;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.miui.clock.module.HealthBean;
import com.miui.clock.module.WeatherBean;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: DataUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: k */
    private static final String f35055k = "ClockDataUtils";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f77046toq = "1";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f77047zy = "2";

    public static WeatherBean f7l8(WeakReference<Context> weakReference) {
        return m22353y(weakReference, "2");
    }

    /* JADX INFO: renamed from: g */
    public static HealthBean m22347g(Cursor cursor, HealthBean healthBean) {
        if (cursor != null && cursor.getCount() != 0) {
            if (healthBean == null) {
                healthBean = new HealthBean();
            }
            cursor.moveToNext();
            int columnIndex = cursor.getColumnIndex("steps");
            if (columnIndex >= 0) {
                healthBean.setStepCountNow(cursor.getInt(columnIndex));
            }
            int columnIndex2 = cursor.getColumnIndex("goal");
            if (columnIndex2 >= 0) {
                healthBean.setStepCountTarget(cursor.getInt(columnIndex2));
            }
            int columnIndex3 = cursor.getColumnIndex("last_24");
            if (columnIndex3 >= 0) {
                healthBean.setStepCountList(cursor.getString(columnIndex3));
            }
        }
        return healthBean;
    }

    /* JADX INFO: renamed from: k */
    public static HealthBean m22348k(Cursor cursor, HealthBean healthBean) {
        if (cursor != null && cursor.getCount() != 0) {
            if (healthBean == null) {
                healthBean = new HealthBean();
            }
            cursor.moveToNext();
            int columnIndex = cursor.getColumnIndex("finished");
            if (columnIndex >= 0) {
                healthBean.setStandCountNow(cursor.getInt(columnIndex));
            }
            int columnIndex2 = cursor.getColumnIndex("goal");
            if (columnIndex2 >= 0) {
                healthBean.setStandCountTarget(cursor.getInt(columnIndex2));
            }
            int columnIndex3 = cursor.getColumnIndex("last_24");
            if (columnIndex3 >= 0) {
                healthBean.setCaloriesList(cursor.getString(columnIndex3));
            }
        }
        return healthBean;
    }

    public static boolean ld6(Context context, int i2) {
        return m22352s(context, "com.mi.health", i2);
    }

    /* JADX INFO: renamed from: n */
    public static HealthBean m22349n(Cursor cursor, HealthBean healthBean) {
        if (cursor != null && cursor.getCount() != 0) {
            if (healthBean == null) {
                healthBean = new HealthBean();
            }
            cursor.moveToNext();
            int columnIndex = cursor.getColumnIndex("finished");
            if (columnIndex >= 0) {
                healthBean.setStandCountNow(cursor.getInt(columnIndex));
            }
            int columnIndex2 = cursor.getColumnIndex("goal");
            if (columnIndex2 >= 0) {
                healthBean.setStandCountTarget(cursor.getInt(columnIndex2));
            }
        }
        return healthBean;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m22350p(Context context) {
        return m22352s(context, "com.mi.health", C6064q.f7l8());
    }

    /* JADX INFO: renamed from: q */
    public static HealthBean m22351q(Cursor cursor, HealthBean healthBean) {
        if (cursor != null && cursor.getCount() != 0) {
            if (healthBean == null) {
                healthBean = new HealthBean();
            }
            cursor.moveToNext();
            int columnIndex = cursor.getColumnIndex("finished");
            if (columnIndex >= 0) {
                healthBean.setSportTimeNow(cursor.getInt(columnIndex));
            }
            int columnIndex2 = cursor.getColumnIndex("goal");
            if (columnIndex2 >= 0) {
                healthBean.setSportTimeTarget(cursor.getInt(columnIndex2));
            }
            int columnIndex3 = cursor.getColumnIndex("last_24");
            if (columnIndex3 >= 0) {
                healthBean.setSportTimeList(cursor.getString(columnIndex3));
            }
        }
        return healthBean;
    }

    public static boolean qrj(Context context, int i2) {
        return m22352s(context, "com.miui.weather2", i2);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m22352s(Context context, String str, int i2) {
        if (C6064q.m22333g(context)) {
            try {
                PackageManager packageManager = context.getPackageManager();
                Class cls = Integer.TYPE;
                return ((PackageInfo) C6063p.m22325h(PackageManager.class, packageManager, "getPackageInfoAsUser", PackageInfo.class, new Class[]{String.class, cls, cls}, str, 1, Integer.valueOf(i2))) != null;
            } catch (Exception unused) {
                Log.e(f35055k, "name not found pkg=" + str);
            }
        } else {
            try {
                context.getPackageManager().getPackageInfo(str, 1);
                return true;
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.e(f35055k, "name not found pkg=" + str);
            }
        }
        return false;
    }

    public static HealthBean toq(WeakReference<Context> weakReference, int i2, HealthBean healthBean) {
        HealthBean healthBeanM22347g;
        Log.i(f35055k, "before getHealthBean");
        String str = "content://com.mi.health.provider.main/activity/steps/brief";
        String str2 = "content://com.mi.health.provider.main/widget/stand/simple";
        String str3 = "content://com.mi.health.provider.main/sleep/report";
        String str4 = "content://com.mi.health.provider.main/";
        String str5 = "content://com.mi.health.provider.main/";
        Cursor cursorQuery = null;
        try {
            try {
                ContentResolver contentResolver = weakReference.get().getContentResolver();
                int count = 0;
                switch (i2) {
                    case 500:
                    case 501:
                        cursorQuery = contentResolver.query(Uri.parse(str), null, null, null, null);
                        StringBuilder sb = new StringBuilder();
                        sb.append("getHealthBean, cursor = ");
                        sb.append(cursorQuery);
                        sb.append(", count = ");
                        if (cursorQuery != null) {
                            count = cursorQuery.getCount();
                        }
                        sb.append(count);
                        sb.append(", type = ");
                        sb.append(i2);
                        Log.i(f35055k, sb.toString());
                        healthBeanM22347g = m22347g(cursorQuery, healthBean);
                        break;
                    case 502:
                    case 503:
                        cursorQuery = contentResolver.query(Uri.parse(str5), null, null, null, null);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("getHealthBean, cursor = ");
                        sb2.append(cursorQuery);
                        sb2.append(", count = ");
                        if (cursorQuery != null) {
                            count = cursorQuery.getCount();
                        }
                        sb2.append(count);
                        sb2.append(", type = ");
                        sb2.append(i2);
                        Log.i(f35055k, sb2.toString());
                        healthBeanM22347g = m22348k(cursorQuery, healthBean);
                        break;
                    case 504:
                        cursorQuery = contentResolver.query(Uri.parse(str2), null, null, null, null);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("getHealthBean, cursor = ");
                        sb3.append(cursorQuery);
                        sb3.append(", count = ");
                        if (cursorQuery != null) {
                            count = cursorQuery.getCount();
                        }
                        sb3.append(count);
                        sb3.append(", type = ");
                        sb3.append(i2);
                        Log.i(f35055k, sb3.toString());
                        healthBeanM22347g = m22349n(cursorQuery, healthBean);
                        break;
                    case 505:
                    case 508:
                        cursorQuery = contentResolver.query(Uri.parse(str4), null, null, null, null);
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("getHealthBean, cursor = ");
                        sb4.append(cursorQuery);
                        sb4.append(", count = ");
                        if (cursorQuery != null) {
                            count = cursorQuery.getCount();
                        }
                        sb4.append(count);
                        sb4.append(", type = ");
                        sb4.append(i2);
                        Log.i(f35055k, sb4.toString());
                        healthBeanM22347g = m22351q(cursorQuery, healthBean);
                        break;
                    case 506:
                        cursorQuery = contentResolver.query(Uri.parse(str3), null, null, null, null);
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("getHealthBean, cursor = ");
                        sb5.append(cursorQuery);
                        sb5.append(", count = ");
                        if (cursorQuery != null) {
                            count = cursorQuery.getCount();
                        }
                        sb5.append(count);
                        sb5.append(", type = ");
                        sb5.append(i2);
                        Log.i(f35055k, sb5.toString());
                        healthBeanM22347g = zy(cursorQuery, healthBean);
                        break;
                    case 507:
                    default:
                        healthBeanM22347g = healthBean;
                        break;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception e2) {
                Log.e("DataUtils", "get health data fail", e2);
                if (0 != 0) {
                    cursorQuery.close();
                }
                healthBeanM22347g = healthBean;
            }
            Log.i(f35055k, "getHealthBean end, bean = " + healthBeanM22347g);
            return healthBeanM22347g;
        } catch (Throwable th) {
            if (0 != 0) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public static boolean x2(Context context) {
        return m22352s(context, "com.miui.weather2", C6064q.f7l8());
    }

    /* JADX INFO: renamed from: y */
    public static WeatherBean m22353y(WeakReference<Context> weakReference, String str) throws Throwable {
        WeatherBean weatherBean;
        Cursor cursorQuery;
        Log.i(f35055k, "getWeatherBean, type = " + str);
        Cursor cursor = null;
        weatherBean = null;
        WeatherBean weatherBean2 = null;
        cursor = null;
        try {
            try {
                cursorQuery = weakReference.get().getContentResolver().query(Uri.parse("content://weather/actualWeatherData").buildUpon().appendPath(str).build(), null, null, null, null);
            } catch (Exception e2) {
                e = e2;
                weatherBean = null;
            }
            try {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("getWeatherBean, cursor = ");
                    sb.append(cursorQuery);
                    sb.append(", count = ");
                    sb.append(cursorQuery == null ? 0 : cursorQuery.getCount());
                    Log.i(f35055k, sb.toString());
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        cursorQuery.moveToNext();
                        weatherBean = new WeatherBean();
                        try {
                            int columnIndex = cursorQuery.getColumnIndex("weather_type");
                            if (columnIndex >= 0) {
                                weatherBean.setWeatherType(cursorQuery.getInt(columnIndex));
                            }
                            int columnIndex2 = cursorQuery.getColumnIndex("temperature_unit");
                            if (columnIndex2 >= 0) {
                                weatherBean.setTemperatureUnit(cursorQuery.getInt(columnIndex2));
                            }
                            int columnIndex3 = cursorQuery.getColumnIndex("temperature");
                            if (columnIndex3 >= 0) {
                                String string = cursorQuery.getString(columnIndex3);
                                Log.d(f35055k, "current temperature is=" + string);
                                weatherBean.setTemperatureValid(true);
                                weatherBean.setTemperature(string);
                            } else {
                                Log.d(f35055k, "get current temperature fail");
                                weatherBean.setTemperatureValid(false);
                            }
                            int columnIndex4 = cursorQuery.getColumnIndex("aqilevel");
                            if (columnIndex4 >= 0) {
                                int i2 = cursorQuery.getInt(columnIndex4);
                                Log.d(f35055k, "weatherbean set AQI level = " + i2);
                                weatherBean.setAqiLevel(i2);
                            }
                            int columnIndex5 = cursorQuery.getColumnIndex("humidity");
                            if (columnIndex5 >= 0) {
                                weatherBean.setHumidity(cursorQuery.getInt(columnIndex5));
                            }
                            int columnIndex6 = cursorQuery.getColumnIndex("sunrise");
                            long j2 = columnIndex6 >= 0 ? cursorQuery.getLong(columnIndex6) : 0L;
                            int columnIndex7 = cursorQuery.getColumnIndex("sunset");
                            long j3 = columnIndex7 >= 0 ? cursorQuery.getLong(columnIndex7) : 0L;
                            int columnIndex8 = cursorQuery.getColumnIndex("wind_direction");
                            if (columnIndex8 >= 0) {
                                weatherBean.setWindAngel(cursorQuery.getString(columnIndex8));
                            }
                            int columnIndex9 = cursorQuery.getColumnIndex("wind_power");
                            if (columnIndex9 >= 0) {
                                weatherBean.setWindSpeed(cursorQuery.getString(columnIndex9));
                            }
                            int columnIndex10 = cursorQuery.getColumnIndex("ultraviolet");
                            if (columnIndex10 >= 0) {
                                weatherBean.setUVILevel(cursorQuery.getString(columnIndex10));
                            }
                            int columnIndex11 = cursorQuery.getColumnIndex("feel_temperature");
                            if (columnIndex11 >= 0) {
                                weatherBean.setFeelTemperatureValid(true);
                                weatherBean.setSomatosensoryTemperature(cursorQuery.getString(columnIndex11));
                            } else {
                                Log.d(f35055k, "get current feel temperature fail");
                                weatherBean.setFeelTemperatureValid(false);
                            }
                            int columnIndex12 = cursorQuery.getColumnIndex("next_hour_rain_probability");
                            if (columnIndex12 >= 0) {
                                String string2 = cursorQuery.getString(columnIndex12);
                                Log.d(f35055k, "get rain probability: is=" + string2);
                                weatherBean.setRainProbability(string2);
                            }
                            int columnIndex13 = cursorQuery.getColumnIndex("pressure");
                            if (columnIndex13 >= 0) {
                                weatherBean.setPressure(cursorQuery.getInt(columnIndex13));
                            }
                            int columnIndex14 = cursorQuery.getColumnIndex("description");
                            if (columnIndex14 >= 0) {
                                weatherBean.setDescription(cursorQuery.getString(columnIndex14));
                            }
                            cursorQuery.moveToNext();
                            int columnIndex15 = cursorQuery.getColumnIndex("sunrise");
                            weatherBean.setSunTime(j2, j3, columnIndex15 >= 0 ? cursorQuery.getLong(columnIndex15) : 0L);
                            weatherBean2 = weatherBean;
                        } catch (Exception e3) {
                            e = e3;
                            cursor = cursorQuery;
                            Log.e(f35055k, "get weather data fail", e);
                            if (cursor != null) {
                                cursor.close();
                            }
                            weatherBean2 = weatherBean;
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Exception e4) {
                    e = e4;
                    weatherBean = null;
                }
                Log.i(f35055k, "getWeatherBean end, bean = " + weatherBean2);
                return weatherBean2;
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static HealthBean zy(Cursor cursor, HealthBean healthBean) {
        if (cursor != null && cursor.getCount() != 0) {
            if (healthBean == null) {
                healthBean = new HealthBean();
            }
            cursor.moveToNext();
            int columnIndex = cursor.getColumnIndex("duration");
            if (columnIndex >= 0) {
                healthBean.setSleepDuration(cursor.getLong(columnIndex));
            }
        }
        return healthBean;
    }
}
