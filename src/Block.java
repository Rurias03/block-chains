import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Block {
    private int num;
    private int amount;
    private long nonce;
    private Hash prevHash;
    private Hash hash;

    public Block(int num, int amount, Hash prevHash) {
        this.num = num;
        this.amount = amount;
        this.nonce = mineBlock();
        this.prevHash = prevHash;
        this.hash = calculateHash();
        // Implement the mining operation to discover the nonce and compute the hash
        // Use the MessageDigest class and ByteBuffer for this
    }


    // Constructor with provided nonce (no need to mine)
    public Block(int num, int amount, Hash prevHash, long nonce) {
        this.num = num;
        this.amount = amount;
        this.prevHash = prevHash;
        this.nonce = nonce;
        computeHash();
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

    public static byte[] calculateHash(int num, int anount, Byte[] prevHash, long nonce)
            throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("sha-256");
        md.update(msg.getBytes());
        byte[] hash = md.digest();
        return hash;
    } // calculateHash(String)

    // Helper method for mining a block (you can call this method from the mining constructor)
    private long mineBlock() {
        long nonce = 0;
        boolean done = false;
        while(!done)
        {
      nonce++;
      hash = calculateHash(num, amount, prevHash, nonce);
        // Implement the mining logic here
        // Use MessageDigest and ByteBuffer to update the hash with relevant block information
        // Search the space of nonces by iterating over all possible long values
    }

    // Helper method for mining a block (you can call this method from the mining constructor)
    private long mineBlock() {
        long nonce = 0;
        boolean done = false;
        while (!done) {
            nonce++;
            hash = calculateHash();
            done = hash.isValid();
        }
        return nonce;
    }
}
