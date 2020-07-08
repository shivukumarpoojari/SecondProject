name := "HellloSpark"

organization := "shivu.learningjournal"

version := "0.1"

scalaVersion := "2.12.10"

val sparkVersion="3.0.0-preview2"
autoScalaLibrary:=false

val sparkDependencies= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion
)

val testDependencies=Seq(
  "org.scalatest" %% "scalatest" % "3.0.8" % Test
)
//resolvers +="https://mvnrepository.com/"
libraryDependencies ++=sparkDependencies ++ testDependencies