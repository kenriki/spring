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

# データベース連携
[https://qiita.com/hiroshi_maz/items/b2e916144523614837a6](https://qiita.com/hiroshi_maz/items/b2e916144523614837a6)
