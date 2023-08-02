import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

class Main {

  
  public static void main(String[] args) {
    try{
      URL url = new URL("https://pokeapi.co/api/v2/pokemon/");
      // URL url = new URL("https://pokeapi.co/api/v2/pokemon?limit=20&offset=20");
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

        Reader r1 = new Reader(infoString); //infoString is now different
        // System.out.println(r1.getArr().length);
        Converter c1 = new Converter(r1.getArr());
        System.out.println(c1);
        System.out.println(c1.getAL());
      }
    }
    catch(Exception e){
      e.printStackTrace();
    }

    
    System.out.println("This code has been executed");
  }
}

//first method - I wonder why it didn't work
// JSONParser parse = new JSONParser();
        // Object obj = parse.parse(infoString.toString());
        // JSONArray array = new JSONArray();
        // array.add(obj);



// String k = infoString.toString();
        // Object obj = parse.parse();
        // if(obj instanceof JSONObject)
        //   System.out.println("instance of json object");
        // else if(obj instanceof JSONArray)
        //   System.out.println("instance of Json Array");
        // else
        //   System.out.println("idk what's the issue?");
        // System.out.println(obj.Class());
        
        //for some reason, this doesn't work - idk what the issue is here                       // JSONArray objectData = (JSONArray) parse.parse(infoString.toString());