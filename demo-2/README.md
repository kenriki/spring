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


