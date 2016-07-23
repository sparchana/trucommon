# Trucommon
## Sub-Module: tru-proto (gradle)
This project compiles proto-java files and generate .jar file.
Project structure:
src
    ├── main
    │   ├── java
    │   │   └── in
    │   │       └── trujobs
    │   └── resources
    │       └── gen.proto
    └── test
        ├── java
        └── resources

1. Proto file at src/main/resources/gen.proto
2. cd trucommon/tru-proto/
3. Generate proto-java files like  
```Shell
`protoc -I=src/main/resources/ --java_out=src/main/java/ src/main/resources/gen.proto`
In gen.proto the default package is in.trujobs.proto: 

4. Generated proto-java files reside at src/main/java/
5. To produce jar out of proto-java files. Go to $project_root_folder (Here: tru-proto/). Note: build.gradle contains settings
6. Generate .jar
`gradle jar --stacktrace`
7. Upload it to $project_root_folder/repos dir
`gradle uploadArchives`
8. Settings for trudroid are as follows:
 i) Specifying local repository lookup dir in build-gradle. If not exists, Add the following lines in trudroid/build.gradle under allprojects{ repository { ....
	ivy{
            url "$HOME/truprojects/trucommon/tru-proto/repos"
        }
 Note: Make sure all the three projects are within truprojects/ dir in home/ dir
 ii) If not exists, Add the following lines in trudroid/app/build.gradle under dependencies...
dependencies {	
	 compile 'in.trujobs.proto:tru-proto:1.0.0'
}


