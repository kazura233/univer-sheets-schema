package org.example.sheets.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.sheets.style.StyleData;

import java.io.IOException;

/**
 * StyleData 反序列化器
 * 用于处理可能为 StyleData 对象、字符串（样式 ID）或 null 的混合类型字段
 */
public class StyleDataDeserializer extends JsonDeserializer<Object> {

    /**
     * 反序列化样式数据
     * 
     * @param parser  JSON 解析器
     * @param context 反序列化上下文
     * @return StyleData 对象、字符串（样式 ID）或 null
     * @throws IOException 当遇到无法处理的 JSON 类型时抛出
     */
    @Override
    public Object deserialize(JsonParser parser, DeserializationContext context) throws IOException {
        JsonToken token = parser.getCurrentToken();

        // 处理 null 值
        if (token == JsonToken.VALUE_NULL) {
            return null;
        }

        // 处理字符串值（样式 ID）
        if (token == JsonToken.VALUE_STRING) {
            return parser.getValueAsString();
        }

        // 处理对象值（StyleData）
        if (token == JsonToken.START_OBJECT) {
            ObjectMapper mapper = (ObjectMapper) parser.getCodec();
            return mapper.readValue(parser, StyleData.class);
        }

        // 如果是其他类型，抛出异常
        throw new IOException("无法反序列化样式数据：期望 null、字符串或对象，但得到 " + token);
    }
}
