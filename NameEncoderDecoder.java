class NameEncoderDecoder {

  public String encode(String name) {
    int strecke = name.length();
    char buchstabe;
    String neuerName = "";
    
    for ( int i = 0; i < strecke; i++) {
        buchstabe = name.charAt(i);
        if ( buchstabe == 'e') neuerName = neuerName + '1';
        else if ( buchstabe == 'u') neuerName = neuerName + '2';
        else if ( buchstabe == 'i') neuerName = neuerName + '3';
        else if ( buchstabe == 'o') neuerName = neuerName + '4';
        else if ( buchstabe == 'a') neuerName = neuerName + '5';
        else neuerName = neuerName + buchstabe;
    }
    return "NOTFORYOU" + neuerName + "YESNOTFORYOU";
  }
  
  public String decode(String name) {
    int strecke = name.length();
    char buchstabe;
    String neuerName = "";
    
    
    for ( int i = 9; i < 9 + (strecke-21); i++) {
        buchstabe = name.charAt(i);
      
        if ( buchstabe == '1') neuerName = neuerName + 'e';
        else if ( buchstabe == '2') neuerName = neuerName + 'u';
        else if ( buchstabe == '3') neuerName = neuerName + 'i';
        else if ( buchstabe == '4') neuerName = neuerName + 'o';
        else if ( buchstabe == '5') neuerName = neuerName + 'a';
        else neuerName = neuerName + buchstabe;
    }
    return neuerName;
  }

  public static void main (String[] args) {
      NameEncoderDecoder trottel = new NameEncoderDecoder();
      System.out.println(trottel.encode("Crab"));
      System.out.println(trottel.decode("NOTFORYOUCr5bYESNOTFORYOU"));
      System.out.println(trottel.decode("NOTFORYOUNOTFORYOUYESNOTFORYOU"));
  }  

}