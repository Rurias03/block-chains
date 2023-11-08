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
        boolean check = true;
        for (int i = 0; i < 4; i++) {
            check = check == (data[i] == 0);
        }
        return check;
        // Implement the logic to check if the first three indices contain zeroes
        // Hint: You can use a loop to iterate through the first three indices of the data array
    }

    // String representation of the hash as a string of hexadecimal digits
    @Override
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
        if (other == null || getClass() != other.getClass())
            return false;
        else {
            Hash oHash = (Hash) other;
            return (Arrays.equals(oHash.data, this.data));
        }
    }
}
