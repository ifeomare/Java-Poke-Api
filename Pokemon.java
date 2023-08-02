public class Pokemon{
  private String name;
  private String url;
  private String type;
  private int id;
  private String ability;
  private String move;
  private String imageUrl;

  public Pokemon(String n, String u, String t, int d, String a, String m, String i)  {
    name = n;
    url = u;
    type = t;
    id = d;
    ability = a;
    move = m;
    imageUrl = i;
  }

  public void setInfo(String t, int i, String a, String m, String im){
    type = t;
    id = i;
    ability = a;
    move = m;
    imageUrl = im;
  }
  
  //getters
  public String getName(){
    return name;
  }

  public String getURL(){
    return url;
  }

  public String getType(){
    return type;
  }

  public int getId(){
    return id;
  }

  public String getAbility(){
    return ability;
  }

  public String getMove(){
    return move;
  }

  public String getPic(){
    return imageUrl;
  }

  //
  public String toString(){
    return "\n\n" + name + " : " + url +
    "\ntype : " + type +
    "\nid : " + id +
    "\nability : " + ability +
    "\nmove : " + move +
    "\nimage : " + imageUrl;
  }
  
}




//setters
  // public void setType(String t){
  //   type = t;
  // }

  // public void setId(int i){
  //   id = i;
  // }

  // public void setAbility(String a){
  //   ability = a;
  // }

  // public void setMove(String m){
  //   move = m;
  // }

  // public void setPic(String i){
  //   imageUrl = i;
  // }



// public Pokemon(String n, String u){
    // name = n;
    // url = u;
    // type = t;
    // id = d;
    // ability = a;
    // move = m;
    // imageUrl = i;
  // }
  