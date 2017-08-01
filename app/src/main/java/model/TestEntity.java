package model;

import com.jsoniter.annotation.JsonProperty;

public class TestEntity {
    public String error;
    @JsonProperty(value = "rs", required = true)
    public boolean result;
    @JsonProperty(value = "code",required = true)
    public int code2;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("code=");
        builder.append(code2);
        builder.append(" rs=");
        builder.append(result);
        return builder.toString();

    }
}
