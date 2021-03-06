/*
 * Copyright (C) Lightbend Inc. <https://www.lightbend.com>
 */

package play.mvc

import play.core.j.PlayMagicForJava._

object ImplicitLangInclude {
  def apply()(implicit lang: play.api.i18n.Lang): String = {
    lang.code
  }
}
