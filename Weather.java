import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Weather {

      public static String getWeather(String message, Model model) throws IOException {
        URL ur1 = new URL("http://api.openweathermap.org/data/2.5/weather?q=" + message + "&units=metric&appid=421bee5253bb59c7f8c6cb44e67c7cfe");
        Scanner in = new Scanner((InputStream) ur1.getContent());
        String result = "";
        while (in.hasNext()) {
            result += in.nextLine();
        }

        JSONObject object = new JSONObject(result);
        model.setName(object.getString("name"));

        JSONObject main = object.getJSONObject("main");
        model.setTemp(main.getDouble("temp"));
        model.setHuidity(main.getDouble("humidity"));

        JSONArray getArray = object.getJSONArray("weather");
        for (int i = 0; i < getArray.length(); i++) {
            JSONObject obj = getArray.getJSONObject(i);
            model.setIcon((String) obj.get("icon"));
            model.setMain((String) obj.get("main"));
        }


        return "City " + model.getName() + "\n"+
               "temp"+ model.getTemp() + "\n"

                + "Humidity" + model.getHuidity() + "%" + "\n"
                + "Main : "+model.getMain()+"\n"
                + "Weather " + "http://openweathermap.org/img/w/" + model.getIcon() + ".png";
    }


}
