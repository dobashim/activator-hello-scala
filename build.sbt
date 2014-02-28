name := "hello-spark"

version := "1.0"

scalaVersion := "2.10.2"

resolvers ++= Seq("cloudera" at "https://repository.cloudera.com/artifactory/cloudera-repos/")

libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "2.0.M5b" % "test",
                            "org.apache.spark" % "spark-core_2.10" % "0.9.0-incubating",
                            "org.apache.hadoop" % "hadoop-client" % "2.2.0-cdh5.0.0-beta-1")
