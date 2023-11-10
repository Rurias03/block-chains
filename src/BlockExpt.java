public class BlockExpt {
  public static void main(String[] args){
    byte[] empt = "Seven".getBytes();
    Hash nuhash = new Hash(empt);
    
    //Block blok = new Block(1, 300, nuhash);
   // System.out.println(blok.toString());
   BlockChain chain = new BlockChain(300);
    System.out.println(chain.toString());
    chain.mine(-50);
    System.out.println(chain.toString());
   
  }
}
