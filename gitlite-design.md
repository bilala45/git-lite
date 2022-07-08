# Gitlite Design Document

**Name:** Bilal Ali

## Classes and Data Structures

### Main

Description: main class, handles input commands (and associated errors) and calls corresponding methods

### Repository

Description: repository object

Notes:
- Maybe an instance of this is created when our gitlite repository is initialized?
- Most of the methods associated with our commands will likely be written here

### Commit

Description: commit object

Instance variables:
- commit message (String)
- date (Date object? look into this)
- parent commit reference (Commit object)

Notes:
- An commit object is created when the commit command is executed

### Blob
