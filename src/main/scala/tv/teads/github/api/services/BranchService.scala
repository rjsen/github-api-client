package tv.teads.github.api.services

import scala.concurrent.{ExecutionContext, Future}

import tv.teads.github.api.GithubApiClientConfig
import tv.teads.github.api.model._

class BranchService(config: GithubApiClientConfig) extends GithubService(config) with GithubApiCodecs {

  def fetchBranchDetail(repository: String, branch: String)(implicit ec: ExecutionContext): Future[Option[BranchDetail]] =
    fetchOptional[BranchDetail](
      s"repos/${config.owner}/$repository/branches/$branch",
      s"Fetching branch $branch for repository $repository failed"
    )

}
