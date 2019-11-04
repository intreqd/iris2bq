package com.basenube.iris2bq

import org.apache.spark.sql.DataFrame

trait DataImporter {
  def createOrOverride(df: DataFrame, tableName: String): Unit
}
