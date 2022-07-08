package gitlite;

import java.util.HashMap;

public class Commit {

  // instance variables
  // commit message
  private String message;
  // date of commit
  //private Date commitDate;
  // parent commit
  private Commit parent;
  // file names and associated blobs
  //private HashMap<String, Blob> files;

  // commit constructor
  public Commit(String message, Commit parent) {
    this.message = message;
    this.parent = parent;
  }
}
