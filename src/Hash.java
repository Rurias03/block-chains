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
        // Convert each byte to a hexadecimal string and concatenate them
        StringBuilder stringBuilder = new StringBuilder();
        for (byte b : data) {
            stringBuilder.append(String.format("%02x", b));
        }
        return stringBuilder.toString();
    }

    // Check if this hash is equal to another hash
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null || getClass() != other.getClass())
            return false;

        Hash otherHash = (Hash) other;
        return Arrays.equals(data, otherHash.data);
    }
}
