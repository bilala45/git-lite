package gitlite;

public class Main {

  // main method
  public static void main(String[] args) {
    // handle no input arguments
    if (args.length == 0) {
      System.out.println("Please enter a command.");
      // terminates program
      System.exit(0);
    }

    // handle commands (including unrecognized commands)
    String command = args[0];
    switch(command) {
      case "init": break;
      case "add": break;
      case "commit": break;
      case "rm": break;
      case "log": break;
      case "global-log": break;
      case "find": break;
      case "status": break;
      case "checkout": break;
      case "branch": break;
      case "rm-branch": break;
      case "reset": break;
      case "merge": break;
      // handles unrecognized commands
      default: System.out.println("No command with that name exists.");
               System.exit(0);
    }
  }
}
