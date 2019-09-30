# Spring bootフレームワーク

## リダイレクト先ページにパラメータを渡す方法
[https://qiita.com/horimislime/items/387fa7805d1552149edb](https://qiita.com/horimislime/items/387fa7805d1552149edb)

```java
//メッセージhogehogeを渡す
model.addAttribute("message", "hogehoge");

```

## org.springframework.web 見つからない場合の解決方法

> pom.xml に以下を追加して、プロジェクト名右クリックのMavenにあるプロジェクト更新

```xml
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

## 外部ファイルの読み込み方法

### 手順
1. src/main/resources下にstaticフォルダ作成
2. static下に./cssや./js フォルダ作成
3. cssファイルやjsファイルを配置
4. htmlファイルのheadに以下を書く。

```html
<link href="../css/style.css" th:href="@{/css/style.css}" rel="stylesheet"></link>
<script src="../js/Chart.min.js" th:href="@{/js/Chart.min.js}"></script>
```
#### th:href属性について
> @～と指定することで、static配下と連動

#### href属性やsrc属性について
> そのHTMLファイルから見た際の相対パス指定

# 特定のポートを使用しているプロセスの殺し方(Windows)

## 手順
1. コマンドプロンプトを起動して「netstat -nao」を実行
2. 使用しているポートのPIDがわかる
3. タスクマネージャーの詳細タブをクリック
4. javax.exe のPIDと手順（１）のPIDが一致しているタスクを終了させる

または、3,4やらずにtaskkillコマンド実行！！
プロセスID(1234)を終了したい場合：
C:\> taskkill /pid 1234 /f

# MariaDBについて
> MariaDB(マリアディービー)とは、
「MySQL」から派生したオープンソース
リレーショナルデータベースシステムです。
「列単位」で処理を行うカラム型データベースエンジン
による並列処理が特徴です。
「拡張性」「処理性能」「高品質」が評価され、
世界中で急速にシェアを拡大しています。

## コマンド一覧
[https://qiita.com/met_ganchan13/items/4a26bc419eea8f642b44](https://qiita.com/met_ganchan13/items/4a26bc419eea8f642b44)

```vim
MariaDB [(none)]> show databases;  ←データベース一覧表示
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| performance_schema |
+--------------------+
3 rows in set (0.00 sec)

MariaDB [(none)]> create database testdb; ←データベース作成
Query OK, 1 row affected (0.01 sec)

MariaDB [(none)]> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| performance_schema |
| testdb             |
+--------------------+
4 rows in set (0.01 sec)

MariaDB [(none)]> use testdb; ←データベース切替
Database changed
MariaDB [testdb]> show create database testdb; ←文字コード確認	
+----------+-------------------------------------------------------------------+
| Database | Create Database                                                   |
+----------+-------------------------------------------------------------------+
| testdb   | CREATE DATABASE `testdb` /*!40100 DEFAULT CHARACTER SET latin1 */ |
+----------+-------------------------------------------------------------------+
1 row in set (0.01 sec)

MariaDB [testdb]> create table `tbl_1`(id int, name varchar(255),score varchar(255));
Query OK, 0 rows affected (0.04 sec)
MariaDB [testdb]> insert into `tbl_1`(`id`,`name`,`score`) values(1,'abc',300);
Query OK, 1 row affected (0.01 sec)

MariaDB [testdb]> select * from tbl_1;
+------+------+-------+
| id   | name | score |
+------+------+-------+
|    1 | abc  | 300   |
+------+------+-------+
1 row in set (0.00 sec)
```

## MariaDBの環境構築(Windows)
[https://techfun.cc/database/windows-database-mysql.html](https://techfun.cc/database/windows-database-mysql.html)

```pom.xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<dependency>
    <groupId>org.mariadb.jdbc</groupId>
    <artifactId>mariadb-java-client</artifactId>
</dependency>
```

```application.properties
spring.datasource.url=jdbc:mariadb://localhost:3030/springbootdb
spring.datasource.username=myuser
spring.datasource.password=mypwd
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
spring.jpa.hibernate.ddl-auto=create-drop
```
> 以下参考
[https://springframework.guru/configuring-spring-boot-for-mariadb/](https://springframework.guru/configuring-spring-boot-for-mariadb/)

## MariaDBの環境構築(CentOS7)⇒　VM環境で作りたい人向け
[https://qiita.com/mendywata/items/685e9084c708d5b00477](https://qiita.com/mendywata/items/685e9084c708d5b00477)　　

[https://qiita.com/Uejun/items/34a023819cba0b01eb78](https://qiita.com/Uejun/items/34a023819cba0b01eb78)

## MySQLでよく見かけるエラーの発生原因と対策方法
[https://proengineer.internous.co.jp/content/columnfeature/7054](https://proengineer.internous.co.jp/content/columnfeature/7054)

# データベース連携
[https://qiita.com/hiroshi_maz/items/b2e916144523614837a6](https://qiita.com/hiroshi_maz/items/b2e916144523614837a6)

# データベースにセッション情報を格納
[https://qiita.com/d-yosh/items/7a24dab88bcae367b4d8](https://qiita.com/d-yosh/items/7a24dab88bcae367b4d8)

# Chart.jsまとめ

## Chart.js　Thymeleaf×SpringBoot
[https://qiita.com/tf-tky/items/49cee83229d1294e4de2](https://qiita.com/tf-tky/items/49cee83229d1294e4de2)

[https://arimodoki.dip.jp/promenade/json_chart.html](https://arimodoki.dip.jp/promenade/json_chart.html)

[https://output.jsbin.com/disoyivixo](https://output.jsbin.com/disoyivixo)

## プロット種類
[https://qiita.com/serv-platong/items/ff42761373302f2d472e](https://qiita.com/serv-platong/items/ff42761373302f2d472e)

# Git について
## 初期設定
```bash
git config --global user.name "xxxx"
git config --global user.email "xxxx"
git config --global color.ui true
git config -l 　　　　　　　　　// 設定が見れる
git config --help 　// help画面 

```

## gitを使用
> 作業するフォルダに「git init」でgitが使えるようになる

```bash
mkdir myweb
cd myweb
git init

```

## Git コマンド

```bash
# ステージング前のため赤く
git status 

# ファイルをステージングに上げる
git add c:/xx/xxx.js

# ステージング後のため緑になること確認
git status

# コミット
git commit -m "xxx 処理を追加"

# リモートリポジトリにプッシュ
git push origin master #初回
git push #通常

# チームで開発してるときは、プッシュ前に
# git pullをしてからpushすることでマージ処理も追加されます。
# ローカルリポジトリにマージしたくないときは、git fetch
# その後、tig して「r」打つことでフェッチ内容確認できる


```

```bash
git log --shortstat --oneline --no-merges

```

```bash
git shortlog --all --shortstat --oneline --no-merges
 --author="なまえ"
```

.tigrc 設定ファイル　サンプル
[https://qiita.com/sfus/items/063797a1dd8fdc7d032f](
https://qiita.com/sfus/items/063797a1dd8fdc7d032f)

[https://qiita.com/vivid_muimui/items/7e7a740e6537749de0c0](https://qiita.com/vivid_muimui/items/7e7a740e6537749de0c0)


# Ajax について

## jQuery.ajax() でファイルを送る

### ポイント

> dataType はサーバの出力に合わせて変更して下さい。

> ポイントは contentType と processData が false になるところです。
> contentType = 'multipart/form-data' にはなりません。

```html
<form id="ajaxform">
    <input id="file" name="file" type="file"></input>
    <input id="submit" type="submit"></input>
</form>

```

```js
// ファイルのアップロード
$('#submit').click(function() {
  
    // FormData の作成
    var form = $('#ajaxform').get(0);
    var formData = new FormData(form);
  
    // FormData を送信
    $.ajax('/upload', {
        method: 'POST',
        contentType: false,
        processData: false,
        data: formData,
        dataType: 'json',
        error: function() {
            console.log('error');
        },
        success: function() {
            console.log('success');
        }
    });
 
    // false を返してデフォルトの動作をキャンセル
    return false;
});

```
## 参考

jQuery.ajax()
    [http://api.jquery.com/jQuery.ajax/](http://api.jquery.com/jQuery.ajax/)

The FormData Interface - W3C
    [http://www.w3.org/TR/2010/WD-XMLHttpRequest2-20100907/#the-formdata-interface](http://www.w3.org/TR/2010/WD-XMLHttpRequest2-20100907/#the-formdata-interface)

# MyBatis 
## dbアクセスする際、値が渡せないとき

```console
Error querying database. Cause: org.apache.ibatis.BindingException: Parameter 'xxx' not found

```

>xml とjavaの引数名を一致させるだけではマッピングできない


> 引数を、(@Param("xxx") int xxx)とする

## 参考
[https://morizyun.github.io/java/library-mybatis.html](https://morizyun.github.io/java/library-mybatis.html)

[パラメータが多い時のみMyBatisがエラーを出す](https://ja.stackoverflow.com/questions/18556/%E3%83%91%E3%83%A9%E3%83%A1%E3%83%BC%E3%82%BF%E3%81%8C%E5%A4%9A%E3%81%84%E6%99%82%E3%81%AE%E3%81%BFmybatis%E3%81%8C%E3%82%A8%E3%83%A9%E3%83%BC%E3%82%92%E5%87%BA%E3%81%99)

[http://www.voidcn.com/article/p-vcjtsgtb-bqz.html](http://www.voidcn.com/article/p-vcjtsgtb-bqz.html)
