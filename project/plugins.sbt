// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.7.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-twirl" % "1.3.15")

addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.2")

scalacOptions ++= Seq("-deprecation", "-unchecked", "-language:_")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.4")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.1")
