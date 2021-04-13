// The simplest possible sbt build file is just one line:

scalaVersion := "2.13.3"
// That is, to create a valid sbt build, all you've got to do is define the
// version of Scala you'd like your project to use.

// ============================================================================

// Lines like the above defining `scalaVersion` are called "settings". Settings
// are key/value pairs. In the case of `scalaVersion`, the key is "scalaVersion"
// and the value is "2.13.3"

// It's possible to define many kinds of settings, such as:

name := "hello-world"
organization := "ch.epfl.scala"
version := "1.0"

// Note, it's not required for you to define these three settings. These are
// mostly only necessary if you intend to publish your library's binaries on a
// place like Sonatype or Bintray.


// Want to use a published library in your project?
// You can define other libraries as dependencies in your build like this:

libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"
// libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.7"
// libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.7" % "test"

// You can use Scaladex, an index of all known published Scala libraries.
// https://index.scala-lang.org/scala/scala-parser-combinators
// You can copy/paste dependencies from here.

// Turn on compilation debugging for scalatest scripts
// resolvers += "Artima Maven Repository" at "https://repo.artima.com/releases"
// addSbtPlugin("com.artima.supersafe" % "sbtplugin" % "1.1.12")

// Turn off sbt log buffering in test to use scalatest's custom buffering
// logBuffered in Test := false


// Here's a quick glimpse of what a multi-project build looks like for this
// build, with only one "subproject" defined, called `root`:

// lazy val root = (project in file(".")).
//   settings(
//     inThisBuild(List(
//       organization := "ch.epfl.scala",
//       scalaVersion := "2.13.3"
//     )),
//     name := "hello-world"
//   )

// To learn more about multi-project builds, head over to the official sbt
// documentation at http://www.scala-sbt.org/documentation.html
