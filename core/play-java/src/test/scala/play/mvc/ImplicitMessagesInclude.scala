/*
 * Copyright (C) Lightbend Inc. <https://www.lightbend.com>
 */

package play.mvc

import play.core.j.PlayMagicForJava._

object ImplicitMessagesInclude {
  def apply()(implicit messages: play.api.i18n.MessagesProvider): String = {
    messages.messages.apply("bye")
  }
}
