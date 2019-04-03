
// without this it fails on 2.12 with uncomment to fix that and it fails with unused on 2.13.0-M5
// import scala.language.existentials

trait OtherType[T]
case class Existensialism(field: OtherType[_])
