name := "stepik-scala"

version := "0.1"

scalaVersion := "2.13.5"

libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test

testOptions += Tests.Argument(TestFrameworks.JUnit, "-q", "-v", "-s")



