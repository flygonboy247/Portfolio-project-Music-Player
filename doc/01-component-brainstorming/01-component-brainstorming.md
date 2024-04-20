# Portfolio Part 1: Component Brainstorming

- **Name**: jian wang<!-- TODO: fill with first and last name (e.g., Brutus Buckeye) and delete this comment -->
- **Dot Number**:wang.17034 <!-- TODO: fill with OSU dot number (e.g., buckeye.17) and delete this comment -->
- **Due Date**:2/16 <!-- TODO: fill out with due date and time (e.g., 10/17 @ 3:10 PM EST) and delete this comment -->

## Assignment Overview

The overall goal of the portfolio project is to have you design and implement
your own OSU component. There are no limits to what you choose to design and
implement, but your component must fit within the constraints of our software
sequence discipline. In other words, the component must extend from Standard and
must include both a kernel and a secondary interface.

Because this is a daunting project, we will be providing you with a series of
activities to aid in your design decisions. For example, the point of this
assignment is to help you brainstorm a few possible components and get some
feedback. For each of these components, you will need to specify the high-level
design in terms of the software sequence discipline. In other words, you will
describe a component, select a few kernel methods for your component, and select
a few secondary methods to layer on top of your kernel methods.

You are not required to specify contracts at this time. However, you are welcome
to be as detailed as you'd like. More detail means you will be able to get more
detailed feedback, which may help you decide which component to ultimately
implement.

## Assignment Checklist

Because these documents are long and full of text, you will be supplied with
a quick overview of what you need to do to get the assignment done as follows:

### Getting Started Tasks

- [ y] I have added my name to the top of this document
- [y ] I have added my dot number to the top of this document
- [ y] I have added the due date to the top of this document
- [ y] I have read the assignment overview in the "Assignment Overview" section
- [ y] I have read the assignment learning objectives in the "Assignment Learning Objectives" section
- [ y] I have read the assignment rubric in the "Assignment Rubric" section
- [ ] I have read this checklist

### Ongoing Tasks

- [y] I have shared my interests in the "Pre-Assignment" section
- [ y] I have drafted my first component idea in the "Component Designs" section
- [ y] I have drafted my second component idea in the "Component Designs" section
- [ y] I have dradted my third component idea in the "Component Designs" section

### Submission Tasks

- [y] I have shared assignment feedback in the "Assignment Feedback" section
- [y] I have converted this document to a PDF
- [y] I am prepared to submit the PDF on Carmen
- [ ] I am prepared to give my peers feedback on their ideas

## Assignment Learning Objectives

Without learning objectives, there really is no clear reason why a particular
assessment or activity exists. Therefore, to be completely transparent, here is
what we're hoping you will learn through this particular aspect of the portfolio
project. Specifically, students should be able to:

1. Integrate their areas of interest in their personal lives and/or careers with
   their knowledge of software design
2. Determine the achievablility of a software design given time constraints
3. Design high-level software components following the software sequence
   discipline

## Assignment Rubric: 10 Points

Again, to be completely transparent, most of the portfolio project, except the
final submission, is designed as a formative assessment. Formative assessments
are meant to provide ongoing feedback in the learning process. Therefore,
the rubric is designed to assess the learning objectives *directly* in a way
that is low stakes—meaning you shouldn't have to worry about the grade. Just
do good work.

1. (3 points) Each design must align with your personal values and long-term
   goals. Because the goal of this project is to help your build out a
   portfolio, you really ought to care about what you're designing. We'll give
   you a chance to share your personal values, interests, and long-term goals
   below.
2. (3 points) Each design must be achievable over the course of a single
   semester. Don't be afraid to design something very small. There is no shame
   in keeping it simple.
3. (4 points) Each design must fit within the software sequence discipline. In
   other words, your design should expect to inherit from Standard, and it
   should contain both kernel and secondary methods. Also, null and aliasing
   must be avoided, when possible. The methods themselves must also be in
   justifiable locations, such as kernel or secondary.

## Pre-Assignment

> Before you jump in, we want you to take a moment to share your interests
> below. Use this space to talk about your career goals as well as your personal
> hobbies. These will help you clarify your values before you start
> brainstorming. Plus it helps us get to know you better! Feel free to share
> images in this section.

I want to either go into game design, AI, or a general software mangager(managing servers and stuff)
I probably want to create some components that may be useful for for a game engine
I may also want to create some componets for someething to do with sorting information aalgorithms(something serious or something dumb like bogosort)

## Assignment

As previously stated, you are tasked with brainstorming 3 possible components.
To aid you in this process, we have provided some example components that may
help you in your brainstorming. These components are organized by CSE
specializations.

- Artificial Intelligence
  - Artificial Neuron
  - Activation Function
  - Graphs
  - Search
- Computer Graphics and Game Design
  - Pixel
  - Polygon
  - Geometry
  - Pathing
- Database Systems and Data Analytics
  - Object Relational Mapping (ORM)
  - Any Data Model
  - Scraping
  - Data Mining
- Information and Computation Assurance
  - Password Hashing
- Computer Networking
  - Packet
  - MAC Address
  - IP Address
- Computer Systems
  - Complex Logic Gate
  - Semiconductor
- Software Engineering
  - Unit Testing
  - Performance Testing
- Individualized Option (e.g., X + CS)
  - Mathematical Matrix
  - Music Playlist

There is no requirement that you make use of any of the subdisciplines above.
If you want to model something from the real-world, go for it! Very common early
object projects usually attempt to model real-world systems like banks, cars,
etc. Make of this whatever seems interesting to you, and keep in mind that
you're just brainstorming right now. You do not have to commit to anything.

### Example Component

With all that in mind, here's an example component you can use for reference.
Feel free to use this example as the groundwork for your own components below.

- Example Component: `Point3D`
  - **Description**: The purpose of this component is to model a 3-dimensional point.
    Our intent with this design was to keep a simple kernel that provides getters and
    setters for the three underyling coordinates. Then, we provide more complex
    mathematical operations in the secondary interface. It might be possible to
    create an immutable version of the class by removing the setters and instead
    having all secondary methods return new points. However, this design seems more
    inline with NaturalNumber.
  - **Kernel Methods**:
    - `double getX()`: gets the x-coordinate of `this`
    - `double getY()`: gets the y-coordinate of `this`
    - `double getZ()`: gets the z-coordinate of `this`
    - `double setX(double x)`: sets the x-coordinate of `this`
    - `double setY(double y)`: sets the y-coordinate of `this`
    - `double setZ(double z)`: sets the z-coordinate of `this`
  - **Secondary Methods**:
    - `void translate(double x, double y, double z)`: moves `this` by translating
      each coordinate by `x`, `y`, and `z`, respectively
    - `void translate(Point3D p)`: moves `this` by treating `p` as a vector
    - `void move(double x, double y, double z)`: moves `this` by overwriting each
      coordinate with `x`, `y`, and `z`, respectively
    - `void move(Point3D p)`: moves `this` to `p`
    - `double distance(Point3D p)`: gives the distance between `this` and `p`
    - `Point3D vectorTo(Point3D p)`: gives the vector from `this` to `p`
    - `boolean isOrigin()`: returns `true` if all three coordinates are zero

Keep in mind that the general idea when putting together these layered designs
is to put the minimal implementation in the kernel. In this case, the kernel is
only responsible for giving back the coordinates of the point. The secondary
methods use these getters and setters to perform more complex operations like
translating the point or computing the distance between two points.

Also, keep in mind that we don't know the underlying implementation. It would be
completely reasonable to create a `Point3D1L` class which layers the kernel on
top of the existing `Point` class in Java. It would also be reasonable to
implement `Point3D2` on top of three doubles and `Point3D3` on top of an array.
Do not worry about your implementations at this time.

On top of everything above, there is no expectation that you have a perfect
design. Part of the goal of this project is to have you actually use your
component once it's implemented to do something interesting. At which point, you
will likely refine your design to make your implementation easier to use.

### Component Designs

> Please use this section to share your designs.

- Component Design #1: `Pathing`
  - **Description**: The purpose of this component is to create a path for ceratin NPC's to move through and avoid colisions.
    We will have a simple kernel that provides get's and set's for the characters and destonations coordinates. Then, we create a more complex checking mechonism in the secondary interface that can not only create a next step path but also makes sure that it doesn't colide with any objects. The program will only return next step instructions(ex go right/left/up/down) and if a series of steps are needed then its best to claculate a route 1 step at a time and save it to an array. This pathing will be in 2d as 3d will make it too complicated to finish in a timly manner(by the end of the semester)
  - **Kernel Methods**:
    - `int getX()`: gets the x-coordinate of `this`
    - `int getY()`: gets the y-coordinate of `this`
    - `int setX(int x)`: sets the x-coordinate of `this`
    - `int setY(int y)`: sets the y-coordinate of `this`
  - **Secondary Methods**:
    - `Boolean rightAvalible(int x, int y)`: uses loction to check if right space is blocked
    - `Boolean leftAvalible(int x, int y)`: uses loction to check if left space is blocked
    - `Boolean upAvalible(int x, int y)`: uses loction to check if up space is blocked
    - `Boolean downAvalible(int x, int y)`: uses loction to check if down space is blocked

    - `void initalDirecton(int x, int y, int x2, int y2)`: uses starting x and y and target x2 and y2 to figure out what direction to go by checking which x or y is farther apart, then checks if that directoin is avalible(using direction recursivly and checking deadend until start to end is mapped out then put all directions into a array of values) if not for closest x and y directions then check out the next 2 directions
    - `void directon(int x, int y, int x2, int y2)`: uses starting x and y and target x2 and y2 to figure out what direction to go by checking which x or y is farther apart, then checks if that directoin is avalible(using directoin recursivly and checking deadend) if not for closest x and y directions then check out the last direction without going backwards
    - `Boolean Deadend(int x, int y, int x2, int y2)`: uses next direction and checks for new direction, if new direction is blocked on all sides then return true making the initial direction calling deadend think that the direction is impeaded

- Component Design #2:`Music Playlist`
  - **Description**: The purpose of this component is to use all song names, author, album, and songs that are held in a playlist. then it can also shuffle the playlist.
  We will have a simple kernel that gets all the song data that it needs from an already set playlist and gives the info for the song back
  - **Kernel Methods**:
  - `int setSong(String name, String author, String album)`:adds info into Song
  - `removeSong(int songNum)`: removes the Song node at songNum
    Something=songnum or song name or song author or song album
  - `int getSongNum(something)`:gets the song number of this from
  - `String getSong(something)`:turns specific song into `this`
  - `String getSongName(something)`:gets the name of `this`
  - `String getSongAuthor(something)`:gets the author of `this`
  - `String getSongAlbum(something)`:gets the Album that the song of `this`came from
  - `String getSongdata(int songNum)`:gets the Song(the music) of `this`
  - **Secondary Methods**:
  - `void shuffle(int playlistLength)`:creates and array and shuffles 1 to playlistLength numbers to get a random shuffled playlist to play without repeating numbers



<!-- TODO: brainstorm a component and delete this comment -->
- Component Design #3: DataMining
  - **Description**: Given a bunch of reviews over a thing read each review and check for posotive/negative conotavtive words and add up total to find out if review is good or bad and if so how good/bad and find a combined average score
  - **Kernel Methods**:
    - `T getReveiw(int x)`: gets the x review of `this`
    - `String getText(T x)`: gets the text from the reveiw
    - `int getValue(String x, Map value)`: uses the map of keywords and their +/- conotation values and returns vakue of that keyword
  - **Secondary Methods**:
    - `void sort(String text)`:goes through the text and like glossory sorts out each word and # times appeared
    - `void keyWords(Map x, Map value)`: goes through map and if map x word is not conatined in map value delete key and value
    - `int value(Map x)`: goes through x and gets the value of each word multiplied by times word was used for final review value
    - `int totalvalue()`:uses value on all reviews of `this` and adds up total
## Post-Assignment

The following sections detail everything that you should do once you've
completed the assignment.

### Submission

If you have completed the assignment using this template, we recommend that
you convert it to a PDF before submission. If you're not sure how, check out
this [Markdown to PDF guide][markdown-to-pdf-guide]. However, PDFs should be
created for you automatically every time you save, so just double check that
all your work is there before submitting.

### Assignment Feedback

> Now that you've had a chance to complete the assignment, is there anything you
> would like to say about the assignment? For example, are there any resources
> that could help you complete this assignment? Feel free to use the feedback
> rubric above when reviewing this assignment.

<!-- TODO: share your feedback here -->
I liked the way it was formatted but a simple totorial on how it could be done like on a google sheet with pictures and arrows could have made figuring it out at first a lot easier
Also could you add what not to do in the example comonents area as well? I was also wonding if I could use certain stuff from map and queue and was wondering how to use it
otherwise I liked this assignment
[markdown-to-pdf-guide]: https://therenegadecoder.com/blog/how-to-convert-markdown-to-a-pdf-3-quick-solutions/
### What I changed post submission!!!!!!!!!!!!!!!!!!!!!!!!!!
removed the play and play suffed methods as they use a index not connected with
kernal and could probably be better implamented as code rather than a
componet
changed to a queue/stack like componet rather than map based
Didnt fix the other 2 componets as they are not what I'm going to create and
probably too difficult for me to do anyways