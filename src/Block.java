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
        this.nonce = ;
        this.prevHash = prevHash;
        this.hash = ;
        // Implement the mining operation to discover the nonce and compute the hash
        // Use the MessageDigest class and ByteBuffer for this
    }

    // Constructor with provided nonce (no need to mine)
    public Block(int num, int amount, Hash prevHash, long nonce) {
        // Implement logic to directly compute the hash using the provided nonce
        // Use the MessageDigest class and ByteBuffer for this
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
        // Implement the logic to format the block as a string
        // Use the provided format in the assignment description
    }

    // Helper method for mining a block (you can call this method from the mining constructor)
    private void mineBlock() {
        // Implement the mining logic here
        // Use MessageDigest and ByteBuffer to update the hash with relevant block information
        // Search the space of nonces by iterating over all possible long values
    }
}
