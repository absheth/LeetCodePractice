JFLAGS = -g# -cp .
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = Learning.java \
		  BubbleSort.java \
		  InsertionSort.java \
		  BinarySearchTree.java \
		  StringPermutation.java \
		  packageClass/Stack.java \
		  TryStack.java \
		  leet-code/Pivot.java \
		  leet-code/LargestNumberAtLeastTwiceofOthers.java \
		  leet-code/PlusOneArray.java \
		  leet-code/FindBottomLeftTreeValue.java \
		  try/TryInner.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class \
		packageClass/*.class \
		leet-code/*.class \
		try/*.class

