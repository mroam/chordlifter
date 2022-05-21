# chordlifter
For musicians: project to adjust song lyrics (text files) so that chords can be either within or floating above.

![ChordLifter samples](https://github.com/mroam/chordlifter/blob/main/project-desc/chordlifter-samples.png "ChordLifter")

[See example picture](https://github.com/mroam/chordlifter/blob/main/project-desc/chordlifter-samples.png) 
or compare "[Flat](../main/project-desc/survive-simple-flat.txt)" 
vs "[Lifted](../main/project-desc/survive-simple-lifted.txt)" 
versions of a song.

VERSION or DATE: 2022 May 20

HOW TO START THIS PROJECT: Run tests! (It works in IntelliJ & BlueJ.)

AUTHORS: Mike, with ideas from Cole, Sadie, Jia, Max, & Desi

USER INSTRUCTIONS: Current focus is trying to get [TextyText.java](https://github.com/mroam/chordlifter/blob/main/Texty-is-focus/TextyText.java) to be like
LiveCode's string handling so we can ask for "word" I, or "item" J, or "line" K.


# TODO:

[ ] Use Bluej's example of file reader for TextyText.getTextFromFile( )

[ ] Build more tests of TextyText for "word" and "char"

[ ] Block setText( ) so it only accepts legit ("" but not null?) Strings.

[ ] Turn [wanna-be-tests](https://github.com/mroam/chordlifter/blob/main/wanna-be-tests.txt) into real tests! See the starter examples in ChordShifterText.java!

[ ] Consider having separate folders (branches!?) for "starter" and "answer-key" versions.

[ ] Revise example picture and all code to use {Chord} rather than [Chord].

[ ] Maybe TextyText should be StringChomper with static commands for String disassembly.

[ ] See [openfjx info](https://openjfx.io/openjfx-docs/) which suggests finding javafx libraries and use IntelliJ's file:projectStructure:Library to tell IntelliJ where javafx libs live. See [stackoverflow article re javafx](https://stackoverflow.com/questions/35974003/javafx-comes-with-jdk-8) which explains that java8 came with javafx but java 11+ don't and need the openjfx install mentioned above. (IntelliJ wants jdk 11 or 17 for JavaFX. BlueJ is running JavaFX (8 probably) in my chordlifter but IntelliJ isn't. IntelliJ was able to make a new project in different folder  "demoJavaFX" which runs and acquired its own javaFX (11+?) from somewhere.)


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
* * When running IntelliJ, can use its terminal to `javac TextDialogExample.java` and  `java TextDialogExample`

# References
* [Markdown Cheatsheet](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)
* 
