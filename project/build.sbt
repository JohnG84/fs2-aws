// Required for the freegen definition for postgres in ../build.sbt
val AwsSdk = "2.15.82"
libraryDependencies += "software.amazon.awssdk" % "sqs" % AwsSdk
libraryDependencies += "software.amazon.awssdk" % "s3"  % AwsSdk
libraryDependencies += "software.amazon.awssdk" % "sns" % AwsSdk
