# OlympicGamesSystem
# Java EE 项目设计：《 XX学院 奥林匹克比赛系统》
一个使用SSM框架开发的的Java EE项目。
*——出题人： MagiDragon*

### 项目设计的目的：

1. 熟练掌握配置、使用 Java EE 集成开发环境。
2. 熟练掌握 SSM 框架开发 Java EE 项目的开发技术。
3. 完成一个 Java EE 项目的设计、编码、调试。要求至少使用 Spring + Spring MVC + MyBatis 进行开发。
4. 若使用其他 Java EE 的框架，例如 Spring Boot， Spring Data， Hibernate 等，可以获得更高分数。
5. 若项目进行了前后端分离（使用前端框架如 Vue.js、 微信小程序等）可以获得更高分数。

### 基本功能要求（系统角色与权限控制）：

四级系统角色：系统管理员、裁判员、比赛选手、观众。

（不同系统角色的权限控制：系统管理员可以发布比赛日程，管理全部成员及其权限；裁判员可以查看比赛日程、记录成绩；比赛选手可以查看比赛日程、查看成绩；观众可以查看比赛日程、查看成绩；）

### 扩展要求：

1. 系统管理员可以发出暂停、维持比赛日程的操作。
2. 裁判员可以对选手赛事中特殊行为作出评价。
3. 比赛选手可以对评价提出申诉。
4. 观众可以发表赛事评论（相应扩展系统管理员的控制权限）。


## 数据库设计

### 数据库概念设计：

1. 系统管理员：包括账户"admin"及其密码。系统管理员账号与密码由数据库管理员提前预设，无需注册。
2. 裁判员：包括用户ID、密码以及联系方式。
3. 选手：包括用户ID、密码、院系专业、联系方式。
4. 观众：包括用户ID、密码、院系专业、联系方式。

（注册用户的联系方式不能相同，用户ID唯一。选手与观众角色设定可以有公共交集。以limit值作权限区分。）

5. 比赛：包括比赛ID、比赛名称、比赛时间，也包括是否为决赛类型。
6. 比赛结果：包括比赛ID、比赛名称、比赛时间、冠亚季军得主ID。
7. 个人结果：包括比赛ID、选手ID、成绩以及裁判的补充评价。
8. 观众评价：包括观众ID、比赛ID以及评论内容。

### 数据库逻辑设计：

1. 基础信息表 informations

|   字段   |   含义   |     类型     | 长度 |               补充描述                |
| :------: | :------: | :----------: | :--: | :-----------------------------------: |
|    id    |  用户id  |     int      |  50  | PRIMARY KEY, NOT NULL, AUTO_INCREMENT |
|   name   |  用户名  |   varchar    |  50  |          NOT NULL, DISTINCT           |
| password |   密码   |   varchar    |  50  |               NOT NULL                |
|  email   | 联系邮箱 |   varchar    |  50  |               DISTINCT                |
|  phone   | 联系电话 |   varchar    |  50  |               DISTINCT                |
|  major   | 院系专业 | varchar/enum |  50  |               NOT NULL                |
|  limit   | 权限等级 |     int      |  11  |         NOT NULL, FOREIGN KEY         |

2. 特殊人员权限对照表 limit

   | limit 字段值 |  字段含义  |
   | :----------: | :--------: |
   |      0       | 系统管理员 |
   |      1       |   裁判员   |
   |      2       |    选手    |
   |      3       |    观众    |

3. 比赛日程表 gamedays

|   字段   |   含义   |   类型   | 长度 |       补充描述        |
| :------: | :------: | :------: | :--: | :-------------------: |
|  gameID  | 比赛编号 |   int    |  11  | PRIMARY KEY, NOT NULL |
| gameTime | 比赛时间 | datetime |      |                       |
|  player  |  选手id  |   int    |  50  |       NOT NULL        |

4. 比赛编号表 gameInfo

   |   字段   |    含义    |   类型   | 长度 |       补充描述        |
   | :------: | :--------: | :------: | :--: | :-------------------: |
   |  gameID  |  比赛编号  |   int    |  11  | PRIMARY KEY, NOT NULL |
   | gameName |  比赛名称  | varchar  |  50  |       NOT NULL        |
   | gameTime |  比赛时间  | datetime |      |                       |
   | isFinal  | 是否为决赛 |   int    |  11  | NOT NULL; 0_NO,1_YES  |

   

5. 比赛结果表 gameResults

|   字段   |    含义    |   类型   | 长度 |       补充描述        |
| :------: | :--------: | :------: | :--: | :-------------------: |
|  gameID  |  比赛编号  |   int    |  11  | PRIMARY KEY, NOT NULL |
| gameName |  比赛名称  | varchar  |  50  |       NOT NULL        |
| gameTime |  比赛时间  | datetime |      |                       |
|   gold   | 冠军选手id |   int    |  50  |       NOT NULL        |
|  silver  | 亚军选手id |   int    |  50  |       NOT NULL        |
|  copper  | 季军选手id |   int    |  50  |       NOT NULL        |

6. 裁判判决表 judgeResult

   |     字段      |   含义   |  类型   | 长度 |       补充描述        |
   | :-----------: | :------: | :-----: | :--: | :-------------------: |
   |    gameID     | 比赛编号 |   int   |  11  | PRIMARY KEY, NOT NULL |
   |   playerID    |  选手id  |   int   |  50  |       NOT NULL        |
   |    result     | 选手成绩 | varchar |  50  |       NOT NULL        |
   |   judge_id    |  裁判id  |   int   |  50  |       NOT NULL        |
   | judge_comment | 补充评价 | varchar | 500  |                       |

7. 选手反馈表 playerFeedback

|      字段       |   含义   |  类型   | 长度 |       补充描述        |
| :-------------: | :------: | :-----: | :--: | :-------------------: |
|     gameID      | 比赛编号 |   int   |  11  | PRIMARY KEY, NOT NULL |
|    player_id    |  选手id  |   int   |  50  |       NOT NULL        |
|    judge_id     |  裁判id  |   int   |  50  |       NOT NULL        |
| player_feedback | 反馈内容 | varchar | 500  |                       |



8. 观众评论区 viewerComment

|   字段    |   含义   |  类型   | 长度 |       补充描述        |
| :-------: | :------: | :-----: | :--: | :-------------------: |
|  gameID   | 比赛编号 |   int   |  11  | PRIMARY KEY, NOT NULL |
| viewer_id |  观众id  |   int   |  50  |       NOT NULL        |
|  comment  |   评论   | varchar | 500  |                       |







