//cleans the data up
import java.util.ArrayList;
import java.util.Scanner;
public class Reader{
  private String data;
  private ArrayList<Pokemon> pmons;
  private String[] arr;
  

  public Reader(StringBuilder d){
    pmons = new ArrayList<Pokemon>();//arralist
    data = cleanup(d);//data = clean up data
    // arr = new String[data.count(",") + 1];//perfect size
    arr = data.split("\"}");
    
  }

  public static String cleanup(StringBuilder d){
    d = d.delete(0, d.indexOf("[") + 1);
    d = d.delete(d.length()-2, d.length());
    String data = d.toString();
    data.replace("\"", "");
    return data;
  }

  public String toString(){
    String l = "";
    for (String r : arr){
      l += r + "\n";
    }
    return l;
    
  }
}