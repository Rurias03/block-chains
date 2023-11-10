public class BlockExpt {
  public static void main(String[] args){
    byte[] empt = "Seven".getBytes();
    System.out.println(empt);
    Hash nuhash = new Hash(empt);
    for (int i = 0; i < empt.length; i++){
      System.out.print(empt[i]);
      System.out.flush();
    }
    System.out.println("     "   + nuhash);
    Block blok = new Block(1, 300, nuhash);
    System.out.println(blok.toString());
  }
}
