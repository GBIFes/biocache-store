package au.org.ala.biocache.persistence

import com.datastax.driver.core.Row

/**
  * A cassandra specific implementation of a data row.
  *
  * @param row
  */
class CassandraRow(row:Row) extends DataRow {

  def cols = row.getColumnDefinitions

  def getIndexOf(str:String) : Int = cols.getIndexOf(str)

  def getString(idx:Int) = row.getString(idx)

  def getName(idx:Int) = cols.getName(idx)

  def getNumberOfFields() = cols.size()
}
