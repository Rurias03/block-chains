import java.util.Scanner;

public class BlockChainDriver {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java BlockChainDriver <initial_amount>");
            System.exit(1);
        }

        int initialAmount = Integer.parseInt(args[0]);
        BlockChain blockChain = new BlockChain(initialAmount);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Command? help");
        printChain(blockChain);

        while (true) {
            System.out.print("Command? ");
            String command = scanner.nextLine();

            switch (command) {
                case "mine":
                    mineBlock(blockChain);
                    break;
                case "append":
                    appendBlock(blockChain);
                    break;
                case "remove":
                    removeBlock(blockChain);
                    break;
                case "check":
                    checkValidity(blockChain);
                    break;
                case "report":
                    reportBalances(blockChain);
                    break;
                case "help":
                    printHelp();
                    break;
                case "quit":
                    System.exit(0);
                default:
                    System.out.println("Invalid command. Type 'help' for a list of commands.");
            }

            printChain(blockChain);
        }
    }

    private static void printHelp() {
        System.out.println("Valid commands:");
        System.out.println("    mine: discovers the nonce for a given transaction");
        System.out.println("    append: appends a new block onto the end of the chain");
        System.out.println("    remove: removes the last block from the end of the chain");
        System.out.println("    check: checks that the block chain is valid");
        System.out.println("    report: reports the balances of Alexis and Blake");
        System.out.println("    help: prints this list of commands");
        System.out.println("    quit: quits the program");
    }

    private static void printChain(BlockChain blockChain) {
        System.out.println(blockChain);
    }

    private static void mineBlock(BlockChain blockChain) {
        // Implement the logic for mining a block and updating the blockchain
        // You'll need to prompt the user for the amount and print the resulting block
    }

    private static void appendBlock(BlockChain blockChain) {
        // Implement the logic for appending a block and updating the blockchain
        // You'll need to prompt the user for the amount and nonce, then print the resulting block
    }

    private static void removeBlock(BlockChain blockChain) {
        // Implement the logic for removing the last block from the blockchain
        // Print the updated blockchain after removal
    }

    private static void checkValidity(BlockChain blockChain) {
        // Implement the logic for checking the validity of the blockchain
        // Print whether the chain is valid or not
    }

    private static void reportBalances(BlockChain blockChain) {
        // Implement the logic for reporting the balances of Alexis and Blake
        // Print the balances
    }
}
