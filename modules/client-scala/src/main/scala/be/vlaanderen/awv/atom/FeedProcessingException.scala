package be.vlaanderen.awv.atom

case class FeedProcessingException(feedPositionOpt:Option[FeedPosition], message:String) extends RuntimeException {

  /**
   * Returns the {{{FeedPosition}}} or null if none is available.
   * (For easy access from Java API)
   */
  def feedPosition = feedPositionOpt.orNull
}