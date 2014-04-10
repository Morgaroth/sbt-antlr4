import SonatypeKeys._

sonatypeSettings

profileName := "morgaroth"

sbtPlugin := true

name := "sbt-antlr4"

organization := "pl.morgaroth"

version := "1.4"

publishMavenStyle := true

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