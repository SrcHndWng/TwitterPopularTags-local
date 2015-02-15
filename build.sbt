lazy val root = (project in file(".")).
  settings(
    name := "TwitterPopularTags",
    version := "1.0",
    scalaVersion := "2.10.4"
  )

libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-core" % "1.2.0",
    "org.apache.spark" % "spark-streaming_2.10" % "1.2.0",
    "org.apache.spark" % "spark-streaming-twitter_2.10" % "1.2.0"
)