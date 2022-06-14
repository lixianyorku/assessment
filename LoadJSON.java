import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.*;

public class LoadJSON {
    public static JSONObject load(String fileName){
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader(fileName));
            JSONObject jsonObject = (JSONObject) obj;
            return jsonObject;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static Map<String, String> loadOrders(JSONObject jsonObject){
        Map<String, String> ordersList = new HashMap<>();
        Iterator<String> keys = jsonObject.keySet().iterator();
        while(keys.hasNext()) {
            String key = keys.next();
            if (jsonObject.get(key) instanceof JSONObject) {
                String destination =  ((JSONObject) jsonObject.get(key)).get("destination").toString();
                ordersList.put(key, destination);
            }
        }
        return ordersList;
    }
}
