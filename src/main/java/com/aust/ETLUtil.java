package com.aust;
import org.apache.hadoop.io.Text;

public class ETLUtil {
    public static String etlStr(String s){

        String[] split = s.split("\t");

        if (split.length < 9) {
            return null;
        }

        split[3] = split[3].replaceAll(" ", "");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < split.length; i++) {
            if (i < 9) {
                if (i == split.length - 1) {
                    stringBuilder.append(split[i]);
                } else {
                    stringBuilder.append(split[i] + "\t");
                }

            }else {
                if (i == split.length - 1) {
                    stringBuilder.append(split[i]);
                } else {
                    stringBuilder.append(split[i] + "&");
                }
            }

//         执行结果
        }

        return stringBuilder.toString();
    }
}



