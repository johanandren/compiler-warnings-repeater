// The simplest possible sbt build file is just one line:

scalacOptions ++= {
  (scalaVersion.value) match {
    case "2.11.12" =>
      Seq(
        "-Yrangepos",
        "-Ywarn-nullary-unit",
        "-Ywarn-inaccessible",
        "-Ypartial-unification",
        "-Ywarn-infer-any",
        "-Ywarn-nullary-override",
        "-Xlint",
        "-Xfuture",
        "-deprecation",
        "-Ywarn-dead-code",
        "-Xfatal-warnings",
        "-feature",
        "-unchecked",
        "-Xlog-reflective-calls",
        "-target:jvm-1.8")


    case "2.12.8" =>
      Seq("-Yrangepos",
        "-Ywarn-nullary-unit",
        "-Ywarn-inaccessible",
        "-Ywarn-extra-implicit",
        "-Ypartial-unification",
        "-Ywarn-infer-any",
        "-Ywarn-nullary-override",
        "-Ywarn-unused:_",
        "-Xlint",
        "-Xfuture",
        "-deprecation",
        "-Ywarn-dead-code",
        "-Xfatal-warnings",
        "-feature",
        "-unchecked",
        "-Xlog-reflective-calls",
        "-release",
        "8")

    case "2.13.0-M5" =>
      Seq(
        "-Yrangepos",
        "-Ywarn-extra-implicit",
        "-Ywarn-unused:_",
        "-Xlint",
        "-Xfuture",
        "-deprecation",
        "-Ywarn-dead-code",
        "-Xfatal-warnings",
        "-feature",
        "-unchecked",
        "-Xlog-reflective-calls",
        "-release",
        "8"
      )
  }
}
scalaVersion := "2.12.8"
crossScalaVersions := Seq("2.11.12", "2.12.8", "2.13.0-M5")
organization := "com.example"
version := "1.0"