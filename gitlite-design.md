# Gitlite Design Document

**Name:** Bilal Ali

## Classes and Data Structures

### Main

Description: main class, handles input commands (and associated errors) and calls corresponding methods

### Repository

Description: repository object

Constructor: creates .gitlite folder in cwd (think of this as initializing the repository itself)

Methods:
- initCommand()

Notes:
- Maybe an instance of this is created when our gitlite repository is initialized?
- Most of the methods associated with our commands will be written here

### Commit

Description: commit object

Instance variables:
- commit message (String)
- date (Date object? look into this)
- parent commit (Commit object)
- file hash map (Hashmap<String, Blob>)

Notes:
- A commit object is created when the commit command is executed
- File names are keys in hash map -> map to blobs (contents of files)

### Blob

## To-do List
- Write initCommand() method in Repository class
- When initializing a gitlite repository, the following should happen:
1. .gitlite directory created in cwd (Repository constructor will create this)
2. New commit created with date set to Unix Epoch, commit message "initial commit", and parent set to null
