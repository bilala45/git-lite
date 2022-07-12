package gitlite;

import java.nio.file.*;

public class Repository {

  // stores current working directory in final CWD field
  // should these be private (with getters)?
  static final Path CWD = Paths.get(System.getProperty("user.dir"));
  // creates path for .gitlite directory
  static final Path GITLITE_DIR = Paths.get(CWD.toString(), ".gitlite");

  // init command
  public static void initCommand() {
    // handles case of existing .gitlite directory
    if (Files.exists(GITLITE_DIR)) {
      System.out.println("A Gitlet version-control system already exists in the current directory.");
      System.exit(0);
    }
    // creates .gitlite directory
    try {
      Files.createDirectory(GITLITE_DIR);
    }
    catch(Exception e) {
      System.out.println(e);
    }

    // create initial commit
    // set parent of initial commit to null
    new Commit("initial commit", null);
  }
}
