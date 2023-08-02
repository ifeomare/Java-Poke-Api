import java.util.ArrayList;

public class InfoFilter{
  // StringBuilder nine;
  private String type;
  private String id;
  private String ability;
  private String move;
  private String image;
  private ArrayList<String> pmonInfo;

  public InfoFilter(){
    pmonInfo = new ArrayList<String>();
    // nine = new StringBuilder();
    type = "";
    id = "";
    ability = "";
    move = "";
    image = "";
  }

  public ArrayList<String> getInfo(StringBuilder n){    
    this.type = getType(n);
    this.type = this.type.substring( type.indexOf(":")+1, type.indexOf(",") );
    pmonInfo.add( this.type );
    
    this.id = getIndex(n);//id:1
    this.id = this.id.substring( this.id.indexOf(":")+1 );
    pmonInfo.add( this.id );
    
    this.ability = getAbility(n);
    this.ability = this.ability.substring( this.ability.indexOf(":")+1,                                                       this.ability.indexOf(",") );
    pmonInfo.add( this.ability );
    
    this.move = getMove(n);
    this.move = this.move.substring( this.move.indexOf(":")+1,                                                         this.move.indexOf(",") );
    pmonInfo.add( this.move );
    
    this.image = getSprite(n);
    this.image = this.image.substring( this.image.indexOf(":")+1 );
    pmonInfo.add( this.image );
    return pmonInfo;
  }
  
  public static String getType(StringBuilder n){
    int a = n.indexOf("\"type\"");
    int b = n.indexOf("\"type\"", a+1);//actual type - starting point
    int name = n.indexOf("\"name\"", b);
    int end = n.indexOf("}", b);
    String s = (n.substring(name, end));//type and url
    s = s.replaceAll("\"","");
    return s.toString();
    // type = s;
  }

  public static String getSprite(StringBuilder n){
    int versions = n.indexOf("official-artwork");//after versions
    int a = n.indexOf("front_default", versions);//
    int b = n.indexOf("front_default", a);//second default we need
    int end = n.indexOf(",", b);
    String s = (n.substring(b, end));
    s = s.replaceAll("\"","");
    return s.toString();
  }

  public static String getMove(StringBuilder n){
    int a = n.indexOf("move");
    int b = n.indexOf("\"name\"", a);
    int end = n.indexOf("}", a);
    String s = (n.substring(b, end));
    s = s.replaceAll("\"","");
    return s.toString();
  }
  
  public static String getIndex(StringBuilder n){
    int a = n.indexOf("game_indices");
    int b = n.indexOf("\"id\"", a);//finds id starting from game ind
    int end = n.indexOf(",", b);//comma = separator
    String s = (n.substring(b, end));
    s = s.replaceAll("\"","");
    return s.toString(); //id:1
  }
  
  public static String getAbility(StringBuilder n){
    int a = n.indexOf("\"ability\"");
    int name = n.indexOf("\"name\"", a);
    int end = n.indexOf("}", a);
    String s = (n.substring(name, end));
    s = s.replaceAll("\"","");
    return s.toString();
  }
  
}
