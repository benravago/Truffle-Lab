
JAVA_HOME = /opt/graalvm-ce-java11-19.3.0

JAVA  = $(JAVA_HOME)/bin/java
JAVAC = $(JAVA_HOME)/bin/javac
JAR   = $(JAVA_HOME)/bin/jar

TRUFFLE_LIB = $(JAVA_HOME)/lib/truffle

API = $(TRUFFLE_LIB)/truffle-api.jar
DSL = $(TRUFFLE_LIB)/truffle-dsl-processor.jar

ANTLR  = lib/antlr4-runtime-4.7.2.jar
ANTLRC = lib/antlr-4.7.2-complete.jar

JUNIT  = lib/junit-platform-console-standalone-1.5.2.jar

