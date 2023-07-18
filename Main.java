import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try{
      //offset 20(automatic) - only shows first 20 pokemon
      URL url = new URL("https://pokeapi.co/api/v2/pokemon/");
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();

      conn.setRequestMethod("GET");
      conn.connect();//making an actual connection

      //check for a connection - should be 200
      int responseCode = conn.getResponseCode();
      if(responseCode != 200){
        // throw new RuntimeException("HttpResponseCode: " + responseCode);
        System.out.println("Not A Good Connection: " + responseCode);
      }
      else{
        // System.out.println("Steady Connection: " + responseCode);
        StringBuilder infoString = new StringBuilder();
        Scanner scan = new Scanner(url.openStream());

        while(scan.hasNext())
          infoString.append(scan.nextLine());
        scan.close();

        System.out.println(infoString);

        System.out.println("\n\nThere seems to be a problem here 1\n\n");
        
        JSONParser parse = new JSONParser();

        // String k = infoString.toString();
        // Object obj = parse.parse();
        // if(obj instanceof JSONObject)
        //   System.out.println("instance of json object");
        // else if(obj instanceof JSONArray)
        //   System.out.println("instance of Json Array");
        // else
        //   System.out.println("idk what's the issue?");
        // System.out.println(obj.Class());

        //idk what the issue is here
        // Object obj = parse.parse(infoString.toString());
        // JSONArray array = new JSONArray();
        // array.add(obj);
        JSONArray objectData = (JSONArray) parse.parse(infoString.toString());


        System.out.println(objectData.get(0));




          
      }









      
    }
    catch(Exception e){
      e.printStackTrace();
    }

    
    System.out.println("This code has been executed");
  }
}