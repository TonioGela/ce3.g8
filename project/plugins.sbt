addSbtPlugin("org.foundweekends.giter8" %% "sbt-giter8" % "0.16.2")
addSbtPlugin("com.codecommit" % "sbt-github-actions" % "0.14.2")
libraryDependencies += { "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value }
