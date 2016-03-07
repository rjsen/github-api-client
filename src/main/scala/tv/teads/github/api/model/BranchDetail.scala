package tv.teads.github.api.model

import io.circe.Decoder

trait BranchDetailCodec {
  self: GHCommitCodec with LinksCodec ⇒

  implicit lazy val branchDetailDecoder = Decoder.instance { cursor ⇒
    for {
      name ← cursor.downField("name").as[String]
      commit ← cursor.downField("commit").as[GHCommit]
    } yield BranchDetail(name, commit)
  }
}
case class BranchDetail(
  name:   String,
  commit: GHCommit
)
