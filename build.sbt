/** Name of project */
name := "ScaloRS"

/** Organization */
organization := "initialcommit.io"

/** Project Version */
version := "1.0"

/** Do not download deps every time */
updateOptions := updateOptions.value.withCachedResolution(true)

/** Scala version */
//scalaVersion := "2.12.1"

/** Scalac parameters */
//scalacOptions ++= Seq("-feature", "-unchecked", "-deprecation", "-encoding", "utf8")

/** Javac parameters */
javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

/** Resolver */
resolvers ++= Seq(
  "Search Maven" at "https://repo1.maven.org/maven2/"
)

/** Source Dependencies */
libraryDependencies ++= Seq(
  "com.googlecode.json-simple" % "json-simple" % "1.1.1",
  "org.pircbotx" % "pircbotx" % "2.0.1",
  "com.miglayout" % "miglayout" % "3.7.4",
  "org.pushingpixels" % "flamengo" % "5.0",
  "org.apache.commons" % "commons-io" % "1.3.2"
)

/** Make sure to fork on run */
fork in run := true

/** Copy dependencies to file */
retrieveManaged := true