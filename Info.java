//submits pokemon basic info to InfoFilter
import java.util.ArrayList;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Info{
  private ArrayList<String> in;
  private String name;
  private String type;
  private int id;
  private String ability;
  private String move;
  private String image;
  
  URL url;
  HttpURLConnection conn;
  Scanner scan;

  public Info(String name, String url){
    this.name = name;
    this.in = new ArrayList<String>();//new arraylist - holds Pokemon info
    try{
      this.url = new URL(url);
      this.conn = (HttpURLConnection) this.url.openConnection();
      this.conn.setRequestMethod("GET");
    }
    catch(Exception e){
      e.printStackTrace();
    }
  }

  public ArrayList<String> Read(){
    // ArrayList<String> new1 = new ArrayList<String>();
    try{
      
      this.conn.connect();

      StringBuilder infoString = new StringBuilder();
      scan = new Scanner(url.openStream());

      while(scan.hasNext())
        infoString.append(scan.nextLine());
      scan.close();

      InfoFilter f1 = new InfoFilter();
      this.in.addAll(f1.getInfo(infoString));
      // new1.addAll(InfoFilter.getInfo(infoString));
      return this.in;
      
    }
    catch(Exception e){
      e.printStackTrace();
    }
    return this.in;

    
  }

  public ArrayList<String> getList(){
    return this.in;
  }
}