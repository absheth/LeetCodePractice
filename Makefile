JFLAGS = -g# -cp .
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = Learning.java \
	  Pivot.java \
	  BubbleSort.java \
	  InsertionSort.java \
	  BinarySearchTree.java \
	  StringPermutation.java \
	  packageClass/Stack.java \
	  TryStack.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class packageClass/*.class

