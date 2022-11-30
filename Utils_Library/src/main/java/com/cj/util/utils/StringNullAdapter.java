package com.cj.util.utils;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * @author 李昌骏
 * @desc StringNullAdapter
 * @time 2018/10/23 11:00
 */

public class StringNullAdapter extends TypeAdapter<String> {
    @Override
    public String read(JsonReader reader) throws IOException {
        // TODO Auto-generated method stub
        if (reader.peek () == JsonToken.NULL) {
            reader.nextNull ();
            return "";
        }
        return reader.nextString ();
    }

    @Override
    public void write(JsonWriter writer, String value) throws IOException {
        // TODO Auto-generated method stub
        if (value == null) {
            writer.nullValue ();
            return;
        }
        writer.value (value);
    }
}

