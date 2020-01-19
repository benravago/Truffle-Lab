
include ./Make.inc

bc: dist/language.jar

parser: dist/parser.jar

src/bc/antlr/bcParser.java src/bc/antlr/bcLexer.java : src/bc/antlr/bc.g4 
	$(JAVA) -jar $(ANTLRC) -no-listener -no-visitor -package bc.antlr $<
	rm -f $(<D)/*.{interp,tokens}

dist/parser.jar: src/bc/antlr/bcParser.java src/bc/antlr/bcLexer.java
	rm -fr build && mkdir -p build/classes
	$(JAVAC) -cp $(ANTLR) -d build/classes -sourcepath src $^
	mkdir -p $(@D)
	$(JAR) cf $@ -C build/classes bc

parser-test: parser
	rm -fr build && mkdir -p build/classes
	${JAVAC} -cp dist/parser.jar:$(ANTLR):$(JUNIT) -d build/classes -sourcepath test test/bc/antlr/AllTests.java
	$(JAVA) -jar $(JUNIT) -E junit-vintage -cp build/classes:dist/parser.jar:$(ANTLR) -c bc.antlr.AllTests

parser-rules: parser
	cat test/bc/antlr/bc.jsh | $(JSHELL) --class-path dist/parser.jar:$(ANTLR) -R-DclassName=bc.antlr.bcParser - > test/bc/antlr/bcParserRules.java

dist/language.jar: dist/parser.jar
	rm -fr build && mkdir -p build/{classes,sources}
	find src/ch -type f -name '*.java' > build/files
	${JAVAC} -cp dist/parser.jar:$(ANTLR):$(API) -processorpath $(DSL) -d build/classes -s build/sources -sourcepath src @build/files
	mkdir -p $(@D)
	$(JAR) cf $@ -C build/classes ch

clean:
	rm -fv src/bc/antlr/bc{Parser,Lexer}.java
	rm -fr build

