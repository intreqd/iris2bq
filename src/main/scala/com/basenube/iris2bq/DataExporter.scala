package com.basenube.iris2bq
import org.apache.spark.sql.DataFrame

trait DataExporter {
  def read(tableName: String): DataFrame
}
