package gitlite;

public class Blob {

  // field for blob content's hex string
  private String sha1HexString;

  // constructor
  public Blob(String sha1HexString) {
    this.sha1HexString = sha1HexString;
  }
}
