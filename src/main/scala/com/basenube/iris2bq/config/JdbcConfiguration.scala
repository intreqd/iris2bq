package com.basenube.iris2bq.config

case class JdbcConfiguration(
    url: String,
    user: String,
    password: String,
    tables: List[String]
)
