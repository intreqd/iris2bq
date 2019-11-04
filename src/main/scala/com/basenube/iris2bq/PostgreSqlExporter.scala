package com.basenube.iris2bq

import java.util.Properties

import com.basenube.iris2bq.config.JdbcConfiguration
import org.apache.spark.sql.{DataFrame, SparkSession}

class IRISJDBCExporter(spark: SparkSession, jdbc: JdbcConfiguration)
    extends DataExporter {

  val props = new Properties()
  props.put("user", jdbc.user)
  props.put("password", jdbc.password)
  props.put("driver", "com.intersystems.jdbc.IRISDriver")

  override def read(tableName: String): DataFrame = {
    spark.read.jdbc(jdbc.url, tableName, props)
  }
}
