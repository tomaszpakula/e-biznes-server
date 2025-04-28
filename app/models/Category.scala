package models
import play.api.libs.json._
case class Category(id: Int, name: String)

object Category {
  implicit val CartItemFormat: OFormat[Category] = Json.format[Category]
}
