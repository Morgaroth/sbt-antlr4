import SonatypeKeys._

sonatypeSettings

profileName := "morgaroth"

sbtPlugin := true

name := "sbt-antlr4"

organization := "com.morgaroth"

version := "0.1.2"

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }




pomExtra := <url>https://github.com/Morgaroth/sbt-antlr4</url>
  <licenses>
    <license>
      <name>BSD-style</name>
      <url>http://www.opensource.org/licenses/bsd-license.php</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:Morgaroth/sbt-antlr4.git</url>
    <connection>scm:git:git@github.com:Morgaroth/sbt-antlr4.git</connection>
  </scm>
  <developers>
    <developer>
      <id>morgaroth</id>
      <name>Mateusz Jaje</name>
    </developer>
  </developers>