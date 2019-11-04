package com.basenube.iris2bq.config

case class ApplicationConfig(
    jdbc: JdbcConfiguration,
    gcloud: GCloudConfiguration
)
