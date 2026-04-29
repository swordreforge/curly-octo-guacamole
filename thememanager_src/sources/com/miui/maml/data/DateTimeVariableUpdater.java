package com.miui.maml.data;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.miui.maml.NotifierManager;
import com.miui.maml.util.MamlLog;
import com.miui.maml.util.Utils;
import miuix.pickerwidget.date.C7230k;

/* JADX INFO: loaded from: classes3.dex */
public class DateTimeVariableUpdater extends NotifierVariableUpdater {
    private static final String LOG_TAG = "DateTimeVariableUpdater";
    private static final String SETTING_NEXT_ALARM_TIME = "next_alarm_clock_formatted";
    private static final int TIME_DAY = 86400000;
    private static final int TIME_HOUR = 3600000;
    private static final int TIME_MINUTE = 60000;
    private static final int TIME_SECOND = 1000;
    public static final String USE_TAG = "DateTime";
    private static final int[] fields = {22, 21, 20, 18, 9};
    private static C7230k sCalendar;
    private IndexedVariable mAmPm;
    protected C7230k mCalendar;
    private long mCurrentTime;
    private IndexedVariable mDate;
    private IndexedVariable mDateLunar;
    private IndexedVariable mDayOfWeek;
    private volatile boolean mFinished;
    private IndexedVariable mHour12;
    private IndexedVariable mHour24;
    private long mLastUpdatedTime;
    private final Object mLock;
    private IndexedVariable mMinute;
    private IndexedVariable mMonth;
    private IndexedVariable mMonth1;
    private IndexedVariable mMonthLunar;
    private IndexedVariable mMonthLunarLeap;
    private IndexedVariable mNextAlarm;
    private long mNextUpdateTime;
    private IndexedVariable mSecond;
    private IndexedVariable mTime;
    private long mTimeAccuracy;
    private int mTimeAccuracyField;
    private int mTimeFormat;
    private IndexedVariable mTimeFormatVar;
    private IndexedVariable mTimeSys;
    private Runnable mTimeUpdater;
    private IndexedVariable mYear;
    private IndexedVariable mYearLunar;
    private IndexedVariable mYearLunar1864;

    /* JADX INFO: renamed from: com.miui.maml.data.DateTimeVariableUpdater$1 */
    static /* synthetic */ class C51581 {
        static final /* synthetic */ int[] $SwitchMap$com$miui$maml$data$DateTimeVariableUpdater$Accuracy;

        static {
            int[] iArr = new int[Accuracy.values().length];
            $SwitchMap$com$miui$maml$data$DateTimeVariableUpdater$Accuracy = iArr;
            try {
                iArr[Accuracy.Day.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$miui$maml$data$DateTimeVariableUpdater$Accuracy[Accuracy.Hour.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$miui$maml$data$DateTimeVariableUpdater$Accuracy[Accuracy.Minute.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$miui$maml$data$DateTimeVariableUpdater$Accuracy[Accuracy.Second.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum Accuracy {
        Day,
        Hour,
        Minute,
        Second
    }

    public DateTimeVariableUpdater(VariableUpdaterManager variableUpdaterManager) {
        this(variableUpdaterManager, Accuracy.Minute);
    }

    public static String formatDate(CharSequence charSequence, long j2) {
        if (sCalendar == null) {
            sCalendar = new C7230k();
        }
        sCalendar.setTimeInMillis(j2);
        return sCalendar.format(Utils.getAppContext(), charSequence);
    }

    private void initInner(Accuracy accuracy) {
        MamlLog.m17853i(LOG_TAG, "init with accuracy:" + accuracy.name());
        int i2 = C51581.$SwitchMap$com$miui$maml$data$DateTimeVariableUpdater$Accuracy[accuracy.ordinal()];
        if (i2 == 1) {
            this.mTimeAccuracy = 86400000L;
            this.mTimeAccuracyField = 9;
        } else if (i2 == 2) {
            this.mTimeAccuracy = 3600000L;
            this.mTimeAccuracyField = 18;
        } else if (i2 == 3 || i2 != 4) {
            this.mTimeAccuracy = 60000L;
            this.mTimeAccuracyField = 20;
        } else {
            this.mTimeAccuracy = 1000L;
            this.mTimeAccuracyField = 21;
        }
        Variables variables = getContext().mVariables;
        this.mYear = new IndexedVariable(VariableNames.VAR_YEAR, variables, true);
        this.mMonth = new IndexedVariable(VariableNames.VAR_MONTH, variables, true);
        this.mMonth1 = new IndexedVariable("month1", variables, true);
        this.mDate = new IndexedVariable(VariableNames.VAR_DATE, variables, true);
        this.mYearLunar = new IndexedVariable(VariableNames.VAR_YEAR_LUNAR, variables, true);
        this.mYearLunar1864 = new IndexedVariable(VariableNames.VAR_YEAR_LUNAR1864, variables, true);
        this.mMonthLunar = new IndexedVariable(VariableNames.VAR_MONTH_LUNAR, variables, true);
        this.mMonthLunarLeap = new IndexedVariable(VariableNames.VAR_MONTH_LUNAR_LEAP, variables, true);
        this.mDateLunar = new IndexedVariable(VariableNames.VAR_DATE_LUNAR, variables, true);
        this.mDayOfWeek = new IndexedVariable(VariableNames.VAR_DAY_OF_WEEK, variables, true);
        this.mAmPm = new IndexedVariable(VariableNames.VAR_AMPM, variables, true);
        this.mHour12 = new IndexedVariable(VariableNames.VAR_HOUR12, variables, true);
        this.mHour24 = new IndexedVariable(VariableNames.VAR_HOUR24, variables, true);
        this.mMinute = new IndexedVariable(VariableNames.VAR_MINUTE, variables, true);
        this.mSecond = new IndexedVariable(VariableNames.VAR_SECOND, variables, true);
        this.mTime = new IndexedVariable("time", variables, true);
        IndexedVariable indexedVariable = new IndexedVariable(VariableNames.VAR_TIME_SYS, variables, true);
        this.mTimeSys = indexedVariable;
        indexedVariable.set(System.currentTimeMillis());
        this.mNextAlarm = new IndexedVariable(VariableNames.VAR_NEXT_ALARM_TIME, variables, false);
        this.mTimeFormatVar = new IndexedVariable(VariableNames.VAR_TIME_FORMAT, variables, true);
    }

    private void refreshAlarm() {
        String string = Settings.System.getString(getContext().mContext.getContentResolver(), SETTING_NEXT_ALARM_TIME);
        if (string == null) {
            string = Settings.Global.getString(getContext().mContext.getContentResolver(), SETTING_NEXT_ALARM_TIME);
        }
        if (string == null) {
            string = Settings.System.getString(getContext().mContext.getContentResolver(), "next_alarm_formatted");
        }
        this.mNextAlarm.set(string);
    }

    private void updateTime() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.mTimeSys.set(jCurrentTimeMillis);
        long j2 = jCurrentTimeMillis / 1000;
        if (j2 != this.mLastUpdatedTime) {
            this.mCalendar.setTimeInMillis(jCurrentTimeMillis);
            int i2 = this.mCalendar.get(1);
            int i3 = this.mCalendar.get(5);
            int i4 = this.mCalendar.get(9);
            this.mAmPm.set(this.mCalendar.get(17));
            this.mHour24.set(this.mCalendar.get(18));
            int i5 = this.mCalendar.get(18) % 12;
            this.mHour12.set(i5 == 0 ? 12.0d : i5);
            this.mMinute.set(this.mCalendar.get(20));
            this.mYear.set(i2);
            this.mMonth.set(i3);
            this.mMonth1.set(i3 + 1);
            this.mDate.set(i4);
            this.mDayOfWeek.set(this.mCalendar.get(14));
            this.mSecond.set(this.mCalendar.get(21));
            this.mYearLunar.set(this.mCalendar.get(2));
            this.mMonthLunar.set(this.mCalendar.get(6));
            this.mDateLunar.set(this.mCalendar.get(10));
            this.mYearLunar1864.set(this.mCalendar.get(4));
            this.mMonthLunarLeap.set(this.mCalendar.get(8));
            this.mLastUpdatedTime = j2;
        }
    }

    public void checkUpdateTime() {
        if (this.mFinished) {
            return;
        }
        synchronized (this.mLock) {
            if (this.mFinished) {
                return;
            }
            getContext().getHandler().removeCallbacks(this.mTimeUpdater);
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.mCalendar.setTimeInMillis(jCurrentTimeMillis);
            for (int i2 : fields) {
                if (i2 == this.mTimeAccuracyField) {
                    break;
                }
                this.mCalendar.set(i2, 0);
            }
            int i3 = DateFormat.is24HourFormat(getContext().mContext) ? 1 : 0;
            long timeInMillis = this.mCalendar.getTimeInMillis();
            if (this.mCurrentTime != timeInMillis || this.mTimeFormat != i3) {
                this.mCurrentTime = timeInMillis;
                this.mNextUpdateTime = timeInMillis + this.mTimeAccuracy;
                this.mTimeFormat = i3;
                this.mTimeFormatVar.set(i3);
                getRoot().requestUpdate();
            }
            getContext().getHandler().postDelayed(this.mTimeUpdater, this.mNextUpdateTime - jCurrentTimeMillis);
        }
    }

    @Override // com.miui.maml.data.NotifierVariableUpdater, com.miui.maml.data.VariableUpdater
    public void finish() {
        synchronized (this.mLock) {
            super.finish();
            this.mFinished = true;
            this.mLastUpdatedTime = 0L;
            sCalendar = null;
            getContext().getHandler().removeCallbacks(this.mTimeUpdater);
        }
    }

    @Override // com.miui.maml.data.NotifierVariableUpdater, com.miui.maml.data.VariableUpdater
    public void init() {
        super.init();
        refreshAlarm();
        updateTime();
        checkUpdateTime();
    }

    @Override // com.miui.maml.data.NotifierVariableUpdater, com.miui.maml.NotifierManager.OnNotifyListener
    public void onNotify(Context context, Intent intent, Object obj) {
        resetCalendar();
        checkUpdateTime();
    }

    @Override // com.miui.maml.data.NotifierVariableUpdater, com.miui.maml.data.VariableUpdater
    public void pause() {
        super.pause();
        getContext().getHandler().removeCallbacks(this.mTimeUpdater);
    }

    protected void resetCalendar() {
        this.mCalendar = new C7230k();
        if (sCalendar != null) {
            sCalendar = new C7230k();
        }
    }

    @Override // com.miui.maml.data.NotifierVariableUpdater, com.miui.maml.data.VariableUpdater
    public void resume() {
        super.resume();
        refreshAlarm();
        resetCalendar();
        checkUpdateTime();
    }

    @Override // com.miui.maml.data.VariableUpdater
    public void tick(long j2) {
        super.tick(j2);
        this.mTime.set(j2);
        updateTime();
    }

    public DateTimeVariableUpdater(VariableUpdaterManager variableUpdaterManager, String str) {
        super(variableUpdaterManager, NotifierManager.TYPE_TIME_CHANGED);
        this.mCalendar = new C7230k();
        this.mTimeFormat = -1;
        this.mLock = new Object();
        this.mTimeUpdater = new TimeUpdater(this);
        Accuracy accuracy = null;
        if (!TextUtils.isEmpty(str)) {
            for (Accuracy accuracy2 : Accuracy.values()) {
                if (accuracy2.name().equals(str)) {
                    accuracy = accuracy2;
                }
            }
        }
        if (accuracy == null) {
            accuracy = Accuracy.Minute;
            MamlLog.m17854w(LOG_TAG, "invalid accuracy tag:" + str);
        }
        initInner(accuracy);
    }

    public DateTimeVariableUpdater(VariableUpdaterManager variableUpdaterManager, Accuracy accuracy) {
        super(variableUpdaterManager, NotifierManager.TYPE_TIME_CHANGED);
        this.mCalendar = new C7230k();
        this.mTimeFormat = -1;
        this.mLock = new Object();
        initInner(accuracy);
    }
}
