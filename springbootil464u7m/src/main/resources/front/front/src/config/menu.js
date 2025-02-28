const menu = {
  list() {
    return [
      {
        backMenu: [
          {
            child: [
              {
                allButtons: ["新增", "查看", "修改", "删除"],
                appFrontIcon: "cuIcon-news",
                buttons: ["新增", "查看", "修改", "删除", "会员性别统计", "首页总数", "首页统计"],
                menu: "会员",
                menuJump: "列表",
                tableName: "huiyuan"
              }
            ],
            menu: "会员管理"
          },
          {
            child: [
              {
                allButtons: ["新增", "查看", "修改", "删除"],
                appFrontIcon: "cuIcon-circle",
                buttons: ["新增", "查看", "修改", "删除"],
                menu: "帖子分类",
                menuJump: "列表",
                tableName: "tiezifenlei"
              }
            ],
            menu: "帖子分类管理"
          },
          {
            child: [
              {
                allButtons: ["新增", "查看", "修改", "删除", "审核", "查看评论"],
                appFrontIcon: "cuIcon-cardboard",
                buttons: [
                  "查看",
                  "修改",
                  "删除",
                  "会员发帖统计",
                  "帖子分类统计",
                  "日发帖统计",
                  "查看评论",
                  "首页总数",
                  "首页统计",
                  "审核"
                ],
                menu: "优秀帖子",
                menuJump: "列表",
                tableName: "youxiutiezi"
              }
            ],
            menu: "优秀帖子管理"
          },
          {
            child: [
              {
                allButtons: ["新增", "查看", "修改", "删除"],
                appFrontIcon: "cuIcon-goodsnew",
                buttons: ["新增", "查看", "修改", "删除"],
                menu: "轮播图管理",
                tableName: "config"
              },
              {
                allButtons: ["查看", "修改"],
                appFrontIcon: "cuIcon-circle",
                buttons: ["查看", "修改"],
                menu: "系统简介",
                tableName: "systemintro"
              },
              {
                allButtons: ["查看", "修改"],
                appFrontIcon: "cuIcon-cardboard",
                buttons: ["查看", "修改"],
                menu: "系统公告",
                tableName: "systemnotice"
              }
            ],
            menu: "系统管理"
          }
        ],
        frontMenu: [
          {
            child: [
              {
                allButtons: ["新增", "查看", "修改", "删除", "审核", "查看评论"],
                appFrontIcon: "cuIcon-similar",
                buttons: ["查看", "查看评论"],
                menu: "优秀帖子列表",
                menuJump: "列表",
                tableName: "youxiutiezi"
              }
            ],
            menu: "优秀帖子模块"
          }
        ],
        hasBackLogin: "是",
        hasBackRegister: "否",
        hasFrontLogin: "否",
        hasFrontRegister: "否",
        roleName: "管理员",
        tableName: "users"
      },
      {
        backMenu: [
          {
            child: [
              {
                allButtons: ["新增", "查看", "修改", "删除", "审核", "查看评论"],
                appFrontIcon: "cuIcon-cardboard",
                buttons: ["新增", "查看", "修改", "删除", "查看评论"],
                menu: "优秀帖子",
                menuJump: "列表",
                tableName: "youxiutiezi"
              }
            ],
            menu: "优秀帖子管理"
          }
        ],
        frontMenu: [
          {
            child: [
              {
                allButtons: ["新增", "查看", "修改", "删除", "审核", "查看评论"],
                appFrontIcon: "cuIcon-similar",
                buttons: ["查看", "查看评论"],
                menu: "优秀帖子列表",
                menuJump: "列表",
                tableName: "youxiutiezi"
              }
            ],
            menu: "优秀帖子模块"
          }
        ],
        hasBackLogin: "否",
        hasBackRegister: "否",
        hasFrontLogin: "是",
        hasFrontRegister: "是",
        roleName: "会员",
        tableName: "huiyuan"
      }
    ];
  }
};
export default menu;
