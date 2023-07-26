public class Pokemon{
  String name;
  String url;
  String ability;

  public Pokemon(String n, String u){
    name = n;
    url = u;
  }
  
  public String getName(){
    return name;
  }

  public String getURL(){
    return url;
  }
  
}