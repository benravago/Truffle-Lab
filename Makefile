
include ./Make.inc

bc: dist/language.jar

parser: dist/parser.jar

src/bc/antlr/bcParser.java src/bc/antlr/bcLexer.java : src/bc/antlr/bc.g4 
	$(JAVA) -jar $(ANTLRC) -no-listener -no-visitor -package bc.antlr $<
	rm -f $(<D)/*.{interp,tokens}

dist/parser.jar: src/bc/antlr/bcParser.java src/bc/antlr/bcLexer.java
	rm -fr ./bin && mkdir -p ./bin
	$(JAVAC) -cp $(ANTLR) -d bin -sourcepath src $^
	mkdir -p ./dist
	$(JAR) cf $@ -C bin bc

parser-test: parser
	rm -fr ./bin && mkdir -p ./bin
	${JAVAC} -cp dist/parser.jar:$(ANTLR):$(JUNIT) -d bin -sourcepath test test/bc/antlr/AllTests.java
	$(JAVA) -jar $(JUNIT) -E junit-vintage -cp bin:dist/parser.jar:$(ANTLR) -c bc.antlr.AllTests

dist/language.jar: dist/parser.jar
	rm -fr ./bin && mkdir -p ./bin
	rm -fr ./apt && mkdir -p ./apt
	find src/ch -type f -name '*.java' > apt/files
	${JAVAC} -cp dist/parser.jar:$(ANTLR):$(TRUFFLE_API) -processorpath $(TRUFFLE_DSL) -d bin -s apt -sourcepath src @apt/files
	mkdir -p ./dist
	$(JAR) cf $@ -C bin ch

clean:
	rm -fv ./src/bc/antlr/bc{Parser,Lexer}.java
	rm -fr ./apt
	rm -fr ./bin

