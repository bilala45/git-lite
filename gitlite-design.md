# Gitlite Design Document

**Name:** Bilal Ali

## Classes and Data Structures

### Main

Description: main class, handles input commands (and associated errors) and calls corresponding methods

### Repository

Description: represents a gitlite repository

Methods:
- initCommand() -> creates .gitlite folder in cwd (repository initialization happens here, not in constructor)

Notes:
- Most of the methods associated with our commands will be written here

### Commit

Description: represents a single commit

Instance variables:
- commit message (String)
- date (Date object)
- parent commit (Commit object)
- file hash map (Hashmap<String, Blob>)

Notes:
- A commit object is created when the commit command is executed
- File names are keys in hash map -> map to blobs (contents of files)

### Blob
