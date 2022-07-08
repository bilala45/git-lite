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
    try {
      Files.createDirectory(GITLITE_DIR);
    }
    catch(Exception e) {
      System.out.println(e);
    }
  }

  // init command (should this be static?)
  public static void initCommand() {
    // initialize Repository object in cwd
    // creates the .gitlite directory
    new Repository();
    // create initial commit
    // set parent of initial commit to null
    new Commit("initial commit", null);
  }
}
