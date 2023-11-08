public class BlockChain {
    private Node first; // Pointer to the first block in the chain
    private Node last;  // Pointer to the last block in the chain

    // Nested Node class
    private static class Node {
        private Block block;
        private Node next;

        // Node constructor
        public Node(Block block, Node next) {
            this.block = block;
            this.next = next;
        }
    }

    // BlockChain constructor with initial amount
    public BlockChain(int initial) {
        // Implement logic to create a BlockChain with a single block starting with the given initial amount
    }

    // Mine a new block and add it to the chain
    public Block mine(int amount) {
        // Implement logic to mine a new block and add it to the end of the chain
    }

    // Get the size of the blockchain
    public int getSize() {
        // Implement logic to return the size of the blockchain
    }

    // Append a block to the blockchain
    public void append(Block blk) {
        // Implement logic to add a block to the end of the chain
        // Throw IllegalArgumentException if the block cannot be added
    }

    // Remove the last block from the chain
    public boolean removeLast() {
        // Implement logic to remove the last block from the chain
        // Return true if a block is removed, false otherwise
    }

    // Get the hash of the last block in the chain
    public Hash getHash() {
        // Implement logic to return the hash of the last block in the chain
    }

    // Check if the blockchain is valid
    public boolean isValidBlockChain() {
        // Implement logic to walk the blockchain and ensure its blocks are consistent and valid
    }

    // Print balances of Alexis and Blake
    public void printBalances() {
        // Implement logic to print Alexis's and Blake's balances
    }

    // String representation of the blockchain
    @Override
    public String toString() {
        // Implement logic to return a string representation of the blockchain
        // Include the string representation of each block, earliest to latest, one per line
    }
}
