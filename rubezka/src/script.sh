javac -d . *.java */*.java

jar cfm Lab3.jar MANIFEST.mf -C . ./

export XML_FILE_PATH=~/.config/lab5/default.xml

export XML_FILE_PATH_WITH_ERROR=~/.config/lab5/error.xml

java -jar Lab3.jar

rm -rf Lab3
