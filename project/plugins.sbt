addSbtPlugin("org.foundweekends.giter8" %% "sbt-giter8" % "0.14.0")
addSbtPlugin("com.github.sbt" % "sbt-github-actions" % "0.23.0")
libraryDependencies += { "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value }
