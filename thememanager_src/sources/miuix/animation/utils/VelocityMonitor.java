package miuix.animation.utils;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public class VelocityMonitor {
    private static final long MAX_DELTA = 100;
    private static final int MAX_RECORD_COUNT = 10;
    private static final long MIN_DELTA = 30;
    private static final long TIME_THRESHOLD = 50;
    private float[] mVelocity;
    private Long mMinDeltaTime = Long.valueOf(MIN_DELTA);
    private Long mMaxDeltaTime = Long.valueOf(MAX_DELTA);
    private LinkedList<MoveRecord> mHistory = new LinkedList<>();

    private static class MoveRecord {
        long timeStamp;
        double[] values;

        private MoveRecord() {
        }
    }

    private void addAndUpdate(MoveRecord moveRecord) {
        this.mHistory.add(moveRecord);
        if (this.mHistory.size() > 10) {
            this.mHistory.remove(0);
        }
        updateVelocity();
    }

    private float calVelocity(int i2, MoveRecord moveRecord, MoveRecord moveRecord2) {
        float velocity;
        double d2 = moveRecord.values[i2];
        long j2 = moveRecord.timeStamp;
        double velocity2 = getVelocity(d2, moveRecord2.values[i2], j2 - moveRecord2.timeStamp);
        int size = this.mHistory.size() - 2;
        MoveRecord moveRecord3 = null;
        while (true) {
            if (size < 0) {
                velocity = Float.MAX_VALUE;
                break;
            }
            MoveRecord moveRecord4 = this.mHistory.get(size);
            long j3 = j2 - moveRecord4.timeStamp;
            if (j3 <= this.mMinDeltaTime.longValue() || j3 >= this.mMaxDeltaTime.longValue()) {
                size--;
                moveRecord3 = moveRecord4;
            } else {
                velocity = getVelocity(d2, moveRecord4.values[i2], j3);
                double d4 = velocity;
                if (velocity2 * d4 > 0.0d) {
                    velocity = (float) (velocity > 0.0f ? Math.max(velocity2, d4) : Math.min(velocity2, d4));
                }
                moveRecord3 = moveRecord4;
            }
        }
        if (velocity == Float.MAX_VALUE && moveRecord3 != null) {
            long j4 = j2 - moveRecord3.timeStamp;
            if (j4 > this.mMinDeltaTime.longValue() && j4 < this.mMaxDeltaTime.longValue()) {
                velocity = getVelocity(d2, moveRecord3.values[i2], j4);
            }
        }
        if (velocity == Float.MAX_VALUE) {
            return 0.0f;
        }
        return velocity;
    }

    private void clearVelocity() {
        float[] fArr = this.mVelocity;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
        }
    }

    private MoveRecord getMoveRecord() {
        MoveRecord moveRecord = new MoveRecord();
        moveRecord.timeStamp = SystemClock.uptimeMillis();
        return moveRecord;
    }

    private float getVelocity(double d2, double d4, long j2) {
        return (float) (j2 == 0 ? 0.0d : (d2 - d4) / ((double) (j2 / 1000.0f)));
    }

    private void updateVelocity() {
        int size = this.mHistory.size();
        if (size < 2) {
            clearVelocity();
            return;
        }
        MoveRecord last = this.mHistory.getLast();
        MoveRecord moveRecord = this.mHistory.get(size - 2);
        float[] fArr = this.mVelocity;
        if (fArr == null || fArr.length < last.values.length) {
            this.mVelocity = new float[last.values.length];
        }
        for (int i2 = 0; i2 < last.values.length; i2++) {
            this.mVelocity[i2] = calVelocity(i2, last, moveRecord);
        }
    }

    public void clear() {
        this.mHistory.clear();
        clearVelocity();
    }

    public float getVelocity(int i2) {
        float[] fArr;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if ((this.mHistory.size() <= 0 || Math.abs(jUptimeMillis - this.mHistory.getLast().timeStamp) <= TIME_THRESHOLD) && (fArr = this.mVelocity) != null && fArr.length > i2) {
            return fArr[i2];
        }
        return 0.0f;
    }

    public void setMaxFeedbackTime(long j2) {
        this.mMaxDeltaTime = Long.valueOf(j2);
    }

    public void setMinFeedbackTime(long j2) {
        this.mMinDeltaTime = Long.valueOf(j2);
    }

    public void update(float... fArr) {
        if (fArr == null || fArr.length == 0) {
            return;
        }
        MoveRecord moveRecord = getMoveRecord();
        moveRecord.values = new double[fArr.length];
        for (int i2 = 0; i2 < fArr.length; i2++) {
            moveRecord.values[i2] = fArr[i2];
        }
        addAndUpdate(moveRecord);
    }

    public void update(double... dArr) {
        if (dArr == null || dArr.length == 0) {
            return;
        }
        MoveRecord moveRecord = getMoveRecord();
        moveRecord.values = dArr;
        addAndUpdate(moveRecord);
    }
}
