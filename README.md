ScaloRS
============================

This is a new project dedicated to creating a Free and Open Source OSRS reflection client.<br>

Building
============================
osrsclient can be easily built using the Apache Ant build script included in the repository.

    git clone http://github.com/bmoyer/osrsclient
    ant -f osrsclient -Dnb.internal.action.name=rebuild clean jar 


Running
============================
Make sure you have JRE 1.7+ installed, and the java executable in your path variables.
 java -jar osrsclient/dist/RSClient.jar


Contributing
============================
If you would like to contribute to osrsclient, fork this repository and work on your changes in your fork.  Make a pull request against this repository once you've made your changes.


Current Features
============================

-OSRS Hiscore lookup, showing progress to next level and experience totals<br>
-OSRS (Zybez) Market lookup, filter offers by type<br>
-Notepad for storing info, pasting quest guides, etc<br>

Future Features
============================

-IRC Chat client, supporting multiple IRC servers at once<br>
-Full reflection integration (XP trackers, potion timers, etc)<br>
![osrsclient](https://raw.githubusercontent.com/bmoyer/osrsclient/master/src/resources/client.png "Client")

Changes in this fork
============================
I have made a couple of changes in fork in order to modernize the program and hopefully getting it building correctly, which it was not doing before.
The changes are as follows:
- Use sbt build
- ... that's about it

Eventually the plan is to convert this to a scala project =D. Let's see if I get that far.