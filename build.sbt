name := "sttp-test-reproducer"

version := "0.1"


val sttpVersion = "1.3.9"

lazy val scala211 = (project in file("scala211")).settings(
  scalaVersion := "2.11.12",
  libraryDependencies ++= Seq(
    "com.softwaremill.sttp" %% "core" % sttpVersion,
    "com.softwaremill.sttp" %% "okhttp-backend" % sttpVersion,
    "com.softwaremill.sttp" %% "core" % sttpVersion % Test classifier "tests",
    "com.typesafe.akka" %% "akka-http" % "10.1.5" % Test,
    "ch.megard" %% "akka-http-cors" % "0.3.0" % Test,
    "com.typesafe.akka" %% "akka-stream" % "2.5.16" % Test,
    "org.scalatest" %% "scalatest" % "3.0.5" % Test
  )
)

lazy val scala212 = (project in file("scala212")).settings(
  scalaVersion := "2.12.6",
  libraryDependencies ++= Seq(
    "com.softwaremill.sttp" %% "core" % sttpVersion,
    "com.softwaremill.sttp" %% "okhttp-backend" % sttpVersion,
    "com.softwaremill.sttp" %% "core" % sttpVersion % Test classifier "tests",
    "com.typesafe.akka" %% "akka-http" % "10.1.5" % Test,
    "ch.megard" %% "akka-http-cors" % "0.3.0" % Test,
    "com.typesafe.akka" %% "akka-stream" % "2.5.16" % Test,
    "org.scalatest" %% "scalatest" % "3.0.5" % Test
  )
)
