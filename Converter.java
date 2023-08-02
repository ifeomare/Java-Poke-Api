//converts enpoints to Pokemon - done
import java.util.ArrayList;
public class Converter{
  private String name;
  private String url;
  private ArrayList<Pokemon> pmons;
  
  public Converter(String[] arr){
    ArrayList<String> test = new ArrayList<String>();
    int n;//name
    int u;//url
    int end;
    Info i1;
    pmons = new ArrayList<Pokemon>();
    for(String l : arr){
      //name
      n = l.indexOf(":") + 2;
      end = l.indexOf("\"", n);
      name = l.substring(n, end);

      //url
      u = l.indexOf(":", end) + 2;
      url = l.substring(u);
      
      i1 = new Info(name, url);
      test.addAll(0, i1.Read());
      pmons.add(new Pokemon(name, url, test.get(0), Integer.parseInt(test.get(1)), test.get(2), test.get(3), test.get(4) ));
      // pmons.add(new Pokemon(name, url));
    }
    
  }

  public ArrayList<Pokemon> getAL(){
    return pmons;
  }
  
  public String toString(){
    String p = "";
    for(Pokemon l : pmons){
      p += l + "\n";
    }
    return p;
  }
}