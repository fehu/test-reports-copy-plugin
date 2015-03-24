sbtPlugin := true

organization := "feh.util"

name := "test-reports-copy-plugin"

version := "0.2-SNAPSHOT"

crossScalaVersions := Seq("2.11.5", "2.11.4", "2.10.4", "2.9.3", "2.9.2")

addSbtPlugin("com.typesafe.sbt" % "sbt-license-report" % "1.0.0")