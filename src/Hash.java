import java.util.Arrays;

public class Hash {
    private byte[] data;

    // Constructor
    public Hash(byte[] data) {
        this.data = data;
    }

    // Getter for data
    public byte[] getData() {
        return data;
    }

    // Check if the hash is valid
    public boolean isValid() {
        // Implement the logic to check if the first three indices contain zeroes
        // Hint: You can use a loop to iterate through the first three indices of the data array
    }

    // String representation of the hash as a string of hexadecimal digits
    public String toString() {
        // Implement the logic to convert the byte array to a hexadecimal string
        // You can use Byte.toUnsignedInt and String.format for this
    }

    // Check if this hash is equal to another hash
    public boolean equals(Object other) {
        // Implement the logic to check equality using Arrays.equals
        // Make sure to check if 'other' is an instance of Hash before casting
    }
}
