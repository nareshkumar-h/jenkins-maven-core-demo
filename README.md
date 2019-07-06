# Jenkins Build for Maven Core Java Project      

#### Prerequisite:
1. Install Jenkins ( http://localhost:8080 )
2. Create a Maven Core Java Project and upload in Github Repo

### Task 1 : Create a Freestyle project
 * Enter Project name : 
 * Select Freestyle project
 * Build Tasks : Enter Goal : package
 
 #### Task 1.1: General
 * Select Github
 
 #### Task 1.2: Source Code Management
 * Git
 
 #### Task 1.3: Build
 * Add Build Step -> Invoke top level maven targets -> Goals: package
 
 Note: Finally Save.
 
### Task 2: Build Project
 
#### Task 2.1: Console Error
```
[maven-core-java-project] $ cmd.exe /C "mvn package && exit %%ERRORLEVEL%%"
'mvn' is not recognized as an internal or external command,
operable program or batch file.
Build step 'Invoke top-level Maven targets' marked build as failure
Finished: FAILURE
```

#### Jenkins - Global Tool Configuration
* JDK
* MAVE_HOME
