package com.greencatsoft.angularjs

import scala.scalajs.js
import scala.scalajs.js.{ GlobalScope, UndefOr }

package object internal extends GlobalScope {

  private[angularjs] val angular: Angular = js.native

  type Configuration = js.Dictionary[js.Any]
}
