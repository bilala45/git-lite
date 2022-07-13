package gitlite;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.lang.IllegalArgumentException;

public class Utils {

  // generates SHA-1 hash string given byte array input data
  public static String getSHA1Hash(byte[] data) {
    try {
      // MessageDigest class uses secure hashing algorithms to provide hashing functionality
      // initialize message digest object with algorithm
      MessageDigest sha = MessageDigest.getInstance("SHA1");
      // compute hash on input data
      byte[] hash = sha.digest(data);

      // variable to build hash hex string
      String hexString = "";
      // iterate through hash byte array
      for (byte i : hash) {
        // formats hexadecimal string
        hexString += String.format("%02X", i);
      }
      return hexString;
    }
    // handle error thrown by getInstance method if hashing algorithm is not supported
    // error should never occur since sha1 hash is available
    catch (NoSuchAlgorithmException e) {
      // error handled as IllegalArgumentException to indicate illegal argument to method
      throw new IllegalArgumentException("SHA-1 hash is not supported");
    }
  }
}
