/** Name of project */
name := "ScaloRS"

/** Project Version */
version := "1.0"

/** Scala version */
scalaVersion := "2.12.1"

/** Scalac parameters */
scalacOptions ++= Seq("-feature", "-unchecked", "-deprecation", "-encoding", "utf8")

/** Javac parameters */
javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

/** Resolver */
resolvers ++= Seq(
  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
  "Search Maven" at "https://repo1.maven.org/maven2/"
)

/** Source Dependencies */
libraryDependencies ++= Seq(
  "com.googlecode.json-simple" % "json-simple" % "1.1.1"
)

/** Make sure to fork on run */
fork in run := true

/** Copy dependencies to file */
retrieveManaged := true