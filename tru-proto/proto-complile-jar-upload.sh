rm -rf build/*
rm -rf repos/*
rm -rf src/main/java/*
protoc -I=src/main/resources/ --java_out=src/main/java/ src/main/resources/gen.proto
gradle jar --stacktrace
gradle uploadArchives
