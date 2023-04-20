addSbtPlugin("com.thesamet" % "sbt-protoc" % "1.0.6")
libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.11.13+35-2d0ab773-SNAPSHOT"
resolvers ++= Opts.resolver.sonatypeOssSnapshots
