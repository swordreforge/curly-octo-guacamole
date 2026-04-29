package com.miui.maml.data;

import com.miui.maml.data.Expression;
import com.miui.maml.util.Utils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class JsonFunctions extends Expression.FunctionImpl {
    private static final String LOG_TAG = "Expression";
    private final Fun mFun;

    /* JADX INFO: renamed from: com.miui.maml.data.JsonFunctions$1 */
    static /* synthetic */ class C51611 {
        static final /* synthetic */ int[] $SwitchMap$com$miui$maml$data$JsonFunctions$Fun;

        static {
            int[] iArr = new int[Fun.values().length];
            $SwitchMap$com$miui$maml$data$JsonFunctions$Fun = iArr;
            try {
                iArr[Fun.JSON_ARRAY_LENGTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$miui$maml$data$JsonFunctions$Fun[Fun.JSON_OBJECT_EQUALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$miui$maml$data$JsonFunctions$Fun[Fun.IS_JSON_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$miui$maml$data$JsonFunctions$Fun[Fun.IS_JSON_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$miui$maml$data$JsonFunctions$Fun[Fun.JSON_GET_INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$miui$maml$data$JsonFunctions$Fun[Fun.JSON_GET_BOOLEAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$miui$maml$data$JsonFunctions$Fun[Fun.JSON_GET_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$miui$maml$data$JsonFunctions$Fun[Fun.TO_STR_FROM_JSON.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$miui$maml$data$JsonFunctions$Fun[Fun.JSON_GET_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$miui$maml$data$JsonFunctions$Fun[Fun.JSON_NEW_OBJECT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$miui$maml$data$JsonFunctions$Fun[Fun.TO_JSON_OBJECT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$miui$maml$data$JsonFunctions$Fun[Fun.JSON_ARRAY_GET_INDEX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$miui$maml$data$JsonFunctions$Fun[Fun.JSON_GET_ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$miui$maml$data$JsonFunctions$Fun[Fun.JSON_NEW_JSON_ARRAY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    private enum Fun {
        INVALID,
        JSON_GET_STRING,
        JSON_GET_BOOLEAN,
        JSON_GET_INT,
        JSON_GET_OBJECT,
        JSON_GET_ARRAY,
        JSON_ARRAY_GET_INDEX,
        JSON_NEW_OBJECT,
        JSON_NEW_JSON_ARRAY,
        JSON_ARRAY_LENGTH,
        JSON_OBJECT_EQUALS,
        TO_JSON_OBJECT,
        TO_STR_FROM_JSON,
        IS_JSON_OBJECT,
        IS_JSON_ARRAY
    }

    private JsonFunctions(Fun fun, int i2) {
        super(i2);
        this.mFun = fun;
    }

    public static void load() {
        Expression.FunctionExpression.registerFunction("jsonGetString", new JsonFunctions(Fun.JSON_GET_STRING, 2));
        Expression.FunctionExpression.registerFunction("jsonGetBoolean", new JsonFunctions(Fun.JSON_GET_BOOLEAN, 2));
        Expression.FunctionExpression.registerFunction("jsonGetInt", new JsonFunctions(Fun.JSON_GET_INT, 2));
        Expression.FunctionExpression.registerFunction("jsonGetObject", new JsonFunctions(Fun.JSON_GET_OBJECT, 2));
        Expression.FunctionExpression.registerFunction("jsonGetArray", new JsonFunctions(Fun.JSON_GET_ARRAY, 2));
        Expression.FunctionExpression.registerFunction("jsonArrayGetIndex", new JsonFunctions(Fun.JSON_ARRAY_GET_INDEX, 2));
        Expression.FunctionExpression.registerFunction("newJsonObject", new JsonFunctions(Fun.JSON_NEW_OBJECT, 0));
        Expression.FunctionExpression.registerFunction("newJsonArray", new JsonFunctions(Fun.JSON_NEW_JSON_ARRAY, 0));
        Expression.FunctionExpression.registerFunction("getJsonArrayLength", new JsonFunctions(Fun.JSON_ARRAY_LENGTH, 1));
        Expression.FunctionExpression.registerFunction("jsonObjectEquals", new JsonFunctions(Fun.JSON_OBJECT_EQUALS, 2));
        Expression.FunctionExpression.registerFunction("strToJson", new JsonFunctions(Fun.TO_JSON_OBJECT, 1));
        Expression.FunctionExpression.registerFunction("jsonToStr", new JsonFunctions(Fun.TO_STR_FROM_JSON, 1));
        Expression.FunctionExpression.registerFunction("isJsonObject", new JsonFunctions(Fun.IS_JSON_OBJECT, 1));
        Expression.FunctionExpression.registerFunction("isJsonArray", new JsonFunctions(Fun.IS_JSON_ARRAY, 1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.miui.maml.data.Expression.FunctionImpl
    public double evaluate(Expression[] expressionArr, Variables variables) {
        int length;
        switch (C51611.$SwitchMap$com$miui$maml$data$JsonFunctions$Fun[this.mFun.ordinal()]) {
            case 1:
                JSONArray jSONArrayEvaluateJsonArray = expressionArr[0].evaluateJsonArray();
                if (jSONArrayEvaluateJsonArray != null) {
                    length = jSONArrayEvaluateJsonArray.length();
                    return length;
                }
                return 0.0d;
            case 2:
                JSONObject jSONObjectEvaluateJsonObject = expressionArr[0].evaluateJsonObject();
                JSONObject jSONObjectEvaluateJsonObject2 = expressionArr[1].evaluateJsonObject();
                return (jSONObjectEvaluateJsonObject == null || jSONObjectEvaluateJsonObject2 == null || jSONObjectEvaluateJsonObject != jSONObjectEvaluateJsonObject2) ? 0.0d : 1.0d;
            case 3:
                return expressionArr[0].evaluateJsonObject() != null ? 1.0d : 0.0d;
            case 4:
                return expressionArr[0].evaluateJsonArray() != null ? 1.0d : 0.0d;
            case 5:
                JSONObject jSONObjectEvaluateJsonObject3 = expressionArr[0].evaluateJsonObject();
                if (jSONObjectEvaluateJsonObject3 != null) {
                    length = jSONObjectEvaluateJsonObject3.optInt(expressionArr[1].evaluateStr());
                    return length;
                }
                return 0.0d;
            case 6:
                JSONObject jSONObjectEvaluateJsonObject4 = expressionArr[0].evaluateJsonObject();
                return (jSONObjectEvaluateJsonObject4 == null || !Boolean.valueOf(jSONObjectEvaluateJsonObject4.optBoolean(expressionArr[1].evaluateStr())).booleanValue()) ? 0.0d : 1.0d;
            default:
                return 0.0d;
        }
    }

    @Override // com.miui.maml.data.Expression.FunctionImpl
    public JSONArray evaluateJsonArray(Expression[] expressionArr, Variables variables) {
        int i2 = C51611.$SwitchMap$com$miui$maml$data$JsonFunctions$Fun[this.mFun.ordinal()];
        if (i2 == 13) {
            JSONObject jSONObjectEvaluateJsonObject = expressionArr[0].evaluateJsonObject();
            if (jSONObjectEvaluateJsonObject != null) {
                return jSONObjectEvaluateJsonObject.optJSONArray(expressionArr[1].evaluateStr());
            }
        } else if (i2 == 14) {
            return new JSONArray();
        }
        return super.evaluateJsonArray(expressionArr, variables);
    }

    @Override // com.miui.maml.data.Expression.FunctionImpl
    public JSONObject evaluateJsonObject(Expression[] expressionArr, Variables variables) {
        switch (C51611.$SwitchMap$com$miui$maml$data$JsonFunctions$Fun[this.mFun.ordinal()]) {
            case 9:
                JSONObject jSONObjectEvaluateJsonObject = expressionArr[0].evaluateJsonObject();
                if (jSONObjectEvaluateJsonObject != null) {
                    return jSONObjectEvaluateJsonObject.optJSONObject(expressionArr[1].evaluateStr());
                }
                break;
            case 10:
                return new JSONObject();
            case 11:
                String strEvaluateStr = expressionArr[0].evaluateStr();
                if (strEvaluateStr != null) {
                    try {
                        return new JSONObject(strEvaluateStr);
                    } catch (JSONException unused) {
                    }
                }
                return null;
            case 12:
                JSONArray jSONArrayEvaluateJsonArray = expressionArr[0].evaluateJsonArray();
                int iEvaluate = (int) expressionArr[1].evaluate();
                if (jSONArrayEvaluateJsonArray != null && iEvaluate < jSONArrayEvaluateJsonArray.length()) {
                    try {
                        return jSONArrayEvaluateJsonArray.getJSONObject(iEvaluate);
                    } catch (JSONException unused2) {
                    }
                }
                break;
        }
        return super.evaluateJsonObject(expressionArr, variables);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.miui.maml.data.Expression.FunctionImpl
    public String evaluateStr(Expression[] expressionArr, Variables variables) {
        switch (C51611.$SwitchMap$com$miui$maml$data$JsonFunctions$Fun[this.mFun.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return Utils.doubleToString(evaluate(expressionArr, variables));
            case 7:
                JSONObject jSONObjectEvaluateJsonObject = expressionArr[0].evaluateJsonObject();
                if (jSONObjectEvaluateJsonObject != null) {
                    return jSONObjectEvaluateJsonObject.optString(expressionArr[1].evaluateStr(), null);
                }
                return null;
            case 8:
                JSONObject jSONObjectEvaluateJsonObject2 = expressionArr[0].evaluateJsonObject();
                if (jSONObjectEvaluateJsonObject2 != null) {
                    return jSONObjectEvaluateJsonObject2.toString();
                }
                return null;
            default:
                return null;
        }
    }

    @Override // com.miui.maml.data.Expression.FunctionImpl
    public void reset() {
    }
}
