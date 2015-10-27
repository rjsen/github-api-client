package tv.teads.github.api.model

import tv.teads.github.api.json.ZonedDateTimeCodec

trait GithubApiCodecs
  extends RepositoryCodec
  with UserCodec
  with TagCodec
  with TagCommitCodec
  with HeadCodec
  with TreeCodec
  with RepositoryUrlsCodec
  with BooleanPermissionCodec
  with RepositoryConfigCodec
  with RepositoryStatsCodec
  with ParentCodec
  with CommitDetailCodec
  with GHCommitCodec
  with AuthorCodec
  with TeamCodec
  with LabelCodec
  with CommentCodec
  with IssueCodec
  with CommitCommentCodec
  with CommitCodec
  with PullRequestUrlsCodec
  with LinksCodec
  with TimeMetadataCodec
  with ChangeMetadataCodec
  with PullRequestCodec
  with ReleaseCodec
  with BranchCodec
  with RateLimitCodec
  with PullRequestReviewCommentLinksCodec
  with PullRequestCommentCodec
  with FileCodec
  with StatusCodec
  with CombinedStatusCodec
  with StatusResponseCodec
  with OrganizationCodec
  with MemberCodec
  with OrganizationMembershipCodec
  with HookConfigCodec
  with HookCodec
  with ZonedDateTimeCodec

object GithubApiCodecs extends GithubApiCodecs
