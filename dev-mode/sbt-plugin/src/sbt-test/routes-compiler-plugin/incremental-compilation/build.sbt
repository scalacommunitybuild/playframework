//
// Copyright (C) Lightbend Inc. <https://www.lightbend.com>
//
lazy val root = (project in file("."))
  .enablePlugins(RoutesCompiler)
  .enablePlugins(MediatorWorkaroundPlugin)
  .settings(
    scalaVersion := sys.props.get("scala.version").getOrElse("2.12.9"),
    sources in (Compile, routes) := Seq(baseDirectory.value / "a.routes", baseDirectory.value / "b.routes"),
    // turn off cross paths so that expressions don't need to include the scala version
    crossPaths := false
  )
