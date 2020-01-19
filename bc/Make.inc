
JAVA_HOME = /opt/graalvm-ce-java11-19.3.1

JAVA = $(JAVA_HOME)/bin/java
JAVAC = $(JAVA_HOME)/bin/javac
JAR = $(JAVA_HOME)/bin/jar
JSHELL = $(JAVA_HOME)/bin/jshell

TRUFFLE_LIB = $(JAVA_HOME)/lib/truffle

API = $(TRUFFLE_LIB)/truffle-api.jar
DSL = $(TRUFFLE_LIB)/truffle-dsl-processor.jar

ANTLR  = lib/antlr-runtime-4.8.jar
ANTLRC = lib/antlr-4.8-complete.jar  

JUNIT  = lib/junit-platform-console-standalone-1.5.2.jar

