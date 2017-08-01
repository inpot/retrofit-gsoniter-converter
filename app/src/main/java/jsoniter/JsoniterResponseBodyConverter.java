package jsoniter;

import android.util.Log;

import com.jsoniter.JsonIterator;

import java.io.IOException;
import java.lang.reflect.Type;

import okhttp3.ResponseBody;
import retrofit2.Converter;


public class JsoniterResponseBodyConverter<T> implements Converter<ResponseBody,T> {
private String TAG = "converter";

    private Type type;

    public JsoniterResponseBodyConverter(Type type) {
        this.type = type;
    }

    @Override
    public T convert(ResponseBody value) throws IOException {
        Log.i(TAG, "convert: " + type.toString());
        JsonIterator jsonIterator = JsonIterator.parse(value.string());
        //JsonIterator jsonIterator = JsonIterator.parse(value.byteStream(),1024);
        return (T) jsonIterator.read(type);

    }



}
