public class BlockExpt {
  public static void main(String[] args){
    byte[] empt = "Seven".getBytes();
    Hash nuhash = new Hash(empt);
    
   Block blok = new Block(1, 300, nuhash);
  System.out.println(blok.toString());
   Block sameblock = new Block(1, 300, nuhash, 14893878);
       System.out.println(sameblock.toString());
   
  }
}
