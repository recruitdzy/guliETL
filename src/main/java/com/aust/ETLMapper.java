package com.aust;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class ETLMapper extends Mapper<LongWritable, Text, Text, NullWritable> {

    private Text text = new Text();
    @Override
    protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, NullWritable>.Context context) throws IOException, InterruptedException {

        String s = value.toString();

        String str = ETLUtil.etlStr(s);

        if(str == null){
            return;
        }

        text.set(str);

        context.write(text,NullWritable.get());


    }

    public static void main(String[] args) {


    }
}

