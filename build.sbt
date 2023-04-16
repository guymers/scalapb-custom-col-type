
lazy val root = project.in(file("."))
  .settings(Seq(
    scalaVersion := "2.13.10",
    libraryDependencies ++= Seq(
      "com.thesamet.scalapb" %% "scalapb-runtime" % scalapb.compiler.Version.scalapbVersion,
      "com.thesamet.scalapb" %% "scalapb-runtime" % scalapb.compiler.Version.scalapbVersion % "protobuf",
      "com.google.api.grpc" % "proto-google-common-protos" % "2.14.3" % "protobuf",
    ),
    PB.protocVersion := "3.21.12",
    Compile / PB.targets := Seq(
      scalapb.gen(grpc = false, lenses = false) -> (Compile / sourceManaged).value,
    ),
    Compile / PB.protoSources += target.value / "protobuf_external" / "google",
    Compile / PB.includePaths -= target.value / "protobuf_external" / "google",
  ))
