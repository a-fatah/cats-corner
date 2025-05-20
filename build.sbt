ThisBuild / scalaVersion := "2.13.10"

libraryDependencies += "org.typelevel" %% "cats-core" % "2.9.0"

Compile / run / mainClass := Some("catscorner.HelloCats")

