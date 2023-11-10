import java.util.Scanner;
import java.io.PrintWriter;
import java.security.Permission;
public class BlockChainDriver {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java BlockChainDriver <initial_amount>");
            System.exit(1);
        }

        int initialAmount = Integer.parseInt(args[0]);
        BlockChain blockChain = new BlockChain(initialAmount);
        Scanner eye = new Scanner(System.in);
        PrintWriter pen = new PrintWriter(System.out, true);

        System.out.println("Initial Block:");
        printChain(blockChain);
        printHelp();
        while (true) {
            System.out.print("Command? ");
            String command = eye.nextLine();

            switch (command) {
                case "mine":
                    mine(blockChain, pen, eye);
                    break;
                case "append":
                    appendBlock(blockChain, pen, eye);
                    break;
                case "remove":
                    removeBlock(blockChain);
                    break;
                case "check":
                    checkValidity(blockChain, pen);
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

    private static void mine(BlockChain blockChain, PrintWriter pen, Scanner eye) {
        pen.println("Please input amount for transaction");
        pen.println();
        String stringamnt = eye.nextLine();
        int amnt = Integer.valueOf(stringamnt);
        long nonce = blockChain.mine(amnt);
        pen.println("Valid nonce: " + nonce);
    }

    private static void appendBlock(BlockChain blockChain, PrintWriter pen, Scanner eye) {
        pen.println("Please input amount of transaction");
        pen.println();
        String stringamnt = eye.nextLine();
        int amnt = Integer.valueOf(stringamnt);
        pen.println("Please input nonce");
        pen.println();
        String strnonce = eye.nextLine();
        long nonce = Integer.valueOf(strnonce);
        blockChain.append(new Block(blockChain.getSize(), amnt, blockChain.getHash(), nonce));
    }

    private static void removeBlock(BlockChain blockChain) {
        blockChain.removeLast();
        System.out.println(blockChain.toString());
    }

    private static void checkValidity(BlockChain blockChain, PrintWriter pen) {
        if(blockChain.isValidBlockChain()){
            pen.println("Chain is Valid");
        } else{
            pen.println("Chain is not Valid");
        }
    }

    private static void reportBalances(BlockChain blockChain) {
        blockChain.printBalances();
    }
}
