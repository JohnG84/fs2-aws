package fs2
package aws

object KinesisStub {
  var _data: List[List[Byte]] = List()

  def clear() = _data = List()

  def save(data: List[Byte]) = {
    _data = _data :+ data
  }
}