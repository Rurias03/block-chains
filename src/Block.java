import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Block {
    private int num;
    private int amount;
    private long nonce;
    private Hash prevHash;
    private Hash hash;

    // Constructor for mining the block
    public Block(int num, int amount, Hash prevHash) {
        this.num = num;
        this.amount = amount;
        this.prevHash = prevHash;
        mineBlock(); 
    }


    // Constructor with provided nonce (no need to mine)
    public Block(int num, int amount, Hash prevHash, long nonce) {
        this.num = num;
        this.amount = amount;
        this.prevHash = prevHash;
        this.nonce = nonce;
        this.hash = new Hash(calculateHash(num, amount, prevHash, nonce));
    }

    // Getter for block number
    public int getNum() {
        return num;
    }

    // Getter for amount transferred
    public int getAmount() {
        return amount;
    }

    // Getter for nonce
    public long getNonce() {
        return nonce;
    }

    // Getter for previous block's hash
    public Hash getPrevHash() {
        return prevHash;
    }

    // Getter for block hash
    public Hash getHash() {
        return hash;
    }

    // String representation of the block
    @Override
    public String toString() {
        return String.format("Block %d (Amount: %d, Nonce: %d, prevHash: %s, hash: %s)", num,
                amount, nonce, prevHash.toString(), hash.toString());
    }

    public static byte[] calculateHash(int num, int amount, Hash prevHash, long nonce) {
        MessageDigest md;
        byte[] digest = new byte[1000];
        ByteBuffer byteinfo = ByteBuffer.allocate(1000);
        try {
            md = MessageDigest.getInstance("sha-256");
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
        byteinfo.putInt(num);
        byteinfo.putInt(amount);
        byteinfo.put(prevHash.getData());
        digest = byteinfo.putLong(nonce).array(); 

        md.update(digest);
        digest = md.digest();

        return digest;
    } // calculateHash(String)

    // Helper method for mining a block (you can call this method from the mining constructor)
    private void mineBlock() {
        long newnonce = 0;
        boolean done = false;
        Hash temphash = new Hash(calculateHash(num, amount, prevHash, newnonce));
        //Add a way to eliminate already used nonces
        while (!done) {
            temphash = new Hash(calculateHash(num, amount, prevHash, newnonce));
            newnonce++;
            done = temphash.isValid();
        }
        this.hash = temphash;
        this.nonce = newnonce;
    }
}
