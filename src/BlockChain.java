public class BlockChain {
    private Node first; // Pointer to the first block in the chain
    private Node last; // Pointer to the last block in the chain

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
        // Create the first block with a null previous hash
        Hash nullPrevHash = new Hash(new byte[32]); // Assuming 32 bytes for the hash
        Block firstBlock = new Block(0, initial, nullPrevHash);
        first = new Node(firstBlock, null);
        last = first;
    }

    // Mine a new block and add it to the chain
    public Block mine(int amount) {
        // Implement logic to mine a new block and add it to the end of the chain
    }

    // Get the size of the blockchain
    public int getSize() {
        int size = 0;
        Node current = first;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    // Append a block to the blockchain
    public void append(Block blk) {
        // Implement logic to add a block to the end of the chain
        // Throw IllegalArgumentException if the block cannot be added
    }

    // Remove the last block from the chain
    public boolean removeLast() {
        if (first == null) {
            // Blockchain is empty, nothing to remove
            return false;
        }
        if (first.next == null) {
            // There is only one block in the chain, cannot remove it
            return false;
        }

        Node current = first;
        while (current.next.next != null) {
            // Traverse to the second-to-last node
            current = current.next;
        }

        // Remove the last block
        current.next = null;
        last = current;

        return true;
    }

    // Get the hash of the last block in the chain
    public Hash getHash() {
        // Implement logic to return the hash of the last block in the chain
    }

    // Check if the blockchain is valid
    public boolean isValidBlockChain() {
        Node current = first;
        boolean isFirstBlock = true;

        while (current != null) {
            if (isFirstBlock) {
                // For the first block, validate without considering previous hash
                if (!current.block.getHash().isValid()) {
                    return false;
                }
                isFirstBlock = false;
            } else {
                // For subsequenct blocks, validate considering previous hash
                if (!current.block.getHash().isValid()
                        || !current.block.getPrevHash().equals(current.next.block.getHash())) {
                    return false;
                }
            }
            current = current.next;
        }
        return true;
    }

    // Print balances of Alexis and Blake
    public void printBalances() {
        // Implement logic to print Alexis's and Blake's balances
    }

    // String representation of the blockchain
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node current = first;

        while (current != null) {
            stringBuilder.append(current.block.toString());
            stringBuilder.append("\n");

            current = current.next;
        }
        return stringBuilder.toString();
    }
}
