package com.miui.maml.data;

import com.miui.maml.data.Expression;
import com.miui.maml.util.Utils;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.chrono.IsoChronology;
import java.time.temporal.ChronoUnit;
import zy.hyr;

/* JADX INFO: loaded from: classes3.dex */
@hyr(api = 26)
public class DateFunctions extends Expression.FunctionImpl {
    public static final int REPEAT_MONTH = 2;
    public static final int REPEAT_NO = 0;
    public static final int REPEAT_WEEK = 3;
    public static final int REPEAT_YEAR = 1;

    public DateFunctions(int i2) {
        super(i2);
    }

    private LocalDate changeYear(LocalDate localDate, int i2) {
        boolean z2 = !IsoChronology.INSTANCE.isLeapYear((long) i2) && localDate.getMonthValue() == 2 && localDate.getDayOfMonth() == 29;
        Month month = localDate.getMonth();
        int dayOfMonth = localDate.getDayOfMonth();
        if (z2) {
            dayOfMonth--;
        }
        return LocalDate.of(i2, month, dayOfMonth);
    }

    private long diffDateMonth(LocalDate localDate, LocalDate localDate2) {
        int dayOfMonth = localDate.getDayOfMonth();
        int iLengthOfMonth = localDate2.lengthOfMonth();
        int dayOfMonth2 = localDate2.getDayOfMonth();
        return dayOfMonth >= dayOfMonth2 ? dayOfMonth > iLengthOfMonth ? iLengthOfMonth - dayOfMonth2 : dayOfMonth - dayOfMonth2 : dayOfMonth > localDate2.plusMonths(1L).lengthOfMonth() ? r2 + r7 : r2 + dayOfMonth;
    }

    private long diffDateYear(LocalDate localDate, LocalDate localDate2) {
        if (localDate.getMonthValue() <= localDate2.getMonthValue() && (localDate.getMonthValue() != localDate2.getMonthValue() || localDate.getDayOfMonth() < localDate2.getDayOfMonth())) {
            return ChronoUnit.DAYS.between(localDate2, changeYear(localDate, localDate2.getYear() + 1));
        }
        LocalDate localDateChangeYear = changeYear(localDate, localDate2.getYear());
        return (!localDate2.isLeapYear() && localDateChangeYear.getMonth() == Month.FEBRUARY && localDateChangeYear.getDayOfMonth() == 29) ? (localDateChangeYear.getDayOfYear() - 1) - localDate2.getDayOfYear() : localDateChangeYear.getDayOfYear() - localDate2.getDayOfYear();
    }

    static void load() {
        Expression.FunctionExpression.registerFunction("diffDate", new DateFunctions(3));
    }

    @hyr(api = 26)
    long diffDate(long j2, long j3, int i2) {
        return diffDate(long2LocalDate(j2), long2LocalDate(j3), i2);
    }

    @Override // com.miui.maml.data.Expression.FunctionImpl
    public double evaluate(Expression[] expressionArr, Variables variables) {
        return diffDate((long) expressionArr[0].evaluate(), (long) expressionArr[1].evaluate(), (int) expressionArr[2].evaluate());
    }

    @Override // com.miui.maml.data.Expression.FunctionImpl
    public String evaluateStr(Expression[] expressionArr, Variables variables) {
        return Utils.doubleToString(evaluate(expressionArr, variables));
    }

    @hyr(api = 26)
    long localDate2Long(LocalDate localDate) {
        return localDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    @hyr(api = 26)
    LocalDate long2LocalDate(long j2) {
        return Instant.ofEpochMilli(j2).atZone(ZoneId.systemDefault()).toLocalDate();
    }

    @hyr(api = 26)
    long diffDate(LocalDate localDate, LocalDate localDate2, int i2) {
        if (1 == i2) {
            return diffDateYear(localDate, localDate2);
        }
        if (2 == i2) {
            return diffDateMonth(localDate, localDate2);
        }
        if (3 != i2) {
            return localDate.toEpochDay() - localDate2.toEpochDay();
        }
        int value = localDate.getDayOfWeek().getValue();
        if (value < localDate2.getDayOfWeek().getValue()) {
            value += 7;
        }
        return value - r4;
    }
}
