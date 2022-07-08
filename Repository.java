package gitlite;

import java.nio.file.*;

public class Repository {

  // stores current working directory in final CWD field
  // should these be private (with getters)?
  static final Path CWD = Paths.get(System.getProperty("user.dir"));
  // creates path for .gitlite directory
  static final Path GITLITE_DIR = Paths.get(CWD.toString(), ".gitlite");

  // constructor
  public Repository() {
    // create .gitlite directory at path specified by GITLITE_DIR
    Files.createDirectory(GITLITE_DIR);
  }
}
