package com.miui.maml.data;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public enum VariableType {
    INVALID(null),
    NUM(Double.TYPE),
    STR(String.class),
    OBJ(Object.class),
    JSONO(JSONObject.class),
    JSONA(JSONArray.class),
    NUM_ARR(Double.TYPE),
    DOUBLE_ARR(Double.TYPE),
    FLOAT_ARR(Float.TYPE),
    INT_ARR(Integer.TYPE),
    SHORT_ARR(Short.TYPE),
    BYTE_ARR(Byte.TYPE),
    LONG_ARR(Long.TYPE),
    BOOLEAN_ARR(Boolean.TYPE),
    CHAR_ARR(Character.TYPE),
    STR_ARR(String.class),
    OBJ_ARR(Object.class);

    public final Class<?> mTypeClass;

    VariableType(Class cls) {
        this.mTypeClass = cls;
    }

    public static VariableType parseType(String str) {
        return "number".equalsIgnoreCase(str) ? NUM : "string".equalsIgnoreCase(str) ? STR : "object".equalsIgnoreCase(str) ? OBJ : "jsonO".equalsIgnoreCase(str) ? JSONO : "jsonA".equalsIgnoreCase(str) ? JSONA : "number[]".equalsIgnoreCase(str) ? NUM_ARR : "double[]".equalsIgnoreCase(str) ? DOUBLE_ARR : "float[]".equalsIgnoreCase(str) ? FLOAT_ARR : "int[]".equalsIgnoreCase(str) ? INT_ARR : "short[]".equalsIgnoreCase(str) ? SHORT_ARR : "byte[]".equalsIgnoreCase(str) ? BYTE_ARR : "long[]".equalsIgnoreCase(str) ? LONG_ARR : "boolean[]".equalsIgnoreCase(str) ? BOOLEAN_ARR : "char[]".equalsIgnoreCase(str) ? CHAR_ARR : "string[]".equalsIgnoreCase(str) ? STR_ARR : "object[]".equalsIgnoreCase(str) ? OBJ_ARR : NUM;
    }

    public boolean isArray() {
        return ordinal() >= NUM_ARR.ordinal() && ordinal() <= OBJ_ARR.ordinal();
    }

    public boolean isNumber() {
        return this == NUM;
    }

    public boolean isNumberArray() {
        return ordinal() >= NUM_ARR.ordinal() && ordinal() <= CHAR_ARR.ordinal();
    }

    public boolean isNumberOrStringArray() {
        return ordinal() >= NUM_ARR.ordinal() && ordinal() <= STR_ARR.ordinal();
    }
}
