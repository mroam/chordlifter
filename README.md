# chordlifter
For musicians: project to adjust song lyrics (text files) so that chords can be either within or floating above.

![ChordLifter samples](https://github.com/mroam/chordlifter/blob/main/project-desc/chordlifter-samples-dark.png "ChordLifter")

Compare "[Flat](../main/project-desc/survive-simple-flat.txt)" 
vs "[Lifted](../main/project-desc/survive-simple-lifted.txt)" 
versions of a song. 
[See inverted picture](https://github.com/mroam/chordlifter/blob/main/project-desc/chordlifter-samples.jpg) 

VERSION or DATE: 2022 May

HOW TO START THIS PROJECT: Run tests! They work in IntelliJ (green arrows) & BlueJ ("Run Tests").

AUTHORS: Mike, with ideas from Cole, Sadie, Jia, Max, & Desi.

USER INSTRUCTIONS: Currently working on making [SuperString.java](https://github.com/mroam/chordlifter/blob/main/project1-superstring/SuperString.java) string handling so we can ask for "word" I, or "item" J, or "line" K. We can also ask to getNextChord (or getNextLyric) and we can build a new SuperString from the results of chopFirstChord (or chopFirstLyric).


# TODO:

[ ] Maybe SuperString should be StringChomper with static commands for String disassembly.

[ ] Block setText( ) so it only accepts legit ("" but not null?) Strings.

[ ] Turn [wanna-be-tests](https://github.com/mroam/chordlifter/blob/main/wanna-be-tests.txt) into real tests! See the starter examples in ChordShifterText.java!

[ ] Consider having separate folders (branches!?) for "starter" and "answer-key" versions.

[ ] Revise example picture and all code to use {Chord} rather than [Chord].

[ ] See [openfjx info](https://openjfx.io/openjfx-docs/) which suggests finding JavaFX libraries and use IntelliJ's file:projectStructure:Library to tell IntelliJ where javafx libs live. See [stackoverflow article re javafx](https://stackoverflow.com/questions/35974003/javafx-comes-with-jdk-8) which explains that java8 came with javafx but java 11+ don't and need the openjfx install mentioned above. (IntelliJ wants jdk 11 or 17 for JavaFX. BlueJ is running JavaFX (8 probably) in my chordlifter but IntelliJ isn't. IntelliJ was able to make a new project in different folder  "demoJavaFX" which runs and acquired its own javaFX (11+?) from somewhere.)

[ ] Use Bluej's example of file reader for TextyText.getTextFromFile( )

# History/DidDo see [done](https://github.com/mroam/chordlifter/blob/main/proj-history/done.md)

# Ideas, Things to add
* Possible implementation of symbol table: keys & values (with hashmap)
* Possible implementation of song: linked list
* MVC!
* Extra features: search for melody snippets in multiple songs!
* Kinds of data we could track: who sings which verse, which instruments play which notes.
* include note hints, e.g. ( c d e fh )


# Things to decide: 
* if {Am Bm} are in one bracket enclosure, is that one "chord" or two???


# Ah-hah! Learning by doing...
* BlueJ didn't at first run the ChordTest that intelliJ had made,
and didn't stick it to Chord class until I told blueJ to make its own ChordTest. 
BlueJ squawked about it existing already, and moved the intelliJ test into position.
* IntelliJ doesn't import as much for its tests, and has to specify longer prefixes.
* To see the TextDialogExamples (there are separate directories for the BlueJ and IntelliJ versions.
* * When running BlueJ, right click TextDialogExample & "Run JavaFX Application" (the "new TextDialogExample" doesn't seem to work May 2022).
* * When running IntelliJ, can use its terminal to `javac TextDialogExample.java` and  `java TextDialogExample`.
* IntelliJ new Project on new install has option to download java 18 (other versions avail) and wants to put it into ~/Library/Java/JavaVirtualMachines/openjdk-18.0.1.1
* IntelliJ: new Java files should go into the "src" folder, else "Run" has trouble finding them.
* IntelliJ: community edition can become education by merely adding the EduTools Plugin.
* IntelliJ: reasonable package com.michaelroam.hellomilton;  // we should put it top of all interactors
* IntelliJ: nice "sout" code completion gives System.out.println("") with cursor inside quotes!

# References
* [Markdown Cheatsheet](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)
* [BlueJ IDE for Java & Stride](https://www.bluej.org) is cool in visual display of Classes, Tests, and interactive instances.
* [IDEA IntelliJ IDE for Java & others](https://www.jetbrains.com/help/idea/getting-started.html)'s starter & overview info.
