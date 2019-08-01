# リダイレクト先ページにパラメータを渡す方法
[https://qiita.com/horimislime/items/387fa7805d1552149edb](https://qiita.com/horimislime/items/387fa7805d1552149edb)

```
//メッセージhogehogeを渡す
model.addAttribute("message", "hogehoge");

```

# org.springframework.web 見つからない場合の解決方法

> pom.xml に以下を追加して、プロジェクト名右クリックのMavenにあるプロジェクト更新

```
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

# 特定のポートを使用しているプロセスの殺し方(Windows)

## 手順
1. コマンドプロンプトを起動して「netstat -nao」を実行
2. 使用しているポートのPIDがわかる
3. タスクマネージャーの詳細タブをクリック
4. javax.exe のPIDと手順（１）のPIDが一致しているタスクを終了させる

# 外部ファイルの読み込み方法

## 手順
1. src/main/resources下にstaticフォルダ作成
2. static下に./cssや./js フォルダ作成
3. cssファイルやjsファイルを配置
4. htmlファイルのheadに以下を書く。

```
<link href="../css/style.css" th:href="@{/css/style.css}" rel="stylesheet"></link>
<script src="../js/Chart.min.js" th:href="@{/js/Chart.min.js}"></script>
```
### th:href属性について
> @～と指定することで、static配下と連動

### href属性やsrc属性について
> そのHTMLファイルから見た際の相対パス指定

# MariaDBについて
> コマンド一覧
[https://qiita.com/met_ganchan13/items/4a26bc419eea8f642b44](https://qiita.com/met_ganchan13/items/4a26bc419eea8f642b44)

```
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

# データベース連携
[https://qiita.com/hiroshi_maz/items/b2e916144523614837a6](https://qiita.com/hiroshi_maz/items/b2e916144523614837a6)

# データベースにセッション情報を格納
[https://qiita.com/d-yosh/items/7a24dab88bcae367b4d8](https://qiita.com/d-yosh/items/7a24dab88bcae367b4d8)

# Chart.js　Thymeleaf×SpringBoot
[https://qiita.com/tf-tky/items/49cee83229d1294e4de2](https://qiita.com/tf-tky/items/49cee83229d1294e4de2)

[https://arimodoki.dip.jp/promenade/json_chart.html](https://arimodoki.dip.jp/promenade/json_chart.html)
