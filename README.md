# Repackman

This is just another clone of
[Pac-Man](http://en.wikipedia.org/wiki/Pac-Man) game written in Java
programming language using [LWJGL](http://www.lwjgl.org/). We don't
expect it to be something great. We do it just for practice.

# Usage

To run the game you need
[JDK 7](http://www.oracle.com/technetwork/java/javase/downloads/index.html),
[Apache Maven](http://maven.apache.org/).

1. cd to the project directory.
2. $ mvn nativedependencies:copy
3. $ mvn compiler:compile
4. $ mvn exec:exec

To read documentation:

1. $ mvn site:site
2. open file target/site/index.html with your favorite browser.

or

1. $ mvn site:run
2. go to [http://localhost:8080/](http://localhost:8080/)

# Authors

## Programming

* [rexim](http://github.com/rexim) (Alexey Kutepov)
* [kolipass](http://github.com/kolipass) (Kochkin Artem)
