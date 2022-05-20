# chordlifter
For text songs. Adjust locations of chords in song lyrics: within or floating above.

[See example picture](https://github.com/mroam/chordlifter/blob/main/chordlifter-samples.png) 
or compare "[flat](https://github.com/mroam/chordlifter/blob/main/survive-simple-flat.txt)" 
vs "[Lifted](https://github.com/mroam/chordlifter/blob/main/survive-simple-lifted.txt)" 
versions of a song.

VERSION or DATE: 2022 May 20

HOW TO START THIS PROJECT: Run tests! Works in intelliJ & BlueJ. 
To see the TextDialogExample 

-- in BlueJ, right click TextDialogExample & "Run JavaFX Application" 
(the "new TextDialogExample" doesn't seem to work May 2022).

-- In IntelliJ tell the terminal: java TextDialogExample

AUTHORS: Mike, with ideas from Cole, Sadie, Jia, Max, & Desi

USER INSTRUCTIONS: Current focus is trying to get TextyText to be like
LiveCode's string handling so we can ask for "word" I, or "item" J, or "line" K.


# TODO:

[ ] Use Bluej's example of file reader for TextyText.getTextFromFile( )

[ ] Build more tests of TextyText for "word" and "char"

[ ] Block setText( ) so it only accepts legit ("" but not null?) Strings.

[ ] Turn [wanna-be-tests](https://github.com/mroam/chordlifter/blob/main/wanna-be-tests.txt) into real tests!

[ ] Consider having separate folders for "starter" and "answer-key" versions.


# Ideas
Possible implementation of symbol table: keys & values (with hashmap)
Possible implementation of song: linked list

Kinds of data we could track: who sings which verse, which instruments play which notes.


# Things to decide: 
if {Am Bm} are in one bracket enclosure, is that one "chord" or two???

( c d e fh )


# Extra features: search for melody snippets in multiple songs!

# future topics: MVC!!




# New Learning: 
blueJ didn't at first run the ChordTest that intelliJ had made,
and didn't stick it to Chord class until I told blueJ to make its own ChordTest. 
BlueJ squawked about it existing already, and moved the intelliJ test into position.
IntelliJ doesn't import as much for its tests, and has to specify longer prefixes.