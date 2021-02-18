package Strings.EncodeANDDecodeTinyURL535;

import java.util.HashMap;
import java.util.Map;

public class EncodeANDDecodeTinyURL {

    Map<String, String> map;
    int encodeValue = 0;
    public EncodeANDDecodeTinyURL(){
        map = new HashMap<>();
    }
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String tiny = "http://tinyurl.com/" + ++encodeValue;
        map.put(tiny, longUrl);
        return tiny;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}
