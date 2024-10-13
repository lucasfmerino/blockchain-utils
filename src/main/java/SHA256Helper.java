import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class SHA256Helper {

    /**
     *  GENERATE HASH
     *
     * @param data The input string to hash.
     * @return The hexadecimal representation of the SHA-256 hash.
     */
    public static String hash(String data) {
        try {
            byte[] hash = generateSHA256Hash(data);
            return convertBytesToHex(hash);
        } catch (Exception e) {
            throw new RuntimeException("Error generating SHA-256 hash", e);
        }
    }


    /**
     *  GENERATE BYTE ARRAY HASH SHA-256
     *
     * @param data The input string to hash.
     * @return A byte array containing the SHA-256 hash.
     * @throws Exception If the SHA-256 algorithm is not available.
     */
    private static byte[] generateSHA256Hash(String data) throws Exception {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        return digest.digest(data.getBytes(StandardCharsets.UTF_8));
    }


    /**
     *  CONVERT BYTES TO HEX
     *
     * @param bytes The byte array to convert.
     * @return The hexadecimal string representation of the byte array.
     */
    private static String convertBytesToHex(byte[] bytes) {
        StringBuilder hexadecimalString = new StringBuilder();
        for (byte b : bytes) {
            String hexadecimal = Integer.toHexString(0xff & b);
            if (hexadecimal.length() == 1) {
                hexadecimalString.append('0');
            }
            hexadecimalString.append(hexadecimal);
        }
        return hexadecimalString.toString();
    }

}