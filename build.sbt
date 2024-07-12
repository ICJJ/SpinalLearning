ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.11.12"

lazy val root = (project in file("."))
  .settings(
    name := "spinalLearning"
  )

val spinalVersion = "1.10.2a"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "3.2.14",
  "com.github.spinalhdl" % "spinalhdl-core_2.11" % spinalVersion,
  "com.github.spinalhdl" % "spinalhdl-lib_2.11"  % spinalVersion,
  "com.github.spinalhdl" % "spinalhdl-tester_2.11"  % spinalVersion,
   compilerPlugin("com.github.spinalhdl" % "spinalhdl-idsl-plugin_2.11" % spinalVersion)
)
resolvers += "SpinalHDL Repository" at "https://raw.githubusercontent.com/SpinalHDL/SpinalDoc-RTD/master/SbtRepo/"

fork := true

