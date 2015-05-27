package tv.teads.github.api.models.hooks

import tv.teads.github.api.models.common.ADTEnum

object Events {

  sealed trait Event
  // https://developer.github.com/webhooks/#events

  object Event extends ADTEnum[Event] {
    case object commit_comment              extends Event
    case object create                      extends Event
    case object delete                      extends Event
    case object deployment                  extends Event
    case object deployment_status           extends Event
    case object fork                        extends Event
    case object gollum                      extends Event
    case object issue_comment               extends Event
    case object issues                      extends Event
    case object member                      extends Event
    case object membership                  extends Event
    case object public                      extends Event
    case object pull_request_review_comment extends Event
    case object pull_request                extends Event
    case object push                        extends Event
    case object repository                  extends Event
    case object release                     extends Event
    case object status                      extends Event
    case object team_add                    extends Event
    case object watch                       extends Event
    val list = Seq(
      commit_comment              ,
      create                      ,
      delete                      ,
      deployment                  ,
      deployment_status           ,
      fork                        ,
      gollum                      ,
      issue_comment               ,
      issues                      ,
      member                      ,
      membership                  ,
      public                      ,
      pull_request_review_comment ,
      pull_request                ,
      push                        ,
      repository                  ,
      release                     ,
      status                      ,
      team_add                    ,
      watch
    )
  }
}
