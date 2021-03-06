name := """test"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava,PlayEbean)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  evolutions,
  javaJdbc,
  cache,
  javaWs,
   "mysql" % "mysql-connector-java" % "5.1.20"
)
// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator


fork in run := true